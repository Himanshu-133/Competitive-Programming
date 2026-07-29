<h2><a href="https://codeforces.com/contest/1594/problem/B" target="_blank" rel="noopener noreferrer">1594B — Special Numbers</a></h2>

| | |
|---|---|
| **Difficulty** | 1100 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1594B](https://codeforces.com/contest/1594/problem/B) |

## Topics
`bitmasks` `math`

---

## Problem Statement

<div class="header"><div class="title">B. Special Numbers</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>Theofanis really likes sequences of positive integers, thus his teacher (Yeltsa Kcir) gave him a problem about a sequence that consists of only special numbers.</p><p>Let's call a positive number <span class="tex-font-style-it">special</span> if it can be written as a sum of <span class="tex-font-style-bf">different</span> non-negative powers of $$$n$$$. For example, for $$$n = 4$$$ number $$$17$$$ is special, because it can be written as $$$4^0 + 4^2 = 1 + 16 = 17$$$, but $$$9$$$ is not.</p><p>Theofanis asks you to help him find the $$$k$$$-th special number if they are sorted in increasing order. Since this number may be too large, output it modulo $$$10^9+7$$$.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases.</p><p>The first and only line of each test case contains two integers $$$n$$$ and $$$k$$$ ($$$2 \le n \le 10^9$$$; $$$1 \le k \le 10^9$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print one integer — the $$$k$$$-th special number in increasing order modulo $$$10^9+7$$$.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id001329482130294165" id="id009701777797372408" class="input-output-copier">Copy</div></div><pre id="id001329482130294165">3
3 4
2 12
105 564
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id00530548236153328" id="id005365133838074139" class="input-output-copier">Copy</div></div><pre id="id00530548236153328">9
12
3595374
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>For $$$n = 3$$$ the sequence is $$$[1,3,4,9...]$$$</p></div>