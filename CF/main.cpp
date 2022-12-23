#include <iostream>
#include <array>
#include <map>
#include <vector>
#include <set>
#include <stack>
#include <deque>
#include <queue>
#include <string>
#include <cmath>
#include <cstring>
using namespace std;
#define fst                           \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);                    \
    cout.tie(NULL);
void solve()
{
    long long f[100005] = {0};
    int n, x, mx = 0;
    long long ar[n];
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        f[x]++;
        ar[i] = x;
        mx = max(mx, x);
    }
    for (int i = 1; i <= mx; i++)
    {
        f[i] = f[i] + f[i - 1];
    }
    // for (int i = 0; i < n; i++)
    // {
    //     if (ar[i] == 0)
    //         cout << "0 ";
    //     else
    //         cout << (f[ar[i]] - (f[ar[i]] - f[ar[i - 1]])) << " ";
    // }
    cout << "Nice";
}
int main()
{
    fst;
    solve();
}
