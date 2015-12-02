// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.view.View;
import android.widget.ImageButton;
import com.whatsapp.fe;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class af
    implements android.view.View.OnClickListener
{

    final ImageButton a;
    final PopupNotification b;

    af(PopupNotification popupnotification, ImageButton imagebutton)
    {
        b = popupnotification;
        a = imagebutton;
        super();
    }

    public void onClick(View view)
    {
        PopupNotification.a(b).a(a);
    }
}
