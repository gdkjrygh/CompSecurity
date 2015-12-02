// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


// Referenced classes of package com.ubercab.rider.realtime.response:
//            PromotionInviter

public abstract class UserPromotion
{

    public UserPromotion()
    {
    }

    public abstract String getGiveGetAmount();

    public abstract PromotionInviter getInviter();

    public abstract String getPromotionValueString();

    abstract UserPromotion setGiveGetAmount(String s);

    abstract UserPromotion setInviter(PromotionInviter promotioninviter);

    abstract UserPromotion setPromotionValueString(String s);
}
