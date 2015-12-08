// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.walmartlabs.payment.view:
//            CreditCardView

private class <init>
    implements TextWatcher
{

    final CreditCardView this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        CreditCardView.access$700(CreditCardView.this, String.valueOf(charsequence), CreditCardView.access$600(CreditCardView.this));
    }

    private ()
    {
        this$0 = CreditCardView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
