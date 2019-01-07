package tk.mybatis.mapper.common.base.sort;

import org.apache.ibatis.annotations.DeleteProvider;
import tk.mybatis.mapper.provider.base.BaseSortProvider;

/**
 * @author xiebq 2019/1/4
 */
public interface MakeSortUp<T> {

    @DeleteProvider(type = BaseSortProvider.class, method = "dynamicSQL")
    int makeSortUp(Object key);
}
