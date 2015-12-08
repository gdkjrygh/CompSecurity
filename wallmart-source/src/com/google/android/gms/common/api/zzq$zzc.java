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
//            zzq

private class zzaaT
    implements Runnable
{

    private final int zzaaS;
    private final ConnectionResult zzaaT;
    final zzq zzaaW;

    public void run()
    {
        if (zzaaT.hasResolution())
        {
            try
            {
                int i = zzaaW.getActivity().getSupportFragmentManager().getFragments().indexOf(zzaaW);
                zzaaT.startResolutionForResult(zzaaW.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.nder.SendIntentException sendintentexception)
            {
                zzq.zza(zzaaW);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(zzaaT.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(zzaaT.getErrorCode(), zzaaW.getActivity(), zzaaW, 2, zzaaW);
            return;
        } else
        {
            zzq.zza(zzaaW, zzaaS, zzaaT);
            return;
        }
    }

    public sult(zzq zzq1, int i, ConnectionResult connectionresult)
    {
        zzaaW = zzq1;
        super();
        zzaaS = i;
        zzaaT = connectionresult;
    }
}
