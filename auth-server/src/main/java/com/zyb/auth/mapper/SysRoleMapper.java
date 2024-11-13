package com.zyb.auth.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyb.auth.ehtity.auth.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 系统角色表 Mapper 接口
 * </p>
 *
 * @author vains
 * @since 2023-07-04
 */
@Mapper
@Repository
public interface SysRoleMapper extends BaseMapper<SysRole> {

}
