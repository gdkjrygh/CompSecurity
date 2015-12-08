// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.gi;
import com.google.android.gms.maps.a.bn;
import com.google.android.gms.maps.a.z;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.b;

// Referenced classes of package com.google.android.gms.maps:
//            a

public final class g
{

    public static int a(Context context)
    {
        gi.a(context);
        try
        {
            context = bn.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((GooglePlayServicesNotAvailableException) (context)).errorCode;
        }
        try
        {
            com.google.android.gms.maps.a.a(context.a());
            b.a(context.b());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
        return 0;
    }
}
