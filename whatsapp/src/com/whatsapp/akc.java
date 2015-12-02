// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            Conversation, cq, ConversationContentLayout, App

class akc
    implements android.widget.PopupWindow.OnDismissListener
{

    final Conversation a;

    akc(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onDismiss()
    {
label0:
        {
            if (Conversation.P(a).b())
            {
                Conversation.K(a).postDelayed(Conversation.ah(a), 1000L);
                Conversation.Z(a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Conversation.K(a).setUnfreezeHeight();
            Conversation.K(a).requestLayout();
        }
    }
}
