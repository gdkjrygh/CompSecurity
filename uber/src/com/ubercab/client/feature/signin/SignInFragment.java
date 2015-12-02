// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Space;
import android.widget.TextView;
import bmp;
import bmr;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.ui.StringListFloatingLabelEditText;
import com.ubercab.client.core.vendor.alipay.AlipayAuthorizationActivity;
import com.ubercab.client.core.vendor.alipay.model.AlipayAuthResult;
import com.ubercab.client.core.vendor.baidu.BaiduAuthorizationActivity;
import com.ubercab.client.core.vendor.facebook.FacebookAuthorizationActivity;
import com.ubercab.client.feature.passwordreset.PasswordResetActivity;
import com.ubercab.client.feature.signup.SignupActivity;
import com.ubercab.client.feature.signup.SignupData;
import com.ubercab.client.feature.signup.ThirdPartyToken;
import com.ubercab.locale.phone.EmailPhoneNumberView;
import com.ubercab.rds.feature.password.ForgotPasswordActivity;
import com.ubercab.rds.feature.password.ResetPasswordActivity;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.NetworkError;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.request.param.DeviceData;
import com.ubercab.rider.realtime.response.LoginResponse;
import com.ubercab.ui.Button;
import com.ubercab.ui.FloatingLabelEditText;
import cwz;
import czb;
import czj;
import dai;
import dbf;
import dce;
import dfp;
import djb;
import dkn;
import dmi;
import dmj;
import dnm;
import dpg;
import dtp;
import duj;
import dul;
import duw;
import dwm;
import fjk;
import fjl;
import fjq;
import fju;
import fjv;
import fjw;
import fjx;
import fjy;
import fke;
import gmg;
import gmk;
import gph;
import hjn;
import hkp;
import hrs;
import hrt;
import hrx;
import hsj;
import ica;
import ick;
import icl;
import ico;
import iu;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import l;
import n;
import rp;
import rq;
import rs;
import rt;

// Referenced classes of package com.ubercab.client.feature.signin:
//            SignInWithBaiduActivity, SignInWithAlipayActivity

public class SignInFragment extends czb
{

    public chp c;
    public iu d;
    public RiderApplication e;
    public cev f;
    public dai g;
    public hjn h;
    public gmg i;
    public dpg j;
    public dce k;
    public dkn l;
    public hkp m;
    public ImageButton mButtonAlipaySignIn;
    public ImageButton mButtonBaiduSignIn;
    Button mButtonForgotPassword;
    ImageButton mButtonGoogle;
    Button mButtonSignIn;
    EmailPhoneNumberView mEditEmailPhoneNumber;
    StringListFloatingLabelEditText mEditTextEmail;
    FloatingLabelEditText mEditTextPassword;
    public Space mPaddingViewThirdParty;
    public ViewGroup mViewGroupThirdPartyChina;
    public ViewGroup mViewGroupThirdPartyGeneral;
    public ViewGroup mViewGroupThirdPartySignIn;
    private final gmk n = new fjy(this, (byte)0);
    private final Queue o = new LinkedList();
    private boolean p;
    private Executor q;
    private icl r;
    private icl s;
    private fjw t;
    private String u;
    private ThirdPartyToken v;

    public SignInFragment()
    {
    }

    private void a()
    {
        Intent intent = getActivity().getIntent();
        if (intent != null && intent.hasExtra("extra_password_reset_email_token"))
        {
            startActivityForResult(ResetPasswordActivity.a(getActivity(), intent.getStringExtra("extra_password_reset_email_token")), 4001);
            getActivity().getIntent().removeExtra("extra_password_reset_email_token");
        }
    }

    private void a(int i1)
    {
        dtp.a(d(), 0, null, getString(i1), getString(0x7f0702f8));
    }

    static void a(SignInFragment signinfragment)
    {
        signinfragment.p();
    }

    static void a(SignInFragment signinfragment, String s1)
    {
        signinfragment.d(s1);
    }

