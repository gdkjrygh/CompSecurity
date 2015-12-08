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

static final class zzari extends zza
{

    private final com.google.android.gms.common.api.der zzari;

    public void zza(DataHolder dataholder, String s)
    {
        Object obj;
        Status status;
        if (dataholder.zzll() != null)
        {
            obj = (PendingIntent)dataholder.zzll().getParcelable("pendingIntent");
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
        zzari.zzj(new <init>(status, ((DataHolder) (obj)), s));
    }

    public (com.google.android.gms.common.api.ze ze)
    {
        zzari = ze;
    }
}
