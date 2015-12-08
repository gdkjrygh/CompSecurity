// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            ProductDetailsAddToCartModal

class this._cls0
    implements android.widget.ner
{

    final ProductDetailsAddToCartModal this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (String)ProductDetailsAddToCartModal.access$700(ProductDetailsAddToCartModal.this).get(i);
        if (ProductDetailsAddToCartModal.access$800(ProductDetailsAddToCartModal.this) != null && ProductDetailsAddToCartModal.access$800(ProductDetailsAddToCartModal.this).equals(adapterview))
        {
            return;
        }
        if (!adapterview.equals(ProductDetailsAddToCartModal.access$900(ProductDetailsAddToCartModal.this)))
        {
            ProductDetailsAddToCartModal.access$802(ProductDetailsAddToCartModal.this, adapterview);
        } else
        {
            ProductDetailsAddToCartModal.access$802(ProductDetailsAddToCartModal.this, null);
        }
        ProductDetailsAddToCartModal.access$600(ProductDetailsAddToCartModal.this);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = ProductDetailsAddToCartModal.this;
        super();
    }
}
