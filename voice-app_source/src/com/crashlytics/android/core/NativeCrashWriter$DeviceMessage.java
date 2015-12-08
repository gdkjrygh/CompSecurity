// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//            NativeCrashWriter, CodedOutputStream

private static final class diskUsed extends e
{

    private static final int PROTOBUF_TAG = 5;
    private final float batteryLevel;
    private final int batteryVelocity;
    private final long diskUsed;
    private final int orientation;
    private final boolean proximityOn;
    private final long ramUsed;

    public int getPropertiesSize()
    {
        return 0 + CodedOutputStream.computeFloatSize(1, batteryLevel) + CodedOutputStream.computeSInt32Size(2, batteryVelocity) + CodedOutputStream.computeBoolSize(3, proximityOn) + CodedOutputStream.computeUInt32Size(4, orientation) + CodedOutputStream.computeUInt64Size(5, ramUsed) + CodedOutputStream.computeUInt64Size(6, diskUsed);
    }

    public void writeProperties(CodedOutputStream codedoutputstream)
        throws IOException
    {
        codedoutputstream.writeFloat(1, batteryLevel);
        codedoutputstream.writeSInt32(2, batteryVelocity);
        codedoutputstream.writeBool(3, proximityOn);
        codedoutputstream.writeUInt32(4, orientation);
        codedoutputstream.writeUInt64(5, ramUsed);
        codedoutputstream.writeUInt64(6, diskUsed);
    }

    public e(float f, int i, boolean flag, int j, long l, long l1)
    {
        super(5, new e[0]);
        batteryLevel = f;
        batteryVelocity = i;
        proximityOn = flag;
        orientation = j;
        ramUsed = l;
        diskUsed = l1;
    }
}
