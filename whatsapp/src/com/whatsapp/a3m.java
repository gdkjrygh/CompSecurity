// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            App, Conversation, ConversationRow

class a3m
    implements Runnable
{

    final Conversation a;
    final String b;

    a3m(Conversation conversation, String s)
    {
        a = conversation;
        b = s;
        super();
    }

    public void run()
    {
        int j = App.am;
        int i = 0;
        do
        {
label0:
            {
                if (i < a.aK.getChildCount())
                {
                    android.view.View view = a.aK.getChildAt(i);
                    if (view instanceof ConversationRow)
                    {
                        ((ConversationRow)view).a(b);
                    }
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }
}
