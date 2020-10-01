package seedu.address.model.person;

public enum BloodTypeEnum {
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    O_POSITIVE("O+"),
    O_NEGATIVE("O-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-");

    public final String label;
    private BloodTypeEnum(String label) {
        this.label = label;
    }

    public static BloodTypeEnum valueOfLabel(String label) {
        for (BloodTypeEnum e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }

}