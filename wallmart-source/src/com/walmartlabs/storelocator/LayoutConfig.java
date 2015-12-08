// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import java.util.HashMap;

public class LayoutConfig
{
    public static final class DrawableEnum extends Enum
    {

        private static final DrawableEnum $VALUES[];
        public static final DrawableEnum FILTER_BUTTON;
        public static final DrawableEnum FILTER_BUTTON_ACTIVE;
        public static final DrawableEnum LIST_BUTTON_DRAWABLE;
        public static final DrawableEnum MAP_BUTTON_DRAWABLE;
        public static final DrawableEnum SEARCH_HINT_ICON;

        public static DrawableEnum valueOf(String s)
        {
            return (DrawableEnum)Enum.valueOf(com/walmartlabs/storelocator/LayoutConfig$DrawableEnum, s);
        }

        public static DrawableEnum[] values()
        {
            return (DrawableEnum[])$VALUES.clone();
        }

        static 
        {
            MAP_BUTTON_DRAWABLE = new DrawableEnum("MAP_BUTTON_DRAWABLE", 0);
            LIST_BUTTON_DRAWABLE = new DrawableEnum("LIST_BUTTON_DRAWABLE", 1);
            FILTER_BUTTON_ACTIVE = new DrawableEnum("FILTER_BUTTON_ACTIVE", 2);
            SEARCH_HINT_ICON = new DrawableEnum("SEARCH_HINT_ICON", 3);
            FILTER_BUTTON = new DrawableEnum("FILTER_BUTTON", 4);
            $VALUES = (new DrawableEnum[] {
                MAP_BUTTON_DRAWABLE, LIST_BUTTON_DRAWABLE, FILTER_BUTTON_ACTIVE, SEARCH_HINT_ICON, FILTER_BUTTON
            });
        }

