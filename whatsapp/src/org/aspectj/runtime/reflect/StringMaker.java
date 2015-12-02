// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;

class StringMaker
{

    static StringMaker longStringMaker;
    static StringMaker middleStringMaker;
    static StringMaker shortStringMaker;
    int cacheOffset;
    boolean includeArgs;
    boolean includeEnclosingPoint;
    boolean includeJoinPointTypeName;
    boolean includeModifiers;
    boolean includeThrows;
    boolean shortKindName;
    boolean shortPrimaryTypeNames;
    boolean shortTypeNames;

    StringMaker()
    {
        shortTypeNames = true;
        includeArgs = true;
        includeThrows = false;
        includeModifiers = false;
        shortPrimaryTypeNames = false;
        includeJoinPointTypeName = true;
        includeEnclosingPoint = true;
        shortKindName = true;
    }

    public void addSignature(StringBuffer stringbuffer, Class aclass[])
    {
        if (aclass == null)
        {
            return;
        }
        if (!includeArgs)
        {
            if (aclass.length == 0)
            {
                stringbuffer.append("()");
                return;
            } else
            {
                stringbuffer.append("(..)");
                return;
            }
        } else
        {
            stringbuffer.append("(");
            addTypeNames(stringbuffer, aclass);
            stringbuffer.append(")");
            return;
        }
    }

    public void addThrows(StringBuffer stringbuffer, Class aclass[])
    {
        if (!includeThrows || aclass == null || aclass.length == 0)
        {
            return;
        } else
        {
            stringbuffer.append(" throws ");
            addTypeNames(stringbuffer, aclass);
            return;
        }
    }

    public void addTypeNames(StringBuffer stringbuffer, Class aclass[])
    {
        for (int i = 0; i < aclass.length; i++)
        {
            if (i > 0)
            {
                stringbuffer.append(", ");
            }
            stringbuffer.append(makeTypeName(aclass[i]));
        }

    }

    String makeKindName(String s)
    {
        int i = s.lastIndexOf('-');
        if (i == -1)
        {
            return s;
        } else
        {
            return s.substring(i + 1);
        }
    }

    String makeModifiersString(int i)
    {
        if (!includeModifiers)
        {
            return "";
        }
        String s = Modifier.toString(i);
        if (s.length() == 0)
        {
            return "";
        } else
        {
            return s + " ";
        }
    }

    public String makePrimaryTypeName(Class class1, String s)
    {
        return makeTypeName(class1, s, shortPrimaryTypeNames);
    }

    public String makeTypeName(Class class1)
    {
        return makeTypeName(class1, class1.getName(), shortTypeNames);
    }

    String makeTypeName(Class class1, String s, boolean flag)
    {
        if (class1 == null)
        {
            return "ANONYMOUS";
        }
        if (class1.isArray())
        {
            class1 = class1.getComponentType();
            return makeTypeName(class1, class1.getName(), flag) + "[]";
        }
        if (flag)
        {
            return stripPackageName(s).replace('$', '.');
        } else
        {
            return s.replace('$', '.');
        }
    }

    String stripPackageName(String s)
    {
        int i = s.lastIndexOf('.');
        if (i == -1)
        {
            return s;
        } else
        {
            return s.substring(i + 1);
        }
    }

    static 
    {
        shortStringMaker = new StringMaker();
        shortStringMaker.shortTypeNames = true;
        shortStringMaker.includeArgs = false;
        shortStringMaker.includeThrows = false;
        shortStringMaker.includeModifiers = false;
        shortStringMaker.shortPrimaryTypeNames = true;
        shortStringMaker.includeJoinPointTypeName = false;
        shortStringMaker.includeEnclosingPoint = false;
        shortStringMaker.cacheOffset = 0;
        middleStringMaker = new StringMaker();
        middleStringMaker.shortTypeNames = true;
        middleStringMaker.includeArgs = true;
        middleStringMaker.includeThrows = false;
        middleStringMaker.includeModifiers = false;
        middleStringMaker.shortPrimaryTypeNames = false;
        shortStringMaker.cacheOffset = 1;
        longStringMaker = new StringMaker();
        longStringMaker.shortTypeNames = false;
        longStringMaker.includeArgs = true;
        longStringMaker.includeThrows = false;
        longStringMaker.includeModifiers = true;
        longStringMaker.shortPrimaryTypeNames = false;
        longStringMaker.shortKindName = false;
        longStringMaker.cacheOffset = 2;
    }
}
