// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            Mp4Builder, SyncSampleIntersectFinderImpl, FragmentIntersectionFinder

public class FragmentedMp4Builder
    implements Mp4Builder
{
    class _cls1Mdat
        implements Box
    {

        Container parent;
        final FragmentedMp4Builder this$0;
        private final long val$endSample;
        private final int val$i;
        private final long val$startSample;
        private final Track val$track;

        public void getBox(WritableByteChannel writablebytechannel)
            throws IOException
        {
            Object obj = ByteBuffer.allocate(8);
            IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), CastUtils.l2i(getSize()));
            ((ByteBuffer) (obj)).put(IsoFile.fourCCtoBytes(getType()));
            ((ByteBuffer) (obj)).rewind();
            writablebytechannel.write(((ByteBuffer) (obj)));
            obj = getSamples(startSample, endSample, track, i).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    return;
                }
                ((Sample)((Iterator) (obj)).next()).writeTo(writablebytechannel);
            } while (true);
        }

        public long getOffset()
        {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        public Container getParent()
        {
            return parent;
        }

        public long getSize()
        {
            long l = 8L;
            Iterator iterator = getSamples(startSample, endSample, track, i).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    return l;
                }
                l += ((Sample)iterator.next()).remaining();
            } while (true);
        }

        public String getType()
        {
            return "mdat";
        }

        public void parse(FileChannel filechannel, ByteBuffer bytebuffer, long l, BoxParser boxparser)
            throws IOException
        {
        }

        public void setParent(Container container)
        {
            parent = container;
        }

        _cls1Mdat()
        {
            this$0 = FragmentedMp4Builder.this;
            startSample = l;
            endSample = l1;
            track = track1;
            i = j;
            super();
        }
    }


    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/builder/FragmentedMp4Builder.getName());
    protected FragmentIntersectionFinder intersectionFinder;

    public FragmentedMp4Builder()
    {
        intersectionFinder = new SyncSampleIntersectFinderImpl();
    }

    private long getTrackDuration(Movie movie, Track track)
    {
        return (getDuration(track) * movie.getTimescale()) / track.getTrackMetaData().getTimescale();
    }

    public Container build(Movie movie)
    {
        LOG.fine((new StringBuilder("Creating movie ")).append(movie).toString());
        BasicContainer basiccontainer = new BasicContainer();
        basiccontainer.addBox(createFtyp(movie));
        basiccontainer.addBox(createMoov(movie));
        Iterator iterator = createMoofMdat(movie).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                basiccontainer.addBox(createMfra(movie, basiccontainer));
                return basiccontainer;
            }
            basiccontainer.addBox((Box)iterator.next());
        } while (true);
    }

    protected DataInformationBox createDinf(Movie movie, Track track)
    {
        movie = new DataInformationBox();
        track = new DataReferenceBox();
        movie.addBox(track);
        DataEntryUrlBox dataentryurlbox = new DataEntryUrlBox();
        dataentryurlbox.setFlags(1);
        track.addBox(dataentryurlbox);
        return movie;
    }

    public Box createFtyp(Movie movie)
    {
        movie = new LinkedList();
        movie.add("isom");
        movie.add("iso2");
        movie.add("avc1");
        return new FileTypeBox("isom", 0L, movie);
    }

    protected Box createMdat(final long startSample, final long endSample, final Track track, final int i)
    {
        return new _cls1Mdat();
    }

    protected Box createMdhd(Movie movie, Track track)
    {
        movie = new MediaHeaderBox();
        movie.setCreationTime(track.getTrackMetaData().getCreationTime());
        movie.setDuration(getDuration(track));
        movie.setTimescale(track.getTrackMetaData().getTimescale());
        movie.setLanguage(track.getTrackMetaData().getLanguage());
        return movie;
    }

    protected Box createMdia(Track track, Movie movie)
    {
        MediaBox mediabox = new MediaBox();
        mediabox.addBox(createMdhd(movie, track));
        mediabox.addBox(createMdiaHdlr(track, movie));
        mediabox.addBox(createMinf(track, movie));
        return mediabox;
    }

    protected Box createMdiaHdlr(Track track, Movie movie)
    {
        movie = new HandlerBox();
        movie.setHandlerType(track.getHandler());
        return movie;
    }

    protected Box createMfhd(long l, long l1, Track track, int i)
    {
        track = new MovieFragmentHeaderBox();
        track.setSequenceNumber(i);
        return track;
    }

    protected Box createMfra(Movie movie, Container container)
    {
        MovieFragmentRandomAccessBox moviefragmentrandomaccessbox = new MovieFragmentRandomAccessBox();
        movie = movie.getTracks().iterator();
        do
        {
            if (!movie.hasNext())
            {
                movie = new MovieFragmentRandomAccessOffsetBox();
                moviefragmentrandomaccessbox.addBox(movie);
                movie.setMfraSize(moviefragmentrandomaccessbox.getSize());
                return moviefragmentrandomaccessbox;
            }
            moviefragmentrandomaccessbox.addBox(createTfra((Track)movie.next(), container));
        } while (true);
    }

    protected Box createMinf(Track track, Movie movie)
    {
        MediaInformationBox mediainformationbox = new MediaInformationBox();
        mediainformationbox.addBox(track.getMediaHeaderBox());
        mediainformationbox.addBox(createDinf(movie, track));
        mediainformationbox.addBox(createStbl(movie, track));
        return mediainformationbox;
    }

    protected Box createMoof(long l, long l1, Track track, int i)
    {
        MovieFragmentBox moviefragmentbox = new MovieFragmentBox();
        moviefragmentbox.addBox(createMfhd(l, l1, track, i));
        moviefragmentbox.addBox(createTraf(l, l1, track, i));
        track = (TrackRunBox)moviefragmentbox.getTrackRunBoxes().get(0);
        track.setDataOffset(1);
        track.setDataOffset((int)(8L + moviefragmentbox.getSize()));
        return moviefragmentbox;
    }

    protected List createMoofMdat(Movie movie)
    {
        LinkedList linkedlist;
        HashMap hashmap;
        int j;
        int k;
        linkedlist = new LinkedList();
        hashmap = new HashMap();
        int i = 0;
        Iterator iterator = movie.getTracks().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                k = 1;
                j = 0;
                break MISSING_BLOCK_LABEL_46;
            }
            Track track = (Track)iterator.next();
            long al[] = intersectionFinder.sampleNumbers(track, movie);
            hashmap.put(track, al);
            i = Math.max(i, al.length);
        } while (true);
