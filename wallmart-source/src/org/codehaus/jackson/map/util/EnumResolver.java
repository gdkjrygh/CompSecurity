// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.util;

import java.util.HashMap;
import org.codehaus.jackson.map.AnnotationIntrospector;

public class EnumResolver
{

    protected final Class _enumClass;
    protected final Enum _enums[];
    protected final HashMap _enumsById;

    protected EnumResolver(Class class1, Enum aenum[], HashMap hashmap)
    {
        _enumClass = class1;
        _enums = aenum;
        _enumsById = hashmap;
    }

    public static EnumResolver constructFor(Class class1, AnnotationIntrospector annotationintrospector)
    {
        Enum aenum[] = (Enum[])class1.getEnumConstants();
        if (aenum == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No enum constants for class ").append(class1.getName()).toString());
        }
        HashMap hashmap = new HashMap();
        int j = aenum.length;
        for (int i = 0; i < j; i++)
        {
            Enum enum = aenum[i];
            hashmap.put(annotationintrospector.findEnumValue(enum), enum);
        }

        return new EnumResolver(class1, aenum, hashmap);
    }

    public static EnumResolver constructUnsafe(Class class1, AnnotationIntrospector annotationintrospector)
    {
        return constructFor(class1, annotationintrospector);
    }

    public static EnumResolver constructUnsafeUsingToString(Class class1)
    {
        return constructUsingToString(class1);
    }

    public static EnumResolver constructUsingToString(Class class1)
    {
        Enum aenum[] = (Enum[])class1.getEnumConstants();
        HashMap hashmap = new HashMap();
        int i = aenum.length;
        do
        {
            i--;
            if (i >= 0)
            {
                Enum enum = aenum[i];
                hashmap.put(enum.toString(), enum);
            } else
            {
                return new EnumResolver(class1, aenum, hashmap);
            }
        } while (true);
    }

    public Enum findEnum(String s)
    {
        return (Enum)_enumsById.get(s);
    }

    public Enum getEnum(int i)
    {
        if (i < 0 || i >= _enums.length)
        {
            return null;
        } else
        {
            return _enums[i];
        }
    }

    public Class getEnumClass()
    {
        return _enumClass;
    }

    public int lastValidIndex()
    {
        return _enums.length - 1;
    }
}
