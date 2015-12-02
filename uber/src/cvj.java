// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.android.partner.funnel.core.model.Driver;
import com.ubercab.android.partner.funnel.onboarding.OnboardingActivity;
import com.ubercab.android.partner.funnel.onboarding.model.OnboardingError;
import com.ubercab.android.partner.funnel.onboarding.model.OnboardingErrorPayload;
import com.ubercab.android.partner.funnel.realtime.request.param.DeviceData;
import com.ubercab.android.partner.funnel.realtime.response.LoginResponse;
import com.ubercab.android.partner.funnel.signup.SignUpActivity;
import com.ubercab.android.partner.funnel.signup.form.model.Name;
import com.ubercab.android.partner.funnel.signup.model.PartnerFunnelClient;
import com.ubercab.android.partner.funnel.signup.model.RegistrationForm;
import com.ubercab.android.partner.funnel.signup.model.RegistrationFormError;
import com.ubercab.android.partner.funnel.signup.model.RegistrationFormErrorPayload;
import com.ubercab.android.partner.funnel.signup.profile.ProfileInfo;
import com.ubercab.form.model.Form;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class cvj extends cql
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, gmz
{

    private boolean A;
    private boolean B;
    private String C;
    private String D;
    PartnerFunnelActivity c;
    cps d;
    cqg e;
    chp f;
    Button g;
    Button h;
    RegistrationFormErrorPayload i;
    gmg j;
    ViewGroup k;
    ImageView l;
    cgh m;
    cwb n;
    ViewGroup o;
    cqn p;
    RegistrationForm q;
    cwj r;
    cvm s;
    TextView t;
    TextView u;
    cvf v;
    ViewGroup w;
    private iiy x;
    private View y;
    private TextView z;

    public cvj()
    {
        x = new iiy();
        A = true;
    }

    public static cvj a(PartnerFunnelClient partnerfunnelclient)
    {
        Bundle bundle = new Bundle();
        cvj cvj1 = new cvj();
        bundle.putParcelable("SignUpFragment.BUNDLE_CLIENT", partnerfunnelclient);
        cvj1.setArguments(bundle);
        return cvj1;
    }

    static iiy a(cvj cvj1)
    {
        return cvj1.x;
    }

    private void a(RegistrationFormErrorPayload registrationformerrorpayload)
    {
        if (!TextUtils.isEmpty(registrationformerrorpayload.getComponentId()))
        {
            n.a(registrationformerrorpayload.getComponentId(), registrationformerrorpayload.getReason());
        }
    }

    private void a(ProfileInfo profileinfo)
    {
        if (profileinfo != null)
        {
            HashMap hashmap = new HashMap();
            Name name = Name.create();
            name.setFirstName(profileinfo.b()).setLastName(profileinfo.c());
            hashmap.put("user.complete_name", name);
            if (profileinfo.d().size() > 0)
            {
                hashmap.put("user.primary_email", profileinfo.d().get(0));
            }
            if (profileinfo.e().size() > 0)
            {
                hashmap.put("user.primary_phone", profileinfo.e().get(0));
            }
            n.a(hashmap);
        }
        try
        {
            getLoaderManager().destroyLoader(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ProfileInfo profileinfo)
        {
            return;
        }
    }

    private void a(cvk cvk1)
    {
        cvk1.a(this);
    }

    private cvk f()
    {
        return cvg.a().a(new crw(this)).a(c().d()).a();
    }

    private void g()
    {
        if (q.getIsPolymorphismAllowed().booleanValue() && !B)
        {
            g.setVisibility(0);
            y.setVisibility(0);
        }
        o.setVisibility(0);
        n.a(k, q.getForm(), this);
        n.b();
        if (!TextUtils.isEmpty(q.getLegalConsent()))
        {
            z.setText(Html.fromHtml(q.getLegalConsent()));
            z.setMovementMethod(new _cls7());
        }
        getLoaderManager().initLoader(1, null, this);
    }

    final void a(LoginResponse loginresponse)
    {
        d();
        p.b(loginresponse.getToken());
        p.a(loginresponse.getUuid());
        c.finish();
        startActivity(new Intent(c, com/ubercab/android/partner/funnel/onboarding/OnboardingActivity));
    }

    final void a(Error error)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        d();
        if (error.getRealtimeError() == null || error.getRealtimeError().getData() == null) goto _L2; else goto _L1
_L1:
        Map map;
        map = (Map)error.getRealtimeError().getData().get("context");
        error = error.getRealtimeError().getCode();
        if (!"rtapi.users.login.driver.inactive".equals(error) && !"rtapi.users.login.driver.partnerInactive".equals(error) || !(map.get("driver") instanceof Map)) goto _L4; else goto _L3
_L3:
        error = (Map)map.get("driver");
        p.a(true);
        p.b((String)error.get("token"));
        p.a((String)error.get("uuid"));
        error.get("firstName");
        error.get("lastName");
        c.finish();
        startActivity(new Intent(c, com/ubercab/android/partner/funnel/onboarding/OnboardingActivity));
_L10:
        if (!flag)
        {
            c.finish();
            n.d().get(i.getEmailComponentId()).toString();
            startActivity(d.e(c));
        }
        return;
_L4:
        if (!"rtapi.users.login.driver.riderPolymorphism".equals(error)) goto _L2; else goto _L5
_L5:
        error = PartnerFunnelClient.createFromErrorContext(map);
        if (error == null) goto _L2; else goto _L6
_L6:
        boolean flag2 = j.a(crg.c);
        if (!flag2) goto _L2; else goto _L7
_L7:
        c.finish();
        startActivity(SignUpActivity.a(c, error));
        flag = true;
        continue; /* Loop/switch isn't completed */
        error;
        flag = false;
_L8:
        ijg.a(crg.g.name()).b(error, "Realtime error data doesn't obey expected schema.", new Object[0]);
        continue; /* Loop/switch isn't completed */
        error;
        flag = flag1;
        if (true) goto _L8; else goto _L2
_L2:
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final volatile void a(crf crf)
    {
        a((cvk)crf);
    }

    final void a(ctk ctk1)
    {
        d();
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(b.x);
        if (!ctk1.c())
        {
            if (ctk1.b() != null && ((OnboardingError)ctk1.b()).getPayload() != null && ((OnboardingError)ctk1.b()).getPayload().getErrorCode() == 1009)
            {
                ctk1 = ((OnboardingError)ctk1.b()).getPayload();
                p.a(ctk1.getPartnerUuid());
                c.finish();
                startActivity(OnboardingActivity.a(c));
                return;
            } else
            {
                analyticsevent.setValue(getString(coe.ub__partner_funnel_network_error_message));
                cwm.a(c, coe.ub__partner_funnel_network_error_message);
                c.finish();
                return;
            }
        }
        ctk1 = (RegistrationForm)ctk1.a();
        if (ctk1 != null && ctk1.getForm() != null)
        {
            q = ctk1;
            analyticsevent.setValue(q.getForm().getId());
            g();
        }
        f.a(analyticsevent);
    }

    public final void a(gmy gmy1)
    {
        if (n.e() && A && gmy1.a().equals("com.ubercab.driver.ACTION_CITY_INPUT_TEXT_CHANGED"))
        {
            cwz.a(getActivity());
        }
    }

    protected final crf b()
    {
        return f();
    }

    final void b(ctk ctk1)
    {
        d();
        if (!ctk1.c() || ctk1.a() == null)
        {
            AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(b.y);
            RegistrationFormError registrationformerror = (RegistrationFormError)ctk1.b();
            if (registrationformerror != null)
            {
                i = registrationformerror.getPayload();
                if (i.getErrorCode() == 1004)
                {
                    analyticsevent.setValue(Integer.valueOf(i.getErrorCode()));
                    a(getString(coe.ub__partner_funnel_loading));
                    DeviceData devicedata = DeviceData.create();
                    Object obj = n.d();
                    String s1 = ((Map) (obj)).get(i.getEmailComponentId()).toString();
                    obj = ((Map) (obj)).get(i.getPasswordComponentId()).toString();
                    x.a(v.a(s1, ((String) (obj)), devicedata).a(ico.a()).a(new _cls4(), new _cls5()));
                } else
                if (!TextUtils.isEmpty(i.getComponentId()))
                {
                    a(i);
                    cqe.a(c, 101, i.getMessage(), i.getReason());
                    analyticsevent.setValue(i.getReason());
                }
            } else
            {
                cqe.a(c, 100, null, getString(coe.ub__partner_funnel_network_error_message));
            }
            if (TextUtils.isEmpty(analyticsevent.getValue()))
            {
                try
                {
                    analyticsevent.setValue(Integer.valueOf(((RetrofitError)ctk1.d()).getResponse().getStatus()));
                }
                // Misplaced declaration of an exception variable
                catch (ctk ctk1)
                {
                    analyticsevent.setValue(getString(coe.ub__partner_funnel_network_error_message));
                }
            }
            f.a(analyticsevent);
            return;
        } else
        {
            ctk1 = (Driver)ctk1.a();
            AnalyticsEvent analyticsevent1 = AnalyticsEvent.create("impression").setName(b.A);
            analyticsevent1.setValue(q.getForm().getId());
            f.a(analyticsevent1);
            s.a(ctk1.getUuid());
            p.b(ctk1.getToken());
            p.a(ctk1.getUuid());
            ctk1.getFirstName();
            ctk1.getLastName();
            p.a(true);
            startActivity(new Intent(c, com/ubercab/android/partner/funnel/onboarding/OnboardingActivity));
            c.finish();
            return;
        }
    }

    final void e()
    {
        A = false;
        if (n.c().size() == 0)
        {
            a(getString(coe.ub__partner_funnel_loading));
            x.a(r.a(D, n.d(), B, C).a(ico.a()).a(new csw(com/ubercab/android/partner/funnel/signup/model/RegistrationFormError)).c(new _cls6()));
            return;
        } else
        {
            AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression");
            analyticsevent.setName(b.z);
            analyticsevent.setValue(n.a());
            f.a(analyticsevent);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new cwk(c);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(coc.ub__partner_funnel_signup_fragment_signup, viewgroup, false);
        l = (ImageView)layoutinflater.findViewById(cob.ub__partner_funnel_polymorphism_imageview_profile);
        t = (TextView)layoutinflater.findViewById(cob.ub__partner_funnel_polymorphism_textview_name);
        u = (TextView)layoutinflater.findViewById(cob.ub__partner_funnel_polymorphism_textview_details);
        w = (ViewGroup)layoutinflater.findViewById(cob.ub__partner_funnel_polymorphism_viewgroup_client_info);
        g = (Button)layoutinflater.findViewById(cob.ub__partner_funnel_signup_button_polymorphism);
        h = (Button)layoutinflater.findViewById(cob.ub__partner_funnel_signup_button_continue);
        y = layoutinflater.findViewById(cob.ub__partner_funnel_signup_divider_polymorphism);
        z = (TextView)layoutinflater.findViewById(cob.ub__partner_funnel_signup_textview_legal_disclaimer);
        k = (ViewGroup)layoutinflater.findViewById(cob.ub__partner_funnel_signup_form_viewgroup_content);
        o = (ViewGroup)layoutinflater.findViewById(cob.ub__partner_funnel_signup_viewgroup_content);
        g.setOnClickListener(new _cls2());
        h.setOnClickListener(new _cls3());
        if (getArguments() != null)
        {
            viewgroup = (PartnerFunnelClient)getArguments().get("SignUpFragment.BUNDLE_CLIENT");
            if (viewgroup != null)
            {
                w.setVisibility(0);
                B = true;
                m.a(viewgroup.getPictureUrl()).a(l);
                t.setText(gpq.a(viewgroup.getFirstName(), viewgroup.getLastName(), Locale.getDefault()));
                u.setText(String.format("%s \u2022 %s", new Object[] {
                    viewgroup.getMobile(), viewgroup.getEmail()
                }));
                C = viewgroup.getUuid();
                D = viewgroup.getToken();
            }
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        l = null;
        t = null;
        u = null;
        w = null;
        g = null;
        h = null;
        y = null;
        z = null;
        k = null;
        o = null;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a((ProfileInfo)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onPause()
    {
        super.onPause();
        x.a();
        d();
    }

    public void onResume()
    {
        super.onResume();
        e.a(coe.ub__partner_funnel_sign_up_title);
        if (q == null)
        {
            a(getString(coe.ub__partner_funnel_loading));
            x.a(r.a(D, B).a(ico.a()).a(new csw(com/ubercab/android/partner/funnel/onboarding/model/OnboardingError)).c(new _cls1()));
        }
    }

    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}

}
