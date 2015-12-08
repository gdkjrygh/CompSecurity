// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.ratings;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.ratings:
//            RatingsFragment

class this._cls0
    implements android.widget.ClickListener
{

    final RatingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        RatingsFragment.access$200(RatingsFragment.this, i);
    }

    A()
    {
        this$0 = RatingsFragment.this;
        super();
    }
}
