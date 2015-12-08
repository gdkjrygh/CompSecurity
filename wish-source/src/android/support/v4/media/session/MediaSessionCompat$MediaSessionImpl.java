// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.VolumeProviderCompat;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, PlaybackStateCompat

static interface 
{

    public abstract Object getMediaSession();

    public abstract  getSessionToken();

    public abstract boolean isActive();

    public abstract void release();

    public abstract void sendSessionEvent(String s, Bundle bundle);

    public abstract void setActive(boolean flag);

    public abstract void setCallback( , Handler handler);

    public abstract void setFlags(int i);

    public abstract void setMetadata(MediaMetadataCompat mediametadatacompat);

    public abstract void setPlaybackState(PlaybackStateCompat playbackstatecompat);

    public abstract void setPlaybackToLocal(int i);

    public abstract void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat);
}
