// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            og, GroupChatInfo, App

class i9
    implements android.widget.AdapterView.OnItemClickListener
{

    final GroupChatInfo a;

    i9(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = (og)view.getTag();
            if (adapterview != null && GroupChatInfo.r(a).containsKey(((og) (adapterview)).a))
            {
                GroupChatInfo.b(a, ((og) (adapterview)).a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (adapterview != null)
            {
                GroupChatInfo.a(a, adapterview);
                view.showContextMenu();
            }
        }
    }
}
