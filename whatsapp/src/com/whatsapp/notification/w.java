// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;

// Referenced classes of package com.whatsapp.notification:
//            a1

class w
    implements Runnable
{

    final a1 a;

    w(a1 a1)
    {
        a = a1;
        super();
    }

    public void run()
    {
        NotificationManagerCompat.from(App.au).cancel(1);
    }
}