    static void a(SignInFragment signinfragment, String s1, String s2)
    {
        signinfragment.b(s1, s2);
    }

    public static void a(SignInFragment signinfragment, boolean flag, fke fke1)
    {
        signinfragment.a(flag, fke1);
    }

    private void a(fjx fjx1)
    {
        fjx1.a(this);
    }

    private void a(String s1)
    {
        AsyncTask asynctask = new AsyncTask(s1, getResources().getString(0x7f0706c0)) {

            final String a;
            final String b;
            final SignInFragment c;
            private String d;
            private Intent e;

            private transient String a()
            {
                String s2 = c.a(a, b);
                return s2;
                Object obj;
                obj;
                d = c.getString(0x7f07025f);
_L2:
                return null;
                obj;
                e = ((rs) (obj)).a();
                continue; /* Loop/switch isn't completed */
                obj;
                d = c.getString(0x7f070260);
                if (true) goto _L2; else goto _L1
_L1:
            }

            private void a(String s2)
            {
                if (!c.isAdded())
                {
                    return;
                }
                if (e != null)
                {
                    c.startActivityForResult(e, 5020);
                    return;
                }
                if (d != null)
                {
                    c.e();
                    c.c(d);
                    return;
                } else
                {
                    SignInFragment.a(c, a, s2);
                    return;
                }
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj)
            {
                a((String)obj);
            }

            protected final void onPreExecute()
            {
                c.b(c.getString(0x7f070434));
            }

            
            {
                c = SignInFragment.this;
                a = s1;
                b = s2;
                super();
            }
        };
        if (q != null)
        {
            s1 = q;
        } else
        {
            s1 = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        asynctask.executeOnExecutor(s1, new Void[0]);
    }

    private void a(String s1, String s2, DeviceData devicedata)
    {
        m.a(s1, s2, devicedata).a(ico.a()).b(new ick() {

            final SignInFragment a;

            private void a(LoginResponse loginresponse)
            {
                SignInFragment.b(a, "email");
                SignInFragment.d(a).a(loginresponse, SignInFragment.c(a));
            }

            public final void a()
            {
            }

            public final volatile void a(Object obj)
            {
                a((LoginResponse)obj);
            }

            public final void a(Throwable throwable)
            {
                Object obj;
                Error error;
                obj = null;
                error = (Error)throwable;
                if (error.getNetworkError() == null) goto _L2; else goto _L1
_L1:
                throwable = error.getNetworkError().getMessage();
_L4:
                SignInFragment.a(a, throwable);
                return;
_L2:
                if (error.getRealtimeError() != null)
                {
                    throwable = error.getRealtimeError().getMessage();
                } else
                {
                    throwable = obj;
                    if (error.getUnknownError() != null)
                    {
                        throwable = error.getUnknownError().getMessage();
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = SignInFragment.this;
                super();
            }
        });
    }

    private void a(boolean flag, fke fke1)
    {
        if (flag && fke1 != null)
        {
            e("google_plus");
            f.c(fke1);
            return;
        } else
        {
            e();
            fke1 = AnalyticsEvent.create("impression").setName(l.gU).setValue("google_plus");
            c.a(fke1);
            dwm.a(getActivity(), u);
            a(0x7f0702a9);
            return;
        }
    }

    private void b()
    {
        if (i.b(dbf.U))
        {
            String s1 = getString(0x7f070777);
            try
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)));
                return;
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                c(getString(0x7f070304, new Object[] {
                    s1
                }));
            }
            return;
        } else
        {
            startActivityForResult(ForgotPasswordActivity.a(getActivity(), mEditTextEmail.i().toString()), 4000);
            return;
        }
    }

    static void b(SignInFragment signinfragment)
    {
        signinfragment.b();
    }

    public static void b(SignInFragment signinfragment, String s1)
    {
        signinfragment.e(s1);
    }

    private void b(String s1, String s2)
    {
        u = s2;
        if (!j.d())
        {
            l.i(s1, s2);
            return;
        } else
        {
            s = m.a(s1, s2).a(ico.a()).a(new fjv(this, (byte)0));
            return;
        }
    }

    public static boolean c(SignInFragment signinfragment)
    {
        return signinfragment.p;
    }

    static fjw d(SignInFragment signinfragment)
    {
        return signinfragment.t;
    }

    private void d(String s1)
    {
        e();
        c.a(l.gR);
        String s3 = getString(0x7f0702f8);
        String s4 = getString(0x7f0702aa);
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = getString(0x7f0702a5);
        }
        dtp.a(d(), 0, s4, s2, s3);
    }

    public static void e(SignInFragment signinfragment)
    {
        signinfragment.g();
    }

    private void e(String s1)
    {
        s1 = AnalyticsEvent.create("impression").setName(l.gV).setValue(s1);
        c.a(s1);
    }

    public static ThirdPartyToken f(SignInFragment signinfragment)
    {
        return signinfragment.v;
    }

    private void g()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.gU).setValue("facebook");
        c.a(analyticsevent);
        e();
        a(0x7f0702a8);
    }

    public static boolean g(SignInFragment signinfragment)
    {
        return signinfragment.h();
    }

    public static void h(SignInFragment signinfragment)
    {
        signinfragment.j();
    }

    private boolean h()
    {
        return d.a();
    }

    private void i()
    {
        if ("CHINA".equals(k.a()))
        {
            mViewGroupThirdPartySignIn.setVisibility(8);
            i.a(n);
            return;
        } else
        {
            mViewGroupThirdPartySignIn.setVisibility(0);
            mViewGroupThirdPartyGeneral.setVisibility(0);
            mViewGroupThirdPartyChina.setVisibility(8);
            j();
            return;
        }
    }

    private void j()
    {
        mViewGroupThirdPartySignIn.setFocusable(true);
        mViewGroupThirdPartySignIn.setFocusableInTouchMode(true);
        mViewGroupThirdPartySignIn.setOnClickListener(null);
    }

    private void k()
    {
        b(getString(0x7f070434));
        if (!j.d())
        {
            l.g(v.e(), v.d());
            return;
        } else
        {
            r = m.b("facebook", v.d()).a(ico.a()).a(new fju(this, (byte)0));
            return;
        }
    }

    private void l()
    {
        startActivityForResult(new Intent(getActivity(), com/ubercab/client/core/vendor/alipay/AlipayAuthorizationActivity), 1001);
    }

    private void m()
    {
        startActivityForResult(new Intent(getActivity(), com/ubercab/client/core/vendor/baidu/BaiduAuthorizationActivity), 1002);
    }

    private void n()
    {
        startActivityForResult(new Intent(getActivity(), com/ubercab/client/core/vendor/facebook/FacebookAuthorizationActivity), 1);
    }

    private void o()
    {
        Account aaccount[] = AccountManager.get(getActivity()).getAccountsByType("com.google");
        if (aaccount.length == 1)
        {
            a(aaccount[0].name);
            return;
        } else
        {
            startActivityForResult(rt.a(new String[] {
                "com.google"
            }), 5020);
            return;
        }
    }

    private void p()
    {
        hsj hsj1 = (new hsj()).a(mEditTextPassword, new duw(new hrs(0x7f07030c)));
        if (!i.a(dbf.at))
        {
            hsj1.a(mEditTextEmail, new hrx(new hrs(0x7f07039f), new hrs(0x7f070287)));
        } else
        if (mEditEmailPhoneNumber.d() == gph.a)
        {
            hsj1.a(mEditEmailPhoneNumber, new hrx(new hrs(0x7f07039f), new hrs(0x7f070287)));
        } else
        {
            hsj1.a(mEditEmailPhoneNumber, new hrt() {

                final SignInFragment a;

                private static hrs a(EmailPhoneNumberView emailphonenumberview)
                {
                    bmr bmr1 = bmr.a();
                    if (bmr1.a(bmr1.a(emailphonenumberview.e(), emailphonenumberview.c().toString())))
                    {
                        return null;
                    }
                    try
                    {
                        emailphonenumberview = new hrs(0x7f070288);
                    }
                    // Misplaced declaration of an exception variable
                    catch (EmailPhoneNumberView emailphonenumberview)
                    {
                        return new hrs(0x7f070288);
                    }
                    return emailphonenumberview;
                }

                public final volatile Object a(Object obj)
                {
                    return a((EmailPhoneNumberView)obj);
                }

            
            {
                a = SignInFragment.this;
                super();
            }
            });
        }
        if (hsj1.a().isEmpty())
        {
            cwz.b(getActivity(), mEditTextPassword);
            q();
        }
    }

    private void q()
    {
        b(getString(0x7f070434));
        if (!i.a(dbf.at))
        {
            String s1 = mEditTextEmail.i().toString();
            String s4 = mEditTextPassword.i().toString();
            if (j.j())
            {
                a(s1, s4, (DeviceData)h.a());
                return;
            } else
            {
                l.e(s1, s4);
                return;
            }
        }
        if (mEditEmailPhoneNumber.d() == gph.a)
        {
            String s2 = mEditEmailPhoneNumber.a().toString();
            String s5 = mEditTextPassword.i().toString();
            g.a(s2);
            if (j.j())
            {
                a(s2, s5, (DeviceData)h.a());
                return;
            } else
            {
                l.e(s2, s5);
                return;
            }
        }
        String s3 = mEditEmailPhoneNumber.f();
        String s6 = mEditTextPassword.i().toString();
        g.a(mEditEmailPhoneNumber.e());
        if (j.j())
        {
            a(s3, s6, (DeviceData)h.a());
            return;
        } else
        {
            l.f(s3, s6);
            return;
        }
    }

    private fjx r()
    {
        return fjk.a().a(new djb(this)).a((fjq)((RiderActivity)getActivity()).d()).a();
    }

    protected final czj a(dfp dfp)
    {
        return r();
    }

    final String a(String s1, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("suppressProgressScreen", true);
        return rq.a(getActivity(), s1, s2, bundle);
    }

    public final volatile void a(czj czj)
    {
        a((fjx)czj);
    }

    public final cic f()
    {
        return l.gQ;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 != 5020 || j1 != -1) goto _L2; else goto _L1
