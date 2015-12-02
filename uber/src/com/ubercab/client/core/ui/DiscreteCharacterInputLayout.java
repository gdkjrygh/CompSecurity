// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import cwz;
import dsk;
import hoq;
import hpb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class DiscreteCharacterInputLayout extends LinearLayout
{

    private int a;
    private String b;
    private List c;
    private List d;
    private Map e;
    private Handler f;
    private SparseArray g;
    private List h;

    public DiscreteCharacterInputLayout(Context context)
    {
        super(context);
        f = new Handler();
        g = new SparseArray();
        h = new CopyOnWriteArrayList();
    }

    public DiscreteCharacterInputLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new Handler();
        g = new SparseArray();
        h = new CopyOnWriteArrayList();
    }

    public DiscreteCharacterInputLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = new Handler();
        g = new SparseArray();
        h = new CopyOnWriteArrayList();
    }

    static int a(DiscreteCharacterInputLayout discretecharacterinputlayout)
    {
        return discretecharacterinputlayout.a;
    }

    private void a()
    {
        d = new ArrayList();
        c = new ArrayList();
        char ac[] = b.toCharArray();
        int i = 0;
        while (i < ac.length) 
        {
            char c1 = ac[i];
            if (e.containsKey(Character.valueOf(c1)))
            {
                g.append(i, Character.valueOf(c1));
                a(((Integer)e.get(Character.valueOf(c1))).intValue());
            } else
            {
                a(String.valueOf(c1));
            }
            i++;
        }
        b(0);
        cwz.a(getContext());
    }

    private void a(int i)
    {
        ImageView imageview = new ImageView(getContext());
        imageview.setImageResource(i);
        imageview.setBaselineAlignBottom(true);
        i = getResources().getDimensionPixelSize(0x7f080235);
        imageview.setPadding(i, 0, i, 0);
        addView(imageview);
        c.add(imageview);
    }

    static void a(DiscreteCharacterInputLayout discretecharacterinputlayout, int i)
    {
        discretecharacterinputlayout.b(i);
    }

    private void a(String s)
    {
        EditText edittext = new EditText(getContext());
        edittext.setHintTextColor(getResources().getColor(0x7f0d0085));
        edittext.setTextColor(getResources().getColor(0x7f0d0073));
        edittext.setTypeface(hoq.a(getContext(), 0x7f070695));
        edittext.setTextSize(0, getResources().getDimensionPixelSize(0x7f08024a));
        edittext.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(1)
        });
        edittext.setInputType(2);
        edittext.addTextChangedListener(new hpb() {

            final DiscreteCharacterInputLayout a;

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                if (charsequence.length() == 1) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if (DiscreteCharacterInputLayout.a(a) < DiscreteCharacterInputLayout.b(a).size() - 1)
                {
                    DiscreteCharacterInputLayout.a(a, DiscreteCharacterInputLayout.a(a) + 1);
                    return;
                }
                switch (DiscreteCharacterInputLayout.c(a))
                {
                default:
                    return;

                case 0: // '\0'
                    charsequence = DiscreteCharacterInputLayout.d(a).iterator();
                    while (charsequence.hasNext()) 
                    {
                        ((dsk)charsequence.next()).i_();
                    }
                    break;

                case 1: // '\001'
                    DiscreteCharacterInputLayout.f(a).postDelayed(new Runnable(this) {

                        final _cls1 a;

                        public final void run()
                        {
                            DiscreteCharacterInputLayout.e(a.a);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    }, 500L);
                    charsequence = DiscreteCharacterInputLayout.d(a).iterator();
                    break; /* Loop/switch isn't completed */
                }
                if (true) goto _L1; else goto _L3
_L3:
                while (charsequence.hasNext()) 
                {
                    ((dsk)charsequence.next()).h_();
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                a = DiscreteCharacterInputLayout.this;
                super();
            }
        });
        edittext.setOnKeyListener(new android.view.View.OnKeyListener() {

            final DiscreteCharacterInputLayout a;

            public final boolean onKey(View view, int i, KeyEvent keyevent)
            {
                view = ((EditText)DiscreteCharacterInputLayout.b(a).get(DiscreteCharacterInputLayout.a(a))).getText();
                if (keyevent.getAction() == 0 && i == 67 && DiscreteCharacterInputLayout.a(a) > 0 && view.length() == 0)
                {
                    DiscreteCharacterInputLayout.a(a, DiscreteCharacterInputLayout.a(a) - 1);
                    ((EditText)DiscreteCharacterInputLayout.b(a).get(DiscreteCharacterInputLayout.a(a))).setText("");
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = DiscreteCharacterInputLayout.this;
                super();
            }
        });
        if (s != null)
        {
            edittext.setHint(s);
        }
        addView(edittext);
        d.add(edittext);
    }

    static List b(DiscreteCharacterInputLayout discretecharacterinputlayout)
    {
        return discretecharacterinputlayout.d;
    }

    private void b()
    {
        if (d == null || d.isEmpty())
        {
            return;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((EditText)iterator.next()).setText("")) { }
        b(0);
    }

    private void b(int i)
    {
        int j = 0;
        while (j < d.size()) 
        {
            EditText edittext = (EditText)d.get(j);
            if (i == j)
            {
                edittext.setFocusableInTouchMode(true);
                edittext.requestFocus();
            } else
            {
                edittext.clearFocus();
                edittext.setFocusableInTouchMode(false);
            }
            j++;
        }
        a = i;
    }

    private int c()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        int j = 0;
        while (j < b.length() && i < d.size()) 
        {
            if (g.get(j) != null)
            {
                stringbuilder.append(g.get(j));
            } else
            {
                stringbuilder.append(((EditText)d.get(i)).getText());
                i++;
            }
            j++;
        }
        return !stringbuilder.toString().equals(b) ? 1 : 0;
    }

    static int c(DiscreteCharacterInputLayout discretecharacterinputlayout)
    {
        return discretecharacterinputlayout.c();
    }

    static List d(DiscreteCharacterInputLayout discretecharacterinputlayout)
    {
        return discretecharacterinputlayout.h;
    }

    static void e(DiscreteCharacterInputLayout discretecharacterinputlayout)
    {
        discretecharacterinputlayout.b();
    }

    static Handler f(DiscreteCharacterInputLayout discretecharacterinputlayout)
    {
        return discretecharacterinputlayout.f;
    }

    public final void a(dsk dsk)
    {
        h.add(dsk);
    }

    public final void a(String s, Map map)
    {
        if (s != null)
        {
            b = s;
            e = map;
        }
        a();
    }

    public final void b(dsk dsk)
    {
        h.remove(dsk);
    }
}
