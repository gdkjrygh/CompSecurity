// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ValidatePromotionBody

public abstract class ValidatePromotionBody
{

    public ValidatePromotionBody()
    {
    }

    public static ValidatePromotionBody create(String s, boolean flag)
    {
        return (new Shape_ValidatePromotionBody()).setPromotionCode(s).setConfirmed(flag);
    }

    public abstract boolean getConfirmed();

    public abstract String getPromotionCode();

    abstract ValidatePromotionBody setConfirmed(boolean flag);

    abstract ValidatePromotionBody setPromotionCode(String s);
}
