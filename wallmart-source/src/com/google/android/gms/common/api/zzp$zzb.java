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
//            zzp

private class zzaaT
    implements Runnable
{

    final zzp zzaaR;
    private final int zzaaS;
    private final ConnectionResult zzaaT;

    public void run()
    {
        if (!zzp.zza(zzaaR) || zzp.zzb(zzaaR))
        {
            return;
        }
        zzp.zza(zzaaR, true);
        zzp.zza(zzaaR, zzaaS);
        zzp.zza(zzaaR, zzaaT);
        if (zzaaT.hasResolution())
        {
            try
            {
                int i = zzaaR.getActivity().getSupportFragmentManager().getFragments().indexOf(zzaaR);
                zzaaT.startResolutionForResult(zzaaR.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.nder.SendIntentException sendintentexception)
            {
                zzp.zzc(zzaaR);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(zzaaT.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(zzaaT.getErrorCode(), zzaaR.getActivity(), zzaaR, 2, zzaaR);
            return;
        } else
        {
            zzp.zza(zzaaR, zzaaS, zzaaT);
            return;
        }
    }

    public sult(zzp zzp1, int i, ConnectionResult connectionresult)
    {
        zzaaR = zzp1;
        super();
        zzaaS = i;
        zzaaT = connectionresult;
    }
}
