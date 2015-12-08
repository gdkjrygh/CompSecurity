// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.b;
import com.gau.go.launcherex.gowidget.weather.globalview.i;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.model.v;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.view.VerticalStretchLayout;
import com.go.weatherex.framework.fragment.a;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.go.weatherex.setting:
//            bu, bv, bw, br, 
//            bp, bq, bs, bt, 
//            by, bx

public class bo extends a
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static final String al[] = {
        "notification_style_default_black", "notification_style_default_white"
    };
    private CheckBox A;
    private View B;
    private View C;
    private CheckBox D;
    private VerticalStretchLayout E;
    private View F;
    private TextView G;
    private TextView H;
    private TextView I;
    private View J;
    private TextView K;
    private TextView L;
    private TextView M;
    private View N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private View R;
    private View S;
    private CheckBox T;
    private VerticalStretchLayout U;
    private View V;
    private TextView W;
    private TextView X;
    private TextView Y;
    private View Z;
    public int a;
    private TextView aa;
    private TextView ab;
    private TextView ac;
    private View ad;
    private TextView ae;
    private TextView af;
    private TextView ag;
    private int ah[];
    private String ai[];
    private int aj;
    private String ak[];
    private boolean am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private BroadcastReceiver as;
    private t at;
    private i au;
    private BroadcastReceiver av;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public int i;
    public int j;
    public String k;
    private e l;
    private f m;
    private TextView n;
    private View o;
    private View p;
    private CheckBox q;
    private VerticalStretchLayout r;
    private TextView s;
    private TextView t;
    private View u;
    private CheckBox v;
    private View w;
    private CheckBox x;
    private View y;
    private View z;

    public bo()
    {
        am = true;
    }

    private int a(int i1)
    {
        if (i1 < 5 || i1 > 14)
        {
            return 4;
        } else
        {
            return i1 - 5;
        }
    }

    static int a(bo bo1, int i1)
    {
        return bo1.d(i1);
    }

    static int a(bo bo1, String s1)
    {
        return bo1.a(s1);
    }

    private int a(String s1)
    {
        while (s1.equals("notification_style_default") || s1.equals("notification_style_default_black") || !s1.equals("notification_style_default_white")) 
        {
            return 0;
        }
        return 1;
    }

    static BroadcastReceiver a(bo bo1, BroadcastReceiver broadcastreceiver)
    {
        bo1.av = broadcastreceiver;
        return broadcastreceiver;
    }

    static e a(bo bo1)
    {
        return bo1.l;
    }

    private void a(int i1, int j1, v av1[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = av1.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = av1[k1].b;
            a1.c = av1[k1];
            boolean flag1;
            if (j1 == k1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            k1++;
        }
        av1 = u();
        av1.a(i1);
        av1.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        av1.b(i1);
        av1.a(new bu(this));
        av1.a();
    }

    private void a(int i1, int j1, CharSequence acharsequence[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = acharsequence.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = acharsequence[k1].toString();
            a1.c = Integer.valueOf(k1);
            boolean flag1;
            if (j1 == k1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            k1++;
        }
        t t1 = u();
        t1.a(i1);
        t1.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        t1.b(i1);
        t1.a(new bv(this, acharsequence));
        t1.a();
    }

    private void a(int i1, int j1, CharSequence acharsequence[], int ai1[])
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        int l1 = ai1.length;
        int k1 = 0;
        while (k1 < l1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = acharsequence[k1].toString();
            a1.c = Integer.valueOf(k1);
            boolean flag1;
            if (j1 == k1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            k1++;
        }
        t t1 = u();
        t1.a(i1);
        t1.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (l1 > 4)
        {
            i1 = 4;
        }
        t1.b(i1);
        t1.a(new bw(this, ai1, acharsequence));
        t1.a();
    }

    private void a(ArrayList arraylist)
    {
        byte byte0 = 4;
        i i1 = n();
        i1.a(0x7f080408);
        i1.a(arraylist);
        if (arraylist.size() <= 4)
        {
            byte0 = 0;
        }
        i1.b(byte0);
        i1.a(new br(this));
        i1.a();
    }

    private void a(boolean flag)
    {
        V.setClickable(flag);
        Z.setClickable(flag);
        if (flag)
        {
            X.setTextColor(an);
            W.setTextColor(an);
            Y.setTextColor(ao);
            X.setCompoundDrawablesWithIntrinsicBounds(0, 0, aq, 0);
            aa.setTextColor(an);
            ab.setTextColor(an);
            ac.setTextColor(ao);
            aa.setCompoundDrawablesWithIntrinsicBounds(0, 0, aq, 0);
            ae.setTextColor(an);
            af.setTextColor(an);
            ag.setTextColor(ao);
            ae.setCompoundDrawablesWithIntrinsicBounds(0, 0, aq, 0);
            s();
            return;
        } else
        {
            X.setTextColor(ap);
            W.setTextColor(ap);
            Y.setTextColor(ap);
            X.setCompoundDrawablesWithIntrinsicBounds(0, 0, ar, 0);
            aa.setTextColor(ap);
            ab.setTextColor(ap);
            ac.setTextColor(ap);
            aa.setCompoundDrawablesWithIntrinsicBounds(0, 0, ar, 0);
            ae.setTextColor(ap);
            af.setTextColor(ap);
            ag.setTextColor(ap);
            ae.setCompoundDrawablesWithIntrinsicBounds(0, 0, ar, 0);
            return;
        }
    }

    private int b(int i1)
    {
        i1 = com.gau.go.launcherex.gowidget.weather.util.q.a(i1);
        if (i1 < 3 || i1 > 8)
        {
            return 2;
        } else
        {
            return i1 - 3;
        }
    }

    static int b(bo bo1, int i1)
    {
        return bo1.e(i1);
    }

    static TextView b(bo bo1)
    {
        return bo1.G;
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            s.setTextColor(an);
            t.setTextColor(ao);
            return;
        } else
        {
            s.setTextColor(ap);
            t.setTextColor(ap);
            return;
        }
    }

    static int c(bo bo1, int i1)
    {
        bo1.aj = i1;
        return i1;
    }

    static TextView c(bo bo1)
    {
        return bo1.K;
    }

    private void c(boolean flag)
    {
        F.setClickable(flag);
        J.setClickable(flag);
        N.setClickable(flag);
        if (flag)
        {
            G.setTextColor(an);
            H.setTextColor(an);
            I.setTextColor(ao);
            G.setCompoundDrawablesWithIntrinsicBounds(0, 0, aq, 0);
            K.setTextColor(an);
            L.setTextColor(an);
            M.setTextColor(ao);
            K.setCompoundDrawablesWithIntrinsicBounds(0, 0, aq, 0);
            P.setTextColor(an);
            O.setTextColor(an);
            Q.setTextColor(ao);
            P.setCompoundDrawablesWithIntrinsicBounds(0, 0, aq, 0);
            return;
        } else
        {
            G.setTextColor(ap);
            H.setTextColor(ap);
            I.setTextColor(ap);
            G.setCompoundDrawablesWithIntrinsicBounds(0, 0, ar, 0);
            K.setTextColor(ap);
            L.setTextColor(ap);
            M.setTextColor(ap);
            K.setCompoundDrawablesWithIntrinsicBounds(0, 0, ar, 0);
            P.setTextColor(ap);
            O.setTextColor(ap);
            Q.setTextColor(ap);
            P.setCompoundDrawablesWithIntrinsicBounds(0, 0, ar, 0);
            return;
        }
    }

    static String[] c()
    {
        return al;
    }

    private int d(int i1)
    {
        if (i1 < 0 || i1 > 10)
        {
            return 9;
        } else
        {
            return i1 + 5;
        }
    }

    static f d(bo bo1)
    {
        return bo1.m;
    }

    private void d()
    {
        boolean flag1 = true;
        u u1 = l.a();
        a = u1.D;
        Object obj;
        int i1;
        boolean flag;
        if (v != null)
        {
            obj = v;
            String as1[];
            int j1;
            if (a == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((CheckBox) (obj)).setChecked(flag);
        }
        b = u1.s;
        if (b == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b(flag);
        k = u1.F;
        if (k == null)
        {
            k = "";
        }
        if (x != null)
        {
            obj = x;
            if (b == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((CheckBox) (obj)).setChecked(flag);
        }
        c = u1.t;
        if (q != null)
        {
            obj = q;
            if (c == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((CheckBox) (obj)).setChecked(flag);
            if (!q.isChecked());
        }
        d = u1.u;
        if (d == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (D != null)
        {
            D.setChecked(flag);
        }
        c(flag);
        if (flag)
        {
            E.b();
        } else
        {
            E.a();
        }
        e = u1.v;
        f = u1.w;
        if (u1.g == 2)
        {
            as1 = new String[10];
            as1[0] = "5\260F";
            as1[1] = "6\260F";
            as1[2] = "7\260F";
            as1[3] = "8\260F";
            as1[4] = "9\260F";
            as1[5] = "10\260F";
            as1[6] = "11\260F";
            as1[7] = "12\260F";
            as1[8] = "13\260F";
            as1[9] = "14\260F";
            G.setText(as1[a(e)]);
            K.setText(as1[a(f)]);
        } else
        {
            as1 = new String[6];
            as1[0] = "3\260C";
            as1[1] = "4\260C";
            as1[2] = "5\260C";
            as1[3] = "6\260C";
            as1[4] = "7\260C";
            as1[5] = "8\260C";
            G.setText(as1[b(e)]);
            K.setText(as1[b(f)]);
        }
        g = u1.m;
        i = u1.o;
        j = u1.p;
        h = u1.n;
        if (h == null)
        {
            h = "";
        }
        if (h.equals("") || m.a(h) == null)
        {
            as1 = m.d();
            if (as1.size() > 0)
            {
                as1 = (WeatherBean)as1.get(0);
                h = as1.c();
                i = as1.e();
                l.a(h, i);
            }
        }
        as1 = T;
        if (g == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        as1.setChecked(flag);
        if (g == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        if (T.isChecked())
        {
            U.b();
        } else
        {
            U.a();
        }
        as1 = (WeatherBean)m.c().get(h);
        if (as1 != null)
        {
            if (i == 2 || as1.e() != 1 && as1.q() == -1)
            {
                i = 2;
                X.setText(String.format(getText(0x7f0803a2).toString(), new Object[] {
                    as1.d()
                }));
            } else
            {
                X.setText(as1.d());
            }
        }
        j1 = ah.length;
        i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    if (j != ah[i1])
                    {
                        break label0;
                    }
                    aa.setText(ai[j]);
                }
                ak = (new String[] {
                    getString(0x7f080426), getString(0x7f080427)
                });
                aj = a(u1.C);
                ae.setText(ak[aj]);
                if (u1.z == 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                am = flag;
                A.setChecked(am);
                return;
            }
            i1++;
        } while (true);
    }

    private int e(int i1)
    {
        if (i1 < 0 || i1 > 6)
        {
            i1 = 5;
        } else
        {
            i1 += 3;
        }
        return com.gau.go.launcherex.gowidget.weather.util.q.b(i1);
    }

    static CheckBox e(bo bo1)
    {
        return bo1.q;
    }

    static TextView f(bo bo1)
    {
        return bo1.X;
    }

    static TextView g(bo bo1)
    {
        return bo1.ae;
    }

    static void h(bo bo1)
    {
        bo1.r();
    }

    static TextView i(bo bo1)
    {
        return bo1.aa;
    }

    private void j()
    {
        boolean flag = false;
        u u1 = l.a();
        String as1[];
        ArrayList arraylist;
        int i1;
        int j1;
        int k1;
        if (u1.g == 2)
        {
            i1 = a(u1.v);
            as1 = new String[10];
            as1[0] = "5\260F";
            as1[1] = "6\260F";
            as1[2] = "7\260F";
            as1[3] = "8\260F";
            as1[4] = "9\260F";
            as1[5] = "10\260F";
            as1[6] = "11\260F";
            as1[7] = "12\260F";
            as1[8] = "13\260F";
            as1[9] = "14\260F";
        } else
        {
            i1 = b(u1.v);
            as1 = new String[6];
            as1[0] = "3\260C";
            as1[1] = "4\260C";
            as1[2] = "5\260C";
            as1[3] = "6\260C";
            as1[4] = "7\260C";
            as1[5] = "8\260C";
        }
        arraylist = new ArrayList();
        k1 = as1.length;
        j1 = 0;
        while (j1 < k1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = as1[j1];
            a1.c = Integer.valueOf(j1);
            boolean flag1;
            if (i1 == j1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            j1++;
        }
        t t1 = u();
        t1.a(0x7f0803fd);
        t1.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (k1 > 4)
        {
            i1 = 4;
        }
        t1.b(i1);
        t1.a(new bp(this, u1, as1));
        t1.a();
    }

    static String[] j(bo bo1)
    {
        return bo1.ak;
    }

    static int k(bo bo1)
    {
        return bo1.aj;
    }

    private void k()
    {
        boolean flag = false;
        u u1 = l.a();
        String as1[];
        ArrayList arraylist;
        int i1;
        int j1;
        int k1;
        if (u1.g == 2)
        {
            i1 = a(u1.w);
            as1 = new String[10];
            as1[0] = "5\260F";
            as1[1] = "6\260F";
            as1[2] = "7\260F";
            as1[3] = "8\260F";
            as1[4] = "9\260F";
            as1[5] = "10\260F";
            as1[6] = "11\260F";
            as1[7] = "12\260F";
            as1[8] = "13\260F";
            as1[9] = "14\260F";
        } else
        {
            i1 = b(u1.w);
            as1 = new String[6];
            as1[0] = "3\260C";
            as1[1] = "4\260C";
            as1[2] = "5\260C";
            as1[3] = "6\260C";
            as1[4] = "7\260C";
            as1[5] = "8\260C";
        }
        arraylist = new ArrayList();
        k1 = as1.length;
        j1 = 0;
        while (j1 < k1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = as1[j1];
            a1.c = Integer.valueOf(j1);
            boolean flag1;
            if (i1 == j1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            j1++;
        }
        t t1 = u();
        t1.a(0x7f0803ff);
        t1.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (k1 > 4)
        {
            i1 = 4;
        }
        t1.b(i1);
        t1.a(new bq(this, u1, as1));
        t1.a();
    }

    private void l()
    {
        Object obj = k;
        ArrayList arraylist;
        Iterator iterator;
        WeatherBean weatherbean;
        com.gau.go.launcherex.gowidget.weather.globalview.a a1;
        int i1;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (((String) (obj)).contains("#"))
            {
                try
                {
                    obj = ((String) (obj)).split("#");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (com.gtp.a.a.b.c.a())
                    {
                        ((Exception) (obj)).printStackTrace();
                    }
                    obj = null;
                }
            } else
            {
                obj = (new String[] {
                    obj
                });
            }
        } else
        {
            obj = null;
        }
        arraylist = new ArrayList();
        iterator = m.d().iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        weatherbean = (WeatherBean)iterator.next();
        if (weatherbean == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
        a1.a = weatherbean.d();
        a1.c = weatherbean.c();
        a1.b = true;
        if (obj == null || obj.length <= 0) goto _L4; else goto _L3
_L3:
        i1 = 0;
_L8:
        if (i1 >= obj.length) goto _L4; else goto _L5
_L5:
        if (TextUtils.isEmpty(obj[i1]) || !weatherbean.c().equals(obj[i1])) goto _L7; else goto _L6
_L6:
        a1.b = false;
_L4:
        arraylist.add(a1);
        continue; /* Loop/switch isn't completed */
_L7:
        i1++;
        if (true) goto _L8; else goto _L2
_L2:
        a(arraylist);
        return;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_49;
_L9:
    }

    private void m()
    {
        Object obj = l.a().K;
        ArrayList arraylist;
        Iterator iterator;
        WeatherBean weatherbean;
        com.gau.go.launcherex.gowidget.weather.globalview.a a1;
        int i1;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (((String) (obj)).contains("#"))
            {
                try
                {
                    obj = ((String) (obj)).split("#");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (com.gtp.a.a.b.c.a())
                    {
                        ((Exception) (obj)).printStackTrace();
                    }
                    obj = null;
                }
            } else
            {
                obj = (new String[] {
                    obj
                });
            }
        } else
        {
            obj = null;
        }
        arraylist = new ArrayList();
        iterator = m.d().iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        weatherbean = (WeatherBean)iterator.next();
        a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
        a1.a = weatherbean.d();
        a1.c = weatherbean.c();
        a1.b = true;
        if (obj == null || obj.length <= 0) goto _L4; else goto _L3
_L3:
        i1 = 0;
_L8:
        if (i1 >= obj.length) goto _L4; else goto _L5
_L5:
        if (!weatherbean.c().equals(obj[i1])) goto _L7; else goto _L6
_L6:
        a1.b = false;
_L4:
        arraylist.add(a1);
        continue; /* Loop/switch isn't completed */
_L7:
        i1++;
        if (true) goto _L8; else goto _L2
_L2:
        obj = n();
        ((i) (obj)).a(0x7f08039e);
        ((i) (obj)).a(arraylist);
        ((i) (obj)).b(Math.min(4, arraylist.size()));
        ((i) (obj)).a(new bs(this));
        ((i) (obj)).a();
        return;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_55;
_L9:
    }

    private i n()
    {
        if (au == null)
        {
            au = new i(getActivity());
        }
        return au;
    }

    private void o()
    {
        String s1;
        ArrayList arraylist;
        int j1;
        int j2;
        s1 = h;
        j2 = i;
        arraylist = m.d();
        j1 = arraylist.size();
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L10:
        if (i1 >= arraylist.size()) goto _L4; else goto _L3
_L3:
        v av2[] = (WeatherBean)arraylist.get(i1);
        if (av2.e() != 3) goto _L6; else goto _L5
_L5:
        i1 = 0;
_L9:
        int k1;
        if (i1 < j1)
        {
            WeatherBean weatherbean = (WeatherBean)arraylist.get(i1);
            int l1;
            int k2;
            if (av2.q() < weatherbean.q())
            {
                WeatherBean weatherbean1 = new WeatherBean();
                weatherbean1.a(1);
                weatherbean1.c(av2.c());
                weatherbean1.e(av2.d());
                arraylist.add(i1, weatherbean1);
            } else
            {
label0:
                {
                    if (i1 != j1 - 1)
                    {
                        break label0;
                    }
                    weatherbean2 = new WeatherBean();
                    weatherbean2.a(1);
                    weatherbean2.c(av2.c());
                    weatherbean2.e(av2.d());
                    arraylist.add(weatherbean2);
                }
            }
        }
_L4:
        k2 = arraylist.size();
        av2 = new v[k2];
        j1 = -1;
        k1 = 0;
        i1 = 0;
_L8:
        if (i1 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        WeatherBean weatherbean2 = (WeatherBean)arraylist.get(i1);
        av2[i1] = new v();
        if (weatherbean2.e() != 1)
        {
            av2[i1].b = String.format(getText(0x7f0803a2).toString(), new Object[] {
                weatherbean2.d()
            });
            av2[i1].c = 2;
        } else
        {
            av2[i1].b = weatherbean2.d();
            av2[i1].c = 1;
        }
        av2[i1].a = weatherbean2.c();
        if (!weatherbean2.c().equals(s1) || k1 != 0)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        if (weatherbean2.e() != 1 && j2 == 2)
        {
            j1 = 1;
            k1 = i1;
        } else
        {
            if (weatherbean2.e() != 1)
            {
                break MISSING_BLOCK_LABEL_480;
            }
            j1 = 1;
            k1 = i1;
        }
_L11:
        i1++;
        l1 = k1;
        k1 = j1;
        j1 = l1;
        if (true) goto _L8; else goto _L7
        i1++;
          goto _L9
_L6:
        i1++;
          goto _L10
_L7:
        a(0x7f08039d, j1, av2);
        return;
_L2:
        v av1[] = new v[1];
        av1[0] = new v();
        av1[0].b = h;
        av1[0].a = h;
        av1[0].c = 1;
        a(0x7f08039d, 0, av1);
        return;
        int i2 = j1;
        j1 = k1;
        k1 = i2;
          goto _L11
    }

    private void p()
    {
        int j1 = ah.length;
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    if (j != ah[i1])
                    {
                        break label0;
                    }
                    a(0x7f0803a3, i1, ai, ah);
                }
                return;
            }
            i1++;
        } while (true);
    }

    private void q()
    {
        b b1 = new b(getActivity());
        b1.b(0x7f080535);
        b1.c(0x7f08040a);
        b1.a(new bt(this));
        b1.a();
    }

    private void r()
    {
        l.a(g, j, h, i, al[aj]);
        Log.i("wss", (new StringBuilder()).append("mNotifierDisplay = ").append(g).toString());
        Log.i("wss", (new StringBuilder()).append("mNotifierWeatehrType = ").append(j).toString());
        Log.i("wss", (new StringBuilder()).append("mNotifierCityId = ").append(h).toString());
        Log.i("wss", (new StringBuilder()).append("mNotificationCityType = ").append(i).toString());
        Log.i("wss", (new StringBuilder()).append("NOTIFIER_STYLE[mNotifierStyle] = ").append(al[aj]).toString());
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
        intent.putExtra("notify_request", 1);
        intent.putExtra("notify_on_or_off", g);
        getActivity().startService(intent);
    }

    private void s()
    {
        if (l.a().C.equals("notification_style_default") && av == null)
        {
            IntentFilter intentfilter = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_STATUS_BAR_MATCHED");
            av = new by(this);
            getActivity().registerReceiver(av, intentfilter);
        }
    }

    private void t()
    {
        if (av != null)
        {
            getActivity().unregisterReceiver(av);
            av = null;
        }
    }

    private t u()
    {
        if (at == null)
        {
            at = new t(getActivity());
        }
        return at;
    }

    protected boolean a()
    {
        return super.a();
    }

    public void b()
    {
        a(n, 4, true);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext());
        l = bundle.f();
        m = bundle.h();
        n = (TextView)c(0x7f090202);
        n.setText(0x7f08038d);
        o = c(0x7f090226);
        o.setOnClickListener(this);
        an = getResources().getColor(0x7f0a0086);
        ao = getResources().getColor(0x7f0a0088);
        ap = getResources().getColor(0x7f0a0088);
        aq = 0x7f020425;
        ar = 0x7f020425;
        u = c(0x7f090354);
        u.setOnClickListener(this);
        v = (CheckBox)c(0x7f090355);
        v.setOnCheckedChangeListener(this);
        if (com.gau.go.launcherex.gowidget.statistics.w.p(getActivity()))
        {
            u.setVisibility(0);
        } else
        {
            u.setVisibility(8);
        }
        u.setVisibility(8);
        w = c(0x7f090367);
        w.setOnClickListener(this);
        x = (CheckBox)c(0x7f090369);
        x.setOnCheckedChangeListener(this);
        p = c(0x7f090351);
        p.setOnClickListener(this);
        q = (CheckBox)c(0x7f090353);
        q.setOnCheckedChangeListener(this);
        r = (VerticalStretchLayout)c(0x7f09034e);
        r.setOnClickListener(this);
        s = (TextView)c(0x7f09034f);
        t = (TextView)c(0x7f090350);
        B = c(0x7f090356);
        B.setOnClickListener(this);
        D = (CheckBox)c(0x7f090358);
        D.setOnCheckedChangeListener(this);
        C = c(0x7f090357);
        R = c(0x7f090359);
        if (com.gau.go.launcherex.gowidget.b.a.e)
        {
            C.setVisibility(0);
        } else
        {
            C.setVisibility(4);
        }
        E = (VerticalStretchLayout)c(0x7f09035a);
        F = c(0x7f09035f);
        F.setOnClickListener(this);
        G = (TextView)c(0x7f090362);
        H = (TextView)c(0x7f090360);
        I = (TextView)c(0x7f090361);
        J = c(0x7f09035b);
        J.setOnClickListener(this);
        K = (TextView)c(0x7f09035e);
        L = (TextView)c(0x7f09035c);
        M = (TextView)c(0x7f09035d);
        O = (TextView)c(0x7f090364);
        N = c(0x7f090363);
        N.setOnClickListener(this);
        P = (TextView)c(0x7f090366);
        Q = (TextView)c(0x7f090365);
        R.setVisibility(8);
        D.setVisibility(0);
        D.setEnabled(true);
        S = c(0x7f09033f);
        S.setOnClickListener(this);
        T = (CheckBox)c(0x7f090340);
        T.setOnCheckedChangeListener(this);
        U = (VerticalStretchLayout)c(0x7f090341);
        W = (TextView)c(0x7f090343);
        V = c(0x7f090342);
        V.setOnClickListener(this);
        X = (TextView)c(0x7f090345);
        Y = (TextView)c(0x7f090344);
        ai = com.gau.go.launcherex.gowidget.weather.util.c.c(getActivity());
        ah = getResources().getIntArray(0x7f0d002b);
        Z = c(0x7f090346);
        Z.setOnClickListener(this);
        aa = (TextView)c(0x7f090349);
        ab = (TextView)c(0x7f090347);
        ac = (TextView)c(0x7f090348);
        ad = c(0x7f09034a);
        ad.setOnClickListener(this);
        ae = (TextView)c(0x7f09034d);
        af = (TextView)c(0x7f09034b);
        ag = (TextView)c(0x7f09034c);
        y = c(0x7f09036a);
        y.setOnClickListener(this);
        A = (CheckBox)c(0x7f09036c);
        A.setOnCheckedChangeListener(this);
        z = c(0x7f09036b);
        if (com.gau.go.launcherex.gowidget.b.a.c)
        {
            z.setVisibility(0);
        } else
        {
            z.setVisibility(4);
        }
        d();
        as = new bx(this, null);
        bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        getActivity().registerReceiver(as, bundle);
        b();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        int i1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag1 = true;
        flag2 = true;
        flag3 = true;
        flag4 = true;
        flag5 = true;
        i1 = 1;
        if (!compoundbutton.equals(v)) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            i1 = 0;
        }
        if (a != i1)
        {
            a = i1;
            l.a(WeatherContentProvider.g, "setting_key", "weather_assistant_switch", "setting_value", i1);
        }
_L4:
        return;
_L2:
        if (!compoundbutton.equals(x))
        {
            break; /* Loop/switch isn't completed */
        }
        int j1;
        if (flag)
        {
            j1 = ((flag1) ? 1 : 0);
        } else
        {
            j1 = 0;
        }
        if (b != j1)
        {
            b = j1;
            l.o(b);
            l.a(WeatherContentProvider.g, "setting_key", "weather_focecast_switch", "setting_value", b);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!compoundbutton.equals(q))
        {
            break; /* Loop/switch isn't completed */
        }
        int k1;
        if (flag)
        {
            k1 = ((flag2) ? 1 : 0);
        } else
        {
            k1 = 0;
        }
        if (c != k1)
        {
            c = k1;
            l.p(c);
            l.a(WeatherContentProvider.g, "setting_key", "weather_warning_switch", "setting_value", c);
        }
        b(flag);
        if (!flag)
        {
            q();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!compoundbutton.equals(D))
        {
            break; /* Loop/switch isn't completed */
        }
        int l1;
        if (flag)
        {
            l1 = ((flag3) ? 1 : 0);
        } else
        {
            l1 = 0;
        }
        if (d != l1)
        {
            d = l1;
            c(flag);
            l.q(d);
            l.a(WeatherContentProvider.g, "setting_key", "temp_change", "setting_value", d);
            if (flag)
            {
                E.d();
                return;
            } else
            {
                E.c();
                return;
            }
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (!compoundbutton.equals(T))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i2;
        if (flag)
        {
            i2 = ((flag4) ? 1 : 0);
        } else
        {
            i2 = 0;
        }
        if (g == i2) goto _L4; else goto _L7
_L7:
        g = i2;
        a(flag);
        r();
        l.a(WeatherContentProvider.g, "setting_key", "notify", "setting_value", g);
        if (flag)
        {
            U.d();
            return;
        } else
        {
            U.c();
            return;
        }
        if (!compoundbutton.equals(A) || am == flag) goto _L4; else goto _L8
_L8:
        am = flag;
        int j2;
        if (flag)
        {
            j2 = ((flag5) ? 1 : 0);
        } else
        {
            j2 = 0;
        }
        l.a(WeatherContentProvider.g, "setting_key", "notification_sound", "setting_value", j2);
        return;
    }

    public void onClick(View view)
    {
        if (view.equals(o))
        {
            h();
        } else
        {
            if (view.equals(u))
            {
                v.toggle();
                return;
            }
            if (view.equals(w))
            {
                x.toggle();
                return;
            }
            if (view.equals(p))
            {
                q.toggle();
                return;
            }
            if (view.equals(r))
            {
                l();
                return;
            }
            if (view.equals(B))
            {
                if (com.gau.go.launcherex.gowidget.b.a.e)
                {
                    com.gau.go.launcherex.gowidget.b.a.e = false;
                    C.setVisibility(8);
                    view = GoWidgetApplication.c(getActivity().getApplicationContext()).a().edit();
                    view.putBoolean("key_new_feature_temp_change", false);
                    view.commit();
                }
                D.toggle();
                return;
            }
            if (view.equals(F))
            {
                j();
                return;
            }
            if (view.equals(J))
            {
                k();
                return;
            }
            if (view.equals(N))
            {
                m();
                return;
            }
            if (view.equals(S))
            {
                T.toggle();
                return;
            }
            if (view.equals(y))
            {
                if (com.gau.go.launcherex.gowidget.b.a.c)
                {
                    com.gau.go.launcherex.gowidget.b.a.c = false;
                    z.setVisibility(8);
                    view = GoWidgetApplication.c(getActivity().getApplicationContext()).a().edit();
                    view.putBoolean("setting_notification_sound", false);
                    view.commit();
                }
                A.toggle();
                return;
            }
            if (view.equals(V))
            {
                Log.i("wss", "mNotifierCityLayout");
                o();
                return;
            }
            if (view.equals(Z))
            {
                Log.i("wss", "mNotifierWeatherTypeLayout");
                p();
                return;
            }
            if (view.equals(ad))
            {
                Log.i("wss", "mNotifierStyleLayout");
                a(0x7f080424, aj, ak);
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03008d, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (as != null)
        {
            getActivity().unregisterReceiver(as);
            as = null;
        }
        t();
    }

    public void onResume()
    {
        super.onResume();
    }

}
