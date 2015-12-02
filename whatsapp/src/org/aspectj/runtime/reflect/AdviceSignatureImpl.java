// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Method;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AdviceSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            CodeSignatureImpl, StringMaker, SignatureImpl

class AdviceSignatureImpl extends CodeSignatureImpl
    implements AdviceSignature
{

    private Method adviceMethod;
    Class returnType;

    AdviceSignatureImpl(int i, String s, Class class1, Class aclass[], String as[], Class aclass1[], Class class2)
    {
        super(i, s, class1, aclass, as, aclass1);
        adviceMethod = null;
        returnType = class2;
    }

    AdviceSignatureImpl(String s)
    {
        super(s);
        adviceMethod = null;
    }

    private String toAdviceName(String s)
    {
        if (s.indexOf('$') != -1) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        String s1;
        StringTokenizer stringtokenizer = new StringTokenizer(s, "$");
        do
        {
            if (!stringtokenizer.hasMoreTokens())
            {
                continue; /* Loop/switch isn't completed */
            }
            s1 = stringtokenizer.nextToken();
        } while (!s1.startsWith("before") && !s1.startsWith("after") && !s1.startsWith("around"));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return s1;
    }

    protected String createToString(StringMaker stringmaker)
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (stringmaker.includeArgs)
        {
            stringbuffer.append(stringmaker.makeTypeName(getReturnType()));
        }
        if (stringmaker.includeArgs)
        {
            stringbuffer.append(" ");
        }
        stringbuffer.append(stringmaker.makePrimaryTypeName(getDeclaringType(), getDeclaringTypeName()));
        stringbuffer.append(".");
        stringbuffer.append(toAdviceName(getName()));
        stringmaker.addSignature(stringbuffer, getParameterTypes());
        stringmaker.addThrows(stringbuffer, getExceptionTypes());
        return stringbuffer.toString();
    }

    public Method getAdvice()
    {
        if (adviceMethod == null)
        {
            try
            {
                adviceMethod = getDeclaringType().getDeclaredMethod(getName(), getParameterTypes());
            }
            catch (Exception exception) { }
        }
        return adviceMethod;
    }

    public Class getReturnType()
    {
        if (returnType == null)
        {
            returnType = extractType(6);
        }
        return returnType;
    }
}
