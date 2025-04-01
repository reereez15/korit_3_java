package ch17_static.builders;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@ToString
public class PersonLombok {
    private String name;
    private int age;
    private String address;
}
