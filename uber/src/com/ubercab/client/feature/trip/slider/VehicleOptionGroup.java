// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.RadioGroup;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.VehicleView;
import gdx;
import geg;
import gjy;
import gka;
import gki;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            OptionRadioButton

public class VehicleOptionGroup extends HorizontalScrollView
    implements android.widget.RadioGroup.OnCheckedChangeListener
{

    boolean a;
    private int b;
    private geg c;
    private final List d;
    private WindowManager e;
    RadioGroup mRadioGroup;

    public VehicleOptionGroup(Context context)
    {
        this(context, null);
    }

    public VehicleOptionGroup(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public VehicleOptionGroup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = new CopyOnWriteArrayList();
        inflate(context, 0x7f030206, this);
        ButterKnife.inject(this);
        mRadioGroup.setOnCheckedChangeListener(this);
        e = (WindowManager)getContext().getSystemService("window");
        b = getResources().getDimensionPixelSize(0x7f0802bc);
    }

    private int a(int i)
    {
        if (i > 2)
        {
            return -2;
        } else
        {
            Display display = e.getDefaultDisplay();
            Point point = new Point();
            display.getSize(point);
            return (point.x - b * (i + 1)) / i;
        }
    }

    private OptionRadioButton a(List list, String s)
    {
        return (OptionRadioButton)gki.d(list, new gka(s) {

            final String a;
            final VehicleOptionGroup b;

            private boolean a(OptionRadioButton optionradiobutton)
            {
                return optionradiobutton.a().equals(a);
            }

            public final boolean apply(Object obj)
            {
                return a((OptionRadioButton)obj);
            }

            
            {
                b = VehicleOptionGroup.this;
                a = s;
                super();
            }
        }).d();
    }

    private void a(HorizontalScrollView horizontalscrollview, OptionRadioButton optionradiobutton)
    {
        int i = optionradiobutton.b();
        int j = optionradiobutton.getWidth();
        if (i < 0)
        {
            i -= optionradiobutton.getPaddingLeft();
        } else
        if (i + j > getRight())
        {
            i = (i + j + optionradiobutton.getPaddingRight()) - getRight();
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            (new Handler()).post(new Runnable(horizontalscrollview, i) {

                final HorizontalScrollView a;
                final int b;
                final VehicleOptionGroup c;

                public final void run()
                {
                    a.smoothScrollBy(b, 0);
                }

            
            {
                c = VehicleOptionGroup.this;
                a = horizontalscrollview;
                b = i;
                super();
            }
            });
        }
    }

    private void a(List list, List list1)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            OptionRadioButton optionradiobutton = (OptionRadioButton)list.next();
            if (!gki.b(list1, new gka(optionradiobutton) {

        final OptionRadioButton a;
        final VehicleOptionGroup b;

        private boolean a(VehicleView vehicleview)
        {
            return a.a().equals(vehicleview.getId());
        }

        public final boolean apply(Object obj)
        {
            return a((VehicleView)obj);
        }

            
            {
                b = VehicleOptionGroup.this;
                a = optionradiobutton;
                super();
            }
    }))
            {
                mRadioGroup.removeView(optionradiobutton);
            }
        } while (true);
    }

    private OptionRadioButton b(String s)
    {
        return a(c(), s);
    }

    private List c()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < mRadioGroup.getChildCount(); i++)
        {
            arraylist.add((OptionRadioButton)mRadioGroup.getChildAt(i));
        }

        return arraylist;
    }

    final geg a()
    {
        return c;
    }

    final void a(gdx gdx1)
    {
        d.add(gdx1);
    }

    final void a(geg geg1, Map map)
    {
        c = geg1;
        int i = a(geg1.g().size());
        List list = c();
        Iterator iterator = geg1.g().iterator();
        while (iterator.hasNext()) 
        {
            VehicleView vehicleview = (VehicleView)iterator.next();
            String s = vehicleview.getId();
            Object obj = a(list, s);
            OptionRadioButton optionradiobutton = ((OptionRadioButton) (obj));
            if (obj == null)
            {
                optionradiobutton = (OptionRadioButton)inflate(getContext(), 0x7f0301ef, null);
                optionradiobutton.a(s);
                optionradiobutton.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, -1, 1));
                mRadioGroup.addView(optionradiobutton);
            }
            optionradiobutton.setText(vehicleview.getDescription());
            boolean flag;
            if (map != null)
            {
                obj = (DynamicFare)map.get(s);
            } else
            {
                obj = null;
            }
            if (obj != null && ((DynamicFare) (obj)).getMultiplier() > 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            optionradiobutton.a(flag);
            optionradiobutton.setActivated(geg1.c(s));
        }
        a(list, geg1.g());
        if (mRadioGroup.getCheckedRadioButtonId() == -1)
        {
            geg1 = a(c(), geg1.a());
            if (geg1 != null)
            {
                a = true;
                mRadioGroup.check(geg1.getId());
                a = false;
            }
        }
    }

    final void a(String s)
    {
        s = b(s);
        if (s != null)
        {
            a = true;
            mRadioGroup.check(s.getId());
            a = false;
        }
    }

    final String b()
    {
        OptionRadioButton optionradiobutton = (OptionRadioButton)mRadioGroup.findViewById(mRadioGroup.getCheckedRadioButtonId());
        if (optionradiobutton != null)
        {
            return optionradiobutton.a();
        } else
        {
            return null;
        }
    }

    final void b(gdx gdx1)
    {
        d.remove(gdx1);
    }

    protected float getLeftFadingEdgeStrength()
    {
        return 0.5F;
    }

    protected float getRightFadingEdgeStrength()
    {
        return 0.5F;
    }

    public void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        if (!a)
        {
            Object obj = (OptionRadioButton)radiogroup.findViewById(i);
            radiogroup = ((OptionRadioButton) (obj)).a();
            a(this, ((OptionRadioButton) (obj)));
            obj = d.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((gdx)((Iterator) (obj)).next()).a(c.a(), radiogroup);
            }
        }
    }
}
