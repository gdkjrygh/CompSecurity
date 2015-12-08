// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverSubmitReceiptActivity, SaverGettingResultsPresenter

private class <init>
    implements <init>
{

    final SaverSubmitReceiptActivity this$0;

    public void onForceClose()
    {
        setResult(10);
        finish();
    }

    public void onGettingResults()
    {
        SaverSubmitReceiptActivity.access$300(SaverSubmitReceiptActivity.this).pushPresenter(new SaverGettingResultsPresenter(), true);
    }

    public void onScanAnother()
    {
        setResult(12);
        finish();
    }

    public void onShowMerchandise(String s)
    {
        NavigationItemUtils.launchFromUri(SaverSubmitReceiptActivity.this, s);
        setResult(13);
        finish();
    }

    public void onShowReceipt(String s, String s1, String s2, String s3, boolean flag)
    {
        Intent intent = new Intent();
        intent.addFlags(0x20000);
        intent.putExtra("EXTRA_RECEIPT_ID", s);
        intent.putExtra("EXTRA_STORE_ID", s3);
        intent.putExtra("EXTRA_DATE", s2);
        intent.putExtra("EXTRA_FROM_SCANNER", true);
        intent.putExtra("EXTRA_TC_NUMBER", s1);
        setResult(11, intent);
        finish();
    }

    private ()
    {
        this$0 = SaverSubmitReceiptActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
