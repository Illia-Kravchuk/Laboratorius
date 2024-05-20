package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.entity.Educational
import ua.kpi.its.lab.data.entity.Discipline
import ua.kpi.its.lab.data.svc.impl.EducationalServiceImpl
import ua.kpi.its.lab.data.svc.impl.DisciplineServiceImpl
import java.util.*

fun main() {
    val context = AnnotationConfigApplicationContext("ua.kpi.its.lab.data.config")
    val educationalService = context.getBean(EducationalServiceImpl::class.java)
    val disciplineService = context.getBean(DisciplineServiceImpl::class.java)

    val edu1 = Educational(
        name = "Educational 1",
        accreditatioLevel = "Level 1",
        address = "Shytova 13",
        creationDate = Date(),
        numberFaculties = "25",
        website = "1",
        militaryDepartment = true
    )
    val edu2 = Educational(
        name = "Educational 2",
        accreditatioLevel = "Level 2",
        address = "Heroiv 4",
        creationDate = Date(),
        numberFaculties = "30",
        website = "1",
        militaryDepartment = true
    )
    val edu3 = Educational(
        name = "Educational 3",
        accreditatioLevel = "Level 3",
        address = "Pupka 13",
        creationDate = Date(),
        numberFaculties = "35",
        website = "1",
        militaryDepartment = true
    )
    val edu4 = Educational(
        name = "Educational 4",
        accreditatioLevel = "Level 4",
        address = "Liokhina 9",
        creationDate = Date(),
        numberFaculties = "40",
        website = "1",
        militaryDepartment = true
    )
    val edu5 = Educational(
        name = "Educational 5",
        accreditatioLevel = "Level 5",
        address = "Topova 1",
        creationDate = Date(),
        numberFaculties = "45",
        priceRecommended = "300 грн",
        militaryDepartment = true
    )

    val discipline = Discipline(
        name = "Discipline 1",
        institution = "Institution 1",
        specialtyCode = "67",
        semester = "1",
        numberHours = 100,
        approvalDate = Date(),
        examination = true
        educational = edu1
    )

    educationalService.create(mag1)
    educationalService.create(mag2)
    educationalService.create(mag3)
    educationalService.create(mag4)
    educationalService.create(mag5)
    disciplineService.create(article1)

    println("Retrieved educational: $mag3")

    educationalService.delete(4)
}
