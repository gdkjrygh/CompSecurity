// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.edit;

import android.content.DialogInterface;
import android.view.View;

// Referenced classes of package com.walmartlabs.payment.controller.edit:
//            GiftCardValidator

static final class val.field
    implements android.content.smissListener
{

    final View val$field;

    public void onDismiss(DialogInterface dialoginterface)
    {
        val$field.requestFocus();
    }

    A(View view)
    {
        val$field = view;
        super();
    }
}
