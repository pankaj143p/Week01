#include <iostream>
#include <vector>
#include <cmath>
#include <queue>
#include <set>
#include <climits>

using namespace std;

#define M 1000
#define R 1000
#define INF INT_MAX
#define IMPOSSIBLE "Impossible"

bool o(int x1, int y1, int r1, int x2, int y2, int r2) {
    return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2)) < (r1 + r2);
}

int f(int s, int d, vector<vector<int>>& g) {
    queue<pair<int, int>> q;
    q.push({s, 0});
    set<int> v;
    v.insert(s);
    while (!q.empty()) {
        auto c = q.front();
        q.pop();
        int b = c.first, t = c.second;
        if (b == d) return t;
        for (int n : g[b]) {
            if (v.find(n) == v.end()) {
                v.insert(n);
                q.push({n, t + 1});
            }
        }
    }
    return INF;
}

string s() {
    int n, x1, y1, r1, x2, y2, m, t;
    cin >> n >> x1 >> y1 >> r1 >> x2 >> y2 >> m;
    vector<vector<int>> b;
    m++;
    vector<vector<int>> g(m);
    for (int i = 0; i < m - 1; i++) {
        int bx, by, br;
        cin >> bx >> by >> br;
        b.push_back({bx, by, br});
    }
    b.push_back({x2, y2, 0});
    cin >> t;
    for (int i = 0; i < t; i++) {
        int u, v;
        cin >> u >> v;
        g[u - 1].push_back(v - 1);
        g[v - 1].push_back(u - 1);
    }
    if (o(x1, y1, r1, b[0][0], b[0][1], b[0][2])) return IMPOSSIBLE;
    if (o(x2, y2, 0, b[n - 1][0], b[n - 1][1], b[n - 1][2])) return IMPOSSIBLE;
    vector<int> a;
    for (int i = 0; i < n - 1; i++) {
        if (!o(x1, y1, r1, b[i][0], b[i][1], b[i][2])) a.push_back(i);
    }
    int mT = INF, d = n - 1;
    for (int i : a) {
        int c = f(i, d, g);
        mT = min(mT, c);
    }
    if (mT == INF) return IMPOSSIBLE;
    return to_string(mT);
}

int main() {
    cout << s() << endl;
    return 0;
}
