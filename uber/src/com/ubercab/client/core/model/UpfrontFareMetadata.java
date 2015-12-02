// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import com.ubercab.rider.realtime.model.Metadata;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpfrontFareMetadata

public abstract class UpfrontFareMetadata
    implements Parcelable, Metadata
{

    public UpfrontFareMetadata()
    {
    }

    public static UpfrontFareMetadata create()
    {
        return new Shape_UpfrontFareMetadata();
    }

    public abstract double getDiscountPercentage();

    public abstract String getFareType();

    public abstract String getFormattedFare();

    public abstract String getLongDescription();

    public abstract String getShortDescription();

    public abstract String getTagline();

    public abstract UpfrontFareMetadata setDiscountPercentage(double d);

    public abstract UpfrontFareMetadata setFareType(String s);

    public abstract UpfrontFareMetadata setFormattedFare(String s);

    public abstract UpfrontFareMetadata setLongDescription(String s);

    public abstract UpfrontFareMetadata setShortDescription(String s);

    public abstract UpfrontFareMetadata setTagline(String s);
}
