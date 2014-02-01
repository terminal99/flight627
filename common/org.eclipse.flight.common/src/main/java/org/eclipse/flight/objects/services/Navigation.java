/*******************************************************************************
 * Copyright (c) 2014 Pivotal Software, Inc. and others.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 
 * (http://www.eclipse.org/legal/epl-v10.html), and the Eclipse Distribution 
 * License v1.0 (http://www.eclipse.org/org/documents/edl-v10.html). 
 *
 * Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.flight.objects.services;

import org.eclipse.flight.objects.Resource;
import org.vertx.java.core.json.JsonObject;

/**
 * @author Miles Parker
 */
public class Navigation extends Resource {
	Integer offset;

	Integer length;

	String editType;

	Long savePointTimestamp;

	String savePointHash;

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getRemoveCount() {
		return length;
	}

	public void setRemoveCount(Integer removeCount) {
		this.length = removeCount;
	}

	public String getEditType() {
		return editType;
	}

	public void setEditType(String editType) {
		this.editType = editType;
	}

	public Long getSavePointTimestamp() {
		return savePointTimestamp;
	}

	public void setSavePointTimestamp(Long savePointTimestamp) {
		this.savePointTimestamp = savePointTimestamp;
	}

	public String getSavePointHash() {
		return savePointHash;
	}

	public void setSavePointHash(String savePointHash) {
		this.savePointHash = savePointHash;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.flight.resources.Resource#toJson(org.vertx.java.core.json.JsonObject, boolean)
	 */
	@Override
	protected void toJson(JsonObject json, boolean thin) {
		super.toJson(json, thin);
		json.putNumber("offset", offset)
				.putNumber("removeCount", length)
				.putString("editType", editType)
				.putNumber("savePointTimestamp", savePointTimestamp)
				.putString("savePointHash", savePointHash);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.flight.resources.Resource#fromJson(org.vertx.java.core.json.JsonObject)
	 */
	@Override
	public void fromJson(JsonObject json) {
		super.fromJson(json);
		offset = json.getInteger("offset");
		length = json.getInteger("removeCount");
		editType = json.getString("editType");
		savePointTimestamp = json.getLong("savePointTimestamp");
		savePointHash = json.getString("savePointHash");
	}
}
