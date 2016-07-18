import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 拿客
 * www.coderknock.com
 * QQ群：213732117
 * 创建时间：2016年07月18日
 * 描述：
 */
//JavaFX主类需要继承 Application
public class HelloWorld extends Application {
    /**
     * 入口方法
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("拿客");
        button.setFont(new Font("微软雅黑", 24));
        button.setOnAction(event -> System.out.println("test"));
        //可调整大小的布局
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);

        //最后两个数字是宽和高
        Scene scene = new Scene(stackPane, 300, 200);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //JDK8已经不需要声明main 方法
    public static void main(String[] args) {
        launch(args);
    }
}
