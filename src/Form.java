import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 拿客
 * www.coderknock.com
 * QQ群：213732117
 * 创建时间：2016年07月18日
 * 描述：
 */
public class Form extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Welcome");

        //网格
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 1024, 698);
        scene.getStylesheets().add
                (Form.class.getResource("form.css").toExternalForm());
        primaryStage.setScene(scene);
        Text scenetitle = new Text("登录");
        scenetitle.setId("welcome-text");
        scenetitle.setFont(Font.font("微软雅黑", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("用户名:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("密码:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Button btn = new Button("登录");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        final Text actiontarget = new Text();
        actiontarget.setId("actiontarget");
        grid.add(actiontarget, 1, 6);
        btn.setOnAction(e -> {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Sign in button pressed");
        });
        primaryStage.show();
    }
}
