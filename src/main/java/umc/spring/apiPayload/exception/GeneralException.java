package umc.spring.apiPayload.exception;

import lombok.AllArgsConstructor;
import umc.spring.apiPayload.code.BaseErrorCode;
import umc.spring.apiPayload.code.ErrorReasonDTO;

@AllArgsConstructor
public class GeneralException extends RuntimeException{

    private BaseErrorCode baseErrorCode;

    public ErrorReasonDTO getErrorReason() {
        return baseErrorCode.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus() {
        return baseErrorCode.getReasonHttpStatus();
    }
}
