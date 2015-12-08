// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

final class z extends ContextWrapper
{

    private final String a;

    public z(Context context, String s)
    {
        super(context);
        a = (new StringBuilder(".TwitterSdk/")).append(s).toString();
    }

    public final File getCacheDir()
    {
        return new File(super.getCacheDir(), a);
    }

    public final File getDatabasePath(String s)
    {
        File file = new File(super.getDatabasePath(s).getParentFile(), a);
        file.mkdirs();
        return new File(file, s);
    }

    public final File getExternalCacheDir()
    {
        return new File(super.getExternalCacheDir(), a);
    }

    public final File getExternalFilesDir(String s)
    {
        return new File(super.getExternalFilesDir(s), a);
    }

    public final File getFilesDir()
    {
        return new File(super.getFilesDir(), a);
    }

    public final SQLiteDatabase openOrCreateDatabase(String s, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
    {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(s), cursorfactory);
    }

    public final SQLiteDatabase openOrCreateDatabase(String s, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, DatabaseErrorHandler databaseerrorhandler)
    {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(s).getPath(), cursorfactory, databaseerrorhandler);
    }
}
