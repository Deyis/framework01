package com.framework.db.generators.entities;


import com.framework.db.dto.generators.model.DbDto;

import java.util.Map;

public interface EntitiesGenerator<S extends DbDto> {

    Map<String, String> generate(S schema);
}
