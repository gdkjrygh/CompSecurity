// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.c4;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            ConversationRow, App, Conversation

class y1
    implements android.view.View.OnClickListener
{

    final ConversationRow a;

    y1(ConversationRow conversationrow)
    {
        a = conversationrow;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
label1:
            {
                if (!a.isLongClickable())
                {
                    break label0;
                }
                view = ConversationRow.a(a);
                if (view == null)
                {
                    break label0;
                }
                if (view.containsKey(a.C.y))
                {
                    view.remove(a.C.y);
                    ConversationRow.b(a).setSelected(false);
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                view.put(a.C.y, a.C);
                ConversationRow.b(a).setSelected(true);
            }
            a.d().s();
        }
    }
}
