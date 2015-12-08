// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzj

private abstract class zzadG extends zzadG
{

    public final int statusCode;
    public final Bundle zzadG;
    final zzj zzadH;

    protected void zzc(Boolean boolean1)
    {
        Object obj = null;
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        zzj.zza(zzadH, 1, null);
_L4:
        return;
_L2:
        switch (statusCode)
        {
        default:
            zzj.zza(zzadH, 1, null);
            boolean1 = obj;
            if (zzadG != null)
            {
                boolean1 = (PendingIntent)zzadG.getParcelable("pendingIntent");
            }
            zzi(new ConnectionResult(statusCode, boolean1));
            return;

        case 0: // '\0'
            if (!zzoD())
            {
                zzj.zza(zzadH, 1, null);
                zzi(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            zzj.zza(zzadH, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract void zzi(ConnectionResult connectionresult);

    protected abstract boolean zzoD();

    protected void zzoE()
    {
    }

    protected void zzs(Object obj)
    {
        zzc((Boolean)obj);
    }

    protected (zzj zzj1, int i, Bundle bundle)
    {
        zzadH = zzj1;
        super(zzj1, Boolean.valueOf(true));
        statusCode = i;
        zzadG = bundle;
    }
}
