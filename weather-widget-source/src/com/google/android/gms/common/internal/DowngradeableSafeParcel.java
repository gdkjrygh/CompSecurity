// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class DowngradeableSafeParcel
    implements SafeParcelable
{

    private static final Object zzadj = new Object();
    private static ClassLoader zzadk = null;
    private static Integer zzadl = null;
    private boolean zzadm;

    public DowngradeableSafeParcel()
    {
        zzadm = false;
    }

    private static boolean zza(Class class1)
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

    protected static boolean zzcj(String s)
    {
        ClassLoader classloader = zzoq();
        if (classloader == null)
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = zza(classloader.loadClass(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    protected static ClassLoader zzoq()
    {
        ClassLoader classloader;
        synchronized (zzadj)
        {
            classloader = zzadk;
        }
        return classloader;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected static Integer zzor()
    {
        Integer integer;
        synchronized (zzadj)
        {
            integer = zzadl;
        }
        return integer;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected boolean zzos()
    {
        return zzadm;
    }

}
