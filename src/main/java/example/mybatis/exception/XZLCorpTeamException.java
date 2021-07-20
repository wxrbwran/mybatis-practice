package example.mybatis.exception;

/**
 * @author wuxiaoran
 */
public class XZLCorpTeamException extends RuntimeException {

  private final Integer code;
  private final String message;

  public XZLCorpTeamException(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public XZLCorpTeamException(XZLCorpTeamExceptionEnum exceptionEnum) {
    this(exceptionEnum.getCode(), exceptionEnum.getMsg());
  }

  public Integer getCode() {
    return code;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
