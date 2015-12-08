// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Map;

// Referenced classes of package com.walmart.android.service.item:
//            ItemResponse

public static class VariantValue
{
    public static class VariantProduct
    {

        public ItemResponse.BuyingOption buyingOptions;
        public boolean fetched;
        public String id;
        public Map variants;

        public VariantProduct()
        {
        }
    }

    public static class VariantType
    {

        public boolean dropdown;
        public String id;
        public String name;
        public boolean product;
        public boolean radiobutton;
        public boolean swatch;
        public VariantValue variants[];

        public VariantType()
        {
            variants = new VariantValue[0];
        }
    }

    public static class VariantValue
    {

        public boolean available;
        public String id;
        public ItemResponse.ImageAsset imageAssets[];
        public String imageUrl;
        public String name;
        public String productIds[];
        public boolean retired;
        public boolean selected;
        public String status;
        public String type;
        public int valueRank;

        public VariantValue()
        {
            productIds = new String[0];
            imageAssets = new ItemResponse.ImageAsset[0];
        }
    }


    public String primaryProductId;
    public VariantProduct variantProducts[];
    public VariantType variantTypes[];

    public VariantValue()
    {
    }
}
