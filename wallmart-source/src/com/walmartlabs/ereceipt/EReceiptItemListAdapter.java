// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.service.ImageDownloader;
import com.walmart.android.utils.UrlUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.ImageAdapter;
import com.walmartlabs.ui.PriceView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EReceiptItemListAdapter extends ImageAdapter
{

    private static final int IMAGE_FADE_DURATION = 300;
    static final String TAG = com/walmartlabs/ereceipt/EReceiptItemListAdapter.getSimpleName();
    private static final boolean sShouldAnimate = isAlphaAnimationSupported();
    private final Context mContext;
    private final ArrayList mCoupons = new ArrayList();
    private Bitmap mDefaultProductImage;
    private final HashMap mImageAnimations = new HashMap();
    private final ArrayList mItems = new ArrayList();

    public EReceiptItemListAdapter(Context context, ImageDownloader imagedownloader)
    {
        super(imagedownloader);
        mContext = context;
        mDefaultProductImage = BitmapFactory.decodeResource(mContext.getResources(), com.walmartlabs.android.ereceipt.R.drawable.msco_basket_item_nophoto);
    }

    private static boolean isAlphaAnimationSupported()
    {
        if ("LGE".equals(Build.MANUFACTURER))
        {
            int i = android.os.Build.VERSION.SDK_INT;
            if (i >= 9 && i <= 10)
            {
                return false;
            }
        }
        return true;
    }

    private void populateFields(View view, int i)
    {
        Object obj = (com.walmartlabs.ereceipt.service.EReceipt.Item)mItems.get(i);
        ViewUtil.setText(com.walmartlabs.android.ereceipt.R.id.ereceipt_item_entry_name, view, ((com.walmartlabs.ereceipt.service.EReceipt.Item) (obj)).getDisplayName());
        ((PriceView)ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.ereceipt_price)).setPrice(mContext.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_price, new Object[] {
            Float.valueOf(((com.walmartlabs.ereceipt.service.EReceipt.Item) (obj)).getPriceInDollar())
        }));
        TextView textview = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.ereceipt_item_entry_quantity);
        if (((com.walmartlabs.ereceipt.service.EReceipt.Item) (obj)).quantity > 1.0F)
        {
            textview.setText(mContext.getString(com.walmartlabs.android.ereceipt.R.string.ereceipts_quantity, new Object[] {
                Float.valueOf(((com.walmartlabs.ereceipt.service.EReceipt.Item) (obj)).quantity), Float.valueOf(((com.walmartlabs.ereceipt.service.EReceipt.Item) (obj)).getUnitPriceInDollar())
            }));
            textview.setVisibility(0);
        } else
        {
            textview.setVisibility(4);
        }
        obj = ((com.walmartlabs.ereceipt.service.EReceipt.Item) (obj)).productImageUrl;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = UrlUtils.getURLFromThumbnailURL(UrlUtils.IMAGE_SIZE_100, ((String) (obj)));
            setImage(i, view, com.walmartlabs.android.ereceipt.R.id.ereceipt_item_entry_image, ((String) (obj)));
            return;
        } else
        {
            ((ImageView)ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.R.id.ereceipt_item_entry_image)).setImageBitmap(mDefaultProductImage);
            return;
        }
    }

    public void addItems(com.walmartlabs.ereceipt.service.EReceipt.Item aitem[])
    {
        if (aitem == null || aitem.length == 0)
        {
            return;
        }
        int i = 0;
        while (i < aitem.length) 
        {
            com.walmartlabs.ereceipt.service.EReceipt.Item item = aitem[i];
            if (item != null)
            {
                if (item.coupon)
                {
                    mCoupons.add(item);
                } else
                {
                    mItems.add(item);
                }
            }
            i++;
        }
        notifyDataSetChanged();
    }

    public void finish()
    {
        enable(false);
        clearImages();
        mItems.clear();
        if (mDefaultProductImage != null && !mDefaultProductImage.isRecycled())
        {
            mDefaultProductImage.recycle();
        }
        mDefaultProductImage = null;
    }

    public int getCount()
    {
        return mItems.size();
    }

    public int getCouponSavings()
    {
        int i = 0;
        for (Iterator iterator = mCoupons.iterator(); iterator.hasNext();)
        {
            i += ((com.walmartlabs.ereceipt.service.EReceipt.Item)iterator.next()).price;
        }

        return i;
    }

    public Object getItem(int i)
    {
        return mItems.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemSubtotal()
    {
        int i = 0;
        for (Iterator iterator = mItems.iterator(); iterator.hasNext();)
        {
            i += ((com.walmartlabs.ereceipt.service.EReceipt.Item)iterator.next()).price;
        }

        return i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = ViewUtil.inflate(mContext, com.walmartlabs.android.ereceipt.R.layout.ereceipt_item_entry, viewgroup);
        }
        populateFields(view1, i);
        return view1;
    }

    protected void onImageSet(int i, View view, String s)
    {
        if (sShouldAnimate)
        {
            Animation animation = (Animation)mImageAnimations.get(s);
            Object obj = animation;
            if (animation == null)
            {
                obj = new AlphaAnimation(0.0F, 1.0F);
                ((Animation) (obj)).setDuration(300L);
                mImageAnimations.put(s, obj);
            }
            ((ImageView)view.findViewById(com.walmartlabs.android.ereceipt.R.id.ereceipt_item_entry_image)).setAnimation(((Animation) (obj)));
        }
    }

    protected void onRemovedFromCache(String s)
    {
        mImageAnimations.remove(s);
    }

    public void setItems(com.walmartlabs.ereceipt.service.EReceipt.Item aitem[])
    {
        mItems.clear();
        mCoupons.clear();
        addItems(aitem);
    }

}
