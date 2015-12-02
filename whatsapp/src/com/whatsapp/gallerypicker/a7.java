// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package com.whatsapp.gallerypicker:
//            t, ad, w, ai

class a7
    implements t
{

    private static final String z[];
    private final ai a;
    private final Uri b;
    private final ContentResolver c;

    a7(ai ai, ContentResolver contentresolver, Uri uri)
    {
        a = ai;
        c = contentresolver;
        b = uri;
    }

    private ParcelFileDescriptor a()
    {
        ParcelFileDescriptor parcelfiledescriptor;
        try
        {
            if (b.getScheme().equals(z[2]))
            {
                return ParcelFileDescriptor.open(new File(b.getPath()), 0x10000000);
            }
            parcelfiledescriptor = c.openFileDescriptor(b, "r");
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return null;
        }
        return parcelfiledescriptor;
    }

    private android.graphics.BitmapFactory.Options b()
    {
        ParcelFileDescriptor parcelfiledescriptor;
        parcelfiledescriptor = a();
        if (parcelfiledescriptor == null)
        {
            return null;
        }
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ad.a().a(parcelfiledescriptor.getFileDescriptor(), options);
        w.a(parcelfiledescriptor);
        return options;
        Exception exception;
        exception;
        w.a(parcelfiledescriptor);
        throw exception;
    }

    public Bitmap a(int i)
    {
        return a(i, i * i * 2);
    }

    public Bitmap a(int i, int j)
    {
        Bitmap bitmap;
        try
        {
            bitmap = w.a(i, j, a());
        }
        catch (Exception exception)
        {
            Log.e(z[0], z[1], exception);
            return null;
        }
        return bitmap;
    }

    public Uri a()
    {
        return b;
    }

    public String b()
    {
        android.graphics.BitmapFactory.Options options = b();
        if (options != null && options.outMimeType != null)
        {
            return options.outMimeType;
        } else
        {
            return "";
        }
    }

    public String c()
    {
        return b.getPath();
    }

    public long d()
    {
        return 0L;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "nNh@NZ[d";
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
                obj = "\\Su)FC_dyWRSo)G^_nmJU[!kJOQ`y\003";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "]Uml";
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 35;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 59;
          goto _L9
_L5:
        byte0 = 60;
          goto _L9
_L6:
        byte0 = 1;
          goto _L9
        byte0 = 9;
          goto _L9
    }
}
