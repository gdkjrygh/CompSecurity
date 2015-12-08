// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class ef
    implements SafeParcelable
{

    private static final Object tc = new Object();
    private static ClassLoader td = null;
    private static Integer te = null;
    private boolean tf;

    public ef()
    {
        tf = false;
    }

    protected static boolean W(String s)
    {
        ClassLoader classloader = bQ();
        if (classloader == null)
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = a(classloader.loadClass(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    private static boolean a(Class class1)
    {
        boolean flag;
        try
        {
            flag = "SAFE_PARCELABLE_NULL_STRING".equals(class1.getField("NULL").get(null));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return false;
        }
        return flag;
    }

    protected static ClassLoader bQ()
    {
        ClassLoader classloader;
        synchronized (tc)
        {
            classloader = td;
        }
        return classloader;
    }

    protected static Integer bR()
    {
        Integer integer;
        synchronized (tc)
        {
            integer = te;
        }
        return integer;
    }

    protected boolean bS()
    {
        return tf;
    }

}
