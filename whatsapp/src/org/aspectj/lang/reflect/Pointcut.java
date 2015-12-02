// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;


// Referenced classes of package org.aspectj.lang.reflect:
//            AjType, PointcutExpression

public interface Pointcut
{

    public abstract AjType getDeclaringType();

    public abstract int getModifiers();

    public abstract String getName();

    public abstract String[] getParameterNames();

    public abstract AjType[] getParameterTypes();

    public abstract PointcutExpression getPointcutExpression();
}
