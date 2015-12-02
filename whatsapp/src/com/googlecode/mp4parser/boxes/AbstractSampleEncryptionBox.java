// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.Path;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

// Referenced classes of package com.googlecode.mp4parser.boxes:
//            AbstractTrackEncryptionBox

public abstract class AbstractSampleEncryptionBox extends AbstractFullBox
{
    public class Entry
    {

        public byte iv[];
        public List pairs;
        final AbstractSampleEncryptionBox this$0;

        public Pair createPair(int i, long l)
        {
            return new Pair(i, l);
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry)obj;
                if (!(new BigInteger(iv)).equals(new BigInteger(((Entry) (obj)).iv)))
                {
                    return false;
                }
                if (pairs == null ? ((Entry) (obj)).pairs != null : !pairs.equals(((Entry) (obj)).pairs))
                {
                    return false;
                }
            }
            return true;
        }

        public int getSize()
        {
            Iterator iterator;
            int i;
            int j;
            if (isOverrideTrackEncryptionBoxParameters())
            {
                i = ivSize;
            } else
            {
                i = iv.length;
            }
            j = i;
            if (!isSubSampleEncryption()) goto _L2; else goto _L1
_L1:
            i += 2;
            iterator = pairs.iterator();
_L6:
            if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
            j = i;
_L2:
            return j;
_L4:
            Pair pair = (Pair)iterator.next();
            i += 6;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (iv != null)
            {
                i = Arrays.hashCode(iv);
            } else
            {
                i = 0;
            }
            if (pairs != null)
            {
                j = pairs.hashCode();
            }
            return i * 31 + j;
        }

        public String toString()
        {
            return (new StringBuilder("Entry{iv=")).append(Hex.encodeHex(iv)).append(", pairs=").append(pairs).append('}').toString();
        }

        public Entry()
        {
            this$0 = AbstractSampleEncryptionBox.this;
            super();
            pairs = new LinkedList();
        }
    }

    public class Entry.Pair
    {

        public int clear;
        public long encrypted;
        final Entry this$1;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Entry.Pair)obj;
                if (clear != ((Entry.Pair) (obj)).clear)
                {
                    return false;
                }
                if (encrypted != ((Entry.Pair) (obj)).encrypted)
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return clear * 31 + (int)(encrypted ^ encrypted >>> 32);
        }

        public String toString()
        {
            return (new StringBuilder("clr:")).append(clear).append(" enc:").append(encrypted).toString();
        }

        public Entry.Pair(int i, long l)
        {
            this$1 = Entry.this;
            super();
            clear = i;
            encrypted = l;
        }
    }


    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_10;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_11;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_12;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_13;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_5;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_6;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_7;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_8;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_9;
    int algorithmId;
    List entries;
    int ivSize;
    byte kid[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1
    };

    protected AbstractSampleEncryptionBox(String s)
    {
        super(s);
        algorithmId = -1;
        ivSize = -1;
        entries = new LinkedList();
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("AbstractSampleEncryptionBox.java", com/googlecode/mp4parser/boxes/AbstractSampleEncryptionBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 33);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getSampleCount", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 81);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "createEntry", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox$Entry"), 194);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", "boolean"), 307);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 334);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 342);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 85);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", "entries", "", "void"), 89);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 93);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "int", "algorithmId", "", "void"), 97);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getIvSize", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "int"), 101);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setIvSize", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "int", "ivSize", "", "void"), 105);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getKid", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "[B"), 109);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setKid", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "[B", "kid", "", "void"), 113);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        int j;
        parseVersionAndFlags(bytebuffer);
        j = -1;
        if ((getFlags() & 1) <= 0) goto _L2; else goto _L1
_L1:
        int i;
        algorithmId = IsoTypeReader.readUInt24(bytebuffer);
        ivSize = IsoTypeReader.readUInt8(bytebuffer);
        i = ivSize;
        kid = new byte[16];
        bytebuffer.get(kid);
_L5:
        long l = IsoTypeReader.readUInt32(bytebuffer);
          goto _L3
_L2:
        iterator = Path.getPaths(this, "/moov[0]/trak/tkhd").iterator();
_L6:
        i = j;
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        Box box = (Box)iterator.next();
        if (((TrackHeaderBox)box).getTrackId() == ((TrackFragmentHeaderBox)getParent().getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentHeaderBox).get(0)).getTrackId())
        {
            AbstractTrackEncryptionBox abstracttrackencryptionbox1 = (AbstractTrackEncryptionBox)Path.getPath(box, "../mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
            AbstractTrackEncryptionBox abstracttrackencryptionbox = abstracttrackencryptionbox1;
            if (abstracttrackencryptionbox1 == null)
            {
                abstracttrackencryptionbox = (AbstractTrackEncryptionBox)Path.getPath(box, "../mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/uuid[0]");
            }
            j = abstracttrackencryptionbox.getDefaultIvSize();
        }
          goto _L6
_L3:
        Entry entry;
        Iterator iterator;
        if (l <= 0L)
        {
            return;
        }
        entry = new Entry();
        if (i < 0)
        {
            j = 8;
        } else
        {
            j = i;
        }
        entry.iv = new byte[j];
        bytebuffer.get(entry.iv);
        if ((getFlags() & 2) <= 0) goto _L8; else goto _L7
_L7:
        j = IsoTypeReader.readUInt16(bytebuffer);
        entry.pairs = new LinkedList();
_L9:
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_275;
        }
