// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.notification.p;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c;
import com.whatsapp.util.m;
import com.whatsapp.util.q;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            k0, og, ConversationsFragment, App, 
//            aoz, vl, pd, ao9, 
//            at3, mk, ConversationRowDivider, a1e, 
//            k, iz, au2, a1g

class xe extends BaseAdapter
    implements Filterable
{

    private static final String z[];
    private String a;
    final ConversationsFragment b;
    private Filter c;

    xe(ConversationsFragment conversationsfragment)
    {
        b = conversationsfragment;
        super();
        c = new k0(this, null);
    }

    private int a(og og1, c4 c4_1)
    {
        boolean flag;
        try
        {
            flag = c4_1.y.b;
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            try
            {
                throw og1;
            }
            // Misplaced declaration of an exception variable
            catch (og og1)
            {
                throw og1;
            }
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        c4_1.M;
        JVM INSTR lookupswitch 5: default 101
    //                   0: 101
    //                   4: 74
    //                   5: 77
    //                   8: 80
    //                   13: 80;
           goto _L3 _L3 _L4 _L5 _L6 _L6
_L4:
        return 0x7f0205c8;
_L5:
        return 0x7f0205c4;
_L6:
        return 0x7f0205c3;
_L2:
        int i;
        try
        {
            i = og1.c;
        }
        // Misplaced declaration of an exception variable
        catch (og og1)
        {
            throw og1;
        }
        return i != 0 ? 0x7f0205c9 : 0x7f0205c6;
_L3:
        return 0x7f0205c5;
    }

    static String a(xe xe1)
    {
        return xe1.a;
    }

    static String a(xe xe1, String s)
    {
        xe1.a = s;
        return s;
    }

    public String a(int i)
    {
        return (String)com.whatsapp.ConversationsFragment.a(b).get(i);
    }

    public final void a(Context context, View view, og og1, boolean flag, vl vl1)
    {
        int j = App.am;
        if (!flag) goto _L2; else goto _L1
_L1:
        context = App.ah.t(og1.a);
        vl1.l.setText(ConversationsFragment.j(b).b);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        long l1 = ((c4) (context)).t;
        if (l1 != -2L)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        try
        {
            vl1.l.setTextColor(b.getResources().getColor(0x7f09002c));
            vl1.o.setVisibility(4);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        vl1.l.setTextColor(b.getResources().getColor(0x7f09001d));
        vl1.o.setVisibility(0);
_L68:
        return;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
_L2:
        Object obj;
        Object obj2;
        int i;
        try
        {
            if (TextUtils.isEmpty(og1.a))
            {
                throw new IllegalStateException(z[7]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        Object obj1;
        Object obj3;
        String s;
        int l;
        long l2;
        try
        {
            ConversationsFragment.d(b).a(og1, vl1.g);
            flag = z[8].equals(og1.a);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        if (og1.p())
        {
            break MISSING_BLOCK_LABEL_265;
        }
        flag = App.aq();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        vl1.g.setEnabled(true);
        obj = new at3(og1.a, b.getActivity());
        vl1.h.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        vl1.g.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        try
        {
            vl1.g.setEnabled(false);
            vl1.h.setOnClickListener(null);
            vl1.g.setOnClickListener(null);
            if (!App.aq())
            {
                vl1.h.setClickable(false);
                vl1.g.setClickable(false);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
label0:
        {
label1:
            {
                try
                {
                    vl1.c.setVisibility(0);
                    vl1.f.setVisibility(0);
                    vl1.e.setVisibility(0);
                    vl1.d.setVisibility(0);
                    vl1.n.setVisibility(0);
                    vl1.b.setVisibility(0);
                    vl1.i.setPadding(0, 0, 0, 0);
                    if (!og1.d())
                    {
                        break label1;
                    }
                    flag = TextUtils.isEmpty(og1.n);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    throw context;
                }
                if (flag)
                {
                    obj2 = mk.b(og1.a);
                    if (j == 0)
                    {
                        break label0;
                    }
                }
            }
            obj2 = og1.a(context);
        }
label2:
        {
            obj3 = com.whatsapp.util.c.a(((String) (obj2)), b.getActivity().getBaseContext(), vl1.i.getPaint());
            obj = obj3;
            if (TextUtils.isEmpty(a))
            {
                break label2;
            }
            s = com.whatsapp.util.c.a(((CharSequence) (obj2))).toLowerCase();
            try
            {
                flag = s.startsWith(a.toLowerCase());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            obj1 = obj3;
            if (flag)
            {
                obj1 = obj3;
                if (obj3 == null)
                {
                    obj1 = new SpannableStringBuilder(((CharSequence) (obj2)));
                }
                ((SpannableStringBuilder) (obj1)).setSpan(new ForegroundColorSpan(b.getResources().getColor(0x7f090032)), 0, a.length(), 33);
                obj = obj1;
                if (j == 0)
                {
                    break label2;
                }
            }
            i = s.indexOf((new StringBuilder()).append(" ").append(a.toLowerCase()).toString());
            obj = obj1;
            if (i > 0)
            {
                obj = obj1;
                if (obj1 == null)
                {
                    obj = new SpannableStringBuilder(((CharSequence) (obj2)));
                }
                ((SpannableStringBuilder) (obj)).setSpan(new ForegroundColorSpan(b.getResources().getColor(0x7f090032)), i + 1, i + 1 + a.length(), 33);
            }
        }
        try
        {
            obj1 = vl1.i;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (obj != null)
        {
            obj2 = obj;
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj2)));
        i = og1.c;
        if (i > 0)
        {
            try
            {
                vl1.d.setText(Integer.toString(og1.c));
                vl1.d.setVisibility(0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_734;
            }
        }
        vl1.d.setVisibility(8);
        obj3 = App.ah.t(og1.a);
        obj = "";
        obj1 = "";
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_843;
        }
        i = ((c4) (obj3)).w;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_843;
        }
        l2 = ((c4) (obj3)).t;
        if (l2 == 2L)
        {
            break MISSING_BLOCK_LABEL_805;
        }
        l2 = ((c4) (obj3)).t;
        if (l2 != 3L)
        {
            break MISSING_BLOCK_LABEL_843;
        }
        try
        {
            vl1.i.setTextColor(b.getResources().getColor(0x7f09001d));
            vl1.i.setText(((c4) (obj3)).e());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_864;
        }
        vl1.i.setTextColor(b.getResources().getColor(0x7f09000c));
        vl1.o.setVisibility(8);
        vl1.n.setVisibility(0);
        vl1.b.setVisibility(8);
        if (obj3 == null) goto _L4; else goto _L3
_L3:
        l = ((c4) (obj3)).w;
        if (l != 0) goto _L6; else goto _L5
_L5:
        try
        {
            i = ((c4) (obj3)).M;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (i == 6) goto _L8; else goto _L7
_L7:
        obj = ((c4) (obj3)).e();
        if (j == 0) goto _L9; else goto _L8
_L8:
        try
        {
            l2 = ((c4) (obj3)).t;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        (int)l2;
        JVM INSTR tableswitch 2 3: default 968
    //                   2 2978
    //                   3 2951;
           goto _L10 _L11 _L12
_L10:
        obj = com.whatsapp.ConversationRowDivider.c(((c4) (obj3)));
_L69:
        vl1.n.setVisibility(8);
        if (j == 0) goto _L9; else goto _L6
_L6:
        if (l != 1) goto _L14; else goto _L13
_L13:
        vl1.b.setVisibility(0);
        flag = ((c4) (obj3)).y.b;
        if (flag) goto _L16; else goto _L15
_L15:
        i = og1.c;
        if (i <= 0) goto _L16; else goto _L17
_L17:
        try
        {
            vl1.b.setImageResource(0x7f020116);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (j == 0) goto _L18; else goto _L16
_L16:
        vl1.b.setImageResource(0x7f020115);
_L18:
        if (!TextUtils.isEmpty(((c4) (obj3)).b)) goto _L20; else goto _L19
_L19:
        obj = ConversationsFragment.j(b).c;
        if (j == 0) goto _L9; else goto _L20
_L20:
        obj = ((c4) (obj3)).b;
        if (j == 0) goto _L9; else goto _L14
_L14:
        if (l != 2) goto _L22; else goto _L21
_L21:
        if (((c4) (obj3)).n != 1) goto _L24; else goto _L23
_L23:
        i = ((c4) (obj3)).H;
label3:
        {
            if (i != 0)
            {
                obj1 = DateUtils.formatElapsedTime(((c4) (obj3)).H);
                if (j == 0)
                {
                    break label3;
                }
            }
            obj1 = ConversationsFragment.j(b).a;
        }
        vl1.b.setVisibility(0);
        flag = ((c4) (obj3)).y.b;
        if (!flag) goto _L26; else goto _L25
_L25:
        i = ((c4) (obj3)).M;
        if (i != 8) goto _L28; else goto _L27
_L27:
        vl1.b.setImageResource(0x7f020119);
        obj = obj1;
        if (j == 0) goto _L9; else goto _L28
_L28:
        vl1.b.setImageResource(0x7f020117);
        obj = obj1;
        if (j == 0) goto _L9; else goto _L26
_L26:
        i = ((c4) (obj3)).M;
        if (i == 9) goto _L30; else goto _L29
_L29:
        i = ((c4) (obj3)).M;
        if (i != 10) goto _L31; else goto _L30
_L30:
        try
        {
            vl1.b.setImageResource(0x7f020119);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj = obj1;
        if (j == 0) goto _L9; else goto _L31
_L31:
        vl1.b.setImageResource(0x7f020118);
        obj = obj1;
        if (j == 0) goto _L9; else goto _L24
_L24:
        obj = ConversationsFragment.j(b).g;
        if (j == 0) goto _L9; else goto _L22
_L22:
        if (l != 3) goto _L33; else goto _L32
_L32:
        vl1.b.setVisibility(0);
        vl1.b.setVisibility(0);
        flag = ((c4) (obj3)).y.b;
        if (flag) goto _L35; else goto _L34
_L34:
        i = og1.c;
        if (i <= 0) goto _L35; else goto _L36
_L36:
        try
        {
            vl1.b.setImageResource(0x7f02011b);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (j == 0) goto _L37; else goto _L35
_L35:
        vl1.b.setImageResource(0x7f02011a);
_L37:
        if (!TextUtils.isEmpty(((c4) (obj3)).b)) goto _L39; else goto _L38
_L38:
        obj = ConversationsFragment.j(b).e;
        if (j == 0) goto _L9; else goto _L39
_L39:
        obj = ((c4) (obj3)).b;
        if (j == 0) goto _L9; else goto _L33
_L33:
        if (l != 4) goto _L41; else goto _L40
_L40:
        obj = ConversationsFragment.j(b).j;
        if (j == 0) goto _L9; else goto _L41
_L41:
        if (l != 5) goto _L43; else goto _L42
_L42:
label4:
        {
            obj1 = ConversationsFragment.j(b).i;
            obj = obj1;
            try
            {
                if (((c4) (obj3)).L == null)
                {
                    break label4;
                }
                i = ((c4) (obj3)).L.length();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            obj = obj1;
            if (i <= 0)
            {
                break label4;
            }
            obj2 = ((c4) (obj3)).L.split("\n");
            obj = obj1;
            try
            {
                if (obj2.length <= 0)
                {
                    break label4;
                }
                i = obj2[0].length();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            obj = obj1;
            if (i > 0)
            {
                obj = obj2[0];
            }
        }
        try
        {
            vl1.b.setVisibility(0);
            obj1 = vl1.b;
            i = og1.c;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (i > 0)
        {
            i = 0x7f020573;
        } else
        {
            i = 0x7f020572;
        }
        try
        {
            ((ImageView) (obj1)).setImageResource(i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (j == 0) goto _L9; else goto _L43
_L43:
        if (l != 8) goto _L45; else goto _L44
_L44:
        if (((c4) (obj3)).H != 0) goto _L47; else goto _L46
_L46:
        flag = ((c4) (obj3)).y.b;
        if (flag) goto _L47; else goto _L48
_L48:
        obj = b.getString(0x7f0e00fa);
        if (j == 0) goto _L9; else goto _L47
_L47:
        try
        {
            flag = ((c4) (obj3)).y.b;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (!flag) goto _L50; else goto _L49
_L49:
        obj = b.getString(0x7f0e00fb, new Object[] {
            DateUtils.formatElapsedTime(((c4) (obj3)).H)
        });
        if (j == 0) goto _L9; else goto _L50
_L50:
        obj = b.getString(0x7f0e00f9, new Object[] {
            DateUtils.formatElapsedTime(((c4) (obj3)).H)
        });
        if (j == 0) goto _L9; else goto _L45
_L45:
        obj = b.getString(0x7f0e00ff);
_L9:
        obj1 = (new StringBuilder()).append(q.k(b.getActivity(), com.whatsapp.App.q(((c4) (obj3))))).append(" ").toString();
        i = a(og1, ((c4) (obj3)));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_1846;
        }
        l = ((c4) (obj3)).M;
        if (l != 6) goto _L52; else goto _L51
_L51:
        vl1.n.setImageBitmap(null);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_1855;
        }
_L52:
        try
        {
            vl1.n.setImageDrawable(new m(b.getResources().getDrawable(i)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_1855;
        }
        vl1.n.setImageBitmap(null);
        if (j == 0) goto _L53; else goto _L4
_L4:
        try
        {
            vl1.n.setImageBitmap(null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
_L53:
        obj2 = vl1.k;
        if (obj2 != null)
        {
            try
            {
                obj2 = vl1.k;
                flag = p.b(context, og1.a);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((ImageView) (obj2)).setVisibility(i);
        }
        context = vl1.m;
        if (context != null)
        {
            try
            {
                context = vl1.m;
                flag = a1e.g.b(og1.a);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            context.setVisibility(i);
        }
        context = vl1.a;
        if (context != null)
        {
            try
            {
                context = vl1.a;
                flag = App.ah.y(og1.a);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            context.setVisibility(i);
        }
        try
        {
            vl1.f.setVisibility(8);
            flag = og1.k();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2029;
        }
        flag = og1.d();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_2320;
        }
        flag = TextUtils.isEmpty(((CharSequence) (obj)));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2320;
        }
        i = ((c4) (obj3)).M;
        if (i == 6)
        {
            break MISSING_BLOCK_LABEL_2320;
        }
        context = ((c4) (obj3)).G;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_2279;
        }
        if (!((c4) (obj3)).y.b) goto _L55; else goto _L54
_L54:
        i = ((c4) (obj3)).M;
        if (i != 6)
        {
            break MISSING_BLOCK_LABEL_2279;
        }
_L55:
        obj2 = App.az.e(((c4) (obj3)).G);
        if (!((og) (obj2)).a.contains(App.k())) goto _L57; else goto _L56
_L56:
        context = ConversationsFragment.j(b).f;
        if (j == 0) goto _L58; else goto _L57
_L57:
        context = ((og) (obj2)).z();
_L58:
        try
        {
            flag = App.aR();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        if (!flag) goto _L60; else goto _L59
_L59:
        flag = com.whatsapp.iz.a(context);
        if (flag) goto _L61; else goto _L60
_L60:
        obj2 = context;
        if (App.aR())
        {
            break MISSING_BLOCK_LABEL_2217;
        }
        flag = com.whatsapp.iz.a(context);
        obj2 = context;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2217;
        }
_L61:
        context = (new StringBuilder()).append(context).append(z[3]).toString();
        obj2 = context;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_2242;
        }
        obj2 = context;
        obj2 = (new StringBuilder()).append(z[5]).append(((String) (obj2))).toString();
        vl1.f.setText(com.whatsapp.util.c.c(((String) (obj2)), b.getActivity().getBaseContext()));
        vl1.f.setVisibility(0);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_2320;
        }
        try
        {
            if (!((c4) (obj3)).y.b)
            {
                Log.e((new StringBuilder()).append(z[6]).append(Log.a(((c4) (obj3)))).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        obj3 = null;
        try
        {
            flag = og1.d();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        obj2 = obj3;
        context = ((Context) (obj));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_2410;
        }
        if (!og1.k()) goto _L63; else goto _L62
_L62:
        flag = au2.k;
        obj2 = obj3;
        context = ((Context) (obj));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_2410;
        }
_L63:
        obj3 = og1.w();
        obj2 = obj3;
        context = ((Context) (obj));
        if (obj3 != null)
        {
            vl1.f.setVisibility(8);
            vl1.b.setVisibility(8);
            context = ((Context) (obj3));
            obj2 = obj3;
        }
        i = (int)((float)b.getActivity().getWindow().getDecorView().getWidth() / (3F * b.getResources().getDisplayMetrics().density * b.getResources().getConfiguration().fontScale));
        obj = context;
        if (context.length() > i)
        {
            obj = context.substring(0, i);
        }
        vl1.c.setText(com.whatsapp.util.c.b(((String) (obj)), b.getActivity().getBaseContext(), vl1.c.getPaint()));
        vl1.e.setText(((CharSequence) (obj1)));
        i = og1.c;
        if (i <= 0) goto _L65; else goto _L64
_L64:
        try
        {
            a1g.b(vl1.i);
            vl1.i.setTextColor(0xff252525);
            a1g.b(vl1.c);
            vl1.c.setTextColor(0xff252525);
            a1g.b(vl1.f);
            vl1.f.setTextColor(0xff252525);
            vl1.e.setTextColor(0xff252525);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (j == 0) goto _L66; else goto _L65
_L65:
        a1g.b(vl1.i);
        vl1.i.setTextColor(0xff252525);
        com.whatsapp.a1g.a(vl1.c);
        vl1.c.setTextColor(0xff666666);
        com.whatsapp.a1g.a(vl1.f);
        vl1.f.setTextColor(0xff666666);
        vl1.e.setTextColor(0xff989898);
_L66:
        if (obj2 != null)
        {
            try
            {
                vl1.n.setVisibility(8);
                a1g.b(vl1.c);
                vl1.c.setTextColor(b.getResources().getColor(0x7f090018));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        try
        {
            if (z[4].equals(og1.a))
            {
                vl1.c.setVisibility(8);
                vl1.f.setVisibility(8);
                vl1.e.setVisibility(8);
                vl1.d.setVisibility(8);
                vl1.n.setVisibility(8);
                vl1.b.setVisibility(8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        if (ConversationsFragment.g(b) == null) goto _L68; else goto _L67
_L67:
        flag = ConversationsFragment.g(b).equals(og1.a);
        if (flag)
        {
            com.whatsapp.ConversationsFragment.a(b, null);
            context = new AnimationSet(true);
            og1 = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
            vl1 = new AlphaAnimation(0.0F, 1.0F);
            context.addAnimation(og1);
            context.addAnimation(vl1);
            context.setDuration(300L);
            view.startAnimation(context);
            return;
        }
          goto _L68
        context;
        throw context;
        context;
        throw context;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
_L12:
        obj = ConversationsFragment.j(b).d;
        vl1.o.setVisibility(8);
        if (j == 0) goto _L69; else goto _L11
_L11:
        obj = ConversationsFragment.j(b).h;
        vl1.o.setVisibility(0);
        if (j == 0) goto _L69; else goto _L10
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        throw context;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
        context;
        throw context;
          goto _L68
    }

    public int getCount()
    {
        return com.whatsapp.ConversationsFragment.a(b).size();
    }

    public Filter getFilter()
    {
        return c;
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)((String)com.whatsapp.ConversationsFragment.a(b).get(i)).hashCode();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        og og2;
        boolean flag;
        int j;
        boolean flag1;
        flag = true;
        j = App.am;
        String s = a(i);
        og og1 = App.az.f(s);
        og2 = og1;
        if (og1 == null)
        {
            og2 = new og(s);
        }
        flag1 = og2.a.contains(z[0]);
        if (view != null) goto _L2; else goto _L1
_L1:
        if (j == 0) goto _L4; else goto _L3
_L3:
        i = 1;
_L13:
        Object obj;
        obj = (vl)view.getTag();
        LayoutInflater layoutinflater;
        if (flag1 != ((vl) (obj)).j.contains(z[1]))
        {
            if (j != 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 1;
                view = null;
            }
        }
_L11:
        if (i == 0) goto _L6; else goto _L5
_L5:
        layoutinflater = (LayoutInflater)b.getActivity().getSystemService(z[2]);
        view = new vl();
        if (!flag1) goto _L8; else goto _L7
_L7:
        obj = com.whatsapp.iz.a(layoutinflater, 0x7f030056, viewgroup, false);
        view.l = (TextView)((View) (obj)).findViewById(0x7f0b019b);
        view.o = ((View) (obj)).findViewById(0x7f0b019c);
        if (j == 0) goto _L9; else goto _L8
_L8:
        obj = com.whatsapp.iz.a(layoutinflater, 0x7f030057, viewgroup, false);
        view.i = (TextView)((View) (obj)).findViewById(0x7f0b019e);
        view.o = ((View) (obj)).findViewById(0x7f0b019c);
        view.g = (ImageView)((View) (obj)).findViewById(0x7f0b00ce);
        view.h = ((View) (obj)).findViewById(0x7f0b00dc);
        view.c = (TextView)((View) (obj)).findViewById(0x7f0b01a3);
        view.f = (TextView)((View) (obj)).findViewById(0x7f0b01a1);
        view.d = (TextView)((View) (obj)).findViewById(0x7f0b01a7);
        view.n = (ImageView)((View) (obj)).findViewById(0x7f0b01a0);
        view.b = (ImageView)((View) (obj)).findViewById(0x7f0b01a2);
        view.k = (ImageView)((View) (obj)).findViewById(0x7f0b01a4);
        view.m = (ImageView)((View) (obj)).findViewById(0x7f0b01a5);
        view.a = ((View) (obj)).findViewById(0x7f0b01a6);
        view.e = (TextView)((View) (obj)).findViewById(0x7f0b019f);
        viewgroup = view;
        view = ((View) (obj));
_L10:
        viewgroup.j = og2.a;
        view.setTag(viewgroup);
        a(b.getActivity(), view, og2, flag1, viewgroup);
        return view;
_L9:
        viewgroup = view;
        view = ((View) (obj));
        continue; /* Loop/switch isn't completed */
_L6:
        viewgroup = ((ViewGroup) (obj));
        if (true) goto _L10; else goto _L4
_L4:
        i = 1;
        obj = null;
        view = null;
        if (true) goto _L11; else goto _L2
_L2:
        i = 0;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        boolean flag1 = false;
        boolean flag2 = super.isEmpty();
        boolean flag;
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        int i = com.whatsapp.ConversationsFragment.c(b);
        if (i != 0)
        {
            IllegalStateException illegalstateexception;
            boolean flag3;
            try
            {
                flag3 = TextUtils.isEmpty(a);
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            flag = flag1;
            if (flag3)
            {
                break MISSING_BLOCK_LABEL_48;
            }
        }
        flag = true;
        return flag;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = "\021YMG-)EMF4\025NbF8\033[";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\021YMG-)EMF4\025NbF8\033[";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\032J[](\002tK\\;\032JVW/";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "L\013";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\024YMS9\025JQF";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "V\021";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\025DLD8\004XCF4\031EQm/\031\\\r_4\005XK\\:)YOF\002\005YA\b";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\034BF\0220\003XV\0223\031_\002P8VNOB)\017";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\024YMS9\025JQF";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 93;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 118;
          goto _L9
_L5:
        byte1 = 43;
          goto _L9
_L6:
        byte1 = 34;
          goto _L9
        byte1 = 50;
          goto _L9
    }
}
