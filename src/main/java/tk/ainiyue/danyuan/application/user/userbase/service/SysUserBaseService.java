package tk.ainiyue.danyuan.application.user.userbase.service;

import java.util.List;

import org.springframework.data.domain.Page;

import tk.ainiyue.danyuan.application.softm.sysmenu.po.SysMenuInfo;
import tk.ainiyue.danyuan.application.user.userbase.po.SysUserBaseInfo;

/**
 * 文件名 ： SysUserBaseService.java
 * 包 名 ： tk.ainiyue.admin.userbase.service
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： Tenghui.Wang
 * 时 间 ： 2016年7月17日 下午3:57:41
 * 版 本 ： V1.0
 */
public interface SysUserBaseService {

	/**
	 * 方法名： findAll
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @return
	 * 返 回： List<SysUserBaseInfo>
	 * 作 者 ： Tenghui.Wang
	 * @throws
	 */
	List<SysUserBaseInfo> findAll();

	/**
	 * 方法名： findByName
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @param userName
	 * 参 数： @return
	 * 返 回： SysUserBaseInfo
	 * 作 者 ： Administrator
	 * @throws
	 */
	SysUserBaseInfo findByName(String userName);

	/**
	 * 方法名： getRoleByUser
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @param user
	 * 参 数： @return
	 * 返 回： List<SysMenuInfo>
	 * 作 者 ： Administrator
	 * @throws
	 */
	List<SysMenuInfo> getRoleByUser(SysUserBaseInfo user);
	
	SysUserBaseInfo findByUuid(String uuid);
	
	Page<SysUserBaseInfo> findAllBySearchText(int pageNumber, int pageSize, SysUserBaseInfo info);
	
	void save(SysUserBaseInfo info);

	void delete(SysUserBaseInfo info);

	void delete(List<SysUserBaseInfo> list);

	void trunc();

}
