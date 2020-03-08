package com.aperture.sbbe.widget.service;

import com.aperture.sbbe.common.entity.Widget;
import com.aperture.sbbe.widget.dto.WidgetDto;
import com.aperture.sbbe.widget.mapping.WidgetConverter;
import com.aperture.sbbe.widget.mapping.WidgetMapper;
import com.aperture.sbbe.widget.repository.WidgetRepository;
import com.google.common.base.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class WidgetService {

    private WidgetConverter widgetConverter;
    private WidgetMapper widgetMapper;
    private WidgetRepository widgetRepository;

    @Autowired
    public WidgetService(WidgetMapper widgetMapper, WidgetRepository widgetRepository) {
        this.widgetMapper = widgetMapper;
        this.widgetRepository = widgetRepository;
    }

    public Page<WidgetDto> findAll(WidgetDto widgetDto, Pageable pageable) {
        Widget widget = widgetMapper.toWidget(widgetDto);
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreCase().withIgnoreNullValues();
        Example<Widget> queryByExample = Example.of(widget, exampleMatcher);
        Page<Widget> widgetPage= widgetRepository.findAll(queryByExample, pageable);
        return widgetPage.map(widgetConverter);
    }
}
