package com.framework.db.generators.dbschema;


import com.framework.db.dto.generators.db.SchemaDto;

public interface DBSchemaGenerator<S extends SchemaDto> {

    String generate(S schema);
}
