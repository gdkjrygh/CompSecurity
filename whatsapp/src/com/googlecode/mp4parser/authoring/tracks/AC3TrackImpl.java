// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AC3TrackImpl extends AbstractTrack
{

    int acmod;
    int bitRateAndFrameSizeTable[][][][];
    int bitrate;
    int bsid;
    int bsmod;
    int channelCount;
    int frameSize;
    int frmsizecod;
    int fscod;
    private InputStream inputStream;
    private String lang;
    int lfeon;
    boolean readSamples;
    SampleDescriptionBox sampleDescriptionBox;
    int samplerate;
    private List samples;
    List stts;
    TrackMetaData trackMetaData;

    public AC3TrackImpl(InputStream inputstream)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        readSamples = false;
        lang = "und";
        parse(inputstream);
    }

    public AC3TrackImpl(InputStream inputstream, String s)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        readSamples = false;
        lang = "und";
        lang = s;
        parse(inputstream);
    }

    private boolean calcBitrateAndFrameSize(int i)
    {
        int j = i >>> 1;
        i &= 1;
        if (j > 18 || i > 1 || fscod > 2)
        {
            return false;
        } else
        {
            bitrate = bitRateAndFrameSizeTable[j][i][fscod][0];
            frameSize = bitRateAndFrameSizeTable[j][i][fscod][1] * 2;
            return true;
        }
    }

    private void initBitRateAndFrameSizeTable()
    {
        bitRateAndFrameSizeTable[0][0][0][0] = 32;
        bitRateAndFrameSizeTable[0][1][0][0] = 32;
        bitRateAndFrameSizeTable[0][0][0][1] = 64;
        bitRateAndFrameSizeTable[0][1][0][1] = 64;
        bitRateAndFrameSizeTable[1][0][0][0] = 40;
        bitRateAndFrameSizeTable[1][1][0][0] = 40;
        bitRateAndFrameSizeTable[1][0][0][1] = 80;
        bitRateAndFrameSizeTable[1][1][0][1] = 80;
        bitRateAndFrameSizeTable[2][0][0][0] = 48;
        bitRateAndFrameSizeTable[2][1][0][0] = 48;
        bitRateAndFrameSizeTable[2][0][0][1] = 96;
        bitRateAndFrameSizeTable[2][1][0][1] = 96;
        bitRateAndFrameSizeTable[3][0][0][0] = 56;
        bitRateAndFrameSizeTable[3][1][0][0] = 56;
        bitRateAndFrameSizeTable[3][0][0][1] = 112;
        bitRateAndFrameSizeTable[3][1][0][1] = 112;
        bitRateAndFrameSizeTable[4][0][0][0] = 64;
        bitRateAndFrameSizeTable[4][1][0][0] = 64;
        bitRateAndFrameSizeTable[4][0][0][1] = 128;
        bitRateAndFrameSizeTable[4][1][0][1] = 128;
        bitRateAndFrameSizeTable[5][0][0][0] = 80;
        bitRateAndFrameSizeTable[5][1][0][0] = 80;
        bitRateAndFrameSizeTable[5][0][0][1] = 160;
        bitRateAndFrameSizeTable[5][1][0][1] = 160;
        bitRateAndFrameSizeTable[6][0][0][0] = 96;
        bitRateAndFrameSizeTable[6][1][0][0] = 96;
        bitRateAndFrameSizeTable[6][0][0][1] = 192;
        bitRateAndFrameSizeTable[6][1][0][1] = 192;
        bitRateAndFrameSizeTable[7][0][0][0] = 112;
        bitRateAndFrameSizeTable[7][1][0][0] = 112;
        bitRateAndFrameSizeTable[7][0][0][1] = 224;
        bitRateAndFrameSizeTable[7][1][0][1] = 224;
        bitRateAndFrameSizeTable[8][0][0][0] = 128;
        bitRateAndFrameSizeTable[8][1][0][0] = 128;
        bitRateAndFrameSizeTable[8][0][0][1] = 256;
        bitRateAndFrameSizeTable[8][1][0][1] = 256;
        bitRateAndFrameSizeTable[9][0][0][0] = 160;
        bitRateAndFrameSizeTable[9][1][0][0] = 160;
        bitRateAndFrameSizeTable[9][0][0][1] = 320;
        bitRateAndFrameSizeTable[9][1][0][1] = 320;
        bitRateAndFrameSizeTable[10][0][0][0] = 192;
        bitRateAndFrameSizeTable[10][1][0][0] = 192;
        bitRateAndFrameSizeTable[10][0][0][1] = 384;
        bitRateAndFrameSizeTable[10][1][0][1] = 384;
        bitRateAndFrameSizeTable[11][0][0][0] = 224;
        bitRateAndFrameSizeTable[11][1][0][0] = 224;
        bitRateAndFrameSizeTable[11][0][0][1] = 448;
        bitRateAndFrameSizeTable[11][1][0][1] = 448;
        bitRateAndFrameSizeTable[12][0][0][0] = 256;
        bitRateAndFrameSizeTable[12][1][0][0] = 256;
        bitRateAndFrameSizeTable[12][0][0][1] = 512;
        bitRateAndFrameSizeTable[12][1][0][1] = 512;
        bitRateAndFrameSizeTable[13][0][0][0] = 320;
        bitRateAndFrameSizeTable[13][1][0][0] = 320;
        bitRateAndFrameSizeTable[13][0][0][1] = 640;
        bitRateAndFrameSizeTable[13][1][0][1] = 640;
        bitRateAndFrameSizeTable[14][0][0][0] = 384;
        bitRateAndFrameSizeTable[14][1][0][0] = 384;
        bitRateAndFrameSizeTable[14][0][0][1] = 768;
        bitRateAndFrameSizeTable[14][1][0][1] = 768;
        bitRateAndFrameSizeTable[15][0][0][0] = 448;
        bitRateAndFrameSizeTable[15][1][0][0] = 448;
        bitRateAndFrameSizeTable[15][0][0][1] = 896;
        bitRateAndFrameSizeTable[15][1][0][1] = 896;
        bitRateAndFrameSizeTable[16][0][0][0] = 512;
        bitRateAndFrameSizeTable[16][1][0][0] = 512;
        bitRateAndFrameSizeTable[16][0][0][1] = 1024;
        bitRateAndFrameSizeTable[16][1][0][1] = 1024;
        bitRateAndFrameSizeTable[17][0][0][0] = 576;
        bitRateAndFrameSizeTable[17][1][0][0] = 576;
        bitRateAndFrameSizeTable[17][0][0][1] = 1152;
        bitRateAndFrameSizeTable[17][1][0][1] = 1152;
        bitRateAndFrameSizeTable[18][0][0][0] = 640;
        bitRateAndFrameSizeTable[18][1][0][0] = 640;
        bitRateAndFrameSizeTable[18][0][0][1] = 1280;
        bitRateAndFrameSizeTable[18][1][0][1] = 1280;
        bitRateAndFrameSizeTable[0][0][1][0] = 32;
        bitRateAndFrameSizeTable[0][1][1][0] = 32;
        bitRateAndFrameSizeTable[0][0][1][1] = 69;
        bitRateAndFrameSizeTable[0][1][1][1] = 70;
        bitRateAndFrameSizeTable[1][0][1][0] = 40;
        bitRateAndFrameSizeTable[1][1][1][0] = 40;
        bitRateAndFrameSizeTable[1][0][1][1] = 87;
        bitRateAndFrameSizeTable[1][1][1][1] = 88;
        bitRateAndFrameSizeTable[2][0][1][0] = 48;
        bitRateAndFrameSizeTable[2][1][1][0] = 48;
        bitRateAndFrameSizeTable[2][0][1][1] = 104;
        bitRateAndFrameSizeTable[2][1][1][1] = 105;
        bitRateAndFrameSizeTable[3][0][1][0] = 56;
        bitRateAndFrameSizeTable[3][1][1][0] = 56;
        bitRateAndFrameSizeTable[3][0][1][1] = 121;
        bitRateAndFrameSizeTable[3][1][1][1] = 122;
        bitRateAndFrameSizeTable[4][0][1][0] = 64;
        bitRateAndFrameSizeTable[4][1][1][0] = 64;
        bitRateAndFrameSizeTable[4][0][1][1] = 139;
        bitRateAndFrameSizeTable[4][1][1][1] = 140;
        bitRateAndFrameSizeTable[5][0][1][0] = 80;
        bitRateAndFrameSizeTable[5][1][1][0] = 80;
        bitRateAndFrameSizeTable[5][0][1][1] = 174;
        bitRateAndFrameSizeTable[5][1][1][1] = 175;
        bitRateAndFrameSizeTable[6][0][1][0] = 96;
        bitRateAndFrameSizeTable[6][1][1][0] = 96;
        bitRateAndFrameSizeTable[6][0][1][1] = 208;
        bitRateAndFrameSizeTable[6][1][1][1] = 209;
        bitRateAndFrameSizeTable[7][0][1][0] = 112;
        bitRateAndFrameSizeTable[7][1][1][0] = 112;
        bitRateAndFrameSizeTable[7][0][1][1] = 243;
        bitRateAndFrameSizeTable[7][1][1][1] = 244;
        bitRateAndFrameSizeTable[8][0][1][0] = 128;
        bitRateAndFrameSizeTable[8][1][1][0] = 128;
        bitRateAndFrameSizeTable[8][0][1][1] = 278;
        bitRateAndFrameSizeTable[8][1][1][1] = 279;
        bitRateAndFrameSizeTable[9][0][1][0] = 160;
        bitRateAndFrameSizeTable[9][1][1][0] = 160;
        bitRateAndFrameSizeTable[9][0][1][1] = 348;
        bitRateAndFrameSizeTable[9][1][1][1] = 349;
        bitRateAndFrameSizeTable[10][0][1][0] = 192;
        bitRateAndFrameSizeTable[10][1][1][0] = 192;
        bitRateAndFrameSizeTable[10][0][1][1] = 417;
        bitRateAndFrameSizeTable[10][1][1][1] = 418;
        bitRateAndFrameSizeTable[11][0][1][0] = 224;
        bitRateAndFrameSizeTable[11][1][1][0] = 224;
        bitRateAndFrameSizeTable[11][0][1][1] = 487;
        bitRateAndFrameSizeTable[11][1][1][1] = 488;
        bitRateAndFrameSizeTable[12][0][1][0] = 256;
        bitRateAndFrameSizeTable[12][1][1][0] = 256;
        bitRateAndFrameSizeTable[12][0][1][1] = 557;
        bitRateAndFrameSizeTable[12][1][1][1] = 558;
        bitRateAndFrameSizeTable[13][0][1][0] = 320;
        bitRateAndFrameSizeTable[13][1][1][0] = 320;
        bitRateAndFrameSizeTable[13][0][1][1] = 696;
        bitRateAndFrameSizeTable[13][1][1][1] = 697;
        bitRateAndFrameSizeTable[14][0][1][0] = 384;
        bitRateAndFrameSizeTable[14][1][1][0] = 384;
        bitRateAndFrameSizeTable[14][0][1][1] = 835;
        bitRateAndFrameSizeTable[14][1][1][1] = 836;
        bitRateAndFrameSizeTable[15][0][1][0] = 448;
        bitRateAndFrameSizeTable[15][1][1][0] = 448;
        bitRateAndFrameSizeTable[15][0][1][1] = 975;
        bitRateAndFrameSizeTable[15][1][1][1] = 975;
        bitRateAndFrameSizeTable[16][0][1][0] = 512;
        bitRateAndFrameSizeTable[16][1][1][0] = 512;
        bitRateAndFrameSizeTable[16][0][1][1] = 1114;
        bitRateAndFrameSizeTable[16][1][1][1] = 1115;
        bitRateAndFrameSizeTable[17][0][1][0] = 576;
        bitRateAndFrameSizeTable[17][1][1][0] = 576;
        bitRateAndFrameSizeTable[17][0][1][1] = 1253;
        bitRateAndFrameSizeTable[17][1][1][1] = 1254;
        bitRateAndFrameSizeTable[18][0][1][0] = 640;
        bitRateAndFrameSizeTable[18][1][1][0] = 640;
        bitRateAndFrameSizeTable[18][0][1][1] = 1393;
        bitRateAndFrameSizeTable[18][1][1][1] = 1394;
        bitRateAndFrameSizeTable[0][0][2][0] = 32;
        bitRateAndFrameSizeTable[0][1][2][0] = 32;
        bitRateAndFrameSizeTable[0][0][2][1] = 96;
        bitRateAndFrameSizeTable[0][1][2][1] = 96;
        bitRateAndFrameSizeTable[1][0][2][0] = 40;
        bitRateAndFrameSizeTable[1][1][2][0] = 40;
        bitRateAndFrameSizeTable[1][0][2][1] = 120;
        bitRateAndFrameSizeTable[1][1][2][1] = 120;
        bitRateAndFrameSizeTable[2][0][2][0] = 48;
        bitRateAndFrameSizeTable[2][1][2][0] = 48;
        bitRateAndFrameSizeTable[2][0][2][1] = 144;
        bitRateAndFrameSizeTable[2][1][2][1] = 144;
        bitRateAndFrameSizeTable[3][0][2][0] = 56;
        bitRateAndFrameSizeTable[3][1][2][0] = 56;
        bitRateAndFrameSizeTable[3][0][2][1] = 168;
        bitRateAndFrameSizeTable[3][1][2][1] = 168;
        bitRateAndFrameSizeTable[4][0][2][0] = 64;
        bitRateAndFrameSizeTable[4][1][2][0] = 64;
        bitRateAndFrameSizeTable[4][0][2][1] = 192;
        bitRateAndFrameSizeTable[4][1][2][1] = 192;
        bitRateAndFrameSizeTable[5][0][2][0] = 80;
        bitRateAndFrameSizeTable[5][1][2][0] = 80;
        bitRateAndFrameSizeTable[5][0][2][1] = 240;
        bitRateAndFrameSizeTable[5][1][2][1] = 240;
        bitRateAndFrameSizeTable[6][0][2][0] = 96;
        bitRateAndFrameSizeTable[6][1][2][0] = 96;
        bitRateAndFrameSizeTable[6][0][2][1] = 288;
        bitRateAndFrameSizeTable[6][1][2][1] = 288;
        bitRateAndFrameSizeTable[7][0][2][0] = 112;
        bitRateAndFrameSizeTable[7][1][2][0] = 112;
        bitRateAndFrameSizeTable[7][0][2][1] = 336;
        bitRateAndFrameSizeTable[7][1][2][1] = 336;
        bitRateAndFrameSizeTable[8][0][2][0] = 128;
        bitRateAndFrameSizeTable[8][1][2][0] = 128;
        bitRateAndFrameSizeTable[8][0][2][1] = 384;
        bitRateAndFrameSizeTable[8][1][2][1] = 384;
        bitRateAndFrameSizeTable[9][0][2][0] = 160;
        bitRateAndFrameSizeTable[9][1][2][0] = 160;
        bitRateAndFrameSizeTable[9][0][2][1] = 480;
        bitRateAndFrameSizeTable[9][1][2][1] = 480;
        bitRateAndFrameSizeTable[10][0][2][0] = 192;
        bitRateAndFrameSizeTable[10][1][2][0] = 192;
        bitRateAndFrameSizeTable[10][0][2][1] = 576;
        bitRateAndFrameSizeTable[10][1][2][1] = 576;
        bitRateAndFrameSizeTable[11][0][2][0] = 224;
        bitRateAndFrameSizeTable[11][1][2][0] = 224;
        bitRateAndFrameSizeTable[11][0][2][1] = 672;
        bitRateAndFrameSizeTable[11][1][2][1] = 672;
        bitRateAndFrameSizeTable[12][0][2][0] = 256;
        bitRateAndFrameSizeTable[12][1][2][0] = 256;
        bitRateAndFrameSizeTable[12][0][2][1] = 768;
        bitRateAndFrameSizeTable[12][1][2][1] = 768;
        bitRateAndFrameSizeTable[13][0][2][0] = 320;
        bitRateAndFrameSizeTable[13][1][2][0] = 320;
        bitRateAndFrameSizeTable[13][0][2][1] = 960;
        bitRateAndFrameSizeTable[13][1][2][1] = 960;
        bitRateAndFrameSizeTable[14][0][2][0] = 384;
        bitRateAndFrameSizeTable[14][1][2][0] = 384;
        bitRateAndFrameSizeTable[14][0][2][1] = 1152;
        bitRateAndFrameSizeTable[14][1][2][1] = 1152;
        bitRateAndFrameSizeTable[15][0][2][0] = 448;
        bitRateAndFrameSizeTable[15][1][2][0] = 448;
        bitRateAndFrameSizeTable[15][0][2][1] = 1344;
        bitRateAndFrameSizeTable[15][1][2][1] = 1344;
        bitRateAndFrameSizeTable[16][0][2][0] = 512;
        bitRateAndFrameSizeTable[16][1][2][0] = 512;
        bitRateAndFrameSizeTable[16][0][2][1] = 1536;
        bitRateAndFrameSizeTable[16][1][2][1] = 1536;
        bitRateAndFrameSizeTable[17][0][2][0] = 576;
        bitRateAndFrameSizeTable[17][1][2][0] = 576;
        bitRateAndFrameSizeTable[17][0][2][1] = 1728;
        bitRateAndFrameSizeTable[17][1][2][1] = 1728;
        bitRateAndFrameSizeTable[18][0][2][0] = 640;
        bitRateAndFrameSizeTable[18][1][2][0] = 640;
        bitRateAndFrameSizeTable[18][0][2][1] = 1920;
        bitRateAndFrameSizeTable[18][1][2][1] = 1920;
    }

    private void parse(InputStream inputstream)
        throws IOException
    {
        inputStream = inputstream;
        bitRateAndFrameSizeTable = (int[][][][])Array.newInstance(Integer.TYPE, new int[] {
            19, 2, 3, 2
        });
        stts = new LinkedList();
        initBitRateAndFrameSizeTable();
        if (!readVariables())
        {
            throw new IOException();
        }
        sampleDescriptionBox = new SampleDescriptionBox();
        inputstream = new AudioSampleEntry("ac-3");
        inputstream.setChannelCount(2);
        inputstream.setSampleRate(samplerate);
        inputstream.setDataReferenceIndex(1);
        inputstream.setSampleSize(16);
        AC3SpecificBox ac3specificbox = new AC3SpecificBox();
        ac3specificbox.setAcmod(acmod);
        ac3specificbox.setBitRateCode(frmsizecod >> 1);
        ac3specificbox.setBsid(bsid);
        ac3specificbox.setBsmod(bsmod);
        ac3specificbox.setFscod(fscod);
        ac3specificbox.setLfeon(lfeon);
        ac3specificbox.setReserved(0);
        inputstream.addBox(ac3specificbox);
        sampleDescriptionBox.addBox(inputstream);
        trackMetaData.setCreationTime(new Date());
        trackMetaData.setModificationTime(new Date());
        trackMetaData.setLanguage(lang);
        trackMetaData.setTimescale(samplerate);
        trackMetaData.setVolume(1.0F);
        samples = new LinkedList();
        if (!readSamples())
        {
            throw new IOException();
        } else
        {
            return;
        }
    }

    private boolean readSamples()
        throws IOException
    {
        boolean flag = true;
        if (!readSamples)
        {
            readSamples = true;
            byte abyte0[] = new byte[5];
            flag = false;
            inputStream.mark(5);
            while (-1 != inputStream.read(abyte0)) 
            {
                flag = true;
                calcBitrateAndFrameSize(abyte0[4] & 0x3f);
                inputStream.reset();
                byte abyte1[] = new byte[frameSize];
                inputStream.read(abyte1);
                samples.add(new SampleImpl(ByteBuffer.wrap(abyte1)));
                stts.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, 1536L));
                inputStream.mark(5);
            }
        }
        return flag;
    }

    private boolean readVariables()
        throws IOException
    {
        byte abyte0[];
        abyte0 = new byte[100];
        inputStream.mark(100);
        if (100 == inputStream.read(abyte0, 0, 100)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        BitReaderBuffer bitreaderbuffer;
        inputStream.reset();
        bitreaderbuffer = new BitReaderBuffer(ByteBuffer.wrap(abyte0));
        if (bitreaderbuffer.readBits(16) != 2935) goto _L1; else goto _L3
_L3:
        bitreaderbuffer.readBits(16);
        fscod = bitreaderbuffer.readBits(2);
        fscod;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 325
    //                   1 334
    //                   2 343
    //                   3 353;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        if (samplerate == 0) goto _L1; else goto _L9
_L9:
        frmsizecod = bitreaderbuffer.readBits(6);
        if (!calcBitrateAndFrameSize(frmsizecod) || frameSize == 0) goto _L1; else goto _L10
_L10:
        bsid = bitreaderbuffer.readBits(5);
        bsmod = bitreaderbuffer.readBits(3);
        acmod = bitreaderbuffer.readBits(3);
        if (bsid == 9)
        {
            samplerate = samplerate / 2;
        } else
        if (bsid != 8 && bsid != 6)
        {
            return false;
        }
        if (acmod != 1 && (acmod & 1) == 1)
        {
            bitreaderbuffer.readBits(2);
        }
        if ((acmod & 4) != 0)
        {
            bitreaderbuffer.readBits(2);
        }
        if (acmod == 2)
        {
            bitreaderbuffer.readBits(2);
        }
        acmod;
        JVM INSTR tableswitch 0 7: default 296
    //                   0 381
    //                   1 389
    //                   2 397
    //                   3 405
    //                   4 413
    //                   5 421
    //                   6 429
    //                   7 437;
           goto _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L11:
        lfeon = bitreaderbuffer.readBits(1);
        if (lfeon == 1)
        {
            channelCount = channelCount + 1;
        }
        return true;
_L5:
        samplerate = 48000;
          goto _L4
_L6:
        samplerate = 44100;
          goto _L4
_L7:
        samplerate = 32000;
          goto _L4
_L8:
        samplerate = 0;
          goto _L4
_L12:
        channelCount = 2;
          goto _L11
_L13:
        channelCount = 1;
          goto _L11
_L14:
        channelCount = 2;
          goto _L11
_L15:
        channelCount = 3;
          goto _L11
_L16:
        channelCount = 3;
          goto _L11
_L17:
        channelCount = 4;
          goto _L11
_L18:
        channelCount = 4;
          goto _L11
_L19:
        channelCount = 5;
          goto _L11
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

    public Box getMediaHeaderBox()
    {
        return new SoundMediaHeaderBox();
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
}
