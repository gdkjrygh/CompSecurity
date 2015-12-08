// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;


// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            ao, MediaActionHelper

public abstract class <init> extends Enum
{

    private static final SCROLL $VALUES[];
    public static final SCROLL CC;
    public static final SCROLL FAST_FORWARD;
    public static final SCROLL HOME;
    public static final SCROLL NEXT;
    public static final SCROLL PAUSE;
    public static final SCROLL PLAY;
    public static final SCROLL PREVIOUS;
    public static final SCROLL REWIND;
    public static final SCROLL SCROLL;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/MediaActionHelper$Action, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    public abstract void execute(MediaActionHelper mediaactionhelper);

    public boolean isRepeatable()
    {
        return false;
    }

    static 
    {
        class _cls1 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                MediaActionHelper.b(mediaactionhelper).b(MediaActionHelper.a(mediaactionhelper));
            }

            public final boolean isRepeatable()
            {
                return true;
            }

            _cls1(String s, int i)
            {
                super(s, i, null);
            }
        }

        FAST_FORWARD = new _cls1("FAST_FORWARD", 0);
        class _cls2 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                MediaActionHelper.b(mediaactionhelper).a(MediaActionHelper.a(mediaactionhelper));
            }

            public final boolean isRepeatable()
            {
                return true;
            }

            _cls2(String s, int i)
            {
                super(s, i, null);
            }
        }

        REWIND = new _cls2("REWIND", 1);
        class _cls3 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                MediaActionHelper.b(mediaactionhelper).c();
            }

            _cls3(String s, int i)
            {
                super(s, i, null);
            }
        }

        PAUSE = new _cls3("PAUSE", 2);
        class _cls4 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                MediaActionHelper.b(mediaactionhelper).b();
            }

            _cls4(String s, int i)
            {
                super(s, i, null);
            }
        }

        PLAY = new _cls4("PLAY", 3);
        class _cls5 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                MediaActionHelper.b(mediaactionhelper).d();
            }

            _cls5(String s, int i)
            {
                super(s, i, null);
            }
        }

        NEXT = new _cls5("NEXT", 4);
        class _cls6 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                MediaActionHelper.b(mediaactionhelper).a();
            }

            _cls6(String s, int i)
            {
                super(s, i, null);
            }
        }

        PREVIOUS = new _cls6("PREVIOUS", 5);
        class _cls7 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                MediaActionHelper.b(mediaactionhelper).e();
            }

            _cls7(String s, int i)
            {
                super(s, i, null);
            }
        }

        CC = new _cls7("CC", 6);
        class _cls8 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                MediaActionHelper.b(mediaactionhelper);
            }

            _cls8(String s, int i)
            {
                super(s, i, null);
            }
        }

        HOME = new _cls8("HOME", 7);
        class _cls9 extends MediaActionHelper.Action
        {

            public final void execute(MediaActionHelper mediaactionhelper)
            {
                L.b("Scrolling is not handled here");
            }

            _cls9(String s, int i)
            {
                super(s, i, null);
            }
        }

        SCROLL = new _cls9("SCROLL", 8);
        $VALUES = (new .VALUES[] {
            FAST_FORWARD, REWIND, PAUSE, PLAY, NEXT, PREVIOUS, CC, HOME, SCROLL
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }

    _cls9(String s, int i, ao ao)
    {
        this(s, i);
    }
}
