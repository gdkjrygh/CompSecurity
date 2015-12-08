// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            GLDigitalClock

class k extends Handler
{

    final GLDigitalClock a;

    k(GLDigitalClock gldigitalclock)
    {
        a = gldigitalclock;
        super();
    }

    public void handleMessage(Message message)
    {
        GLDigitalClock.access$002(a, false);
        a.invalidate();
    }
}
