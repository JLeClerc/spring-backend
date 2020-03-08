package com.aperture.sbbe.widget.mapping;

import com.aperture.sbbe.common.entity.Widget;
import com.aperture.sbbe.widget.dto.WidgetDto;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface WidgetMapper {
    WidgetDto toWidgetDto(Widget widget);
    Widget toWidget(WidgetDto widgetDto);
}