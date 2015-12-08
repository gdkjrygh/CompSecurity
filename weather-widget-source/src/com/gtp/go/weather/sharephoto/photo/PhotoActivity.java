// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.app.Dialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.view.pullrefresh.LineRefreshView;
import com.gau.go.launcherex.gowidget.weather.view.pullrefresh.a;
import com.google.analytics.tracking.android.EasyTracker;
import com.gtp.go.weather.sharephoto.PhotoDetailActivity;
import com.gtp.go.weather.sharephoto.UserPhotosActivity;
import com.gtp.go.weather.sharephoto.a.e;
import com.gtp.go.weather.sharephoto.award.k;
import com.gtp.go.weather.sharephoto.award.o;
import com.gtp.go.weather.sharephoto.award.r;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.d.n;
import com.gtp.go.weather.sharephoto.takephoto.aa;
import com.gtp.go.weather.sharephoto.takephoto.m;
import com.jiubang.core.c.a.b;
import com.jiubang.core.c.a.c;
import com.jiubang.pla.listview.MultiColumnListView;
import com.jiubang.pla.listview.d;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ah, l, p, ad, 
//            o, b, q, r, 
//            s, an, v, w, 
//            x, y, n, PhotoTouchRefresh, 
//            ab, aa, z, i, 
//            u, t

public class PhotoActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, a, e, ah, c, com.jiubang.pla.a.c, d
{

    private String A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean F;
    private aa G;
    private r H;
    private k I;
    private View J;
    private View K;
    private View L;
    private View M;
    private an N;
    private LineRefreshView O;
    private View P;
    private TextView Q;
    private PhotoTouchRefresh R;
    private boolean S;
    private View T;
    private TextView U;
    private View V;
    private com.gtp.go.weather.sharephoto.a.a W;
    private com.gau.go.launcherex.gowidget.weather.globalview.b X;
    private com.gtp.go.weather.sharephoto.b.k Y;
    private int Z;
    protected com.jiubang.pla.a.b a;
    private i aa;
    private ViewStub ab;
    private View ac;
    private b ad;
    private g ae;
    private boolean af;
    private final o ag = new l(this);
    private MultiColumnListView b;
    private ad c;
    private ArrayList d;
    private ArrayList e;
    private z f;
    private com.gtp.go.weather.sharephoto.photo.b g;
    private int h;
    private com.gtp.go.weather.sharephoto.c.d i;
    private ViewGroup j;
    private ImageView k;
    private TextView l;
    private View m;
    private ImageView n;
    private Button o;
    private ImageView p;
    private View q;
    private TextView r;
    private View s;
    private ImageView t;
    private Dialog u;
    private ListView v;
    private com.gtp.go.weather.sharephoto.photo.aa w;
    private ArrayList x;
    private LayoutInflater y;
    private int z;

    public PhotoActivity()
    {
        b = null;
        d = new ArrayList();
        e = new ArrayList();
        x = new ArrayList();
        z = 1;
        A = "";
        B = false;
        C = false;
        D = 1;
        E = false;
        F = false;
        S = true;
        W = null;
        X = null;
        Y = null;
        Z = -1;
        af = false;
    }

    static View a(PhotoActivity photoactivity)
    {
        return photoactivity.T;
    }

    static com.gtp.go.weather.sharephoto.b.k a(PhotoActivity photoactivity, com.gtp.go.weather.sharephoto.b.k k1)
    {
        photoactivity.Y = k1;
        return k1;
    }

    private void a(long l1)
    {
        if (P.getVisibility() == 0)
        {
            P.clearAnimation();
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setStartOffset(l1);
            alphaanimation.setDuration(300L);
            alphaanimation.setAnimationListener(new p(this));
            P.startAnimation(alphaanimation);
        }
    }

    private void a(long l1, int i1)
    {
        Intent intent = new Intent(this, com/gtp/go/weather/sharephoto/PhotoDetailActivity);
        intent.putExtra("extra_photo_id", l1);
        intent.putExtra("extra_photo_isuploaded", true);
        intent.putExtra("extra_enter_type", i1);
        startActivity(intent);
    }

    private void a(g g1)
    {
        com.gtp.a.a.b.c.a("new_download", "==========\u300B\u5F00\u59CB\u91CD\u65B0\u4E0B\u8F7D\u56FE\u7247");
        g1 = new com.jiubang.core.c.a.a(g1.x(), com.gtp.go.weather.sharephoto.photo.ad.a, (new StringBuilder()).append(com.jiubang.core.c.a.b.a(g1.x())).append(".png").toString());
        ad.a(g1);
    }

