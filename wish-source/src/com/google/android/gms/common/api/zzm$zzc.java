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

private class zzRk
    implements Runnable
{

    private final int zzRj;
    private final ConnectionResult zzRk;
    final zzm zzRn;

    public void run()
    {
        if (zzRk.hasResolution())
        {
            try
            {
                int i = zzRn.getActivity().getSupportFragmentManager().getFragments().indexOf(zzRn);
                zzRk.startResolutionForResult(zzRn.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.nder.SendIntentException sendintentexception)
            {
                zzm.zza(zzRn);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(zzRk.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(zzRk.getErrorCode(), zzRn.getActivity(), zzRn, 2, zzRn);
            return;
        } else
        {
            zzm.zza(zzRn, zzRj, zzRk);
            return;
        }
    }

    public sult(zzm zzm1, int i, ConnectionResult connectionresult)
    {
        zzRn = zzm1;
        super();
        zzRj = i;
        zzRk = connectionresult;
    }
}
