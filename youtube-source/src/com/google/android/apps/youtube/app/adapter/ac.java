// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.datalib.legacy.model.Event;
import com.google.android.youtube.g;
import com.google.android.youtube.j;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, aa, ai, ab

final class ac
    implements ae
{

    final aa a;
    private final View b;
    private final TextView c;
    private final ae d;
    private final SpannableStringBuilder e;
    private final StyleSpan f;

    private ac(aa aa1, View view, ViewGroup viewgroup)
    {
        a = aa1;
        super();
        b = view.findViewById(j.aY);
        c = (TextView)b.findViewById(j.fw);
        d = aa.a(aa1).a(b, viewgroup);
        e = new SpannableStringBuilder();
        f = new StyleSpan(1);
    }

    ac(aa aa1, View view, ViewGroup viewgroup, byte byte0)
    {
        this(aa1, view, viewgroup);
    }

    public final View a(int i, Object obj)
    {
        String s;
        Object obj1;
        Event event;
        TextView textview;
        obj1 = null;
        event = (Event)obj;
        textview = c;
        e.clear();
        s = event.subject;
        ab.a[event.action.ordinal()];
        JVM INSTR tableswitch 1 10: default 96
    //                   1 233
    //                   2 250
    //                   3 267
    //                   4 284
    //                   5 301
    //                   6 318
    //                   7 335
    //                   8 352
    //                   9 369
    //                   10 386;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_386;
_L1:
        obj = obj1;
_L12:
        int k = ((String) (obj)).indexOf("%1$s");
        if (k != -1 && s != null)
        {
            obj = ((String) (obj)).replace("%1$s", s);
            int l = s.length();
            e.append(((CharSequence) (obj)));
            e.setSpan(f, k, l + k, 33);
        } else
        {
            e.append(((CharSequence) (obj)));
        }
        textview.setText(e);
        d.a(i, event.targetVideo);
        i = aa.b(a).getDimensionPixelSize(g.P);
        b.setPadding(b.getPaddingLeft(), i, b.getPaddingRight(), b.getPaddingBottom());
        return b;
_L2:
        obj = aa.b(a).getString(p.bD);
          goto _L12
_L3:
        obj = aa.b(a).getString(p.bE);
          goto _L12
_L4:
        obj = aa.b(a).getString(p.bJ);
          goto _L12
_L5:
        obj = aa.b(a).getString(p.bL);
          goto _L12
_L6:
        obj = aa.b(a).getString(p.bI);
          goto _L12
_L7:
        obj = aa.b(a).getString(p.bH);
          goto _L12
_L8:
        obj = aa.b(a).getString(p.bM);
          goto _L12
_L9:
        obj = aa.b(a).getString(p.bG);
          goto _L12
_L10:
        obj = aa.b(a).getString(p.bF);
          goto _L12
        obj = aa.b(a).getString(p.bK);
        s = null;
          goto _L12
    }
}
