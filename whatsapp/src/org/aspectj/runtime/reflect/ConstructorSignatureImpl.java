// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import org.aspectj.lang.reflect.ConstructorSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            CodeSignatureImpl, SignatureImpl, StringMaker

class ConstructorSignatureImpl extends CodeSignatureImpl
    implements ConstructorSignature
{

    private Constructor constructor;

    ConstructorSignatureImpl(int i, Class class1, Class aclass[], String as[], Class aclass1[])
    {
        super(i, "<init>", class1, aclass, as, aclass1);
    }

    ConstructorSignatureImpl(String s)
    {
        super(s);
    }

    protected String createToString(StringMaker stringmaker)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(stringmaker.makeModifiersString(getModifiers()));
        stringbuffer.append(stringmaker.makePrimaryTypeName(getDeclaringType(), getDeclaringTypeName()));
        stringmaker.addSignature(stringbuffer, getParameterTypes());
        stringmaker.addThrows(stringbuffer, getExceptionTypes());
        return stringbuffer.toString();
    }

    public Constructor getConstructor()
    {
        if (constructor == null)
        {
            try
            {
                constructor = getDeclaringType().getDeclaredConstructor(getParameterTypes());
            }
            catch (Exception exception) { }
        }
        return constructor;
    }

    public String getName()
    {
        return "<init>";
    }
}
