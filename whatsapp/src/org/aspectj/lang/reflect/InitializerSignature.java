// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;

import java.lang.reflect.Constructor;

// Referenced classes of package org.aspectj.lang.reflect:
//            CodeSignature

public interface InitializerSignature
    extends CodeSignature
{

    public abstract Constructor getInitializer();
}
