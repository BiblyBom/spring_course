package hibernate_many_to_many.entity;

import javax.persistence.*;

@Entity
@Table(name = "children")

public class Child {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        @Column (name = "id")
        private int id;

        @Column (name = "name")
        private String name;

        @Column (name = "age")
        private int age;

}