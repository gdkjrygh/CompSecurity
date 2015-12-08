// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.youtube.player.YouTubeInitializationResult;

// Referenced classes of package com.google.android.youtube.player.internal:
//            am, aj, ak

public final class an extends am
{

    public final YouTubeInitializationResult b;
    public final IBinder c;
    final aj d;

    public an(aj aj1, String s, IBinder ibinder)
    {
        d = aj1;
        super(aj1, Boolean.valueOf(true));
        b = aj.a(s);
        c = ibinder;
    }

    protected final void a(Object obj)
    {
label0:
        {
            if ((Boolean)obj != null)
            {
                switch (ak.a[b.ordinal()])
                {
                default:
                    d.a(b);
                    break;

                case 1: // '\001'
                    break label0;
                }
            }
            return;
        }
        try
        {
            obj = c.getInterfaceDescriptor();
            if (d.b().equals(obj))
            {
                aj.a(d, d.a(c));
                if (aj.d(d) != null)
                {
                    d.g();
                    return;
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        aj.e(d);
        d.a(YouTubeInitializationResult.INTERNAL_ERROR);
    }
}
