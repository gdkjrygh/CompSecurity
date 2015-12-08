// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import com.walmart.android.util.PricePerUnitUtils;
import java.util.Locale;

// Referenced classes of package com.walmart.android.data:
//            InStoreSearchResult

public static final class d
{

    public ent department;
    public ent images;
    public ry inventory;
    public boolean isWWWItem;
    public n location;
    public String name;
    public n price;
    public Id productId;
    public  ratings;
    public  reviews;
    public String storeNumber;

    private boolean isValidId(String s)
    {
        return !TextUtils.isEmpty(s) && !"-1".equals(s);
    }

    public String[] getAisles()
    {
        if (location != null)
        {
            return n.access._mth000(location);
        } else
        {
            return null;
        }
    }

    public String getDepartmentName()
    {
        if (department != null)
        {
            return department.name;
        } else
        {
            return null;
        }
    }

    public d[] getDetailedLocations()
    {
        if (location != null)
        {
            return location.detailed;
        } else
        {
            return null;
        }
    }

    public String getFirstAisle()
    {
        if (location != null && n.access._mth000(location) != null && n.access._mth000(location).length > 0)
        {
            return n.access._mth000(location)[0];
        } else
        {
            return null;
        }
    }

    public String getFormattedPricePerUnit()
    {
        if (hasPricePerUnit())
        {
            return PricePerUnitUtils.getPricePerUnitDisplayString(price.PU, price.PUM, price.OM);
        } else
        {
            return "";
        }
    }

    public String getInventoryStatus()
    {
        if (inventory != null)
        {
            return inventory.status;
        } else
        {
            return null;
        }
    }

    public String getLargeImageUrl()
    {
        if (images != null)
        {
            if (!TextUtils.isEmpty(images.largeUrl))
            {
                return images.largeUrl;
            } else
            {
                return images.thumbnailUrl;
            }
        } else
        {
            return null;
        }
    }

    public int getNbrReviews()
    {
        if (reviews != null)
        {
            return reviews.reviewCount;
        } else
        {
            return 0;
        }
    }

    public int getPriceInCents()
    {
        if (price != null)
        {
            return price.riceInCents;
        } else
        {
            return 0;
        }
    }

    public String getPriceString()
    {
        int i = getPriceInCents();
        int j = i / 100;
        return String.format(Locale.US, "%d.%02d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i % 100)
        });
    }

    public String getPriceUnit()
    {
        if (price != null)
        {
            return price.aleUOM;
        } else
        {
            return null;
        }
    }

    public String getProductId()
    {
        if (productId != null && isValidId(productId.productId))
        {
            return productId.productId;
        } else
        {
            return null;
        }
    }

    public float getRating()
    {
        if (ratings != null)
        {
            return ratings.rating;
        } else
        {
            return -1F;
        }
    }

    public String getThumbNailUrl()
    {
        if (images != null)
        {
            return images.thumbnailUrl;
        } else
        {
            return null;
        }
    }

    public String getUpc()
    {
        if (productId != null && isValidId(productId.upc))
        {
            return productId.upc;
        } else
        {
            return null;
        }
    }

    public String getWWWItemId()
    {
        if (productId != null && isValidId(productId.WWWItemId))
        {
            return productId.WWWItemId;
        } else
        {
            return null;
        }
    }

    public boolean hasPricePerUnit()
    {
        return price != null && !TextUtils.isEmpty(price.PU) && !TextUtils.isEmpty(price.PUM) && !TextUtils.isEmpty(price.OM);
    }

    public d()
    {
    }
}
