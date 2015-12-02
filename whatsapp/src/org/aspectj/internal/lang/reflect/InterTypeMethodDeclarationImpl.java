// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.InterTypeMethodDeclaration;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            InterTypeDeclarationImpl

public class InterTypeMethodDeclarationImpl extends InterTypeDeclarationImpl
    implements InterTypeMethodDeclaration
{

    private Method baseMethod;
    private AjType exceptionTypes[];
    private Type genericParameterTypes[];
    private Type genericReturnType;
    private String name;
    private int parameterAdjustmentFactor;
    private AjType parameterTypes[];
    private AjType returnType;

    public InterTypeMethodDeclarationImpl(AjType ajtype, String s, int i, String s1, Method method)
    {
        super(ajtype, s, i);
        parameterAdjustmentFactor = 1;
        name = s1;
        baseMethod = method;
    }

    public InterTypeMethodDeclarationImpl(AjType ajtype, AjType ajtype1, Method method, int i)
    {
        super(ajtype, ajtype1, i);
        parameterAdjustmentFactor = 1;
        parameterAdjustmentFactor = 0;
        name = method.getName();
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
        AjType aajtype[] = new AjType[atype.length - parameterAdjustmentFactor];
        int i = parameterAdjustmentFactor;
        while (i < atype.length) 
        {
            if (atype[i] instanceof Class)
            {
                aajtype[i - parameterAdjustmentFactor] = AjTypeSystem.getAjType((Class)atype[i]);
            } else
            {
                aajtype[i - parameterAdjustmentFactor] = atype[i];
            }
            i++;
        }
        return aajtype;
    }

    public Type getGenericReturnType()
    {
        Type type = baseMethod.getGenericReturnType();
        Object obj = type;
        if (type instanceof Class)
        {
            obj = AjTypeSystem.getAjType((Class)type);
        }
        return ((Type) (obj));
    }

    public String getName()
    {
        return name;
    }

    public AjType[] getParameterTypes()
    {
        Class aclass[] = baseMethod.getParameterTypes();
        AjType aajtype[] = new AjType[aclass.length - parameterAdjustmentFactor];
        for (int i = parameterAdjustmentFactor; i < aclass.length; i++)
        {
            aajtype[i - parameterAdjustmentFactor] = AjTypeSystem.getAjType(aclass[i]);
        }

        return aajtype;
    }

    public AjType getReturnType()
    {
        return AjTypeSystem.getAjType(baseMethod.getReturnType());
    }

    public TypeVariable[] getTypeParameters()
    {
        return baseMethod.getTypeParameters();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(Modifier.toString(getModifiers()));
        stringbuffer.append(" ");
        stringbuffer.append(getReturnType().toString());
        stringbuffer.append(" ");
        stringbuffer.append(targetTypeName);
        stringbuffer.append(".");
        stringbuffer.append(getName());
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
