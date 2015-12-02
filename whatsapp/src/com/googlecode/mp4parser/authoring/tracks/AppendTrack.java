// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor;
import com.googlecode.mp4parser.util.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AppendTrack extends AbstractTrack
{

    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/tracks/AppendTrack);
    SampleDescriptionBox stsd;
    Track tracks[];

    public transient AppendTrack(Track atrack[])
        throws IOException
    {
        tracks = atrack;
        int j = atrack.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            Track track = atrack[i];
            if (stsd == null)
            {
                stsd = new SampleDescriptionBox();
                stsd.addBox((Box)track.getSampleDescriptionBox().getBoxes(com/coremedia/iso/boxes/sampleentry/SampleEntry).get(0));
            } else
            {
                stsd = mergeStsds(stsd, track.getSampleDescriptionBox());
            }
            i++;
        } while (true);
    }

    private AudioSampleEntry mergeAudioSampleEntries(AudioSampleEntry audiosampleentry, AudioSampleEntry audiosampleentry1)
    {
        AudioSampleEntry audiosampleentry2 = new AudioSampleEntry(audiosampleentry1.getType());
        if (audiosampleentry.getBytesPerFrame() != audiosampleentry1.getBytesPerFrame()) goto _L2; else goto _L1
_L1:
        LOG.logError("BytesPerFrame differ");
        audiosampleentry2.setBytesPerFrame(audiosampleentry.getBytesPerFrame());
        if (audiosampleentry.getBytesPerPacket() != audiosampleentry1.getBytesPerPacket()) goto _L4; else goto _L3
_L3:
        audiosampleentry2.setBytesPerPacket(audiosampleentry.getBytesPerPacket());
        if (audiosampleentry.getBytesPerSample() != audiosampleentry1.getBytesPerSample()) goto _L6; else goto _L5
_L5:
        LOG.logError("BytesPerSample differ");
        audiosampleentry2.setBytesPerSample(audiosampleentry.getBytesPerSample());
        if (audiosampleentry.getChannelCount() != audiosampleentry1.getChannelCount()) goto _L8; else goto _L7
_L7:
        LOG.logError("ChannelCount differ");
        audiosampleentry2.setChannelCount(audiosampleentry.getChannelCount());
        if (audiosampleentry.getPacketSize() != audiosampleentry1.getPacketSize()) goto _L10; else goto _L9
_L9:
        audiosampleentry2.setPacketSize(audiosampleentry.getPacketSize());
        if (audiosampleentry.getCompressionId() != audiosampleentry1.getCompressionId()) goto _L12; else goto _L11
_L11:
        audiosampleentry2.setCompressionId(audiosampleentry.getCompressionId());
        if (audiosampleentry.getSampleRate() != audiosampleentry1.getSampleRate()) goto _L14; else goto _L13
_L13:
        audiosampleentry2.setSampleRate(audiosampleentry.getSampleRate());
        if (audiosampleentry.getSampleSize() != audiosampleentry1.getSampleSize()) goto _L16; else goto _L15
_L15:
        audiosampleentry2.setSampleSize(audiosampleentry.getSampleSize());
        if (audiosampleentry.getSamplesPerPacket() != audiosampleentry1.getSamplesPerPacket()) goto _L18; else goto _L17
_L17:
        audiosampleentry2.setSamplesPerPacket(audiosampleentry.getSamplesPerPacket());
        if (audiosampleentry.getSoundVersion() != audiosampleentry1.getSoundVersion()) goto _L20; else goto _L19
_L19:
        audiosampleentry2.setSoundVersion(audiosampleentry.getSoundVersion());
        if (!Arrays.equals(audiosampleentry.getSoundVersion2Data(), audiosampleentry1.getSoundVersion2Data())) goto _L22; else goto _L21
_L21:
        audiosampleentry2.setSoundVersion2Data(audiosampleentry.getSoundVersion2Data());
        if (audiosampleentry.getBoxes().size() != audiosampleentry1.getBoxes().size()) goto _L24; else goto _L23
_L23:
        audiosampleentry = audiosampleentry.getBoxes().iterator();
        audiosampleentry1 = audiosampleentry1.getBoxes().iterator();
_L27:
        if (audiosampleentry.hasNext()) goto _L25; else goto _L24
_L24:
        return audiosampleentry2;
_L2:
        return null;
_L4:
        return null;
_L6:
        return null;
_L8:
        return null;
_L10:
        return null;
_L12:
        return null;
_L14:
        return null;
_L16:
        return null;
_L18:
        return null;
_L20:
        return null;
_L22:
        return null;
_L25:
        Box box = (Box)audiosampleentry.next();
        Object obj = (Box)audiosampleentry1.next();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ByteArrayOutputStream bytearrayoutputstream1 = new ByteArrayOutputStream();
        try
        {
            box.getBox(Channels.newChannel(bytearrayoutputstream));
            ((Box) (obj)).getBox(Channels.newChannel(bytearrayoutputstream1));
        }
        // Misplaced declaration of an exception variable
        catch (AudioSampleEntry audiosampleentry)
        {
            LOG.logWarn(audiosampleentry.getMessage());
            return null;
        }
        if (Arrays.equals(bytearrayoutputstream.toByteArray(), bytearrayoutputstream1.toByteArray()))
        {
            audiosampleentry2.addBox(box);
        } else
        if ("esds".equals(box.getType()) && "esds".equals(((Box) (obj)).getType()))
        {
            ESDescriptorBox esdescriptorbox = (ESDescriptorBox)box;
            obj = (ESDescriptorBox)obj;
            esdescriptorbox.setDescriptor(mergeDescriptors(esdescriptorbox.getEsDescriptor(), ((ESDescriptorBox) (obj)).getEsDescriptor()));
            audiosampleentry2.addBox(box);
        }
        if (true) goto _L27; else goto _L26
_L26:
    }

    private ESDescriptor mergeDescriptors(BaseDescriptor basedescriptor, BaseDescriptor basedescriptor1)
    {
        if (!(basedescriptor instanceof ESDescriptor) || !(basedescriptor1 instanceof ESDescriptor)) goto _L2; else goto _L1
_L1:
        ESDescriptor esdescriptor;
        esdescriptor = (ESDescriptor)basedescriptor;
        basedescriptor1 = (ESDescriptor)basedescriptor1;
        if (esdescriptor.getURLFlag() == basedescriptor1.getURLFlag()) goto _L4; else goto _L3
_L3:
        basedescriptor = null;
_L9:
        return basedescriptor;
_L4:
        DecoderConfigDescriptor decoderconfigdescriptor;
        esdescriptor.getURLLength();
        basedescriptor1.getURLLength();
        if (esdescriptor.getDependsOnEsId() != basedescriptor1.getDependsOnEsId())
        {
            return null;
        }
        if (esdescriptor.getEsId() != basedescriptor1.getEsId())
        {
            return null;
        }
        if (esdescriptor.getoCREsId() != basedescriptor1.getoCREsId())
        {
            return null;
        }
        if (esdescriptor.getoCRstreamFlag() != basedescriptor1.getoCRstreamFlag())
        {
            return null;
        }
        if (esdescriptor.getRemoteODFlag() != basedescriptor1.getRemoteODFlag())
        {
            return null;
        }
        if (esdescriptor.getStreamDependenceFlag() != basedescriptor1.getStreamDependenceFlag())
        {
            return null;
        }
        esdescriptor.getStreamPriority();
        basedescriptor1.getStreamPriority();
        if (esdescriptor.getURLString() != null)
        {
            esdescriptor.getURLString().equals(basedescriptor1.getURLString());
        } else
        {
            basedescriptor1.getURLString();
        }
        if (esdescriptor.getDecoderConfigDescriptor() == null ? basedescriptor1.getDecoderConfigDescriptor() != null : !esdescriptor.getDecoderConfigDescriptor().equals(basedescriptor1.getDecoderConfigDescriptor()))
        {
            basedescriptor = esdescriptor.getDecoderConfigDescriptor();
            decoderconfigdescriptor = basedescriptor1.getDecoderConfigDescriptor();
            if (basedescriptor.getAudioSpecificInfo() != null && decoderconfigdescriptor.getAudioSpecificInfo() != null && !basedescriptor.getAudioSpecificInfo().equals(decoderconfigdescriptor.getAudioSpecificInfo()))
            {
                return null;
            }
            break MISSING_BLOCK_LABEL_260;
        }
_L5:
        if (esdescriptor.getOtherDescriptors() == null ? basedescriptor1.getOtherDescriptors() != null : !esdescriptor.getOtherDescriptors().equals(basedescriptor1.getOtherDescriptors()))
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_431;
        if (basedescriptor.getAvgBitRate() != decoderconfigdescriptor.getAvgBitRate())
        {
            basedescriptor.setAvgBitRate((basedescriptor.getAvgBitRate() + decoderconfigdescriptor.getAvgBitRate()) / 2L);
        }
        basedescriptor.getBufferSizeDB();
        decoderconfigdescriptor.getBufferSizeDB();
        if (basedescriptor.getDecoderSpecificInfo() == null ? decoderconfigdescriptor.getDecoderSpecificInfo() != null : !basedescriptor.getDecoderSpecificInfo().equals(decoderconfigdescriptor.getDecoderSpecificInfo()))
        {
            return null;
        }
        if (basedescriptor.getMaxBitRate() != decoderconfigdescriptor.getMaxBitRate())
        {
            basedescriptor.setMaxBitRate(Math.max(basedescriptor.getMaxBitRate(), decoderconfigdescriptor.getMaxBitRate()));
        }
        if (!basedescriptor.getProfileLevelIndicationDescriptors().equals(decoderconfigdescriptor.getProfileLevelIndicationDescriptors()))
        {
            return null;
        }
        if (basedescriptor.getObjectTypeIndication() != decoderconfigdescriptor.getObjectTypeIndication())
        {
            return null;
        }
        if (basedescriptor.getStreamType() != decoderconfigdescriptor.getStreamType())
        {
            return null;
        }
        if (basedescriptor.getUpStream() != decoderconfigdescriptor.getUpStream())
        {
            return null;
        }
          goto _L5
        if (esdescriptor.getSlConfigDescriptor() == null) goto _L7; else goto _L6
_L6:
        basedescriptor = esdescriptor;
        if (esdescriptor.getSlConfigDescriptor().equals(basedescriptor1.getSlConfigDescriptor())) goto _L9; else goto _L8
_L8:
        return null;
_L7:
        basedescriptor = esdescriptor;
        if (basedescriptor1.getSlConfigDescriptor() == null) goto _L9; else goto _L8
_L2:
        LOG.logError("I can only merge ESDescriptors");
        return null;
    }

    private SampleEntry mergeSampleEntry(SampleEntry sampleentry, SampleEntry sampleentry1)
    {
        if (sampleentry.getType().equals(sampleentry1.getType()))
        {
            if ((sampleentry instanceof VisualSampleEntry) && (sampleentry1 instanceof VisualSampleEntry))
            {
                return mergeVisualSampleEntry((VisualSampleEntry)sampleentry, (VisualSampleEntry)sampleentry1);
            }
            if ((sampleentry instanceof AudioSampleEntry) && (sampleentry1 instanceof AudioSampleEntry))
            {
                return mergeAudioSampleEntries((AudioSampleEntry)sampleentry, (AudioSampleEntry)sampleentry1);
            }
        }
        return null;
    }

    private SampleDescriptionBox mergeStsds(SampleDescriptionBox sampledescriptionbox, SampleDescriptionBox sampledescriptionbox1)
        throws IOException
    {
label0:
        {
            ByteArrayOutputStream bytearrayoutputstream1 = new ByteArrayOutputStream();
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            byte abyte0[];
            try
            {
                sampledescriptionbox.getBox(Channels.newChannel(bytearrayoutputstream1));
                sampledescriptionbox1.getBox(Channels.newChannel(bytearrayoutputstream));
            }
            // Misplaced declaration of an exception variable
            catch (SampleDescriptionBox sampledescriptionbox)
            {
                LOG.logError(sampledescriptionbox.getMessage());
                return null;
            }
            abyte0 = bytearrayoutputstream1.toByteArray();
            if (!Arrays.equals(bytearrayoutputstream.toByteArray(), abyte0))
            {
                SampleEntry sampleentry = mergeSampleEntry((SampleEntry)sampledescriptionbox.getBoxes(com/coremedia/iso/boxes/sampleentry/SampleEntry).get(0), (SampleEntry)sampledescriptionbox1.getBoxes(com/coremedia/iso/boxes/sampleentry/SampleEntry).get(0));
                if (sampleentry == null)
                {
                    break label0;
                }
                sampledescriptionbox.setBoxes(Collections.singletonList(sampleentry));
            }
            return sampledescriptionbox;
        }
        throw new IOException((new StringBuilder("Cannot merge ")).append(sampledescriptionbox.getBoxes(com/coremedia/iso/boxes/sampleentry/SampleEntry).get(0)).append(" and ").append(sampledescriptionbox1.getBoxes(com/coremedia/iso/boxes/sampleentry/SampleEntry).get(0)).toString());
    }

    private VisualSampleEntry mergeVisualSampleEntry(VisualSampleEntry visualsampleentry, VisualSampleEntry visualsampleentry1)
    {
        VisualSampleEntry visualsampleentry2 = new VisualSampleEntry();
        if (visualsampleentry.getHorizresolution() != visualsampleentry1.getHorizresolution()) goto _L2; else goto _L1
_L1:
        visualsampleentry2.setHorizresolution(visualsampleentry.getHorizresolution());
        visualsampleentry2.setCompressorname(visualsampleentry.getCompressorname());
        if (visualsampleentry.getDepth() != visualsampleentry1.getDepth()) goto _L4; else goto _L3
_L3:
        visualsampleentry2.setDepth(visualsampleentry.getDepth());
        if (visualsampleentry.getFrameCount() != visualsampleentry1.getFrameCount()) goto _L6; else goto _L5
_L5:
        visualsampleentry2.setFrameCount(visualsampleentry.getFrameCount());
        if (visualsampleentry.getHeight() != visualsampleentry1.getHeight()) goto _L8; else goto _L7
_L7:
        visualsampleentry2.setHeight(visualsampleentry.getHeight());
        if (visualsampleentry.getWidth() != visualsampleentry1.getWidth()) goto _L10; else goto _L9
_L9:
        visualsampleentry2.setWidth(visualsampleentry.getWidth());
        if (visualsampleentry.getVertresolution() != visualsampleentry1.getVertresolution()) goto _L12; else goto _L11
_L11:
        visualsampleentry2.setVertresolution(visualsampleentry.getVertresolution());
        if (visualsampleentry.getHorizresolution() != visualsampleentry1.getHorizresolution()) goto _L14; else goto _L13
_L13:
        visualsampleentry2.setHorizresolution(visualsampleentry.getHorizresolution());
        if (visualsampleentry.getBoxes().size() != visualsampleentry1.getBoxes().size()) goto _L16; else goto _L15
_L15:
        visualsampleentry = visualsampleentry.getBoxes().iterator();
        visualsampleentry1 = visualsampleentry1.getBoxes().iterator();
_L19:
        if (visualsampleentry.hasNext()) goto _L17; else goto _L16
_L16:
        return visualsampleentry2;
_L2:
        LOG.logError("Horizontal Resolution differs");
        return null;
_L4:
        LOG.logError("Depth differs");
        return null;
_L6:
        LOG.logError("frame count differs");
        return null;
_L8:
        LOG.logError("height differs");
        return null;
_L10:
        LOG.logError("width differs");
        return null;
_L12:
        LOG.logError("vert resolution differs");
        return null;
_L14:
        LOG.logError("horizontal resolution differs");
        return null;
_L17:
        Box box = (Box)visualsampleentry.next();
        Object obj = (Box)visualsampleentry1.next();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ByteArrayOutputStream bytearrayoutputstream1 = new ByteArrayOutputStream();
        try
        {
            box.getBox(Channels.newChannel(bytearrayoutputstream));
            ((Box) (obj)).getBox(Channels.newChannel(bytearrayoutputstream1));
        }
        // Misplaced declaration of an exception variable
        catch (VisualSampleEntry visualsampleentry)
        {
            LOG.logWarn(visualsampleentry.getMessage());
            return null;
        }
        if (Arrays.equals(bytearrayoutputstream.toByteArray(), bytearrayoutputstream1.toByteArray()))
        {
            visualsampleentry2.addBox(box);
        } else
        if ((box instanceof AbstractDescriptorBox) && (obj instanceof AbstractDescriptorBox))
        {
            obj = mergeDescriptors(((AbstractDescriptorBox)box).getDescriptor(), ((AbstractDescriptorBox)obj).getDescriptor());
            ((AbstractDescriptorBox)box).setDescriptor(((BaseDescriptor) (obj)));
            visualsampleentry2.addBox(box);
        }
        if (true) goto _L19; else goto _L18
_L18:
    }

    public List getCompositionTimeEntries()
    {
        Object obj;
        Object obj1;
        int i;
        int k;
        if (tracks[0].getCompositionTimeEntries() != null && !tracks[0].getCompositionTimeEntries().isEmpty())
        {
            obj1 = new LinkedList();
            obj = tracks;
            k = obj.length;
            i = 0;
        } else
        {
            return null;
        }
        if (i < k) goto _L2; else goto _L1
_L1:
        obj = new LinkedList();
        obj1 = ((List) (obj1)).iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext())
        {
            return ((List) (obj));
        }
        break MISSING_BLOCK_LABEL_114;
