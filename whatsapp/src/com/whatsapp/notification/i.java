// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class i
    implements android.widget.TextView.OnEditorActionListener
{

    final PopupNotification a;

    i(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
    {
        if (j == 4)
        {
            PopupNotification.s(a);
            return true;
        } else
        {
            return false;
        }
    }
}
