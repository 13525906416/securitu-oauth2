package com.zyb.auth.ehtity.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CaptchaResult
 * @Author zhaoyb
 * @Date 2024-10-21
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaptchaResult {
    /**
     * 验证码id
     */
    private String captchaId;

    /**
     * 验证码的值
     */
    private String code;

    /**
     * 图片验证码的base64值
     */
    private String imageData;
}
