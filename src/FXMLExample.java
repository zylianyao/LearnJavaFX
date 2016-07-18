import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 拿客
 * www.coderknock.com
 * QQ群：213732117
 * 创建时间：2016年07月18日
 * 描述：
 */
public class FXMLExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));

        Scene scene = new Scene(root, 300, 275);

        primaryStage.setTitle("FXML测试");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
