package seedu.address.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import seedu.address.model.patient.Address;
import seedu.address.model.patient.BloodType;
import seedu.address.model.patient.DateOfBirth;
import seedu.address.model.patient.Email;
import seedu.address.model.patient.Height;
import seedu.address.model.patient.Ic;
import seedu.address.model.patient.Name;
import seedu.address.model.patient.Patient;
import seedu.address.model.patient.Phone;
import seedu.address.model.patient.Weight;

import java.util.Optional;

import static seedu.address.model.util.SampleDataUtil.getTagSet;


public class TableExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<String, Patient> column1 = new TableColumn<>("Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("stringName"));


        TableColumn<String, Patient> column2 = new TableColumn<>("Email");
        column2.setCellValueFactory(new PropertyValueFactory<>("stringEmail"));


        Patient a = new Patient(new Ic("S9123456A"), new Name("Alex Yeoh"), new DateOfBirth("15-05-1991"),
                new Phone("87438807"), Optional.of(new Email("alexyeoh@example.com")),
                Optional.of(new Address("Blk 30 Geylang Street 29, #06-40")), Optional.of(new Height("173")),
                Optional.of(new Weight("67.4")), Optional.of(new BloodType("A+")), getTagSet("friends"));

        Patient b = new Patient(new Ic("S8786858D"), new Name("Bernice Yu"), new DateOfBirth("17-09-1987"),
                new Phone("99272758"), Optional.of(new Email("berniceyu@example.com")),
                Optional.of(new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18")),
                Optional.of(new Height("166")), Optional.of(new Weight("48.2")),
                Optional.of(new BloodType("B+")), getTagSet("colleagues", "friends"));

        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getItems().add(a);
        tableView.getItems().add(b);



        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public class Person {

        private String firstName = null;
        private String lastName = null;

        public Person() {
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

}

