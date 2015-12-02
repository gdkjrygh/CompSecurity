// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.CatchClauseSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            SignatureImpl, StringMaker

class CatchClauseSignatureImpl extends SignatureImpl
    implements CatchClauseSignature
{

    String parameterName;
    Class parameterType;

    CatchClauseSignatureImpl(Class class1, Class class2, String s)
    {
        super(0, "catch", class1);
        parameterType = class2;
        parameterName = s;
    }

    CatchClauseSignatureImpl(String s)
    {
        super(s);
    }

    protected String createToString(StringMaker stringmaker)
    {
        return "catch(" + stringmaker.makeTypeName(getParameterType()) + ")";
    }

    public String getParameterName()
    {
        if (parameterName == null)
        {
            parameterName = extractString(4);
        }
        return parameterName;
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
