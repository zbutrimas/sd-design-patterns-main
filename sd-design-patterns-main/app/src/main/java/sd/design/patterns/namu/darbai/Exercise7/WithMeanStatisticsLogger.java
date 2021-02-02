//package sd.design.patterns.namu.darbai.Exercise7;
//
//import java.util.List;
//
//public class WithMeanStatisticsLogger extends StatisticDecorator{
//
//    public WithMeanStatisticsLogger(StatisticsLogger statisticDecorator) {
//        super(statisticDecorator);
//    }
//
//    @Override
//    public void displayStatistics() {
//        statisticDecorator.displayStatistics();
//        System.out.println("average of the results");
//    }
//    @Override
//    public List<Double> getExecutionTimes() {
//        List<Double> executionTimes = null;
//        return executionTimes;
//    }
//}
//
