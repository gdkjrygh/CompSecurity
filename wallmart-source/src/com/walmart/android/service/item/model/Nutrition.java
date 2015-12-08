// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.model;

import java.util.Collections;
import java.util.List;

public class Nutrition
{
    public static class Nutrient
    {

        public final String amount;
        public final List children;
        public final String dvp;
        public final String name;

        public Nutrient(String s, String s1, String s2, List list)
        {
            if (s == null)
            {
                s = "";
            }
            name = s;
            if (s1 == null)
            {
                s1 = "";
            }
            dvp = s1;
            if (s2 == null)
            {
                s2 = "";
            }
            amount = s2;
            children = Collections.unmodifiableList(list);
        }

        public Nutrient(List list)
        {
            this(null, null, null, list);
        }
    }


    public final List calorieInformation;
    public final List keyNutrients;
    public final List servingInformation;
    public final String staticContent;
    public final List vitaminsMinerals;

    public Nutrition(List list, List list1, List list2, List list3, String s)
    {
        calorieInformation = Collections.unmodifiableList(list);
        keyNutrients = Collections.unmodifiableList(list1);
        servingInformation = Collections.unmodifiableList(list2);
        vitaminsMinerals = Collections.unmodifiableList(list3);
        staticContent = s;
    }
}
