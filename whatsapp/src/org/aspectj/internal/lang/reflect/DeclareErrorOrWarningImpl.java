// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareErrorOrWarning;
import org.aspectj.lang.reflect.PointcutExpression;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            PointcutExpressionImpl

public class DeclareErrorOrWarningImpl
    implements DeclareErrorOrWarning
{

    private AjType declaringType;
    private boolean isError;
    private String msg;
    private PointcutExpression pc;

    public DeclareErrorOrWarningImpl(String s, String s1, boolean flag, AjType ajtype)
    {
        pc = new PointcutExpressionImpl(s);
        msg = s1;
        isError = flag;
        declaringType = ajtype;
    }

    public AjType getDeclaringType()
    {
        return declaringType;
    }

    public String getMessage()
    {
        return msg;
    }

    public PointcutExpression getPointcutExpression()
    {
        return pc;
    }

    public boolean isError()
    {
        return isError;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("declare ");
        String s;
        if (isError())
        {
            s = "error : ";
        } else
        {
            s = "warning : ";
        }
        stringbuffer.append(s);
        stringbuffer.append(getPointcutExpression().asString());
        stringbuffer.append(" : ");
        stringbuffer.append("\"");
        stringbuffer.append(getMessage());
        stringbuffer.append("\"");
        return stringbuffer.toString();
    }
}
