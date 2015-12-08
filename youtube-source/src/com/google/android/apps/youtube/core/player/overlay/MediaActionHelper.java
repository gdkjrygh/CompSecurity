// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.youtube.b;
import com.google.android.youtube.h;
import com.google.android.youtube.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            aq, ap, ao, as, 
//            ar

public final class MediaActionHelper
{

    private static final Map a;
    private final as b;
    private final Map c;
    private final int d;
    private final ImageView e;
    private final Animation f;
    private final Animation g;
    private final Handler h = new Handler(new aq(this));
    private double i;
    private boolean j;
    private Action k;

    public MediaActionHelper(Context context, as as1, ImageView imageview)
    {
        Resources resources = context.getResources();
        b = as1;
        c = a(resources, a);
        e = imageview;
        d = resources.getInteger(k.s);
        f = AnimationUtils.loadAnimation(context, b.i);
        g = AnimationUtils.loadAnimation(context, b.j);
    }

    static double a(MediaActionHelper mediaactionhelper)
    {
        return mediaactionhelper.i;
    }

    private static Map a(Resources resources, Map map)
    {
        HashMap hashmap = new HashMap();
        Drawable drawable = resources.getDrawable(h.aC);
        if (drawable instanceof BitmapDrawable)
        {
            ((BitmapDrawable)drawable).getBitmap();
        }
        java.util.Map.Entry entry;
        Object obj;
        for (map = map.entrySet().iterator(); map.hasNext(); hashmap.put(entry.getKey(), obj))
        {
            entry = (java.util.Map.Entry)map.next();
            obj = resources.getDrawable(((Integer)entry.getValue()).intValue());
            if (obj instanceof BitmapDrawable)
            {
                ((BitmapDrawable)obj).getBitmap();
            }
            obj = new LayerDrawable(new Drawable[] {
                drawable, obj
            });
        }

        return Collections.unmodifiableMap(hashmap);
    }

    private void a()
    {
        g.setAnimationListener(new ap(this));
        g.reset();
        e.startAnimation(g);
    }

    private void a(Action action, boolean flag)
    {
        if (!c.containsKey(action))
        {
            return;
        } else
        {
            e.setAlpha(0);
            e.setVisibility(0);
            f.setAnimationListener(new ao(this, flag, action));
            f.reset();
            e.setBackgroundDrawable((Drawable)c.get(action));
            e.startAnimation(f);
            return;
        }
    }

    static void a(MediaActionHelper mediaactionhelper, Action action)
    {
        mediaactionhelper.a();
    }

    static as b(MediaActionHelper mediaactionhelper)
    {
        return mediaactionhelper.b;
    }

