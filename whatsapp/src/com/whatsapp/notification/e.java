// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.media.AsyncPlayer;
import android.view.View;
import com.whatsapp.App;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class e
    implements android.view.View.OnClickListener
{

    final PopupNotification a;

    e(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void onClick(View view)
    {
        App.k.stop();
        PopupNotification.h(a);
        a.finish();
    }
}
