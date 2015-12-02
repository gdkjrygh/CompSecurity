// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import android.text.TextUtils;
import com.ubercab.client.core.model.ShoppingCartCharges;
import com.ubercab.client.core.model.ShoppingRequestedItem;
import dtw;
import gju;
import gjv;
import gki;
import gkk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            Item, TimeWindow, Page, Reminder, 
//            Inventory, Category, CategoryMembership, PageItem

public class Store
{

    private static final String HOME_PAGE_TITLE = "u_home";
    private static final long SHOPPING_CART_EXPIRY_TIME_MS;
    private static final long SHOPPING_CART_SHORT_OPENING_MESSAGE_THRESHOLD_MS;
    private ShoppingCartCharges mCartCharges;
    long mCartLastUpdatedTime;
    gju mClock;
    private Currency mCurrency;
    private double mDeliveryFee;
    Page mHomePage;
    private String mHoursClosedMessage;
    private String mHoursOpenMessage;
    private int mInventoryHash;
    private HashMap mItems;
    private String mLearnMoreUrl;
    private String mMenuTagline;
    private String mMenuTitle;
    private String mOnTripMessage;
    private HashMap mPages;
    private HashMap mShoppingCart;
    private int mShoppingCartCount;
    private double mSubtotal;
    private double mTaxes;
    List mTimeWindows;
    private TimeZone mTimezone;

    public Store()
    {
        mCartLastUpdatedTime = 0L;
        mInventoryHash = 0;
        mItems = new HashMap();
        mPages = new HashMap();
        mShoppingCartCount = 0;
        mShoppingCart = new HashMap();
        mSubtotal = 0.0D;
        mTaxes = 0.0D;
        mClock = new gju();
    }

    public static Store createFromInventory(Inventory inventory)
    {
        Store store = new Store();
        store.updateInventory(inventory);
        return store;
    }

    private void updateShoppingCartCountAndTotals()
    {
        Iterator iterator = mShoppingCart.values().iterator();
        float f1 = 0.0F;
        int i = 0;
        double d;
        double d1;
        float f;
        Item item;
        for (f = 0.0F; iterator.hasNext(); f = (float)((item.getTaxRate().doubleValue() / 100D) * d + d1))
        {
            item = (Item)iterator.next();
            i += item.getCount().intValue();
            d = (double)item.getCount().intValue() * item.getPrice().doubleValue();
            f1 = (float)((double)f1 + d);
            d1 = f;
        }

        mShoppingCartCount = i;
        mSubtotal = f1;
        mTaxes = f;
    }

    public void clearShoppingCartIfExpired()
    {
        if (isShoppingCartExpired())
        {
            mShoppingCart.clear();
            mShoppingCartCount = 0;
            mSubtotal = 0.0D;
            mTaxes = 0.0D;
            mCartLastUpdatedTime = 0L;
            mCartCharges = null;
        }
    }

    public ShoppingCartCharges getCartCharges()
    {
        return mCartCharges;
    }

    public Date getCloseAt()
    {
        TimeWindow timewindow = getCurrentlyDisplayedTimeWindow();
        if (timewindow != null && timewindow.getEpochTimeClose() > 0L)
        {
            return new Date(timewindow.getEpochTimeClose());
        } else
        {
            return null;
        }
    }

    public Currency getCurrency()
    {
        return mCurrency;
    }

    public TimeWindow getCurrentlyDisplayedTimeWindow()
    {
        long l = gju.a();
        for (Iterator iterator = mTimeWindows.iterator(); iterator.hasNext();)
        {
            TimeWindow timewindow = (TimeWindow)iterator.next();
            if (timewindow.containsTime(l))
            {
                return timewindow;
            }
            if (timewindow.isOpenAfterTime(l))
            {
                return timewindow;
            }
        }

        return null;
    }

    public double getDeliveryFee()
    {
        return mDeliveryFee;
    }

    public Page getHomePage()
    {
        return mHomePage;
    }

    public String getHoursClosedMessage()
    {
        return mHoursClosedMessage;
    }

    public String getHoursOpenMessage()
    {
        return mHoursOpenMessage;
    }

    public int getInventoryHash()
    {
        return mInventoryHash;
    }

    public Item getItem(String s)
    {
        return (Item)mItems.get(s);
    }

    public List getItemsForServer()
    {
        if (mShoppingCartCount <= 0)
        {
            return null;
        } else
        {
            return gkk.a(gki.a(mShoppingCart.values(), new gjv() {

                final Store this$0;

                public ShoppingRequestedItem apply(Item item)
                {
                    return ShoppingRequestedItem.create(item.getItemId(), item.getCount().intValue());
                }

                public volatile Object apply(Object obj)
                {
                    return apply((Item)obj);
                }

            
            {
                this$0 = Store.this;
                super();
            }
            }));
        }
    }

    public String getLearnMoreUrl()
    {
        return mLearnMoreUrl;
    }

    public String getMenuTagline()
    {
        return mMenuTagline;
    }

    public String getMenuTitle()
    {
        return mMenuTitle;
    }

    public String getOnTripMessage()
    {
        return mOnTripMessage;
    }

