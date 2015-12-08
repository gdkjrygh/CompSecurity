// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import com.google.android.apps.ytremote.logic.exception.ParseException;

public final class RemotePlayerState extends Enum
{

    private static final RemotePlayerState $VALUES[];
    public static final RemotePlayerState ADVERTISEMENT;
    public static final RemotePlayerState BUFFERING;
    public static final RemotePlayerState ENDED;
    public static final RemotePlayerState PAUSED;
    public static final RemotePlayerState PLAYING;
    public static final RemotePlayerState UNSTARTED;
    public static final RemotePlayerState VIDEO_CUED;
    private final int stateValue;

    private RemotePlayerState(String s, int i, int j)
    {
        super(s, i);
        stateValue = j;
    }

    public static RemotePlayerState forValue(int i)
    {
        RemotePlayerState aremoteplayerstate[] = values();
        int k = aremoteplayerstate.length;
        for (int j = 0; j < k; j++)
        {
            RemotePlayerState remoteplayerstate = aremoteplayerstate[j];
            if (remoteplayerstate.stateValue == i)
            {
                return remoteplayerstate;
            }
        }

        throw new ParseException((new StringBuilder("No RemotePlayerState for value ")).append(i).toString());
    }

    public static RemotePlayerState valueOf(String s)
    {
        return (RemotePlayerState)Enum.valueOf(com/google/android/apps/ytremote/backend/model/RemotePlayerState, s);
    }

    public static RemotePlayerState[] values()
    {
        return (RemotePlayerState[])$VALUES.clone();
    }

    public final int value()
    {
        return stateValue;
    }

    static 
    {
        UNSTARTED = new RemotePlayerState("UNSTARTED", 0, -1);
        ENDED = new RemotePlayerState("ENDED", 1, 0);
        PLAYING = new RemotePlayerState("PLAYING", 2, 1);
        PAUSED = new RemotePlayerState("PAUSED", 3, 2);
        BUFFERING = new RemotePlayerState("BUFFERING", 4, 3);
        VIDEO_CUED = new RemotePlayerState("VIDEO_CUED", 5, 5);
        ADVERTISEMENT = new RemotePlayerState("ADVERTISEMENT", 6, 1081);
        $VALUES = (new RemotePlayerState[] {
            UNSTARTED, ENDED, PLAYING, PAUSED, BUFFERING, VIDEO_CUED, ADVERTISEMENT
        });
    }
}
