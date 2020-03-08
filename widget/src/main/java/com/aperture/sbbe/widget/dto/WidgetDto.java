package com.aperture.sbbe.widget.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class WidgetDto {

    private String widgetId;

    private String manufacturer;

}
