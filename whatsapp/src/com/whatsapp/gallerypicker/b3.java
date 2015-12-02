// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.util.Log;
import com.whatsapp.util.c1;

// Referenced classes of package com.whatsapp.gallerypicker:
//            b9, t, ad, ar

public class b3 extends b9
    implements t
{

    private static final String z[];

    protected b3(ar ar, ContentResolver contentresolver, long l, int i, Uri uri, String s, 
            String s1, long l1, String s2)
    {
        super(ar, contentresolver, l, i, uri, s, s1, l1, s2);
    }

    public Bitmap a(int i)
    {
        if (i < 144)
        {
            Bitmap bitmap;
            try
            {
                long l = g;
                bitmap = ad.a().a(h, l, 3, null, true);
            }
            catch (Throwable throwable)
            {
                Log.e(z[2], z[1], throwable);
                return null;
            }
            return bitmap;
        } else
        {
            return a(i, i * i * 2);
        }
    }

    public Bitmap a(int i, int j)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            return ThumbnailUtils.createVideoThumbnail(this.i, 1);
        } else
        {
            return c1.b(this.i);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof b3))
        {
            return false;
        } else
        {
            return a().equals(((b3)obj).a());
        }
    }

    public int hashCode()
    {
        return a().toString().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder(z[0])).append(g).toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "Wv!C-N}/C!u";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "lv+O\026ij(D\000hk(G2!x*Rbdg&C2uv*H";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "Wv!C-N}/C!u";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 182
    //                   2 188
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 66;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 1;
          goto _L9
_L5:
        byte0 = 31;
          goto _L9
_L6:
        byte0 = 69;
          goto _L9
        byte0 = 38;
          goto _L9
    }
}
