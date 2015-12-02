// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.v3.PromoViewModel;
import com.ubercab.rider.realtime.response.Promotion;

public final class fbz
{

    public static idi a()
    {
        return new idi() {

            private static PromoViewModel a(Promotion promotion)
            {
                return new PromoViewModel(promotion.getDescription(), promotion.getShortDescription(), promotion.getRedemptionCount(), promotion.getExpiresAt());
            }

            public final volatile Object a(Object obj)
            {
                return a((Promotion)obj);
            }

        };
    }
}
