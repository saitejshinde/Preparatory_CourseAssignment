#include <stdio.h>

struct emp {
    char firstName[50];
    char lastName[50];
    double salary;
};

void emp_init(struct emp *e, char *fn, char *ln, double sal) {
    strcpy(e->firstName, fn);
    strcpy(e->lastName, ln);
    e->salary = sal;
}

void set_salary(struct emp *e, double sal) {
    e->salary = sal;
}

void emp_display(struct emp *e) {
    printf("Name: %s %s\n", e->firstName, e->lastName);
    printf("Monthly Salary: %.2f\n", e->salary);
    printf("Yearly Salary: %.2f\n\n", e->salary * 12);
}

int main() {
    struct emp e1, e2;

    emp_init(&e1, "John", "Doe", 20000);
    emp_init(&e2, "Jane", "Smith", 25000);

    printf("Before Raise:\n");
    emp_display(&e1);
    emp_display(&e2);

    set_salary(&e1, e1.salary * 1.10);
    set_salary(&e2, e2.salary * 1.10);

    printf("After 10%% Raise:\n");
    emp_display(&e1);
    emp_display(&e2);

    return 0;
}