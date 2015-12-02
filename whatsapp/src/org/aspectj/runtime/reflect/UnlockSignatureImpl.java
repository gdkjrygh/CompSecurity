// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.UnlockSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            SignatureImpl, StringMaker

class UnlockSignatureImpl extends SignatureImpl
    implements UnlockSignature
{

    private Class parameterType;

    UnlockSignatureImpl(Class class1)
    {
        super(8, "unlock", class1);
        parameterType = class1;
    }

    UnlockSignatureImpl(String s)
    {
        super(s);
    }

    protected String createToString(StringMaker stringmaker)
    {
        if (parameterType == null)
        {
            parameterType = extractType(3);
        }
        return "unlock(" + stringmaker.makeTypeName(parameterType) + ")";
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
