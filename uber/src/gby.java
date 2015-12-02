// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.map.Marker;
import com.ubercab.rider.realtime.model.VehiclePathPoint;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

final class gby
{

    static final long a;
    private static long b;
    private long c;
    private long d;
    private boolean e;
    private Marker f;
    private cha g;
    private String h;
    private Animator i;
    private AnimatorSet j;
    private dut k;
    private final boolean l;
    private final Context m;
    private final cjn n;
    private final VehicleView o;
    private final cgh p;
    private final hzb q;
    private final cjf r;
    private final gju s;
    private final Handler t = new Handler();
    private final List u = new CopyOnWriteArrayList();
    private final Runnable v = new Runnable() {

        final gby a;

        public final void run()
        {
            gby.a(a);
        }

            
            {
                a = gby.this;
                super();
            }
    };

    gby(Context context, cgh cgh1, VehicleView vehicleview, String s1, List list, cjn cjn1, cjf cjf1, 
            hzb hzb1, gju gju1, boolean flag)
    {
        h = s1;
        n = cjn1;
        m = context;
        p = cgh1;
        o = vehicleview;
        s = gju1;
        l = flag;
        k = new dut();
        if (list.size() > 0)
        {
            d = gju.a() - ((VehiclePathPoint)gki.b(list)).getEpoch();
        }
        r = cjf1;
        q = hzb1;
        a(list);
    }

    static cha a(gby gby1, cha cha)
    {
        gby1.g = cha;
        return cha;
    }

    public static void a(long l1)
    {
        b = l1;
    }

    private void a(Bitmap bitmap)
    {
        if (f == null)
        {
            return;
        }
        f.setIcon(cjf.a(bitmap));
        if (i != null && i.isRunning())
        {
            i.cancel();
        }
        i = ObjectAnimator.ofFloat(f, "alpha", new float[] {
            f.getAlpha(), 1.0F
        });
        i.setInterpolator(new LinearInterpolator());
        i.setDuration(200L);
        i.start();
    }

    static void a(gby gby1)
    {
        gby1.j();
    }

    static void a(gby gby1, Bitmap bitmap)
    {
        gby1.a(bitmap);
    }

    static cha b(gby gby1)
    {
        return gby1.g;
    }

