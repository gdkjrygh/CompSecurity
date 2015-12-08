// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.ratings;

import android.view.View;
import com.contextlogic.wish.api.data.WishRating;

// Referenced classes of package com.contextlogic.wish.ui.fragment.ratings:
//            RatingsAdapter

class val.rating
    implements android.view.ner
{

    final RatingsAdapter this$0;
    final WishRating val$rating;

    public void onClick(View view)
    {
        RatingsAdapter.access$000(RatingsAdapter.this, val$rating.getImageLargeUrlString());
    }

    ()
    {
        this$0 = final_ratingsadapter;
        val$rating = WishRating.this;
        super();
    }
}
