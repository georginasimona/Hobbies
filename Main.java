package com.siit.persons;

import java.util.*;


    public class Main {


        public static void main(String[] args) {


            Person[] people = new Person[50];

            //Add new persons to arraylist
            Person Emanuel = new Person("Emanuel", 21);
            Person Sorina = new Person("Sorina", 30);
            Person Elena = new Person("Elena", 10);

            people[0] = Emanuel;
            people[1] = Sorina;
            people[2] = Elena;


            List<Person> newPeople = new ArrayList<>();
            newPeople.add(Emanuel);
            newPeople.add(Sorina);
            newPeople.add(Elena);

            System.out.println("New persons added to the list are:");

            for (Person person : newPeople) {
                System.out.println("Name:" + person.getName() + "    " + "Age:" + person.getAge());
            }

            Set<Person> orderedByName = new TreeSet<>(new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p1.getName().compareTo(p2.getName());
                }

                @Override
                public boolean equals(Object obj) {
                    return false;
                }
            });

           orderedByName.addAll(newPeople);

            System.out.println("Names of persons in alphabetical order: ");
            System.out.println(orderedByName);


            // Adding hobbies for 1 person: Emanuel
            List<String> hobbies = new ArrayList<>();
            hobbies.add("Arts");
            hobbies.add("Amateur Astronomy");
            hobbies.add("Beatboxing");
            hobbies.add("Cake Decorating");
            hobbies.add("Collecting Antiques");
            hobbies.add("Scuba Diving");
            Emanuel.setHobbies(hobbies);

            System.out.println(hobbies);

        }

        //add new persons to TreeSet;
        private static void addPersonToTreeSet(Person Emanuel, Person Sorina, Person Elena, List<Person> newPeople) {
        System.out.println();
        System.out.println("---- TREE SET ----");
            Set<Person> personTreeSet = new TreeSet<>();
            personTreeSet.add(Emanuel);
            personTreeSet.add(Sorina);
            personTreeSet.add(Elena);
             System.out.println(personTreeSet);

            int maxAge = 0;
            Person oldest = null;
            if (newPeople.size() >= 3) {
                for (Person p : newPeople) {
                    if (p.getAge() > maxAge) {
                        maxAge = p.getAge();
                        oldest = p;
                    }
                }
            }


            Collections.sort(newPeople, new Comparator<Person>() {
                @Override
                public int compare(Person p1, Person p2) {
                    return p1.getName().compareTo(p2.getName());
                }
            });


            Set<Hobby> hobby = new HashSet<>();

            Address address_1 = new Address("Greece", "Nea Moudania");
            Address address_2 = new Address("Romania", "Cluj");
            Address address_3 = new Address("France", "Paris");

            Hobby scubaDiving = new Hobby("Scuba Diving", 50, address_1);
            Hobby art = new Hobby("Arts", 130, address_2);
            Hobby cakeDecorating = new Hobby("Cake Decorating", 5, address_3);

            hobby.add(scubaDiving);
            hobby.add(art);
            hobby.add(cakeDecorating);




            Person p = newPeople.get(0);

            HashMap<Person, List<Hobby>> detailsAboutHobbiesAndPerson = new HashMap<>();


                System.out.println();
                System.out.println("Hobbies for person " + p.getName());
            detailsAboutHobbiesAndPerson.get(p).forEach(x -> {
                    System.out.println(x.getHobby() + " is practiced in:");
                    x.getAddress().forEach(y -> System.out.println(y.getCountry()));
                    System.out.println();
                });


            }

        }
