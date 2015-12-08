// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.common.io:
//            ByteSource, FileBackedOutputStream

class this._cls0 extends ByteSource
{

    final FileBackedOutputStream this$0;

    public InputStream openStream()
        throws IOException
    {
        return FileBackedOutputStream.access$100(FileBackedOutputStream.this);
    }

    ()
    {
        this$0 = FileBackedOutputStream.this;
        super();
    }
}
