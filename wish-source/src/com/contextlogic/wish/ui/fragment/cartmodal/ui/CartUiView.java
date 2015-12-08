// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

public abstract class CartUiView extends FrameLayout
{

    protected CartManager cartManager;

    public CartUiView(CartManager cartmanager)
    {
        super(cartmanager.getActivity());
        cartManager = cartmanager;
    }

    public abstract void cleanup();

    protected void focusOnField(EditText edittext)
    {
        edittext.requestFocus();
        InputMethodManager inputmethodmanager = (InputMethodManager)cartManager.getActivity().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            inputmethodmanager.showSoftInput(edittext, 1);
        }
    }

    public abstract WishAnalyticsEvent getWishAnalyticsPageViewType();

    protected void hideKeyboard()
    {
        InputMethodManager inputmethodmanager;
        inputmethodmanager = (InputMethodManager)cartManager.getActivity().getSystemService("input_method");
        if (inputmethodmanager == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        inputmethodmanager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
        Throwable throwable;
        throwable;
    }

    public abstract boolean onBackPressed();

    public abstract void onCartDataUpdated();

    protected void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }
}
