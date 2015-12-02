// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.AbsListView;
import com.whatsapp.util.undobar.UndoBarController;

// Referenced classes of package com.whatsapp:
//            ConversationsFragment

class r1
    implements android.widget.AbsListView.OnScrollListener
{

    final ConversationsFragment a;

    r1(ConversationsFragment conversationsfragment)
    {
        a = conversationsfragment;
        super();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i != 0)
        {
            UndoBarController.b(a.getActivity());
        }
    }
}
