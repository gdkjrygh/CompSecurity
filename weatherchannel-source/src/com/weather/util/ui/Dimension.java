// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.ui;

import com.weather.util.TwcPreconditions;

public class Dimension
{

    private final int height;
    private final int width;

    public Dimension(int i, int j)
    {
        width = TwcPreconditions.checkNonNegative(i);
        height = TwcPreconditions.checkNonNegative(j);
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Dimension, w: ").append(width).append(", h: ").append(height).toString();
    }
}