    private void a(g g1, Bitmap bitmap)
    {
        if (g1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        View view;
        View view1;
        String s1;
        String s2;
        com.gtp.a.a.b.c.a("photo_list", (new StringBuilder()).append("updateListViewItem = ").append(g1.a()).append(" | ").append(g1.m()).toString());
        s1 = c(g1);
        view = b.findViewWithTag(s1);
        if (view == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s2 = d(g1);
        view1 = b.findViewWithTag(s2);
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        com.gtp.a.a.b.c.a("new_download", "bitmap != null");
        g1 = new BitmapDrawable(bitmap);
        if (g1 != null)
        {
            view.setBackgroundDrawable(g1);
            view.setVisibility(0);
            if (view1 != null)
            {
                view1.setVisibility(4);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        com.gtp.a.a.b.c.a("new_download", "bitmap == null");
        g1 = g1.y();
        if (TextUtils.isEmpty(g1))
        {
            continue; /* Loop/switch isn't completed */
        }
        g1 = g.a(getApplicationContext(), g1, s1, s2, new com.gtp.go.weather.sharephoto.photo.o(this));
        if (g1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        view.setBackgroundDrawable(g1);
        view.setVisibility(0);
        if (view1 != null)
        {
            view1.setVisibility(4);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        view.setBackgroundResource(0x7f0205c6);
        view.setVisibility(4);
        if (view1 != null)
        {
            view1.setVisibility(0);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static void a(PhotoActivity photoactivity, long l1, int i1)
    {
        photoactivity.a(l1, i1);
    }

    static void a(PhotoActivity photoactivity, g g1)
    {
        photoactivity.a(g1);
    }

    static void a(PhotoActivity photoactivity, boolean flag)
    {
        photoactivity.b(flag);
    }

    static com.gtp.go.weather.sharephoto.b.k b(PhotoActivity photoactivity)
    {
        return photoactivity.Y;
    }

    private void b(long l1)
    {
        if (Q.getVisibility() == 0)
        {
            Q.clearAnimation();
            AnimationSet animationset = new AnimationSet(true);
            animationset.setStartOffset(l1);
            animationset.addAnimation(new AlphaAnimation(1.0F, 0.0F));
            animationset.addAnimation(new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -1F));
            animationset.setAnimationListener(new com.gtp.go.weather.sharephoto.photo.q(this));
            animationset.setDuration(300L);
            Q.startAnimation(animationset);
        }
    }

    private void b(g g1)
    {
        a(g1, ((Bitmap) (null)));
    }

    private void b(boolean flag)
    {
        if (!com.gau.go.launcherex.gowidget.statistics.w.h(getApplicationContext()))
        {
            W.a(flag);
        } else
        {
            String s1 = "";
            if (TextUtils.isEmpty(""))
            {
                s1 = com.gtp.go.weather.sharephoto.d.n.b(getApplicationContext());
            }
            if (!TextUtils.isEmpty(s1))
            {
                W.a(flag, s1);
                return;
            }
            if (flag)
            {
                Toast.makeText(getApplicationContext(), getString(0x7f080486), 0).show();
                return;
            }
        }
    }

    static k c(PhotoActivity photoactivity)
    {
        return photoactivity.I;
    }

    private String c(g g1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(g1.g()).append("*").append(String.valueOf(g1.a()));
        return stringbuffer.toString();
    }

    private void c(boolean flag)
    {
        K.setVisibility(0);
        if (flag)
        {
            L.setVisibility(0);
            M.setVisibility(8);
            return;
        } else
        {
            L.setVisibility(8);
            M.setVisibility(0);
            return;
        }
    }

    static TextView d(PhotoActivity photoactivity)
    {
        return photoactivity.U;
    }

    private String d(g g1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(String.valueOf(g1.a())).append("*").append(g1.g());
        return stringbuffer.toString();
    }

    private void d(boolean flag)
    {
        if (flag)
        {
            s.setVisibility(8);
            q.setVisibility(0);
            switch (z)
            {
            default:
                return;

            case 1: // '\001'
                r.setText(getString(0x7f080480));
                o.setVisibility(8);
                return;

            case 2: // '\002'
                r.setText(getString(0x7f08047f));
                break;
            }
            o.setVisibility(0);
            return;
        } else
        {
            s.setVisibility(0);
            q.setVisibility(8);
            return;
        }
    }

    static aa e(PhotoActivity photoactivity)
    {
        return photoactivity.G;
    }

    private void e(boolean flag)
    {
        if (flag)
        {
            j();
            b.setVisibility(4);
            J.setVisibility(0);
            return;
        } else
        {
            b.setVisibility(0);
            J.setVisibility(8);
            return;
        }
    }

    static ArrayList f(PhotoActivity photoactivity)
    {
        return photoactivity.x;
    }

    static LayoutInflater g(PhotoActivity photoactivity)
    {
        return photoactivity.y;
    }

    static MultiColumnListView h(PhotoActivity photoactivity)
    {
        return photoactivity.b;
    }

    private void h()
    {
        Object obj = new Dialog(this, 0x7f070011);
        View view = LayoutInflater.from(this).inflate(0x7f0300e4, null);
        ((TextView)view.findViewById(0x7f09049e)).setOnClickListener(new com.gtp.go.weather.sharephoto.photo.r(this));
        ((Dialog) (obj)).setContentView(view, new android.view.ViewGroup.LayoutParams(-1, -2));
        ((Dialog) (obj)).show();
        obj = (new com.gau.go.launcherex.goweather.goplay.a.g("f000", "", "", "", "", "", "")).b();
        com.gau.go.a.e.a(GoWidgetApplication.b()).a(((String) (obj)));
    }

    static int i(PhotoActivity photoactivity)
    {
        return photoactivity.z;
    }

    private void i()
    {
        if (com.gau.go.launcherex.gowidget.statistics.w.a() || com.gau.go.launcherex.gowidget.statistics.w.h(getApplicationContext()))
        {
            if (X == null)
            {
                X = new com.gau.go.launcherex.gowidget.weather.globalview.b(this);
                X.b(0x7f080482);
                X.c(0x7f080483);
                X.d(0x7f0803b6);
                X.a(new s(this));
            }
            X.a();
            return;
        } else
        {
            Toast.makeText(getApplicationContext(), getString(0x7f080488), 0).show();
            return;
        }
    }

    private void j()
    {
        s.setVisibility(8);
        q.setVisibility(8);
    }

    static boolean j(PhotoActivity photoactivity)
    {
        return photoactivity.af;
    }

    private void k()
    {
        c(0x7f040004);
    }

    static boolean k(PhotoActivity photoactivity)
    {
        return photoactivity.m();
    }

    static com.gtp.go.weather.sharephoto.c.d l(PhotoActivity photoactivity)
    {
        return photoactivity.i;
    }

    private void l()
    {
        P.clearAnimation();
        P.setVisibility(0);
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(300L);
        P.startAnimation(alphaanimation);
    }

    static ViewGroup m(PhotoActivity photoactivity)
    {
        return photoactivity.j;
    }

    private boolean m()
    {
        f f1 = com.gau.go.launcherex.gowidget.weather.c.c.a(this).e();
        boolean flag;
        if (f1.a(2) || f1.a(1) || f1.a(32) || f1.a(128))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !com.jiubang.playsdk.f.a.c(this, "com.jb.zcamera"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    static void n(PhotoActivity photoactivity)
    {
        photoactivity.i();
    }

    static ArrayList o(PhotoActivity photoactivity)
    {
        return photoactivity.e;
    }

    static com.gtp.go.weather.sharephoto.photo.aa p(PhotoActivity photoactivity)
    {
        return photoactivity.w;
    }

    static View q(PhotoActivity photoactivity)
    {
        return photoactivity.P;
    }

    static TextView r(PhotoActivity photoactivity)
    {
        return photoactivity.Q;
    }

    public View a(LayoutInflater layoutinflater, g g1)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ec, null);
        com.gtp.a.a.b.c.a("photo_list", "newView");
        return layoutinflater;
    }

    public volatile View a(LayoutInflater layoutinflater, Object obj)
    {
        return a(layoutinflater, (g)obj);
    }

    public void a()
    {
        com.gtp.a.a.b.c.a("pull_photo", "1-> onStartPull");
        O.setVisibility(0);
        O.a(0.0F);
        Q.setText(getString(0x7f0802e5));
        Q.setVisibility(0);
        Q.scrollTo(0, Q.getHeight());
        l();
    }

    public void a(float f1)
    {
        com.gtp.a.a.b.c.a("pull_photo", (new StringBuilder()).append("2-> onReleasePull.pullPercentage = ").append(f1).toString());
        O.a();
        if (!N.b())
        {
            b(0L);
            a(0L);
        }
    }

    public void a(int i1, String s1, int j1, ArrayList arraylist)
    {
        if (i1 != z || !A.equals(s1)) goto _L2; else goto _L1
_L1:
        if (arraylist == null || arraylist.isEmpty()) goto _L4; else goto _L3
_L3:
        e.remove(ae);
        s1 = new ArrayList();
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            g g2 = (g)iterator.next();
            if (g2.g() == 2)
            {
                s1.add(g2);
            }
        } while (true);
        g g1;
        for (s1 = s1.iterator(); s1.hasNext(); e.remove(g1))
        {
            g1 = (g)s1.next();
        }

        s1 = arraylist.iterator();
_L8:
        if (!s1.hasNext()) goto _L6; else goto _L5
_L5:
        arraylist = (g)s1.next();
        if (arraylist == null) goto _L8; else goto _L7
_L7:
        Iterator iterator1 = e.iterator();
_L12:
        if (!iterator1.hasNext()) goto _L10; else goto _L9
_L9:
        g g3 = (g)iterator1.next();
        if (g3.a() != arraylist.a()) goto _L12; else goto _L11
_L11:
        if (g3.c() != arraylist.c() || g3.d() != arraylist.d())
        {
            g3.a(arraylist.c());
            g3.b(arraylist.d());
            i1 = 1;
        } else
        {
            i1 = 1;
        }
_L14:
        if (i1 == 0)
        {
            e.add(arraylist);
        }
          goto _L8
_L6:
        for (s1 = d.iterator(); s1.hasNext(); e.add(arraylist))
        {
            arraylist = (g)s1.next();
        }

        com.gtp.go.weather.sharephoto.d.n.a(e);
        if (z == 1 && af)
        {
            e.add(0, ae);
        }
        a.notifyDataSetChanged();
_L13:
        K.setVisibility(4);
_L2:
        C = false;
        if (E)
        {
            (new Handler()).post(new v(this));
            E = false;
        }
        return;
_L4:
        if (arraylist == null)
        {
            Toast.makeText(getApplicationContext(), getString(0x7f0801d0), 0).show();
        }
        if (true) goto _L13; else goto _L10
_L10:
        i1 = 0;
          goto _L14
    }

    public void a(int i1, String s1, int j1, ArrayList arraylist, boolean flag)
    {
        e(false);
        Z = -1;
        if (i1 != z || !A.equals(s1)) goto _L2; else goto _L1
_L1:
        i1 = 0;
        if (flag)
        {
            d.clear();
            e.clear();
            i1 = 1;
        }
        if (arraylist == null) goto _L4; else goto _L3
_L3:
        if (!arraylist.isEmpty()) goto _L6; else goto _L5
_L5:
        d.clear();
        e.clear();
        d(true);
        i1 = 1;
_L8:
        if (i1 != 0)
        {
            a.notifyDataSetChanged();
        }
_L2:
        if (F)
        {
            N.c();
            F = false;
        }
        return;
_L6:
        j();
        D = j1;
        if (!e.isEmpty())
        {
            e.remove(ae);
            s1 = new ArrayList();
            Iterator iterator = e.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                g g2 = (g)iterator.next();
                if (g2.g() == 2)
                {
                    s1.add(g2);
                }
            } while (true);
            g g1;
            for (s1 = s1.iterator(); s1.hasNext(); e.remove(g1))
            {
                g1 = (g)s1.next();
            }

        }
        d.clear();
        s1 = arraylist.iterator();
        do
        {
            if (!s1.hasNext())
            {
                break;
            }
            arraylist = (g)s1.next();
            if (arraylist == null)
            {
                continue;
            }
            switch (arraylist.g())
            {
            default:
                break;

            case 1: // '\001'
                j1 = 0;
                Iterator iterator1 = e.iterator();
                do
                {
                    i1 = j1;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    g g3 = (g)iterator1.next();
                    if (g3.a() != arraylist.a())
                    {
                        continue;
                    }
                    i1 = 1;
                    if (g3.c() != arraylist.c() || g3.d() != arraylist.d())
                    {
                        g3.a(arraylist.c());
                        g3.b(arraylist.d());
                        i1 = 1;
                    }
                    break;
                } while (true);
                if (i1 == 0)
                {
                    e.add(0, arraylist);
                }
                break;

            case 2: // '\002'
                d.add(arraylist);
                break;
            }
        } while (true);
        for (s1 = d.iterator(); s1.hasNext(); e.add(arraylist))
        {
            arraylist = (g)s1.next();
        }

        com.gtp.go.weather.sharephoto.d.n.a(e);
        if (z == 1 && af)
        {
            e.add(0, ae);
        }
        j1 = 1;
        if (D > 1)
        {
            i1 = j1;
            if (ac != null)
            {
                ac.setVisibility(8);
                i1 = j1;
            }
        } else
        {
            i1 = j1;
            if (D == 1)
            {
                i1 = j1;
                if (!e.isEmpty())
                {
                    if (e.size() > 2)
                    {
                        c(false);
                        i1 = j1;
                        if (ac != null)
                        {
                            ac.setVisibility(8);
                            i1 = j1;
                        }
                    } else
                    {
                        K.setVisibility(4);
                        if (ab != null)
                        {
                            ac = ab.inflate();
                            ab = null;
                        }
                        ac.setVisibility(0);
                        i1 = j1;
                    }
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (e.isEmpty())
        {
            d(true);
        } else
        {
            Toast.makeText(getApplicationContext(), getString(0x7f0801d0), 0).show();
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(int i1, String s1, ArrayList arraylist)
    {
        if (i1 == z && A.equals(s1))
        {
            if (arraylist != null && (!arraylist.isEmpty() || !e.isEmpty()))
            {
                e.clear();
                s1 = arraylist.iterator();
                int j1;
                for (i1 = 1; s1.hasNext(); i1 = j1)
                {
                    g g1 = (g)s1.next();
                    j1 = i1;
                    if (g1 != null)
                    {
                        j1 = i1;
                        if (g1.f() > i1)
                        {
                            j1 = g1.f();
                        }
                    }
                    e.add(g1);
                }

                com.gtp.go.weather.sharephoto.d.n.a(e);
                if (z == 1 && af)
                {
                    e.add(0, ae);
                }
                D = i1;
                a.notifyDataSetChanged();
            }
            boolean flag = com.gtp.a.a.c.d.b(getApplicationContext());
            if (arraylist == null || arraylist.isEmpty())
            {
                S = true;
                if (!flag)
                {
                    d(false);
                    e(false);
                }
            } else
            {
                j();
                e(false);
            }
            if (flag && S)
            {
                F = true;
                N.a(true);
                O.setVisibility(0);
                O.a(true);
                c.a(0, z, A, e);
            } else
            if (F)
            {
                N.c();
                F = false;
                return;
            }
        }
    }

    public void a(View view, int i1, g g1)
    {
        View view1;
        ImageView imageview;
        TextView textview;
        TextView textview1;
        View view2;
        TextView textview2;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
label0:
        {
label1:
            {
label2:
                {
                    if (g1 != null)
                    {
                        obj3 = view.findViewById(0x7f0904ca);
                        view1 = view.findViewById(0x7f0904cd);
                        imageview = (ImageView)view.findViewById(0x7f0904cc);
                        obj = view.findViewById(0x7f0904cf);
                        obj1 = (TextView)view.findViewById(0x7f0904ce);
                        textview = (TextView)view.findViewById(0x7f0904d0);
                        textview1 = (TextView)view.findViewById(0x7f0904d1);
                        view2 = view.findViewById(0x7f0904d2);
                        textview2 = (TextView)view.findViewById(0x7f0904d3);
                        obj2 = view.findViewById(0x7f0904cb);
                        ((View) (obj3)).setOnClickListener(new com.gtp.go.weather.sharephoto.photo.w(this, g1));
                        view = g1.m();
                        textview2.setText(view);
                        obj3 = (android.widget.LinearLayout.LayoutParams)view1.getLayoutParams();
                        obj3.width = h;
                        int j1 = h;
                        int k1 = g1.B();
                        if (g1.A() != 0)
                        {
                            i1 = g1.A();
                        } else
                        {
                            i1 = 1;
                        }
                        obj3.height = (k1 * j1) / i1;
                        if (z != 1 || !af || g1.a() != -10000L)
                        {
                            break label0;
                        }
                        if (!m())
                        {
                            break label1;
                        }
                        ((View) (obj2)).setVisibility(8);
                        ((View) (obj2)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
                        ((View) (obj)).setVisibility(8);
                        ((TextView) (obj1)).setVisibility(8);
                        view1.setVisibility(4);
                        imageview.setVisibility(0);
                        textview2.setTextColor(e().getColor(0x7f0a0030));
                        textview2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        imageview.setImageResource(0x7f0203f0);
                        view2.setVisibility(8);
                        if (TextUtils.isEmpty(view))
                        {
                            break label2;
                        }
                        textview2.setVisibility(0);
                    }
                    return;
                }
                textview2.setVisibility(8);
                return;
            }
            ((View) (obj2)).setVisibility(0);
            ((View) (obj2)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
            ((View) (obj)).setVisibility(8);
            ((TextView) (obj1)).setVisibility(8);
            view1.setBackgroundResource(0x7f0205c6);
            view1.setVisibility(4);
            imageview.setVisibility(0);
            textview2.setTextColor(e().getColor(0x7f0a0031));
            textview2.setCompoundDrawablesWithIntrinsicBounds(0x7f0203b5, 0, 0, 0);
            imageview.setImageResource(0x7f0203b4);
            view2.setVisibility(8);
            if (!TextUtils.isEmpty(view))
            {
                textview2.setVisibility(0);
                return;
            } else
            {
                textview2.setVisibility(8);
                return;
            }
        }
        ((View) (obj2)).setVisibility(8);
        ((View) (obj)).setVisibility(0);
        textview2.setTextColor(e().getColor(0x7f0a0030));
        textview2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        imageview.setImageResource(0x7f0203b8);
        ((TextView) (obj1)).setVisibility(0);
        ((TextView) (obj1)).setText(g1.l());
        view1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        obj = c(g1);
        view1.setTag(obj);
        obj1 = d(g1);
        imageview.setTag(obj1);
        obj2 = g1.y();
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj = g.a(getApplicationContext(), ((String) (obj2)), ((String) (obj)), ((String) (obj1)), new x(this, g1));
            if (obj != null)
            {
                view1.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
                view1.setVisibility(0);
                imageview.setVisibility(4);
            } else
            {
                view1.setBackgroundResource(0x7f0205c6);
                view1.setVisibility(4);
                imageview.setVisibility(0);
            }
        } else
        {
            view1.setBackgroundResource(0x7f0205c6);
            view1.setVisibility(4);
            imageview.setVisibility(0);
            a(g1);
        }
        textview.setText(String.valueOf(g1.d()));
        textview.setOnClickListener(new y(this, g1));
        textview1.setText(String.valueOf(g1.c()));
        textview1.setOnClickListener(new com.gtp.go.weather.sharephoto.photo.n(this, g1));
        if (g1.h())
        {
            textview1.setCompoundDrawablesWithIntrinsicBounds(0x7f0203c8, 0, 0, 0);
        } else
        {
            textview1.setCompoundDrawablesWithIntrinsicBounds(0x7f0203c7, 0, 0, 0);
        }
        if (!TextUtils.isEmpty(view))
        {
            textview2.setVisibility(0);
            view2.setVisibility(0);
            return;
        } else
        {
            textview2.setVisibility(8);
            view2.setVisibility(8);
            return;
        }
    }

    public volatile void a(View view, int i1, Object obj)
    {
        a(view, i1, (g)obj);
    }

    public void a(com.jiubang.core.c.a.a a1)
    {
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            Toast.makeText(getApplicationContext(), getString(0x7f080485), 0).show();
            return;
        } else
        {
            Toast.makeText(getApplicationContext(), getString(0x7f080486), 0).show();
            return;
        }
    }

    public void b()
    {
        com.gtp.a.a.b.c.a("pull_photo", "4-> onRefresh");
        O.a(true);
        Q.scrollTo(0, 0);
        b(1800L);
        a(1800L);
        Q.setText(0x7f08047c);
        if (com.gau.go.launcherex.gowidget.c.g.a(getApplicationContext()))
        {
            F = true;
            B = false;
            c.a(0, z, A, e);
            return;
        } else
        {
            N.c();
            Toast.makeText(getApplicationContext(), getString(0x7f0801d0), 0).show();
            return;
        }
    }

    public void b(float f1)
    {
        com.gtp.a.a.b.c.a("pull_photo", (new StringBuilder()).append("3-> onPulling.pullPercentag = ").append(f1).toString());
        O.a(f1);
        float f2 = 2.0F * f1 + (1.0F - f1) * f1 + 0.6F;
        f1 = f2;
        if (f2 > 1.0F)
        {
            f1 = 1.0F;
        }
        Q.scrollTo(0, (int)((1.0F - f1) * (float)Q.getHeight()));
    }

    public void b(com.jiubang.core.c.a.a a1)
    {
    }

    public void c(com.jiubang.core.c.a.a a1)
    {
        String s1;
        if (a1 != null)
        {
            s1 = a1.a;
        } else
        {
            s1 = null;
        }
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        g g1;
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            g1 = (g)iterator.next();
        } while (g1 == null || !g1.x().equals(s1));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        g1.m(a1.a());
        if (a1.d != null)
        {
            g.a().put(a1.a(), new SoftReference(new BitmapDrawable((Bitmap)a1.d)));
        }
        b(g1);
        return;
    }

    public void d(com.jiubang.core.c.a.a a1)
    {
    }

    protected void f()
    {
        setContentView(0x7f0300e2);
        b = (MultiColumnListView)findViewById(0x7f090488);
        b.setClickable(false);
        b.setFocusable(false);
        g = new com.gtp.go.weather.sharephoto.photo.b();
        i = com.gtp.go.weather.sharephoto.c.d.a(getApplicationContext());
        a = new com.jiubang.pla.a.b(getLayoutInflater(), this);
        K = getLayoutInflater().inflate(0x7f0300e3, null);
        L = K.findViewById(0x7f09049c);
        L.setVisibility(4);
        M = K.findViewById(0x7f09049d);
        M.setVisibility(4);
        b.e(K);
        a.a(e);
        b.a(a);
        b.a(this);
        ab = (ViewStub)findViewById(0x7f090489);
        j = (ViewGroup)findViewById(0x7f090487);
        k = (ImageView)findViewById(0x7f09048e);
        k.setOnClickListener(this);
        l = (TextView)findViewById(0x7f09048f);
        l.setOnClickListener(this);
        m = findViewById(0x7f090490);
        m.setOnClickListener(this);
        n = (ImageView)findViewById(0x7f090491);
        n.setOnClickListener(this);
        o = (Button)findViewById(0x7f09048c);
        o.setOnClickListener(this);
        p = (ImageView)findViewById(0x7f090493);
        p.setOnClickListener(this);
        t = (ImageView)findViewById(0x7f090494);
        q = findViewById(0x7f09006e);
        r = (TextView)findViewById(0x7f09048b);
        s = findViewById(0x7f09048d);
        J = findViewById(0x7f090253);
        O = (LineRefreshView)findViewById(0x7f09049b);
        P = findViewById(0x7f090496);
        Q = (TextView)findViewById(0x7f090497);
        O.a(0.0F);
        Q.setVisibility(4);
        R = (PhotoTouchRefresh)findViewById(0x7f090486);
        N = new an(R);
        N.a(this);
        T = findViewById(0x7f090498);
        T.setVisibility(8);
        U = (TextView)findViewById(0x7f090499);
        V = findViewById(0x7f09049a);
        V.setOnClickListener(this);
        getWindow().setFormat(-3);
        Object obj = e().getDisplayMetrics();
        h = Math.min(((DisplayMetrics) (obj)).widthPixels, ((DisplayMetrics) (obj)).heightPixels) / 2 - (int)(((DisplayMetrics) (obj)).density * 2.0F);
        obj = com.gau.go.launcherex.gowidget.weather.util.f.a(getApplicationContext()).d();
        Object obj1 = new ab(this, null);
        obj1.a = e().getString(0x7f08047e);
        x.add(obj1);
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (WeatherBean)((Iterator) (obj)).next();
            if (obj1 != null)
            {
                ab ab1 = new ab(this, null);
                ab1.a = ((WeatherBean) (obj1)).d();
                ab1.b = ((WeatherBean) (obj1)).c();
                x.add(ab1);
            }
        } while (true);
        y = LayoutInflater.from(getApplicationContext());
        w = new com.gtp.go.weather.sharephoto.photo.aa(this, null);
        v = new ListView(getApplicationContext());
        v.setCacheColorHint(0);
        v.setBackgroundResource(0x7f0202b8);
        v.setDivider(e().getDrawable(0x7f0202b9));
        v.setOnItemClickListener(this);
        v.setAlwaysDrawnWithCacheEnabled(true);
        v.setScrollBarStyle(0x2000000);
        v.setAdapter(w);
        u = new Dialog(this, 0x7f07001c);
        u.setContentView(v);
        u.setCanceledOnTouchOutside(true);
        obj = u.getWindow();
        ((Window) (obj)).setGravity(51);
        obj1 = ((Window) (obj)).getAttributes();
        obj1.x = 0;
        obj1.y = (int)(e().getDimension(0x7f0c011f) - e().getDisplayMetrics().density * 2.0F);
        obj1.width = (int)e().getDimension(0x7f0c0170);
        obj1.height = -2;
        ((Window) (obj)).setAttributes(((android.view.WindowManager.LayoutParams) (obj1)));
        ((Window) (obj)).setWindowAnimations(0x7f070013);
        f = new z(this, null);
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_FAVOUR_OR_BACKCOUNT");
        ((IntentFilter) (obj)).addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DELETE_USER_PHOTO");
        ((IntentFilter) (obj)).addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        registerReceiver(f, ((IntentFilter) (obj)));
        W = com.gtp.go.weather.sharephoto.a.g.a(getApplicationContext()).c();
        W.a(this);
        ad = new b(getApplicationContext());
        ad.a(this);
        c = new ad(getApplicationContext());
        c.a(this);
        c.a(ad);
        c.a(z, A);
        e(true);
        G = new aa(this);
        com.gtp.go.weather.sharephoto.takephoto.m.a(getApplicationContext());
        com.gtp.go.weather.sharephoto.takephoto.m.a();
        if (!com.gtp.go.weather.sharephoto.d.n.a(getApplicationContext()))
        {
            b(false);
        }
        I = new k(getApplicationContext());
        H = new r(this, I);
        I.a(ag);
        I.b(true);
        I.a(true);
        aa = new i(this, t);
        aa.b();
        if (!com.gau.go.launcherex.gowidget.statistics.w.a())
        {
            Toast.makeText(getApplicationContext(), getString(0x7f080488), 0).show();
        }
        af = com.gtp.go.weather.sharephoto.d.n.c(getApplicationContext());
        ae = new g();
        ae.a(-10000L);
        ae.j(300);
        ae.k(250);
        if (m())
        {
            ae.e(getString(0x7f08027a));
            return;
        } else
        {
            ae.e(getString(0x7f080279));
            return;
        }
    }

    public void g()
    {
        boolean flag1;
        flag1 = true;
        c(true);
        E = true;
        if (B) goto _L2; else goto _L1
_L1:
        if (C) goto _L4; else goto _L3
_L3:
        C = true;
        if (Z == -1)
        {
            Z = D;
        }
        if (Z <= 1) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L20:
        Z = Z - 1;
        if (Z <= 0) goto _L8; else goto _L7
_L7:
        Iterator iterator = e.iterator();
_L12:
        if (!iterator.hasNext()) goto _L10; else goto _L9
_L9:
        if (((g)iterator.next()).f() != Z) goto _L12; else goto _L11
_L11:
        flag = true;
_L8:
        if (flag && Z > 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Z <= 0) goto _L14; else goto _L13
_L13:
        if (com.gau.go.launcherex.gowidget.c.g.a(getApplicationContext()))
        {
            c.a(Z, z, A, e);
            flag = false;
        } else
        {
            Toast.makeText(getApplicationContext(), getString(0x7f0801d0), 0).show();
            flag = flag1;
        }
_L15:
        com.gtp.a.a.b.c.a("PhotoActivity", (new StringBuilder()).append("\u8BF7\u6C42\u9875\u6570 mRequestPage = ").append(Z).toString());
_L17:
        if (B || flag)
        {
            if (B && !e.isEmpty())
            {
                if (e.size() > 2)
                {
                    c(false);
                    if (ac != null)
                    {
                        ac.setVisibility(8);
                    }
                } else
                {
                    K.setVisibility(4);
                    if (ab != null)
                    {
                        ac = ab.inflate();
                        ab = null;
                    }
                    ac.setVisibility(0);
                }
            } else
            {
                K.setVisibility(4);
            }
            C = false;
            com.gtp.a.a.b.c.a("PhotoActivity", (new StringBuilder()).append("\u56FE\u7247\u7C7B\u578B\u4E3A").append(z).append("\u7684\u6570\u636E\u5DF2\u52A0\u8F7D\u5B8C\u5168: ").append(B).toString());
            (new Handler()).post(new u(this));
            E = false;
        }
        return;
_L14:
        B = true;
_L16:
        flag = false;
          goto _L15
_L6:
        B = true;
          goto _L16
_L4:
        com.gtp.a.a.b.c.a("PhotoActivity", "\u6B63\u5728\u83B7\u53D6\u4E0B\u4E00\u9875\u6570\u636E");
_L2:
        flag = false;
          goto _L17
_L10:
        flag = false;
        if (true) goto _L8; else goto _L18
_L18:
        if (true) goto _L20; else goto _L19
_L19:
    }

    public void i_()
    {
        com.gtp.a.a.b.c.a("pull_photo", "5-> onStopRefresh");
        O.a(false);
        O.setVisibility(4);
        b(0L);
        a(0L);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        G.a(i1, j1, intent);
    }

    public void onClick(View view)
    {
        boolean flag = false;
        if (view.equals(k))
        {
            k();
        } else
        {
            if (view.equals(l) || view.equals(m))
            {
                if (u.isShowing())
                {
                    u.dismiss();
                    return;
                } else
                {
                    u.show();
                    return;
                }
            }
            if (view.equals(n) || view.equals(o))
            {
                view = GoWidgetApplication.c(GoWidgetApplication.b()).a();
                if (view.getInt("PROMOTE_ZCAMERA_TIMES", 0) == 0)
                {
                    flag = true;
                }
                if (m() && flag)
                {
                    view.edit().putInt("PROMOTE_ZCAMERA_TIMES", 1).commit();
                    h();
                    return;
                }
                if (com.gtp.go.weather.sharephoto.d.n.a(getApplicationContext()))
                {
                    if (T.getVisibility() == 0)
                    {
                        T.setVisibility(8);
                    }
                    G.a();
                    com.gau.go.launcherex.gowidget.statistics.q.a(getApplicationContext()).a(new com.gau.go.launcherex.gowidget.statistics.a.a(117, "click_photo"));
                    return;
                } else
                {
                    i();
                    return;
                }
            }
            if (view.equals(p))
            {
                if (com.gtp.go.weather.sharephoto.d.n.a(getApplicationContext()))
                {
                    t.setVisibility(4);
                    startActivity(new Intent(this, com/gtp/go/weather/sharephoto/UserPhotosActivity));
                    com.gau.go.launcherex.gowidget.statistics.q.a(getApplicationContext()).a(new com.gau.go.launcherex.gowidget.statistics.a.a(117, "click_picture_head"));
                    return;
                } else
                {
                    i();
                    return;
                }
            }
            if (view.equals(V) && T.getVisibility() == 0)
            {
                T.setVisibility(8);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        f();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        e.clear();
        a.a();
        x.clear();
        unregisterReceiver(f);
        g.b();
        H.c();
        I.a();
        W.b();
        aa.a();
        ad.a(false);
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        u.dismiss();
        S = true;
        int j1;
        if (i1 == 0)
        {
            adapterview = "";
            j1 = 1;
        } else
        {
            j1 = 2;
            adapterview = ((ab)x.get(i1)).b;
        }
        if (j1 == z && adapterview.equals(A)) goto _L2; else goto _L1
_L1:
        z = j1;
        A = adapterview;
        a.a();
        a.notifyDataSetChanged();
        l.setText(((ab)x.get(i1)).a);
        B = false;
        C = false;
        K.setVisibility(4);
        e(true);
        c.a(z, A);
        if (ac != null)
        {
            ac.setVisibility(8);
        }
        Z = -1;
        j1;
        JVM INSTR tableswitch 1 2: default 172
    //                   1 244
    //                   2 269;
           goto _L3 _L4 _L5
_L3:
        if (E)
        {
            (new Handler()).post(new t(this));
            E = false;
        }
        if (F)
        {
            N.c();
            F = false;
        }
_L2:
        return;
_L4:
        com.gau.go.launcherex.gowidget.statistics.q.a(getApplicationContext()).a(new com.gau.go.launcherex.gowidget.statistics.a.a(117, "click_picture_well_chosen\240"));
        continue; /* Loop/switch isn't completed */
_L5:
        com.gau.go.launcherex.gowidget.statistics.q.a(getApplicationContext()).a(new com.gau.go.launcherex.gowidget.statistics.a.a(117, "click_picture_city"));
        if (true) goto _L3; else goto _L6
_L6:
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            k();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onResume()
    {
        super.onResume();
        H.b();
    }

    protected void onStart()
    {
        super.onStart();
        EasyTracker.getInstance().activityStart(this);
    }

    protected void onStop()
    {
        super.onStop();
        EasyTracker.getInstance().activityStop(this);
        H.a();
    }
}
