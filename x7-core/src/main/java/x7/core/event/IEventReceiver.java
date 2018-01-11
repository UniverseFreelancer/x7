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
package x7.core.event;

import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author Wangyan
 *
 */
public interface IEventReceiver {


	final static ConcurrentHashMap<String,TreeMap<String,IEventListener>> listenersMap = new ConcurrentHashMap<String,TreeMap<String,IEventListener>>();

	
	/**
	 * 多次创建同一类的实例，是不会重复添加同一listener的<br>
	 * 程序的正常运行，依赖Event引用的对象<br>
	 * 服务端框架，所以监听器的添加必须在此方法里实现<br>
	 * @param eventType
	 * @param listener
	 */
//	void addEventListener(String eventType, IEventListener listener);
	/**
	 * 小心调用此方法，举例：<br> 
	 * heroListener,不能调用的， <br>
	 * seceneListener，如果是每天多个任务，只能在全部结束后，才能调用
	 * @param eventType
	 * @param listener
	 */
//	void removeEventListener(String eventType, IEventListener listener);
}


