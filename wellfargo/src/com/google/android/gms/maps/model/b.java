// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.maps.model.a.d;

// Referenced classes of package com.google.android.gms.maps.model:
//            a, f

public final class b
{

    private static d a;

    private static d a()
    {
        return (d)au.a(a, "IBitmapDescriptorFactory is not initialized");
    }

    public static a a(int i)
    {
        a a1;
        try
        {
            a1 = new a(a().a(i));
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        return a1;
    }

    public static void a(d d1)
    {
        if (a != null)
        {
            return;
        } else
        {
            a = (d)au.a(d1);
            return;
        }
    }
}
