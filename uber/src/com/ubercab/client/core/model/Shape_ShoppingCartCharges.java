// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            ShoppingCartCharges, ShoppingCartChargesBreakdown

public final class Shape_ShoppingCartCharges extends ShoppingCartCharges
{

    private Boolean allow_checkout;
    private String error;
    private String error_details;
    private ShoppingCartChargesBreakdown estimate_breakdown;
    private List final_charges;
    private String footer;

    Shape_ShoppingCartCharges()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ShoppingCartCharges)obj;
            if (((ShoppingCartCharges) (obj)).getEstimateBreakdown() == null ? getEstimateBreakdown() != null : !((ShoppingCartCharges) (obj)).getEstimateBreakdown().equals(getEstimateBreakdown()))
            {
                return false;
            }
            if (((ShoppingCartCharges) (obj)).getError() == null ? getError() != null : !((ShoppingCartCharges) (obj)).getError().equals(getError()))
            {
                return false;
            }
            if (((ShoppingCartCharges) (obj)).getErrorDetails() == null ? getErrorDetails() != null : !((ShoppingCartCharges) (obj)).getErrorDetails().equals(getErrorDetails()))
            {
                return false;
            }
            if (((ShoppingCartCharges) (obj)).getFinalCharges() == null ? getFinalCharges() != null : !((ShoppingCartCharges) (obj)).getFinalCharges().equals(getFinalCharges()))
            {
                return false;
            }
            if (((ShoppingCartCharges) (obj)).getFooter() == null ? getFooter() != null : !((ShoppingCartCharges) (obj)).getFooter().equals(getFooter()))
            {
                return false;
            }
            if (((ShoppingCartCharges) (obj)).isAllowCheckout() == null ? isAllowCheckout() != null : !((ShoppingCartCharges) (obj)).isAllowCheckout().equals(isAllowCheckout()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getError()
    {
        return error;
    }

    public final String getErrorDetails()
    {
        return error_details;
    }

    public final ShoppingCartChargesBreakdown getEstimateBreakdown()
    {
        return estimate_breakdown;
    }

    public final List getFinalCharges()
    {
        return final_charges;
    }

    public final String getFooter()
    {
        return footer;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (estimate_breakdown == null)
        {
            i = 0;
        } else
        {
            i = estimate_breakdown.hashCode();
        }
        if (error == null)
        {
            j = 0;
        } else
        {
            j = error.hashCode();
        }
        if (error_details == null)
        {
            k = 0;
        } else
        {
            k = error_details.hashCode();
        }
        if (final_charges == null)
        {
            l = 0;
        } else
        {
            l = final_charges.hashCode();
        }
        if (footer == null)
        {
            i1 = 0;
        } else
        {
            i1 = footer.hashCode();
        }
        if (allow_checkout != null)
        {
            j1 = allow_checkout.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    public final Boolean isAllowCheckout()
    {
        return allow_checkout;
    }

    public final ShoppingCartCharges setAllowCheckout(Boolean boolean1)
    {
        allow_checkout = boolean1;
        return this;
    }

    final ShoppingCartCharges setError(String s)
    {
        error = s;
        return this;
    }

    final ShoppingCartCharges setErrorDetails(String s)
    {
        error_details = s;
        return this;
    }

    final ShoppingCartCharges setEstimateBreakdown(ShoppingCartChargesBreakdown shoppingcartchargesbreakdown)
    {
        estimate_breakdown = shoppingcartchargesbreakdown;
        return this;
    }

    public final ShoppingCartCharges setFinalCharges(List list)
    {
        final_charges = list;
        return this;
    }

    public final ShoppingCartCharges setFooter(String s)
    {
        footer = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ShoppingCartCharges{estimate_breakdown=")).append(estimate_breakdown).append(", error=").append(error).append(", error_details=").append(error_details).append(", final_charges=").append(final_charges).append(", footer=").append(footer).append(", allow_checkout=").append(allow_checkout).append("}").toString();
    }
}
