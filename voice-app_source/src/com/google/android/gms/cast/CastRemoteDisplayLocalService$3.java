// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Handler;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

class zzRp
    implements laySessionCallbacks
{

    final CastRemoteDisplayLocalService zzRp;

    public void onRemoteDisplayEnded(Status status)
    {
        CastRemoteDisplayLocalService.zzln().zzb(String.format("Cast screen has ended: %d", new Object[] {
            Integer.valueOf(status.getStatusCode())
        }), new Object[0]);
        if (CastRemoteDisplayLocalService.zzb(zzRp) != null)
        {
            CastRemoteDisplayLocalService.zzb(zzRp).post(new Runnable() {

                final CastRemoteDisplayLocalService._cls3 zzRu;

                public void run()
                {
                    CastRemoteDisplayLocalService.zzO(false);
                }

            
            {
                zzRu = CastRemoteDisplayLocalService._cls3.this;
                super();
            }
            });
        }
    }

    _cls1.zzRu(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        zzRp = castremotedisplaylocalservice;
        super();
    }
}
