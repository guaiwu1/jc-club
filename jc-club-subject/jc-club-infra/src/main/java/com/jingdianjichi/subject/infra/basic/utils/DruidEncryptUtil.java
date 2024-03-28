package com.jingdianjichi.subject.infra.basic.utils;

import com.alibaba.druid.filter.config.ConfigTools;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * 数据库加密util
 *
 * @author: guaiwu
 * @time: 2024/3/11 18:21
 */
public class DruidEncryptUtil {
    private static String publicKey;
    private static String privateKey;

    static {
        try {
            String[] keyPair = ConfigTools.genKeyPair(512);
            privateKey = keyPair[0];
            System.out.println("privateKey:" + privateKey);
            publicKey = keyPair[1];
            System.out.println("publicKey:" + publicKey);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (NoSuchProviderException e) {
            throw new RuntimeException(e);
        }
    }

    public static String encrypt(String plainText) {

        try {
            String encrypt = ConfigTools.encrypt(privateKey, plainText);
            System.out.println("encrypt:" + encrypt);
            return encrypt;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String decrypt(String encryptText) {
        try {
            String decrypt = ConfigTools.decrypt(publicKey, encryptText);
            System.out.println("decrypt:" + decrypt);
            return decrypt;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        String encrypt = encrypt("123456");
        System.out.println("encrypt:" + encrypt);
    }

}
