// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.util.LruCache;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview, l, bx, bp, 
//            b8, bk

class o
    implements Runnable
{

    final l a;

    private o(l l1)
    {
        a = l1;
        super();
    }

    o(l l1, bk bk)
    {
        this(l1);
    }

    public void run()
    {
        int i = ImagePreview.B;
_L1:
label0:
        {
            synchronized (l.b(a))
            {
                if (!l.c(a))
                {
                    break label0;
                }
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_176;
            }
        }
        Object obj2;
        if (l.b(a).isEmpty())
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj2 = (bx)l.b(a).remove(0);
        obj;
        JVM INSTR monitorexit ;
        obj = ((bx) (obj2)).b;
        obj1 = (Bitmap)l.c().get(((bp) (obj)).a());
        if (obj1 == null)
        {
            try
            {
                obj = ((bx) (obj2)).b.b();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = obj1;
        }
        if (obj != null)
        {
            l.c().put(((bx) (obj2)).b.a(), obj);
            obj2 = ((bx) (obj2)).a;
            l.a(a).post(new b8(this, ((ae) (obj2)), ((Bitmap) (obj)), ((Bitmap) (obj1))));
        }
          goto _L1
        try
        {
            l.b(a).wait();
        }
        catch (InterruptedException interruptedexception) { }
        obj;
        JVM INSTR monitorexit ;
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }
}
