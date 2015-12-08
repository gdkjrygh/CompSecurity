// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            w, z, DecoderInitializationException

final class x
    implements Runnable
{

    final DecoderInitializationException a;
    final w b;

    x(w w1, DecoderInitializationException decoderinitializationexception)
    {
        b = w1;
        a = decoderinitializationexception;
        super();
    }

    public final void run()
    {
        w.a(b).a(a);
    }
}
