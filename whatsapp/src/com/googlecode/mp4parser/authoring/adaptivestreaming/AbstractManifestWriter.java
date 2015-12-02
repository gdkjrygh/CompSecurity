// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.authoring.builder.FragmentIntersectionFinder;
import com.googlecode.mp4parser.util.CastUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.adaptivestreaming:
//            ManifestWriter

public abstract class AbstractManifestWriter
    implements ManifestWriter
{

    private static final Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/adaptivestreaming/AbstractManifestWriter.getName());
    protected long audioFragmentsDurations[];
    private FragmentIntersectionFinder intersectionFinder;
    protected long videoFragmentsDurations[];

    protected AbstractManifestWriter(FragmentIntersectionFinder fragmentintersectionfinder)
    {
        intersectionFinder = fragmentintersectionfinder;
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

    public long[] calculateFragmentDurations(Track track, Movie movie)
    {
        long al[];
        int i;
        int i1;
        movie = intersectionFinder.sampleNumbers(track, movie);
        al = new long[movie.length];
        i1 = 0;
        i = 1;
        track = track.getDecodingTimeEntries().iterator();
_L2:
        int j = i;
        if (!track.hasNext())
        {
            return al;
        }
        com.coremedia.iso.boxes.TimeToSampleBox.Entry entry = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)track.next();
        int j1 = CastUtils.l2i(entry.getCount());
        i = j;
        int k = i1;
        do
        {
            int l = i;
            i1 = k;
            i = l;
            if (l >= j + j1)
            {
                continue;
            }
            i = k;
            if (k != movie.length - 1)
            {
                i = k;
                if ((long)l == movie[k + 1])
                {
                    i = k + 1;
                }
            }
            al[i] = al[i] + entry.getDelta();
            l++;
            k = i;
            i = l;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected long[] checkFragmentsAlign(long al[], long al1[])
        throws IOException
    {
        if (al != null && al.length != 0) goto _L2; else goto _L1
_L1:
        return al1;
_L2:
        long al2[];
        long al3[];
        al2 = new long[al.length - 1];
        System.arraycopy(al, 0, al2, 0, al.length - 1);
        al3 = new long[al1.length - 1];
        System.arraycopy(al1, 0, al3, 0, al1.length - 1);
        if (Arrays.equals(al3, al2)) goto _L1; else goto _L3
_L3:
        String s;
        int i;
        int j;
        s = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(al.length).toString()))).append("Reference     :  [").toString();
        j = al.length;
        i = 0;
_L6:
        if (i < j) goto _L5; else goto _L4
_L4:
        al = (new StringBuilder(String.valueOf(s))).append("]").toString();
        LOG.warning(al);
        al = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(al1.length).toString()))).append("Current       :  [").toString();
        j = al1.length;
        i = 0;
_L7:
        if (i >= j)
        {
            al = (new StringBuilder(String.valueOf(al))).append("]").toString();
            LOG.warning(al);
            throw new IOException("Track does not have the same fragment borders as its predecessor.");
        }
        break MISSING_BLOCK_LABEL_278;
_L5:
        long l = al[i];
        s = (new StringBuilder(String.valueOf(s))).append(String.format("%10d,", new Object[] {
            Long.valueOf(l)
        })).toString();
        i++;
          goto _L6
        long l1 = al1[i];
        al = (new StringBuilder(String.valueOf(al))).append(String.format("%10d,", new Object[] {
            Long.valueOf(l1)
        })).toString();
        i++;
          goto _L7
    }

    public long getBitrate(Track track)
    {
        long l = 0L;
        Iterator iterator = track.getSamples().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return (long)((double)(l * 8L) / ((double)getDuration(track) / (double)track.getTrackMetaData().getTimescale()));
            }
            l += ((Sample)iterator.next()).remaining();
        } while (true);
    }

    protected String getFormat(AbstractSampleEntry abstractsampleentry)
    {
        String s;
label0:
        {
            String s1 = abstractsampleentry.getType();
            if (!s1.equals("encv") && !s1.equals("enca"))
            {
                s = s1;
                if (!s1.equals("encv"))
                {
                    break label0;
                }
            }
            s = ((OriginalFormatBox)abstractsampleentry.getBoxes(com/coremedia/iso/boxes/OriginalFormatBox, true).get(0)).getDataFormat();
        }
        return s;
    }

}
