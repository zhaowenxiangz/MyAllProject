package com.imooc.sell.util;

import com.imooc.sell.vo.ResultVo;

/**
 *  @author: zhaoteng
 *  @Date: 2019\7\29 23:32
 *  @Description: 抽取公共返回ResultVo随想
 */
public class ResultVoUtils {

    public static ResultVo success(Object o) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("Success");
        resultVo.setData(o);
        return resultVo;
    }

    public static ResultVo success() {
        return success();
    }

    public static ResultVo error(Integer code,String msg) {
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
