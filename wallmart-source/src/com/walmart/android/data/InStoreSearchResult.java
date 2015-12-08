// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import com.walmart.android.util.PricePerUnitUtils;
import java.util.Locale;

public class InStoreSearchResult
{
    public static final class Department
    {

        public String name;
        public String storeDeptId;

        public Department()
        {
        }
    }

    public static final class Detailed
    {

        public String aisle;
        public String section;
        public String zone;

        public Detailed()
        {
        }
    }

    public static final class Images
    {

        public String largeUrl;
        public String thumbnailUrl;

        public Images()
        {
        }
    }

    public static final class Inventory
    {

        public boolean isRealTime;
        public int quantity;
        public String status;

        public Inventory()
        {
        }
    }

    public static final class Location
    {

        private String aisle[];
        public Detailed detailed[];

        public void setAisle(String as[])
        {
            if (as != null)
            {
                String as1[] = new String[as.length];
                for (int i = 0; i < as1.length; i++)
                {
                    as1[i] = as[i].replace(".", "");
                }

                aisle = as1;
            }
        }


        public Location()
        {
        }
    }

    public static final class Price
    {

        public String currency;
        public String pPU;
        public String pPUM;
        public int priceInCents;
        public String saleUOM;
        public String uOM;

        public Price()
        {
        }
    }

    public static final class ProductId
    {

        public String USItemId;
        public String WWWItemId;
        public String productId;
        public String upc;

        public ProductId()
        {
        }
    }

    public static final class Ratings
    {

        public float rating;

        public Ratings()
        {
        }
    }

    public static final class Result
    {

        public Department department;
        public Images images;
        public Inventory inventory;
        public boolean isWWWItem;
        public Location location;
        public String name;
        public Price price;
        public ProductId productId;
        public Ratings ratings;
        public Reviews reviews;
        public String storeNumber;

        private boolean isValidId(String s)
        {
            return !TextUtils.isEmpty(s) && !"-1".equals(s);
        }

        public String[] getAisles()
        {
            if (location != null)
            {
                return location.aisle;
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

        public Detailed[] getDetailedLocations()
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
            if (location != null && location.aisle != null && location.aisle.length > 0)
            {
                return location.aisle[0];
            } else
            {
                return null;
            }
        }

        public String getFormattedPricePerUnit()
        {
            if (hasPricePerUnit())
            {
                return PricePerUnitUtils.getPricePerUnitDisplayString(price.pPU, price.pPUM, price.uOM);
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
                return price.priceInCents;
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
                return price.saleUOM;
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
            return price != null && !TextUtils.isEmpty(price.pPU) && !TextUtils.isEmpty(price.pPUM) && !TextUtils.isEmpty(price.uOM);
        }

        public Result()
        {
        }
    }

    public static final class Reviews
    {

        public int reviewCount;

        public Reviews()
        {
        }
    }


    public Result results[];

    public InStoreSearchResult()
    {
    }
}
