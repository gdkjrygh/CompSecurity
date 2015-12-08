// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;

// Referenced classes of package com.google.android.gms.common.api:
//            aa, ac, z, Status

public class ad extends Handler
{

    public ad()
    {
        this(Looper.getMainLooper());
    }

    public ad(Looper looper)
    {
        super(looper);
    }

    public void a()
    {
        removeMessages(2);
    }

    public void a(aa aa1, z z1)
    {
        sendMessage(obtainMessage(1, new Pair(aa1, z1)));
    }

    protected void b(aa aa1, z z1)
    {
        try
        {
            aa1.a(z1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            ac.b(z1);
        }
        throw aa1;
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
            return;

        case 1: // '\001'
            message = (Pair)message.obj;
            b((aa)((Pair) (message)).first, (z)((Pair) (message)).second);
            return;

        case 2: // '\002'
            ((ac)message.obj).a(Status.d);
            break;
        }
    }
}
