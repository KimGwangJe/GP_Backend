package Hoseo.GraduationProject.Security.ExceptionType;

import Hoseo.GraduationProject.Exception.ExceptionType;

public enum SecurityExceptionType implements ExceptionType {
    //인증 오류
    BAD_CREDENTIALS(401, "비밀번호가 일치하지 않습니다."),
    NOT_FOUND(404,"일치하는 회원이 없습니다.");

    private int errorCode;
    private String errorMessage;

    SecurityExceptionType(int errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
