package com.framework.db.dto.generators.db;


import java.util.List;

public interface SchemaDto<T extends TableDto> {

    List<T> getTables();

    String getName();
}
