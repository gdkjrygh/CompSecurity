// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            w, as

final class at
    implements Runnable
{

    private Context a;
    private w b;

    at(Context context, w w1)
    {
        a = context;
        b = w1;
        super();
    }

    public final void run()
    {
        try
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(a);
            b.W = info.getId();
            return;
        }
        catch (Throwable throwable)
        {
            as.a(as.f(), throwable.getLocalizedMessage(), throwable);
        }
    }
}
