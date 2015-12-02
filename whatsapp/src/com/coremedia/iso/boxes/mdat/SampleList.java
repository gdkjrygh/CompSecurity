// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.mdat;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.samples.DefaultMp4SampleList;
import com.googlecode.mp4parser.authoring.samples.FragmentedMp4SampleList;
import java.util.AbstractList;
import java.util.List;

public class SampleList extends AbstractList
{

    List samples;

    public transient SampleList(TrackBox trackbox, IsoFile aisofile[])
    {
        Container container = ((Box)trackbox.getParent()).getParent();
        if (trackbox.getParent().getBoxes(com/coremedia/iso/boxes/fragment/MovieExtendsBox).isEmpty())
        {
            if (aisofile.length > 0)
            {
                throw new RuntimeException("The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )");
            } else
            {
                samples = new DefaultMp4SampleList(trackbox.getTrackHeaderBox().getTrackId(), container);
                return;
            }
        } else
        {
            samples = new FragmentedMp4SampleList(trackbox.getTrackHeaderBox().getTrackId(), container, aisofile);
            return;
        }
    }

    public Sample get(int i)
    {
        return (Sample)samples.get(i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int size()
    {
        return samples.size();
    }
}
