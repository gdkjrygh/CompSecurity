// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.util.b2;
import com.whatsapp.util.r;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            kf, nt, WebImagePicker, asw, 
//            App, a1g, i2

public class ao1 extends BaseAdapter
{

    final WebImagePicker a;
    private kf b;
    private boolean c;

    public ao1(WebImagePicker webimagepicker, Context context)
    {
        a = webimagepicker;
        super();
    }

    static kf a(ao1 ao1_1, kf kf1)
    {
        ao1_1.b = kf1;
        return kf1;
    }

    private void a()
    {
        if (b != null)
        {
            b.cancel(false);
        }
    }

    static void a(ao1 ao1_1)
    {
        ao1_1.a();
    }

    static void a(ao1 ao1_1, String s)
    {
        ao1_1.a(s);
    }

    private void a(String s)
    {
        if (s != null)
        {
            if (b != null)
            {
                b.cancel(false);
            }
            c = true;
            WebImagePicker.a(a, new nt(s));
            WebImagePicker.h(a).clear();
            WebImagePicker.i(a).a();
            WebImagePicker.a(a, (new r(WebImagePicker.a(a))).a(WebImagePicker.l(a)).a(0x400000L).a(a.getResources().getDrawable(0x7f0205fa)).b(a.getResources().getDrawable(0x7f020537)).a());
        }
        b = new kf(this);
        asw.a(b, new Void[0]);
        if (s != null)
        {
            notifyDataSetChanged();
        }
    }

    static boolean a(ao1 ao1_1, boolean flag)
    {
        ao1_1.c = flag;
        return flag;
    }

    public int getCount()
    {
        int j = ((WebImagePicker.h(a).size() + WebImagePicker.d(a)) - 1) / WebImagePicker.d(a);
        int i;
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return i != getCount() - 1 || !c ? 0 : 1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int i1 = App.am;
        if (getItemViewType(i) != 1) goto _L2; else goto _L1
_L1:
        if (b == null && c)
        {
            a(((String) (null)));
        }
        if (view == null) goto _L4; else goto _L3
_L3:
        viewgroup = view;
_L6:
        return viewgroup;
_L4:
        view = new LinearLayout(a);
        view.setPadding(WebImagePicker.e(a).F, WebImagePicker.e(a).i, WebImagePicker.e(a).i, WebImagePicker.e(a).i);
        view.setClickable(false);
        view.addView(new ProgressBar(App.au, null, 0x1010079));
        view.setGravity(17);
        viewgroup = new TextView(App.au);
        viewgroup.setText(0x7f0e02d9);
        view.addView(viewgroup);
        return view;
_L2:
label0:
        {
label1:
            {
label2:
                {
                    int j;
                    int l;
                    int j1;
                    if (view == null || ((LinearLayout)view).getChildCount() != WebImagePicker.d(a))
                    {
                        view = new LinearLayout(a);
                        view.setPadding(WebImagePicker.e(a).F, WebImagePicker.e(a).i, 0, WebImagePicker.e(a).i);
                        view.setClickable(false);
                    } else
                    {
                        view = (LinearLayout)view;
                    }
                    j1 = view.getChildCount();
                    l = WebImagePicker.d(a) * i;
                    j = 0;
                    i2 i2_1;
                    android.widget.LinearLayout.LayoutParams layoutparams;
                    int k;
                    int k1;
                    for (; l >= (i + 1) * WebImagePicker.d(a); l++)
                    {
                        break label1;
                    }

                    k = j;
                    if (l < WebImagePicker.h(a).size())
                    {
                        i2_1 = (i2)WebImagePicker.h(a).get(l);
                        if (j1 <= j)
                        {
                            viewgroup = new ImageView(a);
                            viewgroup.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                            layoutparams = new android.widget.LinearLayout.LayoutParams(WebImagePicker.l(a), WebImagePicker.l(a));
                            viewgroup.setLayoutParams(layoutparams);
                            layoutparams.rightMargin = (int)WebImagePicker.e(a).j;
                            viewgroup.setBackgroundResource(0x7f02063d);
                            viewgroup.setPadding(WebImagePicker.e(a).p, WebImagePicker.e(a).p, WebImagePicker.e(a).p, WebImagePicker.e(a).p);
                            viewgroup.setOnClickListener(WebImagePicker.f(a));
                            view.addView(viewgroup);
                        } else
                        {
                            viewgroup = (ImageView)view.getChildAt(j);
                            viewgroup.setVisibility(0);
                        }
                        WebImagePicker.i(a).a(i2_1.e, viewgroup);
                        k = j + 1;
                        j = k;
                        if (i1 == 0)
                        {
                            break label2;
                        }
                    }
                    k1 = l - WebImagePicker.d(a) * i;
                    j = k;
                    if (j1 > k1)
                    {
                        ((ImageView)view.getChildAt(k1)).setVisibility(4);
                        j = k;
                    }
                }
                if (i1 == 0)
                {
                    break label0;
                }
            }
            viewgroup = view;
            if (b == null)
            {
                viewgroup = view;
                if (c)
                {
                    viewgroup = view;
                    if (j < WebImagePicker.d(a))
                    {
                        a(((String) (null)));
                        return view;
                    }
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
