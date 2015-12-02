// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.launch;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import butterknife.ButterKnife;
import chp;
import cic;
import ciz;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.employee.EmployeeSettingsActivity;
import com.ubercab.client.feature.payment.amex.AmexRewardInfoActivity;
import com.ubercab.client.feature.signin.SignInActivity;
import com.ubercab.client.feature.signup.SignupActivity;
import com.ubercab.client.feature.signup.paytm.SignupPaytmOtpActivity;
import com.ubercab.client.feature.trip.TripActivity;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import czj;
import dak;
import dal;
import dao;
import dbf;
import dbm;
import dfe;
import dfp;
import dun;
import edr;
import eds;
import eec;
import gmg;
import hkr;
import ijg;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l;
import n;

public class MagicActivity extends RiderActivity
{

    private static final Pattern o = Pattern.compile("[a-zA-Z0-9]+");
    public chp h;
    public hkr i;
    public gmg j;
    public dak k;
    public dal l;
    public dao m;
    Button mButtonDevServer;
    ImageView mImageViewSplash;
    TextView mTextViewSlogan;
    ViewGroup mViewGroupEmployee;
    public UspoutClient n;

    public MagicActivity()
    {
    }

    static void a(MagicActivity magicactivity)
    {
        magicactivity.i();
    }

    private void a(eec eec1)
    {
        eec1.a(this);
    }

    private void a(List list)
    {
        if (list != null && !list.isEmpty())
        {
            list = (PaymentProfile)list.get(0);
            if (a(((PaymentProfile) (list))))
            {
                startActivity(AmexRewardInfoActivity.a(this, list));
            }
        }
    }

    private static boolean a(PaymentProfile paymentprofile)
    {
        if (paymentprofile != null)
        {
            if ((paymentprofile = paymentprofile.getRewardInfo()) != null && paymentprofile.isEligible() && !paymentprofile.isEnrolled() && !paymentprofile.hasTakenEnrollAction())
            {
                return true;
            }
        }
        return false;
    }

    private eec b(dfp dfp)
    {
        return edr.a().a(new dfe(this)).a(dfp).a();
    }

    static Pattern f()
    {
        return o;
    }

    private void g()
    {
        if (!j.b(dbf.T)) goto _L2; else goto _L1
_L1:
        setContentView(0x7f030079);
_L4:
        if (!j.b(dbf.T))
        {
            getWindow().getDecorView().setBackgroundColor(getResources().getColor(0x7f0d004b));
        }
        return;
_L2:
        if (j.a(dbf.T, dbm.a))
        {
            setContentView(0x7f03007f);
        } else
        if (j.a(dbf.T, dbm.f))
        {
            setContentView(0x7f030081);
        } else
        if (j.a(dbf.T, dbm.e))
        {
            setContentView(0x7f03007c);
        } else
        if (j.a(dbf.T, dbm.d))
        {
            setContentView(0x7f03007b);
        } else
        if (j.a(dbf.T, dbm.c))
        {
            setContentView(0x7f03007a);
        } else
        if (j.a(dbf.T, dbm.g))
        {
            setContentView(0x7f03007d);
        } else
        if (j.a(dbf.T, dbm.h))
        {
            setContentView(0x7f03007e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void h()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Change Server");
        builder.setMessage("Leave blank for production or enter the EC2 name.");
        EditText edittext = new EditText(this);
        builder.setView(edittext);
        builder.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener(edittext) {

            final EditText a;
            final MagicActivity b;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                String s1 = a.getText().toString();
                if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
                b.m.f();
_L6:
                MagicActivity.a(b);
_L4:
                return;
_L2:
                if (!MagicActivity.f().matcher(s1).matches()) goto _L4; else goto _L3
_L3:
                dialoginterface = "";
                if ("amex".equals(s1))
                {
                    dialoginterface = ":8000";
                }
                b.m.b(String.format("https://cn.%s.dev.uber.com%s", new Object[] {
                    s1, dialoginterface
                }));
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                b = MagicActivity.this;
                a = edittext;
                super();
            }
        });
        builder.setNegativeButton(0x7f0706b6, null);
        builder.show();
    }

