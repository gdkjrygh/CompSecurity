// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.ViewTreeObserver;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            y2, h0, ConversationsFragment

class ka
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final y2 a;

    ka(y2 y2_1)
    {
        a = y2_1;
        super();
    }

    public void onGlobalLayout()
    {
        ConversationsFragment.h(a.a.b).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        a.a.b.a(a.a.a);
    }
}
