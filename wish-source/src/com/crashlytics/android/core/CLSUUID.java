// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.os.Process;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class CLSUUID
{

    private static String _clsId;
    private static final AtomicLong _sequenceNumber = new AtomicLong(0L);

    public CLSUUID(IdManager idmanager)
    {
        byte abyte0[] = new byte[10];
        populateTime(abyte0);
        populateSequenceNumber(abyte0);
        populatePID(abyte0);
        idmanager = CommonUtils.sha1(idmanager.getAppInstallIdentifier());
        String s = CommonUtils.hexify(abyte0);
        _clsId = String.format(Locale.US, "%s-%s-%s-%s", new Object[] {
            s.substring(0, 12), s.substring(12, 16), s.subSequence(16, 20), idmanager.substring(0, 12)
        }).toUpperCase(Locale.US);
    }

    private static byte[] convertLongToFourByteBuffer(long l)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(4);
        bytebuffer.putInt((int)l);
        bytebuffer.order(ByteOrder.BIG_ENDIAN);
        bytebuffer.position(0);
        return bytebuffer.array();
    }

    private static byte[] convertLongToTwoByteBuffer(long l)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(2);
        bytebuffer.putShort((short)(int)l);
        bytebuffer.order(ByteOrder.BIG_ENDIAN);
        bytebuffer.position(0);
        return bytebuffer.array();
    }

    private void populatePID(byte abyte0[])
    {
        byte abyte1[] = convertLongToTwoByteBuffer(Integer.valueOf(Process.myPid()).shortValue());
        abyte0[8] = abyte1[0];
        abyte0[9] = abyte1[1];
    }

    private void populateSequenceNumber(byte abyte0[])
    {
        byte abyte1[] = convertLongToTwoByteBuffer(_sequenceNumber.incrementAndGet());
        abyte0[6] = abyte1[0];
        abyte0[7] = abyte1[1];
    }

    private void populateTime(byte abyte0[])
    {
        long l = (new Date()).getTime();
        byte abyte1[] = convertLongToFourByteBuffer(l / 1000L);
        abyte0[0] = abyte1[0];
        abyte0[1] = abyte1[1];
        abyte0[2] = abyte1[2];
        abyte0[3] = abyte1[3];
        abyte1 = convertLongToTwoByteBuffer(l % 1000L);
        abyte0[4] = abyte1[0];
        abyte0[5] = abyte1[1];
    }

    public String toString()
    {
        return _clsId;
    }

}
