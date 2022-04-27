package com.triascloud.infrastructure.key;

import com.mt510.redisson.extension.key.BasePrefix;

/**
 * sso redis key
 *
 * @author chenjm
 * @date 18:05 2020/6/5
 **/
public class ExampleRedisKey extends BasePrefix {
    public ExampleRedisKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public ExampleRedisKey(String prefix) {
        super(prefix);
    }

}