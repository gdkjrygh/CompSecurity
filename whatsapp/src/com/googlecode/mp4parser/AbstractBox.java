// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.util.Path;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public abstract class AbstractBox
    implements Box
{

    static final boolean $assertionsDisabled;
    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/AbstractBox);
    private ByteBuffer content;
    long contentStartPosition;
    private ByteBuffer deadBytes;
    FileChannel fileChannel;
    boolean isParsed;
    boolean isRead;
    long memMapSize;
    long offset;
    private Container parent;
    protected String type;
    private byte userType[];

    protected AbstractBox(String s)
    {
        memMapSize = -1L;
        deadBytes = null;
        type = s;
        isRead = true;
        isParsed = true;
    }

    protected AbstractBox(String s, byte abyte0[])
    {
        memMapSize = -1L;
        deadBytes = null;
        type = s;
        userType = abyte0;
        isRead = true;
        isParsed = true;
    }

    private void getHeader(ByteBuffer bytebuffer)
    {
        if (isSmallBox())
        {
            IsoTypeWriter.writeUInt32(bytebuffer, getSize());
            bytebuffer.put(IsoFile.fourCCtoBytes(getType()));
        } else
        {
            IsoTypeWriter.writeUInt32(bytebuffer, 1L);
            bytebuffer.put(IsoFile.fourCCtoBytes(getType()));
            IsoTypeWriter.writeUInt64(bytebuffer, getSize());
        }
        if ("uuid".equals(getType()))
        {
            bytebuffer.put(getUserType());
        }
    }

    private boolean isSmallBox()
    {
        int i;
        i = 8;
        if ("uuid".equals(getType()))
        {
            i = 8 + 16;
        }
        if (!isRead) goto _L2; else goto _L1
_L1:
        if (!isParsed) goto _L4; else goto _L3
_L3:
        long l = getContentSize();
        int j;
        if (deadBytes != null)
        {
            j = deadBytes.limit();
        } else
        {
            j = 0;
        }
        if (l + (long)j + (long)i >= 0x100000000L) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        return false;
_L4:
        if ((long)(content.limit() + i) >= 0x100000000L)
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (memMapSize + (long)i >= 0x100000000L)
        {
            return false;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    private void readContent()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isRead;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        LOG.logDebug((new StringBuilder("mem mapping ")).append(getType()).toString());
        content = fileChannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, contentStartPosition, memMapSize);
        isRead = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private boolean verify(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1;
        long l1 = getContentSize();
        int i;
        if (deadBytes != null)
        {
            i = deadBytes.limit();
        } else
        {
            i = 0;
        }
        bytebuffer1 = ByteBuffer.allocate(CastUtils.l2i((long)i + l1));
        getContent(bytebuffer1);
        if (deadBytes == null) goto _L2; else goto _L1
_L1:
        deadBytes.rewind();
_L5:
        if (deadBytes.remaining() > 0) goto _L3; else goto _L2
_L2:
        bytebuffer.rewind();
        bytebuffer1.rewind();
        if (bytebuffer.remaining() != bytebuffer1.remaining())
        {
            LOG.logError((new StringBuilder(String.valueOf(getType()))).append(": remaining differs ").append(bytebuffer.remaining()).append(" vs. ").append(bytebuffer1.remaining()).toString());
            return false;
        }
        break; /* Loop/switch isn't completed */
_L3:
        bytebuffer1.put(deadBytes);
        if (true) goto _L5; else goto _L4
_L4:
        int l = bytebuffer.position();
        int k = bytebuffer.limit() - 1;
        int j = bytebuffer1.limit() - 1;
        do
        {
            if (k < l)
            {
                return true;
            }
            byte byte0 = bytebuffer.get(k);
            byte byte1 = bytebuffer1.get(j);
            if (byte0 != byte1)
            {
                LOG.logError(String.format("%s: buffers differ at %d: %2X/%2X", new Object[] {
                    getType(), Integer.valueOf(k), Byte.valueOf(byte0), Byte.valueOf(byte1)
                }));
                byte abyte0[] = new byte[bytebuffer.remaining()];
                byte abyte1[] = new byte[bytebuffer1.remaining()];
                bytebuffer.get(abyte0);
                bytebuffer1.get(abyte1);
                System.err.println((new StringBuilder("original      : ")).append(Hex.encodeHex(abyte0, 4)).toString());
                System.err.println((new StringBuilder("reconstructed : ")).append(Hex.encodeHex(abyte1, 4)).toString());
                return false;
            }
            k--;
            j--;
        } while (true);
    }

    protected abstract void _parseDetails(ByteBuffer bytebuffer);

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        byte byte0;
        byte byte1;
        byte0 = 8;
        byte1 = 16;
        if (!isRead)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        if (!isParsed) goto _L2; else goto _L1
_L1:
        ByteBuffer bytebuffer;
        bytebuffer = ByteBuffer.allocate(CastUtils.l2i(getSize()));
        getHeader(bytebuffer);
        getContent(bytebuffer);
        if (deadBytes == null) goto _L4; else goto _L3
_L3:
        deadBytes.rewind();
_L6:
        if (deadBytes.remaining() > 0) goto _L5; else goto _L4
_L4:
        writablebytechannel.write((ByteBuffer)bytebuffer.rewind());
        return;
_L5:
        bytebuffer.put(deadBytes);
        if (true) goto _L6; else goto _L2
_L2:
        ByteBuffer bytebuffer1;
        if (!isSmallBox())
        {
            byte0 = 16;
        }
        if (!"uuid".equals(getType()))
        {
            byte1 = 0;
        }
        bytebuffer1 = ByteBuffer.allocate(byte0 + byte1);
        getHeader(bytebuffer1);
        writablebytechannel.write((ByteBuffer)bytebuffer1.rewind());
        writablebytechannel.write((ByteBuffer)content.position(0));
        return;
        ByteBuffer bytebuffer2;
        if (!isSmallBox())
        {
            byte0 = 16;
        }
        bytebuffer2 = ByteBuffer.allocate(byte0);
        getHeader(bytebuffer2);
        writablebytechannel.write((ByteBuffer)bytebuffer2.rewind());
        fileChannel.transferTo(contentStartPosition, memMapSize, writablebytechannel);
        return;
    }

    protected abstract void getContent(ByteBuffer bytebuffer);

    protected abstract long getContentSize();

    public long getOffset()
    {
        return offset;
    }

    public Container getParent()
    {
        return parent;
    }

    public String getPath()
    {
        return Path.createPath(this);
    }

    public long getSize()
    {
        boolean flag = false;
        int i;
        byte byte0;
        long l;
        long l1;
        if (isRead)
        {
            if (isParsed)
            {
                l = getContentSize();
            } else
            {
                l = content.limit();
            }
        } else
        {
            l = memMapSize;
        }
        if (l >= 0xfffffff8L)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        if ("uuid".equals(getType()))
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        l1 = byte0 + (i + 8);
        if (deadBytes == null)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = deadBytes.limit();
        }
        return l + l1 + (long)i;
    }

    public String getType()
    {
        return type;
    }

    public byte[] getUserType()
    {
        return userType;
    }

    public boolean isParsed()
    {
        return isParsed;
    }

    public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
        throws IOException
    {
        contentStartPosition = filechannel.position();
        offset = contentStartPosition - (long)bytebuffer.remaining();
        memMapSize = l;
        fileChannel = filechannel;
        filechannel.position(filechannel.position() + l);
        isRead = false;
        isParsed = false;
    }

    public final void parseDetails()
    {
        this;
        JVM INSTR monitorenter ;
        readContent();
        LOG.logDebug((new StringBuilder("parsing details of ")).append(getType()).toString());
        if (content != null)
        {
            ByteBuffer bytebuffer = content;
            isParsed = true;
            bytebuffer.rewind();
            _parseDetails(bytebuffer);
            if (bytebuffer.remaining() > 0)
            {
                deadBytes = bytebuffer.slice();
            }
            content = null;
            if (!$assertionsDisabled && !verify(bytebuffer))
            {
                throw new AssertionError();
            }
        }
        break MISSING_BLOCK_LABEL_106;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    protected void setDeadBytes(ByteBuffer bytebuffer)
    {
        deadBytes = bytebuffer;
    }

    public void setParent(Container container)
    {
        parent = container;
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/AbstractBox.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
