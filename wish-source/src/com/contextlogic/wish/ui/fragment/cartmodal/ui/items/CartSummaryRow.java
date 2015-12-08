// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartSummaryItem;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishSavingsInfo;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;

public class CartSummaryRow extends LinearLayout
{

    public CartSummaryRow(CartManager cartmanager, WishCartSummaryItem wishcartsummaryitem)
    {
        Object obj;
        TextView textview;
        UnifiedFontTextView unifiedfonttextview;
        super(cartmanager.getActivity());
        obj = ((LayoutInflater)cartmanager.getActivity().getSystemService("layout_inflater")).inflate(0x7f030027, this);
        setOrientation(1);
        textview = (TextView)((View) (obj)).findViewById(0x7f0d0116);
        unifiedfonttextview = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d0117);
        textview.setText(wishcartsummaryitem.getName());
        unifiedfonttextview.setText(wishcartsummaryitem.getValue());
        wishcartsummaryitem.getType();
        JVM INSTR tableswitch 2 4: default 108
    //                   2 109
    //                   3 108
    //                   4 138;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        textview.setTextColor(getResources().getColor(0x7f0c00c6));
        unifiedfonttextview.setTextColor(getResources().getColor(0x7f0c00c6));
        return;
_L3:
        unifiedfonttextview.makeBold();
        wishcartsummaryitem = (TextView)((View) (obj)).findViewById(0x7f0d0118);
        TextView textview1 = (TextView)((View) (obj)).findViewById(0x7f0d0119);
        obj = (TextView)((View) (obj)).findViewById(0x7f0d011a);
        if (CartExperimentManager.mustUseUsd(cartmanager) && cartmanager.getCart().getTotal().isLocalized())
        {
            wishcartsummaryitem.setText(String.format(getContext().getString(0x7f060070), new Object[] {
                cartmanager.getCart().getTotal().toFormattedString(false, false)
            }));
            wishcartsummaryitem.setVisibility(0);
        }
        if (cartmanager.getCart().getTaxText() != null)
        {
            textview1.setText(cartmanager.getCart().getTaxText());
            textview1.setVisibility(0);
        }
        if (cartmanager.getCart().getSavingsInfo() != null)
        {
            ((TextView) (obj)).setText(getContext().getString(0x7f06043f, new Object[] {
                cartmanager.getCart().getSavingsInfo().getSavingsValue().toFormattedString(CartExperimentManager.mustUseUsd(cartmanager), true), Integer.valueOf((int)cartmanager.getCart().getSavingsInfo().getPercentOff(CartExperimentManager.mustUseUsd(cartmanager)))
            }));
            ((TextView) (obj)).setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
