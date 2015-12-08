// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.AudioAttributes;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompatApi21

public static class 
{

    private static final int FLAG_SCO = 4;
    private static final int STREAM_BLUETOOTH_SCO = 6;
    private static final int STREAM_SYSTEM_ENFORCED = 7;

    public static AudioAttributes getAudioAttributes(Object obj)
    {
        return ((android.media.session.aybackInfo)obj).ributes();
    }

    public static int getCurrentVolume(Object obj)
    {
        return ((android.media.session.ributes)obj).olume();
    }

    public static int getLegacyAudioStream(Object obj)
    {
        return toLegacyStreamType(getAudioAttributes(obj));
    }

    public static int getMaxVolume(Object obj)
    {
        return ((android.media.session.aybackInfo.getAudioAttributes)obj).e();
    }

    public static int getPlaybackType(Object obj)
    {
        return ((android.media.session.e)obj).Type();
    }

    public static int getVolumeControl(Object obj)
    {
        return ((android.media.session.Type)obj).ntrol();
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

    public ()
    {
    }
}
