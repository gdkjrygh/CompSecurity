// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.VolumeProviderCompat;
import android.view.KeyEvent;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, ParcelableVolumeInfo, IMediaControllerCallback, PlaybackStateCompat

class this._cls0 extends this._cls0
{

    final this._cls0 this$0;

    public void adjustVolume(int i, int j, String s)
    {
        this._mth0(this._cls0.this, i, j);
    }

    public void fastForward()
        throws RemoteException
    {
        this._mth0(this._cls0.this).st(9);
    }

    public Bundle getExtras()
    {
        Bundle bundle;
        synchronized (st(this._cls0.this))
        {
            bundle = this._mth0(this._cls0.this);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long getFlags()
    {
        long l;
        synchronized (this._mth0(this._cls0.this))
        {
            l = this._mth0(this._cls0.this);
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public PendingIntent getLaunchPendingIntent()
    {
        PendingIntent pendingintent;
        synchronized (this._mth0(this._cls0.this))
        {
            pendingintent = this._mth0(this._cls0.this);
        }
        return pendingintent;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaMetadataCompat getMetadata()
    {
        return this._mth0(this._cls0.this);
    }

    public String getPackageName()
    {
        return this._mth0(this._cls0.this);
    }

    public PlaybackStateCompat getPlaybackState()
    {
        return this._mth0(this._cls0.this);
    }

    public List getQueue()
    {
        List list;
        synchronized (this._mth0(this._cls0.this))
        {
            list = this._mth0(this._cls0.this);
        }
        return list;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public CharSequence getQueueTitle()
    {
        return this._mth0(this._cls0.this);
    }

    public int getRatingType()
    {
        return this._mth0(this._cls0.this);
    }

    public String getTag()
    {
        return this._mth0(this._cls0.this);
    }

    public ParcelableVolumeInfo getVolumeAttributes()
    {
        Object obj = this._mth0(this._cls0.this);
        obj;
        JVM INSTR monitorenter ;
        VolumeProviderCompat volumeprovidercompat;
        int l;
        int i1;
        l = this._mth0(this._cls0.this);
        i1 = this._mth0(this._cls0.this);
        volumeprovidercompat = this._mth0(this._cls0.this);
        if (l != 2) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        i = volumeprovidercompat.getVolumeControl();
        j = volumeprovidercompat.getMaxVolume();
        k = volumeprovidercompat.getCurrentVolume();
_L3:
        obj;
        JVM INSTR monitorexit ;
        return new ParcelableVolumeInfo(l, i1, i, j, k);
_L2:
        i = 2;
        j = this._mth0(this._cls0.this).getStreamMaxVolume(i1);
        k = this._mth0(this._cls0.this).getStreamVolume(i1);
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isTransportControlEnabled()
    {
        return (this._mth0(this._cls0.this) & 2) != 0;
    }

    public void next()
        throws RemoteException
    {
        this._mth0(this._cls0.this).st(7);
    }

    public void pause()
        throws RemoteException
    {
        st(this._cls0.this).st(5);
    }

    public void play()
        throws RemoteException
    {
        st(this._cls0.this).st(1);
    }

    public void playFromMediaId(String s, Bundle bundle)
        throws RemoteException
    {
        st(this._cls0.this).st(2, s, bundle);
    }

    public void playFromSearch(String s, Bundle bundle)
        throws RemoteException
    {
        st(this._cls0.this).st(3, s, bundle);
    }

    public void previous()
        throws RemoteException
    {
        st(this._cls0.this).st(8);
    }

    public void rate(RatingCompat ratingcompat)
        throws RemoteException
    {
        st(this._cls0.this).st(12, ratingcompat);
    }

    public void registerCallbackListener(IMediaControllerCallback imediacontrollercallback)
    {
        if (st(this._cls0.this))
        {
            try
            {
                imediacontrollercallback.onSessionDestroyed();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (IMediaControllerCallback imediacontrollercallback)
            {
                return;
            }
        } else
        {
            this._mth0(this._cls0.this).register(imediacontrollercallback);
            return;
        }
    }

    public void rewind()
        throws RemoteException
    {
        this._mth0(this._cls0.this).st(10);
    }

    public void seekTo(long l)
        throws RemoteException
    {
        st(this._cls0.this).st(11, Long.valueOf(l));
    }

    public void sendCommand(String s, Bundle bundle, st st)
    {
        st(this._cls0.this).st(15, new st(s, bundle, st(st)));
    }

    public void sendCustomAction(String s, Bundle bundle)
        throws RemoteException
    {
        st(this._cls0.this).st(13, s, bundle);
    }

    public boolean sendMediaButton(KeyEvent keyevent)
    {
        boolean flag;
        if ((st(this._cls0.this) & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            this._mth0(this._cls0.this).st(14, keyevent);
        }
        return flag;
    }

    public void setVolumeTo(int i, int j, String s)
    {
        st(this._cls0.this, i, j);
    }

    public void skipToQueueItem(long l)
    {
        this._mth0(this._cls0.this).st(4, Long.valueOf(l));
    }

    public void stop()
        throws RemoteException
    {
        st(this._cls0.this).st(6);
    }

    public void unregisterCallbackListener(IMediaControllerCallback imediacontrollercallback)
    {
        st(this._cls0.this).unregister(imediacontrollercallback);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
