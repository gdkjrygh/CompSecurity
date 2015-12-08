// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.walmartlabs.payment.view:
//            CreditCardView

private static class <init>
    implements android.view.sChangeListener
{

    public void onFocusChange(View view, boolean flag)
    {
        if (view instanceof EditText)
        {
            view = (EditText)view;
            String s = view.getText().toString();
            if (s.length() == 3)
            {
                view.setText((new StringBuilder()).append('0').append(s.charAt(0)).append("/").append(s.substring(1, 3)));
            }
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
