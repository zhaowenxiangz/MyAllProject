package com.imooc.sell.utils;

import com.imooc.sell.vo.ResponseVo;

/**
 * @Author:zhaoteng
 * @Description:
 * @Date: 0:08 2019/5/3
 */

public class ResponseVoUtil {

    public static ResponseVo success(Object o) {
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(1);
        responseVo.setMsg("Success");
        responseVo.setData(o);
        return responseVo;
    }

    public static ResponseVo error() {
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(0);
        responseVo.setMsg("error");
        responseVo.setData(null);
        return responseVo;
    }

}
