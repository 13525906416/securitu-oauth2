package com.zyb.auth.authorization.handler;

import com.zyb.auth.ehtity.result.Result;
import com.zyb.auth.utils.JsonUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName LoginSuccessHandler
 * @Author zhaoyb
 * @Date 2024-10-23
 * @Version 1.0
 */
@Slf4j
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        log.debug("登录成功.");
        Result<String> success = Result.success();
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write(JsonUtils.objectCovertToJson(success));
        response.getWriter().flush();
    }

}