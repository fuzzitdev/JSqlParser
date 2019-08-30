/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.parser;
import edu.berkeley.cs.jqf.fuzz.Fuzz;
import edu.berkeley.cs.jqf.fuzz.JQF;
import net.sf.jsqlparser.JSQLParserException;
import org.junit.runner.RunWith;

@RunWith(JQF.class)
public class CCJSqlParserFuzz {
    @Fuzz
    public void testParseExpression(String expression) {
        try {
            CCJSqlParserUtil.parse(expression);
        } catch (Exception JSQLParserException) {
            // ignore exception
        }
    }
}

