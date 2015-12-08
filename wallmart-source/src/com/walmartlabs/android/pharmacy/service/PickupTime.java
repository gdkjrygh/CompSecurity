// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;


public class PickupTime
{
    public static class Day
    {

        public String date;
        public String dateFormatted;
        public String timeList[];

        public Day()
        {
        }
    }


    public Day day[];
    public int storeNumber;

    public PickupTime()
    {
    }
}
