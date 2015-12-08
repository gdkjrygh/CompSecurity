// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.windforecast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.a.b;
import com.a.a.d;
import com.a.a.s;
import com.a.c.a;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.q;

// Referenced classes of package com.go.weatherex.home.windforecast:
//            f

public class WindInfoBase extends RelativeLayout
    implements b
{

    private static final int y[] = {
        0x7f02062d, 0x7f02062b, 0x7f02062a, 0x7f02062c, 0x7f02062f, 0x7f020632, 0x7f020630, 0x7f020631, 0x7f02062e
    };
    private Context a;
    private String b;
    private f c;
    private e d;
    private WeatherBean e;
    private String f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private ImageView k;
    private View l;
    private View m;
    private d n;
    private long o;
    private long p;
    private float q;
    private d r;
    private boolean s;
    private float t;
    private float u;
    private float v;
    private AccelerateInterpolator w;
    private final Handler x;

    public WindInfoBase(Context context)
    {
        super(context);
        a = null;
        b = "";
        f = "\260C";
        n = new d();
        o = 0L;
        p = 0L;
        q = 0.0F;
        r = new d();
        s = false;
        w = new AccelerateInterpolator();
        x = new com.go.weatherex.home.windforecast.f(this);
        a(context);
    }

    public WindInfoBase(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = "";
        f = "\260C";
        n = new d();
        o = 0L;
        p = 0L;
        q = 0.0F;
        r = new d();
        s = false;
        w = new AccelerateInterpolator();
        x = new com.go.weatherex.home.windforecast.f(this);
        a(context);
    }

    public WindInfoBase(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = null;
        b = "";
        f = "\260C";
        n = new d();
        o = 0L;
        p = 0L;
        q = 0.0F;
        r = new d();
        s = false;
        w = new AccelerateInterpolator();
        x = new com.go.weatherex.home.windforecast.f(this);
        a(context);
    }

    private void a(Context context)
    {
        a = context;
    }

    static void a(WindInfoBase windinfobase)
    {
        windinfobase.c();
    }

    private Matrix b(int i1)
    {
        Object obj;
        Object obj1;
        obj1 = new Matrix();
        obj = obj1;
        i1;
        JVM INSTR tableswitch 1 18: default 100
    //                   1 164
    //                   2 164
    //                   3 169
    //                   4 183
    //                   5 183
    //                   6 183
    //                   7 197
    //                   8 211
    //                   9 211
    //                   10 211
    //                   11 102
    //                   12 225
    //                   13 225
    //                   14 225
    //                   15 239
    //                   16 253
    //                   17 253
    //                   18 253;
           goto _L1 _L2 _L2 _L3 _L4 _L4 _L4 _L5 _L6 _L6 _L6 _L7 _L8 _L8 _L8 _L9 _L10 _L10 _L10
_L7:
        break; /* Loop/switch isn't completed */
_L1:
        obj = null;
_L12:
        if (obj != null)
        {
            obj1 = new DisplayMetrics();
            ((Activity)a).getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj1)));
            float f1 = (133.3F * ((DisplayMetrics) (obj1)).density) / 2.0F;
            ((Matrix) (obj)).preTranslate(-f1, -f1);
            ((Matrix) (obj)).postTranslate(f1, f1);
        }
        return ((Matrix) (obj));
_L2:
        obj = null;
        continue; /* Loop/switch isn't completed */
