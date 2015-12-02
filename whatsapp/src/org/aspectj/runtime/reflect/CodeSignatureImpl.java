// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.CodeSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            MemberSignatureImpl, SignatureImpl

abstract class CodeSignatureImpl extends MemberSignatureImpl
    implements CodeSignature
{

    Class exceptionTypes[];
    String parameterNames[];
    Class parameterTypes[];

    CodeSignatureImpl(int i, String s, Class class1, Class aclass[], String as[], Class aclass1[])
    {
        super(i, s, class1);
        parameterTypes = aclass;
        parameterNames = as;
        exceptionTypes = aclass1;
    }

    CodeSignatureImpl(String s)
    {
        super(s);
    }

    public Class[] getExceptionTypes()
    {
        if (exceptionTypes == null)
        {
            exceptionTypes = extractTypes(5);
        }
        return exceptionTypes;
    }

    public String[] getParameterNames()
    {
        if (parameterNames == null)
        {
            parameterNames = extractStrings(4);
        }
        return parameterNames;
    }

    public Class[] getParameterTypes()
    {
        if (parameterTypes == null)
        {
            parameterTypes = extractTypes(3);
        }
        return parameterTypes;
    }
}
