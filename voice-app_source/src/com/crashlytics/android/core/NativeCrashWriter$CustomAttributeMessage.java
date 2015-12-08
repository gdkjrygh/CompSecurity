// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.CustomAttributeData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, ByteString, CodedOutputStream

private static final class  extends 
{

    private static final int PROTOBUF_TAG = 2;
    private final String key;
    private final String value;

    public int getPropertiesSize()
    {
        int i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(key));
        String s;
        if (value == null)
        {
            s = "";
        } else
        {
            s = value;
        }
        return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(key));
        String s;
        if (value == null)
        {
            s = "";
        } else
        {
            s = value;
        }
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
    }

    public (CustomAttributeData customattributedata)
    {
        super(2, new [0]);
        key = customattributedata.key;
        value = customattributedata.value;
    }
}
