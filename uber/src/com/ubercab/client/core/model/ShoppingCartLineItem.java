// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public abstract class ShoppingCartLineItem
{

    public ShoppingCartLineItem()
    {
    }

    public abstract String getAmount();

    public abstract String getId();

    public abstract String getItemId();

    public abstract String getTax();

    abstract ShoppingCartLineItem setAmount(String s);

    abstract ShoppingCartLineItem setId(String s);

    abstract ShoppingCartLineItem setItemId(String s);

    abstract ShoppingCartLineItem setTax(String s);
}
