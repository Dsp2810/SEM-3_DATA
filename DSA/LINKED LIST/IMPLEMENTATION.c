#include <stdio.h>
#include <stdlib.h>

typedef struct node node;
struct node
{
    int data;
    node *link;
};
void print_count();

int main()
{

    node *head, *ptr1, *ptr2;
    // first node
    head = (node *)malloc(sizeof(node));
    head->data = 60;
    head->link = NULL;
    // printf("%d\n", head->data);
    // second node
    ptr1 = (node *)malloc(sizeof(node));
    ptr1->data = 58;
    ptr1->link = NULL;
    // printf("%d\n", ptr1->data);
    // assigning the address to first node
    head->link = ptr1;
    // third node
    ptr2 = (node *)malloc(sizeof(node));
    ptr2->data = 421;
    ptr2->link = NULL;
    // printf("%d", ptr2->data);
    // assigning the address to second node
    ptr1->link = ptr2;
    print_count(head);
    return 0;
}

void print_count(node *head)
{
    int count = 0;
    node *temp = head;
    while (temp != NULL)
    {
        printf("%d  ", temp->data);
        temp = temp->link;
        count++;
    }
    printf("\nCount=%d", count);
}