_L2:
        Iterator iterator1;
        if (j >= i)
        {
            return linkedlist;
        }
        iterator1 = sortTracksInSequence(movie.getTracks(), j, hashmap).iterator();
_L3:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            j++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Track track1 = (Track)iterator1.next();
        if (getAllowedHandlers().isEmpty() || getAllowedHandlers().contains(track1.getHandler()))
        {
            long al1[] = (long[])hashmap.get(track1);
            if (j < al1.length)
            {
                long l1 = al1[j];
                long l;
                if (j + 1 < al1.length)
                {
                    l = al1[j + 1];
                } else
                {
                    l = track1.getSamples().size() + 1;
                }
                if (l1 != l)
                {
                    linkedlist.add(createMoof(l1, l, track1, k));
                    linkedlist.add(createMdat(l1, l, track1, k));
                    k++;
                }
            }
        }
          goto _L3
    }

    protected Box createMoov(Movie movie)
    {
        MovieBox moviebox = new MovieBox();
        moviebox.addBox(createMvhd(movie));
        moviebox.addBox(createMvex(movie));
        Iterator iterator = movie.getTracks().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return moviebox;
            }
            moviebox.addBox(createTrak((Track)iterator.next(), movie));
        } while (true);
    }

    protected Box createMvex(Movie movie)
    {
        MovieExtendsBox movieextendsbox;
        Object obj;
        Iterator iterator;
        movieextendsbox = new MovieExtendsBox();
        obj = new MovieExtendsHeaderBox();
        iterator = movie.getTracks().iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        movieextendsbox.addBox(((Box) (obj)));
        obj = movie.getTracks().iterator();
_L4:
        if (!((Iterator) (obj)).hasNext())
        {
            return movieextendsbox;
        }
        break MISSING_BLOCK_LABEL_99;
_L2:
        long l = getTrackDuration(movie, (Track)iterator.next());
        if (((MovieExtendsHeaderBox) (obj)).getFragmentDuration() < l)
        {
            ((MovieExtendsHeaderBox) (obj)).setFragmentDuration(l);
        }
          goto _L3
        movieextendsbox.addBox(createTrex(movie, (Track)((Iterator) (obj)).next()));
          goto _L4
    }

    protected Box createMvhd(Movie movie)
    {
        MovieHeaderBox movieheaderbox;
        Iterator iterator;
        long l;
        long l3;
        movieheaderbox = new MovieHeaderBox();
        movieheaderbox.setVersion(1);
        movieheaderbox.setCreationTime(new Date());
        movieheaderbox.setModificationTime(new Date());
        l3 = movie.getTimescale();
        l = 0L;
        iterator = movie.getTracks().iterator();
_L3:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        movieheaderbox.setDuration(l);
        movieheaderbox.setTimescale(l3);
        l = 0L;
        movie = movie.getTracks().iterator();
_L4:
        if (!movie.hasNext())
        {
            movieheaderbox.setNextTrackId(l + 1L);
            return movieheaderbox;
        }
        break MISSING_BLOCK_LABEL_155;
_L2:
        Track track1 = (Track)iterator.next();
        long l1 = (getDuration(track1) * l3) / track1.getTrackMetaData().getTimescale();
        if (l1 > l)
        {
            l = l1;
        }
          goto _L3
        Track track = (Track)movie.next();
        long l2 = l;
        if (l < track.getTrackMetaData().getTrackId())
        {
            l2 = track.getTrackMetaData().getTrackId();
        }
        l = l2;
          goto _L4
    }

    protected Box createStbl(Movie movie, Track track)
    {
        movie = new SampleTableBox();
        movie.addBox(track.getSampleDescriptionBox());
        movie.addBox(new TimeToSampleBox());
        movie.addBox(new StaticChunkOffsetBox());
        return movie;
    }

    protected Box createTfhd(long l, long l1, Track track, int i)
    {
        TrackFragmentHeaderBox trackfragmentheaderbox = new TrackFragmentHeaderBox();
        trackfragmentheaderbox.setDefaultSampleFlags(new SampleFlags());
        trackfragmentheaderbox.setBaseDataOffset(-1L);
        trackfragmentheaderbox.setTrackId(track.getTrackMetaData().getTrackId());
        return trackfragmentheaderbox;
    }

    protected Box createTfra(Track track, Container container)
    {
        TrackFragmentRandomAccessBox trackfragmentrandomaccessbox;
        LinkedList linkedlist;
        Iterator iterator;
        long l;
        long l1;
        trackfragmentrandomaccessbox = new TrackFragmentRandomAccessBox();
        trackfragmentrandomaccessbox.setVersion(1);
        linkedlist = new LinkedList();
        l1 = 0L;
        l = 0L;
        iterator = container.getBoxes().iterator();
_L5:
        Box box;
        long l2;
        if (!iterator.hasNext())
        {
            trackfragmentrandomaccessbox.setEntries(linkedlist);
            trackfragmentrandomaccessbox.setTrackId(track.getTrackMetaData().getTrackId());
            return trackfragmentrandomaccessbox;
        }
        box = (Box)iterator.next();
        l2 = l;
        if (!(box instanceof MovieFragmentBox)) goto _L2; else goto _L1
_L1:
        List list;
        int i;
        list = ((MovieFragmentBox)box).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox);
        i = 0;
