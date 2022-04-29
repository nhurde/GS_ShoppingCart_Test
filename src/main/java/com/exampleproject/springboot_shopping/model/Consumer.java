package com.exampleproject.springboot_shopping.model;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "consumers")
public class Consumer
{

    @Id
    private String id;

    private @NonNull String name;
    private @NonNull String firstName;
    private @NonNull String lastName;
    private @NonNull String countryName;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private @NonNull
    String email;
}