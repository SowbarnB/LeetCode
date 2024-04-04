class Solution {
    public String defangIPaddr(String address) {
        String defange = address.replaceAll("\\.", "[.]");
        return defange;
    }
}