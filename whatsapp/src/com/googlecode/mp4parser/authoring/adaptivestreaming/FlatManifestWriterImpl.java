// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.coremedia.iso.Hex;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.h264.AvcConfigurationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.Version;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.authoring.builder.FragmentIntersectionFinder;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

// Referenced classes of package com.googlecode.mp4parser.authoring.adaptivestreaming:
//            AbstractManifestWriter, AudioQuality, VideoQuality

public class FlatManifestWriterImpl extends AbstractManifestWriter
{
    private class DependentSubstreamMask
    {

        private byte dWChannelMaskFirstByte;
        private byte dWChannelMaskSecondByte;
        private com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry entry;
        final FlatManifestWriterImpl this$0;

        public byte getdWChannelMaskFirstByte()
        {
            return dWChannelMaskFirstByte;
        }

        public byte getdWChannelMaskSecondByte()
        {
            return dWChannelMaskSecondByte;
        }

        public DependentSubstreamMask process()
        {
            switch (entry.chan_loc)
            {
            case 4: // '\004'
            case 5: // '\005'
            default:
                return this;

            case 0: // '\0'
                dWChannelMaskFirstByte = (byte)(dWChannelMaskFirstByte | 3);
                return this;

            case 1: // '\001'
                dWChannelMaskFirstByte = (byte)(dWChannelMaskFirstByte | 0xc);
                return this;

            case 2: // '\002'
                dWChannelMaskSecondByte = (byte)(dWChannelMaskSecondByte | 0x80);
                return this;

            case 3: // '\003'
                dWChannelMaskSecondByte = (byte)(dWChannelMaskSecondByte | 8);
                return this;

            case 6: // '\006'
                dWChannelMaskSecondByte = (byte)(dWChannelMaskSecondByte | 5);
                return this;

            case 7: // '\007'
                dWChannelMaskSecondByte = (byte)(dWChannelMaskSecondByte | 2);
                break;
            }
            return this;
        }

        public DependentSubstreamMask(byte byte0, byte byte1, com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry entry1)
        {
            this$0 = FlatManifestWriterImpl.this;
            super();
            dWChannelMaskFirstByte = byte0;
            dWChannelMaskSecondByte = byte1;
            entry = entry1;
        }
    }


