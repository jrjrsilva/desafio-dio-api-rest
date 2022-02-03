package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.AddressDTO;
import one.digitalinnovation.personapi.entities.Address;

public class AddressUtils {

    private static final String DESCRIPTION = "Rua Santa Clara";

    private static final String STATE = "Bahia";

    private static final String CITY = "Salvador";

    private static final String DISTRICT = "Centro Histórico";

    private static final String POSTALCODE = "40000000";

    private static final Integer NUMBER = 21;

    private static final Long ADDRESS_ID = 1L;



    public static AddressDTO createFakeDTO() {
        return AddressDTO.builder()
                .description(DESCRIPTION)
                .state(STATE)
                .city(CITY)
                .district(DISTRICT)
                .postalCode(POSTALCODE)
                .number(NUMBER)
                .build();
    }

    public static Address createFakeEntity() {
        return Address.builder()
                .id(ADDRESS_ID)
                .description(DESCRIPTION)
                .state(STATE)
                .city(CITY)
                .district(DISTRICT)
                .postalCode(POSTALCODE)
                .number(NUMBER)
                .build();
    }
}
