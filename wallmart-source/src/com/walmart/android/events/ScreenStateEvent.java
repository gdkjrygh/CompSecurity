// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.events;


public class ScreenStateEvent
{

    public static final int NAV_DRAWER_OPENED = 0;
    public static final int OPTION_ITEM_SELECTED = 1;
    private int mType;

    public ScreenStateEvent(int i)
    {
        mType = i;
    }

    public int getType()
    {
        return mType;
    }
}
