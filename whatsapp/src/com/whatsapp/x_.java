// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            ConversationRowVoiceNote, App, MediaData, p5, 
//            ui

class x_
    implements android.view.View.OnClickListener
{

    final ConversationRowVoiceNote a;

    x_(ConversationRowVoiceNote conversationrowvoicenote)
    {
        a = conversationrowvoicenote;
        super();
    }

    public void onClick(View view)
    {
        if (!a.C.y.b) goto _L2; else goto _L1
_L1:
        if (bg.a(a.C.M, 2) < 0) goto _L4; else goto _L3
_L3:
        App.b(a.getContext(), 0x7f0e0190, 0);
_L5:
        return;
_L4:
        ((MediaData)a.C.B).uploader.f();
        if (App.am == 0) goto _L5; else goto _L2
_L2:
        ((MediaData)a.C.B).downloader.b();
        return;
    }
}
