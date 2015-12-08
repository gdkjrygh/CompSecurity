// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbt, zzfl, zzgd

class zzte
    implements Runnable
{

    final zzgd zzte;
    final Map zztf;
    final zzbt zztt;

    public void run()
    {
        zzb.zzaj("Received Http request.");
        Object obj = (String)zztf.get("http_request");
        obj = zztt.zzF(((String) (obj)));
        if (obj == null)
        {
            zzb.zzak("Response should not be null.");
            return;
        } else
        {
            zzfl.zzCr.post(new Runnable(((JSONObject) (obj))) {

                final JSONObject zztu;
                final zzbt._cls1 zztv;

                public void run()
                {
                    zztv.zzte.zzb("fetchHttpRequestCompleted", zztu);
                    zzb.zzaj("Dispatched http response.");
                }

            
            {
                zztv = zzbt._cls1.this;
                zztu = jsonobject;
                super();
            }
            });
            return;
        }
    }

    _cls1.zztu(zzbt zzbt1, Map map, zzgd zzgd)
    {
        zztt = zzbt1;
        zztf = map;
        zzte = zzgd;
        super();
    }
}