_L2:
        ((List) (obj1)).add(CompositionTimeToSample.blowupCompositionTimes(obj[i].getCompositionTimeEntries()));
        i++;
        break MISSING_BLOCK_LABEL_53;
        int ai[] = (int[])((Iterator) (obj1)).next();
        int l = ai.length;
        int j = 0;
        while (j < l) 
        {
            int i1 = ai[j];
            if (((LinkedList) (obj)).isEmpty() || ((com.coremedia.iso.boxes.CompositionTimeToSample.Entry)((LinkedList) (obj)).getLast()).getOffset() != i1)
            {
                ((LinkedList) (obj)).add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(1, i1));
            } else
            {
                com.coremedia.iso.boxes.CompositionTimeToSample.Entry entry = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)((LinkedList) (obj)).getLast();
                entry.setCount(entry.getCount() + 1);
            }
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public List getDecodingTimeEntries()
    {
        Object obj;
        Object obj1;
        int i;
        int k;
        if (tracks[0].getDecodingTimeEntries() != null && !tracks[0].getDecodingTimeEntries().isEmpty())
        {
            obj1 = new LinkedList();
            obj = tracks;
            k = obj.length;
            i = 0;
        } else
        {
            return null;
        }
        if (i < k) goto _L2; else goto _L1
_L1:
        obj = new LinkedList();
        obj1 = ((List) (obj1)).iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext())
        {
            return ((List) (obj));
        }
        break MISSING_BLOCK_LABEL_114;
