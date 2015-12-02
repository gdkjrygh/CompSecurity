// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.content.Context;

// Referenced classes of package com.whatsapp.accountsync:
//            PerformSyncManager

final class d
    implements Runnable
{

    final Context a;

    d(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        PerformSyncManager.a(a);
    }
}
