package ua.kpi.its.lab.data.entity

import jakarta.persistence.*
import java.util.*


@Entity
data class Educational(
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     val id: Long = 0,

     val name: String,
     val accreditatioLevel: String,
     val address: String,
     val creationDate: Date,
     val numberFaculties: String,
     val website: String,
     val militaryDepartment: Boolean,

 ) : Comparable<Educational> {
     override fun compareTo(other: Educational): Int {
         val nameComparison = name.compareTo(other.name)
         return if (nameComparison != 0) nameComparison else id.compareTo(other.id)
     }
 }

 @Entity
 data class Discipline(
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
     val id: Long = 0,

     val name: String,
     val institution: String,
     val specialtyCode: String,
     val semester: String,
     val numberHours: String,
     val approvalDate: Date,
     val examination: Boolean,

     @ManyToOne
     @JoinColumn(name = "educational_id")
     val educational: Educational?
 )
