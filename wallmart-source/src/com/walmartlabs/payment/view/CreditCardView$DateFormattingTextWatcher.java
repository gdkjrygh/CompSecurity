// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.walmartlabs.payment.view:
//            CreditCardView

private static class <init>
    implements TextWatcher
{

    public void afterTextChanged(Editable editable)
    {
        if (editable.length() == 4 && !editable.toString().contains("/"))
        {
            editable.insert(2, "/");
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
