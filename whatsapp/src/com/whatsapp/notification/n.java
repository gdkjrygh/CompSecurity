// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;

// Referenced classes of package com.whatsapp.notification:
//            a1

class n
    implements Runnable
{

    final String a;
    final a1 b;

    n(a1 a1, String s)
    {
        b = a1;
        a = s;
        super();
    }

    public void run()
    {
        NotificationManagerCompat.from(App.au).cancel(a, 1);
    }
}
