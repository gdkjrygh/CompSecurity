// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.app.item.view.VariantView;

// Referenced classes of package com.walmart.android.app.item:
//            VariantController

class val.variantView
    implements com.walmart.android.app.item.view.ckedListener
{

    final VariantController this$0;
    final atchVariantAdapter val$adapter;
    final VariantView val$variantView;

    public void onValueClicked(int i)
    {
        com.walmart.android.service.item.ickedListener ickedlistener = (com.walmart.android.service.item.ickedListener)val$adapter.getItem(i);
        VariantController.access$100(VariantController.this, val$variantView, ickedlistener);
    }

    atchVariantAdapter()
    {
        this$0 = final_variantcontroller;
        val$adapter = atchvariantadapter;
        val$variantView = VariantView.this;
        super();
    }
}
