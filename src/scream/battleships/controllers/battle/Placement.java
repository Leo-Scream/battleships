package scream.battleships.controllers.battle;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import scream.battleships.framework.ControlledScreen;
import scream.battleships.framework.ScreensController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import scream.battleships.start.BattleShips;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Verhoturov Denis - Leo.Scream.
 */
public class Placement implements ControlledScreen, Initializable
{
	@FXML
	private Canvas battleground;

	private GraphicsContext ctx;

	private ScreensController controller;

	@Override
	public void setScreenParent(ScreensController parent)
	{
		this.controller = parent;
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle)
	{
		//drawBattleGround();
	}

	@FXML
	public void menu(ActionEvent actionEvent)
	{
		controller.setScreen(BattleShips.menuBattleID);
	}

	@FXML
	public void battle(ActionEvent actionEvent)
	{
		controller.setScreen(BattleShips.battleBattleID);
	}

	private void drawBattleGround()
	{
        this.ctx.strokeRect(10, 10, 50, 50);
	}
}
