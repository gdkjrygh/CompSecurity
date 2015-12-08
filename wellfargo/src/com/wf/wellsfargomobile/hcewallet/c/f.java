// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.c;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.hcewallet.activity.WalletPayNowActivity;
import com.wf.wellsfargomobile.hcewallet.activity.WalletPinActivity;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.c:
//            d

class f
    implements android.view.View.OnClickListener
{

    final d a;

    f(d d1)
    {
        a = d1;
        super();
    }

    public void onClick(View view)
    {
        if (WFApp.k != 1) goto _L2; else goto _L1
_L1:
        view = new Intent(a.getActivity(), com/wf/wellsfargomobile/hcewallet/activity/WalletPayNowActivity);
        if (a.getActivity() instanceof BaseWebViewActivity)
        {
            ((BaseWebViewActivity)a.getActivity()).startActivityForResult(view, 10002);
        }
_L4:
        d.a(a);
        a.dismiss();
        return;
_L2:
        if (WFApp.k == 2)
        {
            view = new Intent(a.getActivity().getApplicationContext(), com/wf/wellsfargomobile/hcewallet/activity/WalletPinActivity);
            if (a.getActivity() instanceof BaseWebViewActivity)
            {
                ((BaseWebViewActivity)a.getActivity()).startActivity(view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
