// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentProviderClient;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            cp, uk

final class m3
    implements cp
{

    private final ContentProviderClient a;

    private m3(ContentProviderClient contentproviderclient)
    {
        a = contentproviderclient;
    }

    m3(ContentProviderClient contentproviderclient, uk uk)
    {
        this(contentproviderclient);
    }

    public int a(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        int i;
        try
        {
            i = a.update(uri, contentvalues, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return -1;
        }
        return i;
    }

    public int a(Uri uri, String s, String as[])
    {
        int i;
        try
        {
            i = a.delete(uri, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return -1;
        }
        return i;
    }

    public Cursor a(Uri uri, String as[], String s, String as1[], String s1)
    {
        try
        {
            uri = a.query(uri, as, s, as1, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        return uri;
    }

    public Uri a(Uri uri, ContentValues contentvalues)
    {
        try
        {
            uri = a.insert(uri, contentvalues);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        return uri;
    }

    public ContentProviderResult[] a(ArrayList arraylist)
    {
        return a.applyBatch(arraylist);
    }
}
