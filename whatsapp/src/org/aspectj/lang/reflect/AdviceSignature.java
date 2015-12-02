// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;

import java.lang.reflect.Method;

// Referenced classes of package org.aspectj.lang.reflect:
//            CodeSignature

public interface AdviceSignature
    extends CodeSignature
{

    public abstract Method getAdvice();

    public abstract Class getReturnType();
}
