// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;


// Referenced classes of package com.google.android.exoplayer:
//            w, z

final class y
    implements Runnable
{

    final android.media.MediaCodec.CryptoException a;
    final w b;

    y(w w1, android.media.MediaCodec.CryptoException cryptoexception)
    {
        b = w1;
        a = cryptoexception;
        super();
    }

    public final void run()
    {
        w.a(b).a(a);
    }
}
