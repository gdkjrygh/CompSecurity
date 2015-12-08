// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream, ByteString

private static final class crashType extends ge
{

    private static final int PROTOBUF_TAG = 10;
    private final String crashType;
    private final long time;

    public int getPropertiesSize()
    {
        return CodedOutputStream.computeUInt64Size(1, time) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(crashType));
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeUInt64(1, time);
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(crashType));
    }

    public transient ge(long l, String s, ge age[])
    {
        super(10, age);
        time = l;
        crashType = s;
    }
}
