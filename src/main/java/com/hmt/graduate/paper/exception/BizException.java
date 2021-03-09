package com.hmt.graduate.paper.exception;

import java.security.PrivilegedActionException;

public class BizException extends Exception {
    private String respCode ;

    public BizException() {
    }

    public BizException(String respCode, String message) {
        super(message);
        this.respCode = respCode;
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }
}
