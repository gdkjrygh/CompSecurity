// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

// Referenced classes of package com.whatsapp:
//            afn, f8, App, nw

class _p extends BaseAdapter
{

    final afn a;
    private Context b;
    private int c;

    public _p(afn afn1, Context context, int i)
    {
        a = afn1;
        super();
        b = context;
        c = i;
    }

    public int getCount()
    {
        if (afn.i(a) == 0)
        {
            return 0;
        } else
        {
            return ((afn.d()[c].a() + afn.i(a)) - 1) / afn.i(a);
        }
    }

    public Object getItem(int i)
    {
        return null;
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int l;
label0:
        {
            l = App.am;
            if (view != null && ((LinearLayout)view).getChildCount() == afn.i(a))
            {
                break MISSING_BLOCK_LABEL_250;
            }
            viewgroup = new EmojiPicker.EmojiAdapter._cls1(this, afn.b(a));
            int j = 0;
            do
            {
                view = viewgroup;
                if (j >= afn.i(a))
                {
                    break label0;
                }
                view = new EmojiPicker.EmojiImageView(a, b);
                view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(afn.a(a), afn.h(a)));
                viewgroup.addView(view);
                j++;
            } while (l == 0);
            view = viewgroup;
        }
_L1:
label1:
        {
label2:
            {
                int i1;
                for (int k = 0; k >= afn.i(a); k++)
                {
                    break label1;
                }

                viewgroup = (EmojiPicker.EmojiImageView)view.getChildAt(k);
                i1 = afn.i(a) * i + k;
                if (i1 < afn.d()[c].a())
                {
                    viewgroup.setEmojiCode(afn.d()[c].a(i1));
                    viewgroup.setBackgroundDrawable(new nw(null));
                    viewgroup.setClickable(true);
                    viewgroup.setOnClickListener(afn.j(a));
                    if (l == 0)
                    {
                        break label2;
                    }
                }
                viewgroup.setEmojiCode(0);
                viewgroup.setBackgroundDrawable(null);
                viewgroup.setClickable(false);
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_258;
            }
        }
        view.setClickable(false);
        return view;
        view = (LinearLayout)view;
          goto _L1
    }
}
