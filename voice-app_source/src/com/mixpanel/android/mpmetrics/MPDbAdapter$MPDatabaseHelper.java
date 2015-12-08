// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPDbAdapter, MPConfig

private static class mConfig extends SQLiteOpenHelper
{

    private final MPConfig mConfig;
    private final File mDatabaseFile;

    public boolean belowMemThreshold()
    {
        return !mDatabaseFile.exists() || Math.max(mDatabaseFile.getUsableSpace(), mConfig.getMinimumDatabaseLimit()) >= mDatabaseFile.length();
    }

    public void deleteDatabase()
    {
        close();
        mDatabaseFile.delete();
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
        }
        sqlitedatabase.execSQL(MPDbAdapter.access$0());
        sqlitedatabase.execSQL(MPDbAdapter.access$1());
        sqlitedatabase.execSQL(MPDbAdapter.access$2());
        sqlitedatabase.execSQL(MPDbAdapter.access$3());
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
        }
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(mDatabaseFile.mDatabaseFile()).toString());
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(mDatabaseFile.mDatabaseFile()).toString());
        sqlitedatabase.execSQL(MPDbAdapter.access$0());
        sqlitedatabase.execSQL(MPDbAdapter.access$1());
        sqlitedatabase.execSQL(MPDbAdapter.access$2());
        sqlitedatabase.execSQL(MPDbAdapter.access$3());
    }

    A(Context context, String s)
    {
        super(context, s, null, 4);
        mDatabaseFile = context.getDatabasePath(s);
        mConfig = MPConfig.getInstance(context);
    }
}
