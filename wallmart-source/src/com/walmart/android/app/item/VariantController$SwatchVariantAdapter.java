// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.CornerRadiusDrawable;
import com.walmart.android.wmui.DrawableTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            VariantController

private static class mContext extends BaseAdapter
{

    private final Context mContext;
    private final int mCornerRadius;
    private final int mImageSize;
    private final List mVariantValues;
    private final View mViews[];

    public int getCount()
    {
        return mViews.length;
    }

    public Object getItem(int i)
    {
        if (i >= 0 && i < mVariantValues.size())
        {
            return mVariantValues.get(i);
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = null;
        if (i < mViews.length)
        {
            com.walmart.android.service.item.iantValues iantvalues = (com.walmart.android.service.item.ws)mVariantValues.get(i);
            View view1 = mViews[i];
            view = view1;
            if (view1 == null)
            {
                if (!TextUtils.isEmpty(iantvalues.ws()))
                {
                    view = ViewUtil.inflate(mContext, 0x7f04008b, viewgroup);
                    viewgroup = (ImageView)ViewUtil.findViewById(view, 0x7f1001f9);
                    Picasso.with(mContext).load(iantvalues.text()).error(0x7f020340).resize(mImageSize, mImageSize).into(new DrawableTarget(viewgroup) {

                        final VariantController.SwatchVariantAdapter this$0;

                        protected Drawable createDrawable(Bitmap bitmap)
                        {
                            return new CornerRadiusDrawable(bitmap, mCornerRadius);
                        }

            
            {
                this$0 = VariantController.SwatchVariantAdapter.this;
                super(imageview);
            }
                    });
                } else
                {
                    view = ViewUtil.inflate(mContext, 0x7f04008c, viewgroup);
                    ViewUtil.setText(0x7f1001fa, view, iantvalues.text());
                }
                mViews[i] = view;
            }
        }
        return view;
    }


    public _cls1.this._cls0(Context context, Collection collection)
    {
        mContext = context;
        mVariantValues = new ArrayList(collection);
        mViews = new View[mVariantValues.size()];
        mCornerRadius = mContext.getResources().getDimensionPixelSize(0x7f0a00af);
        mImageSize = mContext.getResources().getDimensionPixelSize(0x7f0a00b0);
    }
}
