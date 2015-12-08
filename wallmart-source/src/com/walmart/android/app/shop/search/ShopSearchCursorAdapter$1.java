// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.search;

import android.view.View;

// Referenced classes of package com.walmart.android.app.shop.search:
//            ShopSearchCursorAdapter

class val.text
    implements android.view.pSearchCursorAdapter._cls1
{

    final ShopSearchCursorAdapter this$0;
    final String val$text;

    public void onClick(View view)
    {
        if (ShopSearchCursorAdapter.access$000(ShopSearchCursorAdapter.this) != null)
        {
            ShopSearchCursorAdapter.access$000(ShopSearchCursorAdapter.this).refinement(val$text);
        }
    }

    RefinementListener()
    {
        this$0 = final_shopsearchcursoradapter;
        val$text = String.this;
        super();
    }
}
