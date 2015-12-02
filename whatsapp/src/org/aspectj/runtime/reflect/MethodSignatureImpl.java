// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import org.aspectj.lang.reflect.MethodSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            CodeSignatureImpl, SignatureImpl, StringMaker

class MethodSignatureImpl extends CodeSignatureImpl
    implements MethodSignature
{

    private Method method;
    Class returnType;

    MethodSignatureImpl(int i, String s, Class class1, Class aclass[], String as[], Class aclass1[], Class class2)
    {
        super(i, s, class1, aclass, as, aclass1);
        returnType = class2;
    }

    MethodSignatureImpl(String s)
    {
        super(s);
    }

    private Method search(Class class1, String s, Class aclass[], Set set)
    {
        if (class1 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Method) (obj));
_L2:
        if (set.contains(class1))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        set.add(class1);
        obj = class1.getDeclaredMethod(s, aclass);
        return ((Method) (obj));
        obj;
        Method method1 = search(class1.getSuperclass(), s, aclass, set);
        obj = method1;
        if (method1 == null)
        {
label0:
            {
                Class aclass1[] = class1.getInterfaces();
                if (aclass1 == null)
                {
                    break label0;
                }
                int i = 0;
                do
                {
                    if (i >= aclass1.length)
                    {
                        break label0;
                    }
                    class1 = search(aclass1[i], s, aclass, set);
                    obj = class1;
                    if (class1 != null)
                    {
                        break;
                    }
                    i++;
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    protected String createToString(StringMaker stringmaker)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(stringmaker.makeModifiersString(getModifiers()));
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
        stringbuffer.append(getName());
        stringmaker.addSignature(stringbuffer, getParameterTypes());
        stringmaker.addThrows(stringbuffer, getExceptionTypes());
        return stringbuffer.toString();
    }

    public Method getMethod()
    {
        if (method == null)
        {
            Class class1 = getDeclaringType();
            try
            {
                method = class1.getDeclaredMethod(getName(), getParameterTypes());
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                HashSet hashset = new HashSet();
                hashset.add(class1);
                method = search(class1, getName(), getParameterTypes(), hashset);
            }
        }
        return method;
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
