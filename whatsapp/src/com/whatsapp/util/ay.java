// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Handler;
import android.support.v4.util.LruCache;
import android.widget.ImageView;
import com.whatsapp.App;
import com.whatsapp.MediaData;
import com.whatsapp.a1g;
import com.whatsapp.protocol.c4;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

// Referenced classes of package com.whatsapp.util:
//            Log, y, g, cf, 
//            aw, c1, bm, cl

class ay extends Thread
{

    private static final String z[];
    final y a;

    ay(y y1)
    {
        a = y1;
        super();
    }

    public void run()
    {
        boolean flag = Log.f;
_L14:
        if (g.a(y.b(a)).size() == 0)
        {
            synchronized (g.a(y.b(a)))
            {
                g.a(y.b(a)).wait();
            }
        }
        if (g.a(y.b(a)).size() == 0) goto _L2; else goto _L1
_L1:
        cf cf1;
        Object obj2;
        int i;
        int j;
        int k;
        synchronized (g.a(y.b(a)))
        {
            cf1 = (cf)g.a(y.b(a)).pop();
        }
        File file;
        boolean flag1;
        do
        {
            try
            {
                if (!y.b())
                {
                    break;
                }
                Thread.sleep(50L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        } while (!flag);
        obj1 = null;
        obj = obj1;
        if (!cf1.c.getTag().equals(cf1.a.y)) goto _L4; else goto _L3
_L3:
        obj2 = (MediaData)cf1.a.B;
        obj = obj1;
        if (obj2 == null) goto _L4; else goto _L5
_L5:
        file = ((MediaData) (obj2)).file;
        obj = obj1;
        if (file == null) goto _L4; else goto _L6
_L6:
        flag1 = ((MediaData) (obj2)).file.exists();
        obj = obj1;
        if (!flag1) goto _L4; else goto _L7
_L7:
        i = cf1.a.w;
        if (i != 1) goto _L9; else goto _L8
_L8:
        obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(((MediaData) (obj2)).file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj1)));
        j = (int)((float)cf1.b.a() / a1g.a().g);
        obj1.inSampleSize = 1;
        i = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        do
        {
            if (i / 2 < j)
            {
                break;
            }
            i /= 2;
            obj1.inSampleSize = ((android.graphics.BitmapFactory.Options) (obj1)).inSampleSize * 2;
        } while (!flag);
        obj1.inJustDecodeBounds = false;
        obj1.inInputShareable = true;
        obj1.inPurgeable = true;
        i = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        k = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        obj = BitmapFactory.decodeFile(((MediaData) (obj2)).file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj1)));
_L21:
        obj1 = obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        obj2 = c1.a((new ExifInterface(((MediaData) (obj2)).file.getAbsolutePath())).getAttributeInt(z[4], 1));
        obj1 = obj;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        obj1 = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), ((android.graphics.Matrix) (obj2)), true);
        if (obj == obj1)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        ((Bitmap) (obj)).recycle();
_L22:
        obj = obj1;
_L4:
        if (obj == null) goto _L2; else goto _L10
_L10:
        flag1 = cf1.c.getTag().equals(cf1.a.y);
        if (!flag1) goto _L12; else goto _L11
_L11:
        obj1 = new bm(a, ((Bitmap) (obj)), cf1.c, cf1.a, cf1.b);
        y.e(a).post(((Runnable) (obj1)));
        if (!flag) goto _L2; else goto _L12
_L12:
        ((Bitmap) (obj)).recycle();
_L2:
        flag1 = Thread.interrupted();
        if (!flag1) goto _L14; else goto _L13
_L13:
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
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
        Log.e((new StringBuilder()).append(z[0]).append(((MediaData) (obj2)).file.length()).append(z[7]).append(i).append(z[9]).append(k).append(z[5]).append(j).append(z[1]).append(((android.graphics.BitmapFactory.Options) (obj1)).inSampleSize).toString());
        Log.e((new StringBuilder()).append(z[6]).append(y.c(a).size()).append(z[3]).append(y.d(a).size()).toString());
        obj = y.a(a).values().iterator();
        j = 0;
        i = 0;
_L24:
        if (!((Iterator) (obj)).hasNext()) goto _L16; else goto _L15
_L15:
        Bitmap bitmap = (Bitmap)((SoftReference)((Iterator) (obj)).next()).get();
        if (bitmap == null) goto _L18; else goto _L17
_L17:
        boolean flag2 = bitmap.isRecycled();
        if (flag2) goto _L18; else goto _L19
_L19:
        k = cl.a(bitmap) / 1024;
        j++;
        k = i + k;
        i = j;
        j = k;
          goto _L20
_L25:
        Log.e((new StringBuilder()).append(z[8]).append(j).append(z[2]).append(y.a(a).size()).append(" ").append(i).toString());
        App.aT();
        y.c(a).evictAll();
        y.d(a).clear();
        y.a(a).clear();
        System.gc();
        App.aT();
        obj = BitmapFactory.decodeFile(((MediaData) (obj2)).file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj1)));
          goto _L21
        obj;
        throw obj;
        obj1;
        throw obj1;
        obj1;
        obj1 = obj;
          goto _L22
_L9:
        obj = obj1;
        if (cf1.a.w != 3) goto _L4; else goto _L23
_L23:
        obj = c1.b(((MediaData) (obj2)).file.getAbsolutePath());
          goto _L4
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        throw outofmemoryerror;
        outofmemoryerror;
        throw outofmemoryerror;
_L26:
        int l = j;
        j = i;
        i = l;
          goto _L24
_L18:
        int i1 = i;
        i = j;
        j = i1;
        continue; /* Loop/switch isn't completed */
_L16:
        int j1 = i;
        i = j;
        j = j1;
        break; /* Loop/switch isn't completed */
_L20:
        if (!flag) goto _L26; else goto _L25
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "E\025\033^\rO\025\034E\031E\022\033Y\004Z\025\tICL\025\013B\bMP\016D\000M\003\001W\t\022";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\b\003\t@\034D\025R";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\b\023\007X\002\\J";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\b\023\007X\002\\J";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "g\002\001H\002\\\021\034D\003F";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\b\004\t_\013M\0047Z\005L\004\000\027";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "E\025\033^\rO\025\034E\031E\022\033Y\004Z\025\tICK\021\013E\t\b\030\t_\b\b\003\001W\t\022";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\b\007R";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "E\025\033^\rO\025\034E\031E\022\033Y\004Z\025\tICK\021\013E\t\b\003\007K\030\b\003\001W\t\022";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\b\030R";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 108;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 40;
          goto _L9
_L5:
        byte1 = 112;
          goto _L9
_L6:
        byte1 = 104;
          goto _L9
        byte1 = 45;
          goto _L9
    }
}
