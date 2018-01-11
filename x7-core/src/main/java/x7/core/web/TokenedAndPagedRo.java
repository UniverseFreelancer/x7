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

public class TokenedAndPagedRo implements Paged, Tokened{

	private long passportId;
	private String token;
	private String device;
	private boolean isScroll;
	private int page;
	private int rows;
	private String orderBy;
	private String sc;
	public long getPassportId() {
		return passportId;
	}
	public void setPassportId(long passportId) {
		this.passportId = passportId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getSc() {
		return sc;
	}
	public void setSc(String sc) {
		this.sc = sc;
	}
	public boolean isScroll() {
		return isScroll;
	}
	public void setScroll(boolean isScroll) {
		this.isScroll = isScroll;
	}
	@Override
	public String toString() {
		return "BaseRo [passportId=" + passportId + ", token=" + token + ", device=" + device + ", page=" + page
				+ ", rows=" + rows + ", isScroll=" + isScroll +", orderBy=" + orderBy + ", sc=" + sc + "]";
	}
}
