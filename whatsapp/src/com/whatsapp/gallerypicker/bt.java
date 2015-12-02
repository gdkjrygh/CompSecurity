// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.util.Log;
import com.whatsapp.util.aj;
import com.whatsapp.util.c1;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class bt extends AsyncTask
{

    private static final String z[];
    final ImagePreview.ThumbImageView a;
    final int b;
    final Uri c;

    bt(ImagePreview.ThumbImageView thumbimageview, Uri uri, int i)
    {
        a = thumbimageview;
        c = uri;
        b = i;
        super();
    }

    protected Bitmap a(Void avoid[])
    {
        avoid = c1.a(c, b, b);
        c1.a(ImagePreview.ThumbImageView.a(a), avoid);
        return avoid;
        avoid;
        Log.a(z[2], avoid);
_L2:
        return null;
        avoid;
        Log.a(z[3], avoid);
        continue; /* Loop/switch isn't completed */
        avoid;
        Log.a(z[0], avoid);
        continue; /* Loop/switch isn't completed */
        avoid;
        Log.a(z[1], avoid);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(Bitmap bitmap)
    {
label0:
        {
            if (bitmap != null)
            {
                a.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                a.setBackgroundResource(0);
                a.setImageBitmap(bitmap);
                if (ImagePreview.B == 0)
                {
                    break label0;
                }
            }
            a.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            a.setBackgroundResource(0x7f090025);
            a.setImageResource(0x7f020555);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "X9`\022fA&d\003jT#.\006fE!s\034".toCharArray();
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
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 164
    //                   0 184
    //                   1 190
    //                   2 196
    //                   3 201;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_201;
_L3:
        byte byte0 = 3;
_L9:
        obj[j] = (char)(byte0 ^ c2);
        j++;
          goto _L8
_L4:
        byte0 = 49;
          goto _L9
_L5:
        byte0 = 84;
          goto _L9
_L6:
        byte0 = 1;
          goto _L9
        byte0 = 117;
          goto _L9
    }
}
