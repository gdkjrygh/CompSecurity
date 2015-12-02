// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo

class k3
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final View a;
    final GroupChatInfo b;

    k3(GroupChatInfo groupchatinfo, View view)
    {
        b = groupchatinfo;
        a = view;
        super();
    }

    public void onGlobalLayout()
    {
        a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        b.findViewById(0x7f0b010e).setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, a.getMeasuredHeight()));
    }
}
