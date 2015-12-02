// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, mk, aky

class hy extends Thread
{

    final aky a;
    final boolean b;

    hy(aky aky, boolean flag)
    {
        a = aky;
        b = flag;
        super();
    }

    public void run()
    {
        int i;
        int k;
        k = App.am;
        i = 0;
_L1:
        int j = i;
        InterruptedException interruptedexception;
        boolean flag;
        try
        {
            if (b)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = mk.f;
        }
        catch (InterruptedException interruptedexception1)
        {
            try
            {
                throw interruptedexception1;
            }
            catch (InterruptedException interruptedexception2)
            {
                throw interruptedexception2;
            }
        }
        j = i;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i >= 45000)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i + 200;
        Thread.sleep(200L);
        i = j;
          goto _L1
        interruptedexception;
        interruptedexception.printStackTrace();
        i = j;
        if (k == 0) goto _L1; else goto _L2
_L2:
        if (j < 45000)
        {
            try
            {
                flag = b;
            }
            catch (InterruptedException interruptedexception3)
            {
                try
                {
                    throw interruptedexception3;
                }
                catch (InterruptedException interruptedexception4)
                {
                    throw interruptedexception4;
                }
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_91;
            }
        }
        if (mk.f)
        {
            mk.h();
        }
    }
}
