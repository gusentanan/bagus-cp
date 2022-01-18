/** Given the root of a binary tree, return the inorder traversal of its nodes' values.

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    
    void traversal(vector<int> &res, TreeNode* root){
        if(root == NULL){
            return;
        }
        
        traversal(res, root->left);
        res.push_back(root->val);
        traversal(res, root->right);
    }
    
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        traversal(res, root);
        return res;
    }
};

// Time: O(n)
// Space: O(n)