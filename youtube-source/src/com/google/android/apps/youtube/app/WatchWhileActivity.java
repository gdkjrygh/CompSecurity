// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.youtube.app.b.v;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.compat.e;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.fragments.PlayerFragment;
import com.google.android.apps.youtube.app.fragments.RemoteWatchDialogFragment;
import com.google.android.apps.youtube.app.fragments.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.app.honeycomb.b;
import com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.ui.SliderLayout;
import com.google.android.apps.youtube.app.ui.WatchMinimizedTutorialView;
import com.google.android.apps.youtube.app.ui.WatchWhileLayout;
import com.google.android.apps.youtube.app.ui.eq;
import com.google.android.apps.youtube.app.ui.hh;
import com.google.android.apps.youtube.app.ui.iw;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.event.aa;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.ui.g;
import com.google.android.apps.youtube.core.ui.h;
import com.google.android.apps.youtube.core.utils.DeviceOrientationHelper;
import com.google.android.apps.youtube.core.utils.HdmiReceiver;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.core.utils.j;
import com.google.android.apps.youtube.core.utils.n;

// Referenced classes of package com.google.android.apps.youtube.app:
//            GuideActivity, YouTubeApplication, ax, ar, 
//            aq

public class WatchWhileActivity extends GuideActivity
    implements e, eq, iw, h, j, n
{

    private boolean A;
    private boolean B;
    private DeviceOrientationHelper C;
    private HdmiReceiver D;
    private ar E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private Drawable M;
    private float N;
    private WatchMinimizedTutorialView O;
    private boolean P;
    private boolean Q;
    private SharedPreferences R;
    private int S;
    private hh T;
    private WatchWhileLayout x;
    private PlayerFragment y;
    private g z;

    public WatchWhileActivity()
    {
        Q = true;
    }

    private void T()
    {
        K = Math.round((float)O().a() * 1.25F);
        if (W())
        {
            K().a();
        }
        if (!B)
        {
            boolean flag;
            if (U() && W())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e(flag);
        }
    }

    private boolean U()
    {
        return o.getConfiguration().orientation == 2;
    }

    private boolean V()
    {
        return B || !U();
    }

    private boolean W()
    {
        return x.c() == com.google.android.apps.youtube.app.ui.WatchWhileLayout.WatchState.MAXIMIZED;
    }

    private boolean X()
    {
        return x.c() == com.google.android.apps.youtube.app.ui.WatchWhileLayout.WatchState.MINIMIZED;
    }

    private boolean Y()
    {
        return x.c() != com.google.android.apps.youtube.app.ui.WatchWhileLayout.WatchState.DISMISSED;
    }

    private void Z()
    {
        if (v && !G && !F && !w && y.I())
        {
            z.c(true);
            S().a();
        }
    }

    public static Intent a(Context context)
    {
        return (new Intent(context, com/google/android/apps/youtube/app/WatchWhileActivity)).setFlags(0x14000000).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
    }

    static SharedPreferences a(WatchWhileActivity watchwhileactivity)
    {
        return watchwhileactivity.R;
    }

    private void a(float f1)
    {
        int i = ah.a(f1);
        if (L != i)
        {
            L = i;
            y();
        }
    }

    static boolean a(WatchWhileActivity watchwhileactivity, boolean flag)
    {
        watchwhileactivity.P = flag;
        return flag;
    }

    private void aa()
    {
        byte byte0;
        if (J)
        {
            byte0 = 6;
        } else
        {
            byte0 = -1;
        }
        setRequestedOrientation(byte0);
    }

    static WatchWhileLayout b(WatchWhileActivity watchwhileactivity)
    {
        return watchwhileactivity.x;
    }

    private void b(float f1)
    {
        y.q().setAlpha(f1);
        int i = (int)(5F * f1);
        if (i != S)
        {
            S = i;
            f1 = (float)(Math.log((5 - S) + 1) / Math.log(6D));
            y.a(1.0F - f1);
        }
    }

    private void handleVideoControlsVisibilityEvent(aa aa1)
    {
        G = aa1.a;
        if (G)
        {
            if (v)
            {
                z.c(false);
            }
            return;
        } else
        {
            Z();
            return;
        }
    }

    public final void A()
    {
        super.A();
        Z();
    }

    public final void C()
    {
        P().a("PlayerMinimizeManual", "PlayerCarat");
        if (v)
        {
            e(false);
            if (W())
            {
                x.b();
            }
            return;
        } else
        {
            x.g();
            return;
        }
    }

    public final void D()
    {
        if (I)
        {
            finish();
        }
    }

    public final void E()
    {
        y.b(false);
        S().a(false);
    }

    public final void F()
    {
        if (!u && r())
        {
            h();
        } else
        if (!r.c())
        {
            if (v || W())
            {
                y.G();
                return;
            }
            if (X())
            {
                P().a("PlayerMaximizeManual", "PlayerClick");
                if (V())
                {
                    x.f();
                    return;
                } else
                {
                    e(true);
                    return;
                }
            }
        }
    }

    public final void G()
    {
        if (!u && r())
        {
            h();
        }
    }

    public final void H()
    {
        if (D.c())
        {
            C.disable();
            aa();
        } else
        if (J)
        {
            setRequestedOrientation(6);
            return;
        }
    }

    public final void I()
    {
        n.p().h();
    }

    public final hh J()
    {
        if (T == null)
        {
            T = new hh(this, q(), P(), n.d().as());
        }
        return T;
    }

    public final void a(int i, float f1)
    {
        float f3 = 1.0F;
        SupportActionBar supportactionbar = K();
        float f2;
        if (i < K)
        {
            supportactionbar.a();
        } else
        {
            supportactionbar.b();
        }
        y.b(true);
        if (f1 < 0.75F)
        {
            f2 = 0.0F;
        } else
        if (f1 < 1.0F)
        {
            f2 = (f1 - 0.75F) / 0.25F;
        } else
        {
            f2 = 1.0F;
        }
        a(f2);
        if (f1 <= 2.0F) goto _L2; else goto _L1
_L1:
        f2 = (3F - f1) * N;
_L4:
        N = f2;
        b(f2);
        S().a(true);
        return;
_L2:
        f2 = f3;
        if (f1 > 1.0F)
        {
            f2 = 0.25F + (2.0F - f1) * 0.75F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(int i, int k)
    {
        super.a(i, k);
        if (!u)
        {
            i = k - i;
        } else
        {
            i = 0;
        }
        if (x != null)
        {
            x.setHorizontalDisplacement(i);
        }
    }

    protected final void a(GuideActivity.IntentType intenttype, boolean flag)
    {
        if (intenttype == GuideActivity.IntentType.WATCH && flag)
        {
            H = true;
        }
    }

    protected final void a(PaneDescriptor panedescriptor, int i)
    {
        if (W() && (i & 1) != 0)
        {
            P().a("PlayerMinimizeManual", "Browse");
            x.g();
        }
        super.a(panedescriptor, i);
    }

    public final void a(RemoteControl remotecontrol, boolean flag)
    {
        super.a(remotecontrol, flag);
        y.a(remotecontrol, flag);
    }

    public final void a(com.google.android.apps.youtube.app.ui.WatchWhileLayout.WatchState watchstate)
    {
        boolean flag = false;
        b();
        boolean flag1 = W();
        boolean flag2 = X();
        SupportActionBar supportactionbar = K();
        if (!v)
        {
            if (flag1)
            {
                supportactionbar.a();
                if (!V())
                {
                    e(true);
                }
            } else
            {
                supportactionbar.b();
                a(1.0F);
            }
        } else
        {
            supportactionbar.a();
            if (!flag1)
            {
                e(false);
            }
        }
        if (Y())
        {
            b(1.0F);
            y.a(flag2);
        } else
        {
            y.F();
            RemoteControl remotecontrol = B().e();
            if (remotecontrol != null && !TextUtils.isEmpty(remotecontrol.p()))
            {
                remotecontrol.g();
            }
        }
        if (!v && flag2)
        {
            H = false;
            I = false;
            aa();
        }
        if (!Q && flag2 && P)
        {
            O.setTargetView(getWindow().getDecorView(), y.O());
            O.setVisibility(0);
            S().b(true);
        }
        if (watchstate == com.google.android.apps.youtube.app.ui.WatchWhileLayout.WatchState.MINIMIZED || watchstate == com.google.android.apps.youtube.app.ui.WatchWhileLayout.WatchState.DISMISSED)
        {
            flag = true;
        }
        Q = flag;
        S().c(W());
    }

    public final boolean a(MotionEvent motionevent)
    {
        if (W() || x.e())
        {
            return false;
        } else
        {
            return super.a(motionevent);
        }
    }

    public final boolean a(com.google.android.apps.youtube.app.compat.j j1)
    {
        if (x != null && W())
        {
            return false;
        } else
        {
            return super.a(j1);
        }
    }

    protected final void b(WatchDescriptor watchdescriptor)
    {
label0:
        {
label1:
            {
                if (watchdescriptor.mustAuthenticate() && !n.d().aT().b())
                {
                    m();
                    return;
                }
                n.d().bf().a(new v());
                Object obj = n.p().e();
                Object obj1 = n.r();
                PlaybackStartDescriptor playbackstartdescriptor = watchdescriptor.getPlaybackStartDescriptor();
                if (obj != null && !watchdescriptor.shouldSkipRemoteDialog() && !((ae) (obj1)).b(playbackstartdescriptor))
                {
                    if (!playbackstartdescriptor.isFromRemoteQueue())
                    {
                        break label1;
                    }
                    ((RemoteControl) (obj)).a(playbackstartdescriptor.getVideoId(), playbackstartdescriptor.getPlaylistId(), playbackstartdescriptor.getPlaylistIndex());
                }
                i();
                I = watchdescriptor.shouldFinishOnEnded();
                H = H | I;
                boolean flag;
                if (I || watchdescriptor.shouldForceFullscreen())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                J = flag;
                if (v || J || !V())
                {
                    x.a();
                    e(true);
                    if (J)
                    {
                        setRequestedOrientation(6);
                    }
                    y.a(watchdescriptor, J);
                    return;
                }
                break label0;
            }
            n.D().b("MdxModalShow");
            obj = new RemoteWatchDialogFragment();
            obj1 = new Bundle();
            ((Bundle) (obj1)).putParcelable("watch", watchdescriptor);
            ((DialogFragment) (obj)).g(((Bundle) (obj1)));
            ((DialogFragment) (obj)).a(c(), null);
            return;
        }
        if (!w) goto _L2; else goto _L1
_L1:
        x.a();
_L4:
        y.g(true);
        y.a(watchdescriptor);
        return;
_L2:
        if (!Y())
        {
            x.b();
        }
        if (X() && !watchdescriptor.noAnimation())
        {
            y.a(false);
            y.b(true);
            E.sendEmptyMessage(1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(boolean flag)
    {
    }

    public final boolean b(com.google.android.apps.youtube.app.compat.j j1)
    {
        if (x != null && W())
        {
            O().a("yt_watch");
            if (t != null)
            {
                t.b(false);
            }
            return true;
        } else
        {
            return super.b(j1);
        }
    }

    public final void c(boolean flag)
    {
        C.disable();
        if (android.provider.Settings.System.getInt(getApplicationContext().getContentResolver(), "accelerometer_rotation", 0) == 1)
        {
            aa();
        }
    }

    protected final int e()
    {
        if (com.google.android.apps.youtube.core.utils.l.a(this))
        {
            A = true;
            B = true;
            return com.google.android.youtube.l.bo;
        } else
        {
            A = false;
            B = false;
            return com.google.android.youtube.l.aB;
        }
    }

    protected final void f()
    {
        boolean flag = k();
        super.f();
        if (flag && p.a() && l())
        {
            x.d();
            e(false);
        }
    }

    public final void f_()
    {
        if (v)
        {
            y.G();
        }
    }

    public void finish()
    {
        y.F();
        super.finish();
    }

    public final void g(boolean flag)
    {
        F = flag;
        Z();
    }

    public final void h(boolean flag)
    {
        if (flag)
        {
            z.c(false);
            return;
        } else
        {
            Z();
            return;
        }
    }

    public void onBackPressed()
    {
        if (Y())
        {
            if ((v || W()) && y.E())
            {
                return;
            }
            if (H)
            {
                finish();
                return;
            }
            if (v)
            {
                e(false);
                return;
            }
            if (W())
            {
                P().a("PlayerMinimizeManual", "Back");
                x.g();
                return;
            }
        }
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        T();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        n = (YouTubeApplication)getApplication();
        x = (WatchWhileLayout)findViewById(com.google.android.youtube.j.gr);
        x.setListener(this);
        y = (PlayerFragment)q.a(com.google.android.youtube.j.dx);
        z = new g(getWindow(), getActionBar(), y.O(), this);
        z.a(false);
        C = new DeviceOrientationHelper(this, this);
        E = new ar(this);
        D = new HdmiReceiver(this, this);
        com.google.android.apps.youtube.app.honeycomb.b.a(this, y);
        if (bundle != null)
        {
            H = bundle.getBoolean("finish_on_back", false);
            I = bundle.getBoolean("finish_on_watch_ended", false);
        }
        R = n.B();
        if (R.getInt("watch_while_tutorial_views_remaining", 3) > 0)
        {
            bundle = LayoutInflater.from(this);
            ViewGroup viewgroup = (ViewGroup)getWindow().getDecorView();
            O = (WatchMinimizedTutorialView)bundle.inflate(com.google.android.youtube.l.bM, viewgroup).findViewById(com.google.android.youtube.j.gp);
            O.setDismissListener(new aq(this));
            P = true;
        }
    }

    protected void onDestroy()
    {
        z.a();
        C.disable();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (Y())
            {
                flag = y.onKeyDown(i, keyevent);
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = flag1;
                if (!super.onKeyDown(i, keyevent))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (Y())
            {
                flag = y.onKeyUp(i, keyevent);
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = flag1;
                if (!super.onKeyUp(i, keyevent))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    protected void onPause()
    {
        super.onPause();
        n.E().b(this);
        K().b(this);
        C.disable();
        E.removeMessages(1);
    }

    protected void onResume()
    {
        super.onResume();
        n.d().bf().a(this);
        T();
        y();
        K().a(this);
        C.enable();
        a(1.0F);
        if (!J)
        {
            y.g(true);
        }
        Object obj = B().e();
        if (obj != null && ((RemoteControl) (obj)).b() == com.google.android.apps.youtube.app.remote.RemoteControl.State.CONNECTED && !TextUtils.isEmpty(((RemoteControl) (obj)).p()) && !Y())
        {
            obj = new WatchDescriptor(new PlaybackStartDescriptor(((RemoteControl) (obj)).p(), ((RemoteControl) (obj)).r(), ((RemoteControl) (obj)).q(), 0, WatchFeature.REMOTE_QUEUE));
            ((WatchDescriptor) (obj)).setSkipRemoteDialog(true);
            ((WatchDescriptor) (obj)).setNoAnimation(true);
            b(((WatchDescriptor) (obj)));
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("finish_on_back", H);
        bundle.putBoolean("finish_on_watch_ended", I);
    }

    protected void onStart()
    {
        super.onStart();
        D.a();
    }

    protected void onStop()
    {
        z.c(false);
        D.b();
        super.onStop();
    }

    public final boolean p()
    {
        return !W() && super.p();
    }

    protected final void t()
    {
        super.t();
        if (!u && x != null)
        {
            x.setEnabled(false);
        }
    }

    protected final void u()
    {
        super.u();
        if (x != null)
        {
            x.setEnabled(true);
        }
    }

    public final void v()
    {
        super.v();
        if (x != null)
        {
            x.setHorizontalDisplacement(0);
            x.setEnabled(true);
        }
    }

    protected final void w()
    {
        int i = O().a();
        findViewById(com.google.android.youtube.j.di).setPadding(0, i, 0, 0);
        findViewById(com.google.android.youtube.j.bv).setPadding(0, i, 0, 0);
    }

    protected final void x()
    {
        SupportActionBar supportactionbar;
        boolean flag;
        z.b(v);
        x.setFullscreen(v);
        supportactionbar = K();
        flag = U();
        if (!v) goto _L2; else goto _L1
_L1:
        Z();
        if (!flag && !A)
        {
            setRequestedOrientation(6);
        }
        supportactionbar.a();
_L4:
        C.enable();
        y.c(v);
        super.x();
        return;
_L2:
        z.c(false);
        if (!W())
        {
            supportactionbar.b();
        }
        L();
        if (!V())
        {
            P().a("PlayerMinimizeManual", "ExitFullscreen");
            x.b();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final void y()
    {
        SupportActionBar supportactionbar = K();
        if (M == null)
        {
            M = getResources().getDrawable(com.google.android.youtube.h.a);
            supportactionbar.a(M);
        }
        M.setAlpha(L);
    }

    public final void z()
    {
        super.z();
    }
}
