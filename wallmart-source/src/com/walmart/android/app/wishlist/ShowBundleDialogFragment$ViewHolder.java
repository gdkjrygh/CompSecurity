// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ShowBundleDialogFragment

private static class mItemName extends BasicViewHolder
{

    private final Context mContext;
    private final ImageView mItemImage;
    private final TextView mItemName;

    public void updateView(com.walmart.android.service.wishlist.models.X x)
    {
        mItemName.setText(x.e());
        x = x.geUrl();
        if (!TextUtils.isEmpty(x))
        {
            Picasso.with(mContext).load(x).error(0x7f02021b).into(mItemImage);
            return;
        } else
        {
            mItemImage.setImageResource(0x7f02021b);
            return;
        }
    }

    public nent(Context context, View view)
    {
        super(view);
        mContext = context;
        mItemImage = (ImageView)ViewUtil.findViewById(view, 0x7f100618);
        mItemName = (TextView)ViewUtil.findViewById(view, 0x7f1001a2);
    }
}
