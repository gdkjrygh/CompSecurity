// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.accounts.Account;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.honeycomb.ui.j;
import com.google.android.apps.youtube.app.honeycomb.ui.n;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.aa;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.as;
import com.google.android.apps.youtube.core.identity.o;
import com.google.android.youtube.l;
import com.google.android.youtube.p;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            YouTubeActivity, aj, ai, ak, 
//            ag, ah, af

public class UploadActivity extends YouTubeActivity
    implements n
{

    private YouTubeApplication n;
    private o o;
    private com.google.android.apps.youtube.core.identity.l p;
    private aa q;
    private as r;
    private j s;
    private aw t;
    private Executor u;
    private boolean v;
    private boolean w;

    public UploadActivity()
    {
    }

    private void a(android.content.DialogInterface.OnClickListener onclicklistener)
    {
        (new android.app.AlertDialog.Builder(this)).setMessage(p.fK).setPositiveButton(p.fM, onclicklistener).setNegativeButton(p.fL, new com.google.android.apps.youtube.app.honeycomb.phone.aj(this)).setOnCancelListener(new ai(this)).show();
    }

    static void a(UploadActivity uploadactivity)
    {
        uploadactivity.i();
    }

    static aw b(UploadActivity uploadactivity)
    {
        return uploadactivity.t;
    }

    static boolean c(UploadActivity uploadactivity)
    {
        return uploadactivity.YouTubeActivity.g();
    }

    static void d(UploadActivity uploadactivity)
    {
        uploadactivity.FragmentActivity.onBackPressed();
    }

    static void e(UploadActivity uploadactivity)
    {
        if (uploadactivity.v && !uploadactivity.w)
        {
            uploadactivity.s.a(uploadactivity.getIntent(), uploadactivity.r.a(uploadactivity.p).name);
            uploadactivity.w = true;
        }
    }

    private void i()
    {
        o.a(this, new ak(this, (byte)0));
    }

    public final boolean a(com.google.android.apps.youtube.app.compat.j j1)
    {
        return super.a(j1) | s.a(j1);
    }

    protected final Dialog a_(int k)
    {
        Dialog dialog1 = s.a(k);
        Dialog dialog = dialog1;
        if (dialog1 == null)
        {
            dialog = super.a_(k);
        }
        return dialog;
    }

    public final String d()
    {
        return "yt_upload";
    }

    public final void e()
    {
        finish();
        N().d();
    }

    protected final boolean e_()
    {
        return false;
    }

    public final void f()
    {
        finish();
        N().d();
    }

    public final boolean g()
    {
        a(new ag(this));
        return true;
    }

    public void handleSignOutEvent(aj aj1)
    {
        finish();
    }

    public void onBackPressed()
    {
        a(new ah(this));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = LayoutInflater.from(this).inflate(l.bt, null);
        setContentView(bundle);
        setTitle(p.gq);
        n = (YouTubeApplication)getApplication();
        ax ax1 = n.d();
        o = ax1.k();
        p = ax1.aT();
        q = ax1.bk();
        r = ax1.aQ();
        t = ax1.aO();
        u = ax1.aI();
        s = new j(this, bundle, ax1.f(), this, t, M());
    }

    protected void onPause()
    {
        super.onPause();
        n.E().b(this);
    }

    protected void onResume()
    {
        super.onResume();
        n.E().a(this);
    }

    protected void onStart()
    {
        super.onStart();
        v = true;
        if (!p.b())
        {
            q.a(this, new af(this));
            return;
        } else
        {
            i();
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        v = false;
        if (w)
        {
            s.a();
            w = false;
        }
    }
}
