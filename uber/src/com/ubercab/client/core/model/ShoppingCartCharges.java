// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_ShoppingCartCharges, ShoppingCartChargesBreakdown

public abstract class ShoppingCartCharges
{

    public ShoppingCartCharges()
    {
    }

    public static ShoppingCartCharges create()
    {
        return new Shape_ShoppingCartCharges();
    }

    public abstract String getError();

    public abstract String getErrorDetails();

    public abstract ShoppingCartChargesBreakdown getEstimateBreakdown();

    public abstract List getFinalCharges();

    public abstract String getFooter();

    public abstract Boolean isAllowCheckout();

    public abstract ShoppingCartCharges setAllowCheckout(Boolean boolean1);

    abstract ShoppingCartCharges setError(String s);

    abstract ShoppingCartCharges setErrorDetails(String s);

    abstract ShoppingCartCharges setEstimateBreakdown(ShoppingCartChargesBreakdown shoppingcartchargesbreakdown);

    public abstract ShoppingCartCharges setFinalCharges(List list);

    public abstract ShoppingCartCharges setFooter(String s);
}