_L2:
        ((List) (obj1)).add(TimeToSampleBox.blowupTimeToSamples(obj[i].getDecodingTimeEntries()));
        i++;
        break MISSING_BLOCK_LABEL_53;
        long al[] = (long[])((Iterator) (obj1)).next();
        int l = al.length;
        int j = 0;
        while (j < l) 
        {
            long l1 = al[j];
            if (((LinkedList) (obj)).isEmpty() || ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)((LinkedList) (obj)).getLast()).getDelta() != l1)
            {
                ((LinkedList) (obj)).add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, l1));
            } else
            {
                com.coremedia.iso.boxes.TimeToSampleBox.Entry entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)((LinkedList) (obj)).getLast();
                entry.setCount(entry.getCount() + 1L);
            }
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getHandler()
    {
        return tracks[0].getHandler();
    }

    public Box getMediaHeaderBox()
    {
        return tracks[0].getMediaHeaderBox();
    }

    public List getSampleDependencies()
    {
        int i = 0;
        if (tracks[0].getSampleDependencies() != null && !tracks[0].getSampleDependencies().isEmpty())
        {
            LinkedList linkedlist = new LinkedList();
            Track atrack[] = tracks;
            int j = atrack.length;
            do
            {
                if (i >= j)
                {
                    return linkedlist;
                }
                linkedlist.addAll(atrack[i].getSampleDependencies());
                i++;
            } while (true);
        } else
        {
            return null;
        }
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return stsd;
    }

    public List getSamples()
    {
        ArrayList arraylist = new ArrayList();
        Track atrack[] = tracks;
        int j = atrack.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            arraylist.addAll(atrack[i].getSamples());
            i++;
        } while (true);
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return tracks[0].getSubsampleInformationBox();
    }

    public long[] getSyncSamples()
    {
        long al[];
        Track atrack[];
        int i;
        int j;
        int k;
        int i1;
        long l1;
        if (tracks[0].getSyncSamples() != null && tracks[0].getSyncSamples().length > 0)
        {
            j = 0;
            al = tracks;
            k = al.length;
            i = 0;
        } else
        {
            return null;
        }
        if (i >= k)
        {
            al = new long[j];
            i = 0;
            l1 = 0L;
            atrack = tracks;
            i1 = atrack.length;
            j = 0;
            break MISSING_BLOCK_LABEL_74;
        } else
        {
            j += al[i].getSyncSamples().length;
            i++;
            break MISSING_BLOCK_LABEL_44;
        }
_L2:
        if (j >= i1)
        {
            return al;
        }
        Track track = atrack[j];
        long al1[] = track.getSyncSamples();
        int j1 = al1.length;
        int l = 0;
        do
        {
label0:
            {
                if (l < j1)
                {
                    break label0;
                }
                l1 += track.getSamples().size();
                j++;
            }
            if (true)
            {
                continue;
            }
            al[i] = l1 + al1[l];
            l++;
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public TrackMetaData getTrackMetaData()
    {
        return tracks[0].getTrackMetaData();
    }

}
