package eu.europa.esig.dss.validation;

public enum SignatureQualification {

	QESig("Qualified electronic signature"),

	AdESig_QC("Advanced electronic signature supported by a qualified certificate"),

	// AdESig("Advanced electronic signature"),
	// QESeal("Qualified electronic seal"),
	// AdESeal_QC("Advanced electronic seal supported by a qualified certificate"),
	// AdESeal("Advanced electronic seal"),

	AdES("Advanced electronic signature or advanced electronic seal (undefined)");

	private final String label;

	private SignatureQualification(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	/**
	 * SignatureQualification can be null
	 */
	public static SignatureQualification forName(String value) {
		if ((value != null) && !value.isEmpty()) {
			return SignatureQualification.valueOf(value);
		}
		return null;
	}

}
