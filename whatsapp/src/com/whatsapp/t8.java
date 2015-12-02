// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.BaseAdapter;

// Referenced classes of package com.whatsapp:
//            MessageDetailsActivity

class t8
    implements Runnable
{

    final MessageDetailsActivity a;

    t8(MessageDetailsActivity messagedetailsactivity)
    {
        a = messagedetailsactivity;
        super();
    }

    public void run()
    {
        MessageDetailsActivity.d(a).notifyDataSetChanged();
        MessageDetailsActivity.f(a);
    }
}
