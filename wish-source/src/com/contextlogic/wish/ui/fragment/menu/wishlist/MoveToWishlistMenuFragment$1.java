// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlist;

import android.view.View;
import android.widget.AdapterView;
import com.contextlogic.wish.api.data.WishUserProductBucket;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlist:
//            MoveToWishlistMenuFragment

class this._cls0
    implements android.widget.er
{

    final MoveToWishlistMenuFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i > MoveToWishlistMenuFragment.access$000(MoveToWishlistMenuFragment.this).size())
        {
            return;
        }
        if (i == 0)
        {
            MoveToWishlistMenuFragment.access$100(MoveToWishlistMenuFragment.this);
            return;
        } else
        {
            MoveToWishlistMenuFragment.access$200(MoveToWishlistMenuFragment.this, (WishUserProductBucket)MoveToWishlistMenuFragment.access$000(MoveToWishlistMenuFragment.this).get(i - 1));
            return;
        }
    }

    ()
    {
        this$0 = MoveToWishlistMenuFragment.this;
        super();
    }
}
