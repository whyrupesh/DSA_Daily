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
    ListNode* deleteMiddle(ListNode* head) {
        if(!head){
            return head;
        }
        if(!head->next){
            return head->next;
        }

        ListNode* temp = head;
        ListNode* temp2 = head;

        int count = 1;
        while(head->next){
            count++;
            head = head->next;
        }

        cout<<count/2;

        if(count%2==0){
            count = count/2 ;
        }
        else{
            count = count/2;
        }
        count--;
        while(count--){
            temp = temp->next;
        }
        temp->next= temp->next->next;

        return temp2;


    }
};