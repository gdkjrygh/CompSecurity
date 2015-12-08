// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.c;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.wf.wellsfargomobile.hcewallet.activity.WalletSignOnActivity;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.c:
//            a

class b
    implements android.view.View.OnClickListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(a.getActivity(), com/wf/wellsfargomobile/hcewallet/activity/WalletSignOnActivity);
        view.putExtra("cvid", "CWAC");
        a.getActivity().startActivity(view);
        a.dismiss();
    }
}
