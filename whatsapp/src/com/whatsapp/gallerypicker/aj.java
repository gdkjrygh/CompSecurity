// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ar, br, t

public class aj extends ar
{

    public static final Uri i;
    static final String j[];
    private static final String z[];

    public aj(ContentResolver contentresolver, int k, String s)
    {
        super(contentresolver, i, k, s);
    }

    protected t a(Cursor cursor)
    {
        String s = cursor.getString(1);
        long l = cursor.getLong(2);
        return new br(this, c, s, l);
    }

    public void a()
    {
        c();
    }

    public void a(ContentObserver contentobserver)
    {
        if (b != null)
        {
            b.unregisterContentObserver(contentobserver);
        }
    }

    public void b(ContentObserver contentobserver)
    {
        if (b != null)
        {
            b.registerContentObserver(contentobserver);
        }
    }

    public HashMap c()
    {
        return new HashMap();
    }

    protected Cursor d()
    {
        Uri uri = d.buildUpon().appendQueryParameter(z[0], h).appendQueryParameter(z[1], z[2]).build();
        return c.query(uri, j, null, null, b());
    }

    static 
    {
        Object aobj[];
        Object obj;
        String as[];
        byte byte0;
        int k;
        aobj = new String[3];
        obj = "E.\021erS\022\026";
        byte0 = -1;
        as = ((String []) (aobj));
        k = 0;
_L11:
        int i1;
        int j1;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L19:
        if (j1 > i1) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 106
    //                   1 124
    //                   2 365
    //                   3 383
    //                   4 401
    //                   5 419
    //                   6 438;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        as[k] = ((String) (obj));
        obj = "N5\021bbC>";
        k = 1;
        as = ((String []) (aobj));
        byte0 = 0;
          goto _L11
_L4:
        as[k] = ((String) (obj));
        obj = "Q2\026kx";
        k = 2;
        as = ((String []) (aobj));
        byte0 = 1;
          goto _L11
_L5:
        int l;
        as[k] = ((String) (obj));
        z = ((String []) (aobj));
        aobj = "D4\034zrI/H!8D4\037 `O:\006}vW+\\~eH-\033jrUu\037ksN:]gcB6\001".toCharArray();
        l = aobj.length;
        k = 0;
_L26:
        if (l > k) goto _L13; else goto _L12
_L12:
        i = Uri.parse((new String(((char []) (aobj)))).intern());
        aobj = new String[5];
        k = 0;
        as = ((String []) (aobj));
        obj = "x2\026";
        byte0 = 2;
          goto _L11
_L2:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 265
    //                   3 272;
           goto _L14 _L15 _L16 _L17 _L18
_L14:
        l = 23;
_L20:
        obj[i1] = (char)(l ^ c1);
        i1++;
          goto _L19
_L15:
        l = 39;
          goto _L20
_L16:
        l = 91;
          goto _L20
_L17:
        l = 114;
          goto _L20
_L18:
        l = 14;
          goto _L20
_L13:
        i1 = ((int) (aobj[k]));
        k % 5;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 341
    //                   1 347
    //                   2 353
    //                   3 359;
           goto _L21 _L22 _L23 _L24 _L25
_L21:
        byte0 = 23;
_L27:
        aobj[k] = (char)(byte0 ^ i1);
        k++;
          goto _L26
_L22:
        byte0 = 39;
          goto _L27
_L23:
        byte0 = 91;
          goto _L27
_L24:
        byte0 = 114;
          goto _L27
_L25:
        byte0 = 14;
          goto _L27
_L6:
        as[k] = ((String) (obj));
        obj = "x?\023zv";
        k = 1;
        as = ((String []) (aobj));
        byte0 = 3;
          goto _L11
_L7:
        as[k] = ((String) (obj));
        obj = "C:\006kcF0\027`";
        k = 2;
        as = ((String []) (aobj));
        byte0 = 4;
          goto _L11
_L8:
        as[k] = ((String) (obj));
        obj = "S2\006br";
        byte0 = 5;
        k = 3;
        as = ((String []) (aobj));
          goto _L11
_L9:
        as[k] = ((String) (obj));
        obj = "J2\037kHS\"\002k";
        byte0 = 6;
        k = 4;
        as = ((String []) (aobj));
          goto _L11
_L10:
        as[k] = ((String) (obj));
        j = ((String []) (aobj));
    }
}
