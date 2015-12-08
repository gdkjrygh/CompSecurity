// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static abstract class zzn extends zzb
{

    zzo zzTa;

    public Result createFailedResult(Status status)
    {
        return zzn(status);
    }

    public aChannelResult zzn(Status status)
    {
        return new RemoteMediaPlayer.MediaChannelResult(status) {

            final Status zzOl;
            final RemoteMediaPlayer.zzb zzTb;

            public JSONObject getCustomData()
            {
                return null;
            }

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzTb = RemoteMediaPlayer.zzb.this;
                zzOl = status;
                super();
            }
        };
    }

    _cls2.zzOl(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        zzTa = new zzo() {

            final RemoteMediaPlayer.zzb zzTb;

            public void zza(long l, int i, Object obj)
            {
                if (obj instanceof JSONObject)
                {
                    obj = (JSONObject)obj;
                } else
                {
                    obj = null;
                }
                zzTb.setResult(new RemoteMediaPlayer.zzc(new Status(i), ((JSONObject) (obj))));
            }

            public void zzy(long l)
            {
                zzTb.setResult(zzTb.zzn(new Status(2103)));
            }

            
            {
                zzTb = RemoteMediaPlayer.zzb.this;
                super();
            }
        };
    }
}
