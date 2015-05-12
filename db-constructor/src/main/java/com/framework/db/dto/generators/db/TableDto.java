package com.framework.db.dto.generators.db;

import java.util.List;

public interface TableDto<F extends FieldDto> {

    List<F> getFields();
}
