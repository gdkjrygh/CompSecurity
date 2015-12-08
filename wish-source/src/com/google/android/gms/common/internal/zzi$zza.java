// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi

private abstract class zzTy extends zzTy
{

    public final int statusCode;
    public final Bundle zzTy;
    final zzi zzTz;

    protected void zzc(Boolean boolean1)
    {
        Object obj = null;
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.internal.zzi.zza(zzTz, 1, null);
_L4:
        return;
_L2:
        switch (statusCode)
        {
        default:
            com.google.android.gms.common.internal.zzi.zza(zzTz, 1, null);
            boolean1 = obj;
            if (zzTy != null)
            {
                boolean1 = (PendingIntent)zzTy.getParcelable("pendingIntent");
            }
            zzi(new ConnectionResult(statusCode, boolean1));
            return;

        case 0: // '\0'
            if (!zzlZ())
            {
                com.google.android.gms.common.internal.zzi.zza(zzTz, 1, null);
                zzi(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            com.google.android.gms.common.internal.zzi.zza(zzTz, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract void zzi(ConnectionResult connectionresult);

    protected abstract boolean zzlZ();

    protected void zzma()
    {
    }

    protected void zzo(Object obj)
    {
        zzc((Boolean)obj);
    }

    protected (zzi zzi1, int i, Bundle bundle)
    {
        zzTz = zzi1;
        super(zzi1, Boolean.valueOf(true));
        statusCode = i;
        zzTy = bundle;
    }
}
