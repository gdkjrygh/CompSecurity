// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_MealReceiptRating

public abstract class MealReceiptRating
{

    public static int NEGATIVE_VALUE = 1;
    public static int POSITIVE_VALUE = 5;

    public MealReceiptRating()
    {
    }

    public static MealReceiptRating create()
    {
        return new Shape_MealReceiptRating();
    }

    public static MealReceiptRating create(boolean flag, List list)
    {
        return create().setIsPositiveRating(flag).setNegativeTagUuids(list);
    }

    public abstract boolean getIsPositiveRating();

    public abstract List getNegativeTagUuids();

    public abstract MealReceiptRating setIsPositiveRating(boolean flag);

    public abstract MealReceiptRating setNegativeTagUuids(List list);

}
