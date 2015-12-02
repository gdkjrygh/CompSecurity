// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.app.Activity;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Stack;

// Referenced classes of package com.whatsapp.util:
//            b2, b0, bb, b5, 
//            al

class cs extends Thread
{

    final b2 a;

    private cs(b2 b2_1)
    {
        a = b2_1;
        super();
    }

    cs(b2 b2_1, al al)
    {
        this(b2_1);
    }

    public void run()
    {
_L2:
        if (b0.a(b2.b(a)).size() == 0)
        {
            synchronized (b0.a(b2.b(a)))
            {
                b0.a(b2.b(a)).wait();
            }
        }
        if (b0.a(b2.b(a)).size() == 0)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        obj = null;
        synchronized (b0.a(b2.b(a)))
        {
            if (b0.a(b2.b(a)).size() != 0)
            {
                obj = (bb)b0.a(b2.b(a)).pop();
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        android.graphics.Bitmap bitmap = b2.a(a, ((bb) (obj)));
        synchronized (b2.a(a))
        {
            b2.a(a).put(((bb) (obj)).c, bitmap);
        }
        if (((bb) (obj)).a.getTag().equals(((bb) (obj)).c))
        {
            obj1 = new b5(a, bitmap, ((bb) (obj)).a, ((bb) (obj)).c);
            ((Activity)((bb) (obj)).a.getContext()).runOnUiThread(((Runnable) (obj1)));
        }
        boolean flag = Thread.interrupted();
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
