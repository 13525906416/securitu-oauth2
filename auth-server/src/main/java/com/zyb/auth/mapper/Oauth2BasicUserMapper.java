package com.zyb.auth.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyb.auth.ehtity.auth.Oauth2BasicUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 基础用户信息表 Mapper 接口
 * </p>
 *
 * @author vains
 * @since 2023-07-04
 */
@Mapper
@Repository
public interface Oauth2BasicUserMapper extends BaseMapper<Oauth2BasicUser> {

}
