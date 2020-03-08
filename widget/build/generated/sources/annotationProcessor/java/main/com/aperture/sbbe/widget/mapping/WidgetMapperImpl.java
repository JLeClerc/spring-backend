package com.aperture.sbbe.widget.mapping;

import com.aperture.sbbe.common.entity.Widget;
import com.aperture.sbbe.widget.dto.WidgetDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-08T19:23:01-0400",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.5 (JetBrains s.r.o)"
)
@Component
public class WidgetMapperImpl implements WidgetMapper {

    @Override
    public WidgetDto toWidgetDto(Widget widget) {
        if ( widget == null ) {
            return null;
        }

        WidgetDto widgetDto = new WidgetDto();

        widgetDto.setWidgetId( widget.getWidgetId() );
        widgetDto.setManufacturer( widget.getManufacturer() );

        return widgetDto;
    }

    @Override
    public Widget toWidget(WidgetDto widgetDto) {
        if ( widgetDto == null ) {
            return null;
        }

        Widget widget = new Widget();

        widget.setWidgetId( widgetDto.getWidgetId() );
        widget.setManufacturer( widgetDto.getManufacturer() );

        return widget;
    }
}
