// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.InputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            IndefiniteLengthInputStream

abstract class LimitedInputStream extends InputStream
{

    protected final InputStream _in;
    private int _limit;

    LimitedInputStream(InputStream inputstream, int i)
    {
        _in = inputstream;
        _limit = i;
    }

    int getRemaining()
    {
        return _limit;
    }

    protected void setParentEofDetect(boolean flag)
    {
        if (_in instanceof IndefiniteLengthInputStream)
        {
            ((IndefiniteLengthInputStream)_in).setEofOn00(flag);
        }
    }
}
