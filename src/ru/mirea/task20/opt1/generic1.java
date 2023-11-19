package ru.mirea.task20.opt1;

class GenericClass<T, V, K> {
    private T variable1;
    private V variable2;
    private K variable3;

    public GenericClass(T variable1, V variable2, K variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public T getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public K getVariable3() {
        return variable3;
    }

    public void setVariable1(T variable1) {
        this.variable1 = variable1;
    }

    public void setVariable2(V variable2) {
        this.variable2 = variable2;
    }

    public void setVariable3(K variable3) {
        this.variable3 = variable3;
    }
}

class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String, Boolean> myClass = new GenericClass<>(10, "Hello", true);
        Integer variable1 = myClass.getVariable1();
        String variable2 = myClass.getVariable2();
        Boolean variable3 = myClass.getVariable3();
        System.out.println("Variable 1: " + variable1);
        System.out.println("Variable 2: " + variable2);
        System.out.println("Variable 3: " + variable3);
        myClass.setVariable1(20);
        myClass.setVariable2("World");
        myClass.setVariable3(false);
        variable1 = myClass.getVariable1();
        variable2 = myClass.getVariable2();
        variable3 = myClass.getVariable3();
        System.out.println("Updated Variable 1: " + variable1);
        System.out.println("Updated Variable 2: " + variable2);
        System.out.println("Updated Variable 3: " + variable3);
    }
}