// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchase;

// Referenced classes of package com.google.android.gms.internal:
//            zzfe

public class zzfn
    implements InAppPurchase
{

    private final zzfe zzAN;

    public zzfn(zzfe zzfe1)
    {
        zzAN = zzfe1;
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = zzAN.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getProductId to InAppPurchase", remoteexception);
            return null;
        }
        return s;
    }

    public void recordPlayBillingResolution(int i)
    {
        try
        {
            zzAN.recordPlayBillingResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward recordPlayBillingResolution to InAppPurchase", remoteexception);
        }
    }

    public void recordResolution(int i)
    {
        try
        {
            zzAN.recordResolution(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward recordResolution to InAppPurchase", remoteexception);
        }
    }
}
