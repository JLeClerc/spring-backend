package com.aperture.sbbe.widget.controller;

import com.aperture.sbbe.widget.dto.WidgetDto;
import com.aperture.sbbe.widget.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/widget")
@RestController
public class WidgetController {

    private final WidgetService widgetService;

    @Autowired
    public WidgetController(WidgetService widgetService) {
        this.widgetService = widgetService;
    }

    @GetMapping
    public ResponseEntity<Object> search(
            WidgetDto widgetDto,
            @SortDefault(sort = {"widgetId"}, direction = Sort.Direction.ASC) Pageable pageable
    ){
        return ResponseEntity.ok(widgetService.findAll(widgetDto, pageable));
    }

}
