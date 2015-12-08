// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import com.walmartlabs.utils.WLog;

public class PhotoLogger
{

    private static PhotoLogger sInstance;

    public PhotoLogger()
    {
    }

    public static PhotoLogger get()
    {
        com/walmartlabs/android/photo/util/PhotoLogger;
        JVM INSTR monitorenter ;
        PhotoLogger photologger;
        if (sInstance == null)
        {
            sInstance = new PhotoLogger();
        }
        photologger = sInstance;
        com/walmartlabs/android/photo/util/PhotoLogger;
        JVM INSTR monitorexit ;
        return photologger;
        Exception exception;
        exception;
        throw exception;
    }

    public void d(String s, String s1)
    {
        WLog.d(s, s1);
    }

    public void e(String s, String s1)
    {
        WLog.e(s, s1);
    }

    public void i(String s, String s1)
    {
        WLog.i(s, s1);
    }

    public void w(String s, String s1)
    {
        WLog.w(s, s1);
    }
}
