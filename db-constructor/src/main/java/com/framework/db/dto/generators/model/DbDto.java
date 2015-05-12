package com.framework.db.dto.generators.model;


import java.util.List;

public interface DbDto<E extends EntityDto> {

    List<E> getEntities();
}
