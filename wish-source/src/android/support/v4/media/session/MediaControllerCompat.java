// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, PlaybackStateCompat, MediaControllerCompatApi21

public final class MediaControllerCompat
{
    public static abstract class Callback
    {

        final Object mCallbackObj;

        public void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
        {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
        {
        }

        public void onSessionDestroyed()
        {
        }

        public void onSessionEvent(String s, Bundle bundle)
        {
        }

        public Callback()
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                mCallbackObj = MediaControllerCompatApi21.createCallback(new StubApi21());
                return;
            } else
            {
                mCallbackObj = null;
                return;
            }
        }
    }

    private class Callback.StubApi21
        implements MediaControllerCompatApi21.Callback
    {

        final Callback this$0;

        public void onMetadataChanged(Object obj)
        {
            Callback.this.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
        }

        public void onPlaybackStateChanged(Object obj)
        {
            Callback.this.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
        }

        public void onSessionDestroyed()
        {
            Callback.this.onSessionDestroyed();
        }

        public void onSessionEvent(String s, Bundle bundle)
        {
            Callback.this.onSessionEvent(s, bundle);
        }

        private Callback.StubApi21()
        {
            this$0 = Callback.this;
            super();
        }

    }

    static interface MediaControllerImpl
    {

        public abstract boolean dispatchMediaButtonEvent(KeyEvent keyevent);

        public abstract Object getMediaController();

        public abstract MediaMetadataCompat getMetadata();

        public abstract PlaybackInfo getPlaybackInfo();

        public abstract PlaybackStateCompat getPlaybackState();

        public abstract int getRatingType();

        public abstract TransportControls getTransportControls();

        public abstract void registerCallback(Callback callback, Handler handler);

        public abstract void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver);

        public abstract void unregisterCallback(Callback callback);
    }

    static class MediaControllerImplApi21
        implements MediaControllerImpl
    {

        private final Object mControllerObj;

        public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
        {
            return MediaControllerCompatApi21.dispatchMediaButtonEvent(mControllerObj, keyevent);
        }

        public Object getMediaController()
        {
            return mControllerObj;
        }

        public MediaMetadataCompat getMetadata()
        {
            Object obj = MediaControllerCompatApi21.getMetadata(mControllerObj);
            if (obj != null)
            {
                return MediaMetadataCompat.fromMediaMetadata(obj);
            } else
            {
                return null;
            }
        }

        public PlaybackInfo getPlaybackInfo()
        {
            Object obj = MediaControllerCompatApi21.getPlaybackInfo(mControllerObj);
            if (obj != null)
            {
                return new PlaybackInfo(MediaControllerCompatApi21.PlaybackInfo.getPlaybackType(obj), MediaControllerCompatApi21.PlaybackInfo.getLegacyAudioStream(obj), MediaControllerCompatApi21.PlaybackInfo.getVolumeControl(obj), MediaControllerCompatApi21.PlaybackInfo.getMaxVolume(obj), MediaControllerCompatApi21.PlaybackInfo.getCurrentVolume(obj));
            } else
            {
                return null;
            }
        }

        public PlaybackStateCompat getPlaybackState()
        {
            Object obj = MediaControllerCompatApi21.getPlaybackState(mControllerObj);
            if (obj != null)
            {
                return PlaybackStateCompat.fromPlaybackState(obj);
            } else
            {
                return null;
            }
        }

        public int getRatingType()
        {
            return MediaControllerCompatApi21.getRatingType(mControllerObj);
        }

        public TransportControls getTransportControls()
        {
            Object obj = MediaControllerCompatApi21.getTransportControls(mControllerObj);
            if (obj != null)
            {
                return new TransportControlsApi21(obj);
            } else
            {
                return null;
            }
        }

        public void registerCallback(Callback callback, Handler handler)
        {
            MediaControllerCompatApi21.registerCallback(mControllerObj, callback.mCallbackObj, handler);
        }

        public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
        {
            MediaControllerCompatApi21.sendCommand(mControllerObj, s, bundle, resultreceiver);
        }

        public void unregisterCallback(Callback callback)
        {
            MediaControllerCompatApi21.unregisterCallback(mControllerObj, callback.mCallbackObj);
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token)
            throws RemoteException
        {
            mControllerObj = MediaControllerCompatApi21.fromToken(context, token.getToken());
            if (mControllerObj == null)
            {
                throw new RemoteException();
            } else
            {
                return;
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat mediasessioncompat)
        {
            mControllerObj = MediaControllerCompatApi21.fromToken(context, mediasessioncompat.getSessionToken().getToken());
        }
    }

    static class MediaControllerImplBase
        implements MediaControllerImpl
    {

        public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
        {
            return false;
        }

        public Object getMediaController()
        {
            return null;
        }

        public MediaMetadataCompat getMetadata()
        {
            return null;
        }

        public PlaybackInfo getPlaybackInfo()
        {
            return null;
        }

        public PlaybackStateCompat getPlaybackState()
        {
            return null;
        }

        public int getRatingType()
        {
            return 0;
        }

        public TransportControls getTransportControls()
        {
            return null;
        }

        public void registerCallback(Callback callback, Handler handler)
        {
        }

        public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
        {
        }

        public void unregisterCallback(Callback callback)
        {
        }

        MediaControllerImplBase()
        {
        }
    }

    public static final class PlaybackInfo
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

        PlaybackInfo(int i, int j, int k, int l, int i1)
        {
            mPlaybackType = i;
            mAudioStream = j;
            mVolumeControl = k;
            mMaxVolume = l;
            mCurrentVolume = i1;
        }
    }

    public static abstract class TransportControls
    {

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void rewind();

        public abstract void seekTo(long l);

        public abstract void setRating(RatingCompat ratingcompat);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void stop();

        TransportControls()
        {
        }
    }

    static class TransportControlsApi21 extends TransportControls
    {

        private final Object mControlsObj;

        public void fastForward()
        {
            MediaControllerCompatApi21.TransportControls.fastForward(mControlsObj);
        }

        public void pause()
        {
            MediaControllerCompatApi21.TransportControls.pause(mControlsObj);
        }

        public void play()
        {
            MediaControllerCompatApi21.TransportControls.play(mControlsObj);
        }

        public void rewind()
        {
            MediaControllerCompatApi21.TransportControls.rewind(mControlsObj);
        }

        public void seekTo(long l)
        {
            MediaControllerCompatApi21.TransportControls.seekTo(mControlsObj, l);
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
            MediaControllerCompatApi21.TransportControls.setRating(obj, ratingcompat);
        }

        public void skipToNext()
        {
            MediaControllerCompatApi21.TransportControls.skipToNext(mControlsObj);
        }

        public void skipToPrevious()
        {
            MediaControllerCompatApi21.TransportControls.skipToPrevious(mControlsObj);
        }

        public void stop()
        {
            MediaControllerCompatApi21.TransportControls.stop(mControlsObj);
        }

        public TransportControlsApi21(Object obj)
        {
            mControlsObj = obj;
        }
    }


    private final MediaControllerImpl mImpl;

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token)
        throws RemoteException
    {
        if (token == null)
        {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mImpl = new MediaControllerImplApi21(context, token);
            return;
        } else
        {
            mImpl = new MediaControllerImplBase();
            return;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediasessioncompat)
    {
        if (mediasessioncompat == null)
        {
            throw new IllegalArgumentException("session must not be null");
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mImpl = new MediaControllerImplApi21(context, mediasessioncompat);
            return;
        } else
        {
            mImpl = new MediaControllerImplBase();
            return;
        }
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyevent)
    {
        if (keyevent == null)
        {
            throw new IllegalArgumentException("KeyEvent may not be null");
        } else
        {
            return mImpl.dispatchMediaButtonEvent(keyevent);
        }
    }

    public Object getMediaController()
    {
        return mImpl.getMediaController();
    }

    public MediaMetadataCompat getMetadata()
    {
        return mImpl.getMetadata();
    }

    public PlaybackInfo getPlaybackInfo()
    {
        return mImpl.getPlaybackInfo();
    }

    public PlaybackStateCompat getPlaybackState()
    {
        return mImpl.getPlaybackState();
    }

    public int getRatingType()
    {
        return mImpl.getRatingType();
    }

    public TransportControls getTransportControls()
    {
        return mImpl.getTransportControls();
    }

    public void registerCallback(Callback callback)
    {
        registerCallback(callback, null);
    }

    public void registerCallback(Callback callback, Handler handler)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("callback cannot be null");
        }
        Handler handler1 = handler;
        if (handler == null)
        {
            handler1 = new Handler();
        }
        mImpl.registerCallback(callback, handler1);
    }

    public void sendCommand(String s, Bundle bundle, ResultReceiver resultreceiver)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("command cannot be null or empty");
        } else
        {
            mImpl.sendCommand(s, bundle, resultreceiver);
            return;
        }
    }

    public void unregisterCallback(Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("callback cannot be null");
        } else
        {
            mImpl.unregisterCallback(callback);
            return;
        }
    }
}
