// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FragmentedMp4SampleList extends AbstractList
{

    IsoFile fragments[];
    Container topLevel;
    TrackBox trackBox;
    TrackExtendsBox trex;

    public transient FragmentedMp4SampleList(long l, Container container, IsoFile aisofile[])
    {
        trackBox = null;
        trex = null;
        topLevel = container;
        fragments = aisofile;
        aisofile = ((MovieBox)container.getBoxes(com/coremedia/iso/boxes/MovieBox).get(0)).getBoxes(com/coremedia/iso/boxes/TrackBox).iterator();
        do
        {
            if (!aisofile.hasNext())
            {
                if (trackBox == null)
                {
                    throw new RuntimeException((new StringBuilder("This MP4 does not contain track ")).append(l).toString());
                }
                break;
            }
            TrackBox trackbox = (TrackBox)aisofile.next();
            if (trackbox.getTrackHeaderBox().getTrackId() == l)
            {
                trackBox = trackbox;
            }
        } while (true);
        container = Path.getPaths(container, "moov/mvex/trex").iterator();
        do
        {
            do
            {
                if (!container.hasNext())
                {
                    return;
                }
                aisofile = (Box)container.next();
            } while (((TrackExtendsBox)aisofile).getTrackId() != trackBox.getTrackHeaderBox().getTrackId());
            trex = (TrackExtendsBox)aisofile;
        } while (true);
    }

    private List allFragments()
    {
        LinkedList linkedlist;
        Object obj;
        linkedlist = new LinkedList();
        obj = topLevel.getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L6:
        if (((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        if (fragments == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        obj = fragments;
        j = obj.length;
        i = 0;
_L7:
        if (i < j) goto _L5; else goto _L4
_L4:
        return linkedlist;
_L2:
        Iterator iterator = ((MovieFragmentBox)((Iterator) (obj)).next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        while (iterator.hasNext()) 
        {
            TrackFragmentBox trackfragmentbox = (TrackFragmentBox)iterator.next();
            if (trackfragmentbox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())
            {
                linkedlist.add(trackfragmentbox);
            }
        }
          goto _L6
_L5:
        Iterator iterator1 = obj[i].getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L8:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            i++;
        }
          goto _L7
        Iterator iterator2 = ((MovieFragmentBox)iterator1.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        while (iterator2.hasNext()) 
        {
            TrackFragmentBox trackfragmentbox1 = (TrackFragmentBox)iterator2.next();
            if (trackfragmentbox1.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())
            {
                linkedlist.add(trackfragmentbox1);
            }
        }
          goto _L8
    }

    private int getTrafSize(TrackFragmentBox trackfragmentbox)
    {
        return CastUtils.l2i(((TrackRunBox)trackfragmentbox.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).get(0)).getSampleCount());
    }

    public Sample get(int i)
    {
        boolean flag = true;
        int k = i + 1;
        Iterator iterator = allFragments().iterator();
        i = ((flag) ? 1 : 0);
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            Object obj = (TrackFragmentBox)iterator.next();
            int j = getTrafSize(((TrackFragmentBox) (obj)));
            if (k >= i && k < i + j)
            {
                j = k - i;
                MovieFragmentBox moviefragmentbox = (MovieFragmentBox)((TrackFragmentBox) (obj)).getParent();
                TrackRunBox trackrunbox = (TrackRunBox)((TrackFragmentBox) (obj)).getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).get(0);
                long l = 0L;
                if (trackrunbox.isDataOffsetPresent())
                {
                    l = 0L + (long)trackrunbox.getDataOffset();
                }
                List list = trackrunbox.getEntries();
                long l1;
                if (((TrackFragmentBox) (obj)).getTrackFragmentHeaderBox().hasBaseDataOffset())
                {
                    l += ((TrackFragmentBox) (obj)).getTrackFragmentHeaderBox().getBaseDataOffset();
                } else
                {
                    l += moviefragmentbox.getOffset();
                }
                i = 0;
                l1 = l;
                do
                {
                    if (i >= j)
                    {
                        if (trackrunbox.isSampleSizePresent())
                        {
                            l = ((com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)list.get(j)).getSampleSize();
                        } else
                        if (((TrackFragmentBox) (obj)).getTrackFragmentHeaderBox().hasDefaultSampleSize())
                        {
                            l = ((TrackFragmentBox) (obj)).getTrackFragmentHeaderBox().getDefaultSampleSize();
                        } else
                        {
                            if (trex == null)
                            {
                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                            l = trex.getDefaultSampleSize();
                        }
                        try
                        {
                            obj = new SampleImpl(((IsoFile)moviefragmentbox.getParent()).getByteBuffer(l1, l));
                        }
                        catch (IOException ioexception)
                        {
                            return null;
                        }
                        return ((Sample) (obj));
                    }
                    if (trackrunbox.isSampleSizePresent())
                    {
                        l = l1 + ((com.coremedia.iso.boxes.fragment.TrackRunBox.Entry)list.get(i)).getSampleSize();
                    } else
                    if (((TrackFragmentBox) (obj)).getTrackFragmentHeaderBox().hasDefaultSampleSize())
                    {
                        l = l1 + ((TrackFragmentBox) (obj)).getTrackFragmentHeaderBox().getDefaultSampleSize();
                    } else
                    {
                        if (trex == null)
                        {
                            throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                        }
                        l = l1 + trex.getDefaultSampleSize();
                    }
                    i++;
                    l1 = l;
                } while (true);
            }
            i += j;
        } while (true);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int size()
    {
        Object obj;
        int i;
        i = 0;
        obj = topLevel.getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L2:
        Iterator iterator;
        int j;
        int l;
        if (!((Iterator) (obj)).hasNext())
        {
            obj = fragments;
            l = obj.length;
            j = 0;
            break MISSING_BLOCK_LABEL_41;
        }
        iterator = ((MovieFragmentBox)((Iterator) (obj)).next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        j = i;
_L3:
        i = j;
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        TrackFragmentBox trackfragmentbox = (TrackFragmentBox)iterator.next();
        if (trackfragmentbox.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())
        {
            j = (int)((long)j + ((TrackRunBox)trackfragmentbox.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).get(0)).getSampleCount());
        }
          goto _L3
_L5:
        if (j >= l)
        {
            return i;
        }
        iterator = obj[j].getBoxes(com/coremedia/iso/boxes/fragment/MovieFragmentBox).iterator();
_L7:
label0:
        {
            if (iterator.hasNext())
            {
                break label0;
            }
            j++;
        }
        if (true) goto _L5; else goto _L4
_L4:
        Iterator iterator1;
        int k;
        iterator1 = ((MovieFragmentBox)iterator.next()).getBoxes(com/coremedia/iso/boxes/fragment/TrackFragmentBox).iterator();
        k = i;
_L8:
        i = k;
        if (!iterator1.hasNext()) goto _L7; else goto _L6
_L6:
        TrackFragmentBox trackfragmentbox1 = (TrackFragmentBox)iterator1.next();
        if (trackfragmentbox1.getTrackFragmentHeaderBox().getTrackId() == trackBox.getTrackHeaderBox().getTrackId())
        {
            k = (int)((long)k + ((TrackRunBox)trackfragmentbox1.getBoxes(com/coremedia/iso/boxes/fragment/TrackRunBox).get(0)).getSampleCount());
        }
          goto _L8
    }
}
