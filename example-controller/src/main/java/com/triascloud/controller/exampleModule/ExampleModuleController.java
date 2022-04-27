/**
 * @author michael.mike
 * @date 11:32 2020/8/21
 **/
package com.triascloud.controller.exampleModule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ExampleModuleController {



    /**
     * Command Request
     *
     * @return Object
     */
    @PutMapping("/exampleCommand")
    public Object exampleCommand() {
        return null;
    }

    /**
     * Query Request
     *
     * @return Object
     */
    @GetMapping("/exampleQuery")
    public Object exampleQuery() {
        return null;
    }

}