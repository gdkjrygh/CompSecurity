// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H264TrackImpl

protected class prev extends FilterInputStream
{

    int prev;
    int prevprev;
    final H264TrackImpl this$0;

    public boolean markSupported()
    {
        return false;
    }

    public int read()
        throws IOException
    {
        int j = super.read();
        int i = j;
        if (j == 3)
        {
            i = j;
            if (prevprev == 0)
            {
                i = j;
                if (prev == 0)
                {
                    prevprev = -1;
                    prev = -1;
                    i = super.read();
                }
            }
        }
        prevprev = prev;
        prev = i;
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0 || j < 0 || j > abyte0.length - i)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        return l;
_L2:
        int k;
        k = read();
        if (k == -1)
        {
            return -1;
        }
        abyte0[i] = (byte)k;
        k = 1;
_L6:
        l = k;
        if (k >= j) goto _L4; else goto _L3
_L3:
        int i1;
        try
        {
            i1 = read();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return k;
        }
        l = k;
        if (i1 == -1) goto _L4; else goto _L5
_L5:
        abyte0[i + k] = (byte)i1;
        k++;
          goto _L6
    }

    (InputStream inputstream)
    {
        this$0 = H264TrackImpl.this;
        super(inputstream);
        prevprev = -1;
        prev = -1;
    }
}
