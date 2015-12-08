// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlist;

import android.view.View;
import android.widget.AdapterView;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlist:
//            WishlistMenuFragment

class this._cls0
    implements android.widget.Listener
{

    final WishlistMenuFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        WishlistMenuFragment.access$100(WishlistMenuFragment.this, (WishUserProductBucket)WishlistMenuFragment.access$000(WishlistMenuFragment.this).get(i));
    }

    ()
    {
        this$0 = WishlistMenuFragment.this;
        super();
    }
}
