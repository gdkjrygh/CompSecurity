// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.aspectj.lang.reflect.InitializerSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            CodeSignatureImpl, SignatureImpl, StringMaker

class InitializerSignatureImpl extends CodeSignatureImpl
    implements InitializerSignature
{

    private Constructor constructor;

    InitializerSignatureImpl(int i, Class class1)
    {
        String s;
        if (Modifier.isStatic(i))
        {
            s = "<clinit>";
        } else
        {
            s = "<init>";
        }
        super(i, s, class1, SignatureImpl.EMPTY_CLASS_ARRAY, SignatureImpl.EMPTY_STRING_ARRAY, SignatureImpl.EMPTY_CLASS_ARRAY);
    }

    InitializerSignatureImpl(String s)
    {
        super(s);
    }

    protected String createToString(StringMaker stringmaker)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(stringmaker.makeModifiersString(getModifiers()));
        stringbuffer.append(stringmaker.makePrimaryTypeName(getDeclaringType(), getDeclaringTypeName()));
        stringbuffer.append(".");
        stringbuffer.append(getName());
        return stringbuffer.toString();
    }

    public Constructor getInitializer()
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
        if (Modifier.isStatic(getModifiers()))
        {
            return "<clinit>";
        } else
        {
            return "<init>";
        }
    }
}
