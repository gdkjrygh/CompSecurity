// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.twcpresents.provider;

import android.content.ContentValues;
import android.net.Uri;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.weather.util.DatabaseContentProvider;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.twcpresents.provider:
//            TwcPresentsDatabase

public class TwcPresentsProvider extends DatabaseContentProvider
{

    public static final String AUTHORITY = "com.weather.weather.provider.twcpresents";
    private static final Map sTwcPresentsProjectionMap = buildArticlesProjectionMap();
    private TwcPresentsDatabase mOpenHelper;

    public TwcPresentsProvider()
    {
        super("twc_presents_items", "com.weather.weather.provider.twcpresents", "vnd.android.cursor.dir/vnd.weather.twc_presents", "vnd.android.cursor.item/vnd.weather.twc_presents", "twc_presents_items", "_id", sTwcPresentsProjectionMap, sTwcPresentsProjectionMap);
    }

    private static Map buildArticlesProjectionMap()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("_id", "_id");
        hashmap.put("featTitle", "featTitle");
        hashmap.put("featTime", "featTime");
        hashmap.put("featDescript", "featDescript");
        hashmap.put("featImage", "featImage");
        hashmap.put("url", "url");
        hashmap.put("updated", "updated");
        return ImmutableMap.copyOf(hashmap);
    }

    TwcPresentsDatabase getOpenHelperForTest()
    {
        return (TwcPresentsDatabase)Preconditions.checkNotNull(mOpenHelper);
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        contentvalues.put("updated", Long.valueOf(System.currentTimeMillis()));
        return super.insert(uri, contentvalues);
    }

    public boolean onCreate()
    {
        mOpenHelper = new TwcPresentsDatabase(getContext());
        setDatabaseHelper(mOpenHelper);
        return true;
    }

    public void shutdown()
    {
        mOpenHelper.close();
        TwcPresentsDatabase.deleteDatabase(getContext());
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        contentvalues.put("updated", Long.valueOf(System.currentTimeMillis()));
        return super.update(uri, contentvalues, s, as);
    }

}
