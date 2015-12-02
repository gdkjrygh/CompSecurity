// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.app.Activity;
import com.whatsapp.App;
import com.whatsapp.ak8;
import com.whatsapp.akr;
import com.whatsapp.dx;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class y extends ak8
{

    final PopupNotification w;

    y(PopupNotification popupnotification, Activity activity, dx dx)
    {
        w = popupnotification;
        super(activity, dx);
    }

    public void b()
    {
        akr.t();
        super.b();
    }

    public void b(boolean flag)
    {
        super.b(flag);
        App.a(PopupNotification.q(w), false, true);
    }

    public void c()
    {
        PopupNotification.s(w);
    }
}
