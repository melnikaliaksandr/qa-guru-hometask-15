package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Body {

    private String

            name,
            email,
            password,
            token,
            id,
            job,
            createdAt,
            updatedAt;

}
