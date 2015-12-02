// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import java.util.TimerTask;

// Referenced classes of package com.whatsapp:
//            App, ux, p5

class abw extends TimerTask
{

    final p5 a;

    abw(p5 p5)
    {
        a = p5;
        super();
    }

    public void run()
    {
        App.au.ab().post(new ux(this));
    }
}
