// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;


// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat

public static final class mCurrentVolume
{

    public static final int PLAYBACK_TYPE_LOCAL = 1;
    public static final int PLAYBACK_TYPE_REMOTE = 2;
    private final int mAudioStream;
    private final int mCurrentVolume;
    private final int mMaxVolume;
    private final int mPlaybackType;
    private final int mVolumeControl;

    public int getAudioStream()
    {
        return mAudioStream;
    }

    public int getCurrentVolume()
    {
        return mCurrentVolume;
    }

    public int getMaxVolume()
    {
        return mMaxVolume;
    }

    public int getPlaybackType()
    {
        return mPlaybackType;
    }

    public int getVolumeControl()
    {
        return mVolumeControl;
    }

    I(int i, int j, int k, int l, int i1)
    {
        mPlaybackType = i;
        mAudioStream = j;
        mVolumeControl = k;
        mMaxVolume = l;
        mCurrentVolume = i1;
    }
}
