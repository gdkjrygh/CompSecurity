// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo

class i8
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final HorizontalScrollView a;
    final GroupChatInfo b;

    i8(GroupChatInfo groupchatinfo, HorizontalScrollView horizontalscrollview)
    {
        b = groupchatinfo;
        a = horizontalscrollview;
        super();
    }

    public void onGlobalLayout()
    {
        a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        a.fullScroll(66);
    }
}
