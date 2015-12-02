// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EC3TrackImpl extends AbstractTrack
{
    public static class BitStreamInfo extends com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry
    {

        public int bitrate;
        public int chanmap;
        public int frameSize;
        public int samplerate;
        public int strmtyp;
        public int substreamid;

        public String toString()
        {
            return (new StringBuilder("BitStreamInfo{frameSize=")).append(frameSize).append(", substreamid=").append(substreamid).append(", bitrate=").append(bitrate).append(", samplerate=").append(samplerate).append(", strmtyp=").append(strmtyp).append(", chanmap=").append(chanmap).append('}').toString();
        }

        public BitStreamInfo()
        {
        }
    }


    static final boolean $assertionsDisabled;
    int bitrate;
    List entries;
    int frameSize;
    private BufferedInputStream inputStream;
    private String lang;
    SampleDescriptionBox sampleDescriptionBox;
    int samplerate;
    private List samples;
    List stts;
    TrackMetaData trackMetaData;

    public EC3TrackImpl(InputStream inputstream)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        entries = new LinkedList();
        stts = new LinkedList();
        lang = "und";
        parse(inputstream);
    }

    public EC3TrackImpl(InputStream inputstream, String s)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        entries = new LinkedList();
        stts = new LinkedList();
        lang = "und";
        lang = s;
        parse(inputstream);
    }

    private void parse(InputStream inputstream)
        throws IOException
    {
        inputStream = new BufferedInputStream(inputstream);
        boolean flag = false;
        inputStream.mark(10000);
        do
        {
label0:
            {
                if (flag)
                {
                    inputStream.reset();
                    if (entries.size() == 0)
                    {
                        throw new IOException();
                    }
                    break label0;
                }
                inputstream = readVariables();
                if (inputstream == null)
                {
                    throw new IOException();
                }
                Iterator iterator = entries.iterator();
                boolean flag1 = flag;
                do
                {
label1:
                    {
                        if (iterator.hasNext())
                        {
                            break label1;
                        }
                        flag = flag1;
                        if (!flag1)
                        {
                            entries.add(inputstream);
                            long l = inputStream.skip(((BitStreamInfo) (inputstream)).frameSize);
                            flag = flag1;
                            if (!$assertionsDisabled)
                            {
                                flag = flag1;
                                if (l != (long)((BitStreamInfo) (inputstream)).frameSize)
                                {
                                    throw new AssertionError();
                                }
                            }
                        }
                    }
                    if (true)
                    {
                        break;
                    }
                    BitStreamInfo bitstreaminfo = (BitStreamInfo)iterator.next();
                    if (((BitStreamInfo) (inputstream)).strmtyp != 1 && bitstreaminfo.substreamid == ((BitStreamInfo) (inputstream)).substreamid)
                    {
                        flag1 = true;
                    }
                } while (true);
            }
        } while (true);
        EC3SpecificBox ec3specificbox;
        int ai[];
        int ai1[];
        Iterator iterator1;
        samplerate = ((BitStreamInfo)entries.get(0)).samplerate;
        sampleDescriptionBox = new SampleDescriptionBox();
        inputstream = new AudioSampleEntry("ec-3");
        inputstream.setChannelCount(2);
        inputstream.setSampleRate(samplerate);
        inputstream.setDataReferenceIndex(1);
        inputstream.setSampleSize(16);
        ec3specificbox = new EC3SpecificBox();
        ai = new int[entries.size()];
        ai1 = new int[entries.size()];
        iterator1 = entries.iterator();
_L3:
        if (iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        iterator1 = entries.iterator();
_L4:
        if (!iterator1.hasNext())
        {
            ec3specificbox.setDataRate(bitrate / 1000);
            inputstream.addBox(ec3specificbox);
            sampleDescriptionBox.addBox(inputstream);
            trackMetaData.setCreationTime(new Date());
            trackMetaData.setModificationTime(new Date());
            trackMetaData.setLanguage(lang);
            trackMetaData.setTimescale(samplerate);
            trackMetaData.setVolume(1.0F);
            samples = new LinkedList();
            BitStreamInfo bitstreaminfo1;
            com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry entry;
            int i;
            if (!readSamples())
            {
                throw new IOException();
            } else
            {
                return;
            }
        }
        break MISSING_BLOCK_LABEL_523;
_L2:
        bitstreaminfo1 = (BitStreamInfo)iterator1.next();
        if (bitstreaminfo1.strmtyp == 1)
        {
            i = bitstreaminfo1.substreamid;
            ai[i] = ai[i] + 1;
            ai1[bitstreaminfo1.substreamid] = bitstreaminfo1.chanmap >> 6 & 0x100 | bitstreaminfo1.chanmap >> 5 & 0xff;
        }
          goto _L3
        bitstreaminfo1 = (BitStreamInfo)iterator1.next();
        if (bitstreaminfo1.strmtyp != 1)
        {
            entry = new com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry();
            entry.fscod = bitstreaminfo1.fscod;
            entry.bsid = bitstreaminfo1.bsid;
            entry.bsmod = bitstreaminfo1.bsmod;
            entry.acmod = bitstreaminfo1.acmod;
            entry.lfeon = bitstreaminfo1.lfeon;
            entry.reserved = 0;
            entry.num_dep_sub = ai[bitstreaminfo1.substreamid];
            entry.chan_loc = ai1[bitstreaminfo1.substreamid];
            entry.reserved2 = 0;
            ec3specificbox.addEntry(entry);
        }
        bitrate = bitrate + bitstreaminfo1.bitrate;
        frameSize = frameSize + bitstreaminfo1.frameSize;
          goto _L4
    }

    private boolean readSamples()
        throws IOException
    {
        int i = frameSize;
        boolean flag = false;
        do
        {
            byte abyte0[];
            int j;
            boolean flag1;
            do
            {
                if (frameSize != i)
                {
                    return flag;
                }
                flag1 = true;
                abyte0 = new byte[frameSize];
                j = inputStream.read(abyte0);
                i = j;
                flag = flag1;
            } while (j != frameSize);
            samples.add(new SampleImpl(ByteBuffer.wrap(abyte0)));
            stts.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, 1536L));
            i = j;
            flag = flag1;
        } while (true);
    }

    private BitStreamInfo readVariables()
        throws IOException
    {
        BitReaderBuffer bitreaderbuffer;
        BitStreamInfo bitstreaminfo;
        int i;
        int j;
        int i1;
        byte abyte0[] = new byte[200];
        inputStream.mark(200);
        if (200 != inputStream.read(abyte0, 0, 200))
        {
            return null;
        }
        inputStream.reset();
        bitreaderbuffer = new BitReaderBuffer(ByteBuffer.wrap(abyte0));
        if (bitreaderbuffer.readBits(16) != 2935)
        {
            return null;
        }
        bitstreaminfo = new BitStreamInfo();
        bitstreaminfo.strmtyp = bitreaderbuffer.readBits(2);
        bitstreaminfo.substreamid = bitreaderbuffer.readBits(3);
        bitstreaminfo.frameSize = (bitreaderbuffer.readBits(11) + 1) * 2;
        bitstreaminfo.fscod = bitreaderbuffer.readBits(2);
        j = -1;
        int k;
        if (bitstreaminfo.fscod == 3)
        {
            j = bitreaderbuffer.readBits(2);
            k = 3;
        } else
        {
            k = bitreaderbuffer.readBits(2);
        }
        i = 0;
        k;
        JVM INSTR tableswitch 0 3: default 172
    //                   0 607
    //                   1 612
    //                   2 617
    //                   3 622;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        bitstreaminfo.frameSize = bitstreaminfo.frameSize * (6 / i);
        bitstreaminfo.acmod = bitreaderbuffer.readBits(3);
        bitstreaminfo.lfeon = bitreaderbuffer.readBits(1);
        bitstreaminfo.bsid = bitreaderbuffer.readBits(5);
        bitreaderbuffer.readBits(5);
        if (1 == bitreaderbuffer.readBits(1))
        {
            bitreaderbuffer.readBits(8);
        }
        if (bitstreaminfo.acmod == 0)
        {
            bitreaderbuffer.readBits(5);
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(8);
            }
        }
        if (1 == bitstreaminfo.strmtyp && 1 == bitreaderbuffer.readBits(1))
        {
            bitstreaminfo.chanmap = bitreaderbuffer.readBits(16);
        }
        if (1 != bitreaderbuffer.readBits(1)) goto _L7; else goto _L6
