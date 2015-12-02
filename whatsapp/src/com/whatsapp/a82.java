// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.FloatingChildLayout;

// Referenced classes of package com.whatsapp:
//            QuickContactActivity, ath

class a82
    implements Runnable
{

    final QuickContactActivity a;

    a82(QuickContactActivity quickcontactactivity)
    {
        a = quickcontactactivity;
        super();
    }

    public void run()
    {
        QuickContactActivity.c(a).invalidate();
        FloatingChildLayout.a(QuickContactActivity.c(a), new ath(this));
    }
}
