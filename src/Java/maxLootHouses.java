package Java;

public class maxLootHouses {
    public static int maxHouses(int houses[], int si, int ans) {
        if(houses.length == si) {
            return ans;
        }
        return Math.max(maxHouses(houses, si+2, ans+houses[si]), maxHouses(houses, si+1, ans));
    }  
}
