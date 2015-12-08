// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zziz, zziy

public class zzix extends zzi
{

    private final String zzOd;
    private final String zzOe;

    public zzix(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze1)
    {
        super(context, looper, 77, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzOd = zze1.zznz();
        zzOe = zze1.zzny();
    }

    private Bundle zzkS()
    {
        Bundle bundle = new Bundle();
        bundle.putString("authPackage", zzOe);
        return bundle;
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.appinvite.internal.IAppInviteService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.appinvite.service.START";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzag(ibinder);
    }

    public void zza(zziy zziy, String s)
    {
        try
        {
            ((zziz)zznM()).zza(zziy, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zziy zziy)
        {
            return;
        }
    }

    protected zziz zzag(IBinder ibinder)
    {
        return zziz.zza.zzai(ibinder);
    }

    public void zzb(zziy zziy, String s)
    {
        try
        {
            ((zziz)zznM()).zzb(zziy, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zziy zziy)
        {
            return;
        }
    }

    protected String zzkQ()
    {
        return zzOd;
    }

    protected Bundle zzkR()
    {
        return zzkS();
    }
}
