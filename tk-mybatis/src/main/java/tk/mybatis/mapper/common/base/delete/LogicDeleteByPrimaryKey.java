package tk.mybatis.mapper.common.base.delete;

import org.apache.ibatis.annotations.DeleteProvider;
import tk.mybatis.mapper.provider.base.BaseDeleteProvider;

/**
 * @author xiebq 2018/12/24
 */
public interface LogicDeleteByPrimaryKey<T> {


        /**
         * 根据主键字段进行删除，方法参数必须包含完整的主键属性
         *
         * @param key
         * @return
         */
        @DeleteProvider(type = BaseDeleteProvider.class, method = "dynamicSQL")
        int logicDeleteByPrimaryKey(Object key);


}
