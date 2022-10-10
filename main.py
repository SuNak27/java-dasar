import sympy as sp

x = sp.Symbol('x')
y = sp.Symbol('y')

p = 5*x + 5 - 20
sp.solve(p)

k = x**2 - 5
sp.solve(k)

print(sp.solve(k))
