// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            zzm

private class zzYf
    implements Runnable
{

    final zzm zzYd;
    private final int zzYe;
    private final ConnectionResult zzYf;

    public void run()
    {
        if (!zzm.zza(zzYd) || zzm.zzb(zzYd))
        {
            return;
        }
        zzm.zza(zzYd, true);
        zzm.zza(zzYd, zzYe);
        zzm.zza(zzYd, zzYf);
        if (zzYf.hasResolution())
        {
            try
            {
                int i = zzYd.getActivity().getSupportFragmentManager().getFragments().indexOf(zzYd);
                zzYf.startResolutionForResult(zzYd.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.nder.SendIntentException sendintentexception)
            {
                zzm.zzc(zzYd);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(zzYf.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(zzYf.getErrorCode(), zzYd.getActivity(), zzYd, 2, zzYd);
            return;
        } else
        {
            zzm.zza(zzYd, zzYe, zzYf);
            return;
        }
    }

    public sult(zzm zzm1, int i, ConnectionResult connectionresult)
    {
        zzYd = zzm1;
        super();
        zzYe = i;
        zzYf = connectionresult;
    }
}
