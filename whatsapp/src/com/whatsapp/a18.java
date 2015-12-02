// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            a1t, mh, GroupChatRecentLocationsActivity

class a18
    implements Runnable
{

    final a1t a;

    a18(a1t a1t1)
    {
        a = a1t1;
        super();
    }

    public void run()
    {
        GroupChatRecentLocationsActivity.e(a.a.a).setText(a.a.a.getString(0x7f0e0286));
    }
}
