// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.container.mp4;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Mp4TrackImpl;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;

public class MovieCreator
{

    public MovieCreator()
    {
    }

    public static Movie build(String s)
        throws IOException
    {
        return build((new FileInputStream(s)).getChannel());
    }

    public static Movie build(FileChannel filechannel)
        throws IOException
    {
        filechannel = new IsoFile(filechannel);
        Movie movie = new Movie();
        Iterator iterator = filechannel.getMovieBox().getBoxes(com/coremedia/iso/boxes/TrackBox).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                movie.setMatrix(filechannel.getMovieBox().getMovieHeaderBox().getMatrix());
                return movie;
            }
            movie.addTrack(new Mp4TrackImpl((TrackBox)iterator.next(), new IsoFile[0]));
        } while (true);
    }
}
