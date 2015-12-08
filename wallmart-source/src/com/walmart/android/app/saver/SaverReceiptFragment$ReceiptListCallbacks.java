// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.support.v4.app.FragmentActivity;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.SaverUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptFragment, SaverReceiptDetailsPresenter, SaverNearbyCompetitorsPresenter, SaverReceiptListPresenter

private class <init>
    implements <init>
{

    final SaverReceiptFragment this$0;

    public void launchDetails(SaverReceiptListPresenter saverreceiptlistpresenter, String s)
    {
        saverreceiptlistpresenter = new SaverReceiptDetailsPresenter(getActivity(), s, new ks(SaverReceiptFragment.this, saverreceiptlistpresenter, null));
        SaverReceiptFragment.access$200(SaverReceiptFragment.this).pushPresenter(saverreceiptlistpresenter, true);
    }

    public void launchSignIn()
    {
        startActivityForResult(SaverUtils.createSignInIntent(getActivity()), 1);
        getActivity().overridePendingTransition(0x7f05002c, 0x7f050033);
    }

    public void onShowCompetitors(SaverReceiptListPresenter saverreceiptlistpresenter, String s, String s1, String s2, String s3)
    {
        SaverReceiptFragment.access$400(SaverReceiptFragment.this).pushPresenter(new SaverNearbyCompetitorsPresenter(getActivity(), s, s3, s1, s2, false, new back(SaverReceiptFragment.this, saverreceiptlistpresenter, null)), true);
    }

    private back()
    {
        this$0 = SaverReceiptFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
