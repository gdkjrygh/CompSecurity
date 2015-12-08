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
//            zzn

private class zzYf
    implements Runnable
{

    private final int zzYe;
    private final ConnectionResult zzYf;
    final zzn zzYi;

    public void run()
    {
        if (zzYf.hasResolution())
        {
            try
            {
                int i = zzYi.getActivity().getSupportFragmentManager().getFragments().indexOf(zzYi);
                zzYf.startResolutionForResult(zzYi.getActivity(), (i + 1 << 16) + 1);
                return;
            }
            catch (android.content.nder.SendIntentException sendintentexception)
            {
                zzn.zza(zzYi);
            }
            return;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(zzYf.getErrorCode()))
        {
            GooglePlayServicesUtil.showErrorDialogFragment(zzYf.getErrorCode(), zzYi.getActivity(), zzYi, 2, zzYi);
            return;
        } else
        {
            zzn.zza(zzYi, zzYe, zzYf);
            return;
        }
    }

    public sult(zzn zzn1, int i, ConnectionResult connectionresult)
    {
        zzYi = zzn1;
        super();
        zzYe = i;
        zzYf = connectionresult;
    }
}
