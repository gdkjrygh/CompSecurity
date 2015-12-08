// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.CharMatcher;

// Referenced classes of package com.google.common.reflect:
//            ClassPath, Reflection

public static final class me extends fo
{

    private final String className;

    public String getName()
    {
        return className;
    }

    public String getPackageName()
    {
        return Reflection.getPackageName(className);
    }

    public String getSimpleName()
    {
        int i = className.lastIndexOf('$');
        if (i != -1)
        {
            String s = className.substring(i + 1);
            return CharMatcher.DIGIT.trimLeadingFrom(s);
        }
        String s1 = getPackageName();
        if (s1.isEmpty())
        {
            return className;
        } else
        {
            return className.substring(s1.length() + 1);
        }
    }

    public Class load()
    {
        Class class1;
        try
        {
            class1 = loader.loadClass(className);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new IllegalStateException(classnotfoundexception);
        }
        return class1;
    }

    public String toString()
    {
        return className;
    }


    fo(String s, ClassLoader classloader)
    {
        super(s, classloader);
        className = ClassPath.getClassName(s);
    }
}
