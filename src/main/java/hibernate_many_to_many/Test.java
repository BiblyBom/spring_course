package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Psychology");
//            Child child1 = new Child("Anna", 11);
//            Child child2 = new Child("Oleg", 10);
//            Child child3 = new Child("Katerina", 12);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // ******************************************************

//            session = factory.getCurrentSession();
//
//            Child child1 = new Child("Misha", 8);
//            Section section1 = new Section("Chess");
//            Section section2 = new Section("Dance");
//            Section section3 = new Section("Math");
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            // ******************************************************
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
            // ****************************************************
            session = factory.getCurrentSession();


            session.beginTransaction();

            Section section = session.get(Section.class, 7);

            session.delete(section);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            factory.close();
            session.close();
        }

    }
}
