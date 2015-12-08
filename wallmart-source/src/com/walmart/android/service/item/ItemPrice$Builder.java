// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


// Referenced classes of package com.walmart.android.service.item:
//            ItemPrice

public static class _cls00
{

    private CharSequence mListPrice;
    private String mPrice;
    private String mPricePerUnit;
    private boolean mSubmap;

    public ItemPrice build()
    {
        return new ItemPrice(this, null);
    }

    public _cls00 listPrice(CharSequence charsequence)
    {
        mListPrice = charsequence;
        return this;
    }

    public mListPrice price(String s)
    {
        mPrice = s;
        return this;
    }

    public mPrice pricePerUnit(String s)
    {
        mPricePerUnit = s;
        return this;
    }

    public mPricePerUnit submap(boolean flag)
    {
        mSubmap = flag;
        return this;
    }





    public ()
    {
    }

    public (ItemPrice itemprice)
    {
        mPrice = ItemPrice.access$400(itemprice);
        mSubmap = ItemPrice.access$500(itemprice);
        mListPrice = ItemPrice.access$600(itemprice);
        mPricePerUnit = ItemPrice.access$700(itemprice);
    }
}
