package io.khasang.qb.model;

/**
 * Created by Андрей on 20.07.2016.
 */
public class Stage {
    String name;

    private Stage(){
        name = "PrimaryStage";
    }

    private static class StageHolder{
        static Stage stageInstance = new Stage();
    }

    public static Stage getInstance(){
        return StageHolder.stageInstance;
    }

    public String getName() {
        return name;
    }
}
