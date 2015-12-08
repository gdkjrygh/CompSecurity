// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.internal:
//            zzjz, zzjy, zzjv, zzkb

public class zzka
    implements ProxyApi
{

    public zzka()
    {
    }

    public PendingResult performProxyRequest(GoogleApiClient googleapiclient, ProxyRequest proxyrequest)
    {
        zzx.zzv(googleapiclient);
        zzx.zzv(proxyrequest);
        return googleapiclient.zzb(new zzjz(googleapiclient, proxyrequest) {

            final ProxyRequest zzRK;
            final zzka zzRL;

            protected void zza(Context context, zzjy zzjy1)
                throws RemoteException
            {
                zzjy1.zza(new zzjv(this) {

                    final _cls1 zzRM;

                    public void zza(ProxyResponse proxyresponse)
                    {
                        zzRM.zza(new zzkb(proxyresponse));
                    }

            
            {
                zzRM = _pcls1;
                super();
            }
                }, zzRK);
            }

            
            {
                zzRL = zzka.this;
                zzRK = proxyrequest;
                super(googleapiclient);
            }
        });
    }
}
