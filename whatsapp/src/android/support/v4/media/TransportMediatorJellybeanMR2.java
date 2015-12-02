// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//            TransportMediatorCallback

class TransportMediatorJellybeanMR2
    implements android.media.RemoteControlClient.OnGetPlaybackPositionListener, android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
{

    final TransportMediatorCallback mTransportCallback;

    public long onGetPlaybackPosition()
    {
        return mTransportCallback.getPlaybackPosition();
    }

    public void onPlaybackPositionUpdate(long l)
    {
        mTransportCallback.playbackPositionUpdate(l);
    }
}
