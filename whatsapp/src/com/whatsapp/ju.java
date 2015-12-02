// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            ao7, Conversation

class ju
    implements android.widget.TextView.OnEditorActionListener
{

    final ao7 a;

    ju(ao7 ao7_1)
    {
        a = ao7_1;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 3 || keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
        {
            Conversation.f(a.a, true);
            return true;
        } else
        {
            return false;
        }
    }
}
