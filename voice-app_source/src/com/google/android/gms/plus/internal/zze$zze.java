// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zza, zze

static final class zzayZ extends zza
{

    private final com.google.android.gms.common.api.der zzayZ;

    public void zza(DataHolder dataholder, String s)
    {
        Object obj;
        Status status;
        if (dataholder.zznb() != null)
        {
            obj = (PendingIntent)dataholder.zznb().getParcelable("pendingIntent");
        } else
        {
            obj = null;
        }
        status = new Status(dataholder.getStatusCode(), null, ((PendingIntent) (obj)));
        obj = dataholder;
        if (!status.isSuccess())
        {
            obj = dataholder;
            if (dataholder != null)
            {
                if (!dataholder.isClosed())
                {
                    dataholder.close();
                }
                obj = null;
            }
        }
        zzayZ.zzm(new <init>(status, ((DataHolder) (obj)), s));
    }

    public (com.google.android.gms.common.api.ze ze)
    {
        zzayZ = ze;
    }
}