    static final boolean $assertionsDisabled;
    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.getName());

    protected FlatManifestWriterImpl(FragmentIntersectionFinder fragmentintersectionfinder)
    {
        super(fragmentintersectionfinder);
    }

    private AudioQuality getAacAudioQuality(Track track, AudioSampleEntry audiosampleentry)
    {
        AudioQuality audioquality = new AudioQuality();
        AudioSpecificConfig audiospecificconfig = ((ESDescriptorBox)audiosampleentry.getBoxes(com/googlecode/mp4parser/boxes/mp4/ESDescriptorBox).get(0)).getEsDescriptor().getDecoderConfigDescriptor().getAudioSpecificInfo();
        if (audiospecificconfig.getSbrPresentFlag() == 1)
        {
            audioquality.fourCC = "AACH";
        } else
        if (audiospecificconfig.getPsPresentFlag() == 1)
        {
            audioquality.fourCC = "AACP";
        } else
        {
            audioquality.fourCC = "AACL";
        }
        audioquality.bitrate = getBitrate(track);
        audioquality.audioTag = 255;
        audioquality.samplingRate = audiosampleentry.getSampleRate();
        audioquality.channels = audiosampleentry.getChannelCount();
        audioquality.bitPerSample = audiosampleentry.getSampleSize();
        audioquality.packetSize = 4;
        audioquality.codecPrivateData = getAudioCodecPrivateData(audiospecificconfig);
        return audioquality;
    }

    private String getAudioCodecPrivateData(AudioSpecificConfig audiospecificconfig)
    {
        return Hex.encodeHex(audiospecificconfig.getConfigBytes());
    }

    private AudioQuality getAudioQuality(Track track, AudioSampleEntry audiosampleentry)
    {
        if (getFormat(audiosampleentry).equals("mp4a"))
        {
            return getAacAudioQuality(track, audiosampleentry);
        }
        if (getFormat(audiosampleentry).equals("ec-3"))
        {
            return getEc3AudioQuality(track, audiosampleentry);
        }
        if (getFormat(audiosampleentry).startsWith("dts"))
        {
            return getDtsAudioQuality(track, audiosampleentry);
        } else
        {
            throw new InternalError((new StringBuilder("I don't know what to do with audio of type ")).append(getFormat(audiosampleentry)).toString());
        }
    }

    private byte[] getAvcCodecPrivateData(AvcConfigurationBox avcconfigurationbox)
    {
        Object obj;
        List list = avcconfigurationbox.getSequenceParameterSets();
        obj = avcconfigurationbox.getPictureParameterSets();
        avcconfigurationbox = new ByteArrayOutputStream();
        byte abyte0[];
        byte abyte1[];
        boolean flag;
        try
        {
            abyte1 = new byte[4];
        }
        // Misplaced declaration of an exception variable
        catch (AvcConfigurationBox avcconfigurationbox)
        {
            throw new RuntimeException("ByteArrayOutputStream do not throw IOException ?!?!?");
        }
        abyte1[3] = 1;
        avcconfigurationbox.write(abyte1);
        abyte0 = list.iterator();
_L3:
        if (abyte0.hasNext()) goto _L2; else goto _L1
_L1:
        abyte0 = new byte[4];
        abyte0[3] = 1;
        avcconfigurationbox.write(abyte0);
        obj = ((List) (obj)).iterator();
_L4:
        flag = ((Iterator) (obj)).hasNext();
        if (!flag)
        {
            return avcconfigurationbox.toByteArray();
        }
        break MISSING_BLOCK_LABEL_115;
_L2:
        avcconfigurationbox.write((byte[])abyte0.next());
          goto _L3
        avcconfigurationbox.write((byte[])((Iterator) (obj)).next());
          goto _L4
    }

    private AudioQuality getDtsAudioQuality(Track track, AudioSampleEntry audiosampleentry)
    {
        DTSSpecificBox dtsspecificbox;
        ByteBuffer bytebuffer;
        int i;
        int j;
        dtsspecificbox = (DTSSpecificBox)audiosampleentry.getBoxes(com/googlecode/mp4parser/boxes/DTSSpecificBox).get(0);
        if (dtsspecificbox == null)
        {
            throw new RuntimeException("DTS track misses DTSSpecificBox!");
        }
        bytebuffer = ByteBuffer.allocate(22);
        j = dtsspecificbox.getFrameDuration();
        i = 0;
        j;
        JVM INSTR tableswitch 0 3: default 80
    //                   0 513
    //                   1 521
    //                   2 529
    //                   3 537;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        bytebuffer.put((byte)(i & 0xff));
        bytebuffer.put((byte)(i >>> 8));
        i = getNumChannelsAndMask(dtsspecificbox)[1];
        bytebuffer.put((byte)(i & 0xff));
        bytebuffer.put((byte)(i >>> 8));
        bytebuffer.put((byte)(i >>> 16));
        bytebuffer.put((byte)(i >>> 24));
        bytebuffer.put(new byte[] {
            -82, -28, -65, 94, 97, 94, 65, -121, -110, -4, 
            -92, -127, 38, -103, 2, 17
        });
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(8);
        bytebuffer1.put((byte)dtsspecificbox.getStreamConstruction());
        i = dtsspecificbox.getChannelLayout();
        bytebuffer1.put((byte)(i & 0xff));
        bytebuffer1.put((byte)(i >>> 8));
        bytebuffer1.put((byte)(i >>> 16));
        bytebuffer1.put((byte)(i >>> 24));
        i = (byte)(dtsspecificbox.getMultiAssetFlag() << 1);
        bytebuffer1.put((byte)(dtsspecificbox.getLBRDurationMod() | i));
        bytebuffer1.put(new byte[2]);
        AudioQuality audioquality = new AudioQuality();
        audioquality.fourCC = getFormat(audiosampleentry);
        audioquality.bitrate = dtsspecificbox.getAvgBitRate();
        audioquality.audioTag = 65534;
        audioquality.samplingRate = dtsspecificbox.getDTSSamplingFrequency();
        audioquality.channels = getNumChannelsAndMask(dtsspecificbox)[0];
        audioquality.bitPerSample = 16;
        audioquality.packetSize = (int)((Sample)track.getSamples().get(0)).remaining();
        audioquality.codecPrivateData = (new StringBuilder(String.valueOf(Hex.encodeHex(bytebuffer.array())))).append(Hex.encodeHex(bytebuffer1.array())).toString();
        return audioquality;
_L2:
        i = 512;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 1024;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 2048;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 4096;
        if (true) goto _L1; else goto _L6
_L6:
    }

    private AudioQuality getEc3AudioQuality(Track track, AudioSampleEntry audiosampleentry)
    {
        byte byte2;
        byte byte3;
        Object obj;
        Object obj1;
        short word1;
        int i;
        obj = (EC3SpecificBox)audiosampleentry.getBoxes(com/googlecode/mp4parser/boxes/EC3SpecificBox).get(0);
        if (obj == null)
        {
            throw new RuntimeException("EC-3 track misses EC3SpecificBox!");
        }
        i = 0;
        word1 = 0;
        byte2 = 0;
        byte3 = 0;
        obj1 = ((EC3SpecificBox) (obj)).getEntries().iterator();
_L11:
        com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry entry;
        if (!((Iterator) (obj1)).hasNext())
        {
            obj1 = ByteBuffer.allocate(22);
            byte abyte0[] = new byte[2];
            abyte0[1] = 6;
            ((ByteBuffer) (obj1)).put(abyte0);
            ((ByteBuffer) (obj1)).put(byte2);
            ((ByteBuffer) (obj1)).put(byte3);
            ((ByteBuffer) (obj1)).put(new byte[2]);
            ((ByteBuffer) (obj1)).put(new byte[] {
                -81, -121, -5, -89, 2, 45, -5, 66, -92, -44, 
                5, -51, -109, -124, 59, -35
            });
            ByteBuffer bytebuffer = ByteBuffer.allocate((int)((EC3SpecificBox) (obj)).getContentSize());
            ((EC3SpecificBox) (obj)).getContent(bytebuffer);
            obj = new AudioQuality();
            obj.fourCC = "EC-3";
            obj.bitrate = getBitrate(track);
            obj.audioTag = 65534;
            obj.samplingRate = audiosampleentry.getSampleRate();
            obj.channels = i + word1;
            obj.bitPerSample = 16;
            obj.packetSize = (int)((Sample)track.getSamples().get(0)).remaining();
            obj.codecPrivateData = (new StringBuilder(String.valueOf(Hex.encodeHex(((ByteBuffer) (obj1)).array())))).append(Hex.encodeHex(bytebuffer.array())).toString();
            return ((AudioQuality) (obj));
        }
        entry = (com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry)((Iterator) (obj1)).next();
        entry.acmod;
        JVM INSTR tableswitch 0 7: default 444
    //                   0 500
    //                   1 518
    //                   2 590
    //                   3 663
    //                   4 736
    //                   5 814
    //                   6 892
    //                   7 965;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_965;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0;
        byte byte1;
        short word0;
        word0 = i;
        byte1 = byte3;
        byte0 = byte2;
_L12:
        byte2 = byte0;
        byte3 = byte1;
        i = word0;
        if (entry.lfeon == 1)
        {
            word1++;
            byte2 = (byte)(byte0 | 0x10);
            byte3 = byte1;
            i = word0;
        }
        if (true) goto _L11; else goto _L10
_L10:
        word0 = (short)(i + 2);
        throw new RuntimeException("Smooth Streaming doesn't support DDP 1+1 mode");
_L3:
        word0 = (short)(i + 1);
        if (entry.num_dep_sub > 0)
        {
            DependentSubstreamMask dependentsubstreammask = (new DependentSubstreamMask(byte2, byte3, entry)).process();
            byte0 = (byte)(dependentsubstreammask.getdWChannelMaskFirstByte() | byte2);
            byte1 = (byte)(dependentsubstreammask.getdWChannelMaskSecondByte() | byte3);
        } else
        {
            byte0 = (byte)(byte2 | 0x20);
            byte1 = byte3;
        }
          goto _L12
_L4:
        word0 = (short)(i + 2);
        if (entry.num_dep_sub > 0)
        {
            DependentSubstreamMask dependentsubstreammask1 = (new DependentSubstreamMask(byte2, byte3, entry)).process();
            byte0 = (byte)(dependentsubstreammask1.getdWChannelMaskFirstByte() | byte2);
            byte1 = (byte)(dependentsubstreammask1.getdWChannelMaskSecondByte() | byte3);
        } else
        {
            byte0 = (byte)(byte2 | 0xc0);
            byte1 = byte3;
        }
          goto _L12
_L5:
        word0 = (short)(i + 3);
        if (entry.num_dep_sub > 0)
        {
            DependentSubstreamMask dependentsubstreammask2 = (new DependentSubstreamMask(byte2, byte3, entry)).process();
            byte0 = (byte)(dependentsubstreammask2.getdWChannelMaskFirstByte() | byte2);
            byte1 = (byte)(dependentsubstreammask2.getdWChannelMaskSecondByte() | byte3);
        } else
        {
            byte0 = (byte)(byte2 | 0xe0);
            byte1 = byte3;
        }
          goto _L12
_L6:
        word0 = (short)(i + 3);
        if (entry.num_dep_sub > 0)
        {
            DependentSubstreamMask dependentsubstreammask3 = (new DependentSubstreamMask(byte2, byte3, entry)).process();
            byte0 = (byte)(dependentsubstreammask3.getdWChannelMaskFirstByte() | byte2);
            byte1 = (byte)(dependentsubstreammask3.getdWChannelMaskSecondByte() | byte3);
        } else
        {
            byte0 = (byte)(byte2 | 0xc0);
            byte1 = (byte)(byte3 | 0x80);
        }
          goto _L12
_L7:
        word0 = (short)(i + 4);
        if (entry.num_dep_sub > 0)
        {
            DependentSubstreamMask dependentsubstreammask4 = (new DependentSubstreamMask(byte2, byte3, entry)).process();
            byte0 = (byte)(dependentsubstreammask4.getdWChannelMaskFirstByte() | byte2);
            byte1 = (byte)(dependentsubstreammask4.getdWChannelMaskSecondByte() | byte3);
        } else
        {
            byte0 = (byte)(byte2 | 0xe0);
            byte1 = (byte)(byte3 | 0x80);
        }
          goto _L12
_L8:
        word0 = (short)(i + 4);
        if (entry.num_dep_sub > 0)
        {
            DependentSubstreamMask dependentsubstreammask5 = (new DependentSubstreamMask(byte2, byte3, entry)).process();
            byte0 = (byte)(dependentsubstreammask5.getdWChannelMaskFirstByte() | byte2);
            byte1 = (byte)(dependentsubstreammask5.getdWChannelMaskSecondByte() | byte3);
        } else
        {
            byte0 = (byte)(byte2 | 0xcc);
            byte1 = byte3;
        }
          goto _L12
        word0 = (short)(i + 5);
        if (entry.num_dep_sub > 0)
        {
            DependentSubstreamMask dependentsubstreammask6 = (new DependentSubstreamMask(byte2, byte3, entry)).process();
            byte0 = (byte)(dependentsubstreammask6.getdWChannelMaskFirstByte() | byte2);
            byte1 = (byte)(dependentsubstreammask6.getdWChannelMaskSecondByte() | byte3);
        } else
        {
            byte0 = (byte)(byte2 | 0xec);
            byte1 = byte3;
        }
          goto _L12
    }

    private int[] getNumChannelsAndMask(DTSSpecificBox dtsspecificbox)
    {
        int j1 = dtsspecificbox.getChannelLayout();
        int l = 0;
        int k = 0;
        if ((j1 & 1) == 1)
        {
            l = 0 + 1;
            k = 0 | 4;
        }
        int i = k;
        int j = l;
        if ((j1 & 2) == 2)
        {
            j = l + 2;
            i = k | 1 | 2;
        }
        k = i;
        l = j;
        if ((j1 & 4) == 4)
        {
            l = j + 2;
            k = i | 0x10 | 0x20;
        }
        i = k;
        j = l;
        if ((j1 & 8) == 8)
        {
            j = l + 1;
            i = k | 8;
        }
        k = i;
        l = j;
        if ((j1 & 0x10) == 16)
        {
            l = j + 1;
            k = i | 0x100;
        }
        i = k;
        j = l;
        if ((j1 & 0x20) == 32)
        {
            j = l + 2;
            i = k | 0x1000 | 0x4000;
        }
        k = i;
        l = j;
        if ((j1 & 0x40) == 64)
        {
            l = j + 2;
            k = i | 0x10 | 0x20;
        }
        i = k;
        j = l;
        if ((j1 & 0x80) == 128)
        {
            j = l + 1;
            i = k | 0x2000;
        }
        k = i;
        l = j;
        if ((j1 & 0x100) == 256)
        {
            l = j + 1;
            k = i | 0x800;
        }
        i = k;
        j = l;
        if ((j1 & 0x200) == 512)
        {
            j = l + 2;
            i = k | 0x40 | 0x80;
        }
        k = i;
        l = j;
        if ((j1 & 0x400) == 1024)
        {
            l = j + 2;
            k = i | 0x200 | 0x400;
        }
        i = k;
        j = l;
        if ((j1 & 0x800) == 2048)
        {
            j = l + 2;
            i = k | 0x10 | 0x20;
        }
        k = i;
        l = j;
        if ((j1 & 0x1000) == 4096)
        {
            l = j + 1;
            k = i | 8;
        }
        i = k;
        j = l;
        if ((j1 & 0x2000) == 8192)
        {
            j = l + 2;
            i = k | 0x10 | 0x20;
        }
        k = i;
        l = j;
        if ((j1 & 0x4000) == 16384)
        {
            l = j + 1;
            k = i | 0x10000;
        }
        int i1 = k;
        i = l;
        if ((j1 & 0x8000) == 32768)
        {
            i = l + 2;
            i1 = k | 0x8000 | 0x20000;
        }
        j = i;
        if ((j1 & 0x10000) == 0x10000)
        {
            j = i + 1;
        }
        i = j;
        if ((j1 & 0x20000) == 0x20000)
        {
            i = j + 2;
        }
        return (new int[] {
            i, i1
        });
    }

    private VideoQuality getVideoQuality(Track track, VisualSampleEntry visualsampleentry)
    {
        if ("avc1".equals(getFormat(visualsampleentry)))
        {
            AvcConfigurationBox avcconfigurationbox = (AvcConfigurationBox)visualsampleentry.getBoxes(com/coremedia/iso/boxes/h264/AvcConfigurationBox).get(0);
            VideoQuality videoquality = new VideoQuality();
            videoquality.bitrate = getBitrate(track);
            videoquality.codecPrivateData = Hex.encodeHex(getAvcCodecPrivateData(avcconfigurationbox));
            videoquality.fourCC = "AVC1";
            videoquality.width = visualsampleentry.getWidth();
            videoquality.height = visualsampleentry.getHeight();
            videoquality.nalLength = avcconfigurationbox.getLengthSizeMinusOne() + 1;
            return videoquality;
        } else
        {
            throw new InternalError((new StringBuilder("I don't know how to handle video of type ")).append(getFormat(visualsampleentry)).toString());
        }
    }

    protected Document customizeManifest(Document document)
    {
        return document;
    }

    public String getManifest(Movie movie)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj2;
        long l;
        long l1;
        obj1 = new LinkedList();
        l1 = -1L;
        obj = new LinkedList();
        l = -1L;
        obj2 = movie.getTracks().iterator();
