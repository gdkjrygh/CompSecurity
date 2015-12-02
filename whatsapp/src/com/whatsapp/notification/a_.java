// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.view.View;
import com.whatsapp.App;
import com.whatsapp.og;
import com.whatsapp.protocol.c4;
import java.util.HashSet;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class a_
    implements android.view.View.OnClickListener
{

    final PopupNotification a;

    a_(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void onClick(View view)
    {
        App.aP();
        if (PopupNotification.d(a) != null)
        {
            PopupNotification.k(a).add(PopupNotification.d(a).y);
        }
        if (PopupNotification.q(a) != null)
        {
            PopupNotification.t(a).add(PopupNotification.q(a).a);
        }
    }
}
