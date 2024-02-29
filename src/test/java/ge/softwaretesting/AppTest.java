package ge.softwaretesting;


import com.github.javafaker.Faker;

public class AppTest

{
    static Faker faker = new Faker();

    public static void main(String[] args) {
        String fullName = faker.name().fullName();
        String address = faker.address().city();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println( "fullName -" + fullName);
        System.out.println("address -" + address);
        System.out.println("phoneNumber -" + phoneNumber);

    }

    }