_L10:
        if (i < list.size()) goto _L4; else goto _L3
_L3:
        l2 = l;
_L2:
        l1 += box.getSize();
        l = l2;
          goto _L5
_L4:
        TrackFragmentBox trackfragmentbox;
        trackfragmentbox = (TrackFragmentBox)list.get(i);
        l2 = l;
        if (trackfragmentbox.getTrackFragmentHeaderBox().getTrackId() != track.getTrackMetaData().getTrackId()) goto _L7; else goto _L6
_L6:
        List list1;
        int j;
        list1 = trackfragmentbox.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox);
        j = 0;
_L11:
        if (j < list1.size()) goto _L9; else goto _L8
_L8:
        l2 = l;
_L7:
        i++;
        l = l2;
          goto _L10
_L9:
        LinkedList linkedlist1;
        TrackRunBox trackrunbox;
        int k;
        linkedlist1 = new LinkedList();
        trackrunbox = (TrackRunBox)list1.get(j);
        k = 0;
_L21:
label0:
        {
            if (k < trackrunbox.getEntries().size())
            {
                break label0;
            }
            Object obj;
            SampleFlags sampleflags;
            com.coremedia.iso.boxes.fragment.TrackRunBox.Entry entry;
            Iterator iterator1;
            Object obj1;
            if (linkedlist1.size() == trackrunbox.getEntries().size() && trackrunbox.getEntries().size() > 0)
            {
                linkedlist.add((com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry)linkedlist1.get(0));
            } else
            {
                linkedlist.addAll(linkedlist1);
            }
            j++;
        }
          goto _L11
        entry = (com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)trackrunbox.getEntries().get(k);
        sampleflags = null;
        if (k != 0 || !trackrunbox.isFirstSampleFlagsPresent()) goto _L13; else goto _L12
