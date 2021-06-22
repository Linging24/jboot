package com.linging.config;

import io.jboot.app.config.JbootConfigDecryptor;

/**
 * @author Linging
 * @version 1.0.0
 * @since 1.0
 */
public class MyConfigDecriptor implements JbootConfigDecryptor {
    @Override
    public String decrypt(String key, String originalContent) {
//        System.out.println(key +"===>" + originalContent);
        //在这里实现你自己的解密算法
        //key : 很多时候我们并不是针对所有的配置都进行加密，只是加密了个别配置
        //此时，我们可以通过 key 来判断那些无需加密的内容，不需要加密直接返回 originalContent 即可
        return originalContent;
    }
}
