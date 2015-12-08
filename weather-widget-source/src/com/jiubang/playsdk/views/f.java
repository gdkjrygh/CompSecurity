// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.widget.Scroller;

final class f
{

    public static float a(Scroller scroller)
    {
        return scroller.getCurrVelocity();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            throw new RuntimeException("Should not get to IceCreamSandwichPlus class unless sdk is >= 14!");
        }
    }
}
