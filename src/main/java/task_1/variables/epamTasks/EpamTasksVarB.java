package task_1.variables.epamTasks;

public class EpamTasksVarB {
    public void doEpamTasksVarB() {

        EpamTasksVarB_Methods varB = new EpamTasksVarB_Methods();

//        varB.toGreetUsingName();
//        varB.generateRandomNumbers();
//        varB.checkPassword();

        int[] myArray = varB.createIntegersArray();
        varB.outputEvenIntegers(myArray);
        varB.outputOddIntegers(myArray);
        varB.outputMinInt(myArray);
        varB.outputMaxInt(myArray);
        varB.outputIntDivByThreeOrNine(myArray);
        varB.outputIntDivByFiveAndSeven(myArray);
        varB.bubbleSortDescending(myArray);
    }
}
