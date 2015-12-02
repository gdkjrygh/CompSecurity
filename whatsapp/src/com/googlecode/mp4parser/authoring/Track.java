// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            TrackMetaData

public interface Track
{

    public abstract List getCompositionTimeEntries();

    public abstract List getDecodingTimeEntries();

    public abstract String getHandler();

    public abstract Box getMediaHeaderBox();

    public abstract List getSampleDependencies();

    public abstract SampleDescriptionBox getSampleDescriptionBox();

    public abstract List getSamples();

    public abstract SubSampleInformationBox getSubsampleInformationBox();

    public abstract long[] getSyncSamples();

    public abstract TrackMetaData getTrackMetaData();

    public abstract boolean isEnabled();

    public abstract boolean isInMovie();

    public abstract boolean isInPoster();

    public abstract boolean isInPreview();
}
