// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishPriceExpiryInfo;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartEditModal, CartItemWarningMessageRow

public class CartItemsAdapter extends BaseAdapter
{
    static class ItemRowHolder
    {

        LinearLayout colorContainer;
        TextView colorText;
        LinearLayout countdownContainer;
        CountdownTimerView countdownTimer;
        TextView editButton;
        BorderedImageView imageView;
        LinearLayout productRatingContainer;
        ImageView productRatingStarFive;
        ImageView productRatingStarFour;
        ImageView productRatingStarOne;
        ImageView productRatingStarThree;
        ImageView productRatingStarTwo;
        TextView productRatingText;
        LinearLayout quantityContainer;
        TextView quantityText;
        TextView removeButton;
        TextView rowOriginalPrice;
        TextView rowPrice;
        TextView rowTitle;
        LinearLayout shippingContainer;
        TextView shippingText;
        LinearLayout sizeContainer;
        TextView sizeText;
        TextView urgencyText;
        LinearLayout warningMessageContainer;

        public void hideProductRating()
        {
            productRatingContainer.setVisibility(8);
            productRatingStarOne.setVisibility(8);
            productRatingStarTwo.setVisibility(8);
            productRatingStarThree.setVisibility(8);
            productRatingStarFour.setVisibility(8);
            productRatingStarFive.setVisibility(8);
            productRatingText.setVisibility(8);
        }

        public void showProductRating()
        {
            productRatingContainer.setVisibility(0);
            productRatingStarOne.setVisibility(0);
            productRatingStarTwo.setVisibility(0);
            productRatingStarThree.setVisibility(0);
            productRatingStarFour.setVisibility(0);
            productRatingStarFive.setVisibility(0);
            productRatingText.setVisibility(0);
        }

        ItemRowHolder()
        {
        }
    }


    private CartManager cartManager;
    private ListView listView;

    public CartItemsAdapter(CartManager cartmanager, ListView listview)
    {
        cartManager = cartmanager;
        listView = listview;
    }

    private void cleanCartTimer(ItemRowHolder itemrowholder)
    {
        if (itemrowholder.countdownTimer != null)
        {
            itemrowholder.countdownTimer.pauseTimer();
        }
        itemrowholder.countdownContainer.removeAllViews();
        itemrowholder.countdownContainer.setVisibility(8);
    }

    private void editProduct(WishCartItem wishcartitem)
    {
        (new CartEditModal(cartManager)).showForCartItem(wishcartitem, new CartEditModal.Callback() {

            final CartItemsAdapter this$0;

            public void onCancel()
            {
            }

            public void onEdit(WishCartItem wishcartitem1, int i)
            {
                cartManager.updateCart(wishcartitem1.getProductId(), wishcartitem1.getVariationId(), i);
            }

            
            {
                this$0 = CartItemsAdapter.this;
                super();
            }
        });
    }

    private void removeProduct(WishCartItem wishcartitem)
    {
        cartManager.removeProduct(wishcartitem);
    }

    private void showProduct(WishCartItem wishcartitem)
    {
        wishcartitem = new WishProduct(wishcartitem.getProductId());
        cartManager.getActivity();
        wishcartitem = RootActivity.getProductDetailFragment(wishcartitem, null, null, null);
        wishcartitem.getArguments().putBoolean("ArgFromCart", true);
        cartManager.getActivity().setContentFragment(wishcartitem, false);
        cartManager.close();
    }

    private void updateCartTimer(final WishCartItem item, ItemRowHolder itemrowholder)
    {
        cleanCartTimer(itemrowholder);
        if (item.getPriceExpiryInfo() != null && !item.getPriceExpiryInfo().isExpired() && item.getPriceExpiryInfo().getExpiry().before(new Date(System.currentTimeMillis() + 0x36ee80L)))
        {
            itemrowholder.countdownTimer = new CountdownTimerView(cartManager.getActivity());
            itemrowholder.countdownTimer.setup(item.getPriceExpiryInfo().getExpiry(), 18, getContext().getResources().getColor(0x7f0c00e8), getContext().getResources().getColor(0x7f0c00c6));
            itemrowholder.countdownTimer.startTimer();
            itemrowholder.countdownContainer.addView(itemrowholder.countdownTimer);
            itemrowholder.countdownContainer.setVisibility(0);
            itemrowholder.countdownContainer.setOnClickListener(new android.view.View.OnClickListener() {

                final CartItemsAdapter this$0;
                final WishCartItem val$item;

                public void onClick(View view)
                {
                    cartManager.showPriceExpiryInfo(item);
                }

            
            {
                this$0 = CartItemsAdapter.this;
                item = wishcartitem;
                super();
            }
            });
        }
    }

    public void cleanCartTimers()
    {
        if (listView != null)
        {
            for (int i = 0; i < listView.getChildCount(); i++)
            {
                Object obj = listView.getChildAt(i).getTag();
                if (obj != null && (obj instanceof ItemRowHolder))
                {
                    cleanCartTimer((ItemRowHolder)obj);
                }
            }

        }
    }

    protected Context getContext()
    {
        return cartManager.getActivity();
    }

