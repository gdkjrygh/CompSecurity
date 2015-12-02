// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.view.View;
import com.whatsapp.akr;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class ao
    implements android.view.View.OnClickListener
{

    final PopupNotification a;
    final akr b;

    ao(PopupNotification popupnotification, akr akr1)
    {
        a = popupnotification;
        b = akr1;
        super();
    }

    public void onClick(View view)
    {
        b.a();
    }
}
