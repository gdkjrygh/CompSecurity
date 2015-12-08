// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ereceipt;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.walmart.android.app.ereceipt:
//            EReceiptRegisterVerifyPresenter, EReceiptRegisterInputPresenter

class this._cls0 extends ClickableSpan
{

    final EReceiptRegisterVerifyPresenter this$0;

    public void onClick(View view)
    {
        if (EReceiptRegisterVerifyPresenter.access$100(EReceiptRegisterVerifyPresenter.this))
        {
            view = new EReceiptRegisterInputPresenter(EReceiptRegisterVerifyPresenter.access$200(EReceiptRegisterVerifyPresenter.this), false);
            EReceiptRegisterVerifyPresenter.access$300(EReceiptRegisterVerifyPresenter.this, view);
            return;
        } else
        {
            EReceiptRegisterVerifyPresenter.access$200(EReceiptRegisterVerifyPresenter.this).onBackPressed();
            return;
        }
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    ()
    {
        this$0 = EReceiptRegisterVerifyPresenter.this;
        super();
    }
}
