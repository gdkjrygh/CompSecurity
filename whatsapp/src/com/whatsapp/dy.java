// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.FilterOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp:
//            l1

public class dy extends FilterOutputStream
{

    final int a;

    public dy(OutputStream outputstream, int i)
    {
        super(outputstream);
        a = i;
    }

    public void write(int i)
    {
        l1.a(1L, a);
        out.write(i);
    }

    public void write(byte abyte0[])
    {
        l1.a(abyte0.length, a);
        out.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        l1.a(j, a);
        out.write(abyte0, i, j);
    }
}
