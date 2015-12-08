// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import com.walmart.android.service.AsyncCallback;

public interface StoreItemService
{
    public static class StoreItem
    {

        final String imageUrl;
        final String name;
        final String normalizedUpc;
        final String productId;

        public StoreItem(String s, String s1, String s2, String s3)
        {
            normalizedUpc = s;
            productId = s1;
            name = s2;
            imageUrl = s3;
        }
    }


    public abstract int getLookupLimit();

    public abstract void lookupItems(String as[], AsyncCallback asynccallback);
}
