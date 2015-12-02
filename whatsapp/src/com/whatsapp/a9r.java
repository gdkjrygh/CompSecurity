// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo, asf, App, a8h

class a9r
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final GroupChatInfo a;

    a9r(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
label0:
        {
            a.findViewById(0x7f0b01f8).setEnabled(false);
            GroupChatInfo.n(a).setVisibility(4);
            a.findViewById(0x7f0b01fa).setVisibility(0);
            if (flag)
            {
                App.a(new asf(this, GroupChatInfo.g(a), 0L));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.a(new a8h(this, GroupChatInfo.g(a)));
        }
    }
}
