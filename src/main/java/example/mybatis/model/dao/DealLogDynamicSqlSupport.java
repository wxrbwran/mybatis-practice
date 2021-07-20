package example.mybatis.model.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DealLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final DealLog dealLog = new DealLog();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = dealLog.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> issueId = dealLog.issueId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> personScore = dealLog.personScore;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> changeScore = dealLog.changeScore;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> partner = dealLog.partner;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> type = dealLog.type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createdTime = dealLog.createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updatedTime = dealLog.updatedTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class DealLog extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> issueId = column("issue_id", JDBCType.INTEGER);

        public final SqlColumn<String> personScore = column("person_score", JDBCType.VARCHAR);

        public final SqlColumn<String> changeScore = column("change_score", JDBCType.VARCHAR);

        public final SqlColumn<Integer> partner = column("partner", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<Date> createdTime = column("created_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updatedTime = column("updated_time", JDBCType.TIMESTAMP);

        public DealLog() {
            super("s_team.t_jira_deal_log");
        }
    }
}