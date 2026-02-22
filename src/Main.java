//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Задача1");

    int age = 14;
    if (age >= 18) {

        System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний ");
    } else {
        System.out.println("Если возраст человека равен " + age + " то, он не достиг совершеннолетия, нужно немного подождать");
    }

    System.out.println("Задача2");

    int temperature = 8;
    if (temperature < 5) {
        System.out.println("На улице " + temperature + " градусов, " + "нужно надеть шапку ");
    } else {
        System.out.println("На улице " + temperature + " градусов, " + "можно идти без шапки");
    }


    // System.out.println("Задача3");
    int driverSpeed = 41;
    if (driverSpeed > 60) {
        System.out.println("Если скорость  " + driverSpeed + " , то  придется заплатить штраф");
    } else {
        System.out.println("Если скорость  " + driverSpeed + " , можно ездить спокойно");
    }

// System.out.println("Задача4");
//    age = 35;
    if (age >= 2 && age <= 6) {
        System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в детский сад ");
    } else if (age >= 7 && age <= 17) {
        System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в школу");
    } else if (age >= 18 && age <= 24) {
        System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в университет");
    } else if (age > 24) {
        System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить на работу");
    }

// System.out.println("Задача5");
    int years = 21;
    if (years < 5) {
        System.out.println("Если возраст ребенка равен " + years + " , то ему нельзя кататься на аттракционе,");
    } else if (years <= 14) {
        System.out.println("Если возраст ребенка равен " + years + " , то ему можно кататься на аттракционе в сопровождении взрослого,");
    } else if (years > 14) {
        System.out.println("Если возраст ребенка равен " + years + " , то ему можно кататься на аттракционе без сопровождении взрослого,");
    }
// System.out.println("Задача6");
    int places = 102;
    int sitPlaces = 60;
    int passengers = 70;
    if (passengers < sitPlaces) {
        System.out.println(" В вагоне есть сидячие места");
    } else if (passengers >= sitPlaces && passengers < places) {
        System.out.println(" В вагоне есть стоячие места");
    } else if (passengers >= places)
        System.out.println(" В вагоне нет мест");

    // System.out.println("Задача7");
    int one = 41;
    int two = 56;
    int three = 80;
    if (one >= two && one >= three) {
        System.out.println("Большее число из трёх чисел one , равно " + one);
    } else if (two >= one && two >= three) {
        System.out.println("Большеее число из трёх чисел two , равно " + two);
    } else {
        System.out.println("Большее число из трёх чисел three, равно " + three);

    }
}





 









