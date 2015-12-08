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
//            zzl

private class zzRk
    implements Runnable
{

    final zzl zzRi;
    private final int zzRj;
    private final ConnectionResult zzRk;

    public void run()
    {
        if (!zzl.zza(zzRi) || zzl.zzb(zzRi))
        {
            return;
        }
        zzl.zza(zzRi, true);
        zzl.zza(zzRi, zzRj);
        zzl.zza(zzRi, zzRk);
        if (zzRk.hasResolution())
        {
            try
            {
                int i = zzRi.getActivity().getSupportFragmentManager().getFragments().indexOf(zzRi);
                zzRk.startResolutionForResult(zzRi.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.nder.SendIntentException sendintentexception)
            {
                zzl.zzc(zzRi);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(zzRk.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(zzRk.getErrorCode(), zzRi.getActivity(), zzRi, 2, zzRi);
            return;
        } else
        {
            zzl.zza(zzRi, zzRj, zzRk);
            return;
        }
    }

    public sult(zzl zzl1, int i, ConnectionResult connectionresult)
    {
        zzRi = zzl1;
        super();
        zzRj = i;
        zzRk = connectionresult;
    }
}
