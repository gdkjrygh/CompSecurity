// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import java.util.AbstractList;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            ReplaceSampleTrack

private class <init> extends AbstractList
{

    final ReplaceSampleTrack this$0;

    public Sample get(int i)
    {
        if (ReplaceSampleTrack.access$0(ReplaceSampleTrack.this) == (long)i)
        {
            return ReplaceSampleTrack.access$1(ReplaceSampleTrack.this);
        } else
        {
            return (Sample)origTrack.getSamples().get(i);
        }
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int size()
    {
        return origTrack.getSamples().size();
    }

    private ()
    {
        this$0 = ReplaceSampleTrack.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
