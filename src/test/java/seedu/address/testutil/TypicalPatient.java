package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HEIGHT_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HEIGHT_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_IC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_IC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEIGHT_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_WEIGHT_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.patient.Patient;

/**
 * A utility class containing a list of {@code Patient} objects to be used in tests.
 */
public class TypicalPatient {

    public static final Patient ALICE = new PatientBuilder().withIc("S9777777R").withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253").withHeight("174").withWeight("48.5")
            .withTags("friends").build();
    public static final Patient BENSON = new PatientBuilder().withIc("S9234567A").withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432").withHeight("170").withWeight("63.5")
            .withTags("owesMoney", "friends").build();
    public static final Patient CARL = new PatientBuilder().withIc("S9876543W").withName("Carl Kurz")
            .withPhone("95352563").withEmail("heinz@example.com").withAddress("wall street").withHeight("162")
            .withWeight("80.8").build();
    public static final Patient DANIEL = new PatientBuilder().withIc("T0054321P").withName("Daniel Meier")
            .withPhone("87652533").withEmail("cornelia@example.com").withAddress("10th street").withHeight("183")
            .withWeight("70.3").withTags("friends").build();
    public static final Patient ELLE = new PatientBuilder().withIc("F7654321Q").withName("Elle Meyer")
            .withPhone("9482224").withEmail("werner@example.com").withAddress("michegan ave").withHeight("177")
            .withWeight("43.5").build();
    public static final Patient FIONA = new PatientBuilder().withIc("S7543210A").withName("Fiona Kunz")
            .withPhone("9482427").withEmail("lydia@example.com").withAddress("little tokyo").withHeight("168")
            .withWeight("50.5").build();
    public static final Patient GEORGE = new PatientBuilder().withIc("T0232323I").withName("George Best")
            .withPhone("9482442").withEmail("anna@example.com").withAddress("4th street").withHeight("169")
            .withWeight("69.2").build();

    // Manually added
    public static final Patient HOON = new PatientBuilder().withIc("S8756432F").withName("Hoon Meier")
        .withPhone("8482424").withEmail("stefan@example.com").withAddress("little india").withHeight("171").build();
    public static final Patient IDA = new PatientBuilder().withIc("T0066441J").withName("Ida Mueller")
        .withPhone("8482131").withEmail("hans@example.com").withAddress("chicago ave").withHeight("160").build();

    // Manually added - Patient's details found in {@code CommandTestUtil}
    public static final Patient AMY = new PatientBuilder().withIc(VALID_IC_AMY).withName(VALID_NAME_AMY)
        .withPhone(VALID_PHONE_AMY).withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY)
        .withHeight(VALID_HEIGHT_AMY).withWeight(VALID_WEIGHT_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Patient BOB = new PatientBuilder().withIc(VALID_IC_BOB).withName(VALID_NAME_BOB)
        .withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB)
        .withHeight(VALID_HEIGHT_BOB).withWeight(VALID_WEIGHT_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPatient() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical patients.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Patient patient : getTypicalPatients()) {
            ab.addPatient(patient);
        }
        return ab;
    }

    public static List<Patient> getTypicalPatients() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