_L1:
        a(intent.getStringExtra("authAccount"));
_L4:
        return;
_L2:
        if (i1 == 1 && j1 == -1)
        {
            String s1 = intent.getStringExtra("token");
            if (TextUtils.isEmpty(s1))
            {
                e();
                a(0x7f0702a8);
                return;
            } else
            {
                v = ThirdPartyToken.a("facebook", s1, intent.getLongExtra("tokenExpiry", 0L));
                k();
                return;
            }
        }
        if (i1 == 10 && j1 == -1)
        {
            p = true;
            n();
            return;
        }
        if (i1 == 1002 && j1 == -1)
        {
            intent = (ThirdPartyToken)intent.getParcelableExtra("com.ubercab.ACCESS_TOKEN");
            startActivityForResult(SignInWithBaiduActivity.a(getActivity(), intent), 2002);
            return;
        }
        if (i1 == 2002)
        {
            if (j1 == 1001)
            {
                e("baidu");
                o.add(new fke());
                return;
            } else
            {
                a(0x7f0702a7);
                return;
            }
        }
        if (i1 != 1001 || j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        intent = (AlipayAuthResult)intent.getParcelableExtra("alipay_auth_result");
        if (intent != null && "9000".equals(intent.getResultStatus()))
        {
            intent = ThirdPartyToken.a("alipay", null, 60000L, null, intent.getAuthCode());
            if (intent.f())
            {
                startActivityForResult(SignInWithAlipayActivity.a(getActivity(), intent), 2001);
                return;
            } else
            {
                a(0x7f0702a6);
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i1 == 2001)
        {
            if (j1 == 1001)
            {
                e("alipay");
                o.add(new fke());
                return;
            }
            if (j1 == -1)
            {
                intent = (SignupData)intent.getParcelableExtra("com.ubercab.SIGNUP_DATA");
                if (intent != null && intent.m() != null)
                {
                    Intent intent1 = new Intent(getActivity(), com/ubercab/client/feature/signup/SignupActivity);
                    intent1.putExtra("com.ubercab.ALIPAY_SIGNUP_THIRDPARTY", intent);
                    startActivityForResult(intent1, 3001);
                } else
                {
                    a(0x7f0702a6);
                }
                e();
                return;
            } else
            {
                a(0x7f0702a6);
                return;
            }
        }
        if (i1 == 3001 && j1 == -1)
        {
            o.add(new fke());
            return;
        }
        if (i1 == 4000 && j1 == -1)
        {
            mEditTextEmail.d(intent.getStringExtra("com.ubercab.rds.EMAIL"));
            return;
        }
        if (i1 != 4001 || j1 != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        mEditTextEmail.d(intent.getStringExtra("com.ubercab.rds.EMAIL"));
        mEditTextPassword.d(intent.getStringExtra("com.ubercab.rds.PASSWORD"));
        if (TextUtils.isEmpty(mEditTextEmail.i()) || TextUtils.isEmpty(mEditTextPassword.i())) goto _L4; else goto _L5
_L5:
        p();
        return;
        if (j1 != 0) goto _L4; else goto _L6
_L6:
        e();
        return;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        t = (fjw)activity;
    }

    public void onClickButtonAlipay()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fO).setValue("alipay");
        c.a(analyticsevent);
        l();
    }

    public void onClickButtonBaidu()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fO).setValue("baidu");
        c.a(analyticsevent);
        m();
    }

    public void onClickButtonFacebook()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fO).setValue("facebook");
        c.a(analyticsevent);
        n();
    }

    public void onClickButtonGoogle()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("tap").setName(n.fO).setValue("google_plus");
        c.a(analyticsevent);
        o();
    }

    public void onClickButtonNext()
    {
        if (!i.a(dbf.at))
        {
            c.a(n.fG);
        } else
        {
            Object obj;
            if (mEditEmailPhoneNumber.d() == gph.a)
            {
                obj = "email";
            } else
            {
                obj = "phone";
            }
            obj = AnalyticsEvent.create("tap").setName(n.fG).setValue(((String) (obj)));
            c.a(((AnalyticsEvent) (obj)));
        }
        p();
    }

    public void onClickForgotPassword()
    {
        if (!i.a(dbf.y))
        {
            c.a(n.fH);
            b();
            return;
        } else
        {
            Object obj = AnalyticsEvent.create("tap").setName(n.fH).setValue("selection");
            c.a(((AnalyticsEvent) (obj)));
            Object obj1 = LayoutInflater.from(getActivity());
            obj = new android.app.AlertDialog.Builder(getActivity());
            obj1 = ((LayoutInflater) (obj1)).inflate(0x7f030182, null);
            ((android.app.AlertDialog.Builder) (obj)).setView(((View) (obj1)));
            obj = ((android.app.AlertDialog.Builder) (obj)).create();
            ((View) (obj1)).findViewById(0x7f0e049f).setOnClickListener(new android.view.View.OnClickListener(((AlertDialog) (obj))) {

                final AlertDialog a;
                final SignInFragment b;

                public final void onClick(View view)
                {
                    view = AnalyticsEvent.create("tap").setName(n.bQ).setValue("email");
                    b.c.a(view);
                    SignInFragment.b(b);
                    a.dismiss();
                }

            
            {
                b = SignInFragment.this;
                a = alertdialog;
                super();
            }
            });
            ((View) (obj1)).findViewById(0x7f0e04a0).setOnClickListener(new android.view.View.OnClickListener(((AlertDialog) (obj))) {

                final AlertDialog a;
                final SignInFragment b;

                public final void onClick(View view)
                {
                    view = AnalyticsEvent.create("tap").setName(n.bQ).setValue("phone");
                    b.c.a(view);
                    view = new Intent(b.getActivity(), com/ubercab/client/feature/passwordreset/PasswordResetActivity);
                    b.startActivity(view);
                    a.dismiss();
                }

            
            {
                b = SignInFragment.this;
                a = alertdialog;
                super();
            }
            });
            ((AlertDialog) (obj)).show();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle == null)
        {
            a();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030183, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        mEditTextPassword.a(new android.widget.TextView.OnEditorActionListener() {

            final SignInFragment a;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                if (i1 == 6)
                {
                    if (a.i.a(dbf.at))
                    {
                        if (a.mEditEmailPhoneNumber.d() == gph.a)
                        {
                            textview = "email";
                        } else
                        {
                            textview = "phone";
                        }
                        textview = textview.concat(",keyboard");
                        textview = AnalyticsEvent.create("tap").setName(n.fG).setValue(textview);
                        a.c.a(textview);
                    }
                    SignInFragment.a(a);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = SignInFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
        i.b(n);
    }

    public void onLoginFacebookResponseEvent(dnm dnm1)
    {
        if (!dnm1.e())
        {
            g();
            return;
        }
        dnm1 = (Ping)dnm1.g();
        if (dul.a(dnm1) || dnm1.getThirdPartyConnected())
        {
            e("facebook");
            f.c(new fke(p));
            return;
        }
        if (dnm1.getSignupFieldsRequired() != null)
        {
            dnm1 = dnm1.getSignupFieldsRequired();
            dnm1 = SignupData.n().e((String)dnm1.get("firstName")).f((String)dnm1.get("lastName")).a((String)dnm1.get("email")).a(v);
            Object obj = (TelephonyManager)getActivity().getSystemService("phone");
            if (!TextUtils.isEmpty(((TelephonyManager) (obj)).getLine1Number()) && !TextUtils.isEmpty(((TelephonyManager) (obj)).getSimCountryIso()))
            {
                dnm1.b(duj.b(((TelephonyManager) (obj)).getLine1Number(), ((TelephonyManager) (obj)).getSimCountryIso()));
                dnm1.c(((TelephonyManager) (obj)).getSimCountryIso().toUpperCase(Locale.US));
            }
            obj = new Intent(getActivity(), com/ubercab/client/feature/signup/SignupActivity);
            ((Intent) (obj)).putExtra("com.ubercab.THIRD_PARTY_PROFILE", dnm1);
            startActivityForResult(((Intent) (obj)), 10);
            e();
            return;
        } else
        {
            g();
            return;
        }
    }

    public void onLoginGoogleResponseEvent(dmi dmi1)
    {
        a(dmi1.e(), new fke());
    }

    public void onLoginResponseEvent(dmj dmj1)
    {
        if (dmj1.e())
        {
            e("email");
            f.c(new fke());
            return;
        } else
        {
            d(dmj1.a(getActivity()));
            return;
        }
    }

    public void onPause()
    {
        super.onPause();
        if (r != null)
        {
            r.b();
        }
        if (s != null)
        {
            s.b();
        }
    }

    public void onResume()
    {
        super.onResume();
        for (; !o.isEmpty(); f.c(o.remove())) { }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mButtonForgotPassword.setPaintFlags(mButtonForgotPassword.getPaintFlags() | 8);
        view = g.a();
        if (!i.a(dbf.at))
        {
            mEditTextEmail.a(view);
            mEditTextEmail.setVisibility(0);
            mEditEmailPhoneNumber.setVisibility(8);
        } else
        {
            mEditEmailPhoneNumber.a(new ArrayAdapter(d(), 0x1090003, view));
            mEditTextEmail.setVisibility(8);
            mEditEmailPhoneNumber.setVisibility(0);
            c.a(l.gW);
        }
        i();
    }
}
