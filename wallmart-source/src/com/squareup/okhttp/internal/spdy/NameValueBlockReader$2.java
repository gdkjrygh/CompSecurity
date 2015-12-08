// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            NameValueBlockReader, Spdy3

class this._cls0 extends Inflater
{

    final NameValueBlockReader this$0;

    public int inflate(byte abyte0[], int i, int j)
        throws DataFormatException
    {
        int l = super.inflate(abyte0, i, j);
        int k = l;
        if (l == 0)
        {
            k = l;
            if (needsDictionary())
            {
                setDictionary(Spdy3.DICTIONARY);
                k = super.inflate(abyte0, i, j);
            }
        }
        return k;
    }

    ()
    {
        this$0 = NameValueBlockReader.this;
        super();
    }
}
