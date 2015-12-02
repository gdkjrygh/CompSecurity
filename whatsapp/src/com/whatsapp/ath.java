// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            a3r, a82

class ath
    implements Runnable
{

    final a82 a;

    ath(a82 a82)
    {
        a = a82;
        super();
    }

    public void run()
    {
        (new Handler()).postDelayed(new a3r(this), 60L);
    }
}