    private void i()
    {
        String s1 = m.g();
        if (!TextUtils.isEmpty(s1))
        {
            mButtonDevServer.setText((new StringBuilder("Server: ")).append(s1).toString());
            mButtonDevServer.setVisibility(0);
            return;
        } else
        {
            mButtonDevServer.setVisibility(8);
            return;
        }
    }

    private void j()
    {
        startActivityForResult(new Intent(this, com/ubercab/client/feature/signup/SignupActivity), 2005);
    }

    private void k()
    {
        startActivityForResult(new Intent(this, com/ubercab/client/feature/signin/SignInActivity), 2000);
    }

    private void l()
    {
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("extra_password_reset_email_token"))
        {
            startActivityForResult((new Intent(this, com/ubercab/client/feature/signin/SignInActivity)).putExtra("extra_password_reset_email_token", intent.getStringExtra("extra_password_reset_email_token")), 2000);
            intent.removeExtra("extra_password_reset_email_token");
        }
    }

    private void m()
    {
        com.ubercab.android.location.UberLocation uberlocation;
        if (k.c() != null)
        {
            uberlocation = k.c().getLocation();
        } else
        {
            uberlocation = null;
        }
        mTextViewSlogan.setText(dun.a(this, uberlocation));
    }

    private void n()
    {
        String s1 = getIntent().getStringExtra("EXTRA_DEEPLINK_CLIENT_ID");
        if (!TextUtils.isEmpty(s1))
        {
            m.d(s1);
            return;
        } else
        {
            m.m();
            return;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eec)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        g();
        ButterKnife.inject(this);
        i();
        if (j.a(dbf.A))
        {
            n();
        }
        if (bundle == null)
        {
            l();
        }
        try
        {
            if (j.b(dbf.T))
            {
                mImageViewSplash.setImageDrawable(ResourcesCompat.getDrawable(getResources(), 0x7f020085, getTheme()));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            System.gc();
        }
        ijg.d(bundle, "OOM loading background in MagicActivity", new Object[0]);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 2000 && j1 == -1)
        {
            startActivity(new Intent(this, com/ubercab/client/feature/trip/TripActivity));
            intent = i.c();
            if (intent != null)
            {
                intent = AmexRewardInfoActivity.a(intent.getPaymentProfiles());
                if (intent != null)
                {
                    startActivity(AmexRewardInfoActivity.a(this, intent));
                }
            }
            finish();
        } else
        if (i1 == 2005 && j1 == -1)
        {
            startActivity(new Intent(this, com/ubercab/client/feature/trip/TripActivity));
            intent = i.c();
            if (intent != null)
            {
                a(intent.getPaymentProfiles());
                if (SignupPaytmOtpActivity.a(intent.getInactivePaymentProfiles()))
                {
                    startActivity(SignupPaytmOtpActivity.a(this, ((PaymentProfile)intent.getInactivePaymentProfiles().get(0)).getUuid()));
                }
            }
            finish();
            return;
        }
    }

    public void onClickButtonEmployee()
    {
        startActivity(new Intent(this, com/ubercab/client/feature/employee/EmployeeSettingsActivity));
    }

    public void onClickTextViewDevServer()
    {
        h();
    }

    public void onNoLocationEvent(ciz ciz)
    {
        w();
    }

    public void onRegisterButtonClicked()
    {
        h.a(n.fQ);
        l.k(UUID.randomUUID().toString());
        j();
    }

    public void onResume()
    {
        super.onResume();
        if (j.b(dbf.T))
        {
            m();
        }
    }

    public void onSignInButtonClicked()
    {
        h.a(n.jP);
        k();
    }

    public final cic s()
    {
        return l.jD;
    }

}
