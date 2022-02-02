package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 20, max = 100)
    private String description;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String state;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String city;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String district;

    @NotEmpty
    @Size(min = 10, max = 10)
    private String postalCode;

    @NotEmpty
    private Integer number;



}
