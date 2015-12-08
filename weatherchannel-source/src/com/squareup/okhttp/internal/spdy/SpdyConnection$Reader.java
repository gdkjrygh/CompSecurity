// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, ErrorCode, SpdyStream, Variant, 
//            FrameReader, HeadersMode, Ping, Settings, 
//            IncomingStreamHandler, FrameWriter

class <init> extends NamedRunnable
    implements <init>
{

    FrameReader frameReader;
    final SpdyConnection this$0;

    private void ackSettingsLater(Settings settings1)
    {
        SpdyConnection.access$1900().submit(new NamedRunnable(new Object[] {
            SpdyConnection.access$900(SpdyConnection.this)
        }, settings1) {

            final SpdyConnection.Reader this$1;
            final Settings val$peerSettings;

            public void execute()
            {
                try
                {
                    frameWriter.ackSettings(peerSettings);
                    return;
                }
                catch (IOException ioexception)
                {
                    return;
                }
            }

            transient 
            {
                this$1 = SpdyConnection.Reader.this;
                peerSettings = settings1;
                super(final_s, aobj);
            }
        });
    }

    public void ackSettings()
    {
    }

    public void alternateService(int i, String s, ByteString bytestring, String s1, int j, long l)
    {
    }

    public void data(boolean flag, int i, BufferedSource bufferedsource, int j)
        throws IOException
    {
        if (SpdyConnection.access$1100(SpdyConnection.this, i))
        {
            SpdyConnection.access$1200(SpdyConnection.this, i, bufferedsource, j, flag);
        } else
        {
            SpdyStream spdystream = getStream(i);
            if (spdystream == null)
            {
                writeSynResetLater(i, ErrorCode.INVALID_STREAM);
                bufferedsource.skip(j);
                return;
            }
            spdystream.receiveData(bufferedsource, j);
            if (flag)
            {
                spdystream.receiveFin();
                return;
            }
        }
    }

    protected void execute()
    {
        Object obj;
        ErrorCode errorcode;
        ErrorCode errorcode1;
        ErrorCode errorcode2;
        errorcode1 = ErrorCode.INTERNAL_ERROR;
        errorcode2 = ErrorCode.INTERNAL_ERROR;
        errorcode = errorcode1;
        obj = errorcode1;
        frameReader = variant.newReader(Okio.buffer(Okio.source(socket)), client);
        errorcode = errorcode1;
        obj = errorcode1;
        if (client)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        errorcode = errorcode1;
        obj = errorcode1;
        frameReader.readConnectionPreface();
_L2:
        errorcode = errorcode1;
        obj = errorcode1;
        if (frameReader.nextFrame(this)) goto _L2; else goto _L1
_L1:
        errorcode = errorcode1;
        obj = errorcode1;
        errorcode1 = ErrorCode.NO_ERROR;
        errorcode = errorcode1;
        obj = errorcode1;
        ErrorCode errorcode3 = ErrorCode.CANCEL;
        IOException ioexception;
        Exception exception;
        try
        {
            SpdyConnection.access$1000(SpdyConnection.this, errorcode1, errorcode3);
        }
        catch (IOException ioexception1) { }
        Util.closeQuietly(frameReader);
        return;
        obj;
        obj = errorcode;
        errorcode = ErrorCode.PROTOCOL_ERROR;
        obj = errorcode;
        errorcode1 = ErrorCode.PROTOCOL_ERROR;
        try
        {
            SpdyConnection.access$1000(SpdyConnection.this, errorcode, errorcode1);
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        Util.closeQuietly(frameReader);
        return;
        exception;
        try
        {
            SpdyConnection.access$1000(SpdyConnection.this, ((ErrorCode) (obj)), errorcode2);
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        Util.closeQuietly(frameReader);
        throw exception;
    }

    public void goAway(int i, ErrorCode errorcode, ByteString bytestring)
    {
        if (bytestring.size() <= 0);
        synchronized (SpdyConnection.this)
        {
            bytestring = (SpdyStream[])SpdyConnection.access$1700(SpdyConnection.this).values().toArray(new SpdyStream[SpdyConnection.access$1700(SpdyConnection.this).size()]);
            SpdyConnection.access$1402(SpdyConnection.this, true);
        }
        int k = bytestring.length;
        for (int j = 0; j < k; j++)
        {
            errorcode = bytestring[j];
            if (errorcode.getId() > i && errorcode.isLocallyInitiated())
            {
                errorcode.receiveRstStream(ErrorCode.REFUSED_STREAM);
                removeStream(errorcode.getId());
            }
        }

        break MISSING_BLOCK_LABEL_128;
        bytestring;
        errorcode;
        JVM INSTR monitorexit ;
        throw bytestring;
    }

    public void headers(boolean flag, boolean flag1, int i, int j, List list, HeadersMode headersmode)
    {
        if (!SpdyConnection.access$1100(SpdyConnection.this, i)) goto _L2; else goto _L1
_L1:
        SpdyConnection.access$1300(SpdyConnection.this, i, list, flag1);
_L4:
        return;
_L2:
        synchronized (SpdyConnection.this)
        {
            if (!SpdyConnection.access$1400(SpdyConnection.this))
            {
                break MISSING_BLOCK_LABEL_54;
            }
        }
        return;
        list;
        spdyconnection;
        JVM INSTR monitorexit ;
        throw list;
        SpdyStream spdystream = getStream(i);
        if (spdystream != null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        if (!headersmode.failIfStreamAbsent())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        writeSynResetLater(i, ErrorCode.INVALID_STREAM);
        spdyconnection;
        JVM INSTR monitorexit ;
        return;
        if (i > SpdyConnection.access$1500(SpdyConnection.this))
        {
            break MISSING_BLOCK_LABEL_107;
        }
        spdyconnection;
        JVM INSTR monitorexit ;
        return;
        if (i % 2 != SpdyConnection.access$1600(SpdyConnection.this) % 2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        spdyconnection;
        JVM INSTR monitorexit ;
        return;
        list = new SpdyStream(i, SpdyConnection.this, flag, flag1, list);
        SpdyConnection.access$1502(SpdyConnection.this, i);
        SpdyConnection.access$1700(SpdyConnection.this).put(Integer.valueOf(i), list);
        SpdyConnection.access$1900().submit(new NamedRunnable(new Object[] {
            SpdyConnection.access$900(SpdyConnection.this), Integer.valueOf(i)
        }, list) {

            final SpdyConnection.Reader this$1;
            final SpdyStream val$newStream;

            public void execute()
            {
                try
                {
                    SpdyConnection.access$1800(this$0).receive(newStream);
                    return;
                }
                catch (IOException ioexception)
                {
                    throw new RuntimeException(ioexception);
                }
            }

            transient 
            {
                this$1 = SpdyConnection.Reader.this;
                newStream = spdystream;
                super(final_s, aobj);
            }
        });
        spdyconnection;
        JVM INSTR monitorexit ;
        return;
        spdyconnection;
        JVM INSTR monitorexit ;
        if (headersmode.failIfStreamPresent())
        {
            spdystream.closeLater(ErrorCode.PROTOCOL_ERROR);
            removeStream(i);
            return;
        }
        spdystream.receiveHeaders(list, headersmode);
        if (flag1)
        {
            spdystream.receiveFin();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void ping(boolean flag, int i, int j)
    {
        if (flag)
        {
            Ping ping1 = SpdyConnection.access$2200(SpdyConnection.this, i);
            if (ping1 != null)
            {
                ping1.receive();
            }
            return;
        } else
        {
            SpdyConnection.access$2300(SpdyConnection.this, true, i, j, null);
            return;
        }
    }

    public void priority(int i, int j, int k, boolean flag)
    {
    }

    public void pushPromise(int i, int j, List list)
    {
        SpdyConnection.access$2400(SpdyConnection.this, j, list);
    }

    public void rstStream(int i, ErrorCode errorcode)
    {
        if (SpdyConnection.access$1100(SpdyConnection.this, i))
        {
            SpdyConnection.access$2000(SpdyConnection.this, i, errorcode);
        } else
        {
            SpdyStream spdystream = removeStream(i);
            if (spdystream != null)
            {
                spdystream.receiveRstStream(errorcode);
                return;
            }
        }
    }

    public void settings(boolean flag, Settings settings1)
    {
        Object obj;
        long l2;
        l2 = 0L;
        obj = null;
        SpdyConnection spdyconnection = SpdyConnection.this;
        spdyconnection;
        JVM INSTR monitorenter ;
        int i = peerSettings.getInitialWindowSize(0x10000);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        peerSettings.clear();
        int k;
        peerSettings.merge(settings1);
        if (getProtocol() == Protocol.HTTP_2)
        {
            ackSettingsLater(settings1);
        }
        k = peerSettings.getInitialWindowSize(0x10000);
        long l1;
        l1 = l2;
        settings1 = obj;
        if (k == -1)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        l1 = l2;
        settings1 = obj;
        if (k == i)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        l2 = k - i;
        if (!SpdyConnection.access$2100(SpdyConnection.this))
        {
            addBytesToWriteWindow(l2);
            SpdyConnection.access$2102(SpdyConnection.this, true);
        }
        l1 = l2;
        settings1 = obj;
        if (SpdyConnection.access$1700(SpdyConnection.this).isEmpty())
        {
            break MISSING_BLOCK_LABEL_209;
        }
        settings1 = (SpdyStream[])SpdyConnection.access$1700(SpdyConnection.this).values().toArray(new SpdyStream[SpdyConnection.access$1700(SpdyConnection.this).size()]);
        l1 = l2;
        spdyconnection;
        JVM INSTR monitorexit ;
        if (settings1 != null && l1 != 0L)
        {
            int l = settings1.length;
            for (int j = 0; j < l; j++)
            {
                synchronized (settings1[j])
                {
                    spdystream.addBytesToWriteWindow(l1);
                }
            }

        }
        break MISSING_BLOCK_LABEL_272;
        settings1;
        spdyconnection;
        JVM INSTR monitorexit ;
        throw settings1;
        settings1;
        spdystream;
        JVM INSTR monitorexit ;
        throw settings1;
    }

    public void windowUpdate(int i, long l)
    {
        if (i == 0)
        {
            synchronized (SpdyConnection.this)
            {
                SpdyConnection spdyconnection1 = SpdyConnection.this;
                spdyconnection1.bytesLeftInWriteWindow = spdyconnection1.bytesLeftInWriteWindow + l;
                notifyAll();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_50;
        exception;
        spdyconnection;
        JVM INSTR monitorexit ;
        throw exception;
        SpdyStream spdystream;
        spdystream = getStream(i);
        if (spdystream == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        spdystream;
        JVM INSTR monitorenter ;
        spdystream.addBytesToWriteWindow(l);
        spdystream;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        spdystream;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private _cls2.val.peerSettings()
    {
        this$0 = SpdyConnection.this;
        super("OkHttp %s", new Object[] {
            SpdyConnection.access$900(SpdyConnection.this)
        });
    }

    _cls900(_cls900 _pcls900)
    {
        this();
    }
}
