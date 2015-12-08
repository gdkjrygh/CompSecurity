// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.compat.o;
import com.google.android.apps.youtube.app.compat.q;
import com.google.android.apps.youtube.app.ui.PrivacySpinner;
import com.google.android.apps.youtube.app.ui.hb;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.transfer.w;
import com.google.android.apps.youtube.core.transfer.z;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.m;
import com.google.android.youtube.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            k, o, p, n, 
//            l, m

public final class j
    implements z
{

    private static final String a[] = {
        "_id", "_data", "_display_name", "_size", "mime_type", "duration", "latitude", "longitude"
    };
    private com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy A;
    private boolean B;
    private final List C = new LinkedList();
    private int D;
    private boolean E;
    private long F;
    private final bc G;
    private boolean H;
    private boolean I;
    private q J;
    private final Activity b;
    private final ContentResolver c;
    private final SharedPreferences d;
    private final Analytics e;
    private final n f;
    private final w g;
    private final aw h;
    private final o i;
    private final b j;
    private String k;
    private String l;
    private Bitmap m;
    private final ImageView n;
    private final PrivacySpinner o;
    private final CheckBox p;
    private final View q;
    private final TextView r;
    private final EditText s;
    private final EditText t;
    private final EditText u;
    private final TextView v;
    private final hb w;
    private String x;
    private String y;
    private String z;

    public j(Activity activity, View view, bc bc1, n n1, aw aw1, o o1)
    {
        G = bc1;
        b = (Activity)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        f = n1;
        h = (aw)com.google.android.apps.youtube.common.fromguava.c.a(aw1);
        i = (o)com.google.android.apps.youtube.common.fromguava.c.a(o1);
        n1 = (YouTubeApplication)activity.getApplicationContext();
        c = activity.getContentResolver();
        d = activity.getSharedPreferences("youtube", 0);
        e = n1.D();
        A = com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.valueOf(d.getString("upload_privacy", com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PRIVATE.name()));
        r = (TextView)view.findViewById(com.google.android.youtube.j.aP);
        n = (ImageView)view.findViewById(com.google.android.youtube.j.fy);
        s = (EditText)view.findViewById(com.google.android.youtube.j.fG);
        t = (EditText)view.findViewById(com.google.android.youtube.j.aI);
        u = (EditText)view.findViewById(com.google.android.youtube.j.bV);
        o = (PrivacySpinner)view.findViewById(com.google.android.youtube.j.dP);
        o.setPrivacy(A);
        p = (CheckBox)view.findViewById(com.google.android.youtube.j.bH);
        q = view.findViewById(com.google.android.youtube.j.bI);
        v = (TextView)view.findViewById(com.google.android.youtube.j.fv);
        v.setMovementMethod(LinkMovementMethod.getInstance());
        w = new hb(activity, new k(this));
        j = com.google.android.apps.youtube.common.a.a.a(activity, new com.google.android.apps.youtube.app.honeycomb.ui.o(this, (byte)0));
        g = new w(activity, bc1);
    }

    private com.google.android.apps.youtube.app.honeycomb.ui.p a(Uri uri)
    {
        Object obj;
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        try
        {
            obj = c.query(uri, a, "mime_type LIKE 'video/%'", null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.c((new StringBuilder("Error resolving content from URL ")).append(uri).append(": ").append(((SQLiteException) (obj)).getMessage()).toString());
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        boolean flag = ((Cursor) (obj)).moveToFirst();
        if (!flag)
        {
            ((Cursor) (obj)).close();
            return null;
        }
        com.google.android.apps.youtube.app.honeycomb.ui.p p1;
        p1 = new com.google.android.apps.youtube.app.honeycomb.ui.p((byte)0);
        com.google.android.apps.youtube.app.honeycomb.ui.p.a(p1, a(((Cursor) (obj)), "_id"));
        com.google.android.apps.youtube.app.honeycomb.ui.p.a(p1, b(((Cursor) (obj)), "mime_type"));
        com.google.android.apps.youtube.app.honeycomb.ui.p.b(p1, a(((Cursor) (obj)), "duration"));
        com.google.android.apps.youtube.app.honeycomb.ui.p.b(p1, b(((Cursor) (obj)), "latitude"));
        com.google.android.apps.youtube.app.honeycomb.ui.p.c(p1, b(((Cursor) (obj)), "longitude"));
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        com.google.android.apps.youtube.app.honeycomb.ui.p.a(p1, m);
_L1:
        com.google.android.apps.youtube.app.honeycomb.ui.p.a(p1, uri);
        com.google.android.apps.youtube.app.honeycomb.ui.p.d(p1, uri.getLastPathSegment());
        if (com.google.android.apps.youtube.app.honeycomb.ui.p.g(p1).startsWith("video/"))
        {
            break MISSING_BLOCK_LABEL_314;
        }
        L.c((new StringBuilder("invalid file type [")).append(com.google.android.apps.youtube.app.honeycomb.ui.p.g(p1)).append("]").toString());
        ((Cursor) (obj)).close();
        return null;
        if (android.os.Build.VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(b, uri))
        {
            com.google.android.apps.youtube.app.honeycomb.ui.p.a(p1, DocumentsContract.getDocumentThumbnail(c, uri, new Point(96, 96), null));
        }
        if (com.google.android.apps.youtube.app.honeycomb.ui.p.c(p1) == null)
        {
            com.google.android.apps.youtube.app.honeycomb.ui.p.a(p1, android.provider.MediaStore.Video.Thumbnails.getThumbnail(c, com.google.android.apps.youtube.app.honeycomb.ui.p.f(p1).longValue(), 3, null));
        }
          goto _L1
        uri;
        ((Cursor) (obj)).close();
        throw uri;
        ((Cursor) (obj)).close();
        return p1;
    }

    static com.google.android.apps.youtube.app.honeycomb.ui.p a(j j1, Uri uri)
    {
        return j1.a(uri);
    }

    private com.google.android.apps.youtube.datalib.model.transfer.a a(com.google.android.apps.youtube.app.honeycomb.ui.p p1)
    {
        com.google.android.apps.youtube.datalib.model.transfer.a a1 = new com.google.android.apps.youtube.datalib.model.transfer.a();
        if (l != null)
        {
            a1.a("username", l);
        }
        if (com.google.android.apps.youtube.app.honeycomb.ui.p.e(p1) != null)
        {
            a1.a("upload_title", com.google.android.apps.youtube.app.honeycomb.ui.p.e(p1));
        }
        if (com.google.android.apps.youtube.app.honeycomb.ui.p.c(p1) != null)
        {
            a1.a("upload_file_thumbnail", Util.a(com.google.android.apps.youtube.app.honeycomb.ui.p.c(p1)));
        }
        if (com.google.android.apps.youtube.app.honeycomb.ui.p.d(p1) != null)
        {
            a1.a("upload_file_duration", com.google.android.apps.youtube.app.honeycomb.ui.p.d(p1).longValue() / 1000L);
        }
        a1.a("upload_start_time_millis", System.currentTimeMillis());
        a1.a("authAccount", k);
        a1.a("upload_description", y);
        a1.a("upload_keywords", z);
        a1.a("upload_privacy", A.name());
        if (B)
        {
            p1 = b(p1);
            if (p1 != null)
            {
                a1.a("upload_location", (new StringBuilder()).append(((Pair) (p1)).first).append(" ").append(((Pair) (p1)).second).toString());
            }
        }
        return a1;
    }

    private static Long a(Cursor cursor, String s1)
    {
        int i1 = cursor.getColumnIndex(s1);
        if (i1 < 0)
        {
            return null;
        } else
        {
            return Long.valueOf(cursor.getLong(i1));
        }
    }

    static String a(j j1, String s1)
    {
        j1.l = s1;
        return s1;
    }

    static void a(j j1)
    {
        if (j1.w.b())
        {
            j1.g.a(j1);
            return;
        } else
        {
            j1.b.showDialog(1021);
            return;
        }
    }

    static boolean a(j j1, boolean flag)
    {
        j1.E = true;
        return true;
    }

    private static Pair b(com.google.android.apps.youtube.app.honeycomb.ui.p p1)
    {
        if (TextUtils.isEmpty(com.google.android.apps.youtube.app.honeycomb.ui.p.a(p1)) || TextUtils.isEmpty(com.google.android.apps.youtube.app.honeycomb.ui.p.b(p1)))
        {
            return null;
        } else
        {
            return Pair.create(Double.valueOf(com.google.android.apps.youtube.app.honeycomb.ui.p.a(p1)), Double.valueOf(com.google.android.apps.youtube.app.honeycomb.ui.p.b(p1)));
        }
    }

    private static String b(Cursor cursor, String s1)
    {
        int i1 = cursor.getColumnIndex(s1);
        if (i1 < 0)
        {
            return null;
        } else
        {
            return cursor.getString(i1);
        }
    }

    static List b(j j1)
    {
        return j1.C;
    }

    static boolean b(j j1, boolean flag)
    {
        j1.I = true;
        return true;
    }

    static Activity c(j j1)
    {
        return j1.b;
    }

    static ImageView d(j j1)
    {
        return j1.n;
    }

    private void d()
    {
        d.edit().putString("upload_privacy", A.name()).apply();
        if (f != null)
        {
            f.e();
        }
    }

    static TextView e(j j1)
    {
        return j1.r;
    }

    private void e()
    {
        D = C.size();
        x = s.getText().toString().trim();
        y = t.getText().toString().trim();
        z = u.getText().toString().trim();
        A = o.a();
        B = p.isChecked();
        if (TextUtils.isEmpty(x))
        {
            ah.a(b, p.bd, 0);
            if (J != null)
            {
                J.c(p.gq);
            }
        } else
        {
            if (C.size() == 1)
            {
                com.google.android.apps.youtube.app.honeycomb.ui.p p1 = (com.google.android.apps.youtube.app.honeycomb.ui.p)C.get(0);
                com.google.android.apps.youtube.app.honeycomb.ui.p.e(p1, x);
                w w1 = g;
                Uri uri = com.google.android.apps.youtube.app.honeycomb.ui.p.h(p1);
                String s1 = com.google.android.apps.youtube.app.honeycomb.ui.p.i(p1);
                com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy = A;
                String s3 = x;
                String s4 = y;
                String s6 = z;
                Pair pair;
                if (B)
                {
                    pair = b(p1);
                } else
                {
                    pair = null;
                }
                w1.a(uri, s1, privacy, s3, s4, null, s6, pair, a(p1), E);
                return;
            }
            Iterator iterator = C.iterator();
            int i1 = 1;
            while (iterator.hasNext()) 
            {
                com.google.android.apps.youtube.app.honeycomb.ui.p p2 = (com.google.android.apps.youtube.app.honeycomb.ui.p)iterator.next();
                com.google.android.apps.youtube.app.honeycomb.ui.p.e(p2, (new StringBuilder()).append(x).append("(").append(i1).append(")").toString());
                w w2 = g;
                Uri uri1 = com.google.android.apps.youtube.app.honeycomb.ui.p.h(p2);
                String s2 = com.google.android.apps.youtube.app.honeycomb.ui.p.i(p2);
                com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy1 = A;
                String s5 = com.google.android.apps.youtube.app.honeycomb.ui.p.e(p2);
                String s7 = y;
                String s8 = z;
                Pair pair1;
                if (B)
                {
                    pair1 = b(p2);
                } else
                {
                    pair1 = null;
                }
                w2.a(uri1, s2, privacy1, s5, s7, null, s8, pair1, a(p2), E);
                i1++;
            }
        }
    }

    static View f(j j1)
    {
        return j1.q;
    }

    private void f()
    {
        if (H && I && J != null)
        {
            J.a(true);
        }
    }

    static q g(j j1)
    {
        return j1.J;
    }

    static long h(j j1)
    {
        return j1.F;
    }

    static Analytics i(j j1)
    {
        return j1.e;
    }

    static void j(j j1)
    {
        j1.e();
    }

    static void k(j j1)
    {
        j1.f();
    }

    static aw l(j j1)
    {
        return j1.h;
    }

    public final Dialog a(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1021: 
            return w.a();
        }
    }

    public final void a()
    {
        g.c();
    }

    public final void a(Intent intent, String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(intent);
        k = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        s1 = new LinkedList();
        Object obj = intent.getAction();
        if (((String) (obj)).equals("com.google.android.youtube.intent.action.UPLOAD"))
        {
            obj = intent.getData();
            if (obj != null)
            {
                m = (Bitmap)intent.getParcelableExtra("data");
                s1.add(obj);
            }
        } else
        if (((String) (obj)).equals("android.intent.action.SEND"))
        {
            intent = (Uri)intent.getParcelableExtra("android.intent.extra.STREAM");
            if (intent != null)
            {
                s1.add(intent);
            }
        } else
        if (((String) (obj)).equals("android.intent.action.SEND_MULTIPLE"))
        {
            intent = intent.getExtras().getParcelableArrayList("android.intent.extra.STREAM");
            if (intent != null)
            {
                s1.addAll(intent);
            }
        }
        if (s1.isEmpty())
        {
            L.c("no media content uri(s)");
            b.finish();
            return;
        } else
        {
            G.a(j);
            F = SystemClock.elapsedRealtime();
            e.b("UploadFormShown");
            C.clear();
            (new l(this)).execute(new List[] {
                s1
            });
            return;
        }
    }

    public final void a(Exception exception)
    {
label0:
        {
            L.a("Error requesting location for upload", exception);
            D = D - 1;
            if (D == 0)
            {
                if (C.size() != 1)
                {
                    break label0;
                }
                h.c(exception);
                if (J != null)
                {
                    J.c(p.gq);
                    J.a(true);
                }
                e.a("UploadDestinationError", (new StringBuilder()).append(exception.getClass().getCanonicalName()).append(": ").append(exception.getMessage()).toString());
            }
            return;
        }
        d();
    }

    public final void a(boolean flag)
    {
        int j1 = D;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        D = j1 - i1;
        if (D == 0)
        {
            d();
        }
    }

    public final boolean a(com.google.android.apps.youtube.app.compat.j j1)
    {
        boolean flag = false;
        q q1 = j1.c(com.google.android.youtube.j.cy);
        if (q1 != null)
        {
            q1.b(false);
        }
        q1 = j1.c(com.google.android.youtube.j.cv);
        if (q1 != null)
        {
            q1.b(false);
        }
        q1 = j1.c(com.google.android.youtube.j.cz);
        if (q1 != null)
        {
            q1.b(false);
        }
        q1 = j1.c(com.google.android.youtube.j.cw);
        if (q1 != null)
        {
            q1.b(false);
        }
        i.a(m.d, j1);
        J = j1.c(com.google.android.youtube.j.cC);
        if (J != null)
        {
            J.a(new com.google.android.apps.youtube.app.honeycomb.ui.m(this));
            f();
            flag = true;
        }
        return flag;
    }

    public final void b()
    {
        e();
        H = true;
        f();
    }

    public final void c()
    {
        D = D - 1;
        if (C.size() == 1)
        {
            ah.a(b, p.bO, 1);
            if (f != null)
            {
                f.f();
            }
        } else
        if (D == 0)
        {
            d();
            return;
        }
    }

}
