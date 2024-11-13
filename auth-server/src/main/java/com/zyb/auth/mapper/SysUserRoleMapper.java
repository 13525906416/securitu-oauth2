package com.zyb.auth.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyb.auth.ehtity.auth.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author vains
 * @since 2023-07-04
 */
@Mapper
@Repository
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

}
