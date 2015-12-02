// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.view.View;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class j
    implements android.view.View.OnClickListener
{

    final PopupNotification a;

    j(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void onClick(View view)
    {
        PopupNotification.i(a);
    }
}
