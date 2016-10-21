package com.aether.util.redis;

import redis.clients.jedis.ShardedJedis;

public interface RedisDataSource {

    //取得redis的客户端
    public abstract ShardedJedis getRedisClient();

    //将资源返还给pool
    public void returnResource(ShardedJedis shardedJedis);

    //出现异常后，将资源返还给pool
    public void returnResource(ShardedJedis shardedJedis, boolean broken);
}
