// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclarePrecedence;
import org.aspectj.lang.reflect.TypePattern;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            TypePatternImpl

public class DeclarePrecedenceImpl
    implements DeclarePrecedence
{

    private AjType declaringType;
    private TypePattern precedenceList[];
    private String precedenceString;

    public DeclarePrecedenceImpl(String s, AjType ajtype)
    {
        declaringType = ajtype;
        precedenceString = s;
        ajtype = s;
        if (s.startsWith("("))
        {
            ajtype = s.substring(1, s.length() - 1);
        }
        s = new StringTokenizer(ajtype, ",");
        precedenceList = new TypePattern[s.countTokens()];
        for (int i = 0; i < precedenceList.length; i++)
        {
            precedenceList[i] = new TypePatternImpl(s.nextToken().trim());
        }

    }

    public AjType getDeclaringType()
    {
        return declaringType;
    }

    public TypePattern[] getPrecedenceOrder()
    {
        return precedenceList;
    }

    public String toString()
    {
        return (new StringBuilder()).append("declare precedence : ").append(precedenceString).toString();
    }
}
