// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            TimeWindow

public class Category
{

    String description;
    String displayTitle;
    String displayType;
    Long endTimestamp;
    String imageUrlOriginal;
    List memberships;
    Long startTimestamp;
    private TimeWindow timeWindow;
    String timezone;
    String title;
    String uuid;

    public Category()
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
            obj = (Category)obj;
            if (description == null ? ((Category) (obj)).description != null : !description.equals(((Category) (obj)).description))
            {
                return false;
            }
            if (displayTitle == null ? ((Category) (obj)).displayTitle != null : !displayTitle.equals(((Category) (obj)).displayTitle))
            {
                return false;
            }
            if (displayType == null ? ((Category) (obj)).displayType != null : !displayType.equals(((Category) (obj)).displayType))
            {
                return false;
            }
            if (endTimestamp == null ? ((Category) (obj)).endTimestamp != null : !endTimestamp.equals(((Category) (obj)).endTimestamp))
            {
                return false;
            }
            if (imageUrlOriginal == null ? ((Category) (obj)).imageUrlOriginal != null : !imageUrlOriginal.equals(((Category) (obj)).imageUrlOriginal))
            {
                return false;
            }
            if (memberships == null ? ((Category) (obj)).memberships != null : !memberships.equals(((Category) (obj)).memberships))
            {
                return false;
            }
            if (startTimestamp == null ? ((Category) (obj)).startTimestamp != null : !startTimestamp.equals(((Category) (obj)).startTimestamp))
            {
                return false;
            }
            if (timezone == null ? ((Category) (obj)).timezone != null : !timezone.equals(((Category) (obj)).timezone))
            {
                return false;
            }
            if (title == null ? ((Category) (obj)).title != null : !title.equals(((Category) (obj)).title))
            {
                return false;
            }
            if (uuid == null ? ((Category) (obj)).uuid != null : !uuid.equals(((Category) (obj)).uuid))
            {
                return false;
            }
        }
        return true;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDisplayTitle()
    {
        if (displayTitle != null)
        {
            return displayTitle;
        } else
        {
            return title;
        }
    }

    public String getDisplayType()
    {
        return displayType;
    }

    public long getEndTimestamp()
    {
        if (endTimestamp != null)
        {
            return endTimestamp.longValue() * 1000L;
        } else
        {
            return 0L;
        }
    }

    public String getImageUrlOriginal()
    {
        return imageUrlOriginal;
    }

    public List getMemberships()
    {
        return memberships;
    }

    public long getStartTimestamp()
    {
        if (startTimestamp != null)
        {
            return startTimestamp.longValue() * 1000L;
        } else
        {
            return 0L;
        }
    }

    public TimeWindow getTimeWindow()
    {
        if (timeWindow == null)
        {
            timeWindow = new TimeWindow(startTimestamp, endTimestamp);
        }
        return timeWindow;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        int j2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (description != null)
        {
            i = description.hashCode();
        } else
        {
            i = 0;
        }
        if (displayTitle != null)
        {
            j = displayTitle.hashCode();
        } else
        {
            j = 0;
        }
        if (displayType != null)
        {
            k = displayType.hashCode();
        } else
        {
            k = 0;
        }
        if (endTimestamp != null)
        {
            l = endTimestamp.hashCode();
        } else
        {
            l = 0;
        }
        if (imageUrlOriginal != null)
        {
            i1 = imageUrlOriginal.hashCode();
        } else
        {
            i1 = 0;
        }
        if (memberships != null)
        {
            j1 = memberships.hashCode();
        } else
        {
            j1 = 0;
        }
        if (startTimestamp != null)
        {
            k1 = startTimestamp.hashCode();
        } else
        {
            k1 = 0;
        }
        if (timezone != null)
        {
            l1 = timezone.hashCode();
        } else
        {
            l1 = 0;
        }
        if (title != null)
        {
            i2 = title.hashCode();
        } else
        {
            i2 = 0;
        }
        if (uuid != null)
        {
            j2 = uuid.hashCode();
        }
        return (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + j2;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDisplayTitle(String s)
    {
        displayTitle = s;
    }

    public void setDisplayType(String s)
    {
        displayType = s;
    }

    public void setImageUrlOriginal(String s)
    {
        imageUrlOriginal = s;
    }

    public void setMemberships(List list)
    {
        memberships = list;
    }

    public void setTimezone(String s)
    {
        timezone = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }
}
