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
//            Api, g

class KM
    implements Runnable
{

    private final int KL;
    private final ConnectionResult KM;
    final g KN;

    public void run()
    {
        int i = Api.a;
        if (!KM.hasResolution()) goto _L2; else goto _L1
_L1:
        int j = KN.getActivity().getSupportFragmentManager().getFragments().indexOf(KN);
        KM.startResolutionForResult(KN.getActivity(), (j + 1 << 16) + 1);
_L3:
        return;
        android.content.ntSender.SendIntentException sendintentexception;
        sendintentexception;
        g.a(KN);
        if (i == 0) goto _L3; else goto _L2
_L2:
        boolean flag = GooglePlayServicesUtil.isUserRecoverableError(KM.getErrorCode());
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            GooglePlayServicesUtil.showErrorDialogFragment(KM.getErrorCode(), KN.getActivity(), KN, 2, KN);
        }
        // Misplaced declaration of an exception variable
        catch (android.content.ntSender.SendIntentException sendintentexception)
        {
            throw sendintentexception;
        }
        if (i == 0) goto _L3; else goto _L4
_L4:
        g.a(KN, KL, KM);
        return;
        sendintentexception;
        throw sendintentexception;
        sendintentexception;
        throw sendintentexception;
    }

    public onResult(g g1, int i, ConnectionResult connectionresult)
    {
        KN = g1;
        super();
        KL = i;
        KM = connectionresult;
    }
}
