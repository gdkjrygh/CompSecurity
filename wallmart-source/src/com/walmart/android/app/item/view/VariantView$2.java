// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.view.View;

// Referenced classes of package com.walmart.android.app.item.view:
//            VariantView

class val.view
    implements android.view.stener
{

    final VariantView this$0;
    final View val$view;

    public void onClick(View view1)
    {
        while (view1.isSelected() || VariantView.access$100(VariantView.this) == null) 
        {
            return;
        }
        VariantView.access$100(VariantView.this).onValueClicked(((Integer)val$view.getTag(0x7f10000d)).intValue());
    }

    lueClickedListener()
    {
        this$0 = final_variantview;
        val$view = View.this;
        super();
    }
}
