package learn.gu.com.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VerifyResult {
    private String ruleName="";
    //违反规则编码
    private String ruleCode="";
    //提示信息
    private String ruleInfo="";
    //区分投核保
    private String ruleType;
    //险种
    private String ruleRiskCode="";
    //被保人
    private String ruleInsuredName="";
    //区分投保 核保 产品投保规则
    private String ruleDisType;
    /* 2022-10-28 区分人核与普通规则 人核规则：1 普通规则默认：0*/
    private Integer manpowerRule = 0;
    //被保人编号
    private String ruleInsuredNo="1";
}
