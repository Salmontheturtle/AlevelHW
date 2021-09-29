package ua.masliy.moduleTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.masliy.modules.module1.ModuleTask2;

public class KnightTestt {
    @Test
    void correctMovementsCheck(){
        Assert.assertEquals(ModuleTask2.stepPossibilityCheck(6, 7, 4, 6),
                "Вы успешно передвинули коня на 2 клетки вверх и одну влево!");
        Assert.assertEquals(ModuleTask2.stepPossibilityCheck(5, 3, 7, 2),
                "Вы успешно передвинули коня на 2 клетки вверх и одну влево!");
        Assert.assertEquals(ModuleTask2.stepPossibilityCheck(1, 1, 3, 2),
                "Вы успешно передвинули коня на 2 клетки вниз и одну вправо!");
    }
    @Test
    void incorrectCoordsCheck(){
        Assert.assertEquals(ModuleTask2.stepPossibilityCheck(6, 7, 4, 5),
                "Конь не может быть сюда передвинут!");
        Assert.assertEquals(ModuleTask2.stepPossibilityCheck(5, 3, 1, 0),
                "Конь не может быть сюда передвинут!");
        Assert.assertEquals(ModuleTask2.stepPossibilityCheck(0, -1, 3, 2),
                "Конь не может быть сюда передвинут!");
    }
}
