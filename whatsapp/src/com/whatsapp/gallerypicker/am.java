// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ar, ai, bb, ImagePreview, 
//            b9, t

public class am extends ar
    implements ai
{

    private static final String i[];
    static final String j[];
    private static final String z[];

    public am(ContentResolver contentresolver, Uri uri, int k, String s)
    {
        super(contentresolver, uri, k, s);
    }

    protected b9 a(Cursor cursor)
    {
        String s;
        String s1;
        String s3;
        int k;
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
                l = cursor.getLong(7) * 1000L;
            }
            k = cursor.getInt(4);
            String s2 = cursor.getString(5);
            s3 = cursor.getString(6);
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
        return new bb(this, c, l2, cursor.getPosition(), a(l2), s1, s3, l, s, k);
    }

    protected t a(Cursor cursor)
    {
        return a(cursor);
    }

    protected String a()
    {
        if (h == null)
        {
            return z[1];
        } else
        {
            return z[0];
        }
    }

    protected String[] b()
    {
        if (h != null)
        {
            int k = i.length;
            String as[] = new String[k + 1];
            System.arraycopy(i, 0, as, 0, k);
            as[k] = h;
            return as;
        } else
        {
            return i;
        }
    }

    public HashMap c()
    {
        Object obj;
        int k;
        k = ImagePreview.B;
        Uri uri = d.buildUpon().appendQueryParameter(z[5], z[2]).build();
        ContentResolver contentresolver = c;
        obj = z[3];
        String s2 = z[4];
        String s3 = a();
        String as[] = b();
        obj = android.provider.MediaStore.Images.Media.query(contentresolver, uri, new String[] {
            obj, s2
        }, s3, as, null);
        HashMap hashmap = new HashMap();
_L2:
        String s1;
        String s4;
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = ((Cursor) (obj)).getString(0);
        s4 = ((Cursor) (obj)).getString(1);
        String s;
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        hashmap.put(s4, s);
        if (k == 0) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).close();
        return hashmap;
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
    }

    protected Cursor d()
    {
        return android.provider.MediaStore.Images.Media.query(c, d, j, a(), b(), b());
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int k;
        as = new String[6];
        obj = "\013L-?Z|U=\"Z\003H*r\027\034\rdm\023\003\036m{\037bo\000r]VB/7K|H r\002\003\036";
        byte0 = -1;
        as1 = as;
        k = 0;
_L10:
        int l;
        int i1;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L7:
        if (i1 <= l)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[k] = ((String) (obj));
                obj = "\013L-?Z|U=\"Z\003H*r\027\034\rdm\023\003\036m{";
                k = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[k] = ((String) (obj));
                obj = "WS17";
                k = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[k] = ((String) (obj));
                obj = "AT'9ZW~ ;LSM%+`M@)7";
                k = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[k] = ((String) (obj));
                obj = "AT'9ZW~-6";
                k = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[k] = ((String) (obj));
                k = 5;
                as1 = as;
                obj = "GH7&VMB0";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[k] = ((String) (obj));
                z = as;
                as = new String[3];
                obj = "JL%5Z\fK47X";
                byte0 = 5;
                as1 = as;
                k = 0;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[k] = ((String) (obj));
                obj = "JL%5Z\fQ*5";
                byte0 = 6;
                k = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[k] = ((String) (obj));
                obj = "JL%5Z\fF-4";
                byte0 = 7;
                k = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[k] = ((String) (obj));
                i = as;
                as = new String[8];
                obj = "|H ";
                byte0 = 8;
                as1 = as;
                k = 0;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[k] = ((String) (obj));
                obj = "|E%&^";
                byte0 = 9;
                k = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[k] = ((String) (obj));
                obj = "G@07KBJ!<";
                byte0 = 10;
                k = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[k] = ((String) (obj));
                obj = "NH*;`WI1?]|L%5V@";
                byte0 = 11;
                k = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[k] = ((String) (obj));
                obj = "LS-7QW@0;PM";
                byte0 = 12;
                k = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[k] = ((String) (obj));
                k = 5;
                obj = "WH0>Z";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[k] = ((String) (obj));
                k = 6;
                obj = "NH)7`WX47";
                byte0 = 14;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[k] = ((String) (obj));
                k = 7;
                obj = "G@07`NN ;YJD ";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[k] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 284
    //                   0 307
    //                   1 314
    //                   2 321
    //                   3 328;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_328;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 63;
_L8:
        obj[l] = (char)(byte1 ^ c1);
        l++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 35;
          goto _L8
_L3:
        byte1 = 33;
          goto _L8
_L4:
        byte1 = 68;
          goto _L8
        byte1 = 82;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        j = as;
    }
}
