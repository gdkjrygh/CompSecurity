// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.DeclareSoft;
import org.aspectj.lang.reflect.PointcutExpression;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            PointcutExpressionImpl

public class DeclareSoftImpl
    implements DeclareSoft
{

    private AjType declaringType;
    private AjType exceptionType;
    private String missingTypeName;
    private PointcutExpression pointcut;

    public DeclareSoftImpl(AjType ajtype, String s, String s1)
    {
        declaringType = ajtype;
        pointcut = new PointcutExpressionImpl(s);
        try
        {
            exceptionType = AjTypeSystem.getAjType(Class.forName(s1, false, ajtype.getJavaClass().getClassLoader()));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AjType ajtype)
        {
            missingTypeName = s1;
        }
    }

    public AjType getDeclaringType()
    {
        return declaringType;
    }

    public PointcutExpression getPointcutExpression()
    {
        return pointcut;
    }

    public AjType getSoftenedExceptionType()
        throws ClassNotFoundException
    {
        if (missingTypeName != null)
        {
            throw new ClassNotFoundException(missingTypeName);
        } else
        {
            return exceptionType;
        }
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("declare soft : ");
        if (missingTypeName != null)
        {
            stringbuffer.append(exceptionType.getName());
        } else
        {
            stringbuffer.append(missingTypeName);
        }
        stringbuffer.append(" : ");
        stringbuffer.append(getPointcutExpression().asString());
        return stringbuffer.toString();
    }
}
