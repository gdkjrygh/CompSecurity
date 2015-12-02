// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.InterTypeFieldDeclaration;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            InterTypeDeclarationImpl

public class InterTypeFieldDeclarationImpl extends InterTypeDeclarationImpl
    implements InterTypeFieldDeclaration
{

    private Type genericType;
    private String name;
    private AjType type;

    public InterTypeFieldDeclarationImpl(AjType ajtype, String s, int i, String s1, AjType ajtype1, Type type1)
    {
        super(ajtype, s, i);
        name = s1;
        type = ajtype1;
        genericType = type1;
    }

    public InterTypeFieldDeclarationImpl(AjType ajtype, AjType ajtype1, Field field)
    {
        super(ajtype, ajtype1, field.getModifiers());
        name = field.getName();
        type = AjTypeSystem.getAjType(field.getType());
        ajtype = field.getGenericType();
        if (ajtype instanceof Class)
        {
            genericType = AjTypeSystem.getAjType((Class)ajtype);
            return;
        } else
        {
            genericType = ajtype;
            return;
        }
    }

    public Type getGenericType()
    {
        return genericType;
    }

    public String getName()
    {
        return name;
    }

    public AjType getType()
    {
        return type;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(Modifier.toString(getModifiers()));
        stringbuffer.append(" ");
        stringbuffer.append(getType().toString());
        stringbuffer.append(" ");
        stringbuffer.append(targetTypeName);
        stringbuffer.append(".");
        stringbuffer.append(getName());
        return stringbuffer.toString();
    }
}
