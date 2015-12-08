// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.h;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

public class h
{

    private static final String a = io/wecloud/message/h/h.getSimpleName();
    private static h b;
    private String c;
    private int d;

    private h(Context context)
    {
        c = "unknow";
        context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        d = Process.myPid();
        context = context.iterator();
_L1:
        if (!context.hasNext())
        {
            return;
        }
        try
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            if (runningappprocessinfo.pid == d)
            {
                c = runningappprocessinfo.processName;
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
          goto _L1
    }

    public static h a(Context context)
    {
        io/wecloud/message/h/h;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new h(context);
        }
        context = b;
        io/wecloud/message/h/h;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void a()
    {
        Process.killProcess(Process.myPid());
    }

}
