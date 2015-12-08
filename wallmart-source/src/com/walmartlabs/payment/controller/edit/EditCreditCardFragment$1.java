// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            EditCreditCardFragment

class this._cls0
    implements android.view.r
{

    final EditCreditCardFragment this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag && (view instanceof EditText))
        {
            ((EditText)view).setText("");
        }
    }

    ()
    {
        this$0 = EditCreditCardFragment.this;
        super();
    }
}
