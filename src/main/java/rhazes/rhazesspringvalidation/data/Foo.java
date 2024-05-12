package rhazes.rhazesspringvalidation.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rhazes.rhazesspringvalidation.validation.Palindrome;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {

    @Palindrome
    private  String bar;
}
