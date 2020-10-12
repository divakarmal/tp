package seedu.address.ui;

import java.util.logging.Logger;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Region;
import seedu.address.commons.core.LogsCenter;
import seedu.address.model.patient.Patient;

/**
 * Panel containing the list of patients.
 */
public class PatientListPanel extends UiPart<Region> {
    private static final String FXML = "PatientListPanel.fxml";
    private final Logger logger = LogsCenter.getLogger(PatientListPanel.class);

    @FXML
    private ListView<Patient> patientListView;

    @FXML
    private TableView patientTableView;

    /**
     * Creates a {@code PatientListPanel} with the given {@code ObservableList}.
     */
    public PatientListPanel(ObservableList<Patient> patientList) {
        super(FXML);

        TableColumn<Patient, Number> columnIndex = new TableColumn<Patient, Number>("#");
        columnIndex.setSortable(false);
        columnIndex.setCellValueFactory(column-> new ReadOnlyObjectWrapper<Number>(patientTableView.getItems().indexOf(column.getValue()) + 1));

        TableColumn<String, Patient> columnIc = new TableColumn<>("IC");
        columnIc.setCellValueFactory(new PropertyValueFactory<>("stringIC"));

        TableColumn<String, Patient> columnName = new TableColumn<>("Name");
        columnName.setCellValueFactory(new PropertyValueFactory<>("stringName"));

        TableColumn<String, Patient> columnDOB = new TableColumn<>("DOB");
        columnDOB.setCellValueFactory(new PropertyValueFactory<>("stringDOB"));

        TableColumn<String, Patient> columnPhone = new TableColumn<>("Phone");
        columnPhone.setCellValueFactory(new PropertyValueFactory<>("stringPhone"));

        TableColumn<String, Patient> columnEmail = new TableColumn<>("Email");
        columnEmail.setCellValueFactory(new PropertyValueFactory<>("stringEmail"));


        patientTableView.getColumns().add(columnIndex);
        patientTableView.getColumns().add(columnIc);
        patientTableView.getColumns().add(columnName);
        patientTableView.getColumns().add(columnDOB);
        patientTableView.getColumns().add(columnPhone);

        patientTableView.getItems().addAll(patientList);
    }

    /**
     * Custom {@code ListCell} that displays the graphics of a {@code Patient} using a {@code PatientCard}.
     */
    class PatientListViewCell extends ListCell<Patient> {
        @Override
        protected void updateItem(Patient patient, boolean empty) {
            super.updateItem(patient, empty);

            if (empty || patient == null) {
                setGraphic(null);
                setText(null);
            } else {
                setGraphic(new PatientCard(patient, getIndex() + 1).getRoot());
            }
        }
    }
}
