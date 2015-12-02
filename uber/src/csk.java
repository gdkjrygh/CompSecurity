// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.android.partner.funnel.onboarding.model.RequiredField;
import com.ubercab.android.partner.funnel.signup.form.model.DateComponent;
import com.ubercab.form.model.Component;
import com.ubercab.form.model.Form;
import com.ubercab.form.model.TextInputComponent;
import com.ubercab.ui.Button;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class csk extends cql
    implements gmz
{

    Button c;
    chp d;
    bjw e;
    cwb f;
    PartnerFunnelActivity g;
    ViewGroup h;

    public csk()
    {
    }

    public static csk a(String s, int i)
    {
        csk csk1 = new csk();
        Bundle bundle = new Bundle();
        bundle.putInt("extra.document_id", i);
        bundle.putSerializable("extra.dynamic_form", s);
        csk1.setArguments(bundle);
        return csk1;
    }

    public static csk a(ArrayList arraylist)
    {
        csk csk1 = new csk();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("extra.required_fields", arraylist);
        csk1.setArguments(bundle);
        return csk1;
    }

    static void a(csk csk1)
    {
        csk1.h();
    }

    private void a(csn csn1)
    {
        csn1.a(this);
    }

    private static Form b(ArrayList arraylist)
    {
        Form form;
        ArrayList arraylist1;
        Iterator iterator;
        form = Form.create();
        arraylist1 = new ArrayList();
        iterator = arraylist.iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        RequiredField requiredfield;
        requiredfield = (RequiredField)(Parcelable)iterator.next();
        arraylist = null;
        if (!requiredfield.getType().equals("Text")) goto _L4; else goto _L3
_L3:
        arraylist = TextInputComponent.create();
        arraylist.setType("textinput");
_L5:
        if (arraylist != null)
        {
            arraylist.setTitle(requiredfield.getLocalizedName());
            arraylist.setId(requiredfield.getName());
            arraylist1.add(arraylist);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (requiredfield.getType().equals("Date"))
        {
            arraylist = DateComponent.create();
            arraylist.setType("date");
            HashMap hashmap = new HashMap();
            hashmap.put("initial_value", new bkj(requiredfield.getName()));
            arraylist.setOptions(hashmap);
        }
        if (true) goto _L5; else goto _L2
_L2:
        form.setComponents(arraylist1);
        return form;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private csn e()
    {
        return csd.a().a(new crw(this)).a(c().d()).a();
    }

    private boolean f()
    {
        return getArguments().getSerializable("extra.dynamic_form") != null;
    }

    private Form g()
    {
        String s = (String)getArguments().getSerializable("extra.dynamic_form");
        if (s == null)
        {
            return b(getArguments().getParcelableArrayList("extra.required_fields"));
        } else
        {
            return (Form)e.a(s, com/ubercab/form/model/Form);
        }
    }

    private void h()
    {
        if (f())
        {
            AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap");
            analyticsevent.setName(c.m);
            analyticsevent.setValue(getArguments().get("extra.document_id"));
            d.a(analyticsevent);
        }
        if (f.c().size() == 0)
        {
            if (g instanceof cso)
            {
                ((cso)g).a(f.d());
            }
        } else
        if (f())
        {
            AnalyticsEvent analyticsevent1 = AnalyticsEvent.create("impression");
            analyticsevent1.setName(b.h);
            analyticsevent1.setValue(f.a());
            d.a(analyticsevent1);
            return;
        }
    }

    public final volatile void a(crf crf)
    {
        a((csn)crf);
    }

    public final void a(gmy gmy1)
    {
        String s;
        byte byte0;
        s = gmy1.a();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch -634286367 -634286367: default 28
    //                   -634286367 56;
           goto _L1 _L2
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 48
    //                   0 71;
           goto _L3 _L4
_L3:
        f.f();
        return;
_L2:
        if (s.equals("com.ubercab.driver.ACTION_DATE_SELECT_CLICKED"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        csl.a(gmy1.b().getString("com.ubercab.form.DATA_TEXT")).show(getFragmentManager(), "document_metadata_datepicker");
          goto _L3
    }

    public final void a(String s, long l)
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(s, Long.valueOf(l));
        f.a(hashmap);
    }

    protected final crf b()
    {
        return e();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(coc.ub__partner_funnel_onboarding_fragment_metadata, viewgroup, false);
        viewgroup = g();
        c = (Button)layoutinflater.findViewById(cob.ub__partner_funnel_onboarding_button_continue);
        h = (ViewGroup)layoutinflater.findViewById(cob.ub__partner_funnel_onboarding_viewgroup_form_content);
        c.setOnClickListener(new _cls1());
        f.a(h, viewgroup, this);
        f.f();
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        if (f())
        {
            AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression");
            analyticsevent.setName(b.e);
            analyticsevent.setValue(getArguments().get("extra.document_id"));
            d.a(analyticsevent);
            return;
        } else
        {
            d.a(b.i);
            return;
        }
    }

    /* member class not found */
    class _cls1 {}

}
