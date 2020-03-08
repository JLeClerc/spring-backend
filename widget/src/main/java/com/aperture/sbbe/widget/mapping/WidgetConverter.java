package com.aperture.sbbe.widget.mapping;

import com.aperture.sbbe.common.entity.Widget;
import com.aperture.sbbe.widget.dto.WidgetDto;
import com.google.common.base.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WidgetConverter extends Converter<Widget,WidgetDto> {

    private WidgetMapper widgetMapper;

    @Autowired
    public WidgetConverter(WidgetMapper widgetMapper) {
        this.widgetMapper = widgetMapper;
    }

    @Override
    protected WidgetDto doForward(Widget widget) {
        return widgetMapper.toWidgetDto(widget);
    }

    @Override
    protected Widget doBackward(WidgetDto widgetDto) {
        return widgetMapper.toWidget(widgetDto);
    }

}
