class Solution {
    boolean isbal = true;
    
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        
        isbal(root);
        
        return isbal; 
    }
    
    int isbal(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l = isbal(root.left);
        int r = isbal(root.right);
        int gap = Math.abs(l-r);
        if(gap>1)
        {
            isbal = false; 
        }
        int h = Math.max(l,r)+1;
        return h;
    }
}
