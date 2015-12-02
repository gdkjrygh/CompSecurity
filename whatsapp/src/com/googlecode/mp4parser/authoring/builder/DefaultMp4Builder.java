// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
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
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            Mp4Builder, TwoSecondIntersectionFinder, FragmentIntersectionFinder

public class DefaultMp4Builder
    implements Mp4Builder
{
    private class InterleaveChunkMdat
        implements Box
    {

        List chunkList;
        long contentSize;
        Container parent;
        final DefaultMp4Builder this$0;
        List tracks;

        private boolean isSmallBox(long l)
        {
            return 8L + l < 0x100000000L;
        }

        public void getBox(WritableByteChannel writablebytechannel)
            throws IOException
        {
            Object obj = ByteBuffer.allocate(16);
            long l = getSize();
            if (isSmallBox(l))
            {
                IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), l);
            } else
            {
                IsoTypeWriter.writeUInt32(((ByteBuffer) (obj)), 1L);
            }
            ((ByteBuffer) (obj)).put(IsoFile.fourCCtoBytes("mdat"));
            if (isSmallBox(l))
            {
                ((ByteBuffer) (obj)).put(new byte[8]);
            } else
            {
                IsoTypeWriter.writeUInt64(((ByteBuffer) (obj)), l);
            }
            ((ByteBuffer) (obj)).rewind();
            writablebytechannel.write(((ByteBuffer) (obj)));
            obj = chunkList.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    return;
                }
                Iterator iterator = ((List)((Iterator) (obj)).next()).iterator();
                while (iterator.hasNext()) 
                {
                    ((Sample)iterator.next()).writeTo(writablebytechannel);
                }
            } while (true);
        }

        public long getDataOffset()
        {
            Object obj;
            long l;
            obj = this;
            l = 16L;
_L3:
            Iterator iterator;
            if (!(obj instanceof Box))
            {
                return l;
            }
            iterator = ((Box)obj).getParent().getBoxes().iterator();
_L5:
            if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
            Box box;
            obj = ((Box)obj).getParent();
              goto _L3
_L2:
            if (obj == (box = (Box)iterator.next())) goto _L1; else goto _L4
_L4:
            l += box.getSize();
              goto _L5
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
            return 16L + contentSize;
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

        private InterleaveChunkMdat(Movie movie, Map map, long l)
        {
            int i;
            this$0 = DefaultMp4Builder.this;
            super();
            chunkList = new ArrayList();
            contentSize = l;
            tracks = movie.getTracks();
            i = 0;
_L2:
            if (i >= ((int[])map.values().iterator().next()).length)
            {
                return;
            }
            movie = tracks.iterator();
_L3:
label0:
            {
                if (movie.hasNext())
                {
                    break label0;
                }
                i++;
            }
            if (true) goto _L2; else goto _L1
_L1:
            Object obj;
            int ai[];
            int j;
            obj = (Track)movie.next();
            ai = (int[])map.get(obj);
            l = 0L;
            j = 0;
_L4:
label1:
            {
                if (j < i)
                {
                    break label1;
                }
                obj = ((List)track2Sample.get(obj)).subList(CastUtils.l2i(l), CastUtils.l2i((long)ai[i] + l));
                chunkList.add(obj);
            }
              goto _L3
            l += ai[j];
            j++;
              goto _L4
        }

        InterleaveChunkMdat(Movie movie, Map map, long l, InterleaveChunkMdat interleavechunkmdat)
        {
            this(movie, map, l);
        }
    }


    static final boolean $assertionsDisabled;
    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/builder/DefaultMp4Builder.getName());
    Set chunkOffsetBoxes;
    private FragmentIntersectionFinder intersectionFinder;
    HashMap track2Sample;
    HashMap track2SampleSizes;

    public DefaultMp4Builder()
    {
        chunkOffsetBoxes = new HashSet();
        track2Sample = new HashMap();
        track2SampleSizes = new HashMap();
        intersectionFinder = new TwoSecondIntersectionFinder();
    }

    public static long gcd(long l, long l1)
    {
        if (l1 == 0L)
        {
            return l;
        } else
        {
            return gcd(l1, l % l1);
        }
    }

    protected static long getDuration(Track track)
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

    private static long sum(int ai[])
    {
        long l = 0L;
        int j = ai.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l;
            }
            l += ai[i];
            i++;
        } while (true);
    }

    private static long sum(long al[])
    {
        long l = 0L;
        int j = al.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l;
            }
            l += al[i];
            i++;
        } while (true);
    }

    public Container build(Movie movie)
    {
        Object obj;
        LOG.fine((new StringBuilder("Creating movie ")).append(movie).toString());
        obj = movie.getTracks().iterator();
_L7:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        obj = new BasicContainer();
        ((BasicContainer) (obj)).addBox(createFileTypeBox(movie));
        obj1 = new HashMap();
        obj2 = movie.getTracks().iterator();
_L9:
        if (((Iterator) (obj2)).hasNext()) goto _L4; else goto _L3
_L3:
        long l;
        obj2 = createMovieBox(movie, ((Map) (obj1)));
        ((BasicContainer) (obj)).addBox(((Box) (obj2)));
        obj2 = Path.getPaths(((Box) (obj2)), "trak/mdia/minf/stbl/stsz");
        l = 0L;
        obj2 = ((List) (obj2)).iterator();
_L10:
        if (((Iterator) (obj2)).hasNext()) goto _L6; else goto _L5
_L5:
        movie = new InterleaveChunkMdat(movie, ((Map) (obj1)), l, null);
        ((BasicContainer) (obj)).addBox(movie);
        l = movie.getDataOffset();
        movie = chunkOffsetBoxes.iterator();
_L11:
        if (!movie.hasNext())
        {
            return ((Container) (obj));
        }
        break MISSING_BLOCK_LABEL_329;
_L2:
        long al1[];
        int i;
        obj1 = (Track)((Iterator) (obj)).next();
        obj2 = ((Track) (obj1)).getSamples();
        putSamples(((Track) (obj1)), ((List) (obj2)));
        al1 = new long[((List) (obj2)).size()];
        i = 0;
_L8:
label0:
        {
            if (i < al1.length)
            {
                break label0;
            }
            track2SampleSizes.put(obj1, al1);
        }
          goto _L7
        al1[i] = ((Sample)((List) (obj2)).get(i)).remaining();
        i++;
          goto _L8
_L4:
        Track track = (Track)((Iterator) (obj2)).next();
        ((Map) (obj1)).put(track, getChunkSizes(track, movie));
          goto _L9
_L6:
        l += sum(((SampleSizeBox)(Box)((Iterator) (obj2)).next()).getSampleSizes());
          goto _L10
        long al[] = ((StaticChunkOffsetBox)movie.next()).getChunkOffsets();
        int j = 0;
        while (j < al.length) 
        {
            al[j] = al[j] + l;
            j++;
        }
          goto _L11
    }

    protected FileTypeBox createFileTypeBox(Movie movie)
    {
        movie = new LinkedList();
        movie.add("isom");
        movie.add("iso2");
        movie.add("avc1");
        return new FileTypeBox("isom", 0L, movie);
    }

    protected MovieBox createMovieBox(Movie movie, Map map)
    {
        MovieBox moviebox;
        Object obj;
        Iterator iterator;
        long l;
        long l3;
        moviebox = new MovieBox();
        obj = new MovieHeaderBox();
        ((MovieHeaderBox) (obj)).setCreationTime(new Date());
        ((MovieHeaderBox) (obj)).setModificationTime(new Date());
        ((MovieHeaderBox) (obj)).setMatrix(movie.getMatrix());
        l3 = getTimescale(movie);
        l = 0L;
        iterator = movie.getTracks().iterator();
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ((MovieHeaderBox) (obj)).setDuration(l);
        ((MovieHeaderBox) (obj)).setTimescale(l3);
        l = 0L;
        iterator = movie.getTracks().iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        ((MovieHeaderBox) (obj)).setNextTrackId(l + 1L);
        moviebox.addBox(((Box) (obj)));
        obj = movie.getTracks().iterator();
_L7:
        if (!((Iterator) (obj)).hasNext())
        {
            movie = createUdta(movie);
            if (movie != null)
            {
                moviebox.addBox(movie);
            }
            return moviebox;
        }
        break MISSING_BLOCK_LABEL_271;
_L2:
        Track track = (Track)iterator.next();
        long l1 = (getDuration(track) * l3) / track.getTrackMetaData().getTimescale();
        if (l1 > l)
        {
            l = l1;
        }
          goto _L5
_L4:
        Track track1 = (Track)iterator.next();
        long l2 = l;
        if (l < track1.getTrackMetaData().getTrackId())
        {
            l2 = track1.getTrackMetaData().getTrackId();
        }
        l = l2;
          goto _L6
        moviebox.addBox(createTrackBox((Track)((Iterator) (obj)).next(), movie, map));
          goto _L7
    }

    protected TrackBox createTrackBox(Track track, Movie movie, Map map)
    {
        long al1[];
        int i;
        long l;
        TrackBox trackbox = new TrackBox();
        Object obj = new TrackHeaderBox();
        ((TrackHeaderBox) (obj)).setEnabled(track.isEnabled());
        ((TrackHeaderBox) (obj)).setInMovie(track.isInMovie());
        ((TrackHeaderBox) (obj)).setInPreview(track.isInPreview());
        ((TrackHeaderBox) (obj)).setInPoster(track.isInPoster());
        ((TrackHeaderBox) (obj)).setMatrix(track.getTrackMetaData().getMatrix());
        ((TrackHeaderBox) (obj)).setAlternateGroup(track.getTrackMetaData().getGroup());
        ((TrackHeaderBox) (obj)).setCreationTime(track.getTrackMetaData().getCreationTime());
        ((TrackHeaderBox) (obj)).setDuration((getDuration(track) * getTimescale(movie)) / track.getTrackMetaData().getTimescale());
        ((TrackHeaderBox) (obj)).setHeight(track.getTrackMetaData().getHeight());
        ((TrackHeaderBox) (obj)).setWidth(track.getTrackMetaData().getWidth());
        ((TrackHeaderBox) (obj)).setLayer(track.getTrackMetaData().getLayer());
        ((TrackHeaderBox) (obj)).setModificationTime(new Date());
        ((TrackHeaderBox) (obj)).setTrackId(track.getTrackMetaData().getTrackId());
        ((TrackHeaderBox) (obj)).setVolume(track.getTrackMetaData().getVolume());
        trackbox.addBox(((Box) (obj)));
        obj = new MediaBox();
        trackbox.addBox(((Box) (obj)));
        Object obj1 = new MediaHeaderBox();
        ((MediaHeaderBox) (obj1)).setCreationTime(track.getTrackMetaData().getCreationTime());
        ((MediaHeaderBox) (obj1)).setDuration(getDuration(track));
        ((MediaHeaderBox) (obj1)).setTimescale(track.getTrackMetaData().getTimescale());
        ((MediaHeaderBox) (obj1)).setLanguage(track.getTrackMetaData().getLanguage());
        ((MediaBox) (obj)).addBox(((Box) (obj1)));
        obj1 = new HandlerBox();
        ((MediaBox) (obj)).addBox(((Box) (obj1)));
        ((HandlerBox) (obj1)).setHandlerType(track.getHandler());
        obj1 = new MediaInformationBox();
        ((MediaInformationBox) (obj1)).addBox(track.getMediaHeaderBox());
        Object obj2 = new DataInformationBox();
        Object obj3 = new DataReferenceBox();
        ((DataInformationBox) (obj2)).addBox(((Box) (obj3)));
        Object obj4 = new DataEntryUrlBox();
        ((DataEntryUrlBox) (obj4)).setFlags(1);
        ((DataReferenceBox) (obj3)).addBox(((Box) (obj4)));
        ((MediaInformationBox) (obj1)).addBox(((Box) (obj2)));
        obj2 = new SampleTableBox();
        ((SampleTableBox) (obj2)).addBox(track.getSampleDescriptionBox());
        obj3 = track.getDecodingTimeEntries();
        if (obj3 != null && !((List) (obj3)).isEmpty())
        {
            obj4 = new TimeToSampleBox();
            ((TimeToSampleBox) (obj4)).setEntries(((List) (obj3)));
            ((SampleTableBox) (obj2)).addBox(((Box) (obj4)));
        }
        obj3 = track.getCompositionTimeEntries();
        if (obj3 != null && !((List) (obj3)).isEmpty())
        {
            obj4 = new CompositionTimeToSample();
            ((CompositionTimeToSample) (obj4)).setEntries(((List) (obj3)));
            ((SampleTableBox) (obj2)).addBox(((Box) (obj4)));
        }
        long al[] = track.getSyncSamples();
        if (al != null && al.length > 0)
        {
            obj4 = new SyncSampleBox();
            ((SyncSampleBox) (obj4)).setSampleNumber(al);
            ((SampleTableBox) (obj2)).addBox(((Box) (obj4)));
        }
        if (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty())
        {
            SampleDependencyTypeBox sampledependencytypebox = new SampleDependencyTypeBox();
            sampledependencytypebox.setEntries(track.getSampleDependencies());
            ((SampleTableBox) (obj2)).addBox(sampledependencytypebox);
        }
        sampledependencytypebox = (int[])map.get(track);
        obj4 = new SampleToChunkBox();
        ((SampleToChunkBox) (obj4)).setEntries(new LinkedList());
        l = 0xffffffff80000000L;
        i = 0;
        do
        {
            if (i >= sampledependencytypebox.length)
            {
                ((SampleTableBox) (obj2)).addBox(((Box) (obj4)));
                obj4 = new SampleSizeBox();
                ((SampleSizeBox) (obj4)).setSampleSizes((long[])track2SampleSizes.get(track));
                ((SampleTableBox) (obj2)).addBox(((Box) (obj4)));
                obj4 = new StaticChunkOffsetBox();
                chunkOffsetBoxes.add(obj4);
                l = 0L;
                al1 = new long[sampledependencytypebox.length];
                if (LOG.isLoggable(Level.FINE))
                {
                    LOG.fine((new StringBuilder("Calculating chunk offsets for track_")).append(track.getTrackMetaData().getTrackId()).toString());
                }
                i = 0;
                break MISSING_BLOCK_LABEL_771;
            }
            long l1 = l;
            if (l != (long)sampledependencytypebox[i])
            {
                ((SampleToChunkBox) (obj4)).getEntries().add(new com.coremedia.iso.boxes.SampleToChunkBox.Entry(i + 1, sampledependencytypebox[i], 1L));
                l1 = sampledependencytypebox[i];
            }
            i++;
            l = l1;
        } while (true);
_L2:
        Iterator iterator;
        if (i >= sampledependencytypebox.length)
        {
            ((StaticChunkOffsetBox) (obj4)).setChunkOffsets(al1);
            ((SampleTableBox) (obj2)).addBox(((Box) (obj4)));
            ((MediaInformationBox) (obj1)).addBox(((Box) (obj2)));
            ((MediaBox) (obj)).addBox(((Box) (obj1)));
            return trackbox;
        }
        if (LOG.isLoggable(Level.FINER))
        {
            LOG.finer((new StringBuilder("Calculating chunk offsets for track_")).append(track.getTrackMetaData().getTrackId()).append(" chunk ").append(i).toString());
        }
        iterator = movie.getTracks().iterator();
_L4:
label0:
        {
            if (iterator.hasNext())
            {
                break label0;
            }
            i++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        Track track1;
        int ai[];
        int j;
        long l2;
        track1 = (Track)iterator.next();
        if (LOG.isLoggable(Level.FINEST))
        {
            LOG.finest((new StringBuilder("Adding offsets of track_")).append(track1.getTrackMetaData().getTrackId()).toString());
        }
        ai = (int[])map.get(track1);
        l2 = 0L;
        j = 0;
_L6:
        long l3;
        if (j < i)
        {
            break MISSING_BLOCK_LABEL_1116;
        }
        if (track1 == track)
        {
            al1[i] = l;
        }
        j = CastUtils.l2i(l2);
        l3 = l;
_L5:
        l = l3;
        if ((long)j >= (long)ai[i] + l2) goto _L4; else goto _L3
_L3:
        l3 += ((long[])track2SampleSizes.get(track1))[j];
        j++;
          goto _L5
          goto _L4
        l2 += ai[j];
        j++;
          goto _L6
    }

    protected Box createUdta(Movie movie)
    {
        return null;
    }

    int[] getChunkSizes(Track track, Movie movie)
    {
        movie = intersectionFinder.sampleNumbers(track, movie);
        int ai[] = new int[movie.length];
        int i = 0;
        do
        {
            long l;
            long l1;
            if (i >= movie.length)
            {
                if (!$assertionsDisabled && (long)((List)track2Sample.get(track)).size() != sum(ai))
                {
                    throw new AssertionError("The number of samples and the sum of all chunk lengths must be equal");
                } else
                {
                    return ai;
                }
            }
            l1 = movie[i];
            if (movie.length == i + 1)
            {
                l = track.getSamples().size();
            } else
            {
                l = movie[i + 1] - 1L;
            }
            ai[i] = CastUtils.l2i(l - (l1 - 1L));
            i++;
        } while (true);
    }

    public long getTimescale(Movie movie)
    {
        long l = ((Track)movie.getTracks().iterator().next()).getTrackMetaData().getTimescale();
        movie = movie.getTracks().iterator();
        do
        {
            if (!movie.hasNext())
            {
                return l;
            }
            l = gcd(((Track)movie.next()).getTrackMetaData().getTimescale(), l);
        } while (true);
    }

    protected List putSamples(Track track, List list)
    {
        return (List)track2Sample.put(track, list);
    }

    public void setIntersectionFinder(FragmentIntersectionFinder fragmentintersectionfinder)
    {
        intersectionFinder = fragmentintersectionfinder;
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/builder/DefaultMp4Builder.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
