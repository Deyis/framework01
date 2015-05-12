package com.framework.db.generators.dbschema;


import com.framework.db.dto.generators.db.TableDto;

public interface DBTableGenerator<T extends TableDto> {

    String generate(T table);
}
