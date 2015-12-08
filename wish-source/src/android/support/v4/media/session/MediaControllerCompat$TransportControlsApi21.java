// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.support.v4.media.RatingCompat;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat

static class mControlsObj extends mControlsObj
{

    private final Object mControlsObj;

    public void fastForward()
    {
        fastForward(mControlsObj);
    }

    public void pause()
    {
        pause(mControlsObj);
    }

    public void play()
    {
        play(mControlsObj);
    }

    public void rewind()
    {
        rewind(mControlsObj);
    }

    public void seekTo(long l)
    {
        seekTo(mControlsObj, l);
    }

    public void setRating(RatingCompat ratingcompat)
    {
        Object obj = mControlsObj;
        if (ratingcompat != null)
        {
            ratingcompat = ((RatingCompat) (ratingcompat.getRating()));
        } else
        {
            ratingcompat = null;
        }
        setRating(obj, ratingcompat);
    }

    public void skipToNext()
    {
        skipToNext(mControlsObj);
    }

    public void skipToPrevious()
    {
        skipToPrevious(mControlsObj);
    }

    public void stop()
    {
        stop(mControlsObj);
    }

    public (Object obj)
    {
        mControlsObj = obj;
    }
}
