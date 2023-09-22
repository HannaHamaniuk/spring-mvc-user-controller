package by.anne.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="user")
@NoArgsConstructor
@RequiredArgsConstructor
@Data

public class User {
    @NonNull
    @Id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

}
