// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.support.v4.app.FragmentTransaction;
import com.uservoice.uservoicesdk.ui.MixedSearchAdapter;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            BaseActivity

class this._cls0
    implements android.support.v7.app.stener
{

    final BaseActivity this$0;

    public void onTabReselected(android.support.v7.app.seActivity._cls1 _pcls1, FragmentTransaction fragmenttransaction)
    {
    }

    public void onTabSelected(android.support.v7.app.seActivity._cls1 _pcls1, FragmentTransaction fragmenttransaction)
    {
        searchAdapter.setScope(((Integer)_pcls1.etTag()).intValue());
    }

    public void onTabUnselected(android.support.v7.app.seActivity._cls1 _pcls1, FragmentTransaction fragmenttransaction)
    {
    }

    ()
    {
        this$0 = BaseActivity.this;
        super();
    }
}
