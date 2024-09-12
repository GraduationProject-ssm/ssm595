package com.entity.vo;

import com.entity.BanjitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 班级统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-18 10:53:24
 */
public class BanjitongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 统计数量
	 */
	
	private Integer tongjishuliang;
		
	/**
	 * 统计日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjiriqi;
		
	/**
	 * 统计备注
	 */
	
	private String tongjibeizhu;
		
	/**
	 * 班级账号
	 */
	
	private String banjizhanghao;
		
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
				
	
	/**
	 * 设置：统计数量
	 */
	 
	public void setTongjishuliang(Integer tongjishuliang) {
		this.tongjishuliang = tongjishuliang;
	}
	
	/**
	 * 获取：统计数量
	 */
	public Integer getTongjishuliang() {
		return tongjishuliang;
	}
				
	
	/**
	 * 设置：统计日期
	 */
	 
	public void setTongjiriqi(Date tongjiriqi) {
		this.tongjiriqi = tongjiriqi;
	}
	
	/**
	 * 获取：统计日期
	 */
	public Date getTongjiriqi() {
		return tongjiriqi;
	}
				
	
	/**
	 * 设置：统计备注
	 */
	 
	public void setTongjibeizhu(String tongjibeizhu) {
		this.tongjibeizhu = tongjibeizhu;
	}
	
	/**
	 * 获取：统计备注
	 */
	public String getTongjibeizhu() {
		return tongjibeizhu;
	}
				
	
	/**
	 * 设置：班级账号
	 */
	 
	public void setBanjizhanghao(String banjizhanghao) {
		this.banjizhanghao = banjizhanghao;
	}
	
	/**
	 * 获取：班级账号
	 */
	public String getBanjizhanghao() {
		return banjizhanghao;
	}
				
	
	/**
	 * 设置：班级名称
	 */
	 
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
			
}
