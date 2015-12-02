// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            adk, a17, MessageDetailsActivity, App, 
//            aoz

class adw extends adk
{

    final MessageDetailsActivity a;

    adw(MessageDetailsActivity messagedetailsactivity)
    {
        a = messagedetailsactivity;
        super();
    }

    private void d(c4 c4_1)
    {
        a.runOnUiThread(new a17(this, c4_1));
    }

    public void a(c4 c4_1)
    {
        d(c4_1);
    }

    public void a(c4 c4_1, int i)
    {
        d(c4_1);
    }

    public void a(String s)
    {
        if (s != null && s.equals(MessageDetailsActivity.h(a).y.a) && App.ah.a(MessageDetailsActivity.h(a).y) == null)
        {
            a.finish();
        }
    }
}
