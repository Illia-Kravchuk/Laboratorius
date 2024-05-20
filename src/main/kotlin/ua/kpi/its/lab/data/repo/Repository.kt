package ua.kpi.its.lab.data.repo

import org.springframework.data.jpa.repository.JpaRepository
import ua.kpi.its.lab.data.entity.Educational
import ua.kpi.its.lab.data.entity.Discipline

interface MagazineRepository : JpaRepository<Educational, Long> {
    // додаткові методи, якщо потрібно
}

interface ScientificArticleRepository : JpaRepository<Disciplin, Long> {
    // додаткові методи, якщо потрібно
}