        private DrawableEnum(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LayoutEnum extends Enum
    {

        private static final LayoutEnum $VALUES[];
        public static final LayoutEnum LIST_ONLY_LAYOUT;
        public static final LayoutEnum MAP_AND_LIST_LAYOUT;
        public static final LayoutEnum SEARCH_LIST_LAYOUT;
        public static final LayoutEnum SEARCH_SUGGESTION_ITEM;

        public static LayoutEnum valueOf(String s)
        {
            return (LayoutEnum)Enum.valueOf(com/walmartlabs/storelocator/LayoutConfig$LayoutEnum, s);
        }

        public static LayoutEnum[] values()
        {
            return (LayoutEnum[])$VALUES.clone();
        }

        static 
        {
            LIST_ONLY_LAYOUT = new LayoutEnum("LIST_ONLY_LAYOUT", 0);
            MAP_AND_LIST_LAYOUT = new LayoutEnum("MAP_AND_LIST_LAYOUT", 1);
            SEARCH_LIST_LAYOUT = new LayoutEnum("SEARCH_LIST_LAYOUT", 2);
            SEARCH_SUGGESTION_ITEM = new LayoutEnum("SEARCH_SUGGESTION_ITEM", 3);
            $VALUES = (new LayoutEnum[] {
                LIST_ONLY_LAYOUT, MAP_AND_LIST_LAYOUT, SEARCH_LIST_LAYOUT, SEARCH_SUGGESTION_ITEM
            });
        }

        private LayoutEnum(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class StringEnum extends Enum
    {

        private static final StringEnum $VALUES[];
        public static final StringEnum LOADING_PROGRESS;
        public static final StringEnum NO_CLOSE_SHIPPING_LOCATIONS;
        public static final StringEnum NO_FILTERED_RESULT;
        public static final StringEnum NO_LOCAL_RESULT;
        public static final StringEnum NO_LOCATION;
        public static final StringEnum SEARCHING_PROGRESS;

        public static StringEnum valueOf(String s)
        {
            return (StringEnum)Enum.valueOf(com/walmartlabs/storelocator/LayoutConfig$StringEnum, s);
        }

        public static StringEnum[] values()
        {
            return (StringEnum[])$VALUES.clone();
        }

        static 
        {
            SEARCHING_PROGRESS = new StringEnum("SEARCHING_PROGRESS", 0);
            NO_FILTERED_RESULT = new StringEnum("NO_FILTERED_RESULT", 1);
            NO_LOCATION = new StringEnum("NO_LOCATION", 2);
            NO_LOCAL_RESULT = new StringEnum("NO_LOCAL_RESULT", 3);
            NO_CLOSE_SHIPPING_LOCATIONS = new StringEnum("NO_CLOSE_SHIPPING_LOCATIONS", 4);
            LOADING_PROGRESS = new StringEnum("LOADING_PROGRESS", 5);
            $VALUES = (new StringEnum[] {
                SEARCHING_PROGRESS, NO_FILTERED_RESULT, NO_LOCATION, NO_LOCAL_RESULT, NO_CLOSE_SHIPPING_LOCATIONS, LOADING_PROGRESS
            });
        }

        private StringEnum(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class ViewEnum extends Enum
    {

        private static final ViewEnum $VALUES[];
        public static final ViewEnum CLEAR_TEXT_BUTTON;
        public static final ViewEnum EMPTY_LIST_VIEW;
        public static final ViewEnum FILTER_BUTTON;
        public static final ViewEnum LIST_BUTTON;
        public static final ViewEnum LIST_VIEW;
        public static final ViewEnum LOADING_STORES_MAP_SPINNER_VIEW;
        public static final ViewEnum LOCATION_BUTTON;
        public static final ViewEnum MAP_VIEW;
        public static final ViewEnum MAP_VIEW_CONTAINER;
        public static final ViewEnum SEARCH_BAR_CONTAINER;
        public static final ViewEnum SEARCH_BUTTON;
        public static final ViewEnum SEARCH_FIELD;
        public static final ViewEnum SEARCH_ITEM_ARROW;
        public static final ViewEnum SEARCH_ITEM_ENTRY;
        public static final ViewEnum SEARCH_ITEM_NOTE;
        public static final ViewEnum SEARCH_ITEM_TEXT;
        public static final ViewEnum SEARCH_RESULT_LIST;
        public static final ViewEnum VOICE_SEARCH_BUTTON;

        public static ViewEnum valueOf(String s)
        {
            return (ViewEnum)Enum.valueOf(com/walmartlabs/storelocator/LayoutConfig$ViewEnum, s);
        }

        public static ViewEnum[] values()
        {
            return (ViewEnum[])$VALUES.clone();
        }

        static 
        {
            MAP_VIEW_CONTAINER = new ViewEnum("MAP_VIEW_CONTAINER", 0);
            LIST_VIEW = new ViewEnum("LIST_VIEW", 1);
            EMPTY_LIST_VIEW = new ViewEnum("EMPTY_LIST_VIEW", 2);
            MAP_VIEW = new ViewEnum("MAP_VIEW", 3);
            FILTER_BUTTON = new ViewEnum("FILTER_BUTTON", 4);
            LIST_BUTTON = new ViewEnum("LIST_BUTTON", 5);
            LOCATION_BUTTON = new ViewEnum("LOCATION_BUTTON", 6);
            SEARCH_ITEM_TEXT = new ViewEnum("SEARCH_ITEM_TEXT", 7);
            SEARCH_ITEM_ENTRY = new ViewEnum("SEARCH_ITEM_ENTRY", 8);
            SEARCH_ITEM_ARROW = new ViewEnum("SEARCH_ITEM_ARROW", 9);
            SEARCH_BUTTON = new ViewEnum("SEARCH_BUTTON", 10);
            SEARCH_FIELD = new ViewEnum("SEARCH_FIELD", 11);
            CLEAR_TEXT_BUTTON = new ViewEnum("CLEAR_TEXT_BUTTON", 12);
            VOICE_SEARCH_BUTTON = new ViewEnum("VOICE_SEARCH_BUTTON", 13);
            SEARCH_RESULT_LIST = new ViewEnum("SEARCH_RESULT_LIST", 14);
            SEARCH_BAR_CONTAINER = new ViewEnum("SEARCH_BAR_CONTAINER", 15);
            SEARCH_ITEM_NOTE = new ViewEnum("SEARCH_ITEM_NOTE", 16);
            LOADING_STORES_MAP_SPINNER_VIEW = new ViewEnum("LOADING_STORES_MAP_SPINNER_VIEW", 17);
            $VALUES = (new ViewEnum[] {
                MAP_VIEW_CONTAINER, LIST_VIEW, EMPTY_LIST_VIEW, MAP_VIEW, FILTER_BUTTON, LIST_BUTTON, LOCATION_BUTTON, SEARCH_ITEM_TEXT, SEARCH_ITEM_ENTRY, SEARCH_ITEM_ARROW, 
                SEARCH_BUTTON, SEARCH_FIELD, CLEAR_TEXT_BUTTON, VOICE_SEARCH_BUTTON, SEARCH_RESULT_LIST, SEARCH_BAR_CONTAINER, SEARCH_ITEM_NOTE, LOADING_STORES_MAP_SPINNER_VIEW
            });
        }

        private ViewEnum(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int UNUSED = -1;
    public HashMap mDrawableMap;
    public HashMap mLayoutMap;
    public HashMap mStringMap;
    public HashMap mViewMap;

    public LayoutConfig()
    {
        mViewMap = new HashMap();
        mLayoutMap = new HashMap();
        mDrawableMap = new HashMap();
        mStringMap = new HashMap();
        setIdForStringEnum(StringEnum.SEARCHING_PROGRESS, com.walmart.lib.R.string.store_finder_dialog_searching_stores);
        setIdForStringEnum(StringEnum.NO_FILTERED_RESULT, com.walmart.lib.R.string.store_finder_dialog_filter_not_applied);
        setIdForStringEnum(StringEnum.NO_LOCATION, com.walmart.lib.R.string.store_finder_dialog_location_fix_timeout);
        setIdForStringEnum(StringEnum.NO_LOCAL_RESULT, com.walmart.lib.R.string.store_finder_dialog_no_stores);
        setIdForStringEnum(StringEnum.NO_CLOSE_SHIPPING_LOCATIONS, com.walmart.lib.R.string.store_finder_dialog_no_stores_with_shipping_options);
        setIdForStringEnum(StringEnum.LOADING_PROGRESS, com.walmart.lib.R.string.store_list_loading);
    }

    public int getIdForDrawableEnum(DrawableEnum drawableenum)
    {
        drawableenum = (Integer)mDrawableMap.get(drawableenum);
        if (drawableenum == null)
        {
            return -1;
        } else
        {
            return drawableenum.intValue();
        }
    }

    public int getIdForLayoutEnum(LayoutEnum layoutenum)
    {
        layoutenum = (Integer)mLayoutMap.get(layoutenum);
        if (layoutenum == null)
        {
            return -1;
        } else
        {
            return layoutenum.intValue();
        }
    }

    public int getIdForStringEnum(StringEnum stringenum)
    {
        stringenum = (Integer)mStringMap.get(stringenum);
        if (stringenum == null)
        {
            return com.walmart.lib.R.string.empty;
        } else
        {
            return stringenum.intValue();
        }
    }

    public int getIdForViewEnum(ViewEnum viewenum)
    {
        viewenum = (Integer)mViewMap.get(viewenum);
        if (viewenum == null)
        {
            return -1;
        } else
        {
            return viewenum.intValue();
        }
    }

    public void setIdForDrawableEnum(DrawableEnum drawableenum, int i)
    {
        mDrawableMap.put(drawableenum, Integer.valueOf(i));
    }

    public void setIdForLayoutEnum(LayoutEnum layoutenum, int i)
    {
        mLayoutMap.put(layoutenum, Integer.valueOf(i));
    }

    public void setIdForStringEnum(StringEnum stringenum, int i)
    {
        mStringMap.put(stringenum, Integer.valueOf(i));
    }

    public void setIdForViewEnum(ViewEnum viewenum, int i)
    {
        mViewMap.put(viewenum, Integer.valueOf(i));
    }
}
