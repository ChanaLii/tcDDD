package com.triascloud.infrastructure.utils;

import com.triascloud.core.tool.utils.StringPool;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库 json相关操作工具类
 *
 * @author chenjm
 * @date 21:22 2020/12/9
 **/
public class JsonDbUtil {


    /**
     * 对数据库json字段，数组类型的数组查找，需要拼接双引号
     *
     * @param item 拼接的对象
     * @return 拼接后的对象
     */
    public static String convertJsonArrayItem(String item) {
        return StringPool.QUOTE + item + StringPool.QUOTE;
    }

    /**
     * 对数据库json字段，数组类型的数组查找，需要拼接双引号
     *
     * @param itemList 拼接的对象 列表
     * @return 拼接后的对象列表
     */
    public static List<String> convertJsonArrayItemList(List<String> itemList) {
        List<String> filterList = new ArrayList<>();
        itemList.forEach(item -> filterList.add(convertJsonArrayItem(item)));
        return filterList;
    }
}
