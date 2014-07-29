package impl;

public enum Day {
    MONDAY("1"),THUESDAY("2"),WENSDAY("3"),THURSDAY("4"),FRIDAY("5"),SATURDAY("6"),SUNDAY("7");
    private Day(String greeting)
    {
        this.greeting=greeting;
    }
    private String greeting;
    public String getGreeting()
    {
        return this.greeting;
    }
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY.getGreeting());
    }
}
