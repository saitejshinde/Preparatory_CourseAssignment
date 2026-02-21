#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return strcmp((char *)a, (char *)b);
}

int main() {
    char nameOfStudents[10][50];
    int n, i;

    printf("Enter number of students (max 10): ");
    scanf("%d", &n);

    printf("Enter names:\n");
    for(i = 0; i < n; i++) {
        scanf("%s", nameOfStudents[i]);
    }

    qsort(nameOfStudents, n, sizeof(nameOfStudents[0]), compare);

    printf("\nSorted Names:\n");
    for(i = 0; i < n; i++) {
        printf("%s\n", nameOfStudents[i]);
    }

    return 0;
}