    public Date getOpenAt()
    {
        TimeWindow timewindow = getCurrentlyDisplayedTimeWindow();
        if (timewindow != null && timewindow.getEpochTimeOpen() > 0L)
        {
            return new Date(timewindow.getEpochTimeOpen());
        } else
        {
            return null;
        }
    }

    public Page getPage(String s)
    {
        return (Page)mPages.get(s);
    }

    public int getShoppingCartCountOfItemInCart(String s)
    {
        if (mShoppingCart.containsKey(s))
        {
            return ((Item)mShoppingCart.get(s)).getCount().intValue();
        } else
        {
            return 0;
        }
    }

    public Collection getShoppingCartItems()
    {
        return mShoppingCart.values();
    }

    public int getShoppingCartTotalItemsCount()
    {
        return mShoppingCartCount;
    }

    public double getSubtotal()
    {
        if (mSubtotal == 0.0D)
        {
            updateShoppingCartCountAndTotals();
        }
        return mSubtotal;
    }

    public double getTaxes()
    {
        if (mTaxes == 0.0D)
        {
            updateShoppingCartCountAndTotals();
        }
        return mTaxes;
    }

    public TimeZone getTimezone()
    {
        return mTimezone;
    }

    public double getTotal()
    {
        return getSubtotal() + getTaxes() + getDeliveryFee();
    }

    public boolean hasItems()
    {
        return mShoppingCartCount > 0;
    }

    public boolean hasValidInventory()
    {
        return getHomePage() != null && getHomePage().getAllPageItems() != null && !getHomePage().getAllPageItems().isEmpty();
    }

    public boolean isOpen()
    {
        TimeWindow timewindow;
        if (mTimeWindows != null && !mTimeWindows.isEmpty() && (mTimeWindows.size() != 1 || !TimeWindow.TIME_WINDOW_ALWAYS_OPEN.equals(mTimeWindows.get(0))) && (mHomePage == null || !mHomePage.isOpen()))
        {
            if ((timewindow = getCurrentlyDisplayedTimeWindow()) == null || !timewindow.isOpen())
            {
                return false;
            }
        }
        return true;
    }

    boolean isShoppingCartExpired()
    {
        long l = gju.a();
        long l1 = mCartLastUpdatedTime;
        return mCartLastUpdatedTime != 0L && l - l1 > SHOPPING_CART_EXPIRY_TIME_MS;
    }

    public void removeReminder(String s, String s1)
    {
        if (!TextUtils.isEmpty(s) && mItems.containsKey(s))
        {
            s = (Item)mItems.get(s);
            Reminder reminder = s.getReminder();
            if (reminder != null && !TextUtils.isEmpty(s1) && s1.equals(reminder.getUuid()))
            {
                s.setReminder(null);
                return;
            }
        }
    }

    public void setCartCharges(ShoppingCartCharges shoppingcartcharges)
    {
        mCartCharges = shoppingcartcharges;
    }

    public void setReminder(String s, String s1, long l)
    {
        if (TextUtils.isEmpty(s) || !mItems.containsKey(s))
        {
            return;
        }
        s = (Item)mItems.get(s);
        Reminder reminder = s.getReminder();
        if (reminder == null)
        {
            s.setReminder(Reminder.create(s1, Long.valueOf(l)));
            return;
        } else
        {
            reminder.setTimestamp(Long.valueOf(l));
            return;
        }
    }

    public boolean shouldShowShortOpeningMessage()
    {
        TimeWindow timewindow = getCurrentlyDisplayedTimeWindow();
        return timewindow != null && timewindow.getEpochTimeOpen() > 0L && timewindow.getEpochTimeOpen() - gju.a() < SHOPPING_CART_SHORT_OPENING_MESSAGE_THRESHOLD_MS;
    }

