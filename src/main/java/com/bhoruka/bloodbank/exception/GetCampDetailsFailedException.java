package com.bhoruka.bloodbank.exception;

public class GetCampDetailsFailedException extends RuntimeException {

    /**
     * Thrown when there is a problem while creating a camp in the DB.
     * @param message The cause of the failure
     */
    public GetCampDetailsFailedException(final String message) {
        super(message);
    }
}
