// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo, mk, App

class op
    implements android.view.View.OnClickListener
{

    final GroupChatInfo a;

    op(GroupChatInfo groupchatinfo)
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
                a.showDialog(2);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.showDialog(1);
        }
    }
}
