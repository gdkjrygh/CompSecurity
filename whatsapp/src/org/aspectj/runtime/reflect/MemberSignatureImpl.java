// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.MemberSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            SignatureImpl

abstract class MemberSignatureImpl extends SignatureImpl
    implements MemberSignature
{

    MemberSignatureImpl(int i, String s, Class class1)
    {
        super(i, s, class1);
    }

    public MemberSignatureImpl(String s)
    {
        super(s);
    }
}