_L8:
        entries.add(entry);
        l--;
          goto _L3
        entry.pairs.add(entry.createPair(IsoTypeReader.readUInt16(bytebuffer), IsoTypeReader.readUInt32(bytebuffer)));
        j--;
          goto _L9
    }

    public Entry createEntry()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_10, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return new Entry();
    }

    public boolean equals(Object obj)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_11, this, this, obj);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AbstractSampleEncryptionBox)obj;
            if (algorithmId != ((AbstractSampleEncryptionBox) (obj)).algorithmId)
            {
                return false;
            }
            if (ivSize != ((AbstractSampleEncryptionBox) (obj)).ivSize)
            {
                return false;
            }
            if (entries == null ? ((AbstractSampleEncryptionBox) (obj)).entries != null : !entries.equals(((AbstractSampleEncryptionBox) (obj)).entries))
            {
                return false;
            }
            if (!Arrays.equals(kid, ((AbstractSampleEncryptionBox) (obj)).kid))
            {
                return false;
            }
        }
        return true;
    }

    public int getAlgorithmId()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return algorithmId;
    }

    public void getBox(WritableByteChannel writablebytechannel)
        throws IOException
    {
        super.getBox(writablebytechannel);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        if (isOverrideTrackEncryptionBoxParameters())
        {
            IsoTypeWriter.writeUInt24(bytebuffer, algorithmId);
            IsoTypeWriter.writeUInt8(bytebuffer, ivSize);
            bytebuffer.put(kid);
        }
        IsoTypeWriter.writeUInt32(bytebuffer, entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                Object obj = (Entry)iterator.next();
                Entry.Pair pair;
                if (isOverrideTrackEncryptionBoxParameters())
                {
                    byte abyte0[] = new byte[ivSize];
                    System.arraycopy(((Entry) (obj)).iv, 0, abyte0, ivSize - ((Entry) (obj)).iv.length, ((Entry) (obj)).iv.length);
                    bytebuffer.put(abyte0);
                } else
                {
                    bytebuffer.put(((Entry) (obj)).iv);
                }
            } while (!isSubSampleEncryption());
            IsoTypeWriter.writeUInt16(bytebuffer, ((Entry) (obj)).pairs.size());
            obj = ((Entry) (obj)).pairs.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                pair = (Entry.Pair)((Iterator) (obj)).next();
                IsoTypeWriter.writeUInt16(bytebuffer, pair.clear);
                IsoTypeWriter.writeUInt32(bytebuffer, pair.encrypted);
            }
        } while (true);
    }

    protected long getContentSize()
    {
        long l = 4L;
        if (isOverrideTrackEncryptionBoxParameters())
        {
            l = 4L + 4L + (long)kid.length;
        }
        l += 4L;
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return l;
            }
            l += ((Entry)iterator.next()).getSize();
        } while (true);
    }

    public List getEntries()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return entries;
    }

    public List getEntrySizes()
    {
        Object obj = Factory.makeJP(ajc$tjp_13, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new ArrayList(entries.size());
        Iterator iterator = entries.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return ((List) (obj));
            }
            Entry entry = (Entry)iterator.next();
            short word1 = (short)entry.iv.length;
            short word0 = word1;
            if (isSubSampleEncryption())
            {
                short word2 = (short)(word1 + 2);
                word0 = (short)(entry.pairs.size() * 6 + word2);
            }
            ((List) (obj)).add(Short.valueOf(word0));
        } while (true);
    }

    public int getIvSize()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return ivSize;
    }

    public byte[] getKid()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_8, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return kid;
    }

    public int getOffsetToFirstIV()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        byte byte0;
        byte byte1;
        if (getSize() > 0x100000000L)
        {
            byte0 = 16;
        } else
        {
            byte0 = 8;
        }
        if (isOverrideTrackEncryptionBoxParameters())
        {
            byte1 = 20;
        } else
        {
            byte1 = 0;
        }
        return byte0 + byte1 + 4;
    }

    public int getSampleCount()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return entries.size();
    }

    public int hashCode()
    {
        int j = 0;
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_12, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        int k = algorithmId;
        int l = ivSize;
        int i;
        if (kid != null)
        {
            i = Arrays.hashCode(kid);
        } else
        {
            i = 0;
        }
        if (entries != null)
        {
            j = entries.hashCode();
        }
        return ((k * 31 + l) * 31 + i) * 31 + j;
    }

    public boolean isOverrideTrackEncryptionBoxParameters()
    {
        return (getFlags() & 1) > 0;
    }

    public boolean isSubSampleEncryption()
    {
        return (getFlags() & 2) > 0;
    }

    public void setAlgorithmId(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        algorithmId = i;
    }

    public void setEntries(List list)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, list);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        entries = list;
    }

    public void setIvSize(int i)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i));
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        ivSize = i;
    }

    public void setKid(byte abyte0[])
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_9, this, this, abyte0);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        kid = abyte0;
    }

    public void setOverrideTrackEncryptionBoxParameters(boolean flag)
    {
        if (flag)
        {
            setFlags(getFlags() | 1);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffffe);
            return;
        }
    }

    public void setSubSampleEncryption(boolean flag)
    {
        if (flag)
        {
            setFlags(getFlags() | 2);
            return;
        } else
        {
            setFlags(getFlags() & 0xfffffd);
            return;
        }
    }

    static 
    {
        ajc$preClinit();
    }
}
