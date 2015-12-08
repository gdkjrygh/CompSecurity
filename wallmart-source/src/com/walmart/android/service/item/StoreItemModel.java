// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


// Referenced classes of package com.walmart.android.service.item:
//            ItemPrice

public class StoreItemModel
{
    public static class Builder
    {

        protected boolean mIsPutAvailable;
        protected ItemPrice mPrice;
        protected StockStatus mStockStatus;
        protected String mStoreAddress;
        protected String mStoreId;

        public StoreItemModel build()
        {
            return new StoreItemModel(this);
        }

        public Builder storeId(String s)
        {
            mStoreId = s;
            return this;
        }

        public Builder()
        {
            mStockStatus = StockStatus.UNKNOWN;
        }
    }

    public static final class StockStatus extends Enum
    {

        private static final StockStatus $VALUES[];
        public static final StockStatus AVAILABLE;
        public static final StockStatus LIMITED;
        public static final StockStatus UNAVAILABLE;
        public static final StockStatus UNKNOWN;

        public static StockStatus valueOf(String s)
        {
            return (StockStatus)Enum.valueOf(com/walmart/android/service/item/StoreItemModel$StockStatus, s);
        }

        public static StockStatus[] values()
        {
            return (StockStatus[])$VALUES.clone();
        }

        static 
        {
            AVAILABLE = new StockStatus("AVAILABLE", 0);
            LIMITED = new StockStatus("LIMITED", 1);
            UNAVAILABLE = new StockStatus("UNAVAILABLE", 2);
            UNKNOWN = new StockStatus("UNKNOWN", 3);
            $VALUES = (new StockStatus[] {
                AVAILABLE, LIMITED, UNAVAILABLE, UNKNOWN
            });
        }

        private StockStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private final boolean mIsPutAvailable;
    private final ItemPrice mPrice;
    private final StockStatus mStockStatus;
    private final String mStoreAddress;
    private final String mStoreId;

    public StoreItemModel(Builder builder)
    {
        mStoreId = builder.mStoreId;
        mStoreAddress = builder.mStoreAddress;
        mStockStatus = builder.mStockStatus;
        mPrice = builder.mPrice;
        mIsPutAvailable = builder.mIsPutAvailable;
    }

    public ItemPrice getItemPrice()
    {
        return mPrice;
    }

    public StockStatus getStockStatus()
    {
        return mStockStatus;
    }

    public String getStoreAddress()
    {
        return mStoreAddress;
    }

    public String getStoreId()
    {
        return mStoreId;
    }

    public boolean isPutAvailable()
    {
        return mIsPutAvailable;
    }
}
