// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;

import gka;
import gki;
import gkk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            PageItem, CategoryMembership, TimeWindow, Category

public class Page
{

    final Set mChildrenTimeWindows = new HashSet();
    String mDescription;
    DisplayType mDisplayType;
    String mImageUrl;
    List mMemberships;
    final List mPageItems = new ArrayList();
    TimeWindow mTimeWindow;
    String mTitle;
    final String mUuid;

    public Page(String s)
    {
        mUuid = s;
    }

    public void addPageItem(PageItem pageitem)
    {
        mChildrenTimeWindows.add(pageitem.getTimeWindow());
        mPageItems.add(pageitem);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Page))
            {
                return false;
            }
            obj = (Page)obj;
            if (mDescription == null ? ((Page) (obj)).mDescription != null : !mDescription.equals(((Page) (obj)).mDescription))
            {
                return false;
            }
            if (mDisplayType != ((Page) (obj)).mDisplayType)
            {
                return false;
            }
            if (mImageUrl == null ? ((Page) (obj)).mImageUrl != null : !mImageUrl.equals(((Page) (obj)).mImageUrl))
            {
                return false;
            }
            if (mTitle == null ? ((Page) (obj)).mTitle != null : !mTitle.equals(((Page) (obj)).mTitle))
            {
                return false;
            }
            if (mUuid == null ? ((Page) (obj)).mUuid != null : !mUuid.equals(((Page) (obj)).mUuid))
            {
                return false;
            }
        }
        return true;
    }

    public List getAllPageItems()
    {
        return mPageItems;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public DisplayType getDisplayType()
    {
        return mDisplayType;
    }

    public String getFirstParentUuid()
    {
        if (mMemberships == null || mMemberships.isEmpty())
        {
            return null;
        } else
        {
            return ((CategoryMembership)mMemberships.get(0)).getUuid();
        }
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public List getPageItemsForTime(final TimeWindow window)
    {
        if (window == null)
        {
            return mPageItems;
        } else
        {
            return gkk.a(gki.a(mPageItems, new gka() {

                final Page this$0;
                final TimeWindow val$window;

                public boolean apply(PageItem pageitem)
                {
                    return pageitem.isPageItemVisible(window);
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((PageItem)obj);
                }

            
            {
                this$0 = Page.this;
                window = timewindow;
                super();
            }
            }));
        }
    }

    public TimeWindow getTimeWindow()
    {
        return mTimeWindow;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getUuid()
    {
        return mUuid;
    }

    public int hashCode()
    {
        if (mUuid != null)
        {
            return mUuid.hashCode();
        } else
        {
            return 0;
        }
    }

    public boolean isChildActiveDuringTime(TimeWindow timewindow)
    {
        return mChildrenTimeWindows.contains(timewindow) || mChildrenTimeWindows.contains(TimeWindow.TIME_WINDOW_ALWAYS_OPEN);
    }

    public boolean isMember(String s)
    {
        if (mMemberships == null || mMemberships.isEmpty() || s == null)
        {
            return false;
        }
        for (Iterator iterator = mMemberships.iterator(); iterator.hasNext();)
        {
            if (s.equals(((CategoryMembership)iterator.next()).getUuid()))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isOpen()
    {
        return mTimeWindow.isOpen();
    }

    public void sortItems()
    {
        Collections.sort(mPageItems);
    }

    public void updateFromCategory(Category category)
    {
        mDescription = category.getDescription();
        mDisplayType = DisplayType.fromType(category.getDisplayType());
        mImageUrl = category.getImageUrlOriginal();
        mMemberships = category.getMemberships();
        mTitle = category.getDisplayTitle();
        mTimeWindow = category.getTimeWindow();
    }

    private class DisplayType extends Enum
    {

        private static final DisplayType $VALUES[];
        public static final DisplayType COMPACT_LIST;
        public static final DisplayType GRID;
        public static final DisplayType LARGE_IMAGE_LIST;
        private final String mType;

        public static DisplayType fromType(String s)
        {
            DisplayType adisplaytype[] = values();
            int j = adisplaytype.length;
            for (int i = 0; i < j; i++)
            {
                DisplayType displaytype = adisplaytype[i];
                if (displaytype.mType.equals(s))
                {
                    return displaytype;
                }
            }

            return COMPACT_LIST;
        }

        public static DisplayType valueOf(String s)
        {
            return (DisplayType)Enum.valueOf(com/ubercab/client/feature/shoppingcart/model/Page$DisplayType, s);
        }

        public static DisplayType[] values()
        {
            return (DisplayType[])$VALUES.clone();
        }

        static 
        {
            COMPACT_LIST = new DisplayType("COMPACT_LIST", 0, "");
            GRID = new DisplayType("GRID", 1, "grid");
            LARGE_IMAGE_LIST = new DisplayType("LARGE_IMAGE_LIST", 2, "list");
            $VALUES = (new DisplayType[] {
                COMPACT_LIST, GRID, LARGE_IMAGE_LIST
            });
        }

        private DisplayType(String s, int i, String s1)
        {
            super(s, i);
            mType = s1;
        }
    }

}
