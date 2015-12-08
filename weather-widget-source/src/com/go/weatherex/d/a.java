// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.d;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.service.error.model.LocationErrorBean;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globalview.n;
import com.gau.go.launcherex.gowidget.weather.model.FeedbackBean;
import com.gau.go.launcherex.gowidget.weather.model.ForecastBean;
import com.gau.go.launcherex.gowidget.weather.model.HourlyBean;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.service.NotifyService;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.view.VerticalStretchLayout;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.ScrollViewEx;
import com.gtp.a.a.a.d;
import com.gtp.a.a.b.c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.go.weatherex.d:
//            g, i, h, e, 
//            l, b, c, d

public class a extends com.go.weatherex.framework.fragment.a
    implements android.view.View.OnClickListener
{

    private boolean A;
    private TextView a;
    private View b;
    private ScrollViewEx c;
    private n d;
    private n e;
    private ListView f;
    private VerticalStretchLayout g;
    private List h;
    private EditText i;
    private EditText j;
    private ListView k;
    private VerticalStretchLayout l;
    private String m;
    private long n;
    private EditText o;
    private ImageView p;
    private Button q;
    private ImageView r;
    private TextView s;
    private TextView t;
    private boolean u;
    private long v;
    private LayoutInflater w;
    private i x;
    private com.go.weatherex.d.e y;
    private h z;

    public a()
    {
        d = null;
        e = null;
        f = null;
        h = null;
        i = null;
        j = null;
        k = null;
        m = "";
        n = 0L;
        o = null;
        p = null;
        q = null;
        u = false;
        v = 0L;
        A = false;
    }

    public static float a(Activity activity)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.density;
    }

    static long a(a a1, long l1)
    {
        a1.n = l1;
        return l1;
    }

    static EditText a(a a1)
    {
        return a1.o;
    }

    static com.go.weatherex.d.e a(a a1, com.go.weatherex.d.e e1)
    {
        a1.y = e1;
        return e1;
    }

    static h a(a a1, h h1)
    {
        a1.z = h1;
        return h1;
    }

    private String a(Context context)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder()).append("Product=").append(Build.PRODUCT).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("PhoneModel=").append(Build.MODEL).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("ROM=").append(Build.DISPLAY).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("Board=").append(Build.BOARD).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("Device=").append(Build.DEVICE).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("Density=").append(a(((Activity) (getActivity())))).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("PackageName=").append(context.getPackageName()).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("AndroidVersion=").append(android.os.Build.VERSION.RELEASE).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("TotalMemSize=").append(b() / 1024L / 1024L).append("MB\n").toString());
        stringbuffer.append((new StringBuilder()).append("FreeMemSize=").append(c() / 1024L / 1024L).append("MB\n").toString());
        stringbuffer.append((new StringBuilder()).append("Rom App Heap Size=").append(d() / 1024L / 1024L).append("MB\n").toString());
        return stringbuffer.toString();
    }

    static String a(a a1, String s1)
    {
        a1.m = s1;
        return s1;
    }

    private void a(Intent intent, FeedbackBean feedbackbean)
    {
        ArrayList arraylist;
        feedbackbean = new File(com.gtp.a.a.b.a.a);
        if (!feedbackbean.exists())
        {
            feedbackbean.mkdirs();
        }
        arraylist = new ArrayList();
        feedbackbean = new File(feedbackbean, "feedback_extra.zip");
        feedbackbean.delete();
        File file = getActivity().getFileStreamPath("network_time_and_status_statistics_email.txt");
        if (file != null && file.exists())
        {
            arraylist.add(file);
        }
        file = getActivity().getFileStreamPath("collect_data_weather_refresh_error_info.txt");
        if (file != null && file.exists())
        {
            arraylist.add(file);
        }
        com.gtp.a.a.a.d.a(arraylist, feedbackbean);
_L2:
        if (feedbackbean != null)
        {
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(feedbackbean));
        }
        return;
        IOException ioexception;
        ioexception;
        Object obj = null;
        feedbackbean = obj;
        if (com.gtp.a.a.b.c.a())
        {
            ioexception.printStackTrace();
            feedbackbean = obj;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(FeedbackBean feedbackbean)
    {
        Object obj1 = getActivity().getSharedPreferences("myLocation", 0);
        Object obj = ((SharedPreferences) (obj1)).getString("lat", "");
        String s1 = ((SharedPreferences) (obj1)).getString("lng", "");
        String s2 = ((SharedPreferences) (obj1)).getString("cityId", "");
        String s3 = ((SharedPreferences) (obj1)).getString("cityName", "");
        String s4 = ((SharedPreferences) (obj1)).getString("stateName", "");
        String s5 = ((SharedPreferences) (obj1)).getString("countryName", "");
        obj1 = ((SharedPreferences) (obj1)).getString("url", "");
        feedbackbean = new LocationErrorBean(s2, s3, s4, s5, ((String) (obj)), s1, feedbackbean.b(), ((String) (obj1)));
        obj = new Intent(getActivity().getApplicationContext(), com/gau/go/launcherex/gowidget/weather/service/NotifyService);
        ((Intent) (obj)).putExtra("notify_request", 30);
        ((Intent) (obj)).putExtra("request_extra_feedback_location_data", feedbackbean);
        getActivity().startService(((Intent) (obj)));
    }

    private com.go.weatherex.d.g[] a(Cursor cursor)
    {
        boolean flag = false;
        WeatherBean aweatherbean[] = new WeatherBean[cursor.getCount()];
        int l1 = cursor.getColumnCount();
        int i1 = 0;
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            aweatherbean[i1] = new WeatherBean();
            int j1 = 0;
            while (j1 < l1) 
            {
                String s1 = cursor.getColumnName(j1);
                if ("cityName".equals(s1))
                {
                    aweatherbean[i1].e(cursor.getString(j1));
                } else
                if ("country".equals(s1))
                {
                    aweatherbean[i1].b(cursor.getString(j1));
                } else
                if ("state".equals(s1))
                {
                    aweatherbean[i1].a(cursor.getString(j1));
                } else
                if ("cityId".equals(s1))
                {
                    aweatherbean[i1].c(cursor.getString(j1));
                } else
                if ("city_my_location".equals(s1))
                {
                    aweatherbean[i1].a(cursor.getInt(j1));
                } else
                if ("timestamp".equals(s1))
                {
                    aweatherbean[i1].l.b(cursor.getLong(j1));
                }
                j1++;
            }
            i1++;
        } while (true);
        Object obj = "";
        int k1 = aweatherbean.length;
        i1 = 0;
label0:
        do
        {
label1:
            {
                cursor = ((Cursor) (obj));
                if (i1 < k1)
                {
                    if (aweatherbean[i1].e() != 2)
                    {
                        break label1;
                    }
                    cursor = aweatherbean[i1].c();
                }
                obj = new ArrayList();
                i1 = ((flag) ? 1 : 0);
                while (i1 < k1) 
                {
                    if (!aweatherbean[i1].c().equals(cursor) || aweatherbean[i1].e() != 1)
                    {
                        com.go.weatherex.d.g g1 = new com.go.weatherex.d.g(this, null);
                        g1.a = aweatherbean[i1].c();
                        g1.b = aweatherbean[i1].d();
                        g1.c = aweatherbean[i1].b();
                        g1.d = aweatherbean[i1].a();
                        g1.e = aweatherbean[i1].l.g();
                        ((ArrayList) (obj)).add(g1);
                    }
                    i1++;
                }
                break label0;
            }
            i1++;
        } while (true);
        return (com.go.weatherex.d.g[])((ArrayList) (obj)).toArray(new com.go.weatherex.d.g[((ArrayList) (obj)).size()]);
    }

    static com.go.weatherex.d.g[] a(a a1, Cursor cursor)
    {
        return a1.a(cursor);
    }

    public static long b()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l1 = statfs.getBlockSize();
        return (long)statfs.getBlockCount() * l1;
    }

    static void b(a a1)
    {
        a1.p();
    }

    private boolean b(FeedbackBean feedbackbean)
    {
        if (!TextUtils.isEmpty(feedbackbean.a())) goto _L2; else goto _L1
_L1:
        if (System.currentTimeMillis() - v > 2000L)
        {
            Toast.makeText(getActivity(), getText(0x7f080372), 2000).show();
            v = System.currentTimeMillis();
        }
_L4:
        return false;
_L2:
        if (!s.isShown() || !TextUtils.isEmpty(feedbackbean.b()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (System.currentTimeMillis() - v > 2000L)
        {
            Toast.makeText(getActivity(), getText(0x7f080373), 2000).show();
            v = System.currentTimeMillis();
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (t.isShown() && TextUtils.isEmpty(feedbackbean.c()))
        {
            if (System.currentTimeMillis() - v > 2000L)
            {
                Toast.makeText(getActivity(), getText(0x7f080374), 2000).show();
                v = System.currentTimeMillis();
                return false;
            }
        } else
        {
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public static long c()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l1 = statfs.getBlockSize();
        return (long)statfs.getAvailableBlocks() * l1;
    }

    static ScrollViewEx c(a a1)
    {
        return a1.c;
    }

    private void c(FeedbackBean feedbackbean)
    {
        feedbackbean.d();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        String s1 = d(feedbackbean);
        String s2 = (new StringBuilder()).append(feedbackbean.a(getActivity().getApplicationContext())).append("\n\n").append(a(getActivity())).toString();
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            "goweatherexfeedback@gmail.com"
        });
        intent.putExtra("android.intent.extra.SUBJECT", s1);
        intent.putExtra("android.intent.extra.TEXT", s2);
        a(intent, feedbackbean);
        try
        {
            startActivityForResult(Intent.createChooser(intent, getString(0x7f080378)), 110);
            A = true;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Toast.makeText(getActivity().getApplicationContext(), 0x7f08037a, 0).show();
        }
        e(feedbackbean);
    }

    public static long d()
    {
        return Runtime.getRuntime().maxMemory();
    }

    private String d(FeedbackBean feedbackbean)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder()).append("GO Weather EX(v").append(com.gau.go.launcherex.gowidget.statistics.w.c(getActivity())).append("--versionCode:").append(com.gau.go.launcherex.gowidget.statistics.w.e(getActivity())).append(")").toString());
        stringbuffer.append(" ");
        stringbuffer.append((new StringBuilder()).append("Feedback(").append(getString(0x7f08036b)).append(")/").append(feedbackbean.d()).append(". ").append(feedbackbean.a()).toString());
        return stringbuffer.toString();
    }

    static void d(a a1)
    {
        a1.s();
    }

    static List e(a a1)
    {
        return a1.h;
    }

    private void e(FeedbackBean feedbackbean)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("upload_statistics_data_file_2_extra_feedback_bean", feedbackbean);
        com.gau.go.launcherex.gowidget.statistics.c.a(getActivity().getApplicationContext(), 2, bundle);
    }

    static EditText f(a a1)
    {
        return a1.i;
    }

    static void g(a a1)
    {
        a1.l();
    }

    static void h(a a1)
    {
        a1.k();
    }

    static h i(a a1)
    {
        return a1.z;
    }

    static EditText j(a a1)
    {
        return a1.j;
    }

    private void j()
    {
        if (h == null)
        {
            h = r();
        }
        if (x == null)
        {
            x = new i(this);
            f.setAdapter(x);
        }
        int i1 = (int)(getResources().getDisplayMetrics().density * 228F);
        android.view.ViewGroup.LayoutParams layoutparams = f.getLayoutParams();
        layoutparams.height = i1;
        f.setLayoutParams(layoutparams);
        f.setTag(Boolean.valueOf(true));
        c.a(f);
        g.d();
        p.setImageResource(0x7f0200b7);
        s();
    }

    static com.go.weatherex.d.e k(a a1)
    {
        return a1.y;
    }

    private void k()
    {
        f.setTag(Boolean.valueOf(false));
        c.b(f);
        g.c();
        p.setImageResource(0x7f0200ad);
    }

    static ImageView l(a a1)
    {
        return a1.r;
    }

    private void l()
    {
        if (z == null)
        {
            s.setVisibility(4);
            t.setVisibility(4);
            return;
        }
        int i1 = z.a();
        if (i1 == 3 || i1 == 2 || i1 == 7 || i1 == 8)
        {
            s.setVisibility(0);
        } else
        {
            s.setVisibility(4);
        }
        if (i1 == 1 || i1 == 17)
        {
            t.setVisibility(0);
            return;
        } else
        {
            t.setVisibility(4);
            return;
        }
    }

    private void m()
    {
        if (y == null)
        {
            q();
            return;
        } else
        {
            n();
            return;
        }
    }

    static boolean m(a a1)
    {
        return a1.u;
    }

    static LayoutInflater n(a a1)
    {
        return a1.w;
    }

    private void n()
    {
        int i1 = 5;
        k.setAdapter(y);
        Object obj = getResources().getDisplayMetrics();
        int k1 = ((DisplayMetrics) (obj)).heightPixels;
        int l1 = j.getBottom();
        int j1 = y.getCount();
        k1 = (int)((float)(k1 - l1 - 20) / ((45F + 0.5F) * ((DisplayMetrics) (obj)).density));
        float f1;
        if (k1 <= 5)
        {
            i1 = k1;
        }
        if (i1 > j1)
        {
            i1 = j1;
        }
        f1 = i1;
        i1 = (int)(((float)(i1 - 1) * 0.5F + f1 * 45F) * ((DisplayMetrics) (obj)).density);
        obj = k.getLayoutParams();
        obj.height = i1;
        k.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        k.setTag(Boolean.valueOf(true));
        c.a(k);
        l.d();
        r.setImageResource(0x7f0200b7);
        s();
    }

    private void o()
    {
        k.setTag(Boolean.valueOf(false));
        c.b(k);
        l.c();
        r.setImageResource(0x7f0200ad);
    }

    static void o(a a1)
    {
        a1.o();
    }

    private void p()
    {
        Boolean boolean1 = (Boolean)f.getTag();
        if (boolean1 != null && boolean1.booleanValue())
        {
            k();
        }
        boolean1 = (Boolean)k.getTag();
        if (boolean1 != null && boolean1.booleanValue())
        {
            o();
        }
    }

    static void p(a a1)
    {
        a1.n();
    }

    private void q()
    {
        (new l(getActivity().getContentResolver(), this)).a(1, null, WeatherContentProvider.a, new String[] {
            "cityName", "country", "state", "cityId", "city_my_location", "timestamp"
        }, null, null, "sequence");
    }

    private List r()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new h(this, 1, getString(0x7f08037b)));
        arraylist.add(new h(this, 2, getString(0x7f08037c)));
        arraylist.add(new h(this, 3, getString(0x7f080385)));
        arraylist.add(new h(this, 4, getString(0x7f08037d)));
        arraylist.add(new h(this, 5, getString(0x7f08037f)));
        arraylist.add(new h(this, 6, getString(0x7f080380)));
        arraylist.add(new h(this, 7, getString(0x7f080381)));
        arraylist.add(new h(this, 8, getString(0x7f080382)));
        arraylist.add(new h(this, 9, getString(0x7f080383)));
        arraylist.add(new h(this, 16, getString(0x7f080386)));
        arraylist.add(new h(this, 17, getString(0x7f080384)));
        return arraylist;
    }

    private void s()
    {
        View view = getActivity().getCurrentFocus();
        if (view != null)
        {
            ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    private void t()
    {
        i.setText("");
        j.setText("");
        o.setText("");
        if (y != null)
        {
            y.a();
        }
        z = null;
        l();
    }

    private boolean u()
    {
        if (d != null)
        {
            d.a();
        }
        if (e != null)
        {
            e.a();
        }
        return false;
    }

    protected boolean a()
    {
        if (u())
        {
            return true;
        } else
        {
            return super.a();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        w = getActivity().getLayoutInflater();
        a = (TextView)c(0x7f090202);
        a.setText(0x7f08036b);
        b = c(0x7f090226);
        c = (ScrollViewEx)c(0x7f0902c1);
        i = (EditText)c(0x7f0902c5);
        f = (ListView)c(0x7f0902c8);
        g = (VerticalStretchLayout)c(0x7f0902c7);
        j = (EditText)c(0x7f0902cb);
        k = (ListView)c(0x7f0902ce);
        l = (VerticalStretchLayout)c(0x7f0902cd);
        o = (EditText)c(0x7f09028d);
        q = (Button)c(0x7f0902d1);
        r = (ImageView)c(0x7f0902cc);
        p = (ImageView)c(0x7f0902c6);
        s = (TextView)c(0x7f0902ca);
        t = (TextView)c(0x7f0902d0);
        s.setVisibility(4);
        t.setVisibility(4);
        b.setOnClickListener(this);
        p.setOnClickListener(this);
        i.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        i.setEnabled(true);
        j.clearFocus();
        j.addTextChangedListener(new b(this));
        o.clearFocus();
        o.setMovementMethod(ScrollingMovementMethod.getInstance());
        o.setOnTouchListener(new com.go.weatherex.d.c(this));
        c.setOnTouchListener(new com.go.weatherex.d.d(this));
        if (!com.gau.go.launcherex.gowidget.c.g.a(getActivity().getApplicationContext()))
        {
            Toast.makeText(getActivity(), getText(0x7f080375), 0).show();
            v = System.currentTimeMillis();
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (110 == i1)
        {
            t();
        }
    }

    public void onClick(View view)
    {
        boolean flag = false;
        if (view.equals(b))
        {
            if (!u())
            {
                h();
            }
        } else
        {
            if (view.equals(p) || view.equals(i))
            {
                view = (Boolean)k.getTag();
                if (view != null && view.booleanValue())
                {
                    o();
                }
                view = (Boolean)f.getTag();
                if (view == null || !view.booleanValue())
                {
                    j();
                    return;
                } else
                {
                    k();
                    return;
                }
            }
            if (view.equals(j) || view.equals(r))
            {
                view = (Boolean)f.getTag();
                if (view != null && view.booleanValue())
                {
                    k();
                }
                view = (Boolean)k.getTag();
                if (view == null || !view.booleanValue())
                {
                    m();
                    return;
                } else
                {
                    o();
                    return;
                }
            }
            if (view.equals(q))
            {
                p();
                view = new FeedbackBean();
                if (z != null)
                {
                    view.a(z.b());
                    view.b(j.getText().toString());
                    view.c(o.getText().toString());
                    view.a(z.a());
                    view.e(m);
                }
                if (b(view))
                {
                    if (!com.gau.go.launcherex.gowidget.c.g.a(getActivity().getApplicationContext()))
                    {
                        if (System.currentTimeMillis() - v > 2000L)
                        {
                            Toast.makeText(getActivity(), getText(0x7f080375), 2000).show();
                            v = System.currentTimeMillis();
                            return;
                        }
                    } else
                    {
                        if (y != null)
                        {
                            Object obj = y.b();
                            if (obj != null)
                            {
                                view.b((new StringBuilder()).append(((com.go.weatherex.d.g) (obj)).a()).append("[").append(((com.go.weatherex.d.g) (obj)).a).append("]").toString());
                                obj = com.gau.go.launcherex.gowidget.weather.util.f.a(getActivity().getApplicationContext()).a(((com.go.weatherex.d.g) (obj)).a);
                                if (obj != null)
                                {
                                    StringBuilder stringbuilder = new StringBuilder();
                                    stringbuilder.append("\nNow Weather:\n");
                                    String s1 = com.gau.go.launcherex.gowidget.language.e.a(getActivity().getApplicationContext()).d();
                                    stringbuilder.append((new StringBuilder()).append("language : ").append(s1).append("\n").toString());
                                    s1 = com.jiubang.b.c.a.a(((WeatherBean) (obj)).l.f(), "yyyy-MM-dd HH:mm:ss Z");
                                    stringbuilder.append((new StringBuilder()).append("UpdateTime : ").append(s1).append("\n").toString());
                                    s1 = com.jiubang.b.c.a.a(((WeatherBean) (obj)).l.B(), "yyyy-MM-dd HH:mm:ss Z");
                                    stringbuilder.append((new StringBuilder()).append("WeatherTimestamp : ").append(s1).append("\n").toString());
                                    stringbuilder.append((new StringBuilder()).append("Weather status : ").append(((WeatherBean) (obj)).l.e()).append("\n").toString());
                                    stringbuilder.append((new StringBuilder()).append("NowTemp : ").append(((WeatherBean) (obj)).l.a(2)).append("\n").toString());
                                    stringbuilder.append((new StringBuilder()).append("HighTemp : ").append(((WeatherBean) (obj)).l.b(2)).append("\n").toString());
                                    stringbuilder.append((new StringBuilder()).append("LowTemp : ").append(((WeatherBean) (obj)).l.c(2)).append("\n").toString());
                                    stringbuilder.append("\nHourly Forecast:\n");
                                    int k1 = ((WeatherBean) (obj)).h.size();
                                    for (int i1 = 0; i1 < k1; i1++)
                                    {
                                        HourlyBean hourlybean = (HourlyBean)((WeatherBean) (obj)).h.get(i1);
                                        stringbuilder.append((new StringBuilder()).append("Time : ").append(hourlybean.a()).append("/").append(hourlybean.b()).append("/").append(hourlybean.c()).append(" ").append(hourlybean.d()).append(":00").append("\n").toString());
                                        stringbuilder.append((new StringBuilder()).append("Status : ").append(hourlybean.g()).append("\n").toString());
                                        stringbuilder.append((new StringBuilder()).append("Temp : ").append(hourlybean.b(2)).append("\n \n").toString());
                                    }

                                    stringbuilder.append("Future Weather:\n");
                                    k1 = ((WeatherBean) (obj)).g.size();
                                    for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
                                    {
                                        ForecastBean forecastbean = (ForecastBean)((WeatherBean) (obj)).g.get(j1);
                                        stringbuilder.append((new StringBuilder()).append("Time : ").append(forecastbean.e()).append("/").append(forecastbean.f()).append("/").append(forecastbean.g()).append("\n").toString());
                                        stringbuilder.append((new StringBuilder()).append("Status : ").append(forecastbean.d()).append("\n").toString());
                                        stringbuilder.append((new StringBuilder()).append("HighTemp : ").append(forecastbean.b(2)).append("\n").toString());
                                        stringbuilder.append((new StringBuilder()).append("LowTemp : ").append(forecastbean.a(2)).append("\n \n").toString());
                                    }

                                    view.d(stringbuilder.toString());
                                }
                            }
                        }
                        if (3 == view.d())
                        {
                            a(view);
                        }
                        c(view);
                        return;
                    }
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03007c, viewgroup, false);
    }

    public void onStart()
    {
        super.onStart();
        if (A)
        {
            A = false;
        }
    }
}
