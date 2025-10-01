//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.*;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class Dashboard extends Application {
//
//    @Override
//    public void start(Stage stage) {
//        stage.setTitle("TaskHelper Dashboard");
//
//        BorderPane root = new BorderPane();
//        root.setPadding(new Insets(10));
//
//        // Header
//        HBox header = new HBox(10);
//        header.setPadding(new Insets(10));
//        Label title = new Label("TaskHelper");
//        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
//        Button logoutBtn = new Button("Logout");
//        header.getChildren().addAll(title, logoutBtn);
//
//        root.setTop(header);
//
//        // Welcome
//        VBox welcomeBox = new VBox(5);
//        welcomeBox.setPadding(new Insets(10));
//        Label welcome = new Label("Welcome back!");
//        welcome.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
//        Label desc = new Label("Find help for your tasks or manage your bookings.");
//        welcomeBox.getChildren().addAll(welcome, desc);
//
//        // Quick actions
//        HBox quickActions = new HBox(10);
//        Button findHelp = new Button("Find Help");
//        Button myBookings = new Button("My Bookings");
//        Button taskHistory = new Button("Task History");
//        quickActions.getChildren().addAll(findHelp, myBookings, taskHistory);
//
//        VBox centerBox = new VBox(15, welcomeBox, quickActions);
//
//        // Recent Tasks
//        TitledPane recentTasks = new TitledPane();
//        recentTasks.setText("Recent Tasks");
//        VBox tasksList = new VBox(5);
//        tasksList.getChildren().addAll(
//                new Label("• Furniture Assembly - Completed ($45)"),
//                new Label("• Grocery Shopping - In Progress ($25)"),
//                new Label("• Dog Walking - Scheduled ($20)")
//        );
//        recentTasks.setContent(tasksList);
//
//        centerBox.getChildren().add(recentTasks);
//
//        root.setCenter(centerBox);
//
//        Scene scene = new Scene(root, 800, 600);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch();
//    }
//}
//
