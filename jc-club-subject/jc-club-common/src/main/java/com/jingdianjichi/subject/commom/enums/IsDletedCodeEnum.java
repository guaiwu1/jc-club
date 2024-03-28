package com.jingdianjichi.subject.commom.enums;

import lombok.Getter;

/**
 * @description:删除状态枚举
 * @author: guaiwu
 * @time: 2024/3/12 18:33
 */
@Getter
public enum IsDletedCodeEnum {

    DELETED(1,"已删除"),
    UN_DELETED(0,"未删除");

    public int code;

    public String desc;

    IsDletedCodeEnum(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public static IsDletedCodeEnum getByCode(int codeVal){
        for(IsDletedCodeEnum resultCodeEnum : IsDletedCodeEnum.values()){
            if(resultCodeEnum.code == codeVal){
                return resultCodeEnum;
            }
        }
        return null;
    }

}

