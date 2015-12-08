// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            Base

class a extends Handler
{

    final Base a;

    a(Base base)
    {
        a = base;
        super();
    }

    public void handleMessage(Message message)
    {
        this;
        JVM INSTR monitorenter ;
        Base.access$002(a, true);
        if (!Base.access$100(a))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        Base.access$200(a);
_L2:
        Base.access$002(a, false);
        this;
        JVM INSTR monitorexit ;
        return;
        Base.access$300(a);
        if (true) goto _L2; else goto _L1
_L1:
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
    }
}
