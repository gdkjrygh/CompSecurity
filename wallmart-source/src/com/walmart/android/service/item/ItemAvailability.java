// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;


public class ItemAvailability
{

    public String availability;
    public boolean inStore;

    public ItemAvailability()
    {
    }

    public String getAvailability()
    {
        return availability;
    }

    public boolean isInStore()
    {
        return inStore;
    }

    public void setAvailability(String s)
    {
        String s1 = s;
        if ("Not Available at this time".equals(s))
        {
            s1 = "Not available online at this time";
        }
        availability = s1;
    }

    public void setInStore(boolean flag)
    {
        inStore = flag;
    }
}
