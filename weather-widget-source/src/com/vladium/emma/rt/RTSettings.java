// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma.rt;


public abstract class RTSettings
{

    private static boolean s_not_standalone;

    private RTSettings()
    {
    }

    public static boolean isStandaloneMode()
    {
        com/vladium/emma/rt/RTSettings;
        JVM INSTR monitorenter ;
        boolean flag = s_not_standalone;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com/vladium/emma/rt/RTSettings;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static void setStandaloneMode(boolean flag)
    {
        com/vladium/emma/rt/RTSettings;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s_not_standalone = flag;
        com/vladium/emma/rt/RTSettings;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
