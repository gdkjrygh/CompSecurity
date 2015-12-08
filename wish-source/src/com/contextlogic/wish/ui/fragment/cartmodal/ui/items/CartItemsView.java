// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCheckoutOffer;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;
import com.contextlogic.wish.util.BitmapUtil;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartItemsAdapter, CartItemsHeaderView, CartItemsFooterView

public class CartItemsView extends CartUiView
{

    private CartItemsAdapter cartItemsAdapter;
    private CartItemsFooterView cartItemsFooter;
    private CartItemsHeaderView cartItemsHeader;
    private ListView cartItemsListView;
    private View cartView;
    private TextView checkoutButton;
    private LinearLayout checkoutOfferCounterContainer;
    private TextView checkoutOfferText;
    private CountdownTimerView checkoutOfferTimer;
    private View checkoutOfferView;
    private View emptyView;
    private View emptyViewBrowseButton;
    private TextView shippingOfferText;
    private TextView shippingOfferTitle;
    private View shippingOfferView;

    public CartItemsView(CartManager cartmanager)
    {
        super(cartmanager);
        init();
    }

    private void cleanupCartTimers()
    {
        if (cartItemsAdapter != null)
        {
            cartItemsAdapter.cleanCartTimers();
        }
    }

    private void cleanupCheckoutOffer()
    {
        if (checkoutOfferTimer != null)
        {
            checkoutOfferTimer.pauseTimer();
            checkoutOfferCounterContainer.removeAllViews();
        }
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030025, this);
        shippingOfferView = view.findViewById(0x7f0d00f7);
        shippingOfferTitle = (TextView)view.findViewById(0x7f0d00f9);
        shippingOfferText = (TextView)view.findViewById(0x7f0d00fa);
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d00f8), 0x7f020123);
        emptyView = view.findViewById(0x7f0d00f5);
        emptyViewBrowseButton = view.findViewById(0x7f0d00f6);
        emptyViewBrowseButton.setOnClickListener(new android.view.View.OnClickListener() );
        cartView = view.findViewById(0x7f0d00ee);
        checkoutButton = (TextView)view.findViewById(0x7f0d00f4);
        checkoutButton.setOnClickListener(new android.view.View.OnClickListener() );
        checkoutOfferView = view.findViewById(0x7f0d00ef);
        checkoutOfferText = (TextView)view.findViewById(0x7f0d00f1);
        checkoutOfferCounterContainer = (LinearLayout)view.findViewById(0x7f0d00f0);
        cartItemsHeader = new CartItemsHeaderView(cartManager);
        cartItemsFooter = new CartItemsFooterView(cartManager);
        cartItemsListView = (ListView)view.findViewById(0x7f0d00f2);
        cartItemsListView.addHeaderView(cartItemsHeader);
        cartItemsListView.addFooterView(cartItemsFooter);
        cartItemsAdapter = new CartItemsAdapter(cartManager, cartItemsListView);
        cartItemsListView.setAdapter(cartItemsAdapter);
        onCartDataUpdated();
    }

    public void cleanup()
    {
        cleanupCheckoutOffer();
        cleanupCartTimers();
    }

    public WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return null;
    }

    public boolean onBackPressed()
    {
        return false;
    }

    public void onCartDataUpdated()
    {
        WishCart wishcart = cartManager.getCart();
        if (wishcart != null && wishcart.getItems() != null && wishcart.getItems().size() > 0)
        {
            emptyView.setVisibility(8);
            shippingOfferView.setVisibility(8);
            cartView.setVisibility(0);
            cartItemsHeader.refreshView();
            cartItemsFooter.refreshView();
            cartItemsAdapter.notifyDataSetChanged();
            cleanupCheckoutOffer();
            if (wishcart.getCheckoutOffer() != null && !wishcart.getCheckoutOffer().isExpired())
            {
                checkoutOfferView.setVisibility(0);
                checkoutOfferTimer = new CountdownTimerView(cartManager.getActivity());
                checkoutOfferTimer.setup(wishcart.getCheckoutOffer().getExpiry(), 18, getResources().getColor(0x7f0c00e8), getResources().getColor(0x7f0c00c6));
                checkoutOfferTimer.startTimer();
                checkoutOfferCounterContainer.removeAllViews();
                checkoutOfferCounterContainer.addView(checkoutOfferTimer);
                checkoutOfferText.setText(wishcart.getCheckoutOffer().getMessage());
            } else
            {
                checkoutOfferView.setVisibility(8);
            }
            checkoutButton.setText(cartManager.getCartCheckoutActionManager().getCheckoutButtonText());
            return;
        }
        cleanupCheckoutOffer();
        emptyView.setVisibility(0);
        cartView.setVisibility(8);
        if (wishcart.getShippingOfferText() != null && wishcart.getShippingOfferTitle() != null)
        {
            shippingOfferTitle.setText(wishcart.getShippingOfferTitle());
            shippingOfferText.setText(wishcart.getShippingOfferText());
            shippingOfferView.setVisibility(0);
            return;
        } else
        {
            shippingOfferView.setVisibility(8);
            return;
        }
    }


}
