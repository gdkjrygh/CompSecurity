// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            ICredentialsService

public final class CredentialsClientImpl extends zzi
{

    public static final String ACTION_START_SERVICE = "com.google.android.gms.auth.api.credentials.service.START";

    public CredentialsClientImpl(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 68, connectioncallbacks, onconnectionfailedlistener);
    }

    protected ICredentialsService createServiceInterface(IBinder ibinder)
    {
        return ICredentialsService.zza.zzaq(ibinder);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return createServiceInterface(ibinder);
    }
}
