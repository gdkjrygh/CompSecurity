// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.KeyEvent;
import com.whatsapp.util.c;

// Referenced classes of package com.whatsapp:
//            za, Conversation, ConversationTextEntry

class lw
    implements za
{

    final Conversation a;

    lw(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void a()
    {
        Conversation.w(a).dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void a(int i)
    {
        int j = Conversation.w(a).getSelectionStart();
        int k = Conversation.w(a).getSelectionEnd();
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
        stringbuilder = new StringBuilder(Conversation.w(a).getText().toString());
        stringbuilder.replace(l, k, c.a(i));
        Conversation.w(a).setText(stringbuilder);
        Conversation.w(a).setSelection(l + c.h(i));
    }
}
