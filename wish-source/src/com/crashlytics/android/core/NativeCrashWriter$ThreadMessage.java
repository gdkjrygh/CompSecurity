// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.ThreadData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, ByteString, CodedOutputStream

private static final class tance extends e
{

    private static final int PROTOBUF_TAG = 1;
    private final int importance;
    private final String name;

    private boolean hasName()
    {
        return name != null && name.length() > 0;
    }

    public int getPropertiesSize()
    {
        int i;
        if (hasName())
        {
            i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(name));
        } else
        {
            i = 0;
        }
        return CodedOutputStream.computeUInt32Size(2, importance) + i;
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        if (hasName())
        {
            codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(name));
        }
        codedoutputstream.writeUInt32(2, importance);
    }

    public e(ThreadData threaddata, e e)
    {
        super(1, new e[] {
            e
        });
        name = threaddata.name;
        importance = threaddata.importance;
    }
}
