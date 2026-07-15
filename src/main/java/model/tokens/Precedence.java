package model.tokens;

public enum Precedence {
    NONE(0),
    OPERATOR_LOR(1),
    OPERATOR_LAND(2),
    OPERATOR_LNOT(3),
    OPERATOR_EQ(4),
    OPERATOR_LE(4),
    OPERATOR_LT(4),
    OPERATOR_GT(4),
    OPERATOR_GE(4),
    OPERATOR_NE(4),
    OPERATOR_ADD(5),
    OPERATOR_SUB(5),
    OPERATOR_MULT(6),
    OPERATOR_DIV(6),
    OPERATOR_MOD(6),
    OPERATOR_NOT(7),
    OPERATOR_NEG(7),
    OPERATOR_PAREN(8);

    private final int p_value;
    Precedence(int prec) {
	   this.p_value = prec;
    }
}

