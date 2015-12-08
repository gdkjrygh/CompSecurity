// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Rect;

public class BoundingRect
{

    private Rect rect;

    public BoundingRect()
    {
        rect = new Rect();
        rect.setEmpty();
    }

    public BoundingRect(int i, int j, int k, int l)
    {
        rect = new Rect();
        set(i, j, k, l);
    }

    public BoundingRect(BoundingRect boundingrect)
    {
        rect = new Rect();
        rect.set(boundingrect.rect);
    }

    public int getRectBottom()
    {
        return rect.bottom;
    }

    public int getRectLeft()
    {
        return rect.left;
    }

    public int getRectRight()
    {
        return rect.right;
    }

    public int getRectTop()
    {
        return rect.top;
    }

    public int height()
    {
        return rect.height();
    }

    public void set(int i, int j, int k, int l)
    {
        setRectRight(k);
        setRectLeft(i);
        setRectBottom(l);
        setRectTop(j);
    }

    public void set(BoundingRect boundingrect)
    {
        rect.set(boundingrect.rect);
    }

    public void setEmpty()
    {
        rect.setEmpty();
    }

    public void setRectBottom(int i)
    {
        rect.bottom = i;
    }

    public void setRectLeft(int i)
    {
        rect.left = i;
    }

    public void setRectRight(int i)
    {
        rect.right = i;
    }

    public void setRectTop(int i)
    {
        rect.top = i;
    }

    public String toString()
    {
        return rect.toString();
    }

    public int width()
    {
        return rect.width();
    }

}
