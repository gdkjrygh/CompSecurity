// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ar, b3, ImagePreview, b9, 
//            t

public class a0 extends ar
{

    private static final String i[];
    private static final String z[];

    public a0(ContentResolver contentresolver, Uri uri, int j, String s)
    {
        super(contentresolver, uri, j, s);
    }

    protected b9 a(Cursor cursor)
    {
        String s;
        String s1;
        String s3;
        long l;
        long l2;
label0:
        {
            l2 = cursor.getLong(0);
            s1 = cursor.getString(1);
            long l1 = cursor.getLong(2);
            l = l1;
            if (l1 == 0L)
            {
                l = cursor.getLong(6) * 1000L;
            }
            String s2 = cursor.getString(3);
            s3 = cursor.getString(5);
            if (s2 != null)
            {
                s = s2;
                if (s2.length() != 0)
                {
                    break label0;
                }
            }
            s = s1;
        }
        return new b3(this, c, l2, cursor.getPosition(), a(l2), s1, s3, l, s);
    }

    protected t a(Cursor cursor)
    {
        return a(cursor);
    }

    protected String[] a()
    {
        return null;
    }

    protected String c()
    {
        if (h != null)
        {
            return (new StringBuilder()).append(z[0]).append(h).append("'").toString();
        } else
        {
            return null;
        }
    }

    public HashMap c()
    {
        Object obj;
        int j;
        j = ImagePreview.B;
        obj = d.buildUpon().appendQueryParameter(z[1], z[2]).build();
        ContentResolver contentresolver = c;
        String s = z[3];
        String s1 = z[4];
        String s2 = c();
        String as[] = a();
        String s3 = b();
        obj = android.provider.MediaStore.Images.Media.query(contentresolver, ((Uri) (obj)), new String[] {
            s, s1
        }, s2, as, s3);
        HashMap hashmap = new HashMap();
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break;
            }
            hashmap.put(((Cursor) (obj)).getString(1), ((Cursor) (obj)).getString(0));
        } while (j == 0);
        ((Cursor) (obj)).close();
        return hashmap;
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
    }

    protected Cursor d()
    {
        return android.provider.MediaStore.Images.Media.query(c, d, i, c(), a(), b());
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int j;
        as = new String[5];
        obj = "\005\003N)\f\023)D&IZV\n";
        byte0 = -1;
        as1 = as;
        j = 0;
_L10:
        int k;
        int l;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L7:
        if (l <= k)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "\003\037^6\000\t\025Y";
                j = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "\023\004X'";
                j = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "\005\003N)\f\023)I+\032\027\032L;6\t\027@'";
                j = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "\005\003N)\f\023)D&";
                j = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[j] = ((String) (obj));
                z = as;
                as = new String[7];
                j = 0;
                as1 = as;
                obj = "8\037I";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[j] = ((String) (obj));
                obj = "8\022L6\b";
                byte0 = 5;
                j = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[j] = ((String) (obj));
                obj = "\003\027Y'\035\006\035H,";
                byte0 = 6;
                j = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[j] = ((String) (obj));
                obj = "\023\037Y.\f";
                byte0 = 7;
                j = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[j] = ((String) (obj));
                obj = "\n\037C+6\023\036X/\0138\033L%\000\004";
                byte0 = 8;
                j = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "\n\037@'6\023\017]'";
                byte0 = 9;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "\003\027Y'6\n\031I+\017\016\023I";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[j] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 244
    //                   0 267
    //                   1 274
    //                   2 281
    //                   3 288;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_288;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 105;
_L8:
        obj[k] = (char)(byte1 ^ c1);
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 103;
          goto _L8
_L3:
        byte1 = 118;
          goto _L8
_L4:
        byte1 = 45;
          goto _L8
        byte1 = 66;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        i = as;
    }
}
