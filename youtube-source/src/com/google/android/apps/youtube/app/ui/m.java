// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class m
{

    static final int a[];

    static 
    {
        a = new int[ChannelStoreOutline.Category.values().length];
        try
        {
            a[ChannelStoreOutline.Category.MOST_SUBSCRIBED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[ChannelStoreOutline.Category.MOST_VIEWED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[ChannelStoreOutline.Category.LOCAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ChannelStoreOutline.Category.NOTEWORTHY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ChannelStoreOutline.Category.RECOMMENDED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
