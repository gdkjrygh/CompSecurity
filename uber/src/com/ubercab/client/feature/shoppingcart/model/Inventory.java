// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import java.util.List;

public class Inventory
{

    List categories;
    String currencyCode;
    Double deliveryFee;
    String hoursClosedMessage;
    String hoursOpenMessage;
    boolean isAvailableForSaleNow;
    Integer itemCount;
    List items;
    String learnMoreURL;
    String logoImageUrl;
    String menuTagline;
    String menuTitle;
    String onTripMessage;

    public Inventory()
    {
        isAvailableForSaleNow = false;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Inventory)obj;
            if (categories == null ? ((Inventory) (obj)).categories != null : !categories.equals(((Inventory) (obj)).categories))
            {
                return false;
            }
            if (currencyCode == null ? ((Inventory) (obj)).currencyCode != null : !currencyCode.equals(((Inventory) (obj)).currencyCode))
            {
                return false;
            }
            if (deliveryFee == null ? ((Inventory) (obj)).deliveryFee != null : !deliveryFee.equals(((Inventory) (obj)).deliveryFee))
            {
                return false;
            }
            if (hoursClosedMessage == null ? ((Inventory) (obj)).hoursClosedMessage != null : !hoursClosedMessage.equals(((Inventory) (obj)).hoursClosedMessage))
            {
                return false;
            }
            if (hoursOpenMessage == null ? ((Inventory) (obj)).hoursOpenMessage != null : !hoursOpenMessage.equals(((Inventory) (obj)).hoursOpenMessage))
            {
                return false;
            }
            if (itemCount == null ? ((Inventory) (obj)).itemCount != null : !itemCount.equals(((Inventory) (obj)).itemCount))
            {
                return false;
            }
            if (isAvailableForSaleNow != ((Inventory) (obj)).isAvailableForSaleNow)
            {
                return false;
            }
            if (items == null ? ((Inventory) (obj)).items != null : !items.equals(((Inventory) (obj)).items))
            {
                return false;
            }
            if (logoImageUrl == null ? ((Inventory) (obj)).logoImageUrl != null : !logoImageUrl.equals(((Inventory) (obj)).logoImageUrl))
            {
                return false;
            }
            if (menuTagline == null ? ((Inventory) (obj)).menuTagline != null : !menuTagline.equals(((Inventory) (obj)).menuTagline))
            {
                return false;
            }
            if (menuTitle == null ? ((Inventory) (obj)).menuTitle != null : !menuTitle.equals(((Inventory) (obj)).menuTitle))
            {
                return false;
            }
            if (onTripMessage == null ? ((Inventory) (obj)).onTripMessage != null : !onTripMessage.equals(((Inventory) (obj)).onTripMessage))
            {
                return false;
            }
        }
        return true;
    }

    public List getCategories()
    {
        return categories;
    }

    public int getCategoryAndItemHashCode()
    {
        int j = 0;
        int i;
        if (categories != null)
        {
            i = categories.hashCode();
        } else
        {
            i = 0;
        }
        if (items != null)
        {
            j = items.hashCode();
        }
        return i * 31 + j;
    }

    public String getCurrencyCode()
    {
        return currencyCode;
    }

    public double getDeliveryFee()
    {
        if (deliveryFee != null)
        {
            return deliveryFee.doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    public String getHoursClosedMessage()
    {
        return hoursClosedMessage;
    }

    public String getHoursOpenMessage()
    {
        return hoursOpenMessage;
    }

    public int getItemCount()
    {
        if (itemCount != null)
        {
            return itemCount.intValue();
        }
        if (items != null)
        {
            return items.size();
        } else
        {
            return 0;
        }
    }

    public List getItems()
    {
        return items;
    }

    public String getLearnMoreURL()
    {
        return learnMoreURL;
    }

    public String getLogoImageUrl()
    {
        return logoImageUrl;
    }

    public String getMenuTagline()
    {
        return menuTagline;
    }

    public String getMenuTitle()
    {
        return menuTitle;
    }

    public String getOnTripMessage()
    {
        return onTripMessage;
    }

    public int hashCode()
    {
        int i3 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (categories != null)
        {
            i = categories.hashCode();
        } else
        {
            i = 0;
        }
        if (currencyCode != null)
        {
            j = currencyCode.hashCode();
        } else
        {
            j = 0;
        }
        if (deliveryFee != null)
        {
            k = deliveryFee.hashCode();
        } else
        {
            k = 0;
        }
        if (hoursClosedMessage != null)
        {
            l = hoursClosedMessage.hashCode();
        } else
        {
            l = 0;
        }
        if (hoursOpenMessage != null)
        {
            i1 = hoursOpenMessage.hashCode();
        } else
        {
            i1 = 0;
        }
        if (isAvailableForSaleNow)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (itemCount != null)
        {
            k1 = itemCount.hashCode();
        } else
        {
            k1 = 0;
        }
        if (items != null)
        {
            l1 = items.hashCode();
        } else
        {
            l1 = 0;
        }
        if (learnMoreURL != null)
        {
            i2 = learnMoreURL.hashCode();
        } else
        {
            i2 = 0;
        }
        if (logoImageUrl != null)
        {
            j2 = logoImageUrl.hashCode();
        } else
        {
            j2 = 0;
        }
        if (menuTagline != null)
        {
            k2 = menuTagline.hashCode();
        } else
        {
            k2 = 0;
        }
        if (menuTitle != null)
        {
            l2 = menuTitle.hashCode();
        } else
        {
            l2 = 0;
        }
        if (onTripMessage != null)
        {
            i3 = onTripMessage.hashCode();
        }
        return (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i3;
    }

    public boolean isAvailableForSaleNow()
    {
        return isAvailableForSaleNow;
    }

    public void setCategories(List list)
    {
        categories = list;
    }

    public void setCurrencyCode(String s)
    {
        currencyCode = s;
    }

    public void setDeliveryFee(Double double1)
    {
        deliveryFee = double1;
    }

    public void setHoursClosedMessage(String s)
    {
        hoursClosedMessage = s;
    }

    public void setHoursOpenMessage(String s)
    {
        hoursOpenMessage = s;
    }

    public void setItemCount(Integer integer)
    {
        itemCount = integer;
    }

    public void setItems(List list)
    {
        items = list;
    }

    public void setLearnMoreURL(String s)
    {
        learnMoreURL = s;
    }

    public void setMenuTagline(String s)
    {
        menuTagline = s;
    }

    public void setMenuTitle(String s)
    {
        menuTitle = s;
    }

    public void setOnTripMessage(String s)
    {
        onTripMessage = s;
    }
}
