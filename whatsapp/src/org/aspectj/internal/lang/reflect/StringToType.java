// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AjTypeSystem;

public class StringToType
{

    public StringToType()
    {
    }

    public static Type[] commaSeparatedListToTypeArray(String s, Class class1)
        throws ClassNotFoundException
    {
        s = new StringTokenizer(s, ",");
        Type atype[] = new Type[s.countTokens()];
        for (int i = 0; s.hasMoreTokens(); i++)
        {
            atype[i] = stringToType(s.nextToken().trim(), class1);
        }

        return atype;
    }

    private static Type makeParameterizedType(String s, Class class1)
        throws ClassNotFoundException
    {
        int i = s.indexOf('<');
        Class class2 = Class.forName(s.substring(0, i), false, class1.getClassLoader());
        return new ParameterizedType(commaSeparatedListToTypeArray(s.substring(i + 1, s.lastIndexOf('>')), class1), class2) {

            final Class val$baseClass;
            final Type val$typeParams[];

            public Type[] getActualTypeArguments()
            {
                return typeParams;
            }

            public Type getOwnerType()
            {
                return baseClass.getEnclosingClass();
            }

            public Type getRawType()
            {
                return baseClass;
            }

            
            {
                typeParams = atype;
                baseClass = class1;
                super();
            }
        };
    }

    public static Type stringToType(String s, Class class1)
        throws ClassNotFoundException
    {
        Type type;
        try
        {
            if (s.indexOf("<") == -1)
            {
                return AjTypeSystem.getAjType(Class.forName(s, false, class1.getClassLoader()));
            }
            type = makeParameterizedType(s, class1);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            class1 = class1.getTypeParameters();
            for (int i = 0; i < class1.length; i++)
            {
                if (class1[i].getName().equals(s))
                {
                    return class1[i];
                }
            }

            throw new ClassNotFoundException(s);
        }
        return type;
    }
}
