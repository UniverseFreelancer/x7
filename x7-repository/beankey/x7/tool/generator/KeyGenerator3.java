/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package x7.tool.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

import x7.tool.bean.BeanTemplate;

public class KeyGenerator3 {


	public static void generate(String projectPath, BeanTemplate beanTemplate, Template template){
        try{
          
            String beanPackage = beanTemplate.getPackageName();
            String className = beanTemplate.getClzName();
            beanPackage = beanPackage.replaceAll("\\.", "\\/");       
            
            File folder = new File(projectPath+beanPackage);
            if (!folder.exists()){
            	folder.mkdirs();
            }

            File file = new File(projectPath+beanPackage+"/"+ className+".java");

            VelocityContext context = new VelocityContext();
    
            
            context.put("package", beanTemplate.getPackageName());
            context.put("className", className);    
            context.put("propList", beanTemplate.getPropList()); 

            BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file)));

            if ( template != null)
                template.merge(context, writer);

            writer.flush();
            writer.close();
            
        }catch( Exception e ){
            System.out.println(e);
        }
	}
}
