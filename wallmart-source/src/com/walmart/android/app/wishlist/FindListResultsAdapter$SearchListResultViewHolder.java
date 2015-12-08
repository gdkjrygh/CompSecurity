// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.wishlist:
//            FindListResultsAdapter

public static class mLastUpdateTextView extends BasicViewHolder
{

    final TextView mLastUpdateTextView;
    final TextView mListNameTextView;
    final TextView mListOwnerTextView;
    final TextView mStateTextView;

    (View view)
    {
        super(view);
        mListNameTextView = (TextView)ViewUtil.findViewById(view, 0x7f100632);
        mListOwnerTextView = (TextView)ViewUtil.findViewById(view, 0x7f100631);
        mStateTextView = (TextView)ViewUtil.findViewById(view, 0x7f100630);
        mLastUpdateTextView = (TextView)ViewUtil.findViewById(view, 0x7f100633);
    }
}
