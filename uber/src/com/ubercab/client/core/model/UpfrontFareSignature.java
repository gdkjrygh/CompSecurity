// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;
import com.ubercab.rider.realtime.model.Signature;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_UpfrontFareSignature

public abstract class UpfrontFareSignature
    implements Parcelable, Signature
{

    public UpfrontFareSignature()
    {
    }

    public static UpfrontFareSignature create()
    {
        return new Shape_UpfrontFareSignature();
    }

    public abstract long getExpiresAt();

    public abstract long getIssuedAt();

    public abstract String getSignature();

    public abstract String getVersion();

    abstract UpfrontFareSignature setExpiresAt(long l);

    abstract UpfrontFareSignature setIssuedAt(long l);

    abstract UpfrontFareSignature setSignature(String s);

    abstract UpfrontFareSignature setVersion(String s);
}
