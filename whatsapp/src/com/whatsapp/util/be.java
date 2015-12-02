// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import com.whatsapp.App;
import com.whatsapp.MediaData;

final class be
    implements Runnable
{

    final String a;
    final String b;
    final byte c[];
    final MediaData d;

    be(String s, byte abyte0[], MediaData mediadata, String s1)
    {
        a = s;
        c = abyte0;
        d = mediadata;
        b = s1;
        super();
    }

    public void run()
    {
        App.a(a, c, d, (byte)1, 0, b, null);
    }
}
