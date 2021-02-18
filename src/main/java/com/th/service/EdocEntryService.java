package com.th.service;

import com.github.pagehelper.PageInfo;
import com.th.entity.EdocEntry;
import com.th.entity.EdocEntryCondition;

public interface EdocEntryService {

    PageInfo<EdocEntry> findAll(Integer page, Integer limit);

    EdocEntry findById(Long id);

    PageInfo<EdocEntry> findByCondition(EdocEntryCondition edocEntryCondition, Integer page, Integer limit);

    void insert(EdocEntry edocEntry);

    void update(EdocEntry edocEntry);

    void delete(Long id);

}
