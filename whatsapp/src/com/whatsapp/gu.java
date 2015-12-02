// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            Conversation, og, App

class gu
    implements android.view.View.OnClickListener
{

    final Conversation a;

    gu(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (!App.C(a.aD.a))
            {
                a.showDialog(1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Conversation.A(a);
        }
    }
}
