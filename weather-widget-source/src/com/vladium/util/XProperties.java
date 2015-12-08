// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class XProperties extends Properties
{

    public XProperties()
    {
    }

    public XProperties(Properties properties)
    {
        super(properties);
    }

    public void list(PrintStream printstream)
    {
        Object obj = new TreeSet();
        for (Enumeration enumeration = propertyNames(); enumeration.hasMoreElements(); ((Set) (obj)).add(enumeration.nextElement())) { }
        String s;
        String s1;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); printstream.println((new StringBuilder()).append(s).append(":\t[").append(s1).append("]").toString()))
        {
            s = (String)((Iterator) (obj)).next();
            s1 = getProperty(s);
        }

    }

    public void list(PrintWriter printwriter)
    {
        Object obj = new TreeSet();
        for (Enumeration enumeration = propertyNames(); enumeration.hasMoreElements(); ((Set) (obj)).add(enumeration.nextElement())) { }
        String s;
        String s1;
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); printwriter.println((new StringBuilder()).append(s).append(":\t[").append(s1).append("]").toString()))
        {
            s = (String)((Iterator) (obj)).next();
            s1 = getProperty(s);
        }

    }
}
