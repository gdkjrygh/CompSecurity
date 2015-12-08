// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.support.v4.app.FragmentActivity;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptFragment, SaverGettingResultsPresenter, SaverReceiptDetailsPresenter, SaverReceiptListPresenter

private class <init>
    implements 
{

    private final SaverReceiptListPresenter mListPresenter;
    final SaverReceiptFragment this$0;

    public void onForceClose()
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            SaverReceiptFragment.access$1700(SaverReceiptFragment.this).popPresenter();
        }
    }

    public void onGettingResults()
    {
        SaverReceiptFragment.access$1600(SaverReceiptFragment.this).pushPresenter(new SaverGettingResultsPresenter(), true);
    }

    public void onScanAnother()
    {
    }

    public void onShowMerchandise(String s)
    {
        NavigationItemUtils.launchFromUri(getActivity(), s);
    }

    public void onShowReceipt(String s, String s1, String s2, String s3, boolean flag)
    {
        if (mListPresenter != null)
        {
            s = new SaverReceiptDetailsPresenter(getActivity(), s, new nit>(SaverReceiptFragment.this, mListPresenter, null));
            SaverReceiptFragment.access$1400(SaverReceiptFragment.this).pushAndReplacePresenter(s, true);
            return;
        } else
        {
            SaverReceiptFragment.access$1500(SaverReceiptFragment.this).popPresenter();
            return;
        }
    }

    private (SaverReceiptListPresenter saverreceiptlistpresenter)
    {
        this$0 = SaverReceiptFragment.this;
        super();
        mListPresenter = saverreceiptlistpresenter;
    }

    mListPresenter(SaverReceiptListPresenter saverreceiptlistpresenter, mListPresenter mlistpresenter)
    {
        this(saverreceiptlistpresenter);
    }
}
