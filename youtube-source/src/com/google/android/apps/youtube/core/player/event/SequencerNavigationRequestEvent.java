// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.event;


public final class SequencerNavigationRequestEvent extends Enum
{

    private static final SequencerNavigationRequestEvent $VALUES[];
    public static final SequencerNavigationRequestEvent AUTOPLAY;
    public static final SequencerNavigationRequestEvent JUMP;
    public static final SequencerNavigationRequestEvent NEXT;
    public static final SequencerNavigationRequestEvent PREVIOUS;
    public static final SequencerNavigationRequestEvent RETRY;
    public static final SequencerNavigationRequestEvent START;

    private SequencerNavigationRequestEvent(String s, int i)
    {
        super(s, i);
    }

    public static SequencerNavigationRequestEvent valueOf(String s)
    {
        return (SequencerNavigationRequestEvent)Enum.valueOf(com/google/android/apps/youtube/core/player/event/SequencerNavigationRequestEvent, s);
    }

    public static SequencerNavigationRequestEvent[] values()
    {
        return (SequencerNavigationRequestEvent[])$VALUES.clone();
    }

    public final transient boolean isIn(SequencerNavigationRequestEvent asequencernavigationrequestevent[])
    {
        boolean flag1 = false;
        int j = asequencernavigationrequestevent.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (this != asequencernavigationrequestevent[i])
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    static 
    {
        START = new SequencerNavigationRequestEvent("START", 0);
        NEXT = new SequencerNavigationRequestEvent("NEXT", 1);
        PREVIOUS = new SequencerNavigationRequestEvent("PREVIOUS", 2);
        AUTOPLAY = new SequencerNavigationRequestEvent("AUTOPLAY", 3);
        RETRY = new SequencerNavigationRequestEvent("RETRY", 4);
        JUMP = new SequencerNavigationRequestEvent("JUMP", 5);
        $VALUES = (new SequencerNavigationRequestEvent[] {
            START, NEXT, PREVIOUS, AUTOPLAY, RETRY, JUMP
        });
    }
}
