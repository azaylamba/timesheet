package com.relevel.timesheet.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    private long project_id;
}
