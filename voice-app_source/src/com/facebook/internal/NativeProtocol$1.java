// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//            NativeProtocol

class tiveAppInfo
    implements Runnable
{

    public void run()
    {
        Iterator iterator = NativeProtocol.access$2().iterator();
_L1:
        boolean flag = iterator.hasNext();
        if (!flag)
        {
            NativeProtocol.access$1().set(false);
            return;
        }
        tiveAppInfo.access._mth1((tiveAppInfo)iterator.next(), true);
          goto _L1
        Exception exception;
        exception;
        NativeProtocol.access$1().set(false);
        throw exception;
    }

    tiveAppInfo()
    {
    }
}
