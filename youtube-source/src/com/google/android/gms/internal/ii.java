// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            fd, if, ie, fy, 
//            fj

public final class ii extends fd
{

    public ii(Context context, c c, d d)
    {
        super(context, c, d, null);
    }

    public final IInterface a(IBinder ibinder)
    {
        return com.google.android.gms.internal.if.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.mdm.services.START";
    }

    public final void a(Bundle bundle, Bundle bundle1)
    {
        i();
        try
        {
            ((ie)j()).a(h().getPackageName(), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Log.w("MDM", "NetworkQualityClient not connected soon after checkConnected.  Discarding network quality data");
        }
    }

    protected final void a(fy fy1, fj fj)
    {
        fy1.k(fj, 0x40be38, h().getPackageName(), Bundle.EMPTY);
    }

    protected final String b()
    {
        return "com.google.android.gms.mdm.internal.INetworkQualityService";
    }
}
