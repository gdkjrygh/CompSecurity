// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class fs
{

    static final int a[];

    static 
    {
        a = new int[SliderLayout.TouchInterceptArea.values().length];
        try
        {
            a[SliderLayout.TouchInterceptArea.LEFT_EDGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[SliderLayout.TouchInterceptArea.TOP_EDGE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[SliderLayout.TouchInterceptArea.RIGHT_EDGE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[SliderLayout.TouchInterceptArea.BOTTOM_EDGE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
