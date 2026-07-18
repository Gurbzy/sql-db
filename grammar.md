### Grammars

Writing this so I can map out the grammars of different statements. Starting with SELECT,
 CREATE, INSERT. No Joins, or any other complicated logic.


```SQL
CREATE ::=
SELECT ::= "SELECT" ( "*" | COLUMN_STATEMENT ) (";" | "WHERE" Expr ";")
```