// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.media.AsyncPlayer;
import android.view.View;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.og;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.u5;
import java.util.HashMap;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class c
    implements android.view.View.OnClickListener
{

    final PopupNotification a;

    c(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void onClick(View view)
    {
        App.k.stop();
        view = Conversation.a(u5.d(PopupNotification.d(a).y.a));
        String s = PopupNotification.b(a).getText().toString().trim();
        if (PopupNotification.q(a) != null && s.length() > 0)
        {
            Conversation.aR.put(PopupNotification.q(a).a, s);
        }
        a.startActivity(view);
        PopupNotification.h(a);
        a.finish();
    }
}
