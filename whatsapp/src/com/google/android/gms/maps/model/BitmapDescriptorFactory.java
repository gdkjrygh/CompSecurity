// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.model.internal.g;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, BitmapDescriptor

public final class BitmapDescriptorFactory
{

    private static g alM;

    public static void a(g g1)
    {
        g g2;
        try
        {
            g2 = alM;
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            throw g1;
        }
        if (g2 != null)
        {
            return;
        } else
        {
            alM = (g)jx.i(g1);
            return;
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap)
    {
        try
        {
            bitmap = new BitmapDescriptor(oc().b(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new RuntimeRemoteException(bitmap);
        }
        return bitmap;
    }

    private static g oc()
    {
        return (g)jx.b(alM, "IBitmapDescriptorFactory is not initialized");
    }
}
