// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;


public class ListItem
{
    public static class BundleComponent
    {

        public String id;
        public String imageUrl;
        public String name;
        public String offerId;
        public int quantity;

        public BundleComponent()
        {
        }
    }

    public static class Description
    {

        public String longDescription;
        public String shortDescription;

        public Description()
        {
        }
    }

    public static class Error
    {

        public String code;
        public String description;

        public Error()
        {
        }
    }

    public static class Price
    {

        public String compare;
        public String current;
        public boolean hidden;
        public String msrp;
        public String receiptPrice;
        public String savings;
        public String type;
        public String unit;

        public Price()
        {
        }
    }

    public static class Quantity
    {

        public int receiptQuantity;
        public int received;
        public int requested;

        public Quantity()
        {
        }
    }

    public static class Rating
    {

        public String average;
        public String count;

        public Rating()
        {
        }
    }

    public static class VariantAttribute
    {

        public String name;
        public String value;

        public VariantAttribute()
        {
        }
    }


    public static final String PRICE_TYPE_BASE = "BASE";
    public static final String PRICE_TYPE_BESTSELLER = "BESTSELLER";
    public static final String PRICE_TYPE_CLEARANCE = "CLEARANCE";
    public static final String PRICE_TYPE_ROLLBACK = "ROLLBACK";
    public boolean available;
    public String brand;
    public BundleComponent bundle[];
    public String category;
    public String color;
    public Description description;
    public Error errors[];
    public String groupId;
    public String id;
    public String imageUrl;
    public boolean isNew;
    public String listId;
    public String listType;
    public String name;
    public String notes;
    public String offerId;
    public String offerType;
    public boolean preOrder;
    public Price price;
    public String priority;
    public String productId;
    public Quantity quantity;
    public Rating rating;
    public String seller;
    public boolean shippingPass;
    public boolean specialBuy;
    public String upc;
    public String usItemId;
    public VariantAttribute variantAttributes[];
    public boolean walmartOnly;
    public String wupc;

    public ListItem()
    {
    }
}
