// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item.model;

import java.util.Collections;
import java.util.List;

public class DrugFacts
{
    public static class Ingredient
    {

        public final String name;
        public final String purpose;

        public Ingredient(String s, String s1)
        {
            name = s;
            purpose = s1;
        }
    }


    public final List activeIngredients;
    public final List directions;
    public final String inactiveIngredients;
    public final List info;
    public final List questions;
    public final List warnings;

    public DrugFacts(List list, List list1, String s, List list2, List list3, List list4)
    {
        activeIngredients = Collections.unmodifiableList(list);
        directions = Collections.unmodifiableList(list1);
        inactiveIngredients = s;
        info = Collections.unmodifiableList(list2);
        warnings = Collections.unmodifiableList(list3);
        questions = Collections.unmodifiableList(list4);
    }
}
