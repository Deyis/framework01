package com.framework.db.generators.entities;


import com.framework.db.dto.generators.model.EntityDto;
import javafx.util.Pair;

public interface EntityGenerator<T extends EntityDto> {

    Pair<String,String> generate(T table);
}
