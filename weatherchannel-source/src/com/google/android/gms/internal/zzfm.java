// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzfi

public class zzfm
    implements InAppPurchaseResult
{

    private final zzfi zzBc;

    public zzfm(zzfi zzfi1)
    {
        zzBc = zzfi1;
    }

    public void finishPurchase()
    {
        try
        {
            zzBc.finishPurchase();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward finishPurchase to InAppPurchaseResult", remoteexception);
        }
    }

    public String getProductId()
    {
        String s;
        try
        {
            s = zzBc.getProductId();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getProductId to InAppPurchaseResult", remoteexception);
            return null;
        }
        return s;
    }

    public Intent getPurchaseData()
    {
        Intent intent;
        try
        {
            intent = zzBc.getPurchaseData();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return null;
        }
        return intent;
    }

    public int getResultCode()
    {
        int i;
        try
        {
            i = zzBc.getResultCode();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward getPurchaseData to InAppPurchaseResult", remoteexception);
            return 0;
        }
        return i;
    }

    public boolean isVerified()
    {
        boolean flag;
        try
        {
            flag = zzBc.isVerified();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward isVerified to InAppPurchaseResult", remoteexception);
            return false;
        }
        return flag;
    }
}
