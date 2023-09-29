@Data:
-----

* It is equivalent to:

  - @Getter
  - @Setter
  - @RequiredArgsConstructor
  - @ToString
  - @EqualsAndHashCode

@Value:
-------

* This is the boilerplate code for DTO/Immutable classes.
* It consists of the following annotations:
  - @Getter
  - @FieldDefaults(makeFinal=true, level=AccessLevel.PRIVATE)
  - @AllArgsConstructor
  - @ToString
  - @EqualsAndHashCode

Difference between @Data and @Value annotation:
-----------------------------------------------

| @Data                                                                                                                       | @Value                                                                                                                                    |
|-----------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| Lombok generated class is not final.                                                                                        | Lombok generated class is final                                                                                                           |
| Generates required-args constructor.                                                                                        | Generates all-args constructor.                                                                                                           |
| Generates equals(), hashCode() and toString().                                                                              | Generates equals(), hashCode() and toString().                                                                                            |
| Does not make fields final.                                                                                                 | Makes all non-static fields final.                                                                                                        |
| Generates setters and getters. No getters/setters are generated for static fields and no setters generate for final fields. | No setters generate for any filed as it makes all fields final except static fields, and obviously no getters generate for static fileds. |

Ref Link: https://javabydeveloper.com/lombok-value-annotation-examples/