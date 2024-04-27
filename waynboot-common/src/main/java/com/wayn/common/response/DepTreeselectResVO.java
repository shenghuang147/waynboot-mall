package com.wayn.common.response;

import com.wayn.common.core.vo.TreeVO;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author: waynaqua
 * @date: 2024/4/27 15:15
 */
@Data
public class DepTreeselectResVO implements Serializable {
    @Serial
    private static final long serialVersionUID = 8547998749534721283L;

    /**
     * 部门数列表返回
     */
    private List<TreeVO> deptTree;
}
