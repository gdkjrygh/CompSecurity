// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;


public class DrawerUpdateEvent
{

    public int customIndicatorResId;
    public boolean enable;
    public boolean showIndicator;

    public DrawerUpdateEvent(boolean flag, int i)
    {
        enable = flag;
        showIndicator = true;
        customIndicatorResId = i;
    }

    public DrawerUpdateEvent(boolean flag, boolean flag1)
    {
        enable = flag;
        showIndicator = flag1;
        customIndicatorResId = 0;
    }
}
