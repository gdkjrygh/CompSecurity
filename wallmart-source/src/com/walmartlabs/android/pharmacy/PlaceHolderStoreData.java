// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.Context;
import com.walmartlabs.storelocator.StoreData;

public class PlaceHolderStoreData extends StoreData
{

    private final String mDescription;
    private final String mId;

    public PlaceHolderStoreData(Context context, int i)
    {
        mDescription = context.getString(R.string.pharmacy_store_description, new Object[] {
            Integer.valueOf(i)
        });
        mId = String.valueOf(i);
    }

    public String getAddressStreetLine()
    {
        return "";
    }

    public String getCityStateZip()
    {
        return "";
    }

    public String getDescription()
    {
        return mDescription;
    }

    public String getId()
    {
        return mId;
    }

    public double getLatitude()
    {
        throw new UnsupportedOperationException("This is a placeholder object");
    }

    public double getLongitude()
    {
        throw new UnsupportedOperationException("This is a placeholder object");
    }

    public boolean hasService(String s)
    {
        throw new UnsupportedOperationException("This is a place holder object");
    }
}
