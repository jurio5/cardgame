package http;

public enum HTTP {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HTTP(int code, String grade) {
        this.code = code;
        this.message = grade;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HTTP findByCode(int httpCodeInput) {
        HTTP[] values = HTTP.values();
        for (HTTP value : values) {
            if (value.getCode() == httpCodeInput) {
                return value;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}
