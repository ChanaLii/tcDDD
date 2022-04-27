package com.triascloud;

import com.triascloud.core.boot.annotation.TriascloudApplication;
import com.triascloud.core.common.constant.TriasModuleConstant;
import com.triascloud.core.launch.TriasCloudApplication;

/**
 * 工程脚手架
 *
 * @author chenjm
 * @date 2020-10-19
 **/
@TriascloudApplication
public class ExampleApplication {

    public static void main(String[] args) {
        final String APPLICATION_EXAMPLE = TriasModuleConstant.APPLICATION_NAME_PREFIX + "example";
        TriasCloudApplication.run(APPLICATION_EXAMPLE, ExampleApplication.class, args);
    }

}