_L12:
        sampleflags = trackrunbox.getFirstSampleFlags();
_L15:
        if (sampleflags == null)
        {
            throw new RuntimeException("Could not find any SampleFlags to indicate random access or not");
        }
        break MISSING_BLOCK_LABEL_566;
_L13:
        if (!trackrunbox.isSampleFlagsPresent())
        {
            break; /* Loop/switch isn't completed */
        }
        sampleflags = entry.getSampleFlags();
        if (true) goto _L15; else goto _L14
_L14:
        obj = null;
        iterator1 = container.getBoxes().iterator();
_L20:
        if (iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_537;
        }
        iterator1 = ((MovieBox) (obj)).getBoxes(com/coremedia/iso/boxes/fragment/MovieExtendsBox).iterator();
        obj = sampleflags;
_L18:
        sampleflags = ((SampleFlags) (obj));
        if (!iterator1.hasNext()) goto _L15; else goto _L16
_L16:
        obj1 = ((MovieExtendsBox)iterator1.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackExtendsBox).iterator();
        sampleflags = ((SampleFlags) (obj));
_L19:
        obj = sampleflags;
        if (!((Iterator) (obj1)).hasNext()) goto _L18; else goto _L17
_L17:
        obj = (TrackExtendsBox)((Iterator) (obj1)).next();
        if (((TrackExtendsBox) (obj)).getTrackId() == track.getTrackMetaData().getTrackId())
        {
            sampleflags = ((TrackExtendsBox) (obj)).getDefaultSampleFlags();
        }
          goto _L19
        obj1 = (Box)iterator1.next();
        if (obj1 instanceof MovieBox)
        {
            obj = (MovieBox)obj1;
        }
          goto _L20
        if (sampleflags.getSampleDependsOn() == 2)
        {
            linkedlist1.add(new com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox.Entry(l, l1, i + 1, j + 1, k + 1));
        }
        l += entry.getSampleDuration();
        k++;
          goto _L21
    }

    protected Box createTkhd(Movie movie, Track track)
    {
        TrackHeaderBox trackheaderbox = new TrackHeaderBox();
        trackheaderbox.setVersion(1);
        int j = 0;
        if (track.isEnabled())
        {
            j = 0 + 1;
        }
        int i = j;
        if (track.isInMovie())
        {
            i = j + 2;
        }
        j = i;
        if (track.isInPreview())
        {
            j = i + 4;
        }
        i = j;
        if (track.isInPoster())
        {
            i = j + 8;
        }
        trackheaderbox.setFlags(i);
        trackheaderbox.setAlternateGroup(track.getTrackMetaData().getGroup());
        trackheaderbox.setCreationTime(track.getTrackMetaData().getCreationTime());
        trackheaderbox.setDuration(getTrackDuration(movie, track));
        trackheaderbox.setHeight(track.getTrackMetaData().getHeight());
        trackheaderbox.setWidth(track.getTrackMetaData().getWidth());
        trackheaderbox.setLayer(track.getTrackMetaData().getLayer());
        trackheaderbox.setModificationTime(new Date());
        trackheaderbox.setTrackId(track.getTrackMetaData().getTrackId());
        trackheaderbox.setVolume(track.getTrackMetaData().getVolume());
        return trackheaderbox;
    }

    protected Box createTraf(long l, long l1, Track track, int i)
    {
        TrackFragmentBox trackfragmentbox = new TrackFragmentBox();
        trackfragmentbox.addBox(createTfhd(l, l1, track, i));
        track = createTruns(l, l1, track, i).iterator();
        do
        {
            if (!track.hasNext())
            {
                return trackfragmentbox;
            }
            trackfragmentbox.addBox((Box)track.next());
        } while (true);
    }

    protected Box createTrak(Track track, Movie movie)
    {
        LOG.fine((new StringBuilder("Creating Track ")).append(track).toString());
        TrackBox trackbox = new TrackBox();
        trackbox.addBox(createTkhd(movie, track));
        trackbox.addBox(createMdia(track, movie));
        return trackbox;
    }

    protected Box createTrex(Movie movie, Track track)
    {
        movie = new TrackExtendsBox();
        movie.setTrackId(track.getTrackMetaData().getTrackId());
        movie.setDefaultSampleDescriptionIndex(1L);
        movie.setDefaultSampleDuration(0L);
        movie.setDefaultSampleSize(0L);
        SampleFlags sampleflags = new SampleFlags();
        if ("soun".equals(track.getHandler()) || "subt".equals(track.getHandler()))
        {
            sampleflags.setSampleDependsOn(2);
            sampleflags.setSampleIsDependedOn(2);
        }
        movie.setDefaultSampleFlags(sampleflags);
        return movie;
    }

    protected List createTruns(long l, long l1, Track track, int i)
    {
        TrackRunBox trackrunbox;
        long al[];
        ArrayList arraylist;
        LinkedList linkedlist1;
        long l2;
        trackrunbox = new TrackRunBox();
        al = getSampleSizes(l, l1, track, i);
        trackrunbox.setSampleDurationPresent(true);
        trackrunbox.setSampleSizePresent(true);
        arraylist = new ArrayList(CastUtils.l2i(l1 - l));
        linkedlist1 = new LinkedList(track.getDecodingTimeEntries());
        l2 = l - 1L;
        l1 = ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist1.peek()).getCount();
