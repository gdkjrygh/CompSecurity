// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import com.walmartlabs.android.photo.model.order.PendingOrder;

public class OrderAwareFragment extends Fragment
{

    private static final String EXTRA_ORDER = "order";
    private PendingOrder mOrder;

    public OrderAwareFragment()
    {
    }

    protected ActionBar getActionBar()
    {
        return ((AppCompatActivity)getActivity()).getSupportActionBar();
    }

    protected PendingOrder getOrder()
    {
        if (mOrder == null)
        {
            Bundle bundle = getArguments();
            bundle.setClassLoader(com/walmartlabs/android/photo/model/order/PendingOrder.getClassLoader());
            mOrder = (PendingOrder)bundle.getParcelable("order");
        }
        if (mOrder != null)
        {
            return mOrder;
        } else
        {
            return new PendingOrder();
        }
    }

    public void setOrder(PendingOrder pendingorder)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("order", pendingorder);
        setArguments(bundle);
    }
}
