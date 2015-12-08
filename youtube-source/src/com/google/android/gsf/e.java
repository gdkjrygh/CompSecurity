// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.util.Log;

// Referenced classes of package com.google.android.gsf:
//            d

public final class e extends d
{

    public static final Uri a = Uri.parse("content://com.google.settings/partner");

    private static String a(ContentResolver contentresolver, String s)
    {
        contentresolver = contentresolver.query(a, new String[] {
            "value"
        }, "name=?", new String[] {
            s
        }, null);
        if (contentresolver == null) goto _L2; else goto _L1
_L1:
        ContentResolver contentresolver1 = contentresolver;
        if (!contentresolver.moveToNext()) goto _L2; else goto _L3
_L3:
        contentresolver1 = contentresolver;
        String s1 = contentresolver.getString(0);
        s = s1;
_L8:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        return s;
        SQLException sqlexception;
        sqlexception;
        contentresolver = null;
_L6:
        contentresolver1 = contentresolver;
        Log.e("GoogleSettings", (new StringBuilder("Can't get key ")).append(s).append(" from ").append(a).toString(), sqlexception);
        if (contentresolver != null)
        {
            contentresolver.close();
            return null;
        } else
        {
            return null;
        }
        contentresolver;
        contentresolver1 = null;
_L5:
        if (contentresolver1 != null)
        {
            contentresolver1.close();
        }
        throw contentresolver;
        contentresolver;
        if (true) goto _L5; else goto _L4
_L4:
        sqlexception;
        if (true) goto _L6; else goto _L2
_L2:
        s = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String a(ContentResolver contentresolver, String s, String s1)
    {
        contentresolver = a(contentresolver, s);
        if (contentresolver == null)
        {
            return s1;
        } else
        {
            return contentresolver;
        }
    }

}