_L5:
        if (l2 > l1) goto _L2; else goto _L1
_L1:
        LinkedList linkedlist;
        long l3;
        boolean flag;
        long l4 = l1 - l2;
        if (track.getCompositionTimeEntries() != null && track.getCompositionTimeEntries().size() > 0)
        {
            linkedlist = new LinkedList(track.getCompositionTimeEntries());
        } else
        {
            linkedlist = null;
        }
        if (linkedlist != null)
        {
            i = ((com.coremedia.iso.boxes.CompositionTimeToSample.Entry)linkedlist.peek()).getCount();
        } else
        {
            i = -1;
        }
        l1 = i;
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        trackrunbox.setSampleCompositionTimeOffsetPresent(flag);
        l3 = 1L;
_L6:
        if (l3 < l) goto _L4; else goto _L3
_L3:
        if ((track.getSampleDependencies() == null || track.getSampleDependencies().isEmpty()) && (track.getSyncSamples() == null || track.getSyncSamples().length == 0))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        trackrunbox.setSampleFlagsPresent(flag);
        i = 0;
        l2 = l4;
        l3 = l1;
_L7:
        if (i >= al.length)
        {
            trackrunbox.setEntries(arraylist);
            return Collections.singletonList(trackrunbox);
        }
        break MISSING_BLOCK_LABEL_400;
_L2:
        l2 -= l1;
        linkedlist1.remove();
        l1 = ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist1.peek()).getCount();
          goto _L5
