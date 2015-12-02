// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;

import java.lang.reflect.Type;

// Referenced classes of package org.aspectj.lang.reflect:
//            AjType, AdviceKind, PointcutExpression

public interface Advice
{

    public abstract AjType getDeclaringType();

    public abstract AjType[] getExceptionTypes();

    public abstract Type[] getGenericParameterTypes();

    public abstract AdviceKind getKind();

    public abstract String getName();

    public abstract AjType[] getParameterTypes();

    public abstract PointcutExpression getPointcutExpression();
}
