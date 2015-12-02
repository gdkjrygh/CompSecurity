// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PointcutExpression;

public class PointcutExpressionImpl
    implements PointcutExpression
{

    private String expression;

    public PointcutExpressionImpl(String s)
    {
        expression = s;
    }

    public String asString()
    {
        return expression;
    }

    public String toString()
    {
        return asString();
    }
}
