// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package com.whatsapp:
//            x1, GroupChatInfo

class md
    implements Runnable
{

    final x1 a;

    md(x1 x1_1)
    {
        a = x1_1;
        super();
    }

    public void run()
    {
        GroupChatInfo.a(a.j).setVisibility(8);
        GroupChatInfo.e(a.j).setVisibility(0);
    }
}
