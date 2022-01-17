/**
     Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more than one answer, return any of them.

    A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.
 */

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
    
    void inorderTransversal(TreeNode* node, vector<TreeNode*> &tree){
        if(node == NULL){
            return;
        }
        inorderTransversal(node->left, tree);
        tree.push_back(node);
        inorderTransversal(node->right, tree);
    }
    
    TreeNode* balanceTree(vector<TreeNode*> &tree, int start, int finish){
        if(start > finish){
            return nullptr;
        }
        int mid = start + (finish-start)/2;
        TreeNode* node = tree[mid];
        node-> left = balanceTree(tree, start, mid-1);
        node->right = balanceTree(tree, mid+1, finish);
        
        return node;
        
    }
    
    TreeNode* balanceBST(TreeNode* root) {
        vector<TreeNode*> tree;
        inorderTransversal(root, tree);
        return balanceTree(tree, 0, tree.size() - 1);
    }
    
};