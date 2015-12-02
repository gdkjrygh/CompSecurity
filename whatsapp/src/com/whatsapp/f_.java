// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            ContactInfo

class f_
    implements Runnable
{

    final ContactInfo a;

    f_(ContactInfo contactinfo)
    {
        a = contactinfo;
        super();
    }

    public void run()
    {
        ContactInfo.g(a);
        a.l.postDelayed(this, ContactInfo.e(a));
    }
}
