// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.android.partner.funnel.onboarding.OnboardingPhotoActivity;
import com.ubercab.android.partner.funnel.onboarding.SimpleTextActivity;
import com.ubercab.android.partner.funnel.onboarding.documents.DocumentsUploadService;
import com.ubercab.android.partner.funnel.onboarding.model.OfficeHours;
import com.ubercab.android.partner.funnel.onboarding.model.OnboardingError;
import com.ubercab.android.partner.funnel.onboarding.model.OnboardingErrorPayload;
import com.ubercab.android.partner.funnel.onboarding.model.OnboardingForm;
import com.ubercab.android.partner.funnel.onboarding.vehicleinspection.VehicleInspectionSelectionActivity;
import com.ubercab.android.partner.funnel.onboarding.view.SnackbarLayout;
import com.ubercab.form.model.Form;
import com.ubercab.ui.Button;
import java.util.HashMap;
import java.util.List;

public class csr extends cql
    implements gmz
{

    ViewGroup A;
    private final iiy B = new iiy();
    private int C;
    private boolean D;
    private boolean E;
    PartnerFunnelActivity c;
    cqg d;
    chp e;
    Button f;
    cps g;
    cpu h;
    gmg i;
    OnboardingForm j;
    bjw k;
    View l;
    cts m;
    csz n;
    css o;
    cpv p;
    cwb q;
    cpw r;
    boolean s;
    ScrollView t;
    cst u;
    cqn v;
    Animation w;
    Animation x;
    SnackbarLayout y;
    ViewGroup z;

    public csr()
    {
        o = new css(this);
        u = new cst(this);
        C = 0;
        E = false;
    }

    static int a(csr csr1, int i1)
    {
        csr1.C = i1;
        return i1;
    }

    public static csr a(boolean flag)
    {
        csr csr1 = new csr();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_resuming", flag);
        csr1.setArguments(bundle);
        return csr1;
    }

    private void a(OnboardingErrorPayload onboardingerrorpayload)
    {
        q.a(onboardingerrorpayload.getComponentId(), onboardingerrorpayload.getReason());
    }

    static void a(csr csr1)
    {
        csr1.c(true);
    }

    private void a(csu csu1)
    {
        csu1.a(this);
    }

    private void a(boolean flag, boolean flag1, boolean flag2, String s1)
    {
        if (!flag1 && flag)
        {
            return;
        }
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression");
        if (flag2 || !flag)
        {
            analyticsevent.setName(b.t);
        } else
        {
            analyticsevent.setName(b.v);
        }
        analyticsevent.setValue(s1);
        e.a(analyticsevent);
    }

    static iiy b(csr csr1)
    {
        return csr1.B;
    }

    private void b(boolean flag)
    {
        Object obj = j.getForm().getId();
        obj = AnalyticsEvent.create("impression").setName(b.s).setValue(((String) (obj)));
        e.a(((AnalyticsEvent) (obj)));
        A.removeAllViews();
        obj = j.getForm().getTitle();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            d.a(((String) (obj)));
        }
        obj = new HashMap();
        ((HashMap) (obj)).put("is_first_time", Boolean.valueOf(flag));
        q.a(A, j.getForm(), this);
        q.a(((HashMap) (obj)));
        q.f();
        q.b();
        obj = j.getOfficeHours(k);
        String s1;
        Button button;
        int i1;
        if (i.a(crg.h) && ((OfficeHours) (obj)).shouldDisplayOfficeHours())
        {
            l.setVisibility(0);
            h();
            if (!v.b())
            {
                v.c();
                if (getView() != null)
                {
                    ViewStub viewstub = (ViewStub)getView().findViewById(cob.ub__partner_funnel_toolbar_tutorial_overlay_stub);
                    if (viewstub != null)
                    {
                        viewstub.inflate().setOnClickListener(new _cls3());
                    }
                }
            }
            l.setOnClickListener(new _cls4(((OfficeHours) (obj))));
        } else
        {
            l.setVisibility(8);
        }
        obj = f;
        if (j.shouldDisplaySubmitButton())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((Button) (obj)).setVisibility(i1);
        s1 = j.getStepContinueLabel();
        l();
        button = f;
        obj = s1;
        if (TextUtils.isEmpty(s1))
        {
            obj = getString(coe.ub__partner_funnel_continue_str);
        }
        button.setText(((CharSequence) (obj)));
        if (y != null && D)
        {
            y.a(getString(coe.ub__partner_funnel_welcome_back_to_onboarding));
            y.a();
        }
    }

    private void c(boolean flag)
    {
        if (q.c().size() == 0)
        {
            if (flag && !TextUtils.isEmpty(j.getStepLegalConsent()))
            {
                cpy.a(c, j.getStepLegalConsent(), getString(coe.ub__partner_funnel_continue_str), getString(coe.ub__partner_funnel_cancel));
            } else
            {
                E = true;
                a(getString(coe.ub__partner_funnel_loading));
                B.a(m.a(v.a(), j.getForm().getId(), q.d()).a(ico.a()).a(new csw(com/ubercab/android/partner/funnel/onboarding/model/OnboardingError)).c(new _cls5()));
            }
        } else
        {
            AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression");
            analyticsevent.setName(b.u);
            analyticsevent.setValue(q.a());
            e.a(analyticsevent);
        }
        D = false;
    }

    static boolean c(csr csr1)
    {
        csr1.E = false;
        return false;
    }

    static void d(csr csr1)
    {
        csr1.j();
    }

    private csu e()
    {
        return csf.a().a(new crw(this)).a(c().d()).a();
    }

    static void e(csr csr1)
    {
        csr1.k();
    }

    static int f(csr csr1)
    {
        return csr1.C;
    }

    private cpx f()
    {
        return new _cls2();
    }

    private void g()
    {
        String s1 = getString(coe.ub__partner_funnel_network_error_message);
        String s2 = getString(coe.ub__partner_funnel_try_again);
        String s3 = getString(coe.ub__partner_funnel_cancel);
        cpy.a(c(), 102, s1, s2, s3);
    }

    private void h()
    {
        if (l.getVisibility() == 0)
        {
            e.a(AnalyticsEvent.create("impression").setName(b.p).setValue(j.getForm().getId()));
        }
    }

    private void i()
    {
        e.a(c.s);
        e.a(b.w);
        String s1 = getString(coe.ub__partner_funnel_confirm_sign_out);
        String s2 = getString(coe.ub__partner_funnel_sign_out);
        String s3 = getString(coe.ub__partner_funnel_cancel);
        cpy.a(c, 100, s1, s2, s3);
    }

    private void j()
    {
        if (!s && (w.hasEnded() || !w.hasStarted()))
        {
            z.clearAnimation();
            z.setVisibility(0);
            z.startAnimation(w);
            s = true;
        }
    }

    private void k()
    {
        if (s && (x.hasEnded() || !x.hasStarted()))
        {
            z.clearAnimation();
            z.startAnimation(x);
            s = false;
        }
    }

    private void l()
    {
        t.getViewTreeObserver().addOnPreDrawListener(o);
        if (q.e())
        {
            cwz.a(c);
        }
        q.f();
    }

    private void m()
    {
        a(getString(coe.ub__partner_funnel_loading));
        B.a(m.a(v.a()).a(ico.a()).a(new csw(com/ubercab/android/partner/funnel/onboarding/model/OnboardingError)).c(new _cls6()));
    }

    public final void a(int i1, int j1)
    {
        i1;
        JVM INSTR tableswitch 100 106: default 44
    //                   100 45
    //                   101 81
    //                   102 86
    //                   103 104
    //                   104 44
    //                   105 44
    //                   106 115;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
        return;
_L2:
        if (j1 == -1)
        {
            e.a(c.u);
            v.d();
            return;
        } else
        {
            e.a(c.t);
            return;
        }
_L3:
        l();
        return;
_L4:
        if (j1 == -1)
        {
            m();
            return;
        } else
        {
            c.finish();
            return;
        }
_L5:
        if (j1 == -1)
        {
            c(false);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (j1 == -1)
        {
            c(false);
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public final volatile void a(crf crf)
    {
        a((csu)crf);
    }

    final void a(ctk ctk1, boolean flag)
    {
        d();
        String s1;
        Object obj;
        boolean flag1;
        boolean flag2;
        if (j != null && j.getForm() != null)
        {
            s1 = j.getForm().getId();
        } else
        {
            s1 = null;
        }
        if (ctk1.c()) goto _L2; else goto _L1
_L1:
        if (!ctk1.e()) goto _L4; else goto _L3
_L3:
        g();
        flag2 = false;
_L16:
        a(flag2, flag, ctk1.e(), s1);
        return;
_L4:
        if (ctk1.b() == null) goto _L6; else goto _L5
_L5:
        obj = ((OnboardingError)ctk1.b()).getPayload();
        if (((OnboardingErrorPayload) (obj)).getErrorCode() != 1001) goto _L8; else goto _L7
_L7:
        startActivity(g.c(c));
        c.finish();
        flag1 = true;
_L14:
        flag2 = flag1;
        if (!flag1)
        {
            cqe.a(c, 105, null, getString(coe.ub__partner_funnel_error_occurred));
            flag2 = flag1;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (((OnboardingErrorPayload) (obj)).getErrorCode() != 1002) goto _L10; else goto _L9
_L9:
        v.a(false);
        if (flag)
        {
            n.a(v.a());
        }
        obj = g.b(c);
        ((Intent) (obj)).setFlags(0x10000000);
        startActivity(((Intent) (obj)));
        c.finish();
        flag1 = true;
          goto _L11
_L10:
        if (((OnboardingErrorPayload) (obj)).getErrorCode() != 1003) goto _L13; else goto _L12
_L12:
        obj = g.a(((OnboardingErrorPayload) (obj)).getExternalUrl());
        c.finish();
        startActivity(((Intent) (obj)));
        flag1 = true;
          goto _L11
        obj;
        flag1 = true;
          goto _L11
_L13:
        if (((OnboardingErrorPayload) (obj)).getErrorCode() == 1007 || ((OnboardingErrorPayload) (obj)).getErrorCode() == 1008)
        {
            cqe.a(c, 100, null, ((OnboardingErrorPayload) (obj)).getMessage());
            flag1 = true;
        } else
        if (!TextUtils.isEmpty(((OnboardingErrorPayload) (obj)).getComponentId()))
        {
            a(((OnboardingError)ctk1.b()).getPayload());
            flag1 = true;
        } else
        {
            flag1 = false;
        }
_L11:
        if (true) goto _L14; else goto _L2
_L2:
        a(true, flag, ctk1.e(), s1);
        j = (OnboardingForm)ctk1.a();
        b(flag);
        n.a(v.a(), j.getForm().getId());
        return;
_L6:
        flag2 = false;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public final void a(gmy gmy1)
    {
        Object obj;
        String s1;
        byte byte0;
        obj = null;
        l();
        s1 = gmy1.a();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 11: default 116
    //                   -1628021550: 324
    //                   -1475993652: 290
    //                   -588996448: 273
    //                   -383942546: 307
    //                   -373287999: 177
    //                   914320759: 209
    //                   998260346: 225
    //                   1325094089: 241
    //                   1345801976: 341
    //                   1420925597: 257
    //                   1703796192: 193;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        break; /* Loop/switch isn't completed */
_L10:
        break MISSING_BLOCK_LABEL_341;
_L13:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
        case 1: // '\001'
            c(true);
            return;

        case 2: // '\002'
            e.a(b.F);
            return;

        case 3: // '\003'
            e.a(b.J);
            return;

        case 4: // '\004'
            e.a(c.z);
            return;

        case 5: // '\005'
            e.a(c.A);
            return;

        case 6: // '\006'
            e.a(c.C);
            return;

        case 7: // '\007'
            String s2;
            String s3;
            int i1;
            int j1;
            boolean flag;
            if (gmy1.b() != null)
            {
                obj = gmy1.b().getParcelableArrayList("com.ubercab.driver.DATA_POINT_OF_INTEREST_LIST");
                gmy1 = gmy1.b().getString("com.ubercab.driver.DATA_IMAGE_URL");
            } else
            {
                Object obj1 = null;
                gmy1 = ((gmy) (obj));
                obj = obj1;
            }
            startActivityForResult(VehicleInspectionSelectionActivity.a(c, ((java.util.ArrayList) (obj)), gmy1), 107);
            return;

        case 8: // '\b'
            obj = gmy1.b().getString("com.ubercab.driver.DATA_DOCUMENT_NAME");
            i1 = gmy1.b().getInt("com.ubercab.driver.DATA_DOCUMENT_ID");
            s2 = gmy1.b().getString("com.ubercab.driver.DATA_DOCUMENT_OWNER_UUID", v.a());
            j1 = gmy1.b().getInt("com.ubercab.driver.DATA_DOCUMENT_TYPE");
            s3 = (String)gmy1.b().getSerializable("com.ubercab.driver.DATA_DOCUMENT_METADATA_FORM");
            if (s3 == null)
            {
                startActivityForResult(OnboardingPhotoActivity.a(c, ((String) (obj)), s2, i1, j1), 104);
                return;
            } else
            {
                flag = gmy1.b().getBoolean("com.ubercab.driver.DATA_DOCUMENT_METADATA_MANDATORY", false);
                gmy1 = gmy1.b().getString("com.ubercab.driver.DATA_DOCUMENT_METADATA_MESSAGE");
                startActivityForResult(OnboardingPhotoActivity.a(c, ((String) (obj)), s2, i1, j1, s3, gmy1, flag), 104);
                return;
            }

        case 9: // '\t'
            gmy1 = new Intent("android.intent.action.VIEW", Uri.parse(gmy1.b().getString("com.ubercab.driver.DATA_DOCUMENT_URL")));
            try
            {
                startActivity(gmy1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (gmy gmy1)
            {
                return;
            }

        case 10: // '\n'
            obj = gmy1.b().getString("com.ubercab.driver.DATA_EXTRA_TEXT_TITLE");
            gmy1 = gmy1.b().getString("com.ubercab.form.DATA_TEXT");
            startActivity(SimpleTextActivity.a(c, ((String) (obj)), gmy1));
            return;
        }
_L6:
        if (s1.equals("com.ubercab.driver.ACTION_MODAL_CLICKED"))
        {
            byte0 = 0;
        }
          goto _L13
_L12:
        if (s1.equals("com.ubercab.driver.ACTION_PAGE_SELECT_CLICKED"))
        {
            byte0 = 1;
        }
          goto _L13
_L7:
        if (s1.equals("com.ubercab.driver.ACTION_SEND_IMPRESSION_PROMPT"))
        {
            byte0 = 2;
        }
          goto _L13
_L8:
        if (s1.equals("com.ubercab.driver.ACTION_SEND_IMPRESSION_SPLASH"))
        {
            byte0 = 3;
        }
          goto _L13
_L9:
        if (s1.equals("com.ubercab.driver.ACTION_SEND_TAP_PROMPT_RESUME"))
        {
            byte0 = 4;
        }
          goto _L13
_L11:
        if (s1.equals("com.ubercab.driver.ACTION_SEND_TAP_PROMPT_UPLOAD"))
        {
            byte0 = 5;
        }
          goto _L13
_L4:
        if (s1.equals("com.ubercab.driver.ACTION_SEND_TAP_SPLASH_CONTINUE"))
        {
            byte0 = 6;
        }
          goto _L13
_L3:
        if (s1.equals("com.ubercab.driver.ACTION_SHOW_VEHICLE_INSPECTION_LOTS"))
        {
            byte0 = 7;
        }
          goto _L13
_L5:
        if (s1.equals("com.ubercab.driver.ACTION_TAKE_PHOTO"))
        {
            byte0 = 8;
        }
          goto _L13
_L2:
        if (s1.equals("com.ubercab.driver.ACTION_DOCUMENT_LINK_CLICKED"))
        {
            byte0 = 9;
        }
          goto _L13
        if (s1.equals("com.ubercab.driver.ACTION_EXTRA_TEXT_CLICKED"))
        {
            byte0 = 10;
        }
          goto _L13
    }

    protected final crf b()
    {
        return e();
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1 && i1 == 104)
        {
            c(true);
            intent = DocumentsUploadService.a(c.getApplication(), intent.getIntExtra("extra.document_id", -1), intent.getIntExtra("extra.document_type", 0), intent.getStringExtra("extra.document_owner_uuid"), (Uri)intent.getParcelableExtra("extra.uri"), intent.getBundleExtra("extra.filled.fields"));
            c.startService(intent);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (i.a(crg.d) && !p.a())
        {
            r.a(f());
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(coc.ub__partner_funnel_onboarding_fragment_onboarding, viewgroup, false);
        f = (Button)layoutinflater.findViewById(cob.ub__partner_funnel_onboarding_button_continue);
        l = layoutinflater.findViewById(cob.ub__onboarding_officehours_bar);
        t = (ScrollView)layoutinflater.findViewById(cob.ub__partner_funnel_onboarding_scrollview_form);
        z = (ViewGroup)layoutinflater.findViewById(cob.ub__partner_funnel_onboarding_scroll_hint_viewgroup_content);
        A = (ViewGroup)layoutinflater.findViewById(cob.ub__partner_funnel_onboarding_viewgroup_form_content);
        f.setOnClickListener(new _cls1());
        w = AnimationUtils.loadAnimation(c, cnx.ub__partner_funnel_slide_in_bottom);
        x = AnimationUtils.loadAnimation(c, cnx.ub__partner_funnel_slide_out_bottom);
        D = getArguments().getBoolean("is_resuming");
        if (D)
        {
            y = new SnackbarLayout(c);
            viewgroup.addView(y);
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        f = null;
        t = null;
        z = null;
        A = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == cob.ub__partner_funnel_onboarding_menuitem_sign_out)
        {
            i();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onPause()
    {
        super.onPause();
        B.a();
        d();
    }

    public void onResume()
    {
        super.onResume();
        h();
        if (j == null)
        {
            m();
        } else
        if (E)
        {
            c(true);
            return;
        }
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls1 {}

}
