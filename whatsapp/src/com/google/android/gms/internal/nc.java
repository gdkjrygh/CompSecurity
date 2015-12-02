// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jt, np, ni

public class nc extends jl
{

    public static int a;
    protected final np Ee = new _cls1();
    private final String agD;

    public nc(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        agD = s;
    }

    static void a(nc nc1)
    {
        nc1.dS();
    }

    protected void a(jt jt1, jl.e e)
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", agD);
        jt1.e(e, 0x648278, getContext().getPackageName(), bundle);
    }

    protected ni aM(IBinder ibinder)
    {
        return ni.a.aO(ibinder);
    }

    protected String bK()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected IInterface l(IBinder ibinder)
    {
        return aM(ibinder);
    }

    private class _cls1
        implements np
    {

        final nc agE;

        public void dS()
        {
            nc.a(agE);
        }

        public IInterface hw()
        {
            return nh();
        }

        public ni nh()
        {
            return (ni)agE.hw();
        }

        _cls1()
        {
            agE = nc.this;
            super();
        }
    }

}
