// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.media.ExifInterface;
import android.view.Display;
import android.view.WindowManager;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

// Referenced classes of package com.whatsapp:
//            mj, App, MediaData, PhotoView, 
//            a87, MediaView, xv

class od extends Thread
{

    private static final String z[];
    private Stack a;
    final MediaView b;

    private od(MediaView mediaview)
    {
        b = mediaview;
        super();
        a = new Stack();
    }

    od(MediaView mediaview, xv xv)
    {
        this(mediaview);
    }

    public void a(c4 c4_1, PhotoView photoview)
    {
        photoview = new mj(this, c4_1, photoview);
        synchronized (a)
        {
            a.add(0, photoview);
            a.notifyAll();
        }
        return;
        photoview;
        c4_1;
        JVM INSTR monitorexit ;
        throw photoview;
    }

    public void run()
    {
        int l = App.am;
_L9:
        if (a.size() == 0)
        {
            synchronized (a)
            {
                a.wait();
            }
        }
        if (a.size() == 0) goto _L2; else goto _L1
_L1:
        mj mj1;
        synchronized (a)
        {
            mj1 = (mj)a.pop();
        }
        obj1 = (MediaData)mj1.b.B;
        int i;
        if (((MediaData) (obj1)).file == null)
        {
            break MISSING_BLOCK_LABEL_560;
        }
        i = mj1.b.w;
        if (i != 1) goto _L4; else goto _L3
_L3:
        android.graphics.BitmapFactory.Options options;
        int j;
        int k;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(((MediaData) (obj1)).file.getAbsolutePath(), options);
        options.inJustDecodeBounds = false;
        j = mj1.c.getWidth();
        k = mj1.c.getHeight();
        if (j != 0)
        {
            i = k;
            if (k != 0)
            {
                break MISSING_BLOCK_LABEL_234;
            }
        }
        obj = ((WindowManager)App.au.getSystemService(z[3])).getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT < 13)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        Point point = new Point();
        ((Display) (obj)).getSize(point);
        j = point.x;
        i = point.y;
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        j = ((Display) (obj)).getWidth();
        i = ((Display) (obj)).getHeight();
        options.inSampleSize = 1;
        if (j <= 0 || i <= 0) goto _L6; else goto _L5
_L5:
        int i1;
        k = options.outWidth;
        i1 = options.outHeight;
        if (k * i1 <= j * i * 4)
        {
            break; /* Loop/switch isn't completed */
        }
        options.inSampleSize = options.inSampleSize * 2;
        j *= 2;
        i *= 2;
        if (l == 0) goto _L5; else goto _L6
_L6:
        obj = BitmapFactory.decodeFile(((MediaData) (obj1)).file.getAbsolutePath(), options);
_L11:
        boolean flag;
        try
        {
            i = (new ExifInterface(((MediaData) (obj1)).file.getAbsolutePath())).getAttributeInt(z[1], 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            i = 1;
        }
_L12:
        if (obj == null) goto _L2; else goto _L7
_L7:
        obj1 = mj1.c;
        b.runOnUiThread(new a87(this, i, ((PhotoView) (obj1)), ((android.graphics.Bitmap) (obj))));
_L2:
        flag = Thread.interrupted();
        if (!flag) goto _L9; else goto _L8
_L8:
        a.clear();
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (true) goto _L8; else goto _L10
_L10:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        throw obj;
        obj;
        Log.e((new StringBuilder()).append(z[2]).append(obj).toString());
        b.e();
        options.inSampleSize = options.inSampleSize * 2;
        try
        {
            obj = BitmapFactory.decodeFile(((MediaData) (obj1)).file.getPath(), options);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
          goto _L11
_L4:
        i = mj1.b.w;
        if (i != 3)
        {
            break MISSING_BLOCK_LABEL_560;
        }
        obj = c1.b(((MediaData) (obj1)).file.getAbsolutePath());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_525;
        }
_L13:
        i = 1;
          goto _L12
        Log.w(z[0]);
          goto _L13
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
_L14:
        Log.a(outofmemoryerror);
        b.e();
        i = 1;
          goto _L12
        outofmemoryerror;
        obj = null;
          goto _L14
        i = 1;
        obj = null;
          goto _L12
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "}L:b]f@;|\023v@2gJyL)$^y]3jL?G+gP";
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
                obj = "_[7nRdH*bS~";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "}L:b]f@;|\023";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "g@0oSg";
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
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 60;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 16;
          goto _L9
_L5:
        byte0 = 41;
          goto _L9
_L6:
        byte0 = 94;
          goto _L9
        byte0 = 11;
          goto _L9
    }
}
