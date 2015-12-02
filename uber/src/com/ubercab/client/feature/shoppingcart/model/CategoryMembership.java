// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;


public class CategoryMembership
{

    Integer priority;
    String uuid;

    public CategoryMembership()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CategoryMembership)obj;
            if (priority == null ? ((CategoryMembership) (obj)).priority != null : !priority.equals(((CategoryMembership) (obj)).priority))
            {
                return false;
            }
            if (uuid == null ? ((CategoryMembership) (obj)).uuid != null : !uuid.equals(((CategoryMembership) (obj)).uuid))
            {
                return false;
            }
        }
        return true;
    }

    public int getPriority()
    {
        if (priority == null)
        {
            return 0;
        } else
        {
            return priority.intValue();
        }
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (priority != null)
        {
            i = priority.hashCode();
        } else
        {
            i = 0;
        }
        if (uuid != null)
        {
            j = uuid.hashCode();
        }
        return i * 31 + j;
    }

    public void setPriority(Integer integer)
    {
        priority = integer;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }
}
