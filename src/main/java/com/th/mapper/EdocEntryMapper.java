package com.th.mapper;

import com.th.entity.EdocEntry;
import com.th.entity.EdocEntryCondition;

import java.util.List;

public interface EdocEntryMapper {

    List<EdocEntry> findAll();

    EdocEntry findById(Long id);

    List<EdocEntry> findByCondition(EdocEntryCondition edocEntryCondition);

    void insert(EdocEntry edocEntry);

    void update(EdocEntry edocEntry);

    void delete(Long id);

}
