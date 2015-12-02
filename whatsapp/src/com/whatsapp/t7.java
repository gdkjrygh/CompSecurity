// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.contact.b;
import com.whatsapp.contact.j;

// Referenced classes of package com.whatsapp:
//            ViewSharedContactActivity

class t7
    implements Runnable
{

    final ViewSharedContactActivity a;

    t7(ViewSharedContactActivity viewsharedcontactactivity)
    {
        a = viewsharedcontactactivity;
        super();
    }

    public void run()
    {
        b.b(a.getApplicationContext(), j.INTERACTIVE_DELTA);
    }
}
