// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.TimerTask;

// Referenced classes of package com.whatsapp:
//            wc

public class auc extends TimerTask
{

    wc a;

    public auc(wc wc1)
    {
        a = wc1;
    }

    public void run()
    {
        if (wc.a(a))
        {
            return;
        } else
        {
            wc.b(a);
            return;
        }
    }
}
