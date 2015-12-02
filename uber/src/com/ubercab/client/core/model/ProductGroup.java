// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class ProductGroup
    implements com.ubercab.rider.realtime.model.ProductGroup
{

    String description;
    String groupType;
    String iconUrl;
    String name;
    String uuid;

    public ProductGroup()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ProductGroup)obj;
        if (description == null ? ((ProductGroup) (obj)).description != null : !description.equals(((ProductGroup) (obj)).description))
        {
            return false;
        }
        if (iconUrl == null ? ((ProductGroup) (obj)).iconUrl != null : !iconUrl.equals(((ProductGroup) (obj)).iconUrl))
        {
            return false;
        }
        if (name == null ? ((ProductGroup) (obj)).name != null : !name.equals(((ProductGroup) (obj)).name))
        {
            return false;
        }
        if (groupType == null ? ((ProductGroup) (obj)).groupType != null : !groupType.equals(((ProductGroup) (obj)).groupType))
        {
            return false;
        }
        if (uuid == null) goto _L4; else goto _L3
_L3:
        if (uuid.equals(((ProductGroup) (obj)).uuid)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((ProductGroup) (obj)).uuid == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String getDescription()
    {
        return description;
    }

    public String getGroupType()
    {
        return groupType;
    }

    public String getIconUrl()
    {
        return iconUrl;
    }

    public String getName()
    {
        return name;
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (iconUrl != null)
        {
            i = iconUrl.hashCode();
        } else
        {
            i = 0;
        }
        if (description != null)
        {
            j = description.hashCode();
        } else
        {
            j = 0;
        }
        if (name != null)
        {
            k = name.hashCode();
        } else
        {
            k = 0;
        }
        if (groupType != null)
        {
            l = groupType.hashCode();
        } else
        {
            l = 0;
        }
        if (uuid != null)
        {
            i1 = uuid.hashCode();
        }
        return (l + (k + (j + i * 31) * 31) * 31) * 31 + i1;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setGroupType(String s)
    {
        groupType = s;
    }

    public void setIconUrl(String s)
    {
        iconUrl = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }
}
