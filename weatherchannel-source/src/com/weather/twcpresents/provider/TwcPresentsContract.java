// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.twcpresents.provider;

import android.content.ContentValues;
import android.net.Uri;
import android.provider.BaseColumns;

// Referenced classes of package com.weather.twcpresents.provider:
//            TwcPresentsPojo

public class TwcPresentsContract
{
    public static interface SyncColumns
    {

        public static final String UPDATED = "updated";
    }

    static interface TWCPresentsColumns
    {

        public static final String FEAT_DESCRIPT = "featDescript";
        public static final String FEAT_IMAGE = "featImage";
        public static final String FEAT_TIME = "featTime";
        public static final String FEAT_TITLE = "featTitle";
        public static final String URL = "url";
    }

    public static class TWCPresentsItem
        implements TWCPresentsColumns, BaseColumns, SyncColumns
    {

        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.weather.twc_presents";
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.weather.twc_presents";
        public static final Uri TWC_PRESENTS_CONTENT_URI = Uri.parse("content://com.weather.weather.provider.twcpresents").buildUpon().appendPath("twc_presents_items").build();


        public TWCPresentsItem()
        {
        }
    }


    private static final String PATH_TO_TWC_PRESENTS = "twc_presents_items";

    private TwcPresentsContract()
    {
    }

    public static ContentValues makeContentValues(TwcPresentsPojo twcpresentspojo)
    {
        ContentValues contentvalues = new ContentValues();
        String s;
        if (twcpresentspojo.featTitle != null)
        {
            s = twcpresentspojo.featTitle;
        } else
        {
            s = "";
        }
        contentvalues.put("featTitle", s);
        if (twcpresentspojo.featTime != null)
        {
            s = twcpresentspojo.featTime;
        } else
        {
            s = "";
        }
        contentvalues.put("featTime", s);
        if (twcpresentspojo.featDescript != null)
        {
            s = twcpresentspojo.featDescript;
        } else
        {
            s = "";
        }
        contentvalues.put("featDescript", s);
        if (twcpresentspojo.featImage != null)
        {
            s = twcpresentspojo.featImage;
        } else
        {
            s = "";
        }
        contentvalues.put("featImage", s);
        if (twcpresentspojo.url != null)
        {
            twcpresentspojo = twcpresentspojo.url;
        } else
        {
            twcpresentspojo = "";
        }
        contentvalues.put("url", twcpresentspojo);
        return contentvalues;
    }
}
