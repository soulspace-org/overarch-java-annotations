# Overarch Java Annotations
Annotate your java source code with Overarch Java Annotations to generate Overarch models for your java projects.

*draft*

## Usage
Add the `overarch-java` and `overarch-java-annotation` dependencies to your project
and annotate your java sources with the overarch annotations.

On compilation, the annotation processor processes the annotated source files
and generates a `model.edn` file containing the set of model elements derived
from the sources.

## Example

Create a component model element by annotating a package in the `package-info.java` file:
```java
/**
 * The User Management component provides the user related functionality.
 */
@OverarchNode(el = "component", id = "example/user", name = "User Management")
package example.user;

import org.soulspace.overarch.java.OverarchNode;
```

Create a component model element by annotating a class:
```java
package example.user.application;

import java.util.UUID;

import org.soulspace.overarch.java.OverarchNode;

import example.user.domain.User;

/**
 * Implements the use cases of the user management component
 */
@OverarchNode(el = "class" , id = "example.user.application/user-service")
public class UserService {
    public User createUser(String firstname, String lastName, String email) {
        // TODO implement
        return null;
    };

    public boolean deleteUser(UUID id) {
        // TODO implement
        return false;
    };
}
```

## Copyright
© 2024 Ludger Solbach

## License
Eclipse Public License 1.0 (EPL1.0)
