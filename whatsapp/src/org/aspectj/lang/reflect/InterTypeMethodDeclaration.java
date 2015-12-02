// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package org.aspectj.lang.reflect:
//            InterTypeDeclaration, AjType

public interface InterTypeMethodDeclaration
    extends InterTypeDeclaration
{

    public abstract AjType[] getExceptionTypes();

    public abstract Type[] getGenericParameterTypes();

    public abstract Type getGenericReturnType();

    public abstract String getName();

    public abstract AjType[] getParameterTypes();

    public abstract AjType getReturnType();

    public abstract TypeVariable[] getTypeParameters();
}
