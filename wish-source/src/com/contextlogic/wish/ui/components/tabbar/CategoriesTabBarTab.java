// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tabbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;

public class CategoriesTabBarTab extends LinearLayout
{

    private BorderedImageView iconImageView;
    private View tabLayout;
    private UnifiedFontTextView titleTextView;

    public CategoriesTabBarTab(Context context)
    {
        this(context, null);
    }

    public CategoriesTabBarTab(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300c7, this);
        setOrientation(0);
        tabLayout = view.findViewById(0x7f0d0417);
        titleTextView = (UnifiedFontTextView)view.findViewById(0x7f0d0419);
        iconImageView = (BorderedImageView)view.findViewById(0x7f0d0418);
        iconImageView.getImageView().setLoadedBackgroundColor(getResources().getColor(0x7f0c00e4));
        iconImageView.setUseLoadingSpinner(com.contextlogic.wish.ui.components.image.BorderedImageView.LoadingStyle.Gone);
        setBackgroundResource(0x7f02004e);
    }

    public void releaseImages()
    {
        iconImageView.getImageView().releaseImage();
    }

    public void restoreImages()
    {
        iconImageView.getImageView().restoreImage();
    }

    public void setImageUrl(String s)
    {
        if (s != null)
        {
            iconImageView.setVisibility(0);
            iconImageView.getImageView().setRequestedImageWidth(20);
            iconImageView.getImageView().setRequestedImageHeight(20);
            iconImageView.getImageView().releaseImage();
            iconImageView.getImageView().setImageUrl(s);
            s = (android.widget.LinearLayout.LayoutParams)tabLayout.getLayoutParams();
            s.height = (int)TypedValue.applyDimension(1, 50F, getResources().getDisplayMetrics());
            tabLayout.setLayoutParams(s);
            return;
        } else
        {
            iconImageView.setVisibility(8);
            s = (android.widget.LinearLayout.LayoutParams)tabLayout.getLayoutParams();
            s.height = (int)TypedValue.applyDimension(1, 45F, getResources().getDisplayMetrics());
            tabLayout.setLayoutParams(s);
            return;
        }
    }

    public void setTitle(String s)
    {
        titleTextView.setText(s);
    }
}
