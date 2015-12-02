// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            HomeActivity

class tk
    implements Runnable
{

    final HomeActivity a;

    tk(HomeActivity homeactivity)
    {
        a = homeactivity;
        super();
    }

    public void run()
    {
        HomeActivity.d(a);
    }
}
