// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.BinaryImageData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream, ByteString

private static final class uuid extends uuid
{

    private static final int PROTOBUF_TAG = 4;
    private final long baseAddr;
    private final String filePath;
    private final long imageSize;
    private final String uuid;

    public int getPropertiesSize()
    {
        int i = CodedOutputStream.computeUInt64Size(1, baseAddr);
        int j = CodedOutputStream.computeUInt64Size(2, imageSize);
        return CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(filePath)) + i + j + CodedOutputStream.computeBytesSize(4, ByteString.copyFromUtf8(uuid));
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeUInt64(1, baseAddr);
        codedoutputstream.writeUInt64(2, imageSize);
        codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(filePath));
        codedoutputstream.writeBytes(4, ByteString.copyFromUtf8(uuid));
    }

    public (BinaryImageData binaryimagedata)
    {
        super(4, new it>[0]);
        baseAddr = binaryimagedata.baseAddress;
        imageSize = binaryimagedata.size;
        filePath = binaryimagedata.path;
        uuid = binaryimagedata.id;
    }
}
