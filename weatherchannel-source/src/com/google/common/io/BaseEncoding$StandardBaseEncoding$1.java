// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;

// Referenced classes of package com.google.common.io:
//            BaseEncoding

class writtenChars
    implements writtenChars
{

    int bitBuffer;
    int bitBufferLength;
    final writtenChars this$0;
    final writtenChars val$out;
    int writtenChars;

    public void close()
        throws IOException
    {
        if (bitBufferLength > 0)
        {
            int i = bitBuffer;
            int j = cess._mth000(this._cls0.this)._fld0;
            int k = bitBufferLength;
            int l = cess._mth000(this._cls0.this)._fld0;
            val$out.out(cess._mth000(this._cls0.this)._mth0(i << j - k & l));
            writtenChars = writtenChars + 1;
            if (cess._mth100(this._cls0.this) != null)
            {
                for (; writtenChars % cess._mth000(this._cls0.this)._fld0 != 0; writtenChars = writtenChars + 1)
                {
                    val$out.out(cess._mth100(this._cls0.this).charValue());
                }

            }
        }
        val$out.out();
    }

    public void flush()
        throws IOException
    {
        val$out.out();
    }

    public void write(byte byte0)
        throws IOException
    {
        bitBuffer = bitBuffer << 8;
        bitBuffer = bitBuffer | byte0 & 0xff;
        for (bitBufferLength = bitBufferLength + 8; bitBufferLength >= cess._mth000(this._cls0.this)._fld0; bitBufferLength = bitBufferLength - cess._mth000(this._cls0.this)._fld0)
        {
            byte0 = bitBuffer;
            int i = bitBufferLength;
            int j = cess._mth000(this._cls0.this)._fld0;
            int k = cess._mth000(this._cls0.this)._fld0;
            val$out.out(cess._mth000(this._cls0.this)._mth0(byte0 >> i - j & k));
            writtenChars = writtenChars + 1;
        }

    }

    ()
    {
        this$0 = final_;
        val$out = val.out.this;
        super();
        bitBuffer = 0;
        bitBufferLength = 0;
        writtenChars = 0;
    }
}
