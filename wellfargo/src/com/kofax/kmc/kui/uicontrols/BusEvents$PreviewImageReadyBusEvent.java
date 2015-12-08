// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.graphics.Bitmap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            Utility

public class b
{

    private Bitmap a;
    private final Lock b;
    private boolean c;
    public final int height;
    public final byte imageData[];
    public final int imageFormat = 17;
    public final int rotation;
    public final int width;

    public Bitmap getBitmap(boolean flag)
    {
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        byte abyte0[];
        int j;
        int k;
        b.lock();
        abyte0 = imageData;
        j = width;
        k = height;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = rotation;
_L3:
        a = Utility.imageDataToBitmap(abyte0, j, k, 17, i);
        b.unlock();
        c = flag;
_L4:
        return a;
_L2:
        i = 0;
          goto _L3
        Exception exception;
        exception;
        b.unlock();
        throw exception;
        if (flag != c)
        {
            float f;
            if (c)
            {
                f = -rotation;
            } else
            {
                f = rotation;
            }
            a = Utility.Rotate(a, f);
            c = flag;
        }
          goto _L4
    }

    public a(byte abyte0[], int i, int j, int k, Lock lock)
    {
        imageData = abyte0;
        width = i;
        height = j;
        rotation = k;
        abyte0 = lock;
        class a
            implements Lock
        {

            final BusEvents.PreviewImageReadyBusEvent a;

            public void lock()
            {
            }

            public void lockInterruptibly()
            {
            }

            public Condition newCondition()
            {
                return null;
            }

            public boolean tryLock()
            {
                return true;
            }

            public boolean tryLock(long l, TimeUnit timeunit)
            {
                return true;
            }

            public void unlock()
            {
            }

            private a()
            {
                a = BusEvents.PreviewImageReadyBusEvent.this;
                super();
            }

            a(BusEvents._cls1 _pcls1)
            {
                this();
            }
        }

        if (lock == null)
        {
            abyte0 = new a(null);
        }
        b = abyte0;
    }
}
