package ua.kpi.its.lab.data.svc

import ua.kpi.its.lab.data.entity.Educational
import ua.kpi.its.lab.data.entity.Discipline

interface EducationalService {
     fun create(educational: Educational): Educational
     fun retrieve(id: Long): Educational?
     fun update(educational: Educational): Educational
     fun delete(id: Long)
 }

 interface DisciplineService {
     fun create(discipline: Discipline): Discipline
     fun retrieve(id: Long): Discipline?
     fun update(discipline: Discipline): Discipline
     fun delete(id: Long)
 }
