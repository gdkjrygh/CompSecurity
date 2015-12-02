// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.AbstractMediaHeaderBox;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.mdat.SampleList;
import com.googlecode.mp4parser.util.CastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            AbstractTrack, TrackMetaData

public class Mp4TrackImpl extends AbstractTrack
{

    private List compositionTimeEntries;
    private List decodingTimeEntries;
    private String handler;
    private AbstractMediaHeaderBox mihd;
    private List sampleDependencies;
    private SampleDescriptionBox sampleDescriptionBox;
    private List samples;
    private long syncSamples[];
    private TrackMetaData trackMetaData;

    public transient Mp4TrackImpl(TrackBox trackbox, IsoFile aisofile[])
    {
        long l2;
        syncSamples = new long[0];
        trackMetaData = new TrackMetaData();
        l2 = trackbox.getTrackHeaderBox().getTrackId();
        samples = new SampleList(trackbox, aisofile);
        aisofile = trackbox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        handler = trackbox.getMediaBox().getHandlerBox().getHandlerType();
        mihd = trackbox.getMediaBox().getMediaInformationBox().getMediaHeaderBox();
        decodingTimeEntries = new ArrayList();
        compositionTimeEntries = new ArrayList();
        sampleDependencies = new ArrayList();
        decodingTimeEntries.addAll(aisofile.getTimeToSampleBox().getEntries());
        if (aisofile.getCompositionTimeToSample() != null)
        {
            compositionTimeEntries.addAll(aisofile.getCompositionTimeToSample().getEntries());
        }
        if (aisofile.getSampleDependencyTypeBox() != null)
        {
            sampleDependencies.addAll(aisofile.getSampleDependencyTypeBox().getEntries());
        }
        if (aisofile.getSyncSampleBox() != null)
        {
            syncSamples = aisofile.getSyncSampleBox().getSampleNumber();
        }
        sampleDescriptionBox = aisofile.getSampleDescriptionBox();
        aisofile = trackbox.getParent().getBoxes(com/coremedia/iso/boxes/fragment/MovieExtendsBox);
        if (aisofile.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = aisofile.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        aisofile = trackbox.getMediaBox().getMediaHeaderBox();
        trackbox = trackbox.getTrackHeaderBox();
        setEnabled(trackbox.isEnabled());
        setInMovie(trackbox.isInMovie());
        setInPoster(trackbox.isInPoster());
        setInPreview(trackbox.isInPreview());
        trackMetaData.setTrackId(trackbox.getTrackId());
        trackMetaData.setCreationTime(aisofile.getCreationTime());
        trackMetaData.setLanguage(aisofile.getLanguage());
        trackMetaData.setModificationTime(aisofile.getModificationTime());
        trackMetaData.setTimescale(aisofile.getTimescale());
        trackMetaData.setHeight(trackbox.getHeight());
        trackMetaData.setWidth(trackbox.getWidth());
        trackMetaData.setLayer(trackbox.getLayer());
        trackMetaData.setMatrix(trackbox.getMatrix());
        return;
_L3:
        Iterator iterator1 = ((MovieExtendsBox)iterator.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackExtendsBox).iterator();
_L7:
        if (!iterator1.hasNext()) goto _L5; else goto _L4
_L4:
        TrackExtendsBox trackextendsbox = (TrackExtendsBox)iterator1.next();
        if (trackextendsbox.getTrackId() != l2) goto _L7; else goto _L6
_L6:
        Object obj;
        Iterator iterator2;
        long l1;
        obj = new LinkedList();
        l1 = 1L;
        iterator2 = ((Box)trackbox.getParent()).getParent().getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L9:
label0:
        {
            if (iterator2.hasNext())
            {
                break label0;
            }
            aisofile = syncSamples;
            syncSamples = new long[syncSamples.length + ((List) (obj)).size()];
            System.arraycopy(aisofile, 0, syncSamples, 0, aisofile.length);
            obj = ((List) (obj)).iterator();
            int i = aisofile.length;
            while (((Iterator) (obj)).hasNext()) 
            {
                aisofile = (Long)((Iterator) (obj)).next();
                syncSamples[i] = aisofile.longValue();
                i++;
            }
        }
          goto _L7
          goto _L5
        Iterator iterator3;
        long l;
        iterator3 = ((MovieFragmentBox)iterator2.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        l = l1;
_L11:
        l1 = l;
        if (!iterator3.hasNext()) goto _L9; else goto _L8
_L8:
        aisofile = (TrackFragmentBox)iterator3.next();
        if (aisofile.getTrackFragmentHeaderBox().getTrackId() != l2) goto _L11; else goto _L10
_L10:
        Iterator iterator4;
        iterator4 = aisofile.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).iterator();
        l1 = l;
_L14:
        l = l1;
        if (!iterator4.hasNext()) goto _L11; else goto _L12
_L12:
        TrackRunBox trackrunbox;
        TrackFragmentHeaderBox trackfragmentheaderbox;
        Iterator iterator5;
        boolean flag;
        trackrunbox = (TrackRunBox)iterator4.next();
        trackfragmentheaderbox = ((TrackFragmentBox)trackrunbox.getParent()).getTrackFragmentHeaderBox();
        flag = true;
        iterator5 = trackrunbox.getEntries().iterator();
        l = l1;
_L15:
        l1 = l;
        if (!iterator5.hasNext()) goto _L14; else goto _L13
_L13:
        aisofile = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)iterator5.next();
        if (trackrunbox.isSampleDurationPresent())
        {
            if (decodingTimeEntries.size() == 0 || ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)decodingTimeEntries.get(decodingTimeEntries.size() - 1)).getDelta() != aisofile.getSampleDuration())
            {
                decodingTimeEntries.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, aisofile.getSampleDuration()));
            } else
            {
                com.coremedia.iso.boxes.TimeToSampleBox.Entry entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)decodingTimeEntries.get(decodingTimeEntries.size() - 1);
                entry.setCount(entry.getCount() + 1L);
            }
        } else
        if (trackfragmentheaderbox.hasDefaultSampleDuration())
        {
            decodingTimeEntries.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, trackfragmentheaderbox.getDefaultSampleDuration()));
        } else
        {
            decodingTimeEntries.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(1L, trackextendsbox.getDefaultSampleDuration()));
        }
        if (trackrunbox.isSampleCompositionTimeOffsetPresent())
        {
            if (compositionTimeEntries.size() == 0 || ((com.coremedia.iso.boxes.CompositionTimeToSample.Entry)compositionTimeEntries.get(compositionTimeEntries.size() - 1)).getOffset() != aisofile.getSampleCompositionTimeOffset())
            {
                compositionTimeEntries.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry(1, CastUtils.l2i(aisofile.getSampleCompositionTimeOffset())));
            } else
            {
                com.coremedia.iso.boxes.CompositionTimeToSample.Entry entry1 = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)compositionTimeEntries.get(compositionTimeEntries.size() - 1);
                entry1.setCount(entry1.getCount() + 1);
            }
        }
        if (trackrunbox.isSampleFlagsPresent())
        {
            aisofile = aisofile.getSampleFlags();
        } else
        if (flag && trackrunbox.isFirstSampleFlagsPresent())
        {
            aisofile = trackrunbox.getFirstSampleFlags();
        } else
        if (trackfragmentheaderbox.hasDefaultSampleFlags())
        {
            aisofile = trackfragmentheaderbox.getDefaultSampleFlags();
        } else
        {
            aisofile = trackextendsbox.getDefaultSampleFlags();
        }
        if (aisofile != null && !aisofile.isSampleIsDifferenceSample())
        {
            ((List) (obj)).add(Long.valueOf(l));
        }
        l++;
        flag = false;
          goto _L15
    }

    public List getCompositionTimeEntries()
    {
        return compositionTimeEntries;
    }

    public List getDecodingTimeEntries()
    {
        return decodingTimeEntries;
    }

    public String getHandler()
    {
        return handler;
    }

    public AbstractMediaHeaderBox getMediaHeaderBox()
    {
        return mihd;
    }

    public volatile Box getMediaHeaderBox()
    {
        return getMediaHeaderBox();
    }

    public List getSampleDependencies()
    {
        return sampleDependencies;
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
        return syncSamples;
    }

    public TrackMetaData getTrackMetaData()
    {
        return trackMetaData;
    }

    public String toString()
    {
        return (new StringBuilder("Mp4TrackImpl{handler='")).append(handler).append('\'').append('}').toString();
    }
}
