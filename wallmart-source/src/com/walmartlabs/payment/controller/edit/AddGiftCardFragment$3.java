// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            AddGiftCardFragment

class this._cls0 extends ClickableSpan
{

    final AddGiftCardFragment this$0;

    public void onClick(View view)
    {
        byte byte0 = 0;
        boolean flag;
        if (AddGiftCardFragment.access$400(AddGiftCardFragment.this).getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = AddGiftCardFragment.access$400(AddGiftCardFragment.this);
        if (flag)
        {
            byte0 = 8;
        }
        view.setVisibility(byte0);
        AddGiftCardFragment.access$600(AddGiftCardFragment.this, AddGiftCardFragment.access$500(AddGiftCardFragment.this), flag);
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    ()
    {
        this$0 = AddGiftCardFragment.this;
        super();
    }
}
