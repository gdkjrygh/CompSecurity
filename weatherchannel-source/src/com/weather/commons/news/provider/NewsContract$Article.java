// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.provider;

import android.net.Uri;
import android.provider.BaseColumns;

// Referenced classes of package com.weather.commons.news.provider:
//            NewsContract

public static class olumns
    implements olumns, BaseColumns
{

    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.weather.article";
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.weather.article";
    public static final Uri TOP_STORY_CONTENT_URI = Uri.parse("content://com.weather.weather.provider.topstories").buildUpon().h("top_stories").h();


    public olumns()
    {
    }
}
