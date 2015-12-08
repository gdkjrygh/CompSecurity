// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class DatabaseContentProvider extends ContentProvider
{

    private static final int INDIVIDUAL = 101;
    private static final int INVENTORY = 100;
    private final String contentType;
    private final Uri contentUri;
    private SQLiteOpenHelper databaseHelper;
    private final String idColumnName;
    private final Map individualProjectionMap;
    private final Map inventoryProjectionMap;
    private final String itemContentType;
    private final String tableName;
    private final UriMatcher uriMatcher = new UriMatcher(-1);

    protected DatabaseContentProvider(String s, String s1, String s2, String s3, String s4, String s5, Map map, 
            Map map1)
    {
        idColumnName = s5;
        inventoryProjectionMap = (Map)Preconditions.checkNotNull(map);
        individualProjectionMap = (Map)Preconditions.checkNotNull(map1);
        tableName = (String)Preconditions.checkNotNull(s4);
        contentType = (String)Preconditions.checkNotNull(s2);
        itemContentType = (String)Preconditions.checkNotNull(s3);
        Preconditions.checkNotNull(s1);
        Preconditions.checkNotNull(s);
        uriMatcher.addURI(s1, s, 100);
        uriMatcher.addURI(s1, (new StringBuilder()).append(s).append("/*").toString(), 101);
        contentUri = Uri.parse((new StringBuilder()).append("content://").append(s1).append("/contentPath").toString());
    }

    private void notifyChange(Uri uri)
    {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    public ContentProviderResult[] applyBatch(ArrayList arraylist)
        throws OperationApplicationException
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = databaseHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        ContentProviderResult acontentproviderresult[];
        int j;
        j = arraylist.size();
        acontentproviderresult = new ContentProviderResult[j];
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        acontentproviderresult[i] = ((ContentProviderOperation)arraylist.get(i)).apply(this, acontentproviderresult, i);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return acontentproviderresult;
        arraylist;
        sqlitedatabase.endTransaction();
        throw arraylist;
    }

    public int delete(Uri uri, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        String s2;
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());

        case 100: // 'd'
            return sqlitedatabase.delete(tableName, s, as);

        case 101: // 'e'
            s2 = (new StringBuilder()).append(idColumnName).append(" = ?").toString();
            break;
        }
        String s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s2).append(" AND ").append(s).toString();
        }
        s = (String)uri.getPathSegments().get(1);
        if (as == null)
        {
            uri = new String[1];
            uri[0] = s;
        } else
        {
            uri = (String[])ObjectArrays.concat(as, s);
        }
        return sqlitedatabase.delete(tableName, s1, uri);
    }

    public String getType(Uri uri)
    {
        switch (uriMatcher.match(uri))
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unknown uri: ").append(uri).toString());

        case 100: // 'd'
            return contentType;

        case 101: // 'e'
            return itemContentType;
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        long l;
        switch (uriMatcher.match(uri))
        {
        default:
            throw new UnsupportedOperationException((new StringBuilder()).append("Unknown uri: ").append(uri).toString());

        case 100: // 'd'
            l = sqlitedatabase.insertOrThrow(tableName, null, contentvalues);
            break;
        }
        notifyChange(uri);
        return ContentUris.withAppendedId(contentUri, l);
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
        throws FileNotFoundException
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Unknown uri: ").append(uri).toString());
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder;
        boolean flag;
        if (databaseHelper != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables(tableName);
        uriMatcher.match(uri);
        JVM INSTR tableswitch 100 101: default 64
    //                   100 114
    //                   101 160;
           goto _L1 _L2 _L3
_L1:
        throw new UnsupportedOperationException((new StringBuilder()).append("Not supported query(uri=").append(uri).append(", proj=").append(Arrays.toString(as)).append(')').toString());
_L2:
        sqlitequerybuilder.setProjectionMap(inventoryProjectionMap);
_L5:
        as = sqlitequerybuilder.query(databaseHelper.getReadableDatabase(), as, s, as1, null, null, s1);
        as.setNotificationUri(getContext().getContentResolver(), uri);
        return as;
_L3:
        sqlitequerybuilder.setProjectionMap(individualProjectionMap);
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void setDatabaseHelper(SQLiteOpenHelper sqliteopenhelper)
    {
        databaseHelper = sqliteopenhelper;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        uriMatcher.match(uri);
        JVM INSTR tableswitch 100 101: default 40
    //                   100 67
    //                   101 97;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());
_L2:
        int i = sqlitedatabase.update(tableName, contentvalues, s, as);
_L5:
        getContext().getContentResolver().notifyChange(uri, null);
        return i;
_L3:
        String s2 = (new StringBuilder()).append(idColumnName).append(" = ?").toString();
        String s1 = s2;
        if (s != null)
        {
            s1 = (new StringBuilder()).append(s2).append(" AND ").append(s).toString();
        }
        s2 = (String)uri.getPathSegments().get(1);
        if (as == null)
        {
            s = new String[1];
            s[0] = s2;
        } else
        {
            s = (String[])ObjectArrays.concat(as, s2);
        }
        i = sqlitedatabase.update(tableName, contentvalues, s1, s);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
