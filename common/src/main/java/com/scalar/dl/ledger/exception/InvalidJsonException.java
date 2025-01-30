package com.scalar.dl.ledger.exception;

import com.scalar.dl.ledger.service.StatusCode;

public class InvalidJsonException extends LedgerException {

  public InvalidJsonException(String message) {
    super(message, StatusCode.RUNTIME_ERROR);
  }

  public InvalidJsonException(String message, Throwable cause) {
    super(message, cause, StatusCode.RUNTIME_ERROR);
  }
}
