package com.fixed.asset.mapper;

import com.fixed.asset.model.Resource;

public interface ResourceMapper {
    int add(Resource resource);
    Resource findOne(Resource resource);
}
