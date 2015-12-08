// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.nativead;

import android.util.Log;
import com.google.android.gms.ads.AdListener;

// Referenced classes of package com.go.weatherex.ad.nativead:
//            a

class c extends AdListener
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public void onAdFailedToLoad(int i)
    {
        super.onAdFailedToLoad(i);
        Log.i("lky", (new StringBuilder()).append("admob native errorCode-->").append(i).toString());
    }
}