    private VehiclePathPoint b(long l1)
    {
        int i1;
        i();
        if (u.size() < 2)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        i1 = 1;
_L5:
        if (i1 >= u.size()) goto _L2; else goto _L1
_L1:
        Object obj1 = (VehiclePathPoint)u.get(i1);
        if (((VehiclePathPoint) (obj1)).getEpoch() <= l1) goto _L4; else goto _L3
_L3:
        Object obj = (VehiclePathPoint)u.get(i1 - 1);
_L6:
        if (obj1 != null)
        {
            long l2 = ((VehiclePathPoint) (obj)).getEpoch();
            long l3 = ((VehiclePathPoint) (obj1)).getEpoch();
            if (l2 != l3)
            {
                obj = new com.ubercab.client.core.model.VehiclePathPoint(l1, dub.a(Math.max((float)(l1 - l2) / (float)(l3 - l2), 1.0F), new UberLatLng(((VehiclePathPoint) (obj)).getLatitude(), ((VehiclePathPoint) (obj)).getLongitude()), new UberLatLng(((VehiclePathPoint) (obj1)).getLatitude(), ((VehiclePathPoint) (obj1)).getLongitude())), ((VehiclePathPoint) (obj)).getCourse());
            }
        } else
        if (l1 > ((VehiclePathPoint)u.get(u.size() - 1)).getEpoch())
        {
            obj = (VehiclePathPoint)u.get(u.size() - 1);
        } else
        {
            obj = (VehiclePathPoint)u.get(0);
        }
_L7:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = obj;
            if (u.size() > 0)
            {
                obj1 = (VehiclePathPoint)u.get(0);
            }
        }
        return ((VehiclePathPoint) (obj1));
_L4:
        i1++;
          goto _L5
_L2:
        obj1 = null;
        obj = null;
          goto _L6
        obj = null;
          goto _L7
    }

    static VehicleView c(gby gby1)
    {
        return gby1.o;
    }

    private void c(long l1)
    {
        k.a(Long.valueOf(l1));
        c = g();
    }

    static cgh d(gby gby1)
    {
        return gby1.p;
    }

    private long f()
    {
        if (b == 0L)
        {
            b = a;
        }
        long l1;
        if (l)
        {
            l1 = c;
        } else
        {
            l1 = d;
        }
        return gju.a() - (l1 + b);
    }

    private long g()
    {
        long l1 = 0L;
        int j1 = k.b();
        if (j1 == 0)
        {
            if (d == 0L)
            {
                return a;
            } else
            {
                return d;
            }
        }
        if (j1 == 1)
        {
            return ((Long)k.c()).longValue();
        }
        Iterator iterator = k.a();
        int k1 = (j1 - 1) / 2;
        for (int i1 = 0; i1 <= k1 && iterator.hasNext(); i1++)
        {
            l1 = ((Long)iterator.next()).longValue();
        }

        if (j1 % 2 == 0)
        {
            return (((Long)iterator.next()).longValue() + l1) / 2L;
        } else
        {
            return l1;
        }
    }

    private void h()
    {
        g = new cha() {

            final gby a;

            public final void a()
            {
                gby.a(a, new cha(this) {

                    final _cls3 a;

                    public final void a()
                    {
                    }

                    public final void a(Bitmap bitmap)
                    {
                        gby.a(a.a, bitmap);
                        gby.a(a.a, null);
                    }

                    public final void b()
                    {
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
                gby.d(a).a(drf.b(gby.c(a))).a(new gbz()).a(gby.b(a));
            }

            public final void a(Bitmap bitmap)
            {
                gby.a(a, bitmap);
                gby.a(a, null);
            }

            public final void b()
            {
            }

            
            {
                a = gby.this;
                super();
            }
        };
        p.a(drf.b(m, o)).a(g);
    }

    private void i()
    {
        long l1 = f();
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        do
        {
            if (i1 >= u.size() - 1)
            {
                break;
            }
            VehiclePathPoint vehiclepathpoint = (VehiclePathPoint)u.get(i1);
            if (vehiclepathpoint.getEpoch() > l1)
            {
                break;
            }
            arraylist.add(vehiclepathpoint);
            i1++;
        } while (true);
        u.removeAll(arraylist);
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e) goto _L2; else goto _L1
_L1:
        Object obj = f;
        if (obj != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        obj = b(f() + 750L);
        if (obj == null) goto _L2; else goto _L4
_L4:
        float f5;
        float f6;
        Object obj1;
        obj1 = new UberLatLng(((VehiclePathPoint) (obj)).getLatitude(), ((VehiclePathPoint) (obj)).getLongitude());
        TypeEvaluator typeevaluator = new TypeEvaluator() {

            final gby a;

            private static UberLatLng a(float f7, UberLatLng uberlatlng, UberLatLng uberlatlng1)
            {
                return dub.a(f7, uberlatlng, uberlatlng1);
            }

            public final Object evaluate(float f7, Object obj2, Object obj3)
            {
                return a(f7, (UberLatLng)obj2, (UberLatLng)obj3);
            }

            
            {
                a = gby.this;
                super();
            }
        };
        obj1 = ObjectAnimator.ofObject(f, "position", typeevaluator, new Object[] {
            obj1
        });
        float f3 = dud.a(f.getRotation());
        float f1 = dud.a(((VehiclePathPoint) (obj)).getCourse());
        f5 = dud.c(f3);
        f6 = dud.c(f1);
        float f2;
        float f4;
        Exception exception;
        AnimatorSet animatorset;
        if (f6 > f5 && (double)(f6 - f5) > 3.1415926535897931D)
        {
            f2 = (float)((double)f6 - 6.2831853071795862D);
            f4 = f5;
        } else
        {
            f4 = f5;
            f2 = f6;
            if (f6 < f5)
            {
                f4 = f5;
                f2 = f6;
                if ((double)(f5 - f6) > 3.1415926535897931D)
                {
                    f4 = (float)((double)f5 - 6.2831853071795862D);
                    f2 = f6;
                }
            }
        }
        f4 = dud.b(f4);
        f2 = dud.b(f2);
        obj = ObjectAnimator.ofFloat(f, "rotation", new float[] {
            f4, f2
        });
        animatorset = new AnimatorSet();
        animatorset.setDuration(750L);
        animatorset.setInterpolator(new LinearInterpolator());
        animatorset.play(((Animator) (obj1))).with(((Animator) (obj)));
        if (j != null && j.isRunning())
        {
            j.cancel();
        }
        j = animatorset;
        j.start();
        t.postDelayed(v, 500L);
          goto _L2
        exception;
        throw exception;
    }

    public final void a(List list)
    {
        int i1 = 0;
        if (list.size() != 0)
        {
            long l1 = ((VehiclePathPoint)list.get(0)).getEpoch();
            for (Iterator iterator = u.iterator(); iterator.hasNext() && ((VehiclePathPoint)iterator.next()).getEpoch() < l1;)
            {
                i1++;
            }

            u.subList(i1, u.size()).clear();
            u.addAll(list);
            i();
            if (l)
            {
                long l2 = ((VehiclePathPoint)gki.b(list)).getEpoch();
                c(gju.a() - l2);
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = f;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = false;
        t.removeCallbacks(v);
        obj = f;
        f = null;
        if (j != null)
        {
            j.cancel();
        }
        if (obj == null) goto _L1; else goto _L3
_L3:
        if (i != null && i.isRunning())
        {
            i.cancel();
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        ((Marker) (obj)).a();
          goto _L1
        obj;
        throw obj;
        i = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
            ((Marker) (obj)).getAlpha(), 0.0F
        });
        i.setDuration(200L);
        i.setInterpolator(new LinearInterpolator());
        i.addListener(new drv(((Marker) (obj))) {

            final Marker a;
            final gby b;

            public final void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                a.a();
            }

            
            {
                b = gby.this;
                a = marker;
                super();
            }
        });
        i.start();
          goto _L1
    }

    public final boolean a()
    {
        return e;
    }

    public final UberLatLng b()
    {
        if (f == null)
        {
            return null;
        } else
        {
            return f.getPosition();
        }
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        e = false;
        t.removeCallbacks(v);
        if (j != null)
        {
            j.cancel();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        if (f != null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj = b(f());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        cje cje = cjf.a(Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ALPHA_8));
        obj = ((cjz)q.a()).a(new UberLatLng(((VehiclePathPoint) (obj)).getLatitude(), ((VehiclePathPoint) (obj)).getLongitude())).a(((VehiclePathPoint) (obj)).getCourse()).a(cje).a(0.5F, 0.5F).a();
        f = n.a(((cjz) (obj)));
        if (f != null)
        {
            h();
        }
        if (f != null)
        {
            e = true;
            t.post(v);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final Long e()
    {
        if (!l || c == 0L)
        {
            return null;
        } else
        {
            return Long.valueOf(d - c);
        }
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(16L);
    }
}
