public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }



    public static void task1() {
        System.out.println("Задача1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // тут пишем задачу 1
    }

    public static void task2() {
        System.out.println("Задача2");
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // тут пишем задачу 2
    }
    public static void task3() {
        System.out.println("Задача3");
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // тут пишем задачу 3
    }

    public static void task4() {
        System.out.println("Задача4");
        var friend = 19;
        System.out.println(friend);
        friend = 19 + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }
    public static void task5()  {
        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6()   {
        System.out.println("Задача6");
        var boxer1= 78.2;
        var boxer2= 82.7;
        System.out.println(boxer1);
        System.out.println(boxer2);
        var totalWeight = boxer1 + boxer2;
        System.out.println("totalWeight="+ totalWeight);
        var weightDifference = boxer2 - boxer1;
        System.out.println("weightDifference="+weightDifference);
        // weightDifference это разница в весе
        // totalDifference это суммарный вес

    }
    public static void task7() {
        System.out.println("Задача7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1);
        System.out.println(boxer2);
        var weightDifference = boxer2 -boxer1;
        System.out.println("weightDifference="+ weightDifference);
        var overload = boxer2 % boxer1;
        System.out.println("остаток на деление="+ overload);
    }
    public static void task8() {
        System.out.println("Задача8");
        var vsegoChasow = 640;
        var odinSotrudnik = 8;
        System.out.println(vsegoChasow);
        System.out.println(odinSotrudnik);
        var vsegoRabotnikow = vsegoChasow / odinSotrudnik;
        System.out.println("Всего работников в компании "+ vsegoRabotnikow + " человек");
        var dopSotrudniki = vsegoRabotnikow + 94;
        System.out.println("добавили ещё 94 сотрудника и их стало "+dopSotrudniki);
        var chasi = vsegoChasow / dopSotrudniki;
        System.out.println("Если в компании работает " + dopSotrudniki + " человек, то "+ chasi+
                " часа" + " работы может быть поделено между сотрудниками");



    }
}







