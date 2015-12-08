// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.common.io:
//            GwtWorkarounds

static final class val.input extends InputStream
{

    final teInput val$input;

    public void close()
        throws IOException
    {
        val$input.close();
    }

    public int read()
        throws IOException
    {
        return val$input.read();
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        Preconditions.checkNotNull(abyte0);
        Preconditions.checkPositionIndexes(i, i + j, abyte0.length);
        if (j != 0) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        return l;
_L2:
        int k = read();
        if (k == -1)
        {
            return -1;
        }
        abyte0[i] = (byte)k;
        k = 1;
label0:
        do
        {
label1:
            {
                if (k >= j)
                {
                    break label1;
                }
                int i1 = read();
                l = k;
                if (i1 == -1)
                {
                    break label0;
                }
                abyte0[i + k] = (byte)i1;
                k++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return j;
    }

    teInput(teInput teinput)
    {
        val$input = teinput;
        super();
    }
}
