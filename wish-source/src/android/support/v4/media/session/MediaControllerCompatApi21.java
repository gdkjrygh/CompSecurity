// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;

class MediaControllerCompatApi21
{
    public static interface Callback
    {

        public abstract void onMetadataChanged(Object obj);

        public abstract void onPlaybackStateChanged(Object obj);

        public abstract void onSessionDestroyed();

        public abstract void onSessionEvent(String s, Bundle bundle);
    }

    static class CallbackProxy extends android.media.session.MediaController.Callback
    {

        protected final Callback mCallback;

        public void onMetadataChanged(MediaMetadata mediametadata)
        {
            mCallback.onMetadataChanged(mediametadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackstate)
        {
            mCallback.onPlaybackStateChanged(playbackstate);
        }

        public void onSessionDestroyed()
        {
            mCallback.onSessionDestroyed();
        }

        public void onSessionEvent(String s, Bundle bundle)
        {
            mCallback.onSessionEvent(s, bundle);
        }

        public CallbackProxy(Callback callback)
        {
            mCallback = callback;
        }
    }

    public static class PlaybackInfo
    {

        private static final int FLAG_SCO = 4;
        private static final int STREAM_BLUETOOTH_SCO = 6;
        private static final int STREAM_SYSTEM_ENFORCED = 7;

        public static AudioAttributes getAudioAttributes(Object obj)
        {
            return ((android.media.session.MediaController.PlaybackInfo)obj).getAudioAttributes();
        }

        public static int getCurrentVolume(Object obj)
        {
            return ((android.media.session.MediaController.PlaybackInfo)obj).getCurrentVolume();
        }

        public static int getLegacyAudioStream(Object obj)
        {
            return toLegacyStreamType(getAudioAttributes(obj));
        }

        public static int getMaxVolume(Object obj)
        {
            return ((android.media.session.MediaController.PlaybackInfo)obj).getMaxVolume();
        }

        public static int getPlaybackType(Object obj)
        {
            return ((android.media.session.MediaController.PlaybackInfo)obj).getPlaybackType();
        }

        public static int getVolumeControl(Object obj)
        {
            return ((android.media.session.MediaController.PlaybackInfo)obj).getVolumeControl();
        }

        private static int toLegacyStreamType(AudioAttributes audioattributes)
        {
            byte byte0 = 3;
            if ((audioattributes.getFlags() & 1) != 1) goto _L2; else goto _L1
_L1:
            byte0 = 7;
_L4:
            return byte0;
_L2:
            if ((audioattributes.getFlags() & 4) == 4)
            {
                return 6;
            }
            switch (audioattributes.getUsage())
            {
            default:
                return 3;

            case 2: // '\002'
                return 0;

            case 13: // '\r'
                return 1;

            case 3: // '\003'
                return 8;

            case 4: // '\004'
                return 4;

            case 6: // '\006'
                return 2;

            case 5: // '\005'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
                return 5;

            case 1: // '\001'
            case 11: // '\013'
            case 12: // '\f'
            case 14: // '\016'
                break;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public PlaybackInfo()
        {
        }
    }

    public static class TransportControls
    {

        public static void fastForward(Object obj)
        {
            ((android.media.session.MediaController.TransportControls)obj).fastForward();
        }

        public static void pause(Object obj)
        {
            ((android.media.session.MediaController.TransportControls)obj).pause();
        }

        public static void play(Object obj)
        {
            ((android.media.session.MediaController.TransportControls)obj).play();
        }

        public static void rewind(Object obj)
        {
            ((android.media.session.MediaController.TransportControls)obj).rewind();
        }

        public static void seekTo(Object obj, long l)
        {
            ((android.media.session.MediaController.TransportControls)obj).seekTo(l);
        }

        public static void setRating(Object obj, Object obj1)
        {
            ((android.media.session.MediaController.TransportControls)obj).setRating((Rating)obj1);
        }

        public static void skipToNext(Object obj)
        {
            ((android.media.session.MediaController.TransportControls)obj).skipToNext();
        }

        public static void skipToPrevious(Object obj)
        {
            ((android.media.session.MediaController.TransportControls)obj).skipToPrevious();
        }

        public static void stop(Object obj)
        {
            ((android.media.session.MediaController.TransportControls)obj).stop();
        }

        public TransportControls()
        {
        }
    }


    MediaControllerCompatApi21()
    {
    }

    public static Object createCallback(Callback callback)
    {
        return new CallbackProxy(callback);
    }

    public static boolean dispatchMediaButtonEvent(Object obj, KeyEvent keyevent)
    {
        return ((MediaController)obj).dispatchMediaButtonEvent(keyevent);
    }

    public static Object fromToken(Context context, Object obj)
    {
        return new MediaController(context, (android.media.session.MediaSession.Token)obj);
    }

    public static Object getMetadata(Object obj)
    {
        return ((MediaController)obj).getMetadata();
    }

    public static Object getPlaybackInfo(Object obj)
    {
        return ((MediaController)obj).getPlaybackInfo();
    }

    public static Object getPlaybackState(Object obj)
    {
        return ((MediaController)obj).getPlaybackState();
    }

    public static int getRatingType(Object obj)
    {
        return ((MediaController)obj).getRatingType();
    }

    public static Object getTransportControls(Object obj)
    {
        return ((MediaController)obj).getTransportControls();
    }

    public static void registerCallback(Object obj, Object obj1, Handler handler)
    {
        ((MediaController)obj).registerCallback((android.media.session.MediaController.Callback)obj1, handler);
    }

    public static void sendCommand(Object obj, String s, Bundle bundle, ResultReceiver resultreceiver)
    {
        ((MediaController)obj).sendCommand(s, bundle, resultreceiver);
    }

    public static void unregisterCallback(Object obj, Object obj1)
    {
        ((MediaController)obj).unregisterCallback((android.media.session.MediaController.Callback)obj1);
    }
}
