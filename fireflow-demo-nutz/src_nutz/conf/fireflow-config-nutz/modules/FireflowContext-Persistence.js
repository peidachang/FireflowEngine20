/**
 * 
 */

var ioc = {
		nutzPersistenceService:{
			type:"org.fireflow.engine.modules.persistence.nutz.PersistenceServiceNutzImpl",
			fields:{
				dao:{refer:"dao"},
				tokenPersister:{refer: "tokenPersister"},
				activityInstancePersister:{refer:"activityInstancePersister"},
				processInstancePersister:{refer:"processInstancePersister"},
				variablePersister:{refer:"variablePersister"},
				scheduleJobPersister:{refer:"scheduleJobPersister"},
				processPersister:{refer:"processPersister"},
				workItemPersister:{refer:"workItemPersister"},
				reassignConfigPersister:{refer:"reassignConfigPersister"},
				fireflowConfigPersister:{refer:"fireflowConfigPersister"}
			}
		},
		tokenPersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.TokenPersisterNutzImpl"
		},
		activityInstancePersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.ActivityInstancePersisterNutzImpl"
		},
		processInstancePersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.ProcessInstancePersisterNutzImpl"
		},
		variablePersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.VariablePersisterNutzImpl"
		},
		scheduleJobPersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.ScheduleJobPersisterNutzImpl"
		},
		processPersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.ProcessPersisterNutzImpl"
		},
		workItemPersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.WorkItemPersisterNutzImpl"
		},
		reassignConfigPersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.ReassignConfigPersisterNutzImpl"
		},
		fireflowConfigPersister:{
			type:"org.fireflow.engine.modules.persistence.nutz.FireflowConfigPersisterNutzImpl"
		}
}