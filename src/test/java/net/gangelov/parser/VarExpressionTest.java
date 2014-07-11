package net.gangelov.parser;

import org.junit.Test;

public class VarExpressionTest {
    @Test
    public void testConstantID() throws Exception {
        XParserTest.testExpression("Global", "(expression (varExpression Global))");
    }

    @Test
    public void testVarID() throws Exception {
        XParserTest.testExpression("num", "(expression (varExpression num))");
    }
}