_L4:
        l2 = l1;
        if (linkedlist != null)
        {
            l1--;
            l2 = l1;
            if (l1 == 0L)
            {
                l2 = l1;
                if (linkedlist.size() > 1)
                {
                    linkedlist.remove();
                    l2 = ((com.coremedia.iso.boxes.CompositionTimeToSample.Entry)linkedlist.element()).getCount();
                }
            }
        }
        l3++;
        l1 = l2;
          goto _L6
        com.coremedia.iso.boxes.fragment.TrackRunBox.Entry entry = new com.coremedia.iso.boxes.fragment.TrackRunBox.Entry();
        entry.setSampleSize(al[i]);
        if (flag)
        {
            SampleFlags sampleflags = new SampleFlags();
            if (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty())
            {
                com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry entry1 = (com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry)track.getSampleDependencies().get(i);
                sampleflags.setSampleDependsOn(entry1.getSampleDependsOn());
                sampleflags.setSampleIsDependedOn(entry1.getSampleIsDependentOn());
                sampleflags.setSampleHasRedundancy(entry1.getSampleHasRedundancy());
            }
            if (track.getSyncSamples() != null && track.getSyncSamples().length > 0)
            {
                if (Arrays.binarySearch(track.getSyncSamples(), (long)i + l) >= 0)
                {
                    sampleflags.setSampleIsDifferenceSample(false);
                    sampleflags.setSampleDependsOn(2);
                } else
                {
                    sampleflags.setSampleIsDifferenceSample(true);
                    sampleflags.setSampleDependsOn(1);
                }
            }
            entry.setSampleFlags(sampleflags);
        }
        entry.setSampleDuration(((com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist1.peek()).getDelta());
        l2--;
        l1 = l2;
        if (l2 == 0L)
        {
            l1 = l2;
            if (linkedlist1.size() > 1)
            {
                linkedlist1.remove();
                l1 = ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist1.peek()).getCount();
            }
        }
        l2 = l3;
        if (linkedlist != null)
        {
            entry.setSampleCompositionTimeOffset(((com.coremedia.iso.boxes.CompositionTimeToSample.Entry)linkedlist.peek()).getOffset());
            l3--;
            l2 = l3;
            if (l3 == 0L)
            {
                l2 = l3;
                if (linkedlist.size() > 1)
                {
                    linkedlist.remove();
                    l2 = ((com.coremedia.iso.boxes.CompositionTimeToSample.Entry)linkedlist.element()).getCount();
                }
            }
        }
        arraylist.add(entry);
        i++;
        l3 = l2;
        l2 = l1;
          goto _L7
    }

    public List getAllowedHandlers()
    {
        return Arrays.asList(new String[] {
            "soun", "vide"
        });
    }

    protected long getDuration(Track track)
    {
        long l = 0L;
        track = track.getDecodingTimeEntries().iterator();
        do
        {
            if (!track.hasNext())
            {
                return l;
            }
            com.coremedia.iso.boxes.TimeToSampleBox.Entry entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)track.next();
            l += entry.getCount() * entry.getDelta();
        } while (true);
    }

    public FragmentIntersectionFinder getFragmentIntersectionFinder()
    {
        return intersectionFinder;
    }

    protected long[] getSampleSizes(long l, long l1, Track track, int i)
    {
        track = getSamples(l, l1, track, i);
        long al[] = new long[track.size()];
        i = 0;
        do
        {
            if (i >= al.length)
            {
                return al;
            }
            al[i] = ((Sample)track.get(i)).remaining();
            i++;
        } while (true);
    }

    protected List getSamples(long l, long l1, Track track, int i)
    {
        return track.getSamples().subList(CastUtils.l2i(l) - 1, CastUtils.l2i(l1) - 1);
    }

    public void setIntersectionFinder(FragmentIntersectionFinder fragmentintersectionfinder)
    {
        intersectionFinder = fragmentintersectionfinder;
    }

    protected List sortTracksInSequence(List list, final int cycle, final Map intersectionMap)
    {
        list = new LinkedList(list);
        Collections.sort(list, new Comparator() {

            final FragmentedMp4Builder this$0;
            private final int val$cycle;
            private final Map val$intersectionMap;

            public int compare(Track track, Track track1)
            {
                long al[];
                long al1[];
                int i;
                long l;
                long l1;
                long l2;
                long l3;
                l3 = ((long[])intersectionMap.get(track))[cycle];
                l2 = ((long[])intersectionMap.get(track1))[cycle];
                al = TimeToSampleBox.blowupTimeToSamples(track.getDecodingTimeEntries());
                al1 = TimeToSampleBox.blowupTimeToSamples(track1.getDecodingTimeEntries());
                l = 0L;
                l1 = 0L;
                i = 1;
_L3:
                if ((long)i < l3) goto _L2; else goto _L1
_L1:
                i = 1;
_L4:
                if ((long)i >= l2)
                {
                    return (int)(((double)l / (double)track.getTrackMetaData().getTimescale() - (double)l1 / (double)track1.getTrackMetaData().getTimescale()) * 100D);
                }
                break MISSING_BLOCK_LABEL_146;
_L2:
                l += al[i - 1];
                i++;
                  goto _L3
                l1 += al1[i - 1];
                i++;
                  goto _L4
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((Track)obj, (Track)obj1);
            }

            
            {
                this$0 = FragmentedMp4Builder.this;
                intersectionMap = map;
                cycle = i;
                super();
            }
        });
        return list;
    }

}
