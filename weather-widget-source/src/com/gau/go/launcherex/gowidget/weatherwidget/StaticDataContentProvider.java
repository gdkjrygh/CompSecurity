// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weatherwidget;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.gau.go.a.c.a;
import com.gau.go.a.e;

public class StaticDataContentProvider extends ContentProvider
{

    public static Uri a = (new android.net.Uri.Builder()).scheme("content").authority("com.gau.go.launcherex.gowidget.weatherwidget.staticsdkprovider").appendPath("data_new").build();
    public static Uri b = (new android.net.Uri.Builder()).scheme("content").authority("com.gau.go.launcherex.gowidget.weatherwidget.staticsdkprovider").appendPath("data").build();
    public static Uri c = (new android.net.Uri.Builder()).scheme("content").authority("com.gau.go.launcherex.gowidget.weatherwidget.staticsdkprovider").appendPath("ctrlinfo").build();
    public static boolean d = true;
    private static UriMatcher f;
    private volatile long e;
    private byte g[];
    private a h;

    public StaticDataContentProvider()
    {
        e = 0L;
        g = new byte[0];
    }

    public int delete(Uri uri, String s, String as[])
    {
        Object obj = null;
        f.match(uri);
        JVM INSTR tableswitch 1 3: default 36
    //                   1 58
    //                   2 65
    //                   3 72;
           goto _L1 _L2 _L3 _L4
_L1:
        uri = obj;
_L6:
        if (uri == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = h.a(uri, s, as);
        return i;
_L2:
        uri = a.a;
        continue; /* Loop/switch isn't completed */
_L3:
        uri = a.b;
        continue; /* Loop/switch isn't completed */
_L4:
        uri = a.c;
        if (true) goto _L6; else goto _L5
        uri;
        uri.printStackTrace();
_L5:
        return 0;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        f.match(uri);
        JVM INSTR tableswitch 1 2: default 28
    //                   1 54
    //                   2 61;
           goto _L1 _L2 _L3
_L1:
        String s = null;
_L5:
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        long l = h.a(s, contentvalues);
        if (l > 0L)
        {
            return uri;
        }
        break; /* Loop/switch isn't completed */
_L2:
        s = a.a;
        continue; /* Loop/switch isn't completed */
_L3:
        s = a.b;
        if (true) goto _L5; else goto _L4
        uri;
        uri.printStackTrace();
_L4:
        return null;
    }

    public boolean onCreate()
    {
        h = new a(getContext());
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        Uri uri1;
label0:
        {
            uri1 = null;
            synchronized (g)
            {
                if (e.c == null || e.c.equals(e.b))
                {
                    break label0;
                }
            }
            return null;
        }
        if (e == 0L || System.currentTimeMillis() - e >= 100L)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        abyte0;
        JVM INSTR monitorexit ;
        return null;
        int i = f.match(uri);
        i;
        JVM INSTR tableswitch 1 3: default 100
    //                   1 158
    //                   2 165
    //                   3 172;
           goto _L1 _L2 _L3 _L4
_L1:
        uri = null;
_L7:
        if (uri == null) goto _L6; else goto _L5
_L5:
        uri = h.a(uri, as, s, as1, s1);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        uri1 = uri;
        if (uri.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        uri1 = uri;
        e = System.currentTimeMillis();
_L8:
        abyte0;
        JVM INSTR monitorexit ;
        return uri;
        uri;
        abyte0;
        JVM INSTR monitorexit ;
        throw uri;
_L2:
        uri = a.a;
          goto _L7
_L3:
        uri = a.b;
          goto _L7
_L4:
        uri = a.c;
          goto _L7
        uri;
        uri.printStackTrace();
        uri = uri1;
          goto _L8
_L6:
        uri = null;
          goto _L8
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        Object obj = null;
        f.match(uri);
        JVM INSTR tableswitch 1 2: default 32
    //                   1 56
    //                   2 63;
           goto _L1 _L2 _L3
_L1:
        uri = obj;
_L5:
        if (uri == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = h.a(uri, contentvalues, s, as);
        return i;
_L2:
        uri = a.a;
        continue; /* Loop/switch isn't completed */
_L3:
        uri = a.b;
        if (true) goto _L5; else goto _L4
        uri;
        uri.printStackTrace();
_L4:
        return 0;
    }

    static 
    {
        f = new UriMatcher(-1);
        f.addURI("com.gau.go.launcherex.gowidget.weatherwidget.staticsdkprovider", "data_new", 1);
        f.addURI("com.gau.go.launcherex.gowidget.weatherwidget.staticsdkprovider", "ctrlinfo", 2);
        f.addURI("com.gau.go.launcherex.gowidget.weatherwidget.staticsdkprovider", "data", 3);
    }
}
