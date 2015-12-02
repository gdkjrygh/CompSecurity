// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import com.ubercab.rider.realtime.model.FareDetailMetadata;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpfrontFareDetailMetadata

public abstract class UpfrontFareDetailMetadata
    implements Parcelable, FareDetailMetadata
{

    public UpfrontFareDetailMetadata()
    {
    }

    public static UpfrontFareDetailMetadata create(String s, float f, String s1, boolean flag, boolean flag1)
    {
        return (new Shape_UpfrontFareDetailMetadata()).setFormattedFare(s).setFare(f).setLabel(s1).setIsPool(flag).setIsSurge(flag1);
    }

    abstract UpfrontFareDetailMetadata setFare(float f);

    abstract UpfrontFareDetailMetadata setFormattedFare(String s);

    abstract UpfrontFareDetailMetadata setIsPool(boolean flag);

    abstract UpfrontFareDetailMetadata setIsSurge(boolean flag);

    abstract UpfrontFareDetailMetadata setLabel(String s);
}
