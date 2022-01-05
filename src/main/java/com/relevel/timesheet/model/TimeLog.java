package com.relevel.timesheet.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeLog {

    @Id
    private long timelog_id;
}
