// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            CategoryMembership, TimeWindow, Badge, Reminder

public class Item
{

    Badge alert;
    private Integer count;
    String description;
    Long endTimestamp;
    Badge endorsement;
    String imageUrlOriginal;
    String itemId;
    List memberships;
    Double price;
    Reminder reminder;
    Long startTimestamp;
    String subTitle;
    Double taxRate;
    private TimeWindow timeWindow;
    String title;

    public Item()
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
            obj = (Item)obj;
            if (description == null ? ((Item) (obj)).description != null : !description.equals(((Item) (obj)).description))
            {
                return false;
            }
            if (endTimestamp == null ? ((Item) (obj)).endTimestamp != null : !endTimestamp.equals(((Item) (obj)).endTimestamp))
            {
                return false;
            }
            if (imageUrlOriginal == null ? ((Item) (obj)).imageUrlOriginal != null : !imageUrlOriginal.equals(((Item) (obj)).imageUrlOriginal))
            {
                return false;
            }
            if (itemId == null ? ((Item) (obj)).itemId != null : !itemId.equals(((Item) (obj)).itemId))
            {
                return false;
            }
            if (price == null ? ((Item) (obj)).price != null : !price.equals(((Item) (obj)).price))
            {
                return false;
            }
            if (startTimestamp == null ? ((Item) (obj)).startTimestamp != null : !startTimestamp.equals(((Item) (obj)).startTimestamp))
            {
                return false;
            }
            if (subTitle == null ? ((Item) (obj)).subTitle != null : !subTitle.equals(((Item) (obj)).subTitle))
            {
                return false;
            }
            if (taxRate == null ? ((Item) (obj)).taxRate != null : !taxRate.equals(((Item) (obj)).taxRate))
            {
                return false;
            }
            if (title == null ? ((Item) (obj)).title != null : !title.equals(((Item) (obj)).title))
            {
                return false;
            }
        }
        return true;
    }

    public Badge getAlert()
    {
        return alert;
    }

    public Integer getCount()
    {
        int i;
        if (count == null)
        {
            i = 0;
        } else
        {
            i = count.intValue();
        }
        return Integer.valueOf(i);
    }

    public String getDescription()
    {
        return description;
    }

    public Badge getEndorsement()
    {
        return endorsement;
    }

    public String getFirstParentUuid()
    {
        if (memberships == null || memberships.isEmpty())
        {
            return null;
        } else
        {
            return ((CategoryMembership)memberships.get(0)).getUuid();
        }
    }

    public String getImageUrlOriginal()
    {
        return imageUrlOriginal;
    }

    public String getItemId()
    {
        return itemId;
    }

    public List getMemberships()
    {
        return memberships;
    }

    public Double getPrice()
    {
        double d;
        if (price == null)
        {
            d = 0.0D;
        } else
        {
            d = price.doubleValue();
        }
        return Double.valueOf(d);
    }

    public Reminder getReminder()
    {
        return reminder;
    }

    public String getSubTitle()
    {
        return subTitle;
    }

    public Double getTaxRate()
    {
        double d;
        if (taxRate == null)
        {
            d = 0.0D;
        } else
        {
            d = taxRate.doubleValue();
        }
        return Double.valueOf(d);
    }

    public TimeWindow getTimeWindow()
    {
        if (timeWindow == null)
        {
            timeWindow = new TimeWindow(startTimestamp, endTimestamp);
        }
        return timeWindow;
    }

    public String getTitle()
    {
        return title;
    }

    public int hashCode()
    {
        int i2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (description != null)
        {
            i = description.hashCode();
        } else
        {
            i = 0;
        }
        if (endTimestamp != null)
        {
            j = endTimestamp.hashCode();
        } else
        {
            j = 0;
        }
        if (imageUrlOriginal != null)
        {
            k = imageUrlOriginal.hashCode();
        } else
        {
            k = 0;
        }
        if (itemId != null)
        {
            l = itemId.hashCode();
        } else
        {
            l = 0;
        }
        if (price != null)
        {
            i1 = price.hashCode();
        } else
        {
            i1 = 0;
        }
        if (startTimestamp != null)
        {
            j1 = startTimestamp.hashCode();
        } else
        {
            j1 = 0;
        }
        if (subTitle != null)
        {
            k1 = subTitle.hashCode();
        } else
        {
            k1 = 0;
        }
        if (taxRate != null)
        {
            l1 = taxRate.hashCode();
        } else
        {
            l1 = 0;
        }
        if (title != null)
        {
            i2 = title.hashCode();
        }
        return (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i2;
    }

    public boolean isMember(String s)
    {
        if (memberships == null || memberships.isEmpty() || s == null)
        {
            return false;
        }
        for (Iterator iterator = memberships.iterator(); iterator.hasNext();)
        {
            if (s.equals(((CategoryMembership)iterator.next()).getUuid()))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isOnSale()
    {
        if (timeWindow == null)
        {
            timeWindow = new TimeWindow(startTimestamp, endTimestamp);
        }
        return timeWindow.isOpen();
    }

    public void setAlert(Badge badge)
    {
        alert = badge;
    }

    public void setCount(Integer integer)
    {
        count = integer;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEndTimestamp(long l)
    {
        endTimestamp = Long.valueOf(l);
    }

    public void setEndorsement(Badge badge)
    {
        endorsement = badge;
    }

    public void setImageUrlOriginal(String s)
    {
        imageUrlOriginal = s;
    }

    public void setItemId(String s)
    {
        itemId = s;
    }

    public void setMemberships(List list)
    {
        memberships = list;
    }

    public void setPrice(Double double1)
    {
        price = double1;
    }

    public void setReminder(Reminder reminder1)
    {
        reminder = reminder1;
    }

    public void setStartTimestamp(long l)
    {
        startTimestamp = Long.valueOf(l);
    }

    public void setSubTitle(String s)
    {
        subTitle = s;
    }

    public void setTaxRate(Double double1)
    {
        taxRate = double1;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
