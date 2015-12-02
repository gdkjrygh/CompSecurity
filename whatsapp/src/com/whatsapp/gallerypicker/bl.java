// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.au2;
import com.whatsapp.util.aj;
import com.whatsapp.util.c1;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.whatsapp.gallerypicker:
//            bp, ImagePreview

class bl
    implements bp
{

    final Uri a;
    final int b;
    final Uri c;
    final ImagePreview d;

    bl(ImagePreview imagepreview, int i, Uri uri, Uri uri1)
    {
        d = imagepreview;
        b = i;
        c = uri;
        a = uri1;
        super();
    }

    public String a()
    {
        return a.toString();
    }

    public Bitmap b()
    {
        if (b != 0) goto _L2; else goto _L1
_L1:
        int i = au2.d;
_L3:
        FileNotFoundException filenotfoundexception;
        try
        {
            return c1.a(c, i, i);
        }
        catch (FileNotFoundException filenotfoundexception1)
        {
            filenotfoundexception1.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_29;
        filenotfoundexception;
        throw filenotfoundexception;
_L4:
        return null;
_L2:
        i = Math.min(b, au2.d);
          goto _L3
        Object obj;
        obj;
        ((OutOfMemoryError) (obj)).printStackTrace();
          goto _L4
        obj;
        ((IOException) (obj)).printStackTrace();
          goto _L4
        obj;
        ((aj) (obj)).printStackTrace();
          goto _L4
    }
}
