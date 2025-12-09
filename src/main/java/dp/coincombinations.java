package dp;

import java.util.Arrays;

public class coincombinations {
  public int coinChange(int[] coins, int amount) {
    int max = amount + 1;
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, max);
    dp[0] = 0;

    for (int coin : coins) {
      for (int j = coin; j <= amount; j++) {
        // dp[j] = minimum number of coins needed to make amount j
        dp[j] = Math.min(dp[j], dp[j - coin] + 1);
      }
    }

    if (dp[amount] == max) {
      return -1;
    } else {
      return dp[amount];
    }

  }
}
