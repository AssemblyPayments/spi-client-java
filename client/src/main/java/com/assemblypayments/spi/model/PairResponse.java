package com.assemblypayments.spi.model;

/**
 * Pairing Interaction 5: Incoming.
 */
public class PairResponse {

    private final Boolean success;

    public PairResponse(Message m) {
        this.success = (Boolean) m.getData().get("success");
    }

    public Boolean getSuccess() {
        return success;
    }

}
