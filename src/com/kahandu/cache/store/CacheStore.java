package com.kahandu.cache.store;

import com.kahandu.cache.collection.KahanduCacheMap;

import java.util.Map;

public class CacheStore {

    private KahanduCacheMap<Integer, String> cacheStore = new KahanduCacheMap<>();

    public Map<Integer, String> getCacheStore() {
        return cacheStore;
    }

    public void setCacheStore(KahanduCacheMap<Integer, String> cacheStore) {
        this.cacheStore = cacheStore;
    }

    public void add(String request, String response) {
        System.out.println("Adding to cache");
        Integer hashCode = request.hashCode();
        cacheStore.put(hashCode, response);
    }

    public String retrieve(String request) {
        return cacheStore.get(request.hashCode());
    }
}
