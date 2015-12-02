// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.AbsListView;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo

class a_i
    implements android.widget.AbsListView.OnScrollListener
{

    final GroupChatInfo a;

    a_i(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        GroupChatInfo.m(a);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }
}
