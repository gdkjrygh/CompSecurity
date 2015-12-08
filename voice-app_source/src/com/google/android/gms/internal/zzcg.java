// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzch

public class zzcg
    implements CustomRenderedAd
{

    private final zzch zzuV;

    public zzcg(zzch zzch1)
    {
        zzuV = zzch1;
    }

    public String getBaseUrl()
    {
        String s;
        try
        {
            s = zzuV.zzdt();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not delegate getBaseURL to CustomRenderedAd", remoteexception);
            return null;
        }
        return s;
    }

    public String getContent()
    {
        String s;
        try
        {
            s = zzuV.getContent();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not delegate getContent to CustomRenderedAd", remoteexception);
            return null;
        }
        return s;
    }

    public void onAdRendered(View view)
    {
        zzch zzch1;
        try
        {
            zzch1 = zzuV;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            zzb.zzd("Could not delegate onAdRendered to CustomRenderedAd", view);
            return;
        }
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        view = zze.zzw(view);
_L1:
        zzch1.zza(view);
        return;
        view = null;
          goto _L1
    }

    public void recordClick()
    {
        try
        {
            zzuV.recordClick();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not delegate recordClick to CustomRenderedAd", remoteexception);
        }
    }

    public void recordImpression()
    {
        try
        {
            zzuV.recordImpression();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not delegate recordImpression to CustomRenderedAd", remoteexception);
        }
    }
}