_L3:
        ((Matrix) (obj1)).postRotate(180F);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L4:
        ((Matrix) (obj1)).postRotate(225F);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L5:
        ((Matrix) (obj1)).postRotate(270F);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L6:
        ((Matrix) (obj1)).postRotate(315F);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L8:
        ((Matrix) (obj1)).postRotate(45F);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L9:
        ((Matrix) (obj1)).postRotate(90F);
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L10:
        ((Matrix) (obj1)).postRotate(135F);
        obj = obj1;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private String b(float f1)
    {
        if (f1 < 10F)
        {
            return (new StringBuilder()).append(f1).append("").toString();
        } else
        {
            return (new StringBuilder()).append(Math.round(f1)).append("").toString();
        }
    }

    private void b()
    {
        s s1 = com.a.a.s.a(this, "translationY", new float[] {
            q, 0.0F
        });
        s s2 = com.a.a.s.a(this, "alpha", new float[] {
            0.0F, 1.0F
        });
        n.a(new s[] {
            s1, s2
        });
        n.b(o);
        n.c(p);
        n.a();
        n.a(this);
    }

    private float c(float f1)
    {
        return (720F + f1) % 360F;
    }

    private int c(int i1)
    {
        switch (i1)
        {
        default:
            return y[8];

        case 1: // '\001'
        case 2: // '\002'
            return y[8];

        case 3: // '\003'
            return y[4];

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return y[5];

        case 7: // '\007'
            return y[6];

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            return y[7];

        case 11: // '\013'
            return y[0];

        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            return y[1];

        case 15: // '\017'
            return y[2];

        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
            return y[3];
        }
    }

    private void c()
    {
        if (l != null && t != v && s)
        {
            float f2 = v;
            float f1;
            float f3;
            float f4;
            AccelerateInterpolator accelerateinterpolator;
            if (f2 - t > 180F)
            {
                f1 = f2 - 360F;
            } else
            {
                f1 = f2;
                if (f2 - t < -180F)
                {
                    f1 = f2 + 360F;
                }
            }
            f3 = f1 - t;
            f2 = f3;
            if (Math.abs(f3) > 1.0F)
            {
                if (f3 > 0.0F)
                {
                    f2 = 1.0F;
                } else
                {
                    f2 = -1F;
                }
            }
            f3 = t;
            f4 = t;
            accelerateinterpolator = w;
            if (Math.abs(f2) > 1.0F)
            {
                f2 = 0.35F;
            } else
            {
                f2 = 0.3F;
            }
            t = c(accelerateinterpolator.getInterpolation(f2) * (f1 - f4) + f3);
            com.a.c.a.b(l, t);
        }
    }

    private void d()
    {
        float f1;
        s s1;
        if (u < -180F)
        {
            f1 = u + 360F;
        } else
        {
            f1 = u;
        }
        s1 = com.a.a.s.a(this, "rotation", new float[] {
            0.0F, f1
        });
        t = f1;
        r.a(new com.a.a.a[] {
            s1
        });
        r.b(10L);
        r.c(500L);
        r.a(this);
        r.a(l);
        r.a();
    }

    public void a()
    {
    }

    public void a(float f1)
    {
        u = -f1;
        v = c(u);
        if (!x.hasMessages(1))
        {
            x.sendEmptyMessageDelayed(1, 10L);
        }
    }

    public void a(int i1)
    {
        m.setVisibility(i1);
    }

    public void a(com.a.a.a a1)
    {
    }

    public void a(com.go.weatherex.framework.fragment.a a1)
    {
        if (a1 == null)
        {
            return;
        } else
        {
            a1.a(j, 4, true);
            a1.a(i, 3, true);
            a1.a(g, 3, true);
            a1.a(h, 4, true);
            return;
        }
    }

    public void a(String s1)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
