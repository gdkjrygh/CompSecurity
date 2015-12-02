// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            MealReceiptRating

public final class Shape_MealReceiptRating extends MealReceiptRating
{

    private boolean isPositiveRating;
    private List negativeTagUuids;

    Shape_MealReceiptRating()
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
            obj = (MealReceiptRating)obj;
            if (((MealReceiptRating) (obj)).getIsPositiveRating() != getIsPositiveRating())
            {
                return false;
            }
            if (((MealReceiptRating) (obj)).getNegativeTagUuids() == null ? getNegativeTagUuids() != null : !((MealReceiptRating) (obj)).getNegativeTagUuids().equals(getNegativeTagUuids()))
            {
                return false;
            }
        }
        return true;
    }

    public final boolean getIsPositiveRating()
    {
        return isPositiveRating;
    }

    public final List getNegativeTagUuids()
    {
        return negativeTagUuids;
    }

    public final int hashCode()
    {
        char c;
        int i;
        if (isPositiveRating)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (negativeTagUuids == null)
        {
            i = 0;
        } else
        {
            i = negativeTagUuids.hashCode();
        }
        return i ^ 0xf4243 * (c ^ 0xf4243);
    }

    public final MealReceiptRating setIsPositiveRating(boolean flag)
    {
        isPositiveRating = flag;
        return this;
    }

    public final MealReceiptRating setNegativeTagUuids(List list)
    {
        negativeTagUuids = list;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("MealReceiptRating{isPositiveRating=")).append(isPositiveRating).append(", negativeTagUuids=").append(negativeTagUuids).append("}").toString();
    }
}
