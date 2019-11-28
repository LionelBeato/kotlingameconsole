package com.leoworks.consoles.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Console(

        var name: String = "",
        var releaseDate: String = "",

        //these annotations are for assigning and generating IDs
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0


)