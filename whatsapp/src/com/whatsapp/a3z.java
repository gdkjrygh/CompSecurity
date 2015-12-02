// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, Conversation, GroupChatInfo, ListChatInfo, 
//            ContactInfo

class a3z
    implements android.view.View.OnClickListener
{

    final Conversation a;

    a3z(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i = App.am;
            if (Conversation.aj(a))
            {
                GroupChatInfo.a(a.aD, a);
                if (i == 0)
                {
                    break label0;
                }
            }
            if (Conversation.V(a))
            {
                ListChatInfo.a(a.aD, a);
                if (i == 0)
                {
                    break label0;
                }
            }
            ContactInfo.a(a.aD, a);
        }
    }
}
