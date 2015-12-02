// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.LockSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            SignatureImpl, StringMaker

class LockSignatureImpl extends SignatureImpl
    implements LockSignature
{

    private Class parameterType;

    LockSignatureImpl(Class class1)
    {
        super(8, "lock", class1);
        parameterType = class1;
    }

    LockSignatureImpl(String s)
    {
        super(s);
    }

    protected String createToString(StringMaker stringmaker)
    {
        if (parameterType == null)
        {
            parameterType = extractType(3);
        }
        return "lock(" + stringmaker.makeTypeName(parameterType) + ")";
    }

    public Class getParameterType()
    {
        if (parameterType == null)
        {
            parameterType = extractType(3);
        }
        return parameterType;
    }
}
