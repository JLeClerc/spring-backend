package com.aperture.sbbe.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@Builder
@Data
@Entity
@NoArgsConstructor
@Table(name="widget", schema="spring_backend")
public class Widget {

    @Id
    @Column(name="widget_id")
    private String widgetId;

    @Column(name="manufacturer")
    private String manufacturer;

}
