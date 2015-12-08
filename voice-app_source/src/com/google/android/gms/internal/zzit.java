// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zziq

public class zzit extends zzi
{

    public zzit(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 19, connectioncallbacks, onconnectionfailedlistener);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzaf(ibinder);
    }

    protected zziq zzaf(IBinder ibinder)
    {
        return zziq.zza.zzad(ibinder);
    }

    public zziq zzkO()
        throws DeadObjectException
    {
        return (zziq)zznM();
    }
}
