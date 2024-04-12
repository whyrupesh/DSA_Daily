/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp = head;
        if(!head){
            return head;
        }
        if(!head->next && n==1){
            return head->next;
        }
        ListNode* temp2 = head;

        int count=1;
        while(head->next){
            count++;
            head=head->next;
        }
        if(count == n){
            return temp2->next;
        }
        count = count - n-1;
        while(count--){
            temp = temp->next;
        }
        temp->next = temp->next->next;
        return temp2;

    }
};