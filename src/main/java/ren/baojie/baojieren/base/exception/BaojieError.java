package ren.baojie.baojieren.base.exception;

import lombok.Data;

@Data
public class BaojieError {
    private int code;
    private String msg;

    private BaojieError(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static final BaojieError SYS_ERR = new BaojieError(500, "系统异常");
    public static final BaojieError NET_ERR = new BaojieError(501, "稍后重试");

}
