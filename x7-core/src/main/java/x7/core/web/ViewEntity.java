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
package x7.core.web;

/**
 * 
 * Simple Rest Response PROTOCAL
 * 
 * @author Sim
 *
 */
public class ViewEntity {

	public final static String OK = "OK";
	public final static String FAIL = "FAIL";

	private String status;
	private Object body;

	public String getStatus() {
		return status;
	}

	public Object getBody() {
		return body;
	}

	public static ViewEntity toast(String str) {
		ViewEntity message = new ViewEntity();
		message.status = FAIL;
		message.body = str;
		return message;
	}

	public static ViewEntity ok(Object obj) {

		ViewEntity message = new ViewEntity();
		message.status = OK;
		message.body = obj;

		return message;

	}

	public static ViewEntity ok() {
		return ok(null);
	}

	@Override
	public String toString() {
		return "RestView [status=" + status + ", body=" + body + "]";
	}

}
