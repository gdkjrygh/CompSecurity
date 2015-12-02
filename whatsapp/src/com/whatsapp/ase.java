// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.BaseAdapter;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            wd, MessageDetailsActivity

class ase
    implements wd
{

    final MessageDetailsActivity a;

    ase(MessageDetailsActivity messagedetailsactivity)
    {
        a = messagedetailsactivity;
        super();
    }

    public void a()
    {
        MessageDetailsActivity.d(a).notifyDataSetChanged();
    }

    public void a(String s)
    {
    }

    public void a(Collection collection)
    {
    }

    public void b(String s)
    {
    }

    public void c(String s)
    {
    }

    public void d(String s)
    {
        if (MessageDetailsActivity.a(a, s))
        {
            MessageDetailsActivity.d(a).notifyDataSetChanged();
        }
    }
}
