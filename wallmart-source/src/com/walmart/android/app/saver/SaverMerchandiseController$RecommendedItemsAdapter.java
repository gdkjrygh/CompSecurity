// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.ui.StarsView;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

public static class mContext extends BasicAdapter
{
    public static class RecommendationViewHolder extends BasicViewHolder
    {

        public final ImageView image;
        public final TextView price;
        public final StarsView rating;
        public final TextView text;

        public RecommendationViewHolder(View view)
        {
            super(view);
            image = (ImageView)ViewUtil.findViewById(view, 0x7f100468);
            price = (TextView)ViewUtil.findViewById(view, 0x7f100469);
            text = (TextView)ViewUtil.findViewById(view, 0x7f10046a);
            rating = (StarsView)ViewUtil.findViewById(view, 0x7f10046b);
        }
    }


    private final Context mContext;
    private List mModel;
    private final int mPriceColor;
    private final Typeface mPriceTypeface;

    private List scrubData(List list)
    {
        Object obj = null;
        if (list != null)
        {
            ArrayList arraylist = new ArrayList(list.size());
            list = list.iterator();
            do
            {
                obj = arraylist;
                if (!list.hasNext())
                {
                    break;
                }
                obj = (com.walmart.android.service.saver.mmendationViewHolder)list.next();
                if (obj != null && !TextUtils.isEmpty(((com.walmart.android.service.saver.mmendationViewHolder) (obj)).mmendationViewHolder) && !TextUtils.isEmpty(((com.walmart.android.service.saver.mmendationViewHolder) (obj)).mmendationViewHolder) && !TextUtils.isEmpty(((com.walmart.android.service.saver.mmendationViewHolder) (obj)).mmendationViewHolder))
                {
                    arraylist.add(obj);
                }
            } while (true);
        }
        return ((List) (obj));
    }

    private void setStarRating(StarsView starsview, float f)
    {
        if (f > 0.0F)
        {
            starsview.setVisibility(0);
            starsview.setValue(f);
            return;
        } else
        {
            starsview.setVisibility(4);
            return;
        }
    }

    public com.walmart.android.service.saver.mmendationViewHolder getItem(int i)
    {
        return (com.walmart.android.service.saver.mmendationViewHolder)mModel.get(i);
    }

    public int getItemCount()
    {
        if (mModel != null)
        {
            return mModel.size();
        } else
        {
            return 0;
        }
    }

    public RecommendationViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        viewgroup = new RecommendationViewHolder(ViewUtil.inflate(mContext, 0x7f040140, viewgroup));
        ((RecommendationViewHolder) (viewgroup)).price.setTypeface(mPriceTypeface);
        ((RecommendationViewHolder) (viewgroup)).price.setTextColor(mPriceColor);
        return viewgroup;
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(RecommendationViewHolder recommendationviewholder, int i)
    {
        com.walmart.android.service.saver.mmendationViewHolder mmendationviewholder = (com.walmart.android.service.saver.mmendationViewHolder)mModel.get(i);
        Picasso.with(mContext).load(mmendationviewholder.text).placeholder(null).error(0x7f020342).into(recommendationviewholder.image);
        recommendationviewholder.price.setText((new StringBuilder()).append(mmendationviewholder.price).append(mmendationviewholder.price).append(DecimalFormatSymbols.getInstance().getDecimalSeparator()).append(String.format("%02d", new Object[] {
            Integer.valueOf(mmendationviewholder.price)
        })).toString());
        recommendationviewholder.text.setText(mmendationviewholder.text);
        setStarRating(recommendationviewholder.rating, mmendationviewholder.rating);
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((RecommendationViewHolder)basicviewholder, i);
    }

    public void setDataSource(List list)
    {
        mModel = scrubData(list);
        notifyDataSetChanged();
    }

    public RecommendationViewHolder.rating(Context context)
    {
        mContext = context;
        mPriceTypeface = Typefaces.create(mContext, com.walmart.android.wmui.pter.mContext);
        mPriceColor = mContext.getResources().getColor(0x7f0f006e);
    }
}
