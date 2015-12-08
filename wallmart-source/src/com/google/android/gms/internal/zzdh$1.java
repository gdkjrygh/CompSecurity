// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdh, zzhu, zzip

class zzwU
    implements Runnable
{

    final zzip zzwU;
    final zzdh zzwV;
    final Map zzwl;

    public void run()
    {
        zzb.zzaC("Received Http request.");
        Object obj = (String)zzwl.get("http_request");
        obj = zzwV.zzV(((String) (obj)));
        if (obj == null)
        {
            zzb.e("Response should not be null.");
            return;
        } else
        {
            zzhu.zzHK.post(new Runnable(((JSONObject) (obj))) {

                final JSONObject zzwW;
                final zzdh._cls1 zzwX;

                public void run()
                {
                    zzwX.zzwU.zzb("fetchHttpRequestCompleted", zzwW);
                    zzb.zzaC("Dispatched http response.");
                }

            
            {
                zzwX = zzdh._cls1.this;
                zzwW = jsonobject;
                super();
            }
            });
            return;
        }
    }

    _cls1.zzwW(zzdh zzdh1, Map map, zzip zzip)
    {
        zzwV = zzdh1;
        zzwl = map;
        zzwU = zzip;
        super();
    }
}
