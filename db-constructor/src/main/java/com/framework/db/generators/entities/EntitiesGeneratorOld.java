package com.framework.db.generators.entities;


import com.framework.db.dto.generators.db.SchemaDto;

import java.util.Map;

public interface EntitiesGeneratorOld<S extends SchemaDto> {

    Map<String, String> generate(S schema);
}
