class Solution {
    public String defangIPaddr(String address) {
        String defange = address.replace(".", "[.]");
        return defange;
    }
}