_L6:
        if (bitstreaminfo.acmod > 2)
        {
            bitreaderbuffer.readBits(2);
        }
        if (1 == (bitstreaminfo.acmod & 1) && bitstreaminfo.acmod > 2)
        {
            bitreaderbuffer.readBits(3);
            bitreaderbuffer.readBits(3);
        }
        if ((bitstreaminfo.acmod & 4) > 0)
        {
            bitreaderbuffer.readBits(3);
            bitreaderbuffer.readBits(3);
        }
        if (1 == bitstreaminfo.lfeon && 1 == bitreaderbuffer.readBits(1))
        {
            bitreaderbuffer.readBits(5);
        }
        if (bitstreaminfo.strmtyp != 0) goto _L7; else goto _L8
_L8:
        if (1 == bitreaderbuffer.readBits(1))
        {
            bitreaderbuffer.readBits(6);
        }
        if (bitstreaminfo.acmod == 0 && 1 == bitreaderbuffer.readBits(1))
        {
            bitreaderbuffer.readBits(6);
        }
        if (1 == bitreaderbuffer.readBits(1))
        {
            bitreaderbuffer.readBits(6);
        }
        i1 = bitreaderbuffer.readBits(2);
        if (1 != i1) goto _L10; else goto _L9
_L9:
        bitreaderbuffer.readBits(5);
