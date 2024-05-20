package ua.kpi.its.lab.data.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.data.entity.Educational
import ua.kpi.its.lab.data.entity.Discipline
import ua.kpi.its.lab.data.repo.EducationalRepository
import ua.kpi.its.lab.data.repo.DisciplineRepository
import ua.kpi.its.lab.data.svc.EducationalService
import ua.kpi.its.lab.data.svc.DisciplineService

@Service
class MagazineServiceImpl(private val repo: EducationalRepository) : EducationalService {
    override fun create(educational: Educational) = repo.save(educational)
    override fun retrieve(id: Long) = repo.findById(id).orElse(null)
    override fun update(educational: Educational) = repo.save(educational)
    override fun delete(id: Long) = repo.deleteById(id)
}

@Service
class ScientificArticleServiceImpl(private val repo: DisciplineRepository) : DisciplineService {
    override fun create(discipline: Discipline) = repo.save(discipline)
    override fun retrieve(id: Long) = repo.findById(id).orElse(null)
    override fun update(discipline: Discipline) = repo.save(discipline)
    override fun delete(id: Long) = repo.deleteById(id)
}
