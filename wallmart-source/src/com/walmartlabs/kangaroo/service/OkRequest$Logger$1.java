// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSource;
import okio.Source;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            OkRequest

class this._cls0 extends ForwardingSource
{

    final this._cls0 this$0;

    public long read(Buffer buffer, long l)
        throws IOException
    {
        l = super.read(buffer, l);
        if (l != -1L)
        {
            buffer.copyTo(cess._mth100(this._cls0.this), buffer.size() - l, l);
        }
        return l;
    }

    _cls9(Source source)
    {
        this$0 = this._cls0.this;
        super(source);
    }
}
