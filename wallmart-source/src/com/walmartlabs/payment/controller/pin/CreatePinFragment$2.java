// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.pin;

import android.view.View;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmartlabs.payment.controller.pin:
//            CreatePinFragment

class this._cls0
    implements android.view.
{

    final CreatePinFragment this$0;

    public void onClick(View view)
    {
        if (CreatePinFragment.access$100(CreatePinFragment.this) != null)
        {
            ViewUtil.showKeyboard(CreatePinFragment.access$100(CreatePinFragment.this));
        }
    }

    ()
    {
        this$0 = CreatePinFragment.this;
        super();
    }
}
