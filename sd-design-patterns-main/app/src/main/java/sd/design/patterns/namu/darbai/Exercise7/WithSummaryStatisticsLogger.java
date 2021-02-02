//package sd.design.patterns.namu.darbai.Exercise7;
//
//import java.util.List;
//
//public class WithSummaryStatisticsLogger extends StatisticDecorator {
//    public WithSummaryStatisticsLogger(StatisticsLogger statisticDecorator) {
//        super(statisticDecorator);
//    }
//
//    @Override
//    public void displayStatistics() {
//        statisticDecorator.displayStatistics();
//        System.out.println("particular results");
//    }
//    @Override
//    public List<Double> getExecutionTimes() {
//        List<Double> executionTimes = null;
//        return executionTimes;
//    }
//}
//