    static void b(MediaActionHelper mediaactionhelper, Action action)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(action.isRepeatable());
        mediaactionhelper.c(action);
        mediaactionhelper.d(action);
    }

    static ImageView c(MediaActionHelper mediaactionhelper)
    {
        return mediaactionhelper.e;
    }

    private void c(Action action)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(action.isRepeatable());
        action.execute(this);
        i = Math.min(i * 1.1000000000000001D, 10D);
    }

    private void d(Action action)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(action.isRepeatable());
        action = h.obtainMessage(234, action);
        h.sendMessageDelayed(action, d);
    }

    public final void a(int l)
    {
        b.a(l);
    }

    public final void a(Action action)
    {
label0:
        {
            if (k == null)
            {
                if (!action.isRepeatable())
                {
                    break label0;
                }
                k = action;
                a(action, false);
                com.google.android.apps.youtube.common.fromguava.c.a(action.isRepeatable());
                k = action;
                i = 1.0D;
                c(action);
                d(action);
            }
            return;
        }
        a(action, true);
        action.execute(this);
    }

    public final void a(boolean flag)
    {
        j = flag;
        if (k == Action.REWIND || k == Action.FAST_FORWARD)
        {
            b(k);
        }
    }

    public final boolean a(Action action, ControlsOverlay.Style style)
    {
        return b(action, style) == ActionState.ACTIVE;
    }

    public final ActionState b(Action action, ControlsOverlay.Style style)
    {
        switch (ar.a[action.ordinal()])
        {
        default:
            return ActionState.ACTIVE;

        case 1: // '\001'
        case 2: // '\002'
            if (style.supportsNextPrevious)
            {
                return ActionState.ACTIVE;
            } else
            {
                return ActionState.GONE;
            }

        case 3: // '\003'
        case 4: // '\004'
            if (j && style.supportsScrubber)
            {
                return ActionState.ACTIVE;
            } else
            {
                return ActionState.GONE;
            }

        case 5: // '\005'
            break;
        }
        if (style.supportsScrubber)
        {
            return ActionState.ACTIVE;
        }
        if (style.supportsTimeBar)
        {
            return ActionState.INACTIVE;
        } else
        {
            return ActionState.GONE;
        }
    }

    public final void b(Action action)
    {
        if (k == action)
        {
            if (action.isRepeatable())
            {
                a();
                com.google.android.apps.youtube.common.fromguava.c.a(action.isRepeatable());
                h.removeMessages(234, action);
            }
            k = null;
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put(Action.FAST_FORWARD, Integer.valueOf(h.aD));
        hashmap.put(Action.REWIND, Integer.valueOf(h.aH));
        hashmap.put(Action.PAUSE, Integer.valueOf(h.aF));
        hashmap.put(Action.PLAY, Integer.valueOf(h.aG));
        hashmap.put(Action.NEXT, Integer.valueOf(h.aE));
        hashmap.put(Action.PREVIOUS, Integer.valueOf(h.aB));
        a = Collections.unmodifiableMap(hashmap);
    }

    private class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action CC;
        public static final Action FAST_FORWARD;
        public static final Action HOME;
        public static final Action NEXT;
        public static final Action PAUSE;
        public static final Action PLAY;
        public static final Action PREVIOUS;
        public static final Action REWIND;
        public static final Action SCROLL;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/MediaActionHelper$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        public abstract void execute(MediaActionHelper mediaactionhelper);

        public boolean isRepeatable()
        {
            return false;
        }

        static 
        {
            class _cls1 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.b(mediaactionhelper).b(MediaActionHelper.a(mediaactionhelper));
                }

                public final boolean isRepeatable()
                {
                    return true;
                }

                _cls1(String s, int l)
                {
                    super(s, l, null);
                }
            }

            FAST_FORWARD = new _cls1("FAST_FORWARD", 0);
            class _cls2 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.b(mediaactionhelper).a(MediaActionHelper.a(mediaactionhelper));
                }

                public final boolean isRepeatable()
                {
                    return true;
                }

                _cls2(String s, int l)
                {
                    super(s, l, null);
                }
            }

            REWIND = new _cls2("REWIND", 1);
            class _cls3 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.b(mediaactionhelper).c();
                }

                _cls3(String s, int l)
                {
                    super(s, l, null);
                }
            }

            PAUSE = new _cls3("PAUSE", 2);
            class _cls4 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.b(mediaactionhelper).b();
                }

                _cls4(String s, int l)
                {
                    super(s, l, null);
                }
            }

            PLAY = new _cls4("PLAY", 3);
            class _cls5 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.b(mediaactionhelper).d();
                }

                _cls5(String s, int l)
                {
                    super(s, l, null);
                }
            }

            NEXT = new _cls5("NEXT", 4);
            class _cls6 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.b(mediaactionhelper).a();
                }

                _cls6(String s, int l)
                {
                    super(s, l, null);
                }
            }

            PREVIOUS = new _cls6("PREVIOUS", 5);
            class _cls7 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.b(mediaactionhelper).e();
                }

                _cls7(String s, int l)
                {
                    super(s, l, null);
                }
            }

            CC = new _cls7("CC", 6);
            class _cls8 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.b(mediaactionhelper);
                }

                _cls8(String s, int l)
                {
                    super(s, l, null);
                }
            }

            HOME = new _cls8("HOME", 7);
            class _cls9 extends Action
            {

                public final void execute(MediaActionHelper mediaactionhelper)
                {
                    L.b("Scrolling is not handled here");
                }

                _cls9(String s, int l)
                {
                    super(s, l, null);
                }
            }

            SCROLL = new _cls9("SCROLL", 8);
            $VALUES = (new Action[] {
                FAST_FORWARD, REWIND, PAUSE, PLAY, NEXT, PREVIOUS, CC, HOME, SCROLL
            });
        }

        private Action(String s, int l)
        {
            super(s, l);
        }

        Action(String s, int l, ao ao1)
        {
            this(s, l);
        }
    }


    private class ActionState extends Enum
    {

        private static final ActionState $VALUES[];
        public static final ActionState ACTIVE;
        public static final ActionState GONE;
        public static final ActionState INACTIVE;

        public static ActionState valueOf(String s)
        {
            return (ActionState)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/MediaActionHelper$ActionState, s);
        }

        public static ActionState[] values()
        {
            return (ActionState[])$VALUES.clone();
        }

        static 
        {
            ACTIVE = new ActionState("ACTIVE", 0);
            INACTIVE = new ActionState("INACTIVE", 1);
            GONE = new ActionState("GONE", 2);
            $VALUES = (new ActionState[] {
                ACTIVE, INACTIVE, GONE
            });
        }

        private ActionState(String s, int l)
        {
            super(s, l);
        }
    }

}
