// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.util.Math;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.builder:
//            FragmentIntersectionFinder

public class SyncSampleIntersectFinderImpl
    implements FragmentIntersectionFinder
{
    public static class CacheTuple
    {

        Movie movie;
        Track track;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (CacheTuple)obj;
                if (movie == null ? ((CacheTuple) (obj)).movie != null : !movie.equals(((CacheTuple) (obj)).movie))
                {
                    return false;
                }
                if (track == null ? ((CacheTuple) (obj)).track != null : !track.equals(((CacheTuple) (obj)).track))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (track != null)
            {
                i = track.hashCode();
            } else
            {
                i = 0;
            }
            if (movie != null)
            {
                j = movie.hashCode();
            }
            return i * 31 + j;
        }

        public CacheTuple(Track track1, Movie movie1)
        {
            track = track1;
            movie = movie1;
        }
    }


    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/builder/SyncSampleIntersectFinderImpl.getName());
    private static Map getSampleNumbersCache = new ConcurrentHashMap();
    private static Map getTimesCache = new ConcurrentHashMap();
    private final int minFragmentDurationSeconds;

    public SyncSampleIntersectFinderImpl()
    {
        minFragmentDurationSeconds = 0;
    }

    public SyncSampleIntersectFinderImpl(int i)
    {
        minFragmentDurationSeconds = i;
    }

    private static long calculateTracktimesScalingFactor(Movie movie, Track track)
    {
        long l = 1L;
        movie = movie.getTracks().iterator();
        do
        {
            Track track1;
            do
            {
                if (!movie.hasNext())
                {
                    return l;
                }
                track1 = (Track)movie.next();
            } while (!track1.getHandler().equals(track.getHandler()) || track1.getTrackMetaData().getTimescale() == track.getTrackMetaData().getTimescale());
            l = Math.lcm(l, track1.getTrackMetaData().getTimescale());
        } while (true);
    }

    public static List getSyncSamplesTimestamps(Movie movie, Track track)
    {
        LinkedList linkedlist = new LinkedList();
        Iterator iterator = movie.getTracks().iterator();
        do
        {
            Track track1;
            long al[];
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        return linkedlist;
                    }
                    track1 = (Track)iterator.next();
                } while (!track1.getHandler().equals(track.getHandler()));
                al = track1.getSyncSamples();
            } while (al == null || al.length <= 0);
            linkedlist.add(getTimes(track1, movie));
        } while (true);
    }

    private static long[] getTimes(Track track, Movie movie)
    {
        CacheTuple cachetuple = new CacheTuple(track, movie);
        long al[] = (long[])getTimesCache.get(cachetuple);
        if (al != null)
        {
            return al;
        }
        al = track.getSyncSamples();
        long al1[] = new long[al.length];
        LinkedList linkedlist = new LinkedList(track.getDecodingTimeEntries());
        int i = 1;
        long l1 = 0L;
        long l2 = 0L;
        int j = 0;
        long l = 0L;
        long l3 = calculateTracktimesScalingFactor(movie, track);
        do
        {
            if ((long)i > al[al.length - 1])
            {
                getTimesCache.put(cachetuple, al1);
                return al1;
            }
            int k = j;
            if ((long)i == al[j])
            {
                al1[j] = l1 * l3;
                k = j + 1;
            }
            if (l == 0L)
            {
                track = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)linkedlist.poll();
                l = track.getCount() - 1L;
                l2 = track.getDelta();
            } else
            {
                l--;
            }
            l1 += l2;
            i++;
            j = k;
        } while (true);
    }

    public transient long[] getCommonIndices(long al[], long al1[], long l, long al2[][])
    {
        Object obj;
        LinkedList linkedlist;
        int i;
        obj = new LinkedList();
        linkedlist = new LinkedList();
        i = 0;
_L5:
        if (i < al1.length) goto _L2; else goto _L1
_L1:
        if ((double)((List) (obj)).size() >= (double)al.length * 0.25D)
        {
            break MISSING_BLOCK_LABEL_430;
        }
        al1 = (new StringBuilder(String.valueOf(""))).append(String.format("%5d - Common:  [", new Object[] {
            Integer.valueOf(((List) (obj)).size())
        })).toString();
        al2 = ((List) (obj)).iterator();
_L7:
        if (al2.hasNext()) goto _L4; else goto _L3
_L3:
        int j;
        al1 = (new StringBuilder(String.valueOf(al1))).append("]").toString();
        LOG.warning(al1);
        al1 = (new StringBuilder(String.valueOf(""))).append(String.format("%5d - In    :  [", new Object[] {
            Integer.valueOf(al.length)
        })).toString();
        j = al.length;
        i = 0;
_L8:
        if (i >= j)
        {
            al = (new StringBuilder(String.valueOf(al1))).append("]").toString();
            LOG.warning(al);
            LOG.warning("There are less than 25% of common sync samples in the given track.");
            throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        }
        break MISSING_BLOCK_LABEL_382;
_L2:
        boolean flag;
        int k;
        flag = true;
        k = al2.length;
        j = 0;
_L6:
label0:
        {
            if (j < k)
            {
                break label0;
            }
            if (flag)
            {
                ((List) (obj)).add(Long.valueOf(al[i]));
                linkedlist.add(Long.valueOf(al1[i]));
            }
            i++;
        }
          goto _L5
        boolean flag1;
        if (Arrays.binarySearch(al2[j], al1[i]) >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag &= flag1;
        j++;
          goto _L6
_L4:
        l = ((Long)al2.next()).longValue();
        al1 = (new StringBuilder(String.valueOf(al1))).append(String.format("%10d,", new Object[] {
            Long.valueOf(l)
        })).toString();
          goto _L7
        l = al[i];
        al1 = (new StringBuilder(String.valueOf(al1))).append(String.format("%10d,", new Object[] {
            Long.valueOf(l)
        })).toString();
        i++;
          goto _L8
        long l1;
        if ((double)((List) (obj)).size() < (double)al.length * 0.5D)
        {
            LOG.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        } else
        if (((List) (obj)).size() < al.length)
        {
            LOG.finest((new StringBuilder("Common SyncSample positions vs. this tracks SyncSample positions: ")).append(((List) (obj)).size()).append(" vs. ").append(al.length).toString());
        }
        al1 = new LinkedList();
        if (minFragmentDurationSeconds <= 0) goto _L10; else goto _L9
_L9:
        l1 = -1L;
        al2 = ((List) (obj)).iterator();
        obj = linkedlist.iterator();
_L15:
        al = al1;
        if (!al2.hasNext()) goto _L12; else goto _L11
_L11:
        if (((Iterator) (obj)).hasNext()) goto _L14; else goto _L13
_L13:
        al = al1;
_L12:
        al1 = new long[al.size()];
        i = 0;
_L16:
        if (i >= al1.length)
        {
            return al1;
        }
        break MISSING_BLOCK_LABEL_673;
_L14:
        long l3 = ((Long)al2.next()).longValue();
        long l2 = ((Long)((Iterator) (obj)).next()).longValue();
        if (l1 == -1L || (l2 - l1) / l >= (long)minFragmentDurationSeconds)
        {
            al1.add(Long.valueOf(l3));
            l1 = l2;
        }
          goto _L15
_L10:
        al = ((long []) (obj));
          goto _L12
        al1[i] = ((Long)al.get(i)).longValue();
        i++;
          goto _L16
    }

    public long[] sampleNumbers(Track track, Movie movie)
    {
        CacheTuple cachetuple;
        cachetuple = new CacheTuple(track, movie);
        long al[] = (long[])getSampleNumbersCache.get(cachetuple);
        if (al != null)
        {
            return al;
        }
        if ("vide".equals(track.getHandler()))
        {
            if (track.getSyncSamples() != null && track.getSyncSamples().length > 0)
            {
                List list = getSyncSamplesTimestamps(movie, track);
                track = getCommonIndices(track.getSyncSamples(), getTimes(track, movie), track.getTrackMetaData().getTimescale(), (long[][])list.toArray(new long[list.size()][]));
                getSampleNumbersCache.put(cachetuple, track);
                return track;
            } else
            {
                throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
            }
        }
        if (!"soun".equals(track.getHandler())) goto _L2; else goto _L1
_L1:
        long al1[];
        Object obj1;
        al1 = null;
        obj1 = movie.getTracks().iterator();
_L13:
        if (((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        Object obj;
        int i;
        long l;
        if (al1 == null)
        {
            break MISSING_BLOCK_LABEL_563;
        }
        obj = sampleNumbers(((Track) (al1)), movie);
        i = al1.getSamples().size();
        al1 = new long[obj.length];
        l = 0x2ee00L;
        movie = movie.getTracks().iterator();
_L8:
        if (movie.hasNext()) goto _L6; else goto _L5
_L5:
        double d;
        long l1;
        movie = (AudioSampleEntry)track.getSampleDescriptionBox().getSampleEntry();
        l1 = ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)track.getDecodingTimeEntries().get(0)).getDelta();
        d = (double)movie.getSampleRate() / (double)l;
        if (d != Math.rint(d))
        {
            throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
        }
        break MISSING_BLOCK_LABEL_507;
_L4:
        obj = (Track)((Iterator) (obj1)).next();
        if (((Track) (obj)).getSyncSamples() != null && "vide".equals(((Track) (obj)).getHandler()) && ((Track) (obj)).getSyncSamples().length > 0)
        {
            al1 = ((long []) (obj));
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj1 = (Track)movie.next();
        if (!"soun".equals(((Track) (obj1)).getHandler())) goto _L8; else goto _L7
_L7:
        AudioSampleEntry audiosampleentry = (AudioSampleEntry)((Track) (obj1)).getSampleDescriptionBox().getSampleEntry();
        if (audiosampleentry.getSampleRate() >= 0x2ee00L) goto _L8; else goto _L9
_L9:
        long l2;
        l1 = audiosampleentry.getSampleRate();
        d = (double)(long)((Track) (obj1)).getSamples().size() / (double)i;
        l2 = ((com.coremedia.iso.boxes.TimeToSampleBox.Entry)((Track) (obj1)).getDecodingTimeEntries().get(0)).getDelta();
        i = 0;
_L11:
        l = l1;
        if (i >= al1.length) goto _L5; else goto _L10
_L10:
        al1[i] = (long)Math.ceil((double)(obj[i] - 1L) * d * (double)l2);
        i++;
          goto _L11
          goto _L5
        int j = 0;
        do
        {
            if (j >= al1.length)
            {
                getSampleNumbersCache.put(cachetuple, al1);
                return al1;
            }
            al1[j] = (long)(1.0D + ((double)al1[j] * d) / (double)l1);
            j++;
        } while (true);
        throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
_L2:
        Iterator iterator = movie.getTracks().iterator();
        Track track1;
        do
        {
            if (!iterator.hasNext())
            {
                throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
            }
            track1 = (Track)iterator.next();
        } while (track1.getSyncSamples() == null || track1.getSyncSamples().length <= 0);
        movie = sampleNumbers(track1, movie);
        int k = track1.getSamples().size();
        long al2[] = new long[movie.length];
        double d1 = (double)(long)track.getSamples().size() / (double)k;
        k = 0;
        do
        {
            if (k >= al2.length)
            {
                getSampleNumbersCache.put(cachetuple, al2);
                return al2;
            }
            al2[k] = (long)Math.ceil((double)(movie[k] - 1L) * d1) + 1L;
            k++;
        } while (true);
        if (true) goto _L13; else goto _L12
_L12:
    }

}
