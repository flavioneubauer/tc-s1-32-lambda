# TC-S1-32 Lambda Authorizer

A idéia aqui foi simular um token com o CPF e data de expiração.

# Cenarios de teste 

## CPF Valido e timestamp valido
{"document":"47582100042","expiresAt":"2024-04-28T16:00:49.455"}

eyJkb2N1bWVudCI6IjQ3NTgyMTAwMDQyIiwiZXhwaXJlc0F0IjoiMjAyNC0wNC0yOFQxNjowMDo0OS40NTUifQ==

## CPF Valido e timestamp invalido
{"document":"47582100042","expiresAt":"2014-04-28T16:00:49.455"}

eyJkb2N1bWVudCI6IjQ3NTgyMTAwMDQyIiwiZXhwaXJlc0F0IjoiMjAxNC0wNC0yOFQxNjowMDo0OS40NTUifQ==

## CPF Invalido
{"document":"47582100111","expiresAt":"2024-04-28T16:00:49.455"}

eyJkb2N1bWVudCI6IjQ3NTgyMTAwMTExIiwiZXhwaXJlc0F0IjoiMjAyNC0wNC0yOFQxNjowMDo0OS40NTUifQ==

## CPF nulo
{"document": null,"expiresAt":"2024-04-28T16:00:49.455"}

eyJkb2N1bWVudCI6IG51bGwsImV4cGlyZXNBdCI6IjIwMjQtMDQtMjhUMTY6MDA6NDkuNDU1In0=