    public void updateInventory(Inventory inventory)
    {
        Object obj1 = null;
        clearShoppingCartIfExpired();
        int i = inventory.getCategoryAndItemHashCode();
        if (inventory.getCategories() == null || inventory.getCategories().size() == 0 || inventory.getItems() == null || inventory.getItems().size() == 0 || i == mInventoryHash)
        {
            return;
        }
        HashSet hashset = new HashSet();
        for (Iterator iterator = inventory.getCategories().iterator(); iterator.hasNext(); hashset.add(((Category)iterator.next()).getTimeWindow())) { }
        for (Iterator iterator1 = inventory.getItems().iterator(); iterator1.hasNext(); hashset.add(((Item)iterator1.next()).getTimeWindow())) { }
        HashMap hashmap = new HashMap();
        HashMap hashmap1 = new HashMap();
        HashMap hashmap2 = new HashMap();
        Iterator iterator2 = inventory.getCategories().iterator();
        Object obj = null;
        while (iterator2.hasNext()) 
        {
            Object obj5 = (Category)iterator2.next();
            if (!hashmap.containsKey(((Category) (obj5)).getUuid()))
            {
                Object obj2 = new Page(((Category) (obj5)).getUuid());
                ((Page) (obj2)).updateFromCategory(((Category) (obj5)));
                Object obj3;
                Iterator iterator3;
                Object obj6;
                Page page;
                if (obj == null && "u_home".equals(((Category) (obj5)).getTitle()))
                {
                    obj = ((Category) (obj5)).getTimezone();
                    obj1 = obj2;
                } else
                {
                    Object obj4 = obj;
                    obj = obj1;
                    obj1 = obj4;
                }
                hashmap.put(((Page) (obj2)).getUuid(), obj2);
            } else
            {
                obj2 = (Page)hashmap.get(((Category) (obj5)).getUuid());
                ((Page) (obj2)).updateFromCategory(((Category) (obj5)));
                obj3 = obj;
                obj = obj1;
                obj1 = obj3;
            }
            if (((Category) (obj5)).getMemberships() != null)
            {
                for (obj3 = ((Category) (obj5)).getMemberships().iterator(); ((Iterator) (obj3)).hasNext();)
                {
                    obj6 = (CategoryMembership)((Iterator) (obj3)).next();
                    obj5 = ((CategoryMembership) (obj6)).getUuid();
                    obj6 = new PageItem(((Page) (obj2)), ((CategoryMembership) (obj6)).getPriority());
                    if (hashmap.containsKey(obj5))
                    {
                        ((Page)hashmap.get(obj5)).addPageItem(((PageItem) (obj6)));
                    } else
                    {
                        page = new Page(((String) (obj5)));
                        page.addPageItem(((PageItem) (obj6)));
                        hashmap.put(obj5, page);
                    }
                }

            }
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        }
        for (obj2 = inventory.getItems().iterator(); ((Iterator) (obj2)).hasNext();)
        {
            obj3 = (Item)((Iterator) (obj2)).next();
            hashmap1.put(((Item) (obj3)).getItemId(), obj3);
            if (mShoppingCart.containsKey(((Item) (obj3)).getItemId()))
            {
                ((Item) (obj3)).setCount(((Item)mShoppingCart.get(((Item) (obj3)).getItemId())).getCount());
                hashmap2.put(((Item) (obj3)).getItemId(), obj3);
            }
            if (((Item) (obj3)).getMemberships() != null)
            {
                iterator3 = ((Item) (obj3)).getMemberships().iterator();
                while (iterator3.hasNext()) 
                {
                    obj5 = (CategoryMembership)iterator3.next();
                    if (hashmap.containsKey(((CategoryMembership) (obj5)).getUuid()))
                    {
                        obj6 = new PageItem(((Item) (obj3)), ((CategoryMembership) (obj5)).getPriority());
                        ((Page)hashmap.get(((CategoryMembership) (obj5)).getUuid())).addPageItem(((PageItem) (obj6)));
                    }
                }
            }
        }

        for (obj2 = hashmap.values().iterator(); ((Iterator) (obj2)).hasNext(); ((Page)((Iterator) (obj2)).next()).sortItems()) { }
        mCurrency = dtw.a(inventory.getCurrencyCode(), dtw.a);
        mDeliveryFee = inventory.getDeliveryFee();
        mHoursClosedMessage = inventory.getHoursClosedMessage();
        mHoursOpenMessage = inventory.getHoursOpenMessage();
        mHomePage = ((Page) (obj));
        mLearnMoreUrl = inventory.getLearnMoreURL();
        mMenuTagline = inventory.getMenuTagline();
        mMenuTitle = inventory.getMenuTitle();
        mOnTripMessage = inventory.getOnTripMessage();
        mPages = hashmap;
        mItems = hashmap1;
        mShoppingCart = hashmap2;
        mInventoryHash = i;
        mTimeWindows = new ArrayList(hashset);
        Collections.sort(mTimeWindows);
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            inventory = TimeZone.getDefault();
        } else
        {
            inventory = TimeZone.getTimeZone(((String) (obj1)));
        }
        mTimezone = inventory;
        updateShoppingCartCountAndTotals();
    }

    public void updateItemCountInCart(String s, int i)
    {
        int j;
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (!mShoppingCart.containsKey(s)) goto _L2; else goto _L1
_L1:
        Item item = (Item)mShoppingCart.get(s);
        int k = j - item.getCount().intValue();
        item.setCount(Integer.valueOf(j));
        i = k;
        if (j == 0)
        {
            mShoppingCart.remove(s);
            i = k;
        }
_L4:
        mShoppingCartCount = mShoppingCartCount + i;
        mSubtotal = 0.0D;
        mTaxes = 0.0D;
        mCartCharges = null;
        mCartLastUpdatedTime = gju.a();
        return;
_L2:
        i = j;
        if (mItems.containsKey(s))
        {
            Item item1 = (Item)mItems.get(s);
            int l = j - item1.getCount().intValue();
            item1.setCount(Integer.valueOf(j));
            i = l;
            if (j != 0)
            {
                mShoppingCart.put(s, item1);
                i = l;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        SHOPPING_CART_EXPIRY_TIME_MS = TimeUnit.MINUTES.toMillis(20L);
        SHOPPING_CART_SHORT_OPENING_MESSAGE_THRESHOLD_MS = TimeUnit.HOURS.toMillis(12L);
    }
}
