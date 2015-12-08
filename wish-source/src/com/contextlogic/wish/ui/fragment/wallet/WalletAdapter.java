// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.wallet;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishWalletItem;
import com.contextlogic.wish.cache.ImageCacheWarmer;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.DateUtil;
import java.util.ArrayList;

public class WalletAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        TextView expiryText;
        BorderedImageView firstImageView;
        int firstVisiblePosition;
        int position;
        BorderedImageView secondImageView;
        BorderedImageView thirdImageView;
        TextView titleText;
        View useButton;
        WishWalletItem walletItem;

        ItemRowHolder()
        {
        }
    }


    private ImageCacheWarmer cacheWarmer;
    private ArrayList data;
    private ListView listView;

    public WalletAdapter(Context context, ArrayList arraylist, ListView listview)
    {
        super(context, 0x7f0300ba, arraylist);
        data = arraylist;
        listView = listview;
        cacheWarmer = new ImageCacheWarmer();
    }

    public int getCount()
    {
        return data.size();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        WishWalletItem wishwalletitem;
        int j;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f0300ba, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.titleText = (TextView)view.findViewById(0x7f0d03f4);
            viewgroup.useButton = view.findViewById(0x7f0d03f6);
            viewgroup.expiryText = (TextView)view.findViewById(0x7f0d03f5);
            viewgroup.firstImageView = (BorderedImageView)view.findViewById(0x7f0d03f1);
            viewgroup.secondImageView = (BorderedImageView)view.findViewById(0x7f0d03f2);
            viewgroup.thirdImageView = (BorderedImageView)view.findViewById(0x7f0d03f3);
            ((ItemRowHolder) (viewgroup)).firstImageView.getImageView().setRequestedImageHeight(60);
            ((ItemRowHolder) (viewgroup)).firstImageView.getImageView().setRequestedImageWidth(60);
            ((ItemRowHolder) (viewgroup)).secondImageView.getImageView().setRequestedImageHeight(27);
            ((ItemRowHolder) (viewgroup)).secondImageView.getImageView().setRequestedImageWidth(27);
            ((ItemRowHolder) (viewgroup)).thirdImageView.getImageView().setRequestedImageHeight(27);
            ((ItemRowHolder) (viewgroup)).thirdImageView.getImageView().setRequestedImageWidth(27);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        if (((ItemRowHolder) (viewgroup)).walletItem != null && listView.getFirstVisiblePosition() >= ((ItemRowHolder) (viewgroup)).firstVisiblePosition && listView.getFirstVisiblePosition() <= ((ItemRowHolder) (viewgroup)).position)
        {
            ((ItemRowHolder) (viewgroup)).firstImageView.getImageView().lockImageInCache();
            ((ItemRowHolder) (viewgroup)).secondImageView.getImageView().lockImageInCache();
            ((ItemRowHolder) (viewgroup)).thirdImageView.getImageView().lockImageInCache();
        }
        wishwalletitem = (WishWalletItem)data.get(i);
        viewgroup.walletItem = wishwalletitem;
        viewgroup.firstVisiblePosition = listView.getFirstVisiblePosition();
        viewgroup.position = i;
        if (wishwalletitem.getType() == com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.GiftCard)
        {
            ((ItemRowHolder) (viewgroup)).useButton.setVisibility(0);
        } else
        {
            ((ItemRowHolder) (viewgroup)).useButton.setVisibility(8);
        }
        if (wishwalletitem.getType() == com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.GiftCard || wishwalletitem.getType() == com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.ExpiredGiftCard)
        {
            ((ItemRowHolder) (viewgroup)).titleText.setText(wishwalletitem.getTitleText());
        } else
        if (wishwalletitem.getDiscountPercent() >= 100D)
        {
            ((ItemRowHolder) (viewgroup)).titleText.setText(getContext().getString(0x7f060209));
        } else
        if (wishwalletitem.getDiscountPercent() > wishwalletitem.getDiscountValue().getValue())
        {
            ((ItemRowHolder) (viewgroup)).titleText.setText(String.format(getContext().getString(0x7f06020a), new Object[] {
                Double.valueOf(wishwalletitem.getDiscountPercent())
            }));
        } else
        {
            ((ItemRowHolder) (viewgroup)).titleText.setText(String.format(getContext().getString(0x7f060208), new Object[] {
                wishwalletitem.getDiscountValue()
            }));
        }
_L6:
        if (wishwalletitem.isExpired())
        {
            ((ItemRowHolder) (viewgroup)).expiryText.setTextColor(getContext().getResources().getColor(0x7f0c008c));
            ((ItemRowHolder) (viewgroup)).expiryText.setVisibility(0);
            ((ItemRowHolder) (viewgroup)).expiryText.setText(getContext().getString(0x7f060154));
        } else
        if (wishwalletitem.getExpiryDate() != null)
        {
            ((ItemRowHolder) (viewgroup)).expiryText.setTextColor(getContext().getResources().getColor(0x7f0c008e));
            ((ItemRowHolder) (viewgroup)).expiryText.setVisibility(0);
            ((ItemRowHolder) (viewgroup)).expiryText.setText(String.format(getContext().getString(0x7f060155), new Object[] {
                DateUtil.format("MMM d", wishwalletitem.getExpiryDate())
            }));
        } else
        {
            ((ItemRowHolder) (viewgroup)).expiryText.setVisibility(8);
        }
        ((ItemRowHolder) (viewgroup)).firstImageView.getImageView().setImageUrl(null);
        ((ItemRowHolder) (viewgroup)).firstImageView.getImageView().setImageBitmap(null);
        ((ItemRowHolder) (viewgroup)).secondImageView.getImageView().setImageUrl(null);
        ((ItemRowHolder) (viewgroup)).secondImageView.getImageView().setImageBitmap(null);
        ((ItemRowHolder) (viewgroup)).thirdImageView.getImageView().setImageUrl(null);
        ((ItemRowHolder) (viewgroup)).thirdImageView.getImageView().setImageBitmap(null);
        if (wishwalletitem.getPreviewImages().size() != 0) goto _L2; else goto _L1
_L1:
        ((ItemRowHolder) (viewgroup)).secondImageView.setVisibility(8);
        ((ItemRowHolder) (viewgroup)).thirdImageView.setVisibility(8);
        ((ItemRowHolder) (viewgroup)).firstImageView.getImageView().setImageResource(0x7f02019b);
_L4:
        if (cacheWarmer != null && listView.getLastVisiblePosition() >= 0)
        {
            i = Math.min(Math.max(i, listView.getLastVisiblePosition()) + 1, getCount());
            for (j = Math.min(i + 5, getCount()); i < j; i++)
            {
                viewgroup = (WishWalletItem)getItem(i);
                if (viewgroup.getPreviewImages().size() > 0)
                {
                    cacheWarmer.warmCache(((WishImage)viewgroup.getPreviewImages().get(0)).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Large), -1, 170);
                }
                if (viewgroup.getPreviewImages().size() > 1)
                {
                    cacheWarmer.warmCache(((WishImage)viewgroup.getPreviewImages().get(1)).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium), 80, 80);
                }
                if (viewgroup.getPreviewImages().size() > 2)
                {
                    cacheWarmer.warmCache(((WishImage)viewgroup.getPreviewImages().get(2)).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium), 80, 80);
                }
            }

        }
        break; /* Loop/switch isn't completed */
