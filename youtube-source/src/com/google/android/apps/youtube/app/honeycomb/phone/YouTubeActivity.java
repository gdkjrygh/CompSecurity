// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.compat.SupportActionBar;
import com.google.android.apps.youtube.app.compat.a;
import com.google.android.apps.youtube.app.compat.i;
import com.google.android.apps.youtube.app.compat.j;
import com.google.android.apps.youtube.app.compat.l;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper;
import com.google.android.apps.youtube.app.honeycomb.ui.g;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.ap;
import com.google.android.apps.youtube.app.ui.es;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.at;
import com.google.android.apps.youtube.core.client.cf;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.al;
import com.google.android.apps.youtube.core.utils.m;
import com.google.android.gms.common.e;
import com.google.android.youtube.h;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            an, am, al, ao, 
//            i

public abstract class YouTubeActivity extends FragmentActivity
    implements i, ap
{

    private an A;
    private com.google.android.apps.youtube.app.honeycomb.phone.i B;
    private boolean C;
    private l D;
    private g E;
    private cf F;
    private YouTubeApplication n;
    private ax o;
    private SharedPreferences p;
    private Analytics q;
    private am r;
    private SupportActionBar s;
    private o t;
    private j u;
    private ActionBarMenuHelper v;
    private boolean w;
    private SparseArray x;
    private boolean y;
    private es z;

    public YouTubeActivity()
    {
    }

    static void a(YouTubeActivity youtubeactivity)
    {
        youtubeactivity.e();
    }

    static boolean a(YouTubeActivity youtubeactivity, boolean flag)
    {
        youtubeactivity.w = false;
        return false;
    }

    private void e()
    {
        a a1 = new a(this);
        onCreatePanelMenu(0, a1);
        onPrepareOptionsMenu(a1);
    }

    private void f()
    {
        int k = com.google.android.gms.common.e.a(this);
        Dialog dialog1;
        switch (k)
        {
        default:
            Dialog dialog = com.google.android.gms.common.e.a(k, this, 17);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setOnDismissListener(new com.google.android.apps.youtube.app.honeycomb.phone.an(this));
            dialog.show();
            // fall through

        case 0: // '\0'
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            dialog1 = com.google.android.gms.common.e.a(k, this, 17);
            break;
        }
        dialog1.setCanceledOnTouchOutside(false);
        dialog1.setOnCancelListener(new com.google.android.apps.youtube.app.honeycomb.phone.am(this));
        dialog1.show();
    }

    public an B()
    {
        return A;
    }

    public final SupportActionBar K()
    {
        if (s == null)
        {
            s = new SupportActionBar(this);
            s.a(getResources().getDrawable(h.a));
        }
        return s;
    }

    public final void L()
    {
        s.a(null);
    }

    public final o M()
    {
        if (t == null)
        {
            t = new o(this, super.getMenuInflater());
        }
        return t;
    }

    public final am N()
    {
        return r;
    }

    public final ActionBarMenuHelper O()
    {
        return v;
    }

    public final Analytics P()
    {
        return q;
    }

    public final com.google.android.apps.youtube.app.honeycomb.phone.i Q()
    {
        return B;
    }

    protected final void R()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            getWindow().requestFeature(9);
            return;
        } else
        {
            C = true;
            return;
        }
    }

    public final g S()
    {
        return E;
    }

    protected Dialog a(int k, Bundle bundle)
    {
        switch (k)
        {
        default:
            return null;

        case 2: // '\002'
            return o.aD().a(this, bundle);
        }
    }

    public final void a(Intent intent, int k, ao ao1)
    {
        if (x != null && x.get(906) != null)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return;
        }
        if (x == null)
        {
            x = new SparseArray();
        }
        x.put(906, ao1);
        startActivityForResult(intent, 906);
    }

    public void a(RemoteControl remotecontrol, boolean flag)
    {
        if (remotecontrol != null)
        {
            z.a(remotecontrol);
            return;
        } else
        {
            z.a();
            return;
        }
    }

    public final void a(CharSequence charsequence)
    {
        s.a(charsequence);
    }

    protected boolean a(j j1)
    {
        return false;
    }

    public boolean a(q q1)
    {
        return false;
    }

    protected Dialog a_(int k)
    {
        switch (k)
        {
        case 2: // '\002'
        default:
            return null;

        case 3: // '\003'
            return o.k().a(this);

        case 1: // '\001'
            return o.k().b(this);
        }
    }

    public final void b()
    {
        super.b();
        if (android.os.Build.VERSION.SDK_INT < 11 && !w)
        {
            w = true;
            runOnUiThread(new com.google.android.apps.youtube.app.honeycomb.phone.al(this));
        }
    }

    public final void b(int k)
    {
        s.a(k);
    }

    protected boolean b(j j1)
    {
        return true;
    }

    public abstract String d();

    protected boolean e_()
    {
        return true;
    }

    public boolean g()
    {
        Object obj;
        obj = getIntent().getStringExtra("ancestor_classname");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj = new Intent(this, Class.forName(((String) (obj))));
        ((Intent) (obj)).setFlags(0x24000000);
        finish();
        startActivity(((Intent) (obj)));
        return true;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        com.google.android.apps.youtube.common.L.b("Target Activity class for Up event not found", classnotfoundexception);
        r.c();
        return true;
    }

    public MenuInflater getMenuInflater()
    {
        return super.getMenuInflater();
    }

    protected boolean j()
    {
        return false;
    }

    public void onActivityResult(int k, int i1, Intent intent)
    {
        if (x != null && x.get(k) != null)
        {
            ((ao)x.get(k)).a(k, i1, intent);
            if (x != null)
            {
                x.remove(k);
            }
        } else
        {
            if (k == 17)
            {
                f();
                return;
            }
            if (!o.bk().a(this, k, i1, intent))
            {
                m.a(this, k, i1, intent);
                return;
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (D != null && D.isShowing())
        {
            D.a();
        }
        if (e_())
        {
            E.a(B.d());
        }
        s.c();
    }

    protected void onCreate(Bundle bundle)
    {
        f();
        setDefaultKeyMode(3);
        setVolumeControlStream(3);
        y = true;
        super.setContentView(com.google.android.youtube.l.bl);
        s = K();
        s.b(0);
        if (!j())
        {
            s.a(com.google.android.apps.youtube.app.compat.SupportActionBar.HomeAction.UP, true);
        }
        n = (YouTubeApplication)getApplication();
        o = n.d();
        q = o.ba();
        YouTubeApplication youtubeapplication = n;
        p = o.aP();
        r = new com.google.android.apps.youtube.app.honeycomb.a(this);
        v = ActionBarMenuHelper.a(this, r, d());
        z = new es(this, q, o.b().q());
        if (e_())
        {
            A = o.W();
            an an1 = A;
            B = new com.google.android.apps.youtube.app.honeycomb.phone.i(this);
            B.a(getResources().getBoolean(com.google.android.youtube.e.c));
            v.a(B);
            E = new g(this, p, o.Q());
        }
        F = o.L();
        super.onCreate(bundle);
    }

    protected final Dialog onCreateDialog(int k)
    {
        return onCreateDialog(k, null);
    }

    protected final Dialog onCreateDialog(int k, Bundle bundle)
    {
        if (isFinishing())
        {
            return null;
        }
        switch (k)
        {
        default:
            if (bundle != null)
            {
                return a(k, bundle);
            } else
            {
                return a_(k);
            }

        case 1029: 
            D = l.a(this);
            return D;
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag;
        super.onCreateOptionsMenu(menu);
        u = new j(this, menu);
        flag = v.a(u);
        if (!e_()) goto _L2; else goto _L1
_L1:
        B.a(u);
        E.a(B.d());
_L4:
        boolean flag1 = a(u);
        menu = s;
        menu = u;
        return flag | flag1 | SupportActionBar.f();
_L2:
        menu = u.c(com.google.android.youtube.j.cr);
        if (menu != null)
        {
            menu.b(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDestroy()
    {
        if (e_())
        {
            B.c();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        if (z.b(k))
        {
            return true;
        }
        if (android.os.Build.VERSION.SDK_INT <= 11 && k == 82 && keyevent.getRepeatCount() == 0 && keyevent.getAction() == 0)
        {
            showDialog(1029);
            return true;
        } else
        {
            return super.onKeyDown(k, keyevent);
        }
    }

    public boolean onKeyUp(int k, KeyEvent keyevent)
    {
        if (z.c(k))
        {
            return true;
        } else
        {
            return super.onKeyUp(k, keyevent);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            return g();
        }
        menuitem = u.c(menuitem.getItemId());
        if (a(menuitem))
        {
            return true;
        } else
        {
            return v.a(menuitem);
        }
    }

    protected void onPause()
    {
        if (y)
        {
            v.d();
        }
        super.onPause();
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            e();
        }
        b();
    }

    protected void onPrepareDialog(int k, Dialog dialog)
    {
        super.onPrepareDialog(k, dialog);
        k;
        JVM INSTR tableswitch 1029 1029: default 24
    //                   1029 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (u != null)
        {
            ((l)dialog).a(u);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag = super.onPrepareOptionsMenu(menu);
        if (e_())
        {
            menu = B;
            j j1 = u;
            menu.a();
        }
        boolean flag1 = b(u);
        menu = s;
        menu = u;
        boolean flag2 = SupportActionBar.g();
        if (D != null && D.isShowing())
        {
            D.a(u);
        }
        return flag | flag1 | flag2;
    }

    protected void onResume()
    {
        super.onResume();
        q.a(getClass().getSimpleName());
    }

    public boolean onSearchRequested()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            v.a(true);
            return true;
        } else
        {
            return super.onSearchRequested();
        }
    }

    protected void onStart()
    {
        super.onStart();
        n.j().a(getIntent().getData());
        if (e_())
        {
            A.f();
            A.a(this);
            RemoteControl remotecontrol = A.e();
            if (remotecontrol != null)
            {
                z.a(remotecontrol);
            } else
            {
                z.a();
            }
            E.a(B.d());
            n.l().a(E);
            B.b();
        }
    }

    protected void onStop()
    {
        if (e_())
        {
            A.g();
            A.b(this);
            n.l().b(E);
            B.c();
        }
        super.onStop();
    }

    public void onUserInteraction()
    {
        if (F != null)
        {
            F.a();
        }
        super.onUserInteraction();
    }

    public final void setContentView(int k)
    {
        ViewGroup viewgroup = (ViewGroup)getWindow().getDecorView().findViewById(com.google.android.youtube.j.c);
        viewgroup.removeAllViews();
        getLayoutInflater().inflate(k, viewgroup);
    }

    public final void setContentView(View view)
    {
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public final void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ViewGroup viewgroup = (ViewGroup)getWindow().getDecorView().findViewById(com.google.android.youtube.j.c);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
    }
}
