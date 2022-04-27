package com.triascloud.application.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author monkingbird
 */
@Setter
@Getter
public class XxlJobLogReportModel {

    private long id;
    private LocalDateTime triggerDay;
    private long runningCount;
    private long sucCount;
    private long failCount;
    private LocalDateTime updateTime;

}
