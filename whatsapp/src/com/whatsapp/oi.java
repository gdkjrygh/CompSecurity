// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            App, Conversation, ConversationTextEntry

class oi
    implements android.widget.TextView.OnEditorActionListener
{

    final Conversation a;

    oi(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        int j;
        j = App.am;
        if (keyevent == null);
        if (i != 4) goto _L2; else goto _L1
_L1:
        Conversation.x(a);
_L4:
        return true;
_L2:
        if (keyevent == null || keyevent.getKeyCode() != 66)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        if (!a.N)
        {
            break; /* Loop/switch isn't completed */
        }
        a.N = false;
        if (j == 0) goto _L4; else goto _L3
_L3:
label0:
        {
            if (Conversation.aJ)
            {
                Conversation.x(a);
                if (j == 0)
                {
                    break label0;
                }
            }
            i = Conversation.w(a).getSelectionStart();
            int k = Conversation.w(a).getSelectionEnd();
            if (i != Conversation.w(a).length())
            {
                Conversation.w(a).getText().replace(Math.min(i, k), Math.max(i, k), "\n", 0, 1);
                if (j == 0)
                {
                    break label0;
                }
            }
            Conversation.w(a).append("\n");
        }
        a.N = true;
        return true;
        return false;
    }
}
