package tk.mybatis.mapper.provider.base;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

/**
 * 说明：
 * biqi 2019/1/3
 */
public class BaseSortProvider extends MapperTemplate {

    public BaseSortProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }


    /**
     * 置顶的实现
     *
     * @param ms
     */
    public String makeSortTop(MappedStatement ms) {
        final Class<?> entityClass = getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        sql.append(SqlHelper.updateTable(entityClass, tableName(entityClass)));
        sql.append(" set sortno = (select sortno from ( SELECT sortno FROM  ");
        sql.append(SqlHelper.getDynamicTableName(entityClass, tableName(entityClass)));
        sql.append(" ORDER BY sortno DESC limit 1) as t)+1 ");
        sql.append(SqlHelper.wherePKColumns(entityClass));
        return sql.toString();
    }


    /**
     * 上移动
     *
     * @param ms
     */
    public String makeSortUp(MappedStatement ms) {
//        final Class<?> entityClass = getEntityClass(ms);
//        StringBuilder sql = new StringBuilder();
//        sql.append(SqlHelper.updateTable(entityClass, tableName(entityClass)));
//        sql.append(" set sortno = (select sortno from ( SELECT sortno FROM  ");
//        sql.append(SqlHelper.getDynamicTableName(entityClass, tableName(entityClass)));
////        select * from user where sortno>3 limit 1
//        sql.append(" where sortno DESC where 1) as t) ");
//        sql.append(" ORDER BY sortno DESC where 1) as t) ");
//        sql.append(SqlHelper.wherePKColumns(entityClass));
//        sql.append("  ");
//        sql.append(SqlHelper.updateTable(entityClass, tableName(entityClass)));
//        sql.append(" set sortno = (select sortno from ( SELECT sortno FROM  ");
//        sql.append(SqlHelper.getDynamicTableName(entityClass, tableName(entityClass)));
//        sql.append(" ORDER BY sortno DESC where 1) as t)+1 ");
//        sql.append(SqlHelper.wherePKColumns(entityClass));
//        return sql.toString();
        return null;
    }



//    /**
//     * 下移动
//     *
//     * @param ms
//     */
//    public String MakeSortDown(MappedStatement ms) {
//        final Class<?> entityClass = getEntityClass(ms);
//        StringBuilder sql = new StringBuilder();
//        sql.append(SqlHelper.updateTable(entityClass, tableName(entityClass)));
//        sql.append(" set isdelete = 123 ");
//        sql.append(SqlHelper.wherePKColumns(entityClass));
//        return sql.toString();
//    }
}
