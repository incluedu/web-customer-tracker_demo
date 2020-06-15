package net.lustenauer.spring.webcustomertracker.entity

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Int?,

        @Column(name = "first_name")
        val firstName: String,

        @Column(name = "last_name")
        val lastName: String,

        @Column(name = "email")
        val email: String
) {
    constructor() : this(null, "", "", "")
}