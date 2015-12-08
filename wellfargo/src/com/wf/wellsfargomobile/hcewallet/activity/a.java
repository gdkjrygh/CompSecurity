// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.activity;

import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.activity:
//            WalletErrorCVActivity

class a
    implements android.view.View.OnClickListener
{

    final WalletErrorCVActivity a;

    a(WalletErrorCVActivity walleterrorcvactivity)
    {
        a = walleterrorcvactivity;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
