package tk.mybatis.mapper.provider;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

import java.util.Date;

/**
 * @author xiebq 2018/12/24
 */
public class LogicDeleteProvider extends MapperTemplate {


    public LogicDeleteProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }


    /**
     * 伪删除的实现
     *
     * @param ms
     */
    public String logicDeleteByPrimaryKey(MappedStatement ms) {
        final Class<?> entityClass = getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.updateTable(entityClass, tableName(entityClass)));
        sql.append(" isdelete = 1 ");
//        Date date = new Date();
//        sql.append(" updated = "+date +" ");
        sql.append(SqlHelper.wherePKColumns(entityClass));
        return sql.toString();
    }


}
