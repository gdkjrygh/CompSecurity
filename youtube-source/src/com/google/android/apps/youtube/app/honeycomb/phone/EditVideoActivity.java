// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper;
import com.google.android.apps.youtube.app.ui.PrivacySpinner;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.j;
import com.google.android.youtube.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            YouTubeActivity, g, h

public class EditVideoActivity extends YouTubeActivity
    implements b
{

    private Button A;
    private Video B;
    private YouTubeApplication n;
    private com.google.android.apps.youtube.core.identity.l o;
    private bc p;
    private bj q;
    private aw r;
    private com.google.android.apps.youtube.common.c.a s;
    private ImageView t;
    private TextView u;
    private TextView v;
    private EditText w;
    private EditText x;
    private PrivacySpinner y;
    private EditText z;

    public EditVideoActivity()
    {
    }

    public static Intent a(Context context, Video video)
    {
        c.a(video);
        context = new Intent(context, com/google/android/apps/youtube/app/honeycomb/phone/EditVideoActivity);
        context.setAction("android.intent.action.EDIT");
        context.putExtra("video", video);
        return context;
    }

    static void a(EditVideoActivity editvideoactivity)
    {
        String s3 = editvideoactivity.w.getText().toString().trim();
        String s2 = editvideoactivity.x.getText().toString().trim();
        Object obj = editvideoactivity.z.getText().toString().trim();
        if (TextUtils.isEmpty(s3))
        {
            ah.a(editvideoactivity, p.bd, 0);
            return;
        }
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = null;
        }
        s2 = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s2 = null;
        }
        obj = editvideoactivity.y.a();
        editvideoactivity.p.a(s3, s1, editvideoactivity.B.categoryTerm, editvideoactivity.B.categoryLabel, s2, ((com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy) (obj)), editvideoactivity.B.accessControl, editvideoactivity.B.location, editvideoactivity.B.where, editvideoactivity.B.editUri, com.google.android.apps.youtube.common.a.a.a(editvideoactivity, editvideoactivity));
    }

    static ImageView b(EditVideoActivity editvideoactivity)
    {
        return editvideoactivity.t;
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("Error updating video metadata", exception);
        r.c(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        ah.a(this, p.bc, 1);
        finish();
    }

    public final String d()
    {
        return "yt_upload";
    }

    public void handleSignOutEvent(aj aj)
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(l.V);
        b(p.be);
        O().a(com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper.SearchMode.DISABLED);
        n = (YouTubeApplication)getApplication();
        bundle = n.d();
        p = bundle.f();
        r = bundle.aO();
        o = bundle.aT();
        q = bundle.aw();
        s = bundle.bf();
        bundle = findViewById(j.fQ);
        t = (ImageView)bundle.findViewById(j.fy);
        u = (TextView)bundle.findViewById(j.aP);
        w = (EditText)findViewById(j.fG);
        x = (EditText)findViewById(j.aI);
        y = (PrivacySpinner)findViewById(j.dP);
        z = (EditText)findViewById(j.bV);
        A = (Button)findViewById(j.aO);
        A.setEnabled(true);
        A.setText(0x104000a);
        A.setOnClickListener(new g(this));
        v = (TextView)findViewById(j.fv);
        v.setMovementMethod(LinkMovementMethod.getInstance());
    }

    protected void onPause()
    {
        super.onPause();
        s.b(this);
    }

    protected void onResume()
    {
        super.onResume();
        if (!o.b())
        {
            finish();
            return;
        } else
        {
            s.a(this);
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        if (!o.b())
        {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (!"android.intent.action.EDIT".equals(intent.getAction()))
        {
            L.b((new StringBuilder("unsupported action ")).append(intent.getAction()).toString());
            finish();
            return;
        }
        B = (Video)intent.getSerializableExtra("video");
        if (B == null)
        {
            L.b("video not found");
            finish();
            return;
        }
        if (!TextUtils.isEmpty(B.title))
        {
            w.setText(B.title);
        }
        if (!TextUtils.isEmpty(B.description))
        {
            x.setText(B.description);
        }
        if (!TextUtils.isEmpty(B.tags))
        {
            z.setText(B.tags);
        }
        if (B.privacy != null)
        {
            y.setPrivacy(B.privacy);
        }
        u.setText(m.a(B.duration, 3));
        u.setVisibility(0);
        if (B.defaultThumbnailUri != null)
        {
            q.a(B.defaultThumbnailUri, com.google.android.apps.youtube.common.a.a.a(this, new h(this, (byte)0)));
            return;
        } else
        {
            t.setImageDrawable(null);
            return;
        }
    }
}