    public int getCount()
    {
        if (cartManager.getCart() != null && cartManager.getCart().getItems() != null)
        {
            return cartManager.getCart().getItems().size();
        } else
        {
            return 0;
        }
    }

    public WishCartItem getItem(int i)
    {
        return (WishCartItem)cartManager.getCart().getItems().get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        final WishCartItem item;
        boolean flag;
        if (view == null)
        {
            view = ((Activity)getContext()).getLayoutInflater().inflate(0x7f030026, viewgroup, false);
            viewgroup = new ItemRowHolder();
            viewgroup.imageView = (BorderedImageView)view.findViewById(0x7f0d00fe);
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().setRequestedImageWidth(100);
            ((ItemRowHolder) (viewgroup)).imageView.getImageView().setRequestedImageHeight(100);
            viewgroup.rowTitle = (TextView)view.findViewById(0x7f0d0108);
            viewgroup.rowPrice = (TextView)view.findViewById(0x7f0d0112);
            viewgroup.rowOriginalPrice = (TextView)view.findViewById(0x7f0d0111);
            ((ItemRowHolder) (viewgroup)).rowOriginalPrice.setPaintFlags(((ItemRowHolder) (viewgroup)).rowOriginalPrice.getPaintFlags() | 0x10);
            viewgroup.urgencyText = (TextView)view.findViewById(0x7f0d0106);
            viewgroup.editButton = (TextView)view.findViewById(0x7f0d0115);
            ((ItemRowHolder) (viewgroup)).editButton.setText(getContext().getString(0x7f060135).toLowerCase());
            ((ItemRowHolder) (viewgroup)).editButton.setPaintFlags(((ItemRowHolder) (viewgroup)).editButton.getPaintFlags() | 8);
            viewgroup.removeButton = (TextView)view.findViewById(0x7f0d0114);
            ((ItemRowHolder) (viewgroup)).removeButton.setText(getContext().getString(0x7f06036e).toLowerCase());
            ((ItemRowHolder) (viewgroup)).removeButton.setPaintFlags(((ItemRowHolder) (viewgroup)).removeButton.getPaintFlags() | 8);
            viewgroup.sizeContainer = (LinearLayout)view.findViewById(0x7f0d0109);
            viewgroup.sizeText = (TextView)view.findViewById(0x7f0d010a);
            viewgroup.colorContainer = (LinearLayout)view.findViewById(0x7f0d010b);
            viewgroup.colorText = (TextView)view.findViewById(0x7f0d010c);
            viewgroup.quantityContainer = (LinearLayout)view.findViewById(0x7f0d010d);
            viewgroup.quantityText = (TextView)view.findViewById(0x7f0d010e);
            viewgroup.shippingContainer = (LinearLayout)view.findViewById(0x7f0d010f);
            viewgroup.shippingText = (TextView)view.findViewById(0x7f0d0110);
            viewgroup.warningMessageContainer = (LinearLayout)view.findViewById(0x7f0d0113);
            viewgroup.productRatingContainer = (LinearLayout)view.findViewById(0x7f0d00ff);
            viewgroup.productRatingText = (TextView)view.findViewById(0x7f0d0105);
            viewgroup.productRatingStarOne = (ImageView)view.findViewById(0x7f0d0100);
            viewgroup.productRatingStarTwo = (ImageView)view.findViewById(0x7f0d0101);
            viewgroup.productRatingStarThree = (ImageView)view.findViewById(0x7f0d0102);
            viewgroup.productRatingStarFour = (ImageView)view.findViewById(0x7f0d0103);
            viewgroup.productRatingStarFive = (ImageView)view.findViewById(0x7f0d0104);
            viewgroup.countdownContainer = (LinearLayout)view.findViewById(0x7f0d00fd);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (ItemRowHolder)view.getTag();
        }
        item = getItem(i);
        flag = CartExperimentManager.mustUseUsd(cartManager);
        ((ItemRowHolder) (viewgroup)).editButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartItemsAdapter this$0;
            final WishCartItem val$item;

            public void onClick(View view1)
            {
                editProduct(item);
            }

            
            {
                this$0 = CartItemsAdapter.this;
                item = wishcartitem;
                super();
            }
        });
        ((ItemRowHolder) (viewgroup)).removeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartItemsAdapter this$0;
            final WishCartItem val$item;

            public void onClick(View view1)
            {
                removeProduct(item);
            }

            
            {
                this$0 = CartItemsAdapter.this;
                item = wishcartitem;
                super();
            }
        });
        if (item.getProductRatingCount() <= 0)
        {
            viewgroup.hideProductRating();
        } else
        {
            viewgroup.showProductRating();
            double d;
            int ai[];
            if (item.getProductRatingCount() > 0)
            {
                d = item.getProductRating();
            } else
            {
                d = 5D;
            }
            ai = new int[5];
            i = 0;
            while (i < 5) 
            {
                if (d >= (double)(i + 1))
                {
                    ai[i] = 0x7f0201ce;
                } else
                {
                    double d1 = (double)(i + 1) - d;
                    if (d1 <= 0.25D)
                    {
                        ai[i] = 0x7f0201ce;
                    } else
                    if (d1 <= 0.75D)
                    {
                        ai[i] = 0x7f0200dc;
                    } else
                    {
                        ai[i] = 0x7f0200d8;
                    }
                }
                i++;
            }
            ((ItemRowHolder) (viewgroup)).productRatingStarOne.setImageResource(ai[0]);
            ((ItemRowHolder) (viewgroup)).productRatingStarTwo.setImageResource(ai[1]);
            ((ItemRowHolder) (viewgroup)).productRatingStarThree.setImageResource(ai[2]);
            ((ItemRowHolder) (viewgroup)).productRatingStarFour.setImageResource(ai[3]);
            ((ItemRowHolder) (viewgroup)).productRatingStarFive.setImageResource(ai[4]);
            ((ItemRowHolder) (viewgroup)).productRatingText.setText(String.format("(%1$s)", new Object[] {
                NumberFormat.getInstance().format(item.getProductRatingCount())
            }));
        }
        if (cartManager.getAddedToCartVariationId() != null && item.getVariationId().equals(cartManager.getAddedToCartVariationId()))
        {
            ((ItemRowHolder) (viewgroup)).rowTitle.setText(getContext().getString(0x7f060257));
        } else
        {
            ((ItemRowHolder) (viewgroup)).rowTitle.setText(item.getName());
        }
        if (item.getProductSubtotal().getValue() <= 0.0D)
        {
            ((ItemRowHolder) (viewgroup)).rowPrice.setText(getContext().getString(0x7f0601e1));
        } else
        {
            ((ItemRowHolder) (viewgroup)).rowPrice.setText(item.getProductSubtotal().toFormattedString(flag, false));
        }
        if (item.getRetailPrice().getValue() > 0.0D && item.getRetailPrice().getValue() > item.getProductSubtotal().getValue())
        {
            ((ItemRowHolder) (viewgroup)).rowOriginalPrice.setText(item.getRetailPrice().toFormattedString(flag, false));
            ((ItemRowHolder) (viewgroup)).rowOriginalPrice.setVisibility(0);
        } else
        {
            ((ItemRowHolder) (viewgroup)).rowOriginalPrice.setVisibility(8);
        }
        ((ItemRowHolder) (viewgroup)).imageView.getImageView().setImageUrl(item.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        ((ItemRowHolder) (viewgroup)).imageView.setOnClickListener(new android.view.View.OnClickListener() {

            final CartItemsAdapter this$0;
            final WishCartItem val$item;

            public void onClick(View view1)
            {
                showProduct(item);
            }

            
            {
                this$0 = CartItemsAdapter.this;
                item = wishcartitem;
                super();
            }
        });
        if (item.getUrgencyText() != null)
        {
            ((ItemRowHolder) (viewgroup)).urgencyText.setVisibility(0);
            ((ItemRowHolder) (viewgroup)).urgencyText.setText(item.getUrgencyText());
        } else
        {
            ((ItemRowHolder) (viewgroup)).urgencyText.setVisibility(8);
        }
        if (item.getWarningMessages() != null && item.getWarningMessages().size() > 0)
        {
            ((ItemRowHolder) (viewgroup)).warningMessageContainer.removeAllViews();
            ((ItemRowHolder) (viewgroup)).warningMessageContainer.setVisibility(0);
            CartItemWarningMessageRow cartitemwarningmessagerow;
            for (Iterator iterator = item.getWarningMessages().iterator(); iterator.hasNext(); ((ItemRowHolder) (viewgroup)).warningMessageContainer.addView(cartitemwarningmessagerow))
            {
                String s1 = (String)iterator.next();
                cartitemwarningmessagerow = new CartItemWarningMessageRow(getContext());
                cartitemwarningmessagerow.setMessage(s1);
            }

        } else
        {
            ((ItemRowHolder) (viewgroup)).warningMessageContainer.setVisibility(8);
        }
        String s;
        if (item.getSize() != null)
        {
            ((ItemRowHolder) (viewgroup)).sizeContainer.setVisibility(0);
            ((ItemRowHolder) (viewgroup)).sizeText.setText(item.getSize());
        } else
        {
            ((ItemRowHolder) (viewgroup)).sizeContainer.setVisibility(8);
        }
        if (item.getColor() != null)
        {
            ((ItemRowHolder) (viewgroup)).colorContainer.setVisibility(0);
            ((ItemRowHolder) (viewgroup)).colorText.setText(item.getColor());
        } else
        {
            ((ItemRowHolder) (viewgroup)).colorContainer.setVisibility(8);
        }
        ((ItemRowHolder) (viewgroup)).quantityText.setText(Integer.toString(item.getQuantity()));
        if (item.getShippingPrice().getValue() <= 0.0D)
        {
            s = getContext().getString(0x7f0601e1);
        } else
        {
            s = item.getShippingPrice().multiply(item.getQuantity()).toFormattedString(flag, false);
        }
        s = (new StringBuilder()).append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append(item.getShippingTimeString()).toString();
        ((ItemRowHolder) (viewgroup)).shippingText.setText(s);
        updateCartTimer(item, viewgroup);
        return view;
    }




}
