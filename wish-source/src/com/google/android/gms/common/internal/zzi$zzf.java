// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zzj

protected final class zzTC extends zzTC
{

    public final IBinder zzTC;
    final zzi zzTz;

    protected void zzi(ConnectionResult connectionresult)
    {
        com.google.android.gms.common.internal.zzi.zzc(zzTz).zzj(connectionresult);
    }

    protected boolean zzlZ()
    {
        String s;
        try
        {
            s = zzTC.getInterfaceDescriptor();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        if (!zzTz.zzer().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder()).append("service descriptor mismatch: ").append(zzTz.zzer()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = zzTz.zzD(zzTC);
            if (iinterface != null && com.google.android.gms.common.internal.zzi.zza(zzTz, 2, 3, iinterface))
            {
                com.google.android.gms.common.internal.zzi.zzc(zzTz).zzmg();
                GooglePlayServicesUtil.zzQ(com.google.android.gms.common.internal.zzi.zzf(zzTz));
                return true;
            }
        }
        return false;
    }

    public sUtil(zzi zzi1, int i, IBinder ibinder, Bundle bundle)
    {
        zzTz = zzi1;
        super(zzi1, i, bundle);
        zzTC = ibinder;
    }
}
