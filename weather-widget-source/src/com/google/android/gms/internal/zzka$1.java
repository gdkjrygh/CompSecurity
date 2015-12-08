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
//            zzjz, zzka, zzjy, zzjv, 
//            zzkb

class eApiClient extends zzjz
{

    final ProxyRequest zzRK;
    final zzka zzRL;

    protected void zza(Context context, zzjy zzjy1)
        throws RemoteException
    {
        zzjy1.zza(new zzjv() {

            final zzka._cls1 zzRM;

            public void zza(ProxyResponse proxyresponse)
            {
                zzRM.zza(new zzkb(proxyresponse));
            }

            
            {
                zzRM = zzka._cls1.this;
                super();
            }
        }, zzRK);
    }

    eApiClient(zzka zzka1, GoogleApiClient googleapiclient, ProxyRequest proxyrequest)
    {
        zzRL = zzka1;
        zzRK = proxyrequest;
        super(googleapiclient);
    }
}
