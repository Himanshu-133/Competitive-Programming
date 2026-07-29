<h2><a href="https://codeforces.com/contest/1594/problem/A" target="_blank" rel="noopener noreferrer">1594A — Consecutive Sum Riddle</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1594A](https://codeforces.com/contest/1594/problem/A) |

## Topics
`math`

---

## Problem Statement

<div class="header"><div class="title">A. Consecutive Sum Riddle</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Theofanis has a riddle for you and if you manage to solve it, he will give you a Cypriot snack halloumi for free (Cypriot cheese).</p><p>You are given an integer $$$n$$$. You need to find two integers $$$l$$$ and $$$r$$$ such that $$$-10^{18} \le l  \lt  r \le 10^{18}$$$ and $$$l + (l + 1) + \ldots + (r - 1) + r = n$$$.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases.</p><p>The first and only line of each test case contains a single integer $$$n$$$ ($$$1 \le n \le 10^{18}$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print the two integers $$$l$$$ and $$$r$$$ such that $$$-10^{18} \le l  \lt  r \le 10^{18}$$$ and $$$l + (l + 1) + \ldots + (r - 1) + r = n$$$. </p><p>It can be proven that an answer always exists. If there are multiple answers, print any.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0040149541633529195" id="id008766661652276598" class="input-output-copier">Copy</div></div><pre id="id0040149541633529195">7
1
2
3
6
100
25
3000000000000
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0006824727296859068" id="id0049792972997806906" class="input-output-copier">Copy</div></div><pre id="id0006824727296859068">0 1
-1 2 
1 2 
1 3 
18 22
-2 7
999999999999 1000000000001</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case, $$$0 + 1 = 1$$$.</p><p>In the second test case, $$$(-1) + 0 + 1 + 2 = 2$$$.</p><p>In the fourth test case, $$$1 + 2 + 3 = 6$$$.</p><p>In the fifth test case, $$$18 + 19 + 20 + 21 + 22 = 100$$$.</p><p>In the sixth test case, $$$(-2) + (-1) + 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 = 25$$$.</p></div>