// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.os.Handler;
import android.os.Looper;
import java.util.TimerTask;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            f, d

class e extends TimerTask
{

    final d a;

    e(d d)
    {
        a = d;
        super();
    }

    public void run()
    {
        (new Handler(Looper.getMainLooper())).post(new f(this));
    }
}
