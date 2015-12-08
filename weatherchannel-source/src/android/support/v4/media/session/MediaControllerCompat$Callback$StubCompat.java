// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompat, ParcelableVolumeInfo, PlaybackStateCompat

private class <init> extends <init>
{

    final ler.post this$0;

    public void onEvent(String s, Bundle bundle)
        throws RemoteException
    {
        <init>(this._cls0.this).post(1, s, bundle);
    }

    public void onExtrasChanged(Bundle bundle)
        throws RemoteException
    {
        ler.post(this._cls0.this).post(7, bundle, null);
    }

    public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
        throws RemoteException
    {
        ler.post(this._cls0.this).post(3, mediametadatacompat, null);
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
        throws RemoteException
    {
        ler.post(this._cls0.this).post(2, playbackstatecompat, null);
    }

    public void onQueueChanged(List list)
        throws RemoteException
    {
        ler.post(this._cls0.this).post(5, list, null);
    }

    public void onQueueTitleChanged(CharSequence charsequence)
        throws RemoteException
    {
        ler.post(this._cls0.this).post(6, charsequence, null);
    }

    public void onSessionDestroyed()
        throws RemoteException
    {
        ler.post(this._cls0.this).post(8, null, null);
    }

    public void onVolumeInfoChanged(ParcelableVolumeInfo parcelablevolumeinfo)
        throws RemoteException
    {
        ler.post post = null;
        if (parcelablevolumeinfo != null)
        {
            post = new ler.post(parcelablevolumeinfo.volumeType, parcelablevolumeinfo.audioStream, parcelablevolumeinfo.controlType, parcelablevolumeinfo.maxVolume, parcelablevolumeinfo.currentVolume);
        }
        ler.post(this._cls0.this).post(4, post, null);
    }

    private ler()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(this._cls0 _pcls0_1)
    {
        this();
    }
}
