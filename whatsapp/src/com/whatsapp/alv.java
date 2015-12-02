// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo, a1e, App

class alv
    implements Runnable
{

    final GroupChatInfo a;

    alv(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void run()
    {
label0:
        {
            View view = a.findViewById(0x7f0b01fa);
            TextView textview = (TextView)a.findViewById(0x7f0b01f8);
            view.setVisibility(4);
            GroupChatInfo.n(a).setVisibility(0);
            if (a1e.g.b(GroupChatInfo.g(a)))
            {
                textview.setPaintFlags(textview.getPaintFlags() | 8);
                textview.setEnabled(true);
                ((CompoundButton)GroupChatInfo.n(a)).setOnCheckedChangeListener(null);
                ((CompoundButton)GroupChatInfo.n(a)).setChecked(true);
                ((CompoundButton)GroupChatInfo.n(a)).setOnCheckedChangeListener(a.x);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            textview.setPaintFlags(textview.getPaintFlags() & -9);
            textview.setEnabled(false);
            ((CompoundButton)GroupChatInfo.n(a)).setOnCheckedChangeListener(null);
            ((CompoundButton)GroupChatInfo.n(a)).setChecked(false);
            ((CompoundButton)GroupChatInfo.n(a)).setOnCheckedChangeListener(a.x);
        }
    }
}
