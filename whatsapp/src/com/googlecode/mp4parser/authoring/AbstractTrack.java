// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;


// Referenced classes of package com.googlecode.mp4parser.authoring:
//            Track

public abstract class AbstractTrack
    implements Track
{

    private boolean enabled;
    private boolean inMovie;
    private boolean inPoster;
    private boolean inPreview;

    public AbstractTrack()
    {
        enabled = true;
        inMovie = true;
        inPreview = true;
        inPoster = true;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public boolean isInMovie()
    {
        return inMovie;
    }

    public boolean isInPoster()
    {
        return inPoster;
    }

    public boolean isInPreview()
    {
        return inPreview;
    }

    public void setEnabled(boolean flag)
    {
        enabled = flag;
    }

    public void setInMovie(boolean flag)
    {
        inMovie = flag;
    }

    public void setInPoster(boolean flag)
    {
        inPoster = flag;
    }

    public void setInPreview(boolean flag)
    {
        inPreview = flag;
    }
}
