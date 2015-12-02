// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import com.whatsapp.ConversationTextEntry;
import com.whatsapp.fe;
import com.whatsapp.util.c;
import com.whatsapp.za;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class z
    implements za
{

    final PopupNotification a;

    z(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void a()
    {
    }

    public void a(int i)
    {
        PopupNotification.a(a).dismiss();
        int j = PopupNotification.b(a).getSelectionStart();
        int k = PopupNotification.b(a).getSelectionEnd();
        StringBuilder stringbuilder;
        int l;
        if (j > k)
        {
            l = k;
            k = j;
        } else
        {
            l = j;
        }
        stringbuilder = new StringBuilder(PopupNotification.b(a).getText().toString());
        stringbuilder.replace(l, k, c.a(i));
        PopupNotification.b(a).setText(stringbuilder);
        if (l <= PopupNotification.b(a).length() - c.h(i))
        {
            PopupNotification.b(a).setSelection(l + c.h(i));
        }
    }
}
