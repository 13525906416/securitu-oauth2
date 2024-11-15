package com.zyb.auth.authorization.handler;

import com.zyb.auth.ehtity.result.Result;
import com.zyb.auth.utils.JsonUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @ClassName LoginFailureHandler
 * @Author zhaoyb
 * @Date 2024-10-23
 * @Version 1.0
 */
@Slf4j
public class LoginFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException {
        log.debug("登录失败，原因：{}", exception.getMessage());
        // 登录失败，写回401与具体的异常
        Result<String> success = Result.error(HttpStatus.UNAUTHORIZED.value(), exception.getMessage());
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write(JsonUtils.objectCovertToJson(success));
        response.getWriter().flush();
    }

}
