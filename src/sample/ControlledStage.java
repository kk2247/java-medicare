package sample;

import java.io.IOException;

/**
 * Created by KGZ on 2017/6/30 0030.
 */
public interface ControlledStage {
    public void setStageController(StageController stageController) throws IOException, ClassNotFoundException;
}