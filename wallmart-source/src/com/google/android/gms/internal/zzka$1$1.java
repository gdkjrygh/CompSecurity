// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzjv, zzkb, zzjz, zzka, 
//            zzjy

class t> extends zzjv
{

    final xyResponse zzRM;

    public void zza(ProxyResponse proxyresponse)
    {
        zzRM.a(new zzkb(proxyresponse));
    }

    piClient(piClient piclient)
    {
        zzRM = piclient;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzka$1

/* anonymous class */
    class zzka._cls1 extends zzjz
    {

        final ProxyRequest zzRK;
        final zzka zzRL;

        protected void zza(Context context, zzjy zzjy1)
            throws RemoteException
        {
            zzjy1.zza(new zzka._cls1._cls1(this), zzRK);
        }

            
            {
                zzRL = zzka1;
                zzRK = proxyrequest;
                super(googleapiclient);
            }
    }

}
