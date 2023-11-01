package Java;

public class maxLootHouses {
    public static int iterativeDP(int houses[]) {
        int n = houses.length;
        int maxLoot[] = new int [n+1];
        maxLoot[0] = houses[0];
        maxLoot[1] = houses[1];
        for(int i=2; i<n; i++) {
            maxLoot[i] = Math.max(maxLoot[i-2] + houses[i], houses[i-1]);
        }
        return maxLoot[n+1];
    }
    public static int maxHouses(int houses[], int si, int ans) {
        if(houses.length == si) {
            return ans;
        }
        return Math.max(maxHouses(houses, si+2, ans+houses[si]), maxHouses(houses, si+1, ans));
    }  
}
