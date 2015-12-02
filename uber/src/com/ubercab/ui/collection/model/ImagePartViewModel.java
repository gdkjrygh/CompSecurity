// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.collection.model;

import hpz;

// Referenced classes of package com.ubercab.ui.collection.model:
//            ViewModel, Shape_ImagePartViewModel

public abstract class ImagePartViewModel extends ViewModel
{

    public ImagePartViewModel()
    {
    }

    public static ImagePartViewModel create()
    {
        return new Shape_ImagePartViewModel();
    }

    public static ImagePartViewModel create(int i)
    {
        ImagePartViewModel imagepartviewmodel = create();
        imagepartviewmodel.setImageDrawable(i);
        return imagepartviewmodel;
    }

    public abstract int getHeight();

    public abstract float getHeightRatio();

    public abstract int getImageDrawable();

    public abstract hpz getImageLoader();

    public abstract String getImageUrl();

    public abstract android.view.View.OnClickListener getOnClickListener();

    public abstract int getPaddingBottom();

    public abstract int getPaddingLeft();

    public abstract int getPaddingRight();

    public abstract int getPaddingTop();

    public abstract int getWidth();

    public abstract float getWidthRatio();

    public abstract ImagePartViewModel setHeight(int i);

    public ImagePartViewModel setHeightAsWidthRatio(float f)
    {
        return setWidthRatio(f);
    }

    abstract ImagePartViewModel setHeightRatio(float f);

    public abstract ImagePartViewModel setImageDrawable(int i);

    abstract ImagePartViewModel setImageLoader(hpz hpz);

    abstract ImagePartViewModel setImageUrl(String s);

    public ImagePartViewModel setImageUrl(String s, hpz hpz)
    {
        setImageLoader(hpz);
        return setImageUrl(s);
    }

    public abstract ImagePartViewModel setOnClickListener(android.view.View.OnClickListener onclicklistener);

    public abstract ImagePartViewModel setPaddingBottom(int i);

    public abstract ImagePartViewModel setPaddingLeft(int i);

    public abstract ImagePartViewModel setPaddingRight(int i);

    public abstract ImagePartViewModel setPaddingTop(int i);

    public ImagePartViewModel setSize(int i, int j)
    {
        setWidth(i);
        return setHeight(j);
    }

    public abstract ImagePartViewModel setWidth(int i);

    public ImagePartViewModel setWidthAsHeightRatio(float f)
    {
        return setHeightRatio(f);
    }

    abstract ImagePartViewModel setWidthRatio(float f);
}
