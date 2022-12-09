package learn.gu.com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 
 * @TableName ruledrl
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ruledrl implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String drl;

    /**
     * 
     */
    private Integer eid;




}