_L11:
        if (((Iterator) (obj2)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj3;
        int i;
        movie = DocumentBuilderFactory.newInstance();
        long l2;
        try
        {
            movie = movie.newDocumentBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (Movie movie)
        {
            throw new IOException(movie);
        }
        movie = movie.newDocument();
        obj2 = movie.createElement("SmoothStreamingMedia");
        movie.appendChild(((org.w3c.dom.Node) (obj2)));
        ((Element) (obj2)).setAttribute("MajorVersion", "2");
        ((Element) (obj2)).setAttribute("MinorVersion", "1");
        ((Element) (obj2)).setAttribute("Duration", "0");
        ((Element) (obj2)).appendChild(movie.createComment(Version.VERSION));
        obj3 = movie.createElement("StreamIndex");
        ((Element) (obj3)).setAttribute("Type", "video");
        ((Element) (obj3)).setAttribute("TimeScale", Long.toString(l1));
        ((Element) (obj3)).setAttribute("Chunks", Integer.toString(videoFragmentsDurations.length));
        ((Element) (obj3)).setAttribute("Url", "video/{bitrate}/{start time}");
        ((Element) (obj3)).setAttribute("QualityLevels", Integer.toString(((LinkedList) (obj1)).size()));
        ((Element) (obj2)).appendChild(((org.w3c.dom.Node) (obj3)));
        i = 0;
_L12:
        if (i < ((LinkedList) (obj1)).size()) goto _L4; else goto _L3
_L3:
        i = 0;
_L13:
        if (i < videoFragmentsDurations.length) goto _L6; else goto _L5
_L5:
        if (audioFragmentsDurations == null) goto _L8; else goto _L7
_L7:
        obj1 = movie.createElement("StreamIndex");
        ((Element) (obj1)).setAttribute("Type", "audio");
        ((Element) (obj1)).setAttribute("TimeScale", Long.toString(l));
        ((Element) (obj1)).setAttribute("Chunks", Integer.toString(audioFragmentsDurations.length));
        ((Element) (obj1)).setAttribute("Url", "audio/{bitrate}/{start time}");
        ((Element) (obj1)).setAttribute("QualityLevels", Integer.toString(((LinkedList) (obj)).size()));
        ((Element) (obj2)).appendChild(((org.w3c.dom.Node) (obj1)));
        i = 0;
_L14:
        if (i < ((LinkedList) (obj)).size()) goto _L10; else goto _L9
_L9:
        i = 0;
_L15:
        if (i < audioFragmentsDurations.length)
        {
            break MISSING_BLOCK_LABEL_1137;
        }
_L8:
        movie.setXmlStandalone(true);
        movie = new DOMSource(customizeManifest(movie));
        obj = new StringWriter();
        obj1 = new StreamResult(((java.io.Writer) (obj)));
        obj2 = TransformerFactory.newInstance();
        VideoQuality videoquality;
        Element element;
        try
        {
            obj2 = ((TransformerFactory) (obj2)).newTransformer();
            ((Transformer) (obj2)).setOutputProperty("indent", "yes");
            ((Transformer) (obj2)).transform(movie, ((javax.xml.transform.Result) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Movie movie)
        {
            throw new IOException(movie);
        }
        // Misplaced declaration of an exception variable
        catch (Movie movie)
        {
            throw new IOException(movie);
        }
        return ((StringWriter) (obj)).getBuffer().toString();
_L2:
        obj3 = (Track)((Iterator) (obj2)).next();
        l2 = l1;
        if (((Track) (obj3)).getMediaHeaderBox() instanceof VideoMediaHeaderBox)
        {
            videoFragmentsDurations = checkFragmentsAlign(videoFragmentsDurations, calculateFragmentDurations(((Track) (obj3)), movie));
            ((LinkedList) (obj1)).add(getVideoQuality(((Track) (obj3)), (VisualSampleEntry)((Track) (obj3)).getSampleDescriptionBox().getSampleEntry()));
            if (l1 == -1L)
            {
                l2 = ((Track) (obj3)).getTrackMetaData().getTimescale();
            } else
            {
                l2 = l1;
                if (!$assertionsDisabled)
                {
                    l2 = l1;
                    if (l1 != ((Track) (obj3)).getTrackMetaData().getTimescale())
                    {
                        throw new AssertionError();
                    }
                }
            }
        }
        l1 = l2;
        if (((Track) (obj3)).getMediaHeaderBox() instanceof SoundMediaHeaderBox)
        {
            audioFragmentsDurations = checkFragmentsAlign(audioFragmentsDurations, calculateFragmentDurations(((Track) (obj3)), movie));
            ((LinkedList) (obj)).add(getAudioQuality(((Track) (obj3)), (AudioSampleEntry)((Track) (obj3)).getSampleDescriptionBox().getSampleEntry()));
            if (l == -1L)
            {
                l = ((Track) (obj3)).getTrackMetaData().getTimescale();
                l1 = l2;
            } else
            {
                l1 = l2;
                if (!$assertionsDisabled)
                {
                    l1 = l2;
                    if (l != ((Track) (obj3)).getTrackMetaData().getTimescale())
                    {
                        throw new AssertionError();
                    }
                }
            }
        }
          goto _L11
_L4:
        videoquality = (VideoQuality)((LinkedList) (obj1)).get(i);
        element = movie.createElement("QualityLevel");
        element.setAttribute("Index", Integer.toString(i));
        element.setAttribute("Bitrate", Long.toString(videoquality.bitrate));
        element.setAttribute("FourCC", videoquality.fourCC);
        element.setAttribute("MaxWidth", Long.toString(videoquality.width));
        element.setAttribute("MaxHeight", Long.toString(videoquality.height));
        element.setAttribute("CodecPrivateData", videoquality.codecPrivateData);
        element.setAttribute("NALUnitLengthField", Integer.toString(videoquality.nalLength));
        ((Element) (obj3)).appendChild(element);
        i++;
          goto _L12
_L6:
        obj1 = movie.createElement("c");
        ((Element) (obj1)).setAttribute("n", Integer.toString(i));
        ((Element) (obj1)).setAttribute("d", Long.toString(videoFragmentsDurations[i]));
        ((Element) (obj3)).appendChild(((org.w3c.dom.Node) (obj1)));
        i++;
          goto _L13
_L10:
        obj2 = (AudioQuality)((LinkedList) (obj)).get(i);
        obj3 = movie.createElement("QualityLevel");
        ((Element) (obj3)).setAttribute("Index", Integer.toString(i));
        ((Element) (obj3)).setAttribute("FourCC", ((AudioQuality) (obj2)).fourCC);
        ((Element) (obj3)).setAttribute("Bitrate", Long.toString(((AudioQuality) (obj2)).bitrate));
        ((Element) (obj3)).setAttribute("AudioTag", Integer.toString(((AudioQuality) (obj2)).audioTag));
        ((Element) (obj3)).setAttribute("SamplingRate", Long.toString(((AudioQuality) (obj2)).samplingRate));
        ((Element) (obj3)).setAttribute("Channels", Integer.toString(((AudioQuality) (obj2)).channels));
        ((Element) (obj3)).setAttribute("BitsPerSample", Integer.toString(((AudioQuality) (obj2)).bitPerSample));
        ((Element) (obj3)).setAttribute("PacketSize", Integer.toString(((AudioQuality) (obj2)).packetSize));
        ((Element) (obj3)).setAttribute("CodecPrivateData", ((AudioQuality) (obj2)).codecPrivateData);
        ((Element) (obj1)).appendChild(((org.w3c.dom.Node) (obj3)));
        i++;
          goto _L14
        obj = movie.createElement("c");
        ((Element) (obj)).setAttribute("n", Integer.toString(i));
        ((Element) (obj)).setAttribute("d", Long.toString(audioFragmentsDurations[i]));
        ((Element) (obj1)).appendChild(((org.w3c.dom.Node) (obj)));
        i++;
          goto _L15
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/adaptivestreaming/FlatManifestWriterImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
