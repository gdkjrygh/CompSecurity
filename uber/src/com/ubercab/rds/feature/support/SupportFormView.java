// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.support;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ubercab.rds.core.model.SupportFormComponent;
import com.ubercab.rds.core.model.SupportNode;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import hbk;
import hbm;
import hcr;
import hfz;
import hgr;
import hgs;
import hgt;
import hgu;
import hha;
import hhc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class SupportFormView extends RelativeLayout
    implements hgt
{

    Button a;
    LinearLayout b;
    TextView c;
    TextView d;
    private final List e;
    private List f;

    public SupportFormView(Context context)
    {
        this(context, null);
    }

    public SupportFormView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SupportFormView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = new CopyOnWriteArrayList();
        f = new ArrayList();
    }

    static void a(SupportFormView supportformview)
    {
        supportformview.c();
    }

    private void c()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((hgs)iterator.next()).d()) { }
        a.setEnabled(false);
        for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); ((hfz)iterator1.next()).f()) { }
    }

    private void d()
    {
        a.setEnabled(e());
    }

    private boolean e()
    {
        Iterator iterator = f.iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((hgs)iterator.next()).a())
            {
                flag = false;
            }
        } while (true);
        return flag;
    }

    private LinearLayout f()
    {
        return (LinearLayout)LayoutInflater.from(getContext()).inflate(hbm.ub__support_form_half_width_container, b, false);
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (hgs)iterator.next();
            String s = ((hgs) (obj)).e().getFormKeyId();
            obj = ((hgs) (obj)).b();
            if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(((CharSequence) (obj))))
            {
                hashmap.put(s, obj);
            }
        } while (true);
        return hashmap;
    }

    public final void a(SupportNode supportnode)
    {
        Object obj;
        Iterator iterator;
        if (supportnode == null || b.getChildCount() != 0)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        obj = supportnode.getComponents();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        iterator = ((List) (obj)).iterator();
        obj = null;
_L12:
        Object obj1;
        SupportFormComponent supportformcomponent;
        byte byte0;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        supportformcomponent = (SupportFormComponent)iterator.next();
        obj1 = supportformcomponent.getType();
        byte0 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 2: default 96
    //                   -1221270899: 198
    //                   3029410: 213;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 120
    //                   0 228
    //                   1 248;
           goto _L4 _L5 _L6
_L4:
        obj1 = obj;
        hgs hgs1 = hgs.a(b, supportformcomponent, this);
        obj1 = obj;
        f.add(hgs1);
        obj1 = obj;
        if (!supportformcomponent.getIsHalfWidth() || obj != null) goto _L8; else goto _L7
_L7:
        obj1 = obj;
        obj = f();
        obj1 = obj;
        try
        {
            ((FrameLayout)((LinearLayout) (obj)).findViewById(hbk.ub__support_form_half_width_container_left)).addView(hgs1.g());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = obj1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (((String) (obj1)).equals("header"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (((String) (obj1)).equals("body"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        d.setText(hcr.a("com.ubercab.rds.FORM_CONTENT_TYPE_TEXT", supportformcomponent.getLocalizedContent()));
        continue; /* Loop/switch isn't completed */
_L6:
        c.setText(hcr.a("com.ubercab.rds.FORM_CONTENT_TYPE_TEXT", supportformcomponent.getLocalizedContent()));
        continue; /* Loop/switch isn't completed */
_L8:
        obj1 = obj;
        if (!supportformcomponent.getIsHalfWidth() || obj == null) goto _L10; else goto _L9
_L9:
        obj1 = obj;
        ((FrameLayout)((LinearLayout) (obj)).findViewById(hbk.ub__support_form_half_width_container_right)).addView(hgs1.g());
        obj1 = obj;
        b.addView(((android.view.View) (obj)));
        obj = null;
        continue; /* Loop/switch isn't completed */
_L10:
        obj1 = obj;
        b.addView(hgs1.g());
        if (true) goto _L12; else goto _L11
_L11:
        if ("form".equals(supportnode.getType()))
        {
            a.setVisibility(0);
            a.setOnClickListener(new _cls1());
        }
        d();
        invalidate();
        return;
    }

    public final void a(hfz hfz1)
    {
        e.add(hfz1);
    }

    public final void a(String s)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((hfz)iterator.next()).d(s)) { }
    }

    public final void a(String s, Uri uri, int i)
    {
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hgs hgs1 = (hgs)iterator.next();
            if (s.equals(hgs1.e().getId()))
            {
                if (hgs1.f().equals("photo"))
                {
                    ((hgu)hgs1).a(uri);
                } else
                if (hgs1.f().equals("textarea"))
                {
                    ((hha)hgs1).a(uri, i);
                }
            }
        } while (true);
        d();
    }

    public final void a(String s, String s1)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((hfz)iterator.next()).b(s, s1)) { }
        d();
    }

    public final void a(String s, String s1, int i)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((hfz)iterator.next()).a(s, s1, i)) { }
    }

    public final void b()
    {
        a.setEnabled(true);
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((hgs)iterator.next()).c()) { }
    }

    public final void b(hfz hfz1)
    {
        e.remove(hfz1);
    }

    public final void b(String s, String s1)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((hfz)iterator.next()).c(s, s1)) { }
    }

    public final void c(String s, String s1)
    {
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hgs hgs1 = (hgs)iterator.next();
            if (s.equals(hgs1.e().getId()))
            {
                ((hgr)hgs1).a(s1);
            }
        } while (true);
        d();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        d = (TextView)findViewById(hbk.ub__support_form_header);
        c = (TextView)findViewById(hbk.ub__support_form_body);
        a = (Button)findViewById(hbk.ub__support_form_submit);
        b = (LinearLayout)findViewById(hbk.ub__support_form_container);
    }

    /* member class not found */
    class _cls1 {}

}
