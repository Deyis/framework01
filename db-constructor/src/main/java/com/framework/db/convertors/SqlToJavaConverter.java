package com.framework.db.convertors;

public class SqlToJavaConverter {

    public static String convertTableNameToEntityName(String tableName) {
        return convertSqlToJavaNaming(tableName);
    }

    public static String convertSqlToJavaNaming(String name) {
        String[] parts = name.split("_");
        if (parts.length == 0) {
            return firstCharToUpperCase(name);
        }
        String converted = "";
        for (String part: parts) {
            converted += firstCharToUpperCase(part);
        }
        return converted;
    }

    public static String convertToCorrespondingJavaType(String sqlType) {
        if (sqlType.toLowerCase().contains("varchar")) {
            return "String";
        }
        if (sqlType.toLowerCase().contains("int")) {
            return "Integer";
        }
        if (sqlType.toLowerCase().contains("bool")) {
            return "Boolean";
        }
        return sqlType;
    }

    public static String firstCharToUpperCase(String str) {
        return str.replaceFirst(str.charAt(0) + "", (str.charAt(0) + "").toUpperCase());
    }

    public static String firstCharToLowerCase(String str) {
        return str.replaceFirst(str.charAt(0) + "", (str.charAt(0) + "").toLowerCase());
    }

    public static String convertRowNameToFieldName(String columnName) {
        String fieldName = convertSqlToJavaNaming(columnName);
        fieldName = firstCharToLowerCase(fieldName);
        return fieldName;
    }
}
