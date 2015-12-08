// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import com.walmart.android.app.shop.ShelfUtils;
import com.walmart.android.service.item.ItemAvailability;
import com.walmart.android.util.PricePerUnitUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoreQueryResult
{
    public static class Item
    {

        private ItemAvailability availability;
        private String availableInStore;
        private boolean availableOnline;
        public boolean baseVariantItem;
        public String bestSellerSubcat;
        public int cRRNumReviews;
        private String dealInfo;
        private String description;
        public String fromPPU;
        public String fromPPUM;
        private String iD;
        private String imageThumbnailUrl;
        public boolean isBrowseToken;
        public boolean isManualShelf;
        public String listingId;
        private String name;
        public String offerId;
        public String pPU;
        public String pPUM;
        public String price;
        private String priceDisplaySubtext;
        public PricingInformation pricingInformation;
        public String productId;
        private String productImageUrl;
        private boolean putEligible;
        private float rating;
        private String ratingUrl;
        private boolean s2SEnabled;
        public Seller seller;
        private String shelfDescription;
        public boolean shippingPassEligible;
        public boolean showOnWebsite;
        private boolean storeOnly;
        public String storePrice;
        public String uOM;
        private String url;
        public boolean variantItem;

        public String getAvailableInStore()
        {
            return availableInStore;
        }

        public String getDealInfo()
        {
            return dealInfo;
        }

        public String getDescription()
        {
            return description;
        }

        public String getFormattedPricePerUnit()
        {
            return getFormattedPricePerUnit(false);
        }

        public String getFormattedPricePerUnit(boolean flag)
        {
            if (hasPricePerUnitRange())
            {
                return PricePerUnitUtils.getPricePerUnitRangeDisplayString(fromPPU, fromPPUM, pPU, pPUM, uOM, flag);
            }
            if (hasPricePerUnit())
            {
                return PricePerUnitUtils.getPricePerUnitDisplayString(pPU, pPUM, uOM);
            } else
            {
                return "";
            }
        }

        public String getImageThumbnailUrl()
        {
            return imageThumbnailUrl;
        }

        public String getItemAvailability()
        {
            if (availability != null)
            {
                return availability.getAvailability();
            } else
            {
                return "";
            }
        }

        public String getListPrice()
        {
            if (pricingInformation != null)
            {
                return ShelfUtils.fromHtml(pricingInformation.listPrice);
            } else
            {
                return null;
            }
        }

        public String getMarketPlaceSellerName()
        {
            if (!TextUtils.isEmpty(getSellerName()) && !"F55CDC31AB754BB68FE0B39041159D63".equals(getSellerId()))
            {
                return getSellerName();
            } else
            {
                return null;
            }
        }

        public String getName()
        {
            return name;
        }

        public int getNbrReviews()
        {
            return cRRNumReviews;
        }

        public String getOfferId()
        {
            return offerId;
        }

        public String getPrice()
        {
            if (pricingInformation != null)
            {
                return pricingInformation.price;
            } else
            {
                return price;
            }
        }

        public String getPriceDisplaySubtext()
        {
            return priceDisplaySubtext;
        }

        public String getProductId()
        {
            return productId;
        }

        public String getProductImageUrl()
        {
            return productImageUrl;
        }

        public float getRating()
        {
            return rating;
        }

        public String getRatingUrl()
        {
            return ratingUrl;
        }

        public String getRollbackPrice()
        {
            if (pricingInformation != null)
            {
                return ShelfUtils.fromHtml(pricingInformation.rollback);
            } else
            {
                return null;
            }
        }

        public String getSellerId()
        {
            if (seller != null)
            {
                return seller.id;
            } else
            {
                return null;
            }
        }

        public String getSellerName()
        {
            if (seller != null)
            {
                return seller.name;
            } else
            {
                return null;
            }
        }

        public String getShelfDescription()
        {
            return shelfDescription;
        }

        public String getUrl()
        {
            return url;
        }

        public String getiD()
        {
            return iD;
        }

        public boolean hasPricePerUnit()
        {
            return !TextUtils.isEmpty(pPU) && !TextUtils.isEmpty(pPUM) && !TextUtils.isEmpty(uOM);
        }

        public boolean hasPricePerUnitRange()
        {
            return hasPricePerUnit() && !TextUtils.isEmpty(fromPPU) && !TextUtils.isEmpty(fromPPUM) && !fromPPU.equalsIgnoreCase(pPU);
        }

        public boolean hasUrl()
        {
            return !TextUtils.isEmpty(url);
        }

        public boolean isAvailableOnline()
        {
            return availableOnline;
        }

        public boolean isBaseVariantItem()
        {
            return baseVariantItem;
        }

        public boolean isPutEligible()
        {
            return putEligible;
        }

        public boolean isS2SEnabled()
        {
            return s2SEnabled;
        }

        public boolean isStoreOnly()
        {
            return storeOnly;
        }

        public boolean isSubMarketPrice()
        {
            return pricingInformation != null && !TextUtils.isEmpty(pricingInformation.submap);
        }

        public boolean isVariantItem()
        {
            return variantItem;
        }

        public void setAvailableInStore(String s)
        {
            availableInStore = s;
        }

        public void setBaseVariantItem(boolean flag)
        {
            baseVariantItem = flag;
        }

        public void setDealInfo(String s)
        {
            dealInfo = s;
        }

        public void setDescription(String s)
        {
            description = s;
        }

        public void setImageThumbnailUrl(String s)
        {
            imageThumbnailUrl = s;
        }

        public void setItemAvailability(ItemAvailability itemavailability)
        {
            if (!"in stock".equalsIgnoreCase(itemavailability.availability) && !"preorder now".equalsIgnoreCase(itemavailability.availability))
            {
                availableOnline = false;
            }
            availability = itemavailability;
        }

        public void setName(String s)
        {
            name = s;
        }

        public void setPrice(String s)
        {
            price = s;
        }

        public void setPriceDisplaySubtext(String s)
        {
            if (s != null && !s.startsWith("Final price depends"))
            {
                priceDisplaySubtext = s;
            }
        }

        public void setProductImageUrl(String s)
        {
            productImageUrl = s;
        }

        public void setPutEligible(boolean flag)
        {
            putEligible = flag;
        }

        public void setRating(float f)
        {
            rating = f;
        }

        public void setRatingUrl(String s)
        {
            ratingUrl = s;
        }

        public void setS2SEnabled(boolean flag)
        {
            s2SEnabled = flag;
        }

        public void setShelfDescription(String s)
        {
            shelfDescription = s;
        }

        public void setStoreOnly(boolean flag)
        {
            storeOnly = flag;
        }

        public void setUrl(String s)
        {
            url = s;
        }

        public void setVariantItem(boolean flag)
        {
            variantItem = flag;
        }

        public void setiD(String s)
        {
            iD = s;
        }

        public boolean shippingPassEligible()
        {
            return shippingPassEligible;
        }

        public boolean showOnWebsite()
        {
            return showOnWebsite;
        }


        public Item()
        {
            availableOnline = true;
        }
    }

    public static class Item.PricingInformation
    {

        public String listPrice;
        public String price;
        public String rollback;
        public String submap;
        public String youSave;

        public Item.PricingInformation()
        {
        }
    }

    public static class Item.Seller
    {

        public static final String WALMART_ID = "F55CDC31AB754BB68FE0B39041159D63";
        public String id;
        public String name;

        public Item.Seller()
        {
        }
    }

    public static class Refinement
    {

        private String browseToken;
        private Refinement children[];
        private String id;
        private String name;
        private String parent;
        private String stats;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Refinement)obj;
                if (id == null ? ((Refinement) (obj)).id != null : !id.equals(((Refinement) (obj)).id))
                {
                    return false;
                }
            }
            return true;
        }

        public String getBrowseToken()
        {
            return browseToken;
        }

        public Refinement[] getChildren()
        {
            return children;
        }

        public String getId()
        {
            return id;
        }

        public String getName()
        {
            return name;
        }

        public String getParent()
        {
            return parent;
        }

        public String getStats()
        {
            return stats;
        }

        public int hashCode()
        {
            if (id != null)
            {
                return id.hashCode();
            } else
            {
                return 0;
            }
        }

        public void setBrowseToken(String s)
        {
            browseToken = s;
        }

        public void setChildren(Refinement arefinement[])
        {
            children = arefinement;
        }

        public void setId(String s)
        {
            id = s;
        }

        public void setName(String s)
        {
            name = s;
        }

        public void setParent(String s)
        {
            parent = s;
        }

        public void setStats(String s)
        {
            stats = s;
        }

        public Refinement()
        {
        }
    }

    public static class RefinementGroup
    {

        private String browseToken;
        private boolean isDepartment;
        private String name;
        private Refinement refinements[];
        private int totalCount;

        public String getBrowseToken()
        {
            return browseToken;
        }

        public String getName()
        {
            return name;
        }

        public Refinement[] getRefinements()
        {
            return refinements;
        }

        public int getTotalCount()
        {
            return totalCount;
        }

        public boolean isDepartment()
        {
            return isDepartment;
        }

        public void setBrowseToken(String s)
        {
            browseToken = s;
        }

        public void setIsDepartment(boolean flag)
        {
            isDepartment = flag;
        }

        public void setName(String s)
        {
            name = s;
        }

        public void setRefinements(Refinement arefinement[])
        {
            refinements = arefinement;
        }

        public void setTotalCount(int i)
        {
            totalCount = i;
        }


        public RefinementGroup()
        {
        }
    }


    private String correctedSearchPhrase;
    private Item item[];
    private RefinementGroup refinementGroups[];
    private String suggestedSearchTerms[];
    private int totalCount;

    public StoreQueryResult()
    {
    }

    public String getCorrectedSearchPhrase()
    {
        return correctedSearchPhrase;
    }

    public List getFilteredItems()
    {
        Object obj;
        if (item != null)
        {
            ArrayList arraylist = new ArrayList(item.length);
            Item aitem[] = item;
            int j = aitem.length;
            int i = 0;
            do
            {
                obj = arraylist;
                if (i >= j)
                {
                    break;
                }
                obj = aitem[i];
                if (obj != null && ((Item) (obj)).name != null && !((Item) (obj)).name.trim().isEmpty())
                {
                    arraylist.add(obj);
                }
                i++;
            } while (true);
        } else
        {
            obj = Collections.emptyList();
        }
        return ((List) (obj));
    }

    public Item[] getItem()
    {
        return item;
    }

    public RefinementGroup[] getPrunedRefinementGroups(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (refinementGroups != null)
        {
            RefinementGroup arefinementgroup[] = refinementGroups;
            int k = arefinementgroup.length;
            int i = 0;
            while (i < k) 
            {
                RefinementGroup refinementgroup1 = arefinementgroup[i];
                if (refinementgroup1 != null && refinementgroup1.getTotalCount() > 0 && !refinementgroup1.isDepartment)
                {
                    String s1 = refinementgroup1.getName();
                    if (s1 == null || !s1.equalsIgnoreCase(s))
                    {
                        RefinementGroup refinementgroup = new RefinementGroup();
                        refinementgroup.setBrowseToken(refinementgroup1.getBrowseToken());
                        refinementgroup.setName(refinementgroup1.getName());
                        refinementgroup.setTotalCount(refinementgroup1.getTotalCount());
                        refinementgroup.setIsDepartment(refinementgroup1.isDepartment());
                        Refinement arefinement[] = refinementgroup1.getRefinements();
                        ArrayList arraylist1 = new ArrayList();
                        if (arefinement != null)
                        {
                            int l = arefinement.length;
                            int j = 0;
                            while (j < l) 
                            {
                                Refinement refinement = arefinement[j];
                                String s2 = refinement.getStats();
                                if (s2 == null || !"".equals(s2) && !"0".equals(s2))
                                {
                                    refinement.setParent(s1);
                                    arraylist1.add(refinement);
                                }
                                j++;
                            }
                        }
                        if (!arraylist1.isEmpty())
                        {
                            refinementgroup.setRefinements((Refinement[])arraylist1.toArray(new Refinement[arraylist1.size()]));
                            arraylist.add(refinementgroup);
                        }
                    }
                }
                i++;
            }
        }
        return (RefinementGroup[])arraylist.toArray(new RefinementGroup[arraylist.size()]);
    }

    public RefinementGroup[] getRefinementGroups()
    {
        return refinementGroups;
    }

    public String[] getSuggestedSearchTerms()
    {
        return suggestedSearchTerms;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setCorrectedSearchPhrase(String s)
    {
        correctedSearchPhrase = s;
    }

    public void setItem(Item aitem[])
    {
        item = aitem;
    }

    public void setRefinementGroups(RefinementGroup arefinementgroup[])
    {
        refinementGroups = arefinementgroup;
    }

    public void setSuggestedSearchTerms(String as[])
    {
        suggestedSearchTerms = as;
    }

    public void setTotalCount(int i)
    {
        totalCount = i;
    }
}
