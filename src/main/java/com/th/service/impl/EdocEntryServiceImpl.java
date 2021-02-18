package com.th.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.th.entity.EdocEntry;
import com.th.entity.EdocEntryCondition;
import com.th.mapper.EdocEntryMapper;
import com.th.service.EdocEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdocEntryServiceImpl implements EdocEntryService {

    @Autowired
    private EdocEntryMapper edocEntryMapper;


    @Override
    public PageInfo<EdocEntry> findAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<EdocEntry> all = edocEntryMapper.findAll();
        PageInfo<EdocEntry> pageInfo = new PageInfo<>(all);
        return pageInfo;

    }

    @Override
    public EdocEntry findById(Long id) {
        return edocEntryMapper.findById(id);
    }

    @Override
    public PageInfo<EdocEntry> findByCondition(EdocEntryCondition edocEntryCondition, Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<EdocEntry> list = edocEntryMapper.findByCondition(edocEntryCondition);
        PageInfo<EdocEntry> pageInfo = new PageInfo<>(list);
        return pageInfo;

    }

    @Override
    public void insert(EdocEntry edocEntry) {
        edocEntryMapper.insert(edocEntry);
    }

    @Override
    public void update(EdocEntry edocEntry) {
        edocEntryMapper.update(edocEntry);
    }

    @Override
    public void delete(Long id) {
        edocEntryMapper.delete(id);
    }
}
