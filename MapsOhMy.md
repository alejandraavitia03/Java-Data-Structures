                    /*
                     * To change this license header, choose License Headers in Project Properties.
                     * To change this template file, choose Tools | Templates
                     * and open the template in the editor.
                     */
                    package mapsohmy;

                    /**
                     *
                     * @author pita
                     */
                    public class Student
                    {
                        private String firstName;
                        private String lastName;
                        private Integer studentId;
                        private String gradeLevel;
                        private Integer age;


                        public Student(String firstName, String lastName, Integer studentId, String gradeLevel, Integer age)
                        {
                            this.firstName = firstName;
                            this.lastName= lastName;
                            this.studentId= studentId;
                            this.gradeLevel = gradeLevel;
                            this.age=age;
                        }
                        /**
                         * @return the firstName
                         */
                        public String getFirstName() {
                            return firstName;
                        }

                        /**
                         * @param firstName the firstName to set
                         */
                        public void setFirstName(String firstName) {
                            this.firstName = firstName;
                        }

                        /**
                         * @return the lastName
                         */
                        public String getLastName() {
                            return lastName;
                        }

                        /**
                         * @param lastName the lastName to set
                         */
                        public void setLastName(String lastName) {
                            this.lastName = lastName;
                        }

                        /**
                         * @return the studetnId
                         */
                        public Integer getStudetnId() {
                            return studentId;
                        }

                        /**
                         * @param studetnId the studetnId to set
                         */
                        public void setStudetnId(Integer studentId) {
                            this.studentId = studentId;
                        }

                        /**
                         * @return the gradeLevel
                         */
                        public String getGradeLevel() {
                            return gradeLevel;
                        }

                        /**
                         * @param gradeLevel the gradeLevel to set
                         */
                        public void setGradeLevel(String gradeLevel) {
                            this.gradeLevel = gradeLevel;
                        }

                        /**
                         * @return the age
                         */
                        public Integer getAge() {
                            return age;
                        }

                        /**
                         * @param age the age to set
                         */
                        public void setAge(Integer age) {
                            this.age = age;
                        }



                    }
                    ==================
                    /*
                     * To change this license header, choose License Headers in Project Properties.
                     * To change this template file, choose Tools | Templates
                     * and open the template in the editor.
                     */
                    package mapsohmy;

                    import java.util.ArrayList;
                    import java.util.HashMap;
                    import java.util.Scanner;

                    /**
                     *
                     * @author pita
                     */
                    public class MapsOhMy {

                        /**
                         * @param args the command line arguments
                         */
                        public static void main(String[] args) {
                            // TODO code application logic here
                            ArrayList<Student> students = new ArrayList();
                            HashMap<String, Student> firstNames = new HashMap();
                            HashMap<String, Student> lastNames = new HashMap();

                            students.add(new Student("John", "Connor", 0, "K", 5));
                            students.add(new Student("Amanda", "G", 1, "K", 6));
                            students.add(new Student("Vivi", "D", 2, "2", 8));  
                            students.add(new Student("Alberto", "A", 3, "2", 8));
                            students.add(new Student("Pita", "Davila", 4, "2", 9));
                            students.add(new Student("ANdrew", "S", 5, "3", 10));
                            students.add(new Student("Karla", "Kids", 6, "3", 10));
                            students.add(new Student("Xenia", "Gone", 7, "3", 10));
                            students.add(new Student("Marcy", "Wow", 8, "4", 10));
                            students.add(new Student("Emily", "Ximena", 9, "5", 11));

                            for(Student s: students)
                            {
                                firstNames.put(s.getFirstName().toUpperCase(),s);
                                lastNames.put(s.getLastName().toUpperCase(), s);
                            }


                            System.out.println("Enter your student first OR last and grade to log in:");
                            Scanner input = new Scanner(System.in);
                            String name = input.nextLine();
                            //boolean found = false;

                            Student myStudent = firstNames.get(name);
                            if(myStudent == null)
                            {
                                myStudent = lastNames.get(name.toUpperCase());
                                if(myStudent == null){
                                    System.out.println("Did not find last or first name: " + name); 
                                }else{
                                    System.out.println("Found the student with last name " + name);
                                }
                            } else {
                                System.out.println("Student with first name: " + myStudent.getFirstName() + " found");
                            }

                            /*for(Student temp: students)
                            {
                                if(temp.getFirstName().equalsIgnoreCase(name))
                                {
                                    found = true;
                                    System.out.println("Found student " + name + " in the array");
                                }
                            }
                            if(!found)
                            {
                                System.out.println("Studnet with name " + name + " not found");
                            }
                            */
                        }

                    }

