// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            TermsConditionsFragment

class this._cls0 extends ClickableSpan
{

    final TermsConditionsFragment this$0;

    public void onClick(View view)
    {
        ((llback)TermsConditionsFragment.access$200(TermsConditionsFragment.this)).onPrivacy();
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    llback()
    {
        this$0 = TermsConditionsFragment.this;
        super();
    }
}
