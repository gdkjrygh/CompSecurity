// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi

private abstract class zzaaw extends zzaaw
{

    public final int statusCode;
    public final Bundle zzaaw;
    final zzi zzaax;

    protected void zzc(Boolean boolean1)
    {
        Object obj = null;
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        zzi.zza(zzaax, 1, null);
_L4:
        return;
_L2:
        switch (statusCode)
        {
        default:
            zzi.zza(zzaax, 1, null);
            boolean1 = obj;
            if (zzaaw != null)
            {
                boolean1 = (PendingIntent)zzaaw.getParcelable("pendingIntent");
            }
            zzg(new ConnectionResult(statusCode, boolean1));
            return;

        case 0: // '\0'
            if (!zznO())
            {
                zzi.zza(zzaax, 1, null);
                zzg(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            zzi.zza(zzaax, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract void zzg(ConnectionResult connectionresult);

    protected abstract boolean zznO();

    protected void zznP()
    {
    }

    protected void zzr(Object obj)
    {
        zzc((Boolean)obj);
    }

    protected (zzi zzi1, int i, Bundle bundle)
    {
        zzaax = zzi1;
        super(zzi1, Boolean.valueOf(true));
        statusCode = i;
        zzaaw = bundle;
    }
}
