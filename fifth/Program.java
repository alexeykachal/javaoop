package Homework5;

import Homework5.Controllers.UserController;
import Homework5.Model.Calc;
import Homework5.Model.CalcImpl;
import Homework5.Model.LogManager;
import Homework5.Views.ViewCalc;

public class Program {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        UserController userController = new UserController(calc);
        LogManager logManager = new LogManager("Homework5/Log.log");
        ViewCalc viewCalc = new ViewCalc(userController, logManager);
        viewCalc.run();
    }
}
