# Java
Welcome to the wonderful world of Java!


## Getting input

### Scanner
To import: `import java.util.Scanner;`

To instantiate: `Scanner input = new Scanner(System.in);`

To get data: 

    int i = input.nextInt();
    String s = input.nextLine();
    double d = input.nextDouble();
  
**Note**: When you call `.nextInt()`, it does not remove the newline (`\n`) key. That means the next time you try to use `.nextLine()` it will very likely return nothing. Solve this by running `input.nextLine();`, where you assign what it returns to nothing after each line.

### BufferedReader
MUCH faster than Scanner.

To import: `import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;`   

To instantiate: `BufferedReader br = new BufferedReader(new InputStreamReader(System.in));`  - Also add on 

#### Fetching input
#### Parsing input to desired datatype (StringTokenizer)

## Converting datatypes

### Strings