label5:
                            {
                                {
                                    if (TextUtils.isEmpty(s1))
                                    {
                                        return;
                                    }
                                    Object obj;
                                    if (c == null)
                                    {
                                        obj = com.gau.go.launcherex.gowidget.weather.util.f.a(a.getApplicationContext());
                                    } else
                                    {
                                        obj = c;
                                    }
                                    c = ((f) (obj));
                                    if (d == null)
                                    {
                                        obj = com.gau.go.launcherex.gowidget.weather.c.e.a(a.getApplicationContext());
                                    } else
                                    {
                                        obj = d;
                                    }
                                    d = ((e) (obj));
                                    if (!s1.equals(b))
                                    {
                                        b = s1;
                                        e = c.a(b);
                                    }
                                    if (e == null)
                                    {
                                        j.setText("--");
                                        g.setText("--");
                                        k.setImageResource(0x7f020348);
                                        k.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
                                        return;
                                    }
                                    s1 = e.l;
                                    float f1;
                                    int i1;
                                    if (s1 != null)
                                    {
                                        f1 = s1.a();
                                        i1 = s1.m();
                                    } else
                                    {
                                        i1 = 1;
                                        f1 = -10000F;
                                    }
                                    h.setVisibility(0);
                                    switch (d.a().q)
                                    {
                                    default:
                                        h.setVisibility(0);
                                        i.setVisibility(8);
                                        f = a.getString(0x7f080200);
                                        if (f1 == -10000F)
                                        {
                                            s1 = "--";
                                        } else
                                        {
                                            s1 = b(com.gau.go.launcherex.gowidget.weather.util.q.b(f1));
                                        }
                                        break;

                                    case 1: // '\001'
                                        break label5;

                                    case 2: // '\002'
                                        break label4;

                                    case 3: // '\003'
                                        break label3;

                                    case 4: // '\004'
                                        break label2;

                                    case 5: // '\005'
                                        break label1;

                                    case 6: // '\006'
                                        break label0;
                                    }
                                }
                                j.setText(e.l.b());
                                j.setCompoundDrawablesWithIntrinsicBounds(0, 0, c(e.l.m()), 0);
                                if (h.getVisibility() != 8)
                                {
                                    h.setText(f);
                                } else
                                {
                                    i.setText(f);
                                }
                                g.setText(s1);
                                s1 = b(i1);
                                if (s1 != null)
                                {
                                    k.setImageResource(0x7f020402);
                                    k.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
                                    k.setImageMatrix(s1);
                                    return;
                                } else
                                {
                                    k.setImageResource(0x7f020348);
                                    k.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
                                    return;
                                }
                            }
                            h.setVisibility(0);
                            i.setVisibility(8);
                            f = a.getString(0x7f0801ff);
                            if (f1 == -10000F)
                            {
                                s1 = "--";
                            } else
                            {
                                s1 = b(com.gau.go.launcherex.gowidget.weather.util.q.c(f1, 1));
                            }
                            break MISSING_BLOCK_LABEL_271;
                        }
                        h.setVisibility(0);
                        i.setVisibility(8);
                        f = a.getString(0x7f080200);
                        if (f1 == -10000F)
                        {
                            s1 = "--";
                        } else
                        {
                            s1 = b(com.gau.go.launcherex.gowidget.weather.util.q.b(f1));
                        }
                        break MISSING_BLOCK_LABEL_271;
                    }
                    h.setVisibility(0);
                    i.setVisibility(8);
                    f = a.getString(0x7f080201);
                    if (f1 == -10000F)
                    {
                        s1 = "--";
                    } else
                    {
                        s1 = b(com.gau.go.launcherex.gowidget.weather.util.q.d(f1, 1));
                    }
                    break MISSING_BLOCK_LABEL_271;
                }
                h.setVisibility(0);
                i.setVisibility(8);
                f = a.getString(0x7f080202);
                if (f1 == -10000F)
                {
                    s1 = "--";
                } else
                {
                    s1 = b(com.gau.go.launcherex.gowidget.weather.util.q.e(f1, 1));
                }
                break MISSING_BLOCK_LABEL_271;
            }
            if (f1 == -10000F)
            {
                s1 = "--";
            } else
            {
                s1 = b(com.gau.go.launcherex.gowidget.weather.util.q.a(f1));
            }
            if (!com.gau.go.launcherex.gowidget.language.e.a(a).b().equals("zh") && !com.gau.go.launcherex.gowidget.language.e.a(a).b().equals("ko"))
            {
                h.setVisibility(8);
                i.setVisibility(0);
                f = a.getString(0x7f080215, new Object[] {
                    ""
                });
            } else
            {
                h.setVisibility(0);
                i.setVisibility(8);
                f = a.getString(0x7f080203);
            }
            break MISSING_BLOCK_LABEL_271;
        }
        h.setVisibility(0);
        i.setVisibility(8);
        f = a.getString(0x7f080204);
        if (f1 == -10000F)
        {
            s1 = "--";
        } else
        {
            s1 = b(com.gau.go.launcherex.gowidget.weather.util.q.f(f1, 1));
        }
        break MISSING_BLOCK_LABEL_271;
    }

    public void a(String s1, long l1, long l2, float f1)
    {
        com.a.c.a.a(this, 0.0F);
        o = l1;
        p = l2;
        q = f1;
        b();
    }

    public void b(com.a.a.a a1)
    {
    }

    public void c(com.a.a.a a1)
    {
        if (a1 == n)
        {
            d();
        } else
        if (a1 == r)
        {
            s = true;
            return;
        }
    }

    public void d(com.a.a.a a1)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        j = (TextView)findViewById(0x7f09059a);
        i = (TextView)findViewById(0x7f090597);
        g = (TextView)findViewById(0x7f090598);
        h = (TextView)findViewById(0x7f090599);
        l = findViewById(0x7f090594);
        k = (ImageView)findViewById(0x7f090595);
        m = findViewById(0x7f09059b);
    }

}
