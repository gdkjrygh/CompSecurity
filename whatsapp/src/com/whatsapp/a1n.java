// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.c;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            MessageDetailsActivity, App, ub, a1g, 
//            u3, abl, k, ao9, 
//            og, av, iz, fx

class a1n extends BaseAdapter
{

    final MessageDetailsActivity a;
    private final int b;
    private View c;
    private int d;
    private String e;

    public a1n(MessageDetailsActivity messagedetailsactivity)
    {
        a = messagedetailsactivity;
        super();
        b = messagedetailsactivity.getResources().getInteger(0x10e0001);
    }

    static int a(a1n a1n1)
    {
        return a1n1.d;
    }

    static int a(a1n a1n1, int i)
    {
        a1n1.d = i;
        return i;
    }

    static View a(a1n a1n1, View view)
    {
        a1n1.c = view;
        return view;
    }

    private Animation a(float f)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(b);
        alphaanimation.setStartOffset((long)((float)b * f));
        return alphaanimation;
    }

    static String a(a1n a1n1, String s)
    {
        a1n1.e = s;
        return s;
    }

    private void a(int i, View view)
    {
        ub ub1;
        Object obj;
        int l;
        l = App.am;
        ub1 = (ub)MessageDetailsActivity.b(a).get(i);
        obj = view.findViewById(0x7f0b023b);
        if (i != 0 && ub1.a() == ((ub)MessageDetailsActivity.b(a).get(i - 1)).a()) goto _L2; else goto _L1
_L1:
        Object obj1;
        TextView textview;
        ((View) (obj)).setVisibility(0);
        obj1 = (TextView)view.findViewById(0x7f0b023c);
        textview = (TextView)view.findViewById(0x7f0b023d);
        a1g.a(((TextView) (obj1)));
        ub1.a();
        JVM INSTR lookupswitch 3: default 128
    //                   5: 803
    //                   8: 866
    //                   13: 825;
           goto _L3 _L4 _L5 _L6
_L3:
        if (l == 0) goto _L7; else goto _L2
_L2:
        ((View) (obj)).setVisibility(8);
_L7:
        obj = view.findViewById(0x7f0b00d7);
        obj1 = view.findViewById(0x7f0b0115);
        if (i != MessageDetailsActivity.b(a).size() - 1 && ub1.a() == ((ub)MessageDetailsActivity.b(a).get(i + 1)).a()) goto _L9; else goto _L8
_L8:
        ((View) (obj1)).setBackgroundResource(0x7f0205de);
        ((View) (obj)).setVisibility(8);
        if (l == 0) goto _L10; else goto _L9
_L9:
        ((View) (obj1)).setBackgroundResource(0x7f0205e0);
        ((View) (obj)).setVisibility(0);
_L10:
        TextView textview1;
        View view1;
        View view2;
        View view3;
        TextView textview2;
        TextView textview3;
        TextView textview4;
        View view4;
        View view5;
        View view6;
        obj = (ImageView)view.findViewById(0x7f0b00ce);
        obj1 = (TextView)view.findViewById(0x7f0b00b6);
        textview = (TextView)view.findViewById(0x7f0b01ec);
        textview1 = (TextView)view.findViewById(0x7f0b023e);
        view1 = view.findViewById(0x7f0b0244);
        view2 = view.findViewById(0x7f0b0242);
        view3 = view.findViewById(0x7f0b0240);
        textview2 = (TextView)view.findViewById(0x7f0b0239);
        textview3 = (TextView)view.findViewById(0x7f0b0238);
        textview4 = (TextView)view.findViewById(0x7f0b0236);
        view4 = view.findViewById(0x7f0b0245);
        view5 = view.findViewById(0x7f0b0243);
        view6 = view.findViewById(0x7f0b0241);
        view1.setVisibility(8);
        view2.setVisibility(8);
        view3.setVisibility(8);
        view4.setVisibility(8);
        view5.setVisibility(8);
        view6.setVisibility(8);
        if (!(ub1 instanceof u3)) goto _L12; else goto _L11
_L11:
        textview1.setVisibility(0);
        ((ImageView) (obj)).setVisibility(8);
        ((TextView) (obj1)).setVisibility(8);
        textview.setVisibility(8);
        u3 u3_1 = (u3)ub1;
        textview1.setText(String.format(App.j.a(0x7f0d0026, u3_1.c), new Object[] {
            Integer.valueOf(u3_1.c)
        }));
        if (l == 0) goto _L13; else goto _L12
_L12:
        og og1;
        og1 = App.az.e(ub1.a);
        textview1.setVisibility(8);
        ((ImageView) (obj)).setVisibility(0);
        MessageDetailsActivity.g(a).a(og1, ((ImageView) (obj)));
        ((TextView) (obj1)).setVisibility(0);
        ((TextView) (obj1)).setText(og1.a(a));
        if (!og1.l() || TextUtils.isEmpty(og1.N)) goto _L15; else goto _L14
_L14:
        textview.setVisibility(0);
        textview.setText(com.whatsapp.util.c.b((new StringBuilder()).append("~").append(og1.N).toString(), a.getBaseContext(), textview.getPaint()));
        if (l == 0) goto _L16; else goto _L15
_L15:
        textview.setVisibility(8);
_L16:
        if (!og1.a.equals(e)) goto _L18; else goto _L17
_L17:
        if (ub1.a(5) > 0L)
        {
            textview2.setText(MessageDetailsActivity.a(a, ub1.a(5)));
            view1.setVisibility(0);
            view4.setVisibility(0);
        }
        if (ub1.a(13) > 0L)
        {
            textview3.setText(MessageDetailsActivity.a(a, ub1.a(13)));
            view2.setVisibility(0);
            view5.setVisibility(0);
        }
        if (ub1.a(8) <= 0L) goto _L20; else goto _L19
_L19:
        textview4.setText(MessageDetailsActivity.a(a, ub1.a(8)));
        view3.setVisibility(0);
        view6.setVisibility(0);
        if (l == 0) goto _L20; else goto _L18
_L18:
        ub1.a();
        JVM INSTR lookupswitch 3: default 796
    //                   5: 896
    //                   8: 953
    //                   13: 924;
           goto _L20 _L21 _L22 _L23
_L20:
        view.setTag(og1);
_L13:
        return;
_L4:
        ((TextView) (obj1)).setText(0x7f0e0253);
        textview.setCompoundDrawablesWithIntrinsicBounds(0x7f0205c4, 0, 0, 0);
        if (l == 0) goto _L3; else goto _L6
_L6:
        int j;
        if (MessageDetailsActivity.h(a).w == 0)
        {
            j = 0x7f0e025a;
        } else
        {
            j = 0x7f0e025c;
        }
        ((TextView) (obj1)).setText(j);
        textview.setCompoundDrawablesWithIntrinsicBounds(0x7f0205c3, 0, 0, 0);
        if (l == 0) goto _L3; else goto _L5
_L5:
        ((TextView) (obj1)).setText(0x7f0e0258);
        textview.setCompoundDrawablesWithIntrinsicBounds(0x7f020119, 0, 0, 0);
          goto _L3
_L21:
        textview2.setText(MessageDetailsActivity.a(a, ub1.a(5)));
        view1.setVisibility(0);
        if (l == 0) goto _L20; else goto _L23
_L23:
        textview3.setText(MessageDetailsActivity.a(a, ub1.a(13)));
        view2.setVisibility(0);
        if (l == 0) goto _L20; else goto _L22
_L22:
        textview4.setText(MessageDetailsActivity.a(a, ub1.a(8)));
        view3.setVisibility(0);
          goto _L20
    }

    private void a(int i, View view, boolean flag)
    {
        ub ub1;
        Object obj1;
        Object obj2;
        TextView textview;
        View view1;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        TextView textview1;
        int j;
        j = App.am;
        ub1 = (ub)MessageDetailsActivity.b(a).get(i);
        textview1 = (TextView)view.findViewById(0x7f0b0239);
        textview = (TextView)view.findViewById(0x7f0b0238);
        obj1 = (TextView)view.findViewById(0x7f0b0236);
        view1 = view.findViewById(0x7f0b0245);
        view2 = view.findViewById(0x7f0b0243);
        view3 = view.findViewById(0x7f0b0241);
        view4 = view.findViewById(0x7f0b0244);
        view5 = view.findViewById(0x7f0b0242);
        view6 = view.findViewById(0x7f0b0240);
        obj2 = new ArrayList(6);
        ub1.a();
        JVM INSTR lookupswitch 3: default 152
    //                   5: 293
    //                   8: 461
    //                   13: 369;
           goto _L1 _L2 _L3 _L4
_L1:
        obj1 = ((ArrayList) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            obj2 = (View)((Iterator) (obj1)).next();
            Object obj;
            if (flag)
            {
                obj = b(0.0F);
            } else
            {
                obj = a(0.0F);
            }
            ((View) (obj2)).startAnimation(((Animation) (obj)));
        } while (j == 0);
        obj = view.findViewById(0x7f0b023f);
        j = ((View) (obj)).getHeight();
        a(i, view);
        ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(((View) (obj)).getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        i = ((View) (obj)).getMeasuredHeight();
        ((View) (obj)).getLayoutParams().height = j;
        view = new av(this, ((View) (obj)), j, i);
        view.setDuration(b);
        ((View) (obj)).startAnimation(view);
        return;
_L2:
        ((ArrayList) (obj2)).add(view1);
        if (!App.aR()) goto _L1; else goto _L5
_L5:
        if (flag)
        {
            obj = new TranslateAnimation(textview1.getWidth() - view4.getWidth(), 0.0F, 0.0F, 0.0F);
        } else
        {
            obj = new TranslateAnimation(view1.getWidth(), 0.0F, 0.0F, 0.0F);
        }
        ((Animation) (obj)).setDuration(b);
        ((Animation) (obj)).setInterpolator(new DecelerateInterpolator());
        textview1.startAnimation(((Animation) (obj)));
        if (j == 0) goto _L1; else goto _L4
_L4:
        ((ArrayList) (obj2)).add(view2);
        ((ArrayList) (obj2)).add(view4);
        ((ArrayList) (obj2)).add(view1);
        if (!App.aR()) goto _L1; else goto _L6
_L6:
        if (flag)
        {
            obj = new TranslateAnimation(textview.getWidth() - view5.getWidth(), 0.0F, 0.0F, 0.0F);
        } else
        {
            obj = new TranslateAnimation(view2.getWidth(), 0.0F, 0.0F, 0.0F);
        }
        ((Animation) (obj)).setDuration(b);
        ((Animation) (obj)).setInterpolator(new DecelerateInterpolator());
        textview.startAnimation(((Animation) (obj)));
        if (j == 0) goto _L1; else goto _L3
_L3:
        ((ArrayList) (obj2)).add(view3);
        ((ArrayList) (obj2)).add(view5);
        ((ArrayList) (obj2)).add(view2);
        ((ArrayList) (obj2)).add(view4);
        ((ArrayList) (obj2)).add(view1);
        if (App.aR())
        {
            if (flag)
            {
                obj = new TranslateAnimation(((TextView) (obj1)).getWidth() - view6.getWidth(), 0.0F, 0.0F, 0.0F);
            } else
            {
                obj = new TranslateAnimation(view3.getWidth(), 0.0F, 0.0F, 0.0F);
            }
            ((Animation) (obj)).setDuration(b);
            ((Animation) (obj)).setInterpolator(new DecelerateInterpolator());
            ((TextView) (obj1)).startAnimation(((Animation) (obj)));
        }
          goto _L1
    }

    static void a(a1n a1n1, int i, View view, boolean flag)
    {
        a1n1.a(i, view, flag);
    }

    private Animation b(float f)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(b);
        alphaanimation.setStartOffset((long)((float)b * f));
        return alphaanimation;
    }

    static String b(a1n a1n1)
    {
        return a1n1.e;
    }

    static View c(a1n a1n1)
    {
        return a1n1.c;
    }

    public int getCount()
    {
        return MessageDetailsActivity.b(a).size();
    }

    public Object getItem(int i)
    {
        return MessageDetailsActivity.b(a).get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = iz.a(a.getLayoutInflater(), 0x7f030086, viewgroup, false);
            if (App.am != 0)
            {
                view1 = view;
            }
        }
        a(i, view1);
        view1.setOnClickListener(new fx(this, i));
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
