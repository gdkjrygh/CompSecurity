// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;


// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class x
    implements Runnable
{

    final PopupNotification a;

    x(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void run()
    {
        if (PopupNotification.m(a) != null && PopupNotification.m(a).isHeld())
        {
            PopupNotification.m(a).release();
        }
    }
}
