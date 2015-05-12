package com.framework.db.dto.generators.model;


import java.util.List;

public interface EntityDto<F extends FieldDto, R extends RelationDto> {

    List<R> getRelations();
    List<F> getFields();
    String getName();

}
