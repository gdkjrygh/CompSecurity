// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.Pointcut;
import org.aspectj.lang.reflect.PointcutExpression;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            PointcutExpressionImpl

public class PointcutImpl
    implements Pointcut
{

    private final Method baseMethod;
    private final AjType declaringType;
    private final String name;
    private String parameterNames[];
    private final PointcutExpression pc;

    protected PointcutImpl(String s, String s1, Method method, AjType ajtype, String s2)
    {
        parameterNames = new String[0];
        name = s;
        pc = new PointcutExpressionImpl(s1);
        baseMethod = method;
        declaringType = ajtype;
        parameterNames = splitOnComma(s2);
    }

    private String[] splitOnComma(String s)
    {
        s = new StringTokenizer(s, ",");
        String as[] = new String[s.countTokens()];
        for (int i = 0; i < as.length; i++)
        {
            as[i] = s.nextToken().trim();
        }

        return as;
    }

    public AjType getDeclaringType()
    {
        return declaringType;
    }

    public int getModifiers()
    {
        return baseMethod.getModifiers();
    }

    public String getName()
    {
        return name;
    }

    public String[] getParameterNames()
    {
        return parameterNames;
    }

    public AjType[] getParameterTypes()
    {
        Class aclass[] = baseMethod.getParameterTypes();
        AjType aajtype[] = new AjType[aclass.length];
        for (int i = 0; i < aajtype.length; i++)
        {
            aajtype[i] = AjTypeSystem.getAjType(aclass[i]);
        }

        return aajtype;
    }

    public PointcutExpression getPointcutExpression()
    {
        return pc;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(getName());
        stringbuffer.append("(");
        AjType aajtype[] = getParameterTypes();
        for (int i = 0; i < aajtype.length; i++)
        {
            stringbuffer.append(aajtype[i].getName());
            if (parameterNames != null && parameterNames[i] != null)
            {
                stringbuffer.append(" ");
                stringbuffer.append(parameterNames[i]);
            }
            if (i + 1 < aajtype.length)
            {
                stringbuffer.append(",");
            }
        }

        stringbuffer.append(") : ");
        stringbuffer.append(getPointcutExpression().asString());
        return stringbuffer.toString();
    }
}
