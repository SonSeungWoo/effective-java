package com.github.ssw.effectivejava.chapter02;

/**
 *
 */
public class ExResponse<T> {
    private int statusCode;
    private String message;
    private T data;

    private ExResponse(ExResponse.Builder<T> builder) {
        this.statusCode = builder.statusCode;
        this.message = builder.message;
        this.data = builder.data;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {return this.data;}

    public static class Builder<T> {
        private int statusCode;
        private String message;
        private T data;

        public Builder(T data) {
            this.data = data;
        }

        public ExResponse.Builder message(MessageCode adwittCode) {
            this.statusCode = adwittCode.getCodeNumber();
            this.message = adwittCode.getValue();
            return this;
        }

        public ExResponse build() {
            return new ExResponse<>(this);
        }
    }

    public enum MessageCode {
        SUCCESS(1001, "Success"),
        FAILED(1002, "Failed");

        private int codeNumber;
        private String value;

        MessageCode(int codeNumber, String value) {
            this.codeNumber = codeNumber;
            this.value = value;
        }

        public int getCodeNumber() {
            return this.codeNumber;
        }

        public String getValue() {
            return this.value;
        }
    }
}