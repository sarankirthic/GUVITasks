package com.sarankirthic.task11.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "employee")
public class Employee {

    @Id
    private String employeeId;
    private String employeeEmail;
    private String location;
}
