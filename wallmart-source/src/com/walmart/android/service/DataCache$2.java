// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.walmart.android.service:
//            DataCache

class val.data
    implements reamWriter
{

    final DataCache this$0;
    final byte val$data[];

    public void onWriteToStream(FileOutputStream fileoutputstream)
        throws IOException
    {
        fileoutputstream.write(val$data);
        fileoutputstream.flush();
    }

    reamWriter()
    {
        this$0 = final_datacache;
        val$data = _5B_B.this;
        super();
    }
}
