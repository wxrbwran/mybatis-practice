package example.mybatis.common;

/**
 * 描述: 常量
 *
 * @author wuxiaoran
 */
public class Constant {

  public static final String defaultPageAt = "1";
  public static final String defaultPageSize = "10";



  public enum IssueScoreStrategy {
    // 任务分配策略
    AVERAGE(1, "平均分配"),
    FIFTY_AVERAGE(2, "5: other"),
    THIRTY_AVERAGE(3, "3: other");

    Integer code;
    String value;

    IssueScoreStrategy(Integer code, String value) {
      this.code = code;
      this.value = value;
    }

    public Integer getCode() {
      return code;
    }

    public void setCode(Integer code) {
      this.code = code;
    }

    public String getValue() {
      return value;
    }

    public void setValue(String value) {
      this.value = value;
    }
  }

  public enum DealLogChangeTypeEnum {
    // DealLog personScore变化的类型
    STRATEGY(1, "策略分配"),
    PARTNER(2, "他人赋分"),
    SYSTEM(3, "系统奖励");

    Integer code;
    String value;

    DealLogChangeTypeEnum(Integer code, String value) {
      this.code = code;
      this.value = value;
    }

    public Integer getCode() {
      return code;
    }

    public void setCode(Integer code) {
      this.code = code;
    }

    public String getValue() {
      return value;
    }
  }
}
