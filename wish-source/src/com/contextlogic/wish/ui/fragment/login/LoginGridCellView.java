// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.util.BitmapUtil;

public class LoginGridCellView extends StaggeredGridCellView
{

    private int imageResourceId;
    private ImageView imageView;

    public LoginGridCellView(Context context)
    {
        super(context);
    }

    public void init()
    {
        imageView = (ImageView)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300bf, getContentView()).findViewById(0x7f0d0408);
    }

    public void prepareForRecycle()
    {
        imageResourceId = -1;
        releaseImages();
    }

    public void releaseImages()
    {
        if (imageView.getDrawable() != null)
        {
            imageView.getDrawable().setCallback(null);
        }
        imageView.setImageDrawable(null);
    }

    public void restoreImages()
    {
        if (imageResourceId > 0)
        {
            BitmapUtil.safeSetImageResource(imageView, imageResourceId);
        }
    }

    public void setImage(int i)
    {
        releaseImages();
        imageResourceId = i;
        BitmapUtil.safeSetImageResource(imageView, i);
    }
}
