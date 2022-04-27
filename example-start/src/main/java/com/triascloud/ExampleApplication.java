package com.triascloud;

import com.triascloud.core.boot.annotation.TriascloudApplication;
import com.triascloud.core.common.constant.TriasModuleConstant;
import com.triascloud.core.launch.TriasCloudApplication;

/**
 * @author monkingbird
 */
@TriascloudApplication
public class ExampleApplication {

    public static void main(String[] args) {
        String applicationExample = TriasModuleConstant.APPLICATION_NAME_PREFIX + "monkingbird";
        TriasCloudApplication.run(applicationExample, ExampleApplication.class, args);
    }

}