package bridge.constant;

public enum ErrorMessage {
    ERROR_MESSAGE_PREFIX("[Error] "),
    INPUT_FORMAT_IS_INCORRECT("게임이 요구한 입력 형식과 틀립니다");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_MESSAGE_PREFIX.message + message;
    }
}
