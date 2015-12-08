// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            SlapResponse

public static class Address
{
    public static class Address
    {

        public String street1;

        public Address()
        {
        }
    }


    public Address address;
    public float price;
    public Boolean putAvailable;
    public String stockStatus;
    public String storeId;

    public String toString()
    {
        return (new StringBuilder()).append("Store [price=").append(price).append(", stockStatus=").append(stockStatus).append("]").toString();
    }

    public Address()
    {
    }
}
