// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.ubercab.client.feature.trip.tray.TrayDriverLayout;
import com.ubercab.rider.realtime.model.Image;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripVehicle;
import com.ubercab.rider.realtime.model.TripVehicleType;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.ui.TextView;
import java.util.List;

public final class ges extends gfm
{

    final TrayDriverLayout a;
    private final ValueAnimator b;
    private final chc j;
    private final chc k;
    private final chc l;
    private final ger m;
    private final ger n;
    private final ger o;

    private ges(TrayDriverLayout traydriverlayout)
    {
        a = traydriverlayout;
        super(traydriverlayout);
        j = new gel(a.getResources(), 0x7f0d0089);
        k = new gft(a.getResources(), TrayDriverLayout.a(a), j);
        l = new gft(a.getResources(), TrayDriverLayout.b(a), null);
        m = new ger((byte)0);
        n = new ger((byte)0);
        o = new ger((byte)0);
        b = ValueAnimator.ofFloat(new float[] {
            0.0F, 2.0F
        });
        b.setDuration(500L);
        Object obj = new geq(traydriverlayout, (byte)0);
        b.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (obj)));
        traydriverlayout.setOnClickListener(new android.view.View.OnClickListener(traydriverlayout) {

            final TrayDriverLayout a;
            final ges b;

            public final void onClick(View view)
            {
                b.h.a();
            }

            
            {
                b = ges.this;
                a = traydriverlayout;
                super();
            }
        });
        obj = new android.view.View.OnClickListener(traydriverlayout) {

            final TrayDriverLayout a;
            final ges b;

            public final void onClick(View view)
            {
                b.h.d();
                view = b.a.d;
                b.h.a();
            }

            
            {
                b = ges.this;
                a = traydriverlayout;
                super();
            }
        };
        traydriverlayout.mDriverImageView.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        traydriverlayout.mVehicleImageView.setOnClickListener(((android.view.View.OnClickListener) (obj)));
    }

    public ges(TrayDriverLayout traydriverlayout, byte byte0)
    {
        this(traydriverlayout);
    }

    public static ger a(ges ges1)
    {
        return ges1.m;
    }

    private static void a(View view, int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams.width == i)
        {
            return;
        } else
        {
            layoutparams.width = i;
            view.getParent().requestLayout();
            return;
        }
    }

    private void a(ImageView imageview, Uri uri, int i, Uri uri1, boolean flag, ger ger1)
    {
        if (ger1.a(uri))
        {
            return;
        }
        if (uri == null || uri.equals(Uri.EMPTY))
        {
            if (uri1 == null || uri1.equals(Uri.EMPTY))
            {
                imageview.setImageResource(i);
                ger1.a(null, false);
                return;
            } else
            {
                a(imageview, uri1, i, null, true, ger1);
                return;
            }
        }
        uri1 = new cfj(uri1, imageview, i, ger1) {

            final Uri a;
            final ImageView b;
            final int c;
            final ger d;
            final ges e;

            public final void a()
            {
                TrayDriverLayout.f(e.a).remove(this);
            }

            public final void b()
            {
                TrayDriverLayout.f(e.a).remove(this);
                if (a == null || Uri.EMPTY.equals(a))
                {
                    return;
                } else
                {
                    ges.a(e, b, a, c, d);
                    return;
                }
            }

            
            {
                e = ges.this;
                a = uri;
                b = imageview;
                c = i;
                d = ger1;
                super();
            }
        };
        TrayDriverLayout.f(a).add(uri1);
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ger1.a(uri, flag1);
        uri = a.c.a(uri).a(i).b(i);
        if (flag)
        {
            uri.d().a(k).a(0x7f080295, 0x7f080295);
        } else
        {
            uri.c().a(j).a(0x7f0802a3, 0x7f0802a3);
        }
        uri.a(imageview, uri1);
    }

    private void a(ImageView imageview, Uri uri, ger ger1)
    {
        if (ger1.a(uri))
        {
            return;
        }
        if (uri == null || Uri.EMPTY.equals(uri))
        {
            imageview.setVisibility(8);
            imageview.setImageDrawable(null);
            ger1.a(null, false);
            return;
        } else
        {
            ger1.a(uri, true);
            ger1 = new cfj(imageview, ger1) {

                final ImageView a;
                final ger b;
                final ges c;

                public final void a()
                {
                    TrayDriverLayout.f(c.a).remove(this);
                }

                public final void b()
                {
                    a.setVisibility(4);
                    b.a(null, false);
                    TrayDriverLayout.f(c.a).remove(this);
                }

            
            {
                c = ges.this;
                a = imageview;
                b = ger1;
                super();
            }
            };
            TrayDriverLayout.f(a).add(ger1);
            a.c.a(uri).d().a(0x7f0802ae, 0x7f0802ae).a(l).a(imageview, ger1);
            return;
        }
    }

    static void a(ges ges1, ImageView imageview, Uri uri, int i, ger ger1)
    {
        ges1.a(imageview, uri, i, null, true, ger1);
    }

    private void a(gfq gfq1)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = a(((View) (a.mVehicleTextModel)));
        if (gfq1.a() != gfr.a)
        {
            if (marginlayoutparams.leftMargin != 0)
            {
                marginlayoutparams.leftMargin = 0;
                a.mVehicleTextContainer.requestLayout();
            }
        } else
        if (e != null)
        {
            int i1 = a.mVehicleTextModel.getMeasuredWidth();
            int i = i1;
            if (i1 == 0)
            {
                a.mVehicleTextModel.measure(0, 0);
                i = a.mVehicleTextModel.getMeasuredWidth();
            }
            float f = e.c();
            marginlayoutparams.leftMargin = (int)((float)(-i) * (1.0F - f));
            a.mVehicleTextContainer.requestLayout();
            return;
        }
    }

    public static ger b(ges ges1)
    {
        return ges1.n;
    }

    private void c(boolean flag)
    {
        if (TrayDriverLayout.c(a) != flag)
        {
            if (flag)
            {
                a.a.a(l.is);
            }
            if (b.isStarted())
            {
                b.end();
            }
            TrayDriverLayout.a(a, flag);
            if (e.b() == gdq.b)
            {
                b.start();
                return;
            }
        }
    }

    private boolean c()
    {
        return TrayDriverLayout.g(a).n.a() != TrayDriverLayout.g(a).m.a();
    }

    static boolean c(ges ges1)
    {
        return ges1.c();
    }

    public final int a()
    {
        gfq gfq1 = h.d();
        if (gfq1.a() == gfr.a)
        {
            return TrayDriverLayout.a(a);
        }
        if (gfq1.b() == gfr.a)
        {
            return TrayDriverLayout.e(a);
        } else
        {
            return 0;
        }
    }

    public final void a(gfj gfj1)
    {
        gfq gfq1;
        gfq1 = h.d();
        d = gfj1;
        gfj1.g();
        JVM INSTR tableswitch 5 6: default 40
    //                   5 564
    //                   6 622;
           goto _L1 _L2 _L3
_L1:
        c(false);
_L4:
        float f;
        float f1;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj3 = null;
        obj2 = null;
        f1 = 0.0F;
        f = 0.0F;
        obj1 = null;
        obj5 = null;
        Object obj7 = null;
        gfj gfj2 = null;
        Object obj6 = null;
        Trip trip = gfj1.f();
        if (trip == null)
        {
            break MISSING_BLOCK_LABEL_697;
        }
        obj4 = trip.getVehicle();
        if (obj4 != null)
        {
            obj = ((TripVehicle) (obj4)).getPictureImages();
            Object obj9;
            Object obj10;
            long l1;
            boolean flag;
            if (obj != null && !((List) (obj)).isEmpty())
            {
                obj = ((Image)((List) (obj)).get(0)).getUrl();
            } else
            {
                obj = null;
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = Uri.parse(((String) (obj)));
            } else
            {
                obj = null;
            }
            obj2 = ((TripVehicle) (obj4)).getVehicleType();
            if (obj2 != null)
            {
                obj1 = ((TripVehicleType) (obj2)).getMake();
                obj2 = ((TripVehicleType) (obj2)).getModel();
            } else
            {
                obj1 = null;
                obj2 = null;
            }
            obj4 = ((TripVehicle) (obj4)).getLicensePlateFormatted();
            obj3 = obj1;
            obj1 = obj2;
            obj2 = obj3;
        } else
        {
            obj4 = null;
            obj = null;
            obj1 = obj3;
        }
        obj10 = trip.getDriver();
        obj3 = obj7;
        if (obj10 != null)
        {
            f1 = ((TripDriver) (obj10)).getRating();
            obj9 = ((TripDriver) (obj10)).getName();
            obj10 = ((TripDriver) (obj10)).getPictureUrl();
            obj3 = obj7;
            obj5 = obj9;
            f = f1;
            if (!TextUtils.isEmpty(((CharSequence) (obj10))))
            {
                obj3 = Uri.parse(((String) (obj10)));
                f = f1;
                obj5 = obj9;
            }
        }
        obj7 = drf.a(gfj1.a(), trip);
        if (obj7 != null)
        {
label0:
            {
                obj9 = ((VehicleView) (obj7)).getDescription();
                obj6 = drf.a(a.getContext(), ((VehicleView) (obj7)));
                if (obj6 != null)
                {
                    gfj1 = ((gfj) (obj6));
                    if (Uri.EMPTY.equals(obj6))
                    {
                        break label0;
                    }
                }
                gfj1 = drf.a(((VehicleView) (obj7)));
            }
            obj6 = obj4;
            obj7 = obj3;
            gfj2 = gfj1;
            obj4 = obj1;
            obj3 = obj2;
            obj2 = obj6;
            obj1 = obj;
            obj6 = gfj1;
            obj = obj7;
            gfj1 = ((gfj) (obj9));
        } else
        {
            obj7 = obj2;
            obj9 = obj1;
            gfj1 = null;
            obj1 = obj;
            obj = obj3;
            obj2 = obj4;
            obj3 = obj7;
            obj4 = obj9;
        }
_L6:
        a.mDriverText.setText(((CharSequence) (obj5)));
        a.mDriverSubtext.setText(gfj1);
        a.mDriverBoxText.setText(String.format("%.1f", new Object[] {
            Float.valueOf(f)
        }));
        a(a.mDriverImageView, ((Uri) (obj)), 0x7f020141, null, false, n);
        a.mVehicleTextMake.setText(((CharSequence) (obj3)));
        a.mVehicleTextModel.setText(((CharSequence) (obj4)));
        a.mVehicleBoxText.setText(((CharSequence) (obj2)));
        a.mVehicleTextModel.measure(0, 0);
        a(gfq1);
        gfj1 = a.d;
        a(a.mVehicleImageView, ((Uri) (obj1)), 0x7f020140, ((Uri) (gfj2)), false, m);
        a(a.mVehicleBoxIcon, ((Uri) (obj6)), o);
        a(e);
        return;
_L2:
        l1 = h.c();
        if (l1 != -1L)
        {
            obj = a.b;
            if (gju.a() - l1 <= TrayDriverLayout.a())
            {
                break MISSING_BLOCK_LABEL_616;
            }
        }
        flag = true;
_L5:
        c(flag);
          goto _L4
        flag = false;
          goto _L5
_L3:
        c(true);
          goto _L4
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj = null;
        gfj1 = null;
        Object obj8 = null;
        obj5 = obj1;
        f = f1;
        obj1 = obj8;
          goto _L6
    }

    public final void a(gfk gfk1)
    {
        super.a(gfk1);
        if (gfk1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f;
        float f1;
        float f15;
        gfq gfq1;
        Object obj;
        int i;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j3;
        int l3;
        if (gfk1.b() != gdq.b && b.isRunning())
        {
            b.end();
        }
        k1 = TrayDriverLayout.h(a);
        i = a.getMeasuredWidth();
        i2 = i;
        if (i == 0)
        {
            i2 = a.getResources().getDisplayMetrics().widthPixels;
        }
        j3 = i2 / 2;
        i = gfk1.d();
        f1 = gfk1.c();
        obj = gfk1.b();
        i1 = TrayDriverLayout.i(a);
        j1 = TrayDriverLayout.j(a);
        f = 1.0F;
        l1 = TrayDriverLayout.k(a);
        l3 = 0;
        f15 = 1.0F - f1;
        gfq1 = h.d();
        if (gfq1.a() != gfr.a) goto _L4; else goto _L3
_L3:
        boolean flag4 = c();
        com.ubercab.client.feature.trip.tray.TrayDriverLayout._cls1.a[((gdq) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 200
    //                   1 795
    //                   2 885
    //                   3 1072;
           goto _L5 _L6 _L7 _L8
_L5:
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean flag = false;
        f6 = 0.0F;
        f2 = 0.0F;
        int j2 = j1;
        f4 = 0.0F;
        f1 = 1.0F;
        f3 = 0.0F;
        f5 = 0.0F;
        f7 = 0.0F;
        f8 = 0.0F;
        j1 = i;
        i2 = i1;
        i = j2;
        i1 = ((flag) ? 1 : 0);
_L10:
        float f9;
        float f11;
        float f12;
        float f13;
        float f14;
        int k2;
        int i3;
        int k3;
        float f21 = 1.0F;
        float f16 = f6;
        i3 = k1;
        k3 = -2;
        float f19 = 0.0F;
        k1 = i2;
        float f20 = 0.0F;
        boolean flag1 = false;
        f9 = 1.0F;
        k2 = j3;
        l3 = l1;
        float f22 = 0.0F;
        f14 = f8;
        f13 = f5;
        f12 = f7;
        f11 = f3;
        f7 = f21;
        i2 = j1;
        l1 = k3;
        f8 = f4;
        f6 = f1;
        j1 = i;
        f5 = f16;
        f4 = f2;
        f3 = f;
        f2 = f20;
        f1 = f22;
        f = f19;
        k3 = i1;
        i1 = l3;
        i = ((flag1) ? 1 : 0);
          goto _L9
_L6:
        boolean flag2 = false;
        f = 0.0F;
        f9 = 1.0F;
        f12 = 0.0F;
        f8 = 0.0F;
        k2 = j3;
        f3 = 1.0F;
        k3 = l1;
        f11 = 0.0F;
        f6 = 1.0F;
        f5 = 0.0F;
        f2 = 0.0F;
        f14 = 0.0F;
        i2 = i;
        l1 = i1;
        f4 = 0.0F;
        f1 = 0.0F;
        f13 = 0.0F;
        byte byte0 = -2;
        i3 = k1;
        f7 = 1.0F;
        i = ((flag2) ? 1 : 0);
        i1 = k3;
        k3 = l3;
        k1 = l1;
        l1 = byte0;
          goto _L9
_L7:
        i3 = 0;
        f8 = i2 / 4;
        f5 = -TrayDriverLayout.l(a);
        f11 = (int)((float)(-TrayDriverLayout.a(a)) * 0.7F);
        f12 = TrayDriverLayout.a(a) - a.getHeight();
        f4 = TrayDriverLayout.l(a);
        f1 = 1.0F;
        j1 = TrayDriverLayout.m(a);
        k1 = TrayDriverLayout.n(a);
        f6 = a.mDriverText.getMeasuredHeight();
        if (!flag4)
        {
            break MISSING_BLOCK_LABEL_2132;
        }
        k3 = a.mVehicleBoxIcon.getMeasuredWidth();
        f7 = 1.0F;
        i2 = i;
        i3 = 0;
        f2 = 0.0F;
        l3 = -2;
        f14 = f8;
        f8 = f4;
        f4 = 1.0F;
        i1 = l1;
        f = 0.0F;
        f1 = 0.0F;
        f13 = f5;
        float f17 = 1.0F;
        f3 = 0.0F;
        i = 0;
        f9 = 1.0F;
        k2 = j3;
        f5 = f6;
        f6 = f17;
        l1 = l3;
          goto _L9
_L8:
        k1 = (int)((float)TrayDriverLayout.h(a) * f1);
        f8 = ((float)i2 / 4F) * f15;
        f5 = (float)(-TrayDriverLayout.l(a)) * f15;
        f4 = (float)(-TrayDriverLayout.a(a)) * f15 * 0.7F;
        f7 = (float)(TrayDriverLayout.a(a) - a.getHeight()) * f15;
        j1 = (int)((float)gfk1.d() * 0.7F);
        f3 = (float)TrayDriverLayout.l(a) * f15;
        i2 = TrayDriverLayout.n(a) + (int)((float)(TrayDriverLayout.i(a) - TrayDriverLayout.n(a)) * f1);
        if (f1 < 0.5F)
        {
            i = TrayDriverLayout.m(a);
            f = (f15 - 0.5F) * 2.0F;
        } else
        {
            i = TrayDriverLayout.j(a);
            f = (f1 - 0.5F) * 2.0F;
        }
        f2 = (float)a.mDriverText.getMeasuredHeight() * f15;
        float f18;
        byte byte1;
        boolean flag3;
        if (flag4)
        {
            if (f15 > 0.5F)
            {
                f6 = (f15 - 0.5F) * 2.0F;
            } else
            {
                f6 = 0.0F;
            }
            i1 = (int)(f6 * (float)a.mVehicleBoxIcon.getMeasuredWidth());
            f9 = f4;
            f4 = f;
            f = f1;
            f6 = f2;
            f2 = f15;
            f1 = f4;
            f4 = f3;
            f3 = f9;
        } else
        {
            float f10 = f4;
            f4 = f;
            f = f1;
            f6 = f2;
            i1 = 0;
            f2 = f15;
            f1 = f4;
            f4 = f3;
            f3 = f10;
        }
          goto _L10
_L4:
        if (gfq1.b() == gfr.a && obj != gdq.a)
        {
            k2 = a.mDriverText.getMeasuredWidth() / 2;
            f7 = 0.0F;
            k1 = (a.mDriverSection.getMeasuredHeight() - a.mDriverText.getMeasuredHeight()) / 2;
            l1 = TrayDriverLayout.e(a);
            f9 = 0.75F;
            f = k2;
            f2 = a.mDriverBoxTextGroup.getMeasuredWidth();
            f3 = TrayDriverLayout.o(a) * 3F + (f + f2 * 0.5F);
            f5 = -(a.mDriverSection.getMeasuredHeight() - a.mDriverBoxTextGroup.getMeasuredHeight()) / 2;
            f2 = -((float)k2 + (float)a.mDriverImageView.getMeasuredHeight() * 0.5F + TrayDriverLayout.o(a) * 2.0F);
            if (obj == gdq.c)
            {
                i3 = (int)((float)TrayDriverLayout.h(a) * f1);
                if (f1 <= 0.5F)
                {
                    f7 = 0.0F;
                } else
                {
                    f7 = 2.0F * f1 - 1.0F;
                }
                k3 = (int)((float)k1 * f15 + (float)TrayDriverLayout.k(a) * f1);
                l1 = (int)((float)l1 + (float)(TrayDriverLayout.d(a) - TrayDriverLayout.e(a)) * f1);
                if (f1 > 0.5F)
                {
                    f = (f1 * 2.0F - 1.0F) * 0.25F + 0.75F;
                } else
                {
                    f = 0.75F;
                }
                k2 = (int)((double)i2 * (0.5D + (double)(f15 / 2.0F)));
                f14 = 0.0F;
                i2 = i;
                k1 = i1;
                f4 = 0.0F;
                f1 = f3 * f15;
                f9 = f;
                f = f5 * f15;
                i = 1;
                f11 = 0.0F;
                f6 = 1.0F;
                f5 = 0.0F;
                f2 *= f15;
                f13 = 0.0F;
                f8 = 0.0F;
                f3 = 1.0F;
                i1 = k3;
                f12 = 0.0F;
                k3 = l3;
            } else
            {
                f = f5;
                f13 = 0.0F;
                byte1 = 0;
                k2 = i2;
                k3 = 1;
                f11 = 0.0F;
                f6 = 1.0F;
                f5 = 0.0F;
                f4 = 1.0F;
                f12 = 0.0F;
                f8 = 0.0F;
                f1 = f3;
                f14 = 0.0F;
                i2 = i;
                i3 = i1;
                f18 = 0.0F;
                i = k3;
                i1 = k1;
                k3 = l3;
                f3 = f4;
                f4 = f18;
                k1 = i3;
                i3 = byte1;
            }
        } else
        {
            flag3 = false;
            f = 0.0F;
            f9 = 1.0F;
            f12 = 0.0F;
            f8 = 0.0F;
            k2 = j3;
            f3 = 1.0F;
            k3 = l1;
            f11 = 0.0F;
            f6 = 1.0F;
            f5 = 0.0F;
            f2 = 0.0F;
            f14 = 0.0F;
            i2 = i;
            l1 = i1;
            f4 = 0.0F;
            f1 = 0.0F;
            f13 = 0.0F;
            byte1 = -2;
            i3 = k1;
            f7 = 1.0F;
            i = ((flag3) ? 1 : 0);
            i1 = k3;
            k3 = l3;
            k1 = l1;
            l1 = byte1;
        }
_L9:
        if (i != 0)
        {
            a.mDriverTextContainer.bringToFront();
            a.mVehicleTextContainer.bringToFront();
        } else
        {
            a.mDriverImageContainer.bringToFront();
            a.mVehicleImageContainer.bringToFront();
        }
        h().height = l1;
        a(((View) (a))).bottomMargin = (int)f12;
        a(((View) (a.mDriverSection)), k2);
        a(((View) (a.mVehicleSection)), j3);
        a(((View) (a.mDriverTextContainer))).topMargin = i1;
        a.setPadding(0, i3, 0, i3);
        a.mDriverImageContainer.setTranslationY(f13);
        a.mDriverImageContainer.setTranslationX(f14);
        a.mDriverImageContainer.offsetTopAndBottom(i2);
        a.mDriverTextContainer.setTranslationX(-f8);
        a.mDriverTextContainer.setTranslationY(f11);
        a.mDriverTextContainer.offsetTopAndBottom(i2);
        a.mVehicleImageContainer.setTranslationX(-f14);
        a.mVehicleImageContainer.setTranslationY(f13);
        a.mVehicleImageContainer.offsetTopAndBottom(i2);
        a.mVehicleTextContainer.setTranslationX(f8);
        a.mVehicleTextContainer.setTranslationY(f11);
        a.mVehicleTextContainer.offsetTopAndBottom(i2);
        a.mVehicleTextModel.setAlpha(f6);
        a.mVehicleTextModel.setTextColor(j1);
        a.mVehicleTextModel.setTextSize(0, k1);
        a(gfq1);
        obj = TrayDriverLayout.p(a);
        gfk1 = obj[0];
        obj = obj[1];
        f6 = 0.0F;
        if (gfq1.a() == gfr.a)
        {
            i = a.mVehicleTextModel.getLeft();
            if (i == 0 || f15 == 0.0F)
            {
                f6 = 0.0F;
            } else
            {
                f6 = ((float)(-i) / 2.0F) * f15;
            }
            TrayDriverLayout.a(gfk1[1]);
        }
        a.mVehicleTextModel.setTranslationX(f6);
        a.mVehicleTextModel.setTranslationY(f5);
        a.mDriverSubtext.setAlpha(f4);
        a.mDriverSubtext.setTranslationY(f5);
        i1 = gfk1.length;
        for (i = 0; i < i1; i++)
        {
            gfk1[i].setAlpha(1.0F);
        }

        i1 = obj.length;
        for (i = 0; i < i1; i++)
        {
            obj[i].setAlpha(f3);
        }

        a.mVehicleSection.setAlpha(f7);
        a.mDriverImageView.setScaleX(f9);
        a.mDriverImageView.setScaleY(f9);
        a.mDriverImageView.setTranslationX(f2);
        a.mDriverBoxTextGroup.setTranslationX(f1);
        a.mDriverBoxTextGroup.setTranslationY(f);
        gfk1 = a.mVehicleBoxIcon;
        if (k3 == 0)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        gfk1.setVisibility(i);
        gfk1 = a(((View) (a.mVehicleBoxText)));
        if (((android.view.ViewGroup.MarginLayoutParams) (gfk1)).leftMargin != k3)
        {
            gfk1.leftMargin = k3;
            a.mVehicleBoxTextGroup.requestLayout();
            return;
        }
          goto _L1
        f2 = 1.0F;
        f = 0.0F;
        i1 = 0;
        f7 = f12;
        f3 = f11;
        int l2 = i;
        i = j1;
        i2 = k1;
        j1 = l2;
        k1 = i3;
          goto _L10
    }

    public final int b()
    {
        return TrayDriverLayout.d(a);
    }
}
