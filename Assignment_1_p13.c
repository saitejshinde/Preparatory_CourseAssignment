#include <stdio.h>
#include <string.h>

int main() {
    char *arr[] = {"apple", "banana", "orange", "apple", "banana", "grape"};
    int n = 6;

    printf("Duplicated Strings:\n");

    for(int i = 0; i < n; i++) {
        for(int j = i + 1; j < n; j++) {
            if(strcmp(arr[i], arr[j]) == 0) {
                printf("%s\n", arr[i]);
                break;
            }
        }
    }

    return 0;
}