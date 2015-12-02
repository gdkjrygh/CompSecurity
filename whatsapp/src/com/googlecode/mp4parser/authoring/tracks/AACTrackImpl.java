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
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import com.googlecode.mp4parser.util.ChannelHelper;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AACTrackImpl extends AbstractTrack
{
    class AdtsHeader
    {

        int bufferFullness;
        int channelconfig;
        int copyrightStart;
        int copyrightedStream;
        int frameLength;
        int home;
        int layer;
        int mpegVersion;
        int numAacFramesPerAdtsFrame;
        int original;
        int profile;
        int protectionAbsent;
        int sampleFrequencyIndex;
        int sampleRate;
        final AACTrackImpl this$0;

        int getSize()
        {
            byte byte0;
            if (protectionAbsent == 0)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            return byte0 + 7;
        }

        AdtsHeader()
        {
            this$0 = AACTrackImpl.this;
            super();
        }
    }


    static Map audioObjectTypes;
    public static Map samplingFrequencyIndexMap;
    long avgBitRate;
    int bufferSizeDB;
    AdtsHeader firstHeader;
    private String lang;
    long maxBitRate;
    SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    List stts;
    TrackMetaData trackMetaData;

    public AACTrackImpl(ReadableByteChannel readablebytechannel)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        lang = "und";
        parse(readablebytechannel);
    }

    public AACTrackImpl(ReadableByteChannel readablebytechannel, String s)
        throws IOException
    {
        trackMetaData = new TrackMetaData();
        lang = "und";
        lang = s;
        parse(readablebytechannel);
    }

    private void parse(ReadableByteChannel readablebytechannel)
        throws IOException
    {
        double d;
        double d1;
        Object obj;
        long l;
        stts = new LinkedList();
        samples = new LinkedList();
        firstHeader = readSamples(readablebytechannel);
        d = (double)firstHeader.sampleRate / 1024D;
        d1 = (double)samples.size() / d;
        l = 0L;
        readablebytechannel = new LinkedList();
        obj = samples.iterator();
_L4:
        long l1;
        if (!((Iterator) (obj)).hasNext())
        {
            avgBitRate = (int)((double)(8L * l) / d1);
            bufferSizeDB = 1536;
            sampleDescriptionBox = new SampleDescriptionBox();
            readablebytechannel = new AudioSampleEntry("mp4a");
            readablebytechannel.setChannelCount(2);
            readablebytechannel.setSampleRate(firstHeader.sampleRate);
            readablebytechannel.setDataReferenceIndex(1);
            readablebytechannel.setSampleSize(16);
            obj = new ESDescriptorBox();
            ESDescriptor esdescriptor = new ESDescriptor();
            esdescriptor.setEsId(0);
            Object obj1 = new SLConfigDescriptor();
            ((SLConfigDescriptor) (obj1)).setPredefined(2);
            esdescriptor.setSlConfigDescriptor(((SLConfigDescriptor) (obj1)));
            obj1 = new DecoderConfigDescriptor();
            ((DecoderConfigDescriptor) (obj1)).setObjectTypeIndication(64);
            ((DecoderConfigDescriptor) (obj1)).setStreamType(5);
            ((DecoderConfigDescriptor) (obj1)).setBufferSizeDB(bufferSizeDB);
            ((DecoderConfigDescriptor) (obj1)).setMaxBitRate(maxBitRate);
            ((DecoderConfigDescriptor) (obj1)).setAvgBitRate(avgBitRate);
            AudioSpecificConfig audiospecificconfig = new AudioSpecificConfig();
            audiospecificconfig.setAudioObjectType(2);
            audiospecificconfig.setSamplingFrequencyIndex(firstHeader.sampleFrequencyIndex);
            audiospecificconfig.setChannelConfiguration(firstHeader.channelconfig);
            ((DecoderConfigDescriptor) (obj1)).setAudioSpecificInfo(audiospecificconfig);
            esdescriptor.setDecoderConfigDescriptor(((DecoderConfigDescriptor) (obj1)));
            ((ESDescriptorBox) (obj)).setData(esdescriptor.serialize());
            readablebytechannel.addBox(((Box) (obj)));
            sampleDescriptionBox.addBox(readablebytechannel);
            trackMetaData.setCreationTime(new Date());
            trackMetaData.setModificationTime(new Date());
            trackMetaData.setLanguage(lang);
            trackMetaData.setVolume(1.0F);
            trackMetaData.setTimescale(firstHeader.sampleRate);
            return;
        }
        int i = (int)((Sample)((Iterator) (obj)).next()).remaining();
        l1 = l + (long)i;
        readablebytechannel.add(Integer.valueOf(i));
_L5:
        if ((double)readablebytechannel.size() > d) goto _L2; else goto _L1
_L1:
        l = l1;
        if (readablebytechannel.size() != (int)d) goto _L4; else goto _L3
_L3:
        int j;
        j = 0;
_L6:
        Iterator iterator;
        for (iterator = readablebytechannel.iterator(); iterator.hasNext();)
        {
            break MISSING_BLOCK_LABEL_530;
        }

        double d2 = ((8D * (double)j) / (double)readablebytechannel.size()) * d;
        l = l1;
        if (d2 > (double)maxBitRate)
        {
            maxBitRate = (int)d2;
            l = l1;
        }
          goto _L4
_L2:
        readablebytechannel.pop();
          goto _L5
        j += ((Integer)iterator.next()).intValue();
          goto _L6
    }

    private AdtsHeader readADTSHeader(ReadableByteChannel readablebytechannel)
        throws IOException
    {
        AdtsHeader adtsheader;
        adtsheader = new AdtsHeader();
        ByteBuffer bytebuffer = ByteBuffer.allocate(7);
        try
        {
            ChannelHelper.readFully(readablebytechannel, bytebuffer);
            break MISSING_BLOCK_LABEL_20;
        }
        // Misplaced declaration of an exception variable
        catch (ReadableByteChannel readablebytechannel)
        {
            obj = null;
        }
_L2:
        return ((AdtsHeader) (obj));
        Object obj = new BitReaderBuffer((ByteBuffer)bytebuffer.rewind());
        if (((BitReaderBuffer) (obj)).readBits(12) != 4095)
        {
            throw new IOException("Expected Start Word 0xfff");
        }
        adtsheader.mpegVersion = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.layer = ((BitReaderBuffer) (obj)).readBits(2);
        adtsheader.protectionAbsent = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.profile = ((BitReaderBuffer) (obj)).readBits(2) + 1;
        adtsheader.sampleFrequencyIndex = ((BitReaderBuffer) (obj)).readBits(4);
        adtsheader.sampleRate = ((Integer)samplingFrequencyIndexMap.get(Integer.valueOf(adtsheader.sampleFrequencyIndex))).intValue();
        ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.channelconfig = ((BitReaderBuffer) (obj)).readBits(3);
        adtsheader.original = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.home = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.copyrightedStream = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.copyrightStart = ((BitReaderBuffer) (obj)).readBits(1);
        adtsheader.frameLength = ((BitReaderBuffer) (obj)).readBits(13);
        adtsheader.bufferFullness = ((BitReaderBuffer) (obj)).readBits(11);
        adtsheader.numAacFramesPerAdtsFrame = ((BitReaderBuffer) (obj)).readBits(2) + 1;
        if (adtsheader.numAacFramesPerAdtsFrame != 1)
        {
            throw new IOException("This muxer can only work with 1 AAC frame per ADTS frame");
        }
        obj = adtsheader;
        if (adtsheader.protectionAbsent == 0)
        {
            readablebytechannel.read(ByteBuffer.allocate(2));
            return adtsheader;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private AdtsHeader readSamples(ReadableByteChannel readablebytechannel)
        throws IOException
    {
        Object obj = null;
        do
        {
            AdtsHeader adtsheader1 = readADTSHeader(readablebytechannel);
            if (adtsheader1 == null)
            {
                return ((AdtsHeader) (obj));
            }
            AdtsHeader adtsheader = ((AdtsHeader) (obj));
            if (obj == null)
            {
                adtsheader = adtsheader1;
            }
            if (readablebytechannel instanceof FileChannel)
            {
                obj = ((FileChannel)readablebytechannel).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, ((FileChannel)readablebytechannel).position(), adtsheader1.frameLength - adtsheader1.getSize());
                samples.add(new SampleImpl(((ByteBuffer) (obj))));
                ((FileChannel)readablebytechannel).position((((FileChannel)readablebytechannel).position() + (long)adtsheader1.frameLength) - (long)adtsheader1.getSize());
                ((ByteBuffer) (obj)).rewind();
            } else
            {
                ByteBuffer bytebuffer = ByteBuffer.allocate(adtsheader1.frameLength - adtsheader1.getSize());
                readablebytechannel.read(bytebuffer);
                samples.add(new SampleImpl(bytebuffer));
                bytebuffer.rewind();
            }
            stts.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, 1024L));
            obj = adtsheader;
        } while (true);
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

    public String toString()
    {
        return (new StringBuilder("AACTrackImpl{sampleRate=")).append(firstHeader.sampleRate).append(", channelconfig=").append(firstHeader.channelconfig).append('}').toString();
    }

    static 
    {
        audioObjectTypes = new HashMap();
        audioObjectTypes.put(Integer.valueOf(1), "AAC Main");
        audioObjectTypes.put(Integer.valueOf(2), "AAC LC (Low Complexity)");
        audioObjectTypes.put(Integer.valueOf(3), "AAC SSR (Scalable Sample Rate)");
        audioObjectTypes.put(Integer.valueOf(4), "AAC LTP (Long Term Prediction)");
        audioObjectTypes.put(Integer.valueOf(5), "SBR (Spectral Band Replication)");
        audioObjectTypes.put(Integer.valueOf(6), "AAC Scalable");
        audioObjectTypes.put(Integer.valueOf(7), "TwinVQ");
        audioObjectTypes.put(Integer.valueOf(8), "CELP (Code Excited Linear Prediction)");
        audioObjectTypes.put(Integer.valueOf(9), "HXVC (Harmonic Vector eXcitation Coding)");
        audioObjectTypes.put(Integer.valueOf(10), "Reserved");
        audioObjectTypes.put(Integer.valueOf(11), "Reserved");
        audioObjectTypes.put(Integer.valueOf(12), "TTSI (Text-To-Speech Interface)");
        audioObjectTypes.put(Integer.valueOf(13), "Main Synthesis");
        audioObjectTypes.put(Integer.valueOf(14), "Wavetable Synthesis");
        audioObjectTypes.put(Integer.valueOf(15), "General MIDI");
        audioObjectTypes.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio Effects");
        audioObjectTypes.put(Integer.valueOf(17), "ER (Error Resilient) AAC LC");
        audioObjectTypes.put(Integer.valueOf(18), "Reserved");
        audioObjectTypes.put(Integer.valueOf(19), "ER AAC LTP");
        audioObjectTypes.put(Integer.valueOf(20), "ER AAC Scalable");
        audioObjectTypes.put(Integer.valueOf(21), "ER TwinVQ");
        audioObjectTypes.put(Integer.valueOf(22), "ER BSAC (Bit-Sliced Arithmetic Coding)");
        audioObjectTypes.put(Integer.valueOf(23), "ER AAC LD (Low Delay)");
        audioObjectTypes.put(Integer.valueOf(24), "ER CELP");
        audioObjectTypes.put(Integer.valueOf(25), "ER HVXC");
        audioObjectTypes.put(Integer.valueOf(26), "ER HILN (Harmonic and Individual Lines plus Noise)");
        audioObjectTypes.put(Integer.valueOf(27), "ER Parametric");
        audioObjectTypes.put(Integer.valueOf(28), "SSC (SinuSoidal Coding)");
        audioObjectTypes.put(Integer.valueOf(29), "PS (Parametric Stereo)");
        audioObjectTypes.put(Integer.valueOf(30), "MPEG Surround");
        audioObjectTypes.put(Integer.valueOf(31), "(Escape value)");
        audioObjectTypes.put(Integer.valueOf(32), "Layer-1");
        audioObjectTypes.put(Integer.valueOf(33), "Layer-2");
        audioObjectTypes.put(Integer.valueOf(34), "Layer-3");
        audioObjectTypes.put(Integer.valueOf(35), "DST (Direct Stream Transfer)");
        audioObjectTypes.put(Integer.valueOf(36), "ALS (Audio Lossless)");
        audioObjectTypes.put(Integer.valueOf(37), "SLS (Scalable LosslesS)");
        audioObjectTypes.put(Integer.valueOf(38), "SLS non-core");
        audioObjectTypes.put(Integer.valueOf(39), "ER AAC ELD (Enhanced Low Delay)");
        audioObjectTypes.put(Integer.valueOf(40), "SMR (Symbolic Music Representation) Simple");
        audioObjectTypes.put(Integer.valueOf(41), "SMR Main");
        audioObjectTypes.put(Integer.valueOf(42), "USAC (Unified Speech and Audio Coding) (no SBR)");
        audioObjectTypes.put(Integer.valueOf(43), "SAOC (Spatial Audio Object Coding)");
        audioObjectTypes.put(Integer.valueOf(44), "LD MPEG Surround");
        audioObjectTypes.put(Integer.valueOf(45), "USAC");
        samplingFrequencyIndexMap = new HashMap();
        samplingFrequencyIndexMap.put(Integer.valueOf(0x17700), Integer.valueOf(0));
        samplingFrequencyIndexMap.put(Integer.valueOf(0x15888), Integer.valueOf(1));
        samplingFrequencyIndexMap.put(Integer.valueOf(64000), Integer.valueOf(2));
        samplingFrequencyIndexMap.put(Integer.valueOf(48000), Integer.valueOf(3));
        samplingFrequencyIndexMap.put(Integer.valueOf(44100), Integer.valueOf(4));
        samplingFrequencyIndexMap.put(Integer.valueOf(32000), Integer.valueOf(5));
        samplingFrequencyIndexMap.put(Integer.valueOf(24000), Integer.valueOf(6));
        samplingFrequencyIndexMap.put(Integer.valueOf(22050), Integer.valueOf(7));
        samplingFrequencyIndexMap.put(Integer.valueOf(16000), Integer.valueOf(8));
        samplingFrequencyIndexMap.put(Integer.valueOf(12000), Integer.valueOf(9));
        samplingFrequencyIndexMap.put(Integer.valueOf(11025), Integer.valueOf(10));
        samplingFrequencyIndexMap.put(Integer.valueOf(8000), Integer.valueOf(11));
        samplingFrequencyIndexMap.put(Integer.valueOf(0), Integer.valueOf(0x17700));
        samplingFrequencyIndexMap.put(Integer.valueOf(1), Integer.valueOf(0x15888));
        samplingFrequencyIndexMap.put(Integer.valueOf(2), Integer.valueOf(64000));
        samplingFrequencyIndexMap.put(Integer.valueOf(3), Integer.valueOf(48000));
        samplingFrequencyIndexMap.put(Integer.valueOf(4), Integer.valueOf(44100));
        samplingFrequencyIndexMap.put(Integer.valueOf(5), Integer.valueOf(32000));
        samplingFrequencyIndexMap.put(Integer.valueOf(6), Integer.valueOf(24000));
        samplingFrequencyIndexMap.put(Integer.valueOf(7), Integer.valueOf(22050));
        samplingFrequencyIndexMap.put(Integer.valueOf(8), Integer.valueOf(16000));
        samplingFrequencyIndexMap.put(Integer.valueOf(9), Integer.valueOf(12000));
        samplingFrequencyIndexMap.put(Integer.valueOf(10), Integer.valueOf(11025));
        samplingFrequencyIndexMap.put(Integer.valueOf(11), Integer.valueOf(8000));
    }
}
