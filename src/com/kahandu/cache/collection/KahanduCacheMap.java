package com.kahandu.cache.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class KahanduCacheMap<Integer,String> extends LinkedHashMap<Integer,String> {

    int cacheEvictSize=8;

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return this.size() > cacheEvictSize;
    }
}
