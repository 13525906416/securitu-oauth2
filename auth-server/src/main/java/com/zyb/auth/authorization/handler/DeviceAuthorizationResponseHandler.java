package com.zyb.auth.authorization.handler;

import com.zyb.auth.ehtity.result.Result;
import com.zyb.auth.utils.JsonUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static com.zyb.auth.constant.SecurityConstants.DEVICE_ACTIVATED_URI;

/**
 * @ClassName DeviceAuthorizationResponseHandler
 * @Author zhaoyb
 * @Date 2024-10-28
 * @Version 1.0
 */
public class DeviceAuthorizationResponseHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        // 写回json数据
        Result<Object> result = Result.success(DEVICE_ACTIVATED_URI);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.getWriter().write(JsonUtils.objectCovertToJson(result));
        response.getWriter().flush();
    }
}

