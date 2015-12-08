// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverSubmitReceiptActivity, SaverNearbyCompetitorsPresenter

private class <init>
    implements <init>
{

    final SaverSubmitReceiptActivity this$0;

    public void onForceClose()
    {
        setResult(10);
        finish();
    }

    public void onReceiptInfoEntered(String s, String s1)
    {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_TC_NUMBER", s);
        intent.putExtra("EXTRA_DATE", s1);
        setResult(-1, intent);
        finish();
    }

    public void onShowCompetitors(String s, String s1, String s2, String s3, boolean flag)
    {
        setResult(-1);
        SaverSubmitReceiptActivity.access$200(SaverSubmitReceiptActivity.this).pushAndReplacePresenter(new SaverNearbyCompetitorsPresenter(SaverSubmitReceiptActivity.this, s, s3, s1, s2, flag, new ck(SaverSubmitReceiptActivity.this, null)), true);
    }

    public void onShowReceipt(String s, String s1, String s2, String s3, boolean flag)
    {
        Intent intent = new Intent();
        intent.addFlags(0x20000);
        intent.putExtra("EXTRA_RECEIPT_ID", s);
        intent.putExtra("EXTRA_STORE_ID", s3);
        intent.putExtra("EXTRA_TC_NUMBER", s1);
        intent.putExtra("EXTRA_DATE", s2);
        intent.putExtra("EXTRA_FROM_SCANNER", true);
        setResult(11, intent);
        finish();
    }

    private ck()
    {
        this$0 = SaverSubmitReceiptActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
