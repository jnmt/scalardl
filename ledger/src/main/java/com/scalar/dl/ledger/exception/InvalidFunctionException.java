package com.scalar.dl.ledger.exception;

import com.scalar.dl.ledger.error.ScalarDlError;
import com.scalar.dl.ledger.service.StatusCode;

public class InvalidFunctionException extends FunctionException {

  public InvalidFunctionException(String message) {
    super(message, StatusCode.INVALID_FUNCTION);
  }

  public InvalidFunctionException(String message, Throwable cause) {
    super(message, cause, StatusCode.INVALID_FUNCTION);
  }

  public InvalidFunctionException(ScalarDlError error, Object... args) {
    super(error.buildMessage(args), error.getStatusCode());
  }

  public InvalidFunctionException(ScalarDlError error, Throwable cause, Object... args) {
    super(error.buildMessage(args), cause, error.getStatusCode());
  }
}