_L2:
        if (wishwalletitem.getPreviewImages().size() == 1)
        {
            ((ItemRowHolder) (viewgroup)).secondImageView.setVisibility(8);
            ((ItemRowHolder) (viewgroup)).thirdImageView.setVisibility(8);
        } else
        {
            ((ItemRowHolder) (viewgroup)).secondImageView.setVisibility(0);
            ((ItemRowHolder) (viewgroup)).thirdImageView.setVisibility(0);
        }
        ((ItemRowHolder) (viewgroup)).firstImageView.getImageView().setImageUrl(((WishImage)wishwalletitem.getPreviewImages().get(0)).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        if (wishwalletitem.getPreviewImages().size() > 1)
        {
            ((ItemRowHolder) (viewgroup)).secondImageView.getImageView().setImageUrl(((WishImage)wishwalletitem.getPreviewImages().get(1)).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        }
        if (wishwalletitem.getPreviewImages().size() > 2)
        {
            ((ItemRowHolder) (viewgroup)).thirdImageView.getImageView().setImageUrl(((WishImage)wishwalletitem.getPreviewImages().get(2)).getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        }
        if (true) goto _L4; else goto _L3
_L3:
        return view;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void pauseCacheWarming()
    {
        cacheWarmer.pause();
    }

    public void releaseImages()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    obj = (ItemRowHolder)obj;
                    ((ItemRowHolder) (obj)).firstImageView.getImageView().releaseImage();
                    ((ItemRowHolder) (obj)).secondImageView.getImageView().releaseImage();
                    ((ItemRowHolder) (obj)).thirdImageView.getImageView().releaseImage();
                }
            }

        }
    }

    public void restoreImages()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    obj = (ItemRowHolder)obj;
                    ((ItemRowHolder) (obj)).firstImageView.getImageView().restoreImage();
                    ((ItemRowHolder) (obj)).secondImageView.getImageView().restoreImage();
                    ((ItemRowHolder) (obj)).thirdImageView.getImageView().restoreImage();
                }
            }

        }
    }

    public void resumeCacheWarming()
    {
        cacheWarmer.resume();
    }
}
