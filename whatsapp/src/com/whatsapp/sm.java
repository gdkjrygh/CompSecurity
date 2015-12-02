// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo, mk, App

class sm
    implements android.view.View.OnClickListener
{

    final GroupChatInfo a;

    sm(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            if (mk.c(GroupChatInfo.g(a)))
            {
                a.showDialog(50);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.f(a.getString(0x7f0e040a));
        }
    }
}
