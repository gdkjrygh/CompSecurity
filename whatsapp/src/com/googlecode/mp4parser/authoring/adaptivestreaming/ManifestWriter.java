// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import java.io.IOException;

public interface ManifestWriter
{

    public abstract long[] calculateFragmentDurations(Track track, Movie movie);

    public abstract long getBitrate(Track track);

    public abstract String getManifest(Movie movie)
        throws IOException;
}
