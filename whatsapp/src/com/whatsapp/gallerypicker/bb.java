// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.gallerypicker:
//            b9, t, ad, w, 
//            ar

public class bb extends b9
    implements t
{

    private static final String l[];
    private static final String z;
    private int m;

    public bb(ar ar, ContentResolver contentresolver, long l1, int i, Uri uri, String s, 
            String s1, long l2, String s2, int j)
    {
        super(ar, contentresolver, l1, i, uri, s, s1, l2, s2);
        m = j;
    }

    public int a()
    {
        return m;
    }

    public Bitmap a(int i)
    {
        Object obj;
        Bitmap bitmap;
        if (i < 144)
        {
            try
            {
                long l1 = g;
                obj = ad.a().a(h, l1, 3, null, false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.a(z, ((Throwable) (obj)));
                return null;
            }
        } else
        {
            obj = new android.graphics.BitmapFactory.Options();
            obj.inDither = false;
            obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            Cursor cursor = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(h, g, 1, l);
            if (cursor != null)
            {
                try
                {
                    if (cursor.moveToFirst())
                    {
                        obj.outWidth = cursor.getInt(1);
                        obj.outHeight = cursor.getInt(2);
                        obj.inSampleSize = w.a(((android.graphics.BitmapFactory.Options) (obj)), i, i * i * 2);
                    }
                }
                catch (Throwable throwable)
                {
                    throw throwable;
                }
                cursor.close();
            }
            obj = ad.a().a(h, g, 1, ((android.graphics.BitmapFactory.Options) (obj)), false);
        }
        bitmap = ((Bitmap) (obj));
        if (obj != null)
        {
            bitmap = w.a(((Bitmap) (obj)), a());
        }
        return bitmap;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "X\\<\0048]@?\017.\\A?\f\034\025R=\031LPM1\b\034A\\=\003".toCharArray();
        j = obj.length;
        i = 0;
_L21:
        if (j > i) goto _L2; else goto _L1
_L1:
        String as[];
        z = (new String(((char []) (obj)))).intern();
        as = new String[3];
        obj = "j\\6";
        i = -1;
        j = 0;
_L19:
        String as1[];
        int k;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        k = 0;
_L16:
        if (i1 <= k)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte0;
            char c;
            switch (i)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "B\\6\031\004";
                j = 1;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[j] = ((String) (obj));
                j = 2;
                obj = "]P;\n\004A";
                i = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[j] = ((String) (obj));
                l = as;
                break;
            }
            break; /* Loop/switch isn't completed */
        }
          goto _L3
_L2:
        k = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 160
    //                   0 181
    //                   1 187
    //                   2 193
    //                   3 199;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        byte0 = 108;
_L9:
        obj[i] = (char)(byte0 ^ k);
        i++;
        break; /* Loop/switch isn't completed */
_L5:
        byte0 = 53;
        continue; /* Loop/switch isn't completed */
_L6:
        byte0 = 53;
        continue; /* Loop/switch isn't completed */
_L7:
        byte0 = 82;
        continue; /* Loop/switch isn't completed */
_L8:
        byte0 = 109;
        if (true) goto _L9; else goto _L3
_L3:
        c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 244
    //                   0 265
    //                   1 271
    //                   2 277
    //                   3 283;
           goto _L10 _L11 _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_283;
_L11:
        break; /* Loop/switch isn't completed */
_L10:
        byte0 = 108;
_L17:
        obj[k] = (char)(byte0 ^ c);
        k++;
        if (true) goto _L16; else goto _L15
_L15:
        byte0 = 53;
          goto _L17
_L12:
        byte0 = 53;
          goto _L17
_L13:
        byte0 = 82;
          goto _L17
        byte0 = 109;
          goto _L17
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L21; else goto _L20
_L20:
    }
}
