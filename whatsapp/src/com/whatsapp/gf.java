// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.ViewTreeObserver;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            ArchivedConversationsFragment

class gf
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final int a;
    final ArchivedConversationsFragment b;

    gf(ArchivedConversationsFragment archivedconversationsfragment, int i)
    {
        b = archivedconversationsfragment;
        a = i;
        super();
    }

    public void onGlobalLayout()
    {
        b.getListView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        b.a(a);
    }
}
