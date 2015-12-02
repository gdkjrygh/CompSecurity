// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.bv;

// Referenced classes of package com.whatsapp:
//            ConversationRowMedia, App

class att extends bv
{

    final ConversationRowMedia b;

    att(ConversationRowMedia conversationrowmedia)
    {
        b = conversationrowmedia;
        super();
    }

    public void a(View view)
    {
        App.n(b.C);
    }
}
