// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import b;
import c;
import chp;
import cia;
import cob;
import coc;
import cod;
import coe;
import cof;
import coi;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.photo.CameraView;
import cpy;
import cqg;
import crf;
import crg;
import crn;
import cro;
import crr;
import crs;
import gmg;
import gzo;
import gzp;
import gzs;
import gzw;
import gzz;
import haa;
import hab;
import hac;
import hae;
import ijg;
import java.util.List;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding:
//            DocumentMetadataActivity

public class OnboardingPhotoActivity extends PartnerFunnelActivity
    implements gzs, hac
{

    public cqg d;
    public chp e;
    public gmg f;
    MenuItem g;
    private Intent h;

    public OnboardingPhotoActivity()
    {
    }

    public static Intent a(Context context, String s1, String s2, int i1, int j1)
    {
        return b(context, s1, s2, i1, j1, null, null, false);
    }

    public static Intent a(Context context, String s1, String s2, int i1, int j1, String s3, String s4, boolean flag)
    {
        return b(context, s1, s2, i1, j1, s3, s4, flag);
    }

    private void a(cia cia)
    {
        a("impression", cia);
    }

    private void a(crr crr1)
    {
        crr1.a(this);
    }

    private void a(gzw gzw1)
    {
label0:
        {
            if (g != null)
            {
                if (gzw1 == gzw.d)
                {
                    break label0;
                }
                g.setVisible(true);
                g.setIcon(gzw1.b());
            }
            return;
        }
        g.setVisible(false);
    }

    private void a(String s1, cia cia)
    {
        s1 = AnalyticsEvent.create(s1);
        s1.setName(cia);
        s1.setValue(Integer.valueOf(getIntent().getIntExtra("extra.document_id", -1)));
        e.a(s1);
    }

    private static Intent b(Context context, String s1, String s2, int i1, int j1, String s3, String s4, boolean flag)
    {
        context = new Intent(context, com/ubercab/android/partner/funnel/onboarding/OnboardingPhotoActivity);
        context.putExtra("extra.document_id", i1);
        context.putExtra("extra.document_name", s1);
        context.putExtra("extra.document_metadata_form", s3);
        context.putExtra("extra.document_metadata_is_mandatory", flag);
        context.putExtra("extra.document_metadata_message", s4);
        context.putExtra("extra.document_owner_uuid", s2);
        context.putExtra("extra.document_type", j1);
        context.putExtra("extra.parent_intent", null);
        context.putParcelableArrayListExtra("extra.required_fields", null);
        return context;
    }

    private crr b(crs crs)
    {
        return crn.a().a((new coi(this)).b()).a(crs).a();
    }

    private void b(cia cia)
    {
        a("tap", cia);
    }

    private void b(String s1, cia cia)
    {
        s1 = AnalyticsEvent.create(s1);
        s1.setName(cia);
        s1.setValue(Integer.valueOf(getIntent().getIntExtra("extra.document_id", -1)));
        e.a(s1);
    }

    private CameraView s()
    {
        haa haa1 = (haa)getSupportFragmentManager().findFragmentById(cob.ub__partner_funnel_viewgroup_content);
        if (haa1 != null)
        {
            return haa1.c();
        } else
        {
            return null;
        }
    }

    private void t()
    {
        if (a(haa) == null)
        {
            int i1 = (int)f.a(crg.a, "max_width", 1200D);
            int j1 = (int)f.a(crg.a, "max_height", 1200D);
            haa haa1;
            if (i1 <= 0)
            {
                i1 = 1200;
            }
            if (j1 <= 0)
            {
                j1 = 1200;
            }
            haa1 = (new hab(i1, j1)).a(this).a(getString(coe.ub__partner_funnel_documents_upload_hint, new Object[] {
                getIntent().getStringExtra("extra.document_name")
            })).b(getString(coe.ub__partner_funnel_documents_upload_review_hint, new Object[] {
                getIntent().getStringExtra("extra.document_name")
            })).a(gzz.a).a(50).a(hae.c).a().a(f.a(crg.f)).b();
            haa1.a(this);
            a(cob.ub__partner_funnel_viewgroup_content, haa1);
        }
    }

    protected final crf a(crs crs)
    {
        return b(crs);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        super.a(i1, j1, bundle);
        if (i1 == 109 && j1 == -1)
        {
            setResult(-1, h);
            b(c.n);
            finish();
        } else
        if (i1 == 109 && j1 == 0)
        {
            b(c.l);
            startActivityForResult(DocumentMetadataActivity.a(this, (String)bundle.getSerializable("extra.document_metadata_form"), getIntent().getIntExtra("extra.document_id", -1)), 108);
            return;
        }
    }

    public final void a(Uri uri)
    {
        h = new Intent();
        h.putExtra("extra.document_id", getIntent().getIntExtra("extra.document_id", -1));
        h.putExtra("extra.document_owner_uuid", getIntent().getStringExtra("extra.document_owner_uuid"));
        h.putExtra("extra.document_type", getIntent().getIntExtra("extra.document_type", 0));
        h.putExtra("extra.uri", uri);
        if (f.a(crg.k) && getIntent().getParcelableArrayListExtra("extra.required_fields") != null)
        {
            startActivityForResult(DocumentMetadataActivity.a(this, getIntent().getParcelableArrayListExtra("extra.required_fields"), (Intent)getIntent().getExtras().get("extra.parent_intent")), 108);
            return;
        }
        if (getIntent().getSerializableExtra("extra.document_metadata_form") != null && f.a(crg.e))
        {
            cpy.a(this, 109, getIntent().getStringExtra("extra.document_metadata_message"), getString(coe.ub__partner_funnel_yes), getString(coe.ub__partner_funnel_no), true, getIntent().getExtras());
            a(((cia) (b.f)));
            return;
        } else
        {
            setResult(-1, h);
            finish();
            return;
        }
    }

    public final volatile void a(crf crf)
    {
        a((crr)crf);
    }

    public final void a(gzo gzo1)
    {
        if (gzo1.b() != gzp.a && gzo1.b() != gzp.e)
        {
            ijg.d(gzo1.getCause(), gzo1.getMessage(), new Object[0]);
        }
    }

    public final void a(List list)
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap");
        analyticsevent.setName(c.d);
        analyticsevent.setValue(list);
        e.a(analyticsevent);
    }

    public final void b(List list)
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap");
        analyticsevent.setName(c.g);
        analyticsevent.setValue(list);
        e.a(analyticsevent);
    }

    public final int e()
    {
        return cof.Theme_Uber_Partner_Funnel;
    }

    public final void f()
    {
        supportInvalidateOptionsMenu();
    }

    public final void g()
    {
        b("impression", b.d);
    }

    public final void h()
    {
        b("impression", b.a);
    }

    public final void i()
    {
        b("impression", b.b);
    }

    public final void j()
    {
        b("impression", b.c);
    }

    public final void k()
    {
        b("tap", c.a);
    }

    public final void l()
    {
        b("tap", c.b);
    }

    public final void m()
    {
        b("tap", c.c);
    }

    public final void n()
    {
        b("tap", c.e);
    }

    public final void o()
    {
        b("tap", c.f);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 108)
        {
            if (j1 == -1)
            {
                intent.putExtras(h);
                setResult(-1, intent);
                finish();
            } else
            if (j1 == 0 && getIntent().getSerializableExtra("extra.document_metadata_form") != null && f.a(crg.e))
            {
                cpy.a(this, 109, getIntent().getStringExtra("extra.document_metadata_message"), getString(coe.ub__partner_funnel_yes), getString(coe.ub__partner_funnel_no), getIntent().getExtras());
                a(b.f);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(coc.ub__partner_funnel_onboarding_photo_activity);
        String s1 = getIntent().getStringExtra("extra.document_name");
        cqg cqg1 = d;
        bundle = s1;
        if (s1 == null)
        {
            bundle = getString(coe.ub__partner_funnel_empty);
        }
        cqg1.a(bundle);
        t();
        bundle = AnalyticsEvent.create("impression");
        bundle.setName(b.j);
        bundle.setValue(Integer.valueOf(getIntent().getIntExtra("extra.document_id", 0)));
        e.a(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(cod.ub__partner_funnel_photo_menu, menu);
        g = menu.findItem(cob.ub__partner_funnel_photo_menuitem_flash);
        menu = s();
        if (menu != null)
        {
            menu = menu.h();
        } else
        {
            menu = gzw.d;
        }
        a(menu);
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        haa haa1 = (haa)a(haa);
        if (haa1 != null)
        {
            haa1.a(null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == cob.ub__partner_funnel_photo_menuitem_flash)
        {
            CameraView cameraview = s();
            if (cameraview != null)
            {
                menuitem.setIcon(cameraview.e().b());
            }
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public final void p()
    {
        b("tap", c.h);
    }

    public final void q()
    {
        b("tap", c.i);
    }

    public final void r()
    {
        b("tap", c.k);
    }
}
