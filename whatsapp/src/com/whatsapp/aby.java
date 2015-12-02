// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Process;

// Referenced classes of package com.whatsapp:
//            cw

final class aby extends Thread
{

    private aby()
    {
    }

    aby(cw cw)
    {
        this();
    }

    public void run()
    {
        try
        {
            Thread.sleep(2000L);
        }
        catch (InterruptedException interruptedexception) { }
        Process.killProcess(Process.myPid());
    }
}
