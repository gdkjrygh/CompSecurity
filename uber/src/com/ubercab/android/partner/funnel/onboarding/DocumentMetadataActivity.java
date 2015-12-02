// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import cob;
import coc;
import coi;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import cqg;
import crf;
import crn;
import cro;
import crr;
import crs;
import csk;
import csm;
import cso;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DocumentMetadataActivity extends PartnerFunnelActivity
    implements csm, cso
{

    public cqg d;

    public DocumentMetadataActivity()
    {
    }

    public static Intent a(Context context, String s, int i)
    {
        context = new Intent(context, com/ubercab/android/partner/funnel/onboarding/DocumentMetadataActivity);
        context.putExtra("extra.dynamic_form", s);
        context.putExtra("extra.document_id", i);
        return context;
    }

    public static Intent a(Context context, ArrayList arraylist, Intent intent)
    {
        context = new Intent(context, com/ubercab/android/partner/funnel/onboarding/DocumentMetadataActivity);
        context.putParcelableArrayListExtra("extra.required.fields", arraylist);
        context.putExtra("extra.parent_intent", intent);
        return context;
    }

    private void a(crr crr1)
    {
        crr1.a(this);
    }

    private void a(String s)
    {
        if (a(csk) == null)
        {
            a(cob.ub__partner_funnel_metadata_viewgroup_content, ((android.support.v4.app.Fragment) (csk.a(s, getIntent().getIntExtra("extra.document_id", -1)))));
        }
    }

    private void a(ArrayList arraylist)
    {
        if (a(csk) == null)
        {
            a(cob.ub__partner_funnel_metadata_viewgroup_content, ((android.support.v4.app.Fragment) (csk.a(arraylist))));
        }
    }

    private crr b(crs crs)
    {
        return crn.a().a((new coi(this)).b()).a(crs).a();
    }

    protected final crf a(crs crs)
    {
        return b(crs);
    }

    public final volatile void a(crf crf)
    {
        a((crr)crf);
    }

    public final void a(String s, long l)
    {
        ((csk)a(csk)).a(s, l);
    }

    public final void a(Map map)
    {
        Bundle bundle = new Bundle();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); bundle.putSerializable((String)entry.getKey(), (Serializable)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        setResult(-1, (new Intent()).putExtra("extra.filled.fields", bundle));
        finish();
    }

    public void onBackPressed()
    {
        setResult(0);
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(coc.ub__partner_funnel_onboarding_activity_metadata);
        boolean flag;
        if (getIntent().hasExtra("extra.required.fields"))
        {
            a(getIntent().getParcelableArrayListExtra("extra.required.fields"));
        } else
        if (getIntent().hasExtra("extra.dynamic_form"))
        {
            a((String)getIntent().getSerializableExtra("extra.dynamic_form"));
        }
        bundle = d;
        if (getIntent().getExtras().get("extra.parent_intent") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.a(flag);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            break;
        }
        if (getIntent().hasExtra("extra.parent_intent"))
        {
            startActivity((Intent)getIntent().getExtras().get("extra.parent_intent"));
            finish();
        }
        return true;
    }
}
