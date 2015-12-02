// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public final class duk
{

    private static final String a[] = {
        "data15"
    };

    public static byte[] a(Context context, Uri uri)
    {
        Object obj = null;
        if (context != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        return context;
_L2:
        if (uri == null)
        {
            return null;
        }
        Cursor cursor = context.getContentResolver().query(uri, a, null, null, null);
        int i = cursor.getCount();
        if (i == 0)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return null;
        }
        cursor.moveToFirst();
        uri = cursor.getBlob(cursor.getColumnIndex("data15"));
        context = uri;
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return uri;
        context;
        uri = obj;
_L6:
        if (uri != null)
        {
            uri.close();
        }
        throw context;
        context;
        uri = cursor;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
