package com.iyohe.modules.job.dao;

import com.iyohe.modules.job.entity.ScheduleJobLogEntity;
import com.iyohe.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * 
 * @author lishaoliang
 * @email 20161125lsl@gmail.com
 * @date 2016年12月1日 下午10:30:02
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
