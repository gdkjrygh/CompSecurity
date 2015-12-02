// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_Promotion

public abstract class Promotion
{

    public Promotion()
    {
    }

    public static Promotion create()
    {
        return new Shape_Promotion();
    }

    public abstract String getAutoApplied();

    public abstract String getClientId();

    public abstract String getClientUuid();

    public abstract String getCode();

    public abstract String getConsumedAt();

    public abstract String getCustomUserActivationMessage();

    public abstract String getDescription();

    public abstract String getEndsAt();

    public abstract String getExpiresAt();

    public abstract String getId();

    public abstract String getIsValid();

    public abstract String getPromotionId();

    public abstract String getRedemptionCount();

    public abstract String getRevokedAt();

    public abstract String getShortDescription();

    public abstract String getStartsAt();

    public abstract String getUuid();

    abstract Promotion setAutoApplied(String s);

    abstract Promotion setClientId(String s);

    abstract Promotion setClientUuid(String s);

    abstract Promotion setCode(String s);

    abstract Promotion setConsumedAt(String s);

    abstract Promotion setCustomUserActivationMessage(String s);

    public abstract Promotion setDescription(String s);

    abstract Promotion setEndsAt(String s);

    public abstract Promotion setExpiresAt(String s);

    abstract Promotion setId(String s);

    abstract Promotion setIsValid(String s);

    abstract Promotion setPromotionId(String s);

    public abstract Promotion setRedemptionCount(String s);

    abstract Promotion setRevokedAt(String s);

    public abstract Promotion setShortDescription(String s);

    abstract Promotion setStartsAt(String s);

    abstract Promotion setUuid(String s);
}
