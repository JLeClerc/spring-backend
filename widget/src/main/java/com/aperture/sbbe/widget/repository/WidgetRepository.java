package com.aperture.sbbe.widget.repository;

import com.aperture.sbbe.common.entity.Widget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WidgetRepository extends JpaRepository<Widget, String> {

}
