// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp.util:
//            j, b9

class bn extends FilterOutputStream
{

    final j a;

    private bn(j j1, OutputStream outputstream)
    {
        a = j1;
        super(outputstream);
    }

    bn(j j1, OutputStream outputstream, b9 b9)
    {
        this(j1, outputstream);
    }

    public void close()
    {
        try
        {
            out.close();
            return;
        }
        catch (IOException ioexception)
        {
            j.a(a, true);
        }
    }

    public void flush()
    {
        try
        {
            out.flush();
            return;
        }
        catch (IOException ioexception)
        {
            j.a(a, true);
        }
    }

    public void write(int i)
    {
        try
        {
            out.write(i);
            return;
        }
        catch (IOException ioexception)
        {
            j.a(a, true);
        }
    }

    public void write(byte abyte0[], int i, int k)
    {
        try
        {
            out.write(abyte0, i, k);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            j.a(a, true);
        }
    }
}
