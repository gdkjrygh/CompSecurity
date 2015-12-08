// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.youtube.player.internal.PlayerViewPlaceHolder;
import com.google.android.youtube.player.internal.aq;
import com.google.android.youtube.player.internal.b.a;
import com.google.android.youtube.player.internal.b.c;
import com.google.android.youtube.player.internal.b.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.youtube.player:
//            g, YouTubeBaseActivity, m, l, 
//            YouTubeInitializationResult, f, j, k

public final class YouTubePlayerView extends ViewGroup
    implements g
{

    private final l a;
    private final Set b;
    private final m c;
    private com.google.android.youtube.player.internal.c d;
    private aq e;
    private View f;
    private PlayerViewPlaceHolder g;
    private g h;
    private Bundle i;
    private f j;
    private boolean k;
    private boolean l;

    public YouTubePlayerView(Context context)
    {
        this(context, null);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeset, int i1)
    {
        if (!(context instanceof YouTubeBaseActivity))
        {
            throw new IllegalStateException("A YouTubePlayerView can only be created with an Activity  which extends YouTubeBaseActivity as its context.");
        } else
        {
            this(context, attributeset, i1, ((YouTubeBaseActivity)context).a());
            return;
        }
    }

    YouTubePlayerView(Context context, AttributeSet attributeset, int i1, m m1)
    {
        super((Context)com.google.android.youtube.player.internal.b.d.a(context, "context cannot be null"), attributeset, i1);
        c = (m)com.google.android.youtube.player.internal.b.d.a(m1, "listener cannot be null");
        if (getBackground() == null)
        {
            setBackgroundColor(0xff000000);
        }
        setClipToPadding(false);
        g = new PlayerViewPlaceHolder(context);
        requestTransparentRegion(g);
        addView(g);
        b = new HashSet();
        a = new l(this, (byte)0);
    }

    static View a(YouTubePlayerView youtubeplayerview, View view)
    {
        youtubeplayerview.f = null;
        return null;
    }

    static aq a(YouTubePlayerView youtubeplayerview, aq aq1)
    {
        youtubeplayerview.e = null;
        return null;
    }

    static com.google.android.youtube.player.internal.c a(YouTubePlayerView youtubeplayerview)
    {
        return youtubeplayerview.d;
    }

    static com.google.android.youtube.player.internal.c a(YouTubePlayerView youtubeplayerview, com.google.android.youtube.player.internal.c c1)
    {
        youtubeplayerview.d = null;
        return null;
    }

    private void a(View view)
    {
        boolean flag;
        if (view == g || e != null && view == f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        } else
        {
            return;
        }
    }

    private void a(YouTubeInitializationResult youtubeinitializationresult)
    {
        e = null;
        g.c();
        if (j != null)
        {
            youtubeinitializationresult = j;
            youtubeinitializationresult = h;
            j = null;
        }
    }

    static void a(YouTubePlayerView youtubeplayerview, Activity activity)
    {
        try
        {
            activity = com.google.android.youtube.player.internal.b.c.a().a(activity, youtubeplayerview.d, youtubeplayerview.k);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            com.google.android.youtube.player.internal.b.a.b("Error creating YouTubePlayerView", new Object[] {
                activity
            });
            youtubeplayerview.a(YouTubeInitializationResult.INTERNAL_ERROR);
            return;
        }
        youtubeplayerview.e = new aq(youtubeplayerview.d, activity);
        youtubeplayerview.f = youtubeplayerview.e.a();
        youtubeplayerview.addView(youtubeplayerview.f);
        youtubeplayerview.removeView(youtubeplayerview.g);
        youtubeplayerview.c.a(youtubeplayerview);
        if (youtubeplayerview.j != null)
        {
            if (youtubeplayerview.i != null)
            {
                youtubeplayerview.e.a(youtubeplayerview.i);
                youtubeplayerview.i = null;
            }
            activity = youtubeplayerview.j;
            activity = youtubeplayerview.h;
            activity = youtubeplayerview.e;
            youtubeplayerview.j = null;
        }
    }

    static void a(YouTubePlayerView youtubeplayerview, YouTubeInitializationResult youtubeinitializationresult)
    {
        youtubeplayerview.a(youtubeinitializationresult);
    }

    static boolean b(YouTubePlayerView youtubeplayerview)
    {
        return youtubeplayerview.l;
    }

    static aq c(YouTubePlayerView youtubeplayerview)
    {
        return youtubeplayerview.e;
    }

    static PlayerViewPlaceHolder d(YouTubePlayerView youtubeplayerview)
    {
        return youtubeplayerview.g;
    }

    static View e(YouTubePlayerView youtubeplayerview)
    {
        return youtubeplayerview.f;
    }

    static Set f(YouTubePlayerView youtubeplayerview)
    {
        return youtubeplayerview.b;
    }

    final void a()
    {
        if (e != null)
        {
            e.b();
        }
    }

    final void a(Activity activity, g g1, String s, f f1, Bundle bundle)
    {
        if (e != null || j != null)
        {
            return;
        } else
        {
            com.google.android.youtube.player.internal.b.d.a(activity, "activity cannot be null");
            h = (g)com.google.android.youtube.player.internal.b.d.a(g1, "provider cannot be null");
            j = (f)com.google.android.youtube.player.internal.b.d.a(f1, "listener cannot be null");
            i = bundle;
            g.b();
            d = com.google.android.youtube.player.internal.b.c.a().a(getContext(), s, new j(this, activity), new k(this));
            d.e();
            return;
        }
    }

    final void a(boolean flag)
    {
        if (e != null)
        {
            e.b(flag);
            b(flag);
        }
    }

    public final void addFocusables(ArrayList arraylist, int i1)
    {
        ArrayList arraylist1 = new ArrayList();
        super.addFocusables(arraylist1, i1);
        arraylist.addAll(arraylist1);
        b.clear();
        b.addAll(arraylist1);
    }

    public final void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        ArrayList arraylist1 = new ArrayList();
        super.addFocusables(arraylist1, i1, j1);
        arraylist.addAll(arraylist1);
        b.clear();
        b.addAll(arraylist1);
    }

    public final void addView(View view)
    {
        a(view);
        super.addView(view);
    }

    public final void addView(View view, int i1)
    {
        a(view);
        super.addView(view, i1);
    }

    public final void addView(View view, int i1, int j1)
    {
        a(view);
        super.addView(view, i1, j1);
    }

    public final void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a(view);
        super.addView(view, i1, layoutparams);
    }

    public final void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        a(view);
        super.addView(view, layoutparams);
    }

    final void b()
    {
        if (e != null)
        {
            e.c();
        }
    }

    final void b(boolean flag)
    {
        l = true;
        if (e != null)
        {
            e.a(flag);
        }
    }

    final void c()
    {
        if (e != null)
        {
            e.d();
        }
    }

    public final void clearChildFocus(View view)
    {
        if (hasFocusable())
        {
            requestFocus();
            return;
        } else
        {
            super.clearChildFocus(view);
            return;
        }
    }

    final void d()
    {
        if (e != null)
        {
            e.e();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag;
        flag = false;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        if (e.a(keyevent.getKeyCode(), keyevent) || super.dispatchKeyEvent(keyevent))
        {
            flag = true;
        }
_L4:
        return flag;
_L2:
        if (keyevent.getAction() != 1)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        if (!e.b(keyevent.getKeyCode(), keyevent) && !super.dispatchKeyEvent(keyevent)) goto _L4; else goto _L3
_L3:
        return true;
        return super.dispatchKeyEvent(keyevent);
    }

    final Bundle e()
    {
        if (e == null)
        {
            return i;
        } else
        {
            return e.h();
        }
    }

    public final void focusableViewAvailable(View view)
    {
        super.focusableViewAvailable(view);
        b.add(view);
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(a);
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (e != null)
        {
            e.a(configuration);
        }
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(a);
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (getChildCount() > 0)
        {
            getChildAt(0).layout(0, 0, k1 - i1, l1 - j1);
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        if (getChildCount() > 0)
        {
            View view = getChildAt(0);
            view.measure(i1, j1);
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
            return;
        } else
        {
            setMeasuredDimension(0, 0);
            return;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        super.onTouchEvent(motionevent);
        return true;
    }

    public final void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        b.add(view1);
    }

    public final void setClipToPadding(boolean flag)
    {
    }

    public final void setPadding(int i1, int j1, int k1, int l1)
    {
    }

    public final void setUseTextureView(boolean flag)
    {
        if (flag && android.os.Build.VERSION.SDK_INT < 14)
        {
            com.google.android.youtube.player.internal.b.a.a("Could not enable TextureView because API level is lower than 14", new Object[0]);
            k = false;
            return;
        } else
        {
            k = flag;
            return;
        }
    }
}
