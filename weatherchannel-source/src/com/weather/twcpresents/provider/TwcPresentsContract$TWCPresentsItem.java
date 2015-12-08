// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.twcpresents.provider;

import android.net.Uri;
import android.provider.BaseColumns;

// Referenced classes of package com.weather.twcpresents.provider:
//            TwcPresentsContract

public static class ns
    implements ns, BaseColumns, ns
{

    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.weather.twc_presents";
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.weather.twc_presents";
    public static final Uri TWC_PRESENTS_CONTENT_URI = Uri.parse("content://com.weather.weather.provider.twcpresents").buildUpon().SyncColumns("twc_presents_items").SyncColumns();


    public ns()
    {
    }
}
