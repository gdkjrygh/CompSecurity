// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ToggleButton;
import com.google.android.apps.youtube.core.player.overlay.MediaActionHelper;
import com.google.android.youtube.api.c;
import com.google.android.youtube.api.e;
import com.google.android.youtube.api.f;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            o, m, n

public class ApiTvControlsView extends LinearLayout
    implements android.view.View.OnClickListener
{

    private static final Map a;
    private static final Map b;
    private final ToggleButton c;
    private final Button d;
    private final Map e;
    private final Set f = EnumSet.noneOf(com/google/android/apps/youtube/core/player/overlay/MediaActionHelper$Action);
    private final Set g;
    private final Set h;
    private final o i = new o(this);
    private MediaActionHelper j;
    private com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style k;
    private boolean l;

    public ApiTvControlsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        k = com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style.YOUTUBE;
        LayoutInflater.from(context).inflate(e.a, this);
        c = (ToggleButton)findViewById(c.o);
        c.setOnClickListener(this);
        setPlaybackState(PlaybackState.PAUSED);
        g = EnumSet.of(com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.CC);
        h = EnumSet.complementOf(EnumSet.of(com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.CC, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.HOME));
        context = new HashMap();
        attributeset = a.entrySet().iterator();
        do
        {
            if (!attributeset.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)attributeset.next();
            View view = findViewById(((Integer)entry.getKey()).intValue());
            com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action = (com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action)entry.getValue();
            context.put(action, view);
            view.setOnClickListener(this);
            if (action != com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.NEXT && action != com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PREVIOUS)
            {
                f.add(entry.getValue());
            }
        } while (true);
        e = Collections.unmodifiableMap(context);
        d = (Button)findViewById(c.b);
        d.setOnClickListener(this);
        ((Button)findViewById(c.l)).setOnClickListener(this);
    }

    private void a(com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action)
    {
        View view = (View)e.get(action);
        if (view != null)
        {
            com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.ActionState actionstate = j.b(action, k);
            if (actionstate == com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.ActionState.GONE || g.contains(action))
            {
                view.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            boolean flag;
            if (actionstate == com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.ActionState.ACTIVE && f.contains(action))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                Drawable drawable = view.getBackground();
                if (drawable != null)
                {
                    drawable.mutate();
                    drawable.clearColorFilter();
                }
                view.setEnabled(true);
                if (action != com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.SCROLL)
                {
                    view.setFocusable(true);
                    return;
                }
            } else
            {
                action = view.getBackground();
                if (action != null)
                {
                    action.mutate();
                    action.setColorFilter(new PorterDuffColorFilter(0xa0000000, android.graphics.PorterDuff.Mode.SRC_ATOP));
                }
                view.setEnabled(false);
                view.setFocusable(false);
                return;
            }
        }
    }

    private void a(boolean flag, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action)
    {
        if (flag)
        {
            f.add(action);
        } else
        {
            f.remove(action);
        }
        a(action);
    }

    public final void a()
    {
        i.a(0, 0, 0);
    }

    public final void a(int i1)
    {
        com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action = (com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action)a.get(Integer.valueOf(i1));
        g.add(action);
        a(action);
    }

    public final void a(int i1, int j1, int k1)
    {
        i.a(i1 / 1000, j1 / 1000, k1);
    }

    public void onClick(View view)
    {
        if (j == null) goto _L2; else goto _L1
_L1:
        if (view.getId() != c.o) goto _L4; else goto _L3
_L3:
        com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action;
        if (c.isChecked())
        {
            action = com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PLAY;
        } else
        {
            action = com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PAUSE;
        }
_L6:
        if (action == null)
        {
            break; /* Loop/switch isn't completed */
        }
        action.execute(j);
_L2:
        return;
_L4:
        com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action1 = (com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action)a.get(Integer.valueOf(view.getId()));
        action = action1;
        if (action1 == null)
        {
            action = null;
        }
        if (true) goto _L6; else goto _L5
_L5:
        throw new IllegalArgumentException((new StringBuilder("Unsupported onClick widget: ")).append(view.getId()).toString());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        String s = getResources().getString(f.m);
        ViewGroup viewgroup = (ViewGroup)findViewById(c.h);
        int k1 = getChildCount();
        int j1;
        for (int i1 = 0; i1 < k1; k1 = j1)
        {
            View view = getChildAt(i1);
            Object obj = view.getTag();
            int l1 = i1;
            j1 = k1;
            if (obj != null)
            {
                l1 = i1;
                j1 = k1;
                if (obj.toString().equals(s))
                {
                    removeView(view);
                    viewgroup.addView(view);
                    j1 = k1 - 1;
                    l1 = i1 - 1;
                }
            }
            i1 = l1 + 1;
        }

    }

    protected void onVisibilityChanged(View view, int i1)
    {
        super.onVisibilityChanged(view, i1);
        if (l && i1 == 0)
        {
            c.requestFocus();
        }
    }

    public void setCcEnabled(boolean flag)
    {
        d.setSelected(flag);
    }

    public void setErrorState(boolean flag)
    {
        boolean flag2 = true;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PLAY);
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.CC);
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.FAST_FORWARD);
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(flag1, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.REWIND);
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        a(flag, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.SCROLL);
    }

    public void setFocus(com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action action)
    {
        findViewById(((Integer)b.get(action)).intValue()).requestFocus();
    }

    public void setMediaActionHelper(MediaActionHelper mediaactionhelper)
    {
        j = (MediaActionHelper)com.google.android.apps.youtube.common.fromguava.c.a(mediaactionhelper);
        i.a(new m(this, mediaactionhelper));
    }

    public void setNextEnabled(boolean flag)
    {
        a(flag, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.NEXT);
    }

    public void setPlayPauseEnabled(boolean flag)
    {
        a(flag, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PLAY);
    }

    public void setPlayTipState()
    {
        a(true, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PLAY);
        a(false, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.CC);
        a(false, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.FAST_FORWARD);
        a(false, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.REWIND);
        a(false, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.SCROLL);
    }

    public void setPlaybackState(PlaybackState playbackstate)
    {
        switch (n.a[playbackstate.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            c.setChecked(true);
            return;

        case 2: // '\002'
            c.setChecked(false);
            break;
        }
    }

    public void setPreviousEnabled(boolean flag)
    {
        a(flag, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PREVIOUS);
    }

    public void setScrubbingEnabled(boolean flag)
    {
        a(flag, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.FAST_FORWARD);
        a(flag, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.REWIND);
        a(flag, com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.SCROLL);
    }

    public void setShowCcButton(boolean flag)
    {
        if (flag)
        {
            g.remove(com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.CC);
        } else
        {
            g.add(com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.CC);
        }
        a(com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.CC);
    }

    public void setStealFocusOnVisible(boolean flag)
    {
        l = flag;
    }

    public void setStyle(com.google.android.apps.youtube.core.player.overlay.ControlsOverlay.Style style)
    {
        k = style;
        i.a(style.supportsTimeBar);
        for (style = h.iterator(); style.hasNext(); a((com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action)style.next())) { }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        hashmap.put(Integer.valueOf(c.o), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PLAY);
        hashmap.put(Integer.valueOf(c.a), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.PREVIOUS);
        hashmap.put(Integer.valueOf(c.j), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.NEXT);
        hashmap.put(Integer.valueOf(c.q), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.REWIND);
        hashmap.put(Integer.valueOf(c.i), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.FAST_FORWARD);
        hashmap.put(Integer.valueOf(c.b), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.CC);
        hashmap.put(Integer.valueOf(c.l), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.HOME);
        hashmap.put(Integer.valueOf(c.p), com.google.android.apps.youtube.core.player.overlay.MediaActionHelper.Action.SCROLL);
        a = Collections.unmodifiableMap(hashmap);
        hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); hashmap.put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        b = Collections.unmodifiableMap(hashmap);
    }

    private class PlaybackState extends Enum
    {

        private static final PlaybackState $VALUES[];
        public static final PlaybackState PAUSED;
        public static final PlaybackState PLAYING;

        public static PlaybackState valueOf(String s)
        {
            return (PlaybackState)Enum.valueOf(com/google/android/apps/youtube/api/jar/ApiTvControlsView$PlaybackState, s);
        }

        public static PlaybackState[] values()
        {
            return (PlaybackState[])$VALUES.clone();
        }

        static 
        {
            PLAYING = new PlaybackState("PLAYING", 0);
            PAUSED = new PlaybackState("PAUSED", 1);
            $VALUES = (new PlaybackState[] {
                PLAYING, PAUSED
            });
        }

        private PlaybackState(String s, int i1)
        {
            super(s, i1);
        }
    }

}