_L18:
        if (bitstreaminfo.acmod < 2)
        {
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(14);
            }
            if (bitstreaminfo.acmod == 0 && 1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(14);
            }
            int j1;
            if (1 == bitreaderbuffer.readBits(1))
            {
                if (k == 0)
                {
                    bitreaderbuffer.readBits(5);
                } else
                {
                    int l = 0;
                    while (l < i) 
                    {
                        if (1 == bitreaderbuffer.readBits(1))
                        {
                            bitreaderbuffer.readBits(5);
                        }
                        l++;
                    }
                }
            }
        }
_L7:
        if (1 == bitreaderbuffer.readBits(1))
        {
            bitstreaminfo.bsmod = bitreaderbuffer.readBits(3);
        }
        bitstreaminfo.fscod;
        JVM INSTR tableswitch 0 3: default 588
    //                   0 932
    //                   1 942
    //                   2 952
    //                   3 962;
           goto _L11 _L12 _L13 _L14 _L15
_L11:
        if (bitstreaminfo.samplerate == 0)
        {
            return null;
        } else
        {
            bitstreaminfo.bitrate = (int)(((double)bitstreaminfo.samplerate / 1536D) * (double)bitstreaminfo.frameSize * 8D);
            return bitstreaminfo;
        }
_L2:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 2;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 3;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 6;
        continue; /* Loop/switch isn't completed */
_L10:
        if (2 != i1) goto _L17; else goto _L16
_L16:
        bitreaderbuffer.readBits(12);
          goto _L18
_L17:
        if (3 != i1) goto _L18; else goto _L19
_L19:
        j1 = bitreaderbuffer.readBits(5);
        if (1 == bitreaderbuffer.readBits(1))
        {
            bitreaderbuffer.readBits(5);
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(4);
            }
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(4);
            }
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(4);
            }
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(4);
            }
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(4);
            }
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(4);
            }
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(4);
            }
            if (1 == bitreaderbuffer.readBits(1))
            {
                if (1 == bitreaderbuffer.readBits(1))
                {
                    bitreaderbuffer.readBits(4);
                }
                if (1 == bitreaderbuffer.readBits(1))
                {
                    bitreaderbuffer.readBits(4);
                }
            }
        }
        if (1 == bitreaderbuffer.readBits(1))
        {
            bitreaderbuffer.readBits(5);
            if (1 == bitreaderbuffer.readBits(1))
            {
                bitreaderbuffer.readBits(7);
                if (1 == bitreaderbuffer.readBits(1))
                {
                    bitreaderbuffer.readBits(8);
                }
            }
        }
        i1 = 0;
_L20:
label0:
        {
            if (i1 < j1 + 2)
            {
                break label0;
            }
            bitreaderbuffer.byteSync();
        }
          goto _L18
        bitreaderbuffer.readBits(8);
        i1++;
          goto _L20
_L12:
        bitstreaminfo.samplerate = 48000;
          goto _L11
_L13:
        bitstreaminfo.samplerate = 44100;
          goto _L11
_L14:
        bitstreaminfo.samplerate = 32000;
          goto _L11
_L15:
        switch (j)
        {
        case 0: // '\0'
            bitstreaminfo.samplerate = 24000;
            break;

        case 1: // '\001'
            bitstreaminfo.samplerate = 22050;
            break;

        case 2: // '\002'
            bitstreaminfo.samplerate = 16000;
            break;

        case 3: // '\003'
            bitstreaminfo.samplerate = 0;
            break;
        }
        if (true) goto _L11; else goto _L21
_L21:
        if (true) goto _L1; else goto _L22
_L22:
    }

    public List getCompositionTimeEntries()
    {
        return null;
    }

    public List getDecodingTimeEntries()
    {
        return stts;
    }

    public String getHandler()
    {
        return "soun";
    }

    public AbstractMediaHeaderBox getMediaHeaderBox()
    {
        return new SoundMediaHeaderBox();
    }

    public volatile Box getMediaHeaderBox()
    {
        return getMediaHeaderBox();
    }

    public List getSampleDependencies()
    {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return sampleDescriptionBox;
    }

    public List getSamples()
    {
        return samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return null;
    }

    public long[] getSyncSamples()
    {
        return null;
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }

    public String toString()
    {
        return (new StringBuilder("EC3TrackImpl{bitrate=")).append(bitrate).append(", samplerate=").append(samplerate).append(", entries=").append(entries).append('}').toString();
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/tracks/EC3TrackImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
