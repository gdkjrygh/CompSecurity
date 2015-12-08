// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            CreditCardValidator

static final class val.field
    implements android.content.issListener
{

    final View val$field;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (val$field != null)
        {
            val$field.requestFocus();
        }
    }

    (View view)
    {
        val$field = view;
        super();
    }
}
