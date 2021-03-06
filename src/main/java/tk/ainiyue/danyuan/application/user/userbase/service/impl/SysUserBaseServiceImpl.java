package tk.ainiyue.danyuan.application.user.userbase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import tk.ainiyue.danyuan.application.softm.sysmenu.po.SysMenuInfo;
import tk.ainiyue.danyuan.application.user.userbase.dao.SysUserBaseDao;
import tk.ainiyue.danyuan.application.user.userbase.po.SysUserBaseInfo;
import tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService;

/**
 * 文件名 ： SysUserBaseServiceImpl.java
 * 包 名 ： tk.ainiyue.admin.userbase.service.impl
 * 描 述 ： TODO(用一句话描述该文件做什么)
 * 机能名称：
 * 技能ID ：
 * 作 者 ： Tenghui.Wang
 * 时 间 ： 2016年7月17日 下午3:58:07
 * 版 本 ： V1.0
 */
@Service("sysUserBaseService")
public class SysUserBaseServiceImpl implements SysUserBaseService {

	//
	@Autowired
	private SysUserBaseDao sysUserBaseDao;

	/**
	 * 方法名 ： findAll
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @return
	 * 参 考 ： @see tk.ainiyue.admin.userbase.service.SysUserBaseService#findAll()
	 * 作 者 ： Tenghui.Wang
	 */

	@Override
	public List<SysUserBaseInfo> findAll() {
		// TODO Auto-generated method stub
		return (List<SysUserBaseInfo>) sysUserBaseDao.findAll();
	}

	/**
	 * 方法名 ： findByName
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param userName
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService#findByName(java.lang.String)
	 * 作 者 ： Administrator
	 */
	
	@Override
	public SysUserBaseInfo findByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 方法名 ： getRoleByUser
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param user
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService#getRoleByUser(tk.ainiyue.danyuan.application.user.userbase.po.SysUserBaseInfo)
	 * 作 者 ： Administrator
	 */
	
	@Override
	public List<SysMenuInfo> getRoleByUser(SysUserBaseInfo user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 方法名 ： findByUuid
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param uuid
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService#findByUuid(java.lang.String)
	 * 作 者 ： Administrator
	 */

	@Override
	public SysUserBaseInfo findByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 方法名 ： findAllBySearchText
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param pageNumber
	 * 参 数 ： @param pageSize
	 * 参 数 ： @param info
	 * 参 数 ： @return
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService#findAllBySearchText(int,
	 * int, tk.ainiyue.danyuan.application.user.userbase.po.SysUserBaseInfo)
	 * 作 者 ： Administrator
	 */

	@Override
	public Page<SysUserBaseInfo> findAllBySearchText(int pageNumber, int pageSize, SysUserBaseInfo info) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 方法名 ： save
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param info
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService#save(tk.ainiyue.danyuan.application.user.userbase.po.SysUserBaseInfo)
	 * 作 者 ： Administrator
	 */

	@Override
	public void save(SysUserBaseInfo info) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 方法名 ： delete
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param info
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService#delete(tk.ainiyue.danyuan.application.user.userbase.po.SysUserBaseInfo)
	 * 作 者 ： Administrator
	 */

	@Override
	public void delete(SysUserBaseInfo info) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 方法名 ： delete
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ： @param list
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService#delete(java.util.List)
	 * 作 者 ： Administrator
	 */

	@Override
	public void delete(List<SysUserBaseInfo> list) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 方法名 ： trunc
	 * 功 能 ： TODO(这里用一句话描述这个方法的作用)
	 * 参 数 ：
	 * 参 考 ： @see
	 * tk.ainiyue.danyuan.application.user.userbase.service.SysUserBaseService#trunc()
	 * 作 者 ： Administrator
	 */

	@Override
	public void trunc() {
		// TODO Auto-generated method stub

	}

}
