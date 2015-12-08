// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.weather.ui;


public class LayerItem
{

    private final String englishName;
    private final int id;
    private final String name;

    public LayerItem(String s, int i, String s1)
    {
        name = s;
        id = i;
        englishName = s1;
    }

    public String getEnglishName()
    {
        return englishName;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
