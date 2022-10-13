# Salt Kata Series

## Vowels

This kata is a simple game of splitting and mixing words by the first vowel.

Some examples

Word 1 | Word 2 | Result 1 | Result 2
:---:  | :---:  | :---:    | :---:
towel  | car    | tor      | cawel
apple  | melon  | alon     | mepple
black  | white  | blate    | whick
mms    | sms    | mms      | sms

## Constraints

### Interface
Create a Class called vowels that has a public method that transforms input according to te specification above.  It should take _two parameters_ - one for each word that should be transformed.vThe input parameters must be words with the characters from the english alphabet.
No spaces or special characters are allowed, but, empty strings are allowed.

The output of the `transform` method should be _an array with two items_, which are the tranformations of the two input parameters.
All output items should be lower case strings.

### Errors

The ethod should report any errors (including bad input) to the client by throwing.


#### TDD

Develop the code TDD style, i.e. follow the work flow **Red**, **Green**, **Refactor**.

---

Good luck and have fun!
