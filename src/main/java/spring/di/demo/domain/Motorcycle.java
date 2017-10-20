package spring.di.demo.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@EqualsAndHashCode(of = {"id"})
@ToString
public class Motorcycle {

    private Long id;

    private String manufacturer;
    private String model;
    private String year;
}
