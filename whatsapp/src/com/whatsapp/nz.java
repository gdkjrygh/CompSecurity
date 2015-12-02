// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.util.LruCache;

// Referenced classes of package com.whatsapp:
//            App, s3

class nz
    implements Runnable
{

    final s3 a;

    nz(s3 s3)
    {
        a = s3;
        super();
    }

    public void run()
    {
        App.Q.trimToSize(0);
    }
}
