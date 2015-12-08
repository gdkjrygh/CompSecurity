// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.contextlogic.wish.util.CompatibilityUtil;

public class ProductFeedEditListOverlayView extends FrameLayout
{

    public ProductFeedEditListOverlayView(Context context)
    {
        super(context);
        CompatibilityUtil.disableHardwareAcceleration(this);
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030082, this);
    }
}
