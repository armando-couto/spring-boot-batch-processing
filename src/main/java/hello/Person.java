package hello;

public class Person {
  private Integer id;
  private String lastName;
  private String firstName;

  public Person() {

  }

  public Person(Integer id, String lastName, String firstName) {
    this.id = id;
    this.lastName = lastName;
    this.firstName = firstName;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "firstName: " + firstName + ", lastName: " + lastName;
  }

}
