package com.kgprojects.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.kgprojects.beans.ExpressionLanguage;

public class SpelCall
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spel.xml");
		ExpressionLanguage el = context.getBean("expressionLanguage",ExpressionLanguage.class);
		System.out.println(el);
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("2+10");
		System.out.println("Expression : "+exp.getValue());
	}

}
