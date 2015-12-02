// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.InterTypeConstructorDeclaration;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            InterTypeDeclarationImpl

public class InterTypeConstructorDeclarationImpl extends InterTypeDeclarationImpl
    implements InterTypeConstructorDeclaration
{

    private Method baseMethod;

    public InterTypeConstructorDeclarationImpl(AjType ajtype, String s, int i, Method method)
    {
        super(ajtype, s, i);
        baseMethod = method;
    }

    public AjType[] getExceptionTypes()
    {
        Class aclass[] = baseMethod.getExceptionTypes();
        AjType aajtype[] = new AjType[aclass.length];
        for (int i = 0; i < aclass.length; i++)
        {
            aajtype[i] = AjTypeSystem.getAjType(aclass[i]);
        }

        return aajtype;
    }

    public Type[] getGenericParameterTypes()
    {
        Type atype[] = baseMethod.getGenericParameterTypes();
        AjType aajtype[] = new AjType[atype.length - 1];
        int i = 1;
        while (i < atype.length) 
        {
            if (atype[i] instanceof Class)
            {
                aajtype[i - 1] = AjTypeSystem.getAjType((Class)atype[i]);
            } else
            {
                aajtype[i - 1] = atype[i];
            }
            i++;
        }
        return aajtype;
    }

    public AjType[] getParameterTypes()
    {
        Class aclass[] = baseMethod.getParameterTypes();
        AjType aajtype[] = new AjType[aclass.length - 1];
        for (int i = 1; i < aclass.length; i++)
        {
            aajtype[i - 1] = AjTypeSystem.getAjType(aclass[i]);
        }

        return aajtype;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(Modifier.toString(getModifiers()));
        stringbuffer.append(" ");
        stringbuffer.append(targetTypeName);
        stringbuffer.append(".new");
        stringbuffer.append("(");
        AjType aajtype[] = getParameterTypes();
        for (int i = 0; i < aajtype.length - 1; i++)
        {
            stringbuffer.append(aajtype[i].toString());
            stringbuffer.append(", ");
        }

        if (aajtype.length > 0)
        {
            stringbuffer.append(aajtype[aajtype.length - 1].toString());
        }
        stringbuffer.append(")");
        return stringbuffer.toString();
    }
}
