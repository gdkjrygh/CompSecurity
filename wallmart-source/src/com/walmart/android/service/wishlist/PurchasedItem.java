// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;


public class PurchasedItem
{

    public String itemId;
    public int purchasedCount;

    public PurchasedItem(String s, int i)
    {
        itemId = s;
        purchasedCount = i;
    }
}
