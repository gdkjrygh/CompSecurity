// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            cp

class z
    implements cp
{

    private final ContentProvider a;

    z(ContentProvider contentprovider)
    {
        a = contentprovider;
    }

    public int a(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return a.update(uri, contentvalues, s, as);
    }

    public int a(Uri uri, String s, String as[])
    {
        return a.delete(uri, s, as);
    }

    public Cursor a(Uri uri, String as[], String s, String as1[], String s1)
    {
        return a.query(uri, as, s, as1, s1);
    }

    public Uri a(Uri uri, ContentValues contentvalues)
    {
        return a.insert(uri, contentvalues);
    }

    public ContentProviderResult[] a(ArrayList arraylist)
    {
        return a.applyBatch(arraylist);
    }
}
