// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.util.LruCache;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.gallerypicker:
//            bk, o, ad, bp, 
//            ae, ImagePreview, bx

public class l
{

    private static LruCache f;
    private static final String z[];
    private Handler a;
    private final ArrayList b = new ArrayList();
    private boolean c;
    private Thread d;
    private ContentResolver e;

    public l(ContentResolver contentresolver, Handler handler)
    {
        e = contentresolver;
        a = handler;
        d();
        Log.i((new StringBuilder()).append(z[0]).append(f.maxSize()).toString());
    }

    static Handler a(l l1)
    {
        return l1.a;
    }

    public static void a(String s)
    {
        f.remove(s);
    }

    static ArrayList b(l l1)
    {
        return l1.b;
    }

    public static void b()
    {
        f.trimToSize(-1);
    }

    static LruCache c()
    {
        return f;
    }

    static boolean c(l l1)
    {
        return l1.c;
    }

    private void d()
    {
        if (d != null)
        {
            return;
        } else
        {
            c = false;
            Thread thread = new Thread(new o(this, null));
            thread.setName(z[1]);
            d = thread;
            thread.start();
            return;
        }
    }

    public void a()
    {
        synchronized (b)
        {
            c = true;
            b.notifyAll();
        }
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = d;
        ad.a().a(((Thread) (obj)), e);
        ((Thread) (obj)).join();
        d = null;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        InterruptedException interruptedexception;
        interruptedexception;
    }

    public void a(bp bp1, ae ae1)
    {
        if (d == null)
        {
            d();
        }
        Bitmap bitmap = (Bitmap)f.get(bp1.a());
        if (bitmap != null)
        {
            ae1.a(bitmap, true);
            if (ImagePreview.B == 0)
            {
                break MISSING_BLOCK_LABEL_92;
            }
        }
        ae1.a();
        synchronized (b)
        {
            bp1 = new bx(bp1, ae1);
            b.add(bp1);
            b.notifyAll();
        }
        return;
        bp1;
        arraylist;
        JVM INSTR monitorexit ;
        throw bp1;
    }

    public boolean a(bp bp1)
    {
        int k;
        k = ImagePreview.B;
        if (bp1 == null)
        {
            return false;
        }
        ArrayList arraylist = b;
        arraylist;
        JVM INSTR monitorenter ;
        int i;
        int j;
        j = -1;
        i = 0;
_L7:
        if (i >= b.size()) goto _L2; else goto _L1
_L1:
        if (((bx)b.get(i)).b != bp1) goto _L4; else goto _L3
_L3:
        if (k == 0) goto _L6; else goto _L5
_L5:
        j = i;
          goto _L4
_L2:
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        b.remove(j);
        arraylist;
        JVM INSTR monitorexit ;
        return true;
        bp1;
        arraylist;
        JVM INSTR monitorexit ;
        throw bp1;
        arraylist;
        JVM INSTR monitorexit ;
        return false;
_L6:
        j = i;
        if (true) goto _L2; else goto _L4
_L4:
        i++;
        if (k == 0) goto _L7; else goto _L2
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ")'N`\006,%Nc\0062eLf\000(/\\n\031%p";
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
                i = 1;
                obj = ")'N`\006m&@f\007%8";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                f = new bk((int)(Runtime.getRuntime().maxMemory() / 1024L / 8L));
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 160
    //                   0 181
    //                   1 187
    //                   2 193
    //                   3 199;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_199;
_L3:
        byte byte0 = 99;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 64;
          goto _L9
_L5:
        byte0 = 74;
          goto _L9
_L6:
        byte0 = 47;
          goto _L9
        byte0 = 7;
          goto _L9
    }
}
