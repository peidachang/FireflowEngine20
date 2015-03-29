/**
 * Copyright 2007-2008 非也
 * All rights reserved. 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation。
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses. *
 */
package org.fireflow.engine.entity.runtime.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

// Generated Feb 23, 2008 12:04:21 AM by Hibernate Tools 3.2.0.b9

/**
 * TaskInstance generated by hbm2java
 */
@SuppressWarnings("serial")
@XmlRootElement(name="activityInstance")
@XmlType(name="activityInstanceType")
@XmlAccessorType(XmlAccessType.FIELD)
//@Table("T_FF_RT_ACTIVITY_INSTANCE")
public class ActivityInstanceImpl extends AbsActivityInstance implements java.io.Serializable {

	@Override
	public Object clone()  {
		ActivityInstanceImpl actInst = new ActivityInstanceImpl();
		actInst.setId(this.getId());
		actInst.setName(this.getName());	
		actInst.setDisplayName(this.getDisplayName());
		actInst.setState(this.getState());
		
		actInst.setProcessName(this.getProcessName());
		actInst.setProcessDisplayName(this.getProcessDisplayName());
		actInst.setSubProcessName(this.getSubProcessName());
		actInst.setSubProcessDisplayName(this.getSubProcessDisplayName());
		actInst.setBizType(this.getBizType());
		
		actInst.setProcessId(this.getProcessId());
		actInst.setVersion(this.getVersion());
		actInst.setProcessType(this.getProcessType());
		actInst.setProcessInstanceId(this.getProcessInstanceId());
		actInst.setNodeId(this.getNodeId());		
		actInst.setBizId(this.getBizId());
		actInst.setSubProcessId(this.getSubProcessId());
		actInst.setProcInstCreatorId(this.getProcInstCreatorId());
		actInst.setProcInstCreatorName(this.getProcInstCreatorName());
		actInst.setProcInstCreatedTime(this.getProcInstCreatedTime());
		
		actInst.setServiceId(this.getServiceId());
		actInst.setServiceVersion(this.getServiceVersion());

		
		actInst.setParentScopeId(this.getParentScopeId());
		actInst.setCreatedTime(this.getCreatedTime());
		actInst.setExpiredTime(this.getExpiredTime());

		return actInst;
	}

 
}
