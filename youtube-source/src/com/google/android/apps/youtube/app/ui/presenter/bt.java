// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.a.a.a.a.oi;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.ui.YouTubeDialogFragment;
import com.google.android.apps.youtube.app.ui.gr;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.model.ab;
import com.google.android.apps.youtube.datalib.innertube.model.ap;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bu, bv

final class bt extends YouTubeDialogFragment
{

    private bj Y;
    private a Z;
    private gr aa;
    private View ab;
    private ImageView ac;
    private TextView ad;
    private TextView ae;
    private TextView af;
    private TextView ag;

    private bt()
    {
    }

    bt(byte byte0)
    {
        this();
    }

    static a a(bt bt1)
    {
        return bt1.Z;
    }

    static View b(bt bt1)
    {
        return bt1.ab;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(l.aK, viewgroup, false);
        ab = layoutinflater.findViewById(j.fA);
        ac = (ImageView)layoutinflater.findViewById(j.fy);
        aa = new gr(Y, ac);
        ad = (TextView)layoutinflater.findViewById(j.fF);
        ae = (TextView)layoutinflater.findViewById(j.ag);
        af = (TextView)layoutinflater.findViewById(j.eK);
        ag = (TextView)layoutinflater.findViewById(j.aH);
        return layoutinflater;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Y = ((YouTubeApplication)i().getApplicationContext()).d().aw();
        Z = ((WatchWhileActivity)i()).q();
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = super.c(bundle);
        bundle.getWindow().requestFeature(1);
        return bundle;
    }

    public final void d()
    {
        super.d();
        Object obj = h();
        if (obj == null || !((Bundle) (obj)).containsKey("playlist_header"))
        {
            a();
        } else
        {
            byte abyte0[] = ((Bundle) (obj)).getByteArray("playlist_header");
            try
            {
                oi oi1 = new oi();
                com.google.protobuf.nano.c.a(oi1, abyte0);
                abyte0 = new ab(oi1);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                a();
                return;
            }
            ad.setText(abyte0.c());
            ae.setText(abyte0.h());
            af.setText(abyte0.f());
            if (TextUtils.isEmpty(abyte0.g()))
            {
                ag.setVisibility(8);
            } else
            {
                ag.setVisibility(0);
                ag.setText(abyte0.g());
            }
            if (abyte0.e() != null)
            {
                ae.setOnClickListener(new bu(this, abyte0));
            }
            abyte0 = abyte0.d();
            if (abyte0.a())
            {
                aa.a(abyte0, new bv(this));
                return;
            }
        }
    }
}
