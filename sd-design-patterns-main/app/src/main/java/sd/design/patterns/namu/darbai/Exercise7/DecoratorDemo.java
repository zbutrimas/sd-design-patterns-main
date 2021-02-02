//package sd.design.patterns.namu.darbai.Exercise7;
//
//import java.util.List;
//
//public class DecoratorDemo {
//    public static void main(String[] args) {
//        final StatisticsLogger statisticsLogger =
//                new WithMeanStatisticsLogger(
//                new WithSummaryStatisticsLogger(
//                        new ExecutionTimesBaseStatistics(List.of(1.2, 2.2, 3.4))));
//        statisticsLogger.displayStatistics();
//        System.out.println(statisticsLogger);
//    }
//}
//class WithMeanStatisticsLogger implements StatisticsLogger {
//    StatisticsLogger component;
//    public WithMeanStatisticsLogger(StatisticsLogger component) {this.component = component;}
//    public void displayStatistics() {
//        System.out.println("average of the results");
//        component.getExecutionTimes();
//    }
//
//    @Override
//    public List<Double> getExecutionTimes() {
//        return null;
//    }
//}
//class WithSummaryStatisticsLogger implements StatisticsLogger {
//    StatisticsLogger component;
//    public WithSummaryStatisticsLogger(StatisticsLogger component) {this.component = component;}
//    public void displayStatistics() {
//        System.out.println("results");
//        component.getExecutionTimes();
//    }
//
//    @Override
//    public List<Double> getExecutionTimes() {
//        return null;
//    }
//}
//
