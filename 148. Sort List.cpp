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
    ListNode* sortList(ListNode* head) {
        if(!head || !head->next){
            return head;
        }
        vector<int> arr;
        while(head){
            arr.push_back(head->val);
            head = head->next;
        }
        sort(arr.begin(), arr.end()); 
        ListNode* temp = new ListNode(arr[0]);
        ListNode* temp2=temp;
        for(int i=1;i<arr.size();i++){
            temp->next = new ListNode();
            temp = temp->next;
            temp->val = arr[i];
        }
        return temp2;
    }
};