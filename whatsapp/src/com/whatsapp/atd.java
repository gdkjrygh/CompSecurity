// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ConversationRowMedia, App, MediaData, w5, 
//            p5, ui

class atd extends bv
{

    final ConversationRowMedia b;

    atd(ConversationRowMedia conversationrowmedia)
    {
        b = conversationrowmedia;
        super();
    }

    public void a(View view)
    {
        if (!b.C.y.b) goto _L2; else goto _L1
_L1:
        if (bg.a(b.C.M, 2) < 0) goto _L4; else goto _L3
_L3:
        App.b(b.getContext(), 0x7f0e0190, 0);
_L5:
        return;
_L4:
        view = (MediaData)b.C.B;
        if (((MediaData) (view)).transcoder != null)
        {
            ((MediaData) (view)).transcoder.c();
        }
        if (((MediaData) (view)).uploader != null)
        {
            ((MediaData) (view)).uploader.f();
        }
        if (App.am == 0) goto _L5; else goto _L2
_L2:
        ((MediaData)b.C.B).downloader.b();
        return;
    }
}
