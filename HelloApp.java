#include <stdio.h>

int main(int argc, char *argv[]) {
    // Check if a name is provided as command-line argument
    if (argc > 1) {
        printf("Hello, %s\n", argv[1]);
    } else {
        // Default message if no argument is given
        printf("Hello, World\n");
    }
    return 0;
}
