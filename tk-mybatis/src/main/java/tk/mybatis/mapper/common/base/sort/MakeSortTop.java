package tk.mybatis.mapper.common.base.sort;

import org.apache.ibatis.annotations.DeleteProvider;
import tk.mybatis.mapper.provider.base.BaseSortProvider;

/**
 * @author xiebq 2018/12/24
 */
public interface MakeSortTop<T> {



        @DeleteProvider(type = BaseSortProvider.class, method = "dynamicSQL")
        int makeSortTop(Object key);

//        @DeleteProvider(type = BaseSortMapper.class, method = "dynamicSQL")
//        int MakeSortUp(Object key);
//
//        @DeleteProvider(type = BaseSortMapper.class, method = "dynamicSQL")
//        int MakeSortDown(Object key);
}
