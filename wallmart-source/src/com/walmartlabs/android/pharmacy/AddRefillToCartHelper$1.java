// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.DialogInterface;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            AddRefillToCartHelper

class this._cls0
    implements android.content.sListener
{

    final AddRefillToCartHelper this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        AddRefillToCartHelper.access$000(AddRefillToCartHelper.this).onCancel();
    }

    dRefillToCartCallback()
    {
        this$0 = AddRefillToCartHelper.this;
        super();
    }
}
