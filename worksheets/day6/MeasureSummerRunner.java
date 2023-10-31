public class MeasureSummerRunner {

    private void launch() {
        Measurable[] ms = new Measurable[2];
        ms[0] = new Point(1,0);
        ms[1] = new Horse(20); //Point(3, 4);
        double d = MeasureSummer.sumMeasures(ms);
        System.out.println(d);
    }

    public static void main(String[] args) {
        MeasureSummerRunner runner = new MeasureSummerRunner();
        runner.launch();
    }
}
