// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class fhs extends BaseAdapter
{

    private static final Map a;
    private static final List b = (new gkf()).a("com.google.android.apps.plus").a("com.google.android.gm").a("com.google.android.talk").a("com.facebook.katana").a("com.twitter.android").a("com.android.mms").a("com.facebook.orca").a("com.whatsapp").a();
    private static final Map c;
    private int d;
    private LayoutInflater e;
    private PackageManager f;
    private List g;
    private List h;

    public fhs(Context context, String s, String s1, String s2)
    {
        e = LayoutInflater.from(context);
        Integer integer = (Integer)a.get(dcg.a(s2));
        if (integer != null)
        {
            d = integer.intValue();
        } else
        {
            d = 6;
        }
        f = context.getPackageManager();
        context = new Intent("android.intent.action.SEND");
        context.setType("text/plain");
        context = f.queryIntentActivities(context, 0);
        Collections.sort(context, new fht(f, s2));
        h = gkk.a(gki.a(context, new gjv(s, s1) {

            final String a;
            final String b;
            final fhs c;

            private LabeledIntent a(ResolveInfo resolveinfo)
            {
                ActivityInfo activityinfo = resolveinfo.activityInfo;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", a);
                intent.putExtra("android.intent.extra.TEXT", cxf.b(b));
                intent.setComponent(new ComponentName(activityinfo.packageName, activityinfo.name));
                return new LabeledIntent(intent, activityinfo.packageName, activityinfo.loadLabel(fhs.a(c)), resolveinfo.getIconResource());
            }

            public final Object apply(Object obj)
            {
                return a((ResolveInfo)obj);
            }

            
            {
                c = fhs.this;
                a = s;
                b = s1;
                super();
            }
        }));
        g = h.subList(0, Math.min(h.size(), a()));
        notifyDataSetChanged();
    }

    private LabeledIntent a(int i)
    {
        return (LabeledIntent)g.get(i);
    }

    static PackageManager a(fhs fhs1)
    {
        return fhs1.f;
    }

    static List d()
    {
        return b;
    }

    static Map e()
    {
        return c;
    }

    public final int a()
    {
        return d;
    }

    public final void a(LabeledIntent labeledintent)
    {
        if (labeledintent != null && h.size() > 1)
        {
            h.add(1, labeledintent);
            g = h.subList(0, Math.min(h.size(), a()));
            notifyDataSetChanged();
        }
    }

    public final void b()
    {
        g = h;
        notifyDataSetChanged();
    }

    public final int c()
    {
        return h.size();
    }

    public final int getCount()
    {
        return g.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = e.inflate(0x7f030087, viewgroup, false);
        }
        view = a(i);
        ((ImageView)view1.findViewById(0x7f0e0172)).setImageDrawable(view.loadIcon(f));
        ((TextView)view1.findViewById(0x7f0e0173)).setText(view.loadLabel(f));
        return view1;
    }

    static 
    {
        a = (new gkh()).a(dcg.b, Integer.valueOf(3)).a();
        c = (new gkh()).a(dcg.b, (new gkf()).a("com.tencent.mm").a("com.sina.weibo").a()).a(dcg.d, (new gkf()).a("jp.naver.line.android").a()).a(dcg.f, (new gkf()).a("jp.naver.line.android").a()).a(dcg.e, (new gkf()).a("com.kakao.talk").a()).a(dcg.c, (new gkf()).a("com.whatsapp").a()).a();
    }
}
