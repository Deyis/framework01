package com.framework.db.generators.entities;


import com.framework.db.dto.generators.db.TableDto;
import javafx.util.Pair;

public interface EntityGeneratorOld<T extends TableDto> {

    Pair<String,String> generate(T table);
}
