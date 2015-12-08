// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator.analytics;


public interface AniviaAnalytics
{
    public static interface Attribute
    {

        public static final String DISTANCE_FROM_STORE = "distanceFromStore";
        public static final String PAGE_NAME = "name";
        public static final String SEARCH_TERM = "searchTerm";
        public static final String SECTION = "section";
        public static final String SUBCATEGORY = "subCategory";
    }

    public static interface Event
    {

        public static final String PAGE_VIEW = "pageView";
        public static final String STORE_LOCATOR = "storeLocator";
    }

    public static interface Page
    {

        public static final String STORE_FINDER_ERROR = "StoreFinderError";
        public static final String STORE_LIST = "store list";
        public static final String STORE_MAP = "store map";
    }

    public static interface Section
    {

        public static final String STORE = "store";
    }

    public static interface SubCategory
    {

        public static final String STORE = "store";
    }

}
