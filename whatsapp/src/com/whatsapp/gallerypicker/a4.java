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
//            ar, az, t

public class a4 extends ar
{

    public static final Uri i;
    static final String j[];
    private static final String z;

    public a4(ContentResolver contentresolver, int k, String s)
    {
        super(contentresolver, i, k, s);
    }

    protected t a(Cursor cursor)
    {
        String s = cursor.getString(1);
        long l = cursor.getLong(2);
        return new az(this, c, s, l);
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
        Uri uri = d.buildUpon().appendQueryParameter(z, h).build();
        return c.query(uri, j, null, null, b());
    }

    static 
    {
        Object obj;
        int k;
        int i1;
        i1 = -1;
        obj = "9\026\r6#/*\n";
        k = -1;
_L5:
        int l;
        int j1;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        l = 0;
_L26:
        if (j1 > l) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        k;
        JVM INSTR tableswitch 0 0: default 60
    //                   0 73;
           goto _L3 _L4
_L3:
        z = ((String) (obj));
        obj = "8\f\000)#5\027Tri8\f\003s13\002\032.'+\023@-44\025\0079#)M\0038\"2\002A42>\016\035";
        k = 0;
          goto _L5
_L4:
        String as[];
        byte byte0;
        i = Uri.parse(((String) (obj)));
        as = new String[5];
        obj = "\004\n\n";
        k = 0;
        byte0 = i1;
_L13:
        String as1[];
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        j1 = obj.length;
        i1 = 0;
_L19:
        if (j1 > i1) goto _L7; else goto _L6
_L6:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 3: default 160
    //                   0 353
    //                   1 369
    //                   2 385
    //                   3 401;
           goto _L8 _L9 _L10 _L11 _L12
_L8:
        as1[k] = ((String) (obj));
        obj = "\004\007\017)'";
        byte0 = 0;
        k = 1;
          goto _L13
_L7:
        char c1 = obj[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L14 _L15 _L16 _L17 _L18
_L14:
        l = 70;
_L20:
        obj[i1] = (char)(l ^ c1);
        i1++;
          goto _L19
_L15:
        l = 91;
          goto _L20
_L16:
        l = 99;
          goto _L20
_L17:
        l = 110;
          goto _L20
_L18:
        l = 93;
          goto _L20
_L2:
        c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 308
    //                   0 329
    //                   1 335
    //                   2 341
    //                   3 347;
           goto _L21 _L22 _L23 _L24 _L25
_L21:
        byte0 = 70;
_L27:
        obj[l] = (char)(byte0 ^ c1);
        l++;
          goto _L26
_L22:
        byte0 = 91;
          goto _L27
_L23:
        byte0 = 99;
          goto _L27
_L24:
        byte0 = 110;
          goto _L27
_L25:
        byte0 = 93;
          goto _L27
_L9:
        as1[k] = ((String) (obj));
        obj = "?\002\03282:\b\0133";
        byte0 = 1;
        k = 2;
          goto _L13
_L10:
        as1[k] = ((String) (obj));
        obj = "/\n\0321#";
        byte0 = 2;
        k = 3;
          goto _L13
_L11:
        as1[k] = ((String) (obj));
        obj = "6\n\0038\031/\032\0368";
        k = 4;
        byte0 = 3;
          goto _L13
_L12:
        as1[k] = ((String) (obj));
        j = as;
        if (true) goto _L5; else goto _L28
_L28:
    }
}
