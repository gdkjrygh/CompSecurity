// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.jiubang.goweather.c:
//            p

class r
    implements Runnable
{

    final p a;

    r(p p1)
    {
        a = p1;
        super();
    }

    public void run()
    {
        Message message = new Message();
        message.what = 2;
        message.obj = Integer.valueOf(p.c(a));
        p.d(a).sendMessage(message);
        p.d(a).removeCallbacks(this);
    }
}
