// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.SourceLocation;

class SourceLocationImpl
    implements SourceLocation
{

    String fileName;
    int line;
    Class withinType;

    SourceLocationImpl(Class class1, String s, int i)
    {
        withinType = class1;
        fileName = s;
        line = i;
    }

    public int getColumn()
    {
        return -1;
    }

    public String getFileName()
    {
        return fileName;
    }

    public int getLine()
    {
        return line;
    }

    public Class getWithinType()
    {
        return withinType;
    }

    public String toString()
    {
        return getFileName() + ":" + getLine();
    }
}
