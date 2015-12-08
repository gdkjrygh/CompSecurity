// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.crashlytics.android:
//            v

final class M extends BroadcastReceiver
{

    private v a;

    M(v v1)
    {
        a = v1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        v.a(a, false);
    }
}
