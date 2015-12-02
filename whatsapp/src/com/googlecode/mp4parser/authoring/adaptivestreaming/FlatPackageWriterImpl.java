// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.builder.FragmentIntersectionFinder;
import com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder;
import com.googlecode.mp4parser.authoring.builder.SyncSampleIntersectFinderImpl;
import com.googlecode.mp4parser.authoring.tracks.ChangeTimeScaleTrack;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.googlecode.mp4parser.authoring.adaptivestreaming:
//            PackageWriter, FlatManifestWriterImpl, ManifestWriter

public class FlatPackageWriterImpl
    implements PackageWriter
{

    static final boolean $assertionsDisabled;
    private static Logger LOG = Logger.getLogger(com/googlecode/mp4parser/authoring/adaptivestreaming/FlatPackageWriterImpl.getName());
    private boolean debugOutput;
    private FragmentedMp4Builder ismvBuilder;
    ManifestWriter manifestWriter;
    private File outputDirectory;
    long timeScale;

    public FlatPackageWriterImpl()
    {
        timeScale = 0x989680L;
        ismvBuilder = new FragmentedMp4Builder();
        SyncSampleIntersectFinderImpl syncsampleintersectfinderimpl = new SyncSampleIntersectFinderImpl();
        ismvBuilder.setIntersectionFinder(syncsampleintersectfinderimpl);
        manifestWriter = new FlatManifestWriterImpl(syncsampleintersectfinderimpl);
    }

    public FlatPackageWriterImpl(int i)
    {
        timeScale = 0x989680L;
        ismvBuilder = new FragmentedMp4Builder();
        SyncSampleIntersectFinderImpl syncsampleintersectfinderimpl = new SyncSampleIntersectFinderImpl(i);
        ismvBuilder.setIntersectionFinder(syncsampleintersectfinderimpl);
        manifestWriter = new FlatManifestWriterImpl(syncsampleintersectfinderimpl);
    }

    private Movie removeUnknownTracks(Movie movie)
    {
        Movie movie1 = new Movie();
        movie = movie.getTracks().iterator();
        do
        {
            if (!movie.hasNext())
            {
                return movie1;
            }
            Track track = (Track)movie.next();
            if ("vide".equals(track.getHandler()) || "soun".equals(track.getHandler()))
            {
                movie1.addTrack(track);
            } else
            {
                LOG.fine((new StringBuilder("Removed track ")).append(track).toString());
            }
        } while (true);
    }

    public Movie correctTimescale(Movie movie)
    {
        Movie movie1 = new Movie();
        Iterator iterator = movie.getTracks().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return movie1;
            }
            Track track = (Track)iterator.next();
            movie1.addTrack(new ChangeTimeScaleTrack(track, timeScale, ismvBuilder.getFragmentIntersectionFinder().sampleNumbers(track, movie)));
        } while (true);
    }

    public void setDebugOutput(boolean flag)
    {
        debugOutput = flag;
    }

    public void setIsmvBuilder(FragmentedMp4Builder fragmentedmp4builder)
    {
        ismvBuilder = fragmentedmp4builder;
        manifestWriter = new FlatManifestWriterImpl(fragmentedmp4builder.getFragmentIntersectionFinder());
    }

    public void setManifestWriter(ManifestWriter manifestwriter)
    {
        manifestWriter = manifestwriter;
    }

    public void setOutputDirectory(File file)
    {
        if (!$assertionsDisabled && !file.isDirectory())
        {
            throw new AssertionError();
        } else
        {
            outputDirectory = file;
            return;
        }
    }

    public void write(Movie movie)
        throws IOException
    {
        Movie movie1;
        Container container1;
        Iterator iterator;
        if (debugOutput)
        {
            outputDirectory.mkdirs();
            Container container = (new DefaultMp4Builder()).build(movie);
            FileOutputStream fileoutputstream = new FileOutputStream(new File(outputDirectory, "debug_1_muxed.mp4"));
            container.writeContainer(fileoutputstream.getChannel());
            fileoutputstream.close();
        }
        movie1 = correctTimescale(removeUnknownTracks(movie));
        if (debugOutput)
        {
            movie = (new DefaultMp4Builder()).build(movie1);
            FileOutputStream fileoutputstream1 = new FileOutputStream(new File(outputDirectory, "debug_2_timescale.mp4"));
            movie.writeContainer(fileoutputstream1.getChannel());
            fileoutputstream1.close();
        }
        container1 = ismvBuilder.build(movie1);
        if (debugOutput)
        {
            movie = new FileOutputStream(new File(outputDirectory, "debug_3_fragmented.mp4"));
            container1.writeContainer(movie.getChannel());
            movie.close();
        }
        iterator = movie1.getTracks().iterator();
_L2:
        Iterator iterator1;
        Object obj;
        Object obj1;
        int i;
        long l;
        long l1;
        if (!iterator.hasNext())
        {
            movie = new FileWriter(new File(outputDirectory, "Manifest"));
            movie.write(manifestWriter.getManifest(movie1));
            movie.close();
            return;
        }
        obj = (Track)iterator.next();
        obj1 = Long.toString(manifestWriter.getBitrate(((Track) (obj))));
        l1 = ((Track) (obj)).getTrackMetaData().getTrackId();
        iterator1 = container1.getBoxes().iterator();
        if (((Track) (obj)).getMediaHeaderBox() instanceof SoundMediaHeaderBox)
        {
            movie = new File(outputDirectory, "audio");
        } else
        {
label0:
            {
                if (!(((Track) (obj)).getMediaHeaderBox() instanceof VideoMediaHeaderBox))
                {
                    break label0;
                }
                movie = new File(outputDirectory, "video");
            }
        }
        movie = new File(movie, ((String) (obj1)));
        movie.mkdirs();
        LOG.finer((new StringBuilder("Created : ")).append(movie.getCanonicalPath()).toString());
        obj = manifestWriter.calculateFragmentDurations(((Track) (obj)), movie1);
        l = 0L;
        i = 0;
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        obj1 = (Box)iterator1.next();
        if (!(obj1 instanceof MovieFragmentBox)) goto _L4; else goto _L3
_L3:
        if (!$assertionsDisabled && ((MovieFragmentBox)obj1).getTrackCount() != 1)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_521;
        System.err.println((new StringBuilder("Skipping Track with handler ")).append(((Track) (obj)).getHandler()).append(" and ").append(((Track) (obj)).getMediaHeaderBox().getClass().getSimpleName()).toString());
          goto _L2
        if (((MovieFragmentBox)obj1).getTrackNumbers()[0] == l1)
        {
            Object obj2 = new FileOutputStream(new File(movie, Long.toString(l)));
            l += obj[i];
            obj2 = ((FileOutputStream) (obj2)).getChannel();
            Box box = (Box)iterator1.next();
            if (!$assertionsDisabled && !box.getType().equals("mdat"))
            {
                throw new AssertionError();
            }
            ((Box) (obj1)).getBox(((java.nio.channels.WritableByteChannel) (obj2)));
            box.getBox(((java.nio.channels.WritableByteChannel) (obj2)));
            ((FileChannel) (obj2)).truncate(((FileChannel) (obj2)).position());
            ((FileChannel) (obj2)).close();
            i++;
        }
          goto _L4
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/adaptivestreaming/FlatPackageWriterImpl.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
