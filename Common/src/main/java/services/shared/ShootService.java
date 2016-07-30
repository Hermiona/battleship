package services.shared;

import models.CellState;

import java.awt.*;
import java.util.Map;

public interface ShootService {

    Map<Point, CellState> shootOn(Point point);

}