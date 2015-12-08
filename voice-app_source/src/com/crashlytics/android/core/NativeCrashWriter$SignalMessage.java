// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.SignalData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, ByteString, CodedOutputStream

private static final class Address extends e
{

    private static final int PROTOBUF_TAG = 3;
    private final long sigAddr;
    private final String sigCode;
    private final String sigName;

    public int getPropertiesSize()
    {
        return CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(sigName)) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(sigCode)) + CodedOutputStream.computeUInt64Size(3, sigAddr);
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(sigName));
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(sigCode));
        codedoutputstream.writeUInt64(3, sigAddr);
    }

    public e(SignalData signaldata)
    {
        super(3, new e[0]);
        sigName = signaldata.name;
        sigCode = signaldata.code;
        sigAddr = signaldata.faultAddress;
    }
}
