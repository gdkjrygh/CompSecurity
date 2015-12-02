// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            Conversation

class el
    implements android.view.View.OnKeyListener
{

    final Conversation a;

    el(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (Conversation.aJ && keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 1)
        {
            Conversation.x(a);
            return true;
        } else
        {
            return false;
        }
    }
}
