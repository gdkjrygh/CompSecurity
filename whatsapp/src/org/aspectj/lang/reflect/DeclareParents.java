// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;

import java.lang.reflect.Type;

// Referenced classes of package org.aspectj.lang.reflect:
//            AjType, TypePattern

public interface DeclareParents
{

    public abstract AjType getDeclaringType();

    public abstract Type[] getParentTypes()
        throws ClassNotFoundException;

    public abstract TypePattern getTargetTypesPattern();

    public abstract boolean isExtends();

    public abstract boolean isImplements();
}
