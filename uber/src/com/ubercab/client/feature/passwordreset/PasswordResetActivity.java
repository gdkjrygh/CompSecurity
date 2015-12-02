// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.passwordreset;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.PasswordResetResponse;
import com.ubercab.client.core.model.PasswordResetTripVerifyStateData;
import com.ubercab.client.feature.signup.SignupActivity;
import com.ubercab.client.feature.trip.TripActivity;
import czj;
import dfe;
import dfp;
import dkf;
import dkg;
import dkn;
import dtj;
import emb;
import emc;
import emp;
import emq;
import emu;
import enh;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.passwordreset:
//            PasswordResetConfirmTripsFragment, PasswordResetAccountInputFragment, PasswordResetConfirmMobileTokenFragment, PasswordResetConfirmTripsFailedFragment, 
//            PasswordResetNewPasswordFragment

public class PasswordResetActivity extends RiderActivity
{

    public chp h;
    public dkf i;
    public emu j;
    public dkn k;
    dkg l;

    public PasswordResetActivity()
    {
    }

    private void a(PasswordResetResponse passwordresetresponse)
    {
        if (passwordresetresponse == null || passwordresetresponse.getErrorCode() == null || TextUtils.isEmpty(passwordresetresponse.getUserMessage()))
        {
            return;
        } else
        {
            a_(passwordresetresponse.getUserMessage());
            return;
        }
    }

    private void a(emp emp1)
    {
        emp1.a(this);
    }

    private emp b(dfp dfp)
    {
        return emb.a().a(new emq(this)).a(new dfe(this)).a(dfp).a();
    }

    private void b(PasswordResetResponse passwordresetresponse)
    {
        PasswordResetConfirmTripsFragment passwordresetconfirmtripsfragment = (PasswordResetConfirmTripsFragment)a(com/ubercab/client/feature/passwordreset/PasswordResetConfirmTripsFragment);
        Object obj = passwordresetresponse.getTripVerifyStateData();
        passwordresetresponse = ((PasswordResetTripVerifyStateData) (obj)).getTripChallengeId();
        obj = ((PasswordResetTripVerifyStateData) (obj)).getTripSummary();
        if (passwordresetconfirmtripsfragment == null)
        {
            a(0x7f0e027c, PasswordResetConfirmTripsFragment.a(passwordresetresponse, ((com.ubercab.rds.core.model.TripSummary) (obj))), true);
        } else
        {
            passwordresetconfirmtripsfragment.b(passwordresetresponse, ((com.ubercab.rds.core.model.TripSummary) (obj)));
        }
        if (j.c().booleanValue())
        {
            j.b(Boolean.valueOf(false));
            dtj.a(this, 2, getString(0x7f070038).toUpperCase(), getString(0x7f07031e), getString(0x7f0700b1).toUpperCase(), getString(0x7f07007b).toUpperCase(), false);
        }
    }

    private void g()
    {
        dtj.a(this, 1, null, getString(0x7f070312), getString(0x7f070674), getString(0x7f0702cd), false);
    }

    private void h()
    {
        if (a(com/ubercab/client/feature/passwordreset/PasswordResetAccountInputFragment) == null)
        {
            a(0x7f0e027c, PasswordResetAccountInputFragment.a(), true);
        }
    }

    private void i()
    {
        if (a(com/ubercab/client/feature/passwordreset/PasswordResetConfirmMobileTokenFragment) == null)
        {
            a(0x7f0e027c, PasswordResetConfirmMobileTokenFragment.a(), true);
        }
    }

    private void j()
    {
        if (a(com/ubercab/client/feature/passwordreset/PasswordResetConfirmTripsFailedFragment) == null)
        {
            a(0x7f0e027c, PasswordResetConfirmTripsFailedFragment.a(), true);
        }
    }

    private void k()
    {
        if (a(com/ubercab/client/feature/passwordreset/PasswordResetNewPasswordFragment) == null)
        {
            a(0x7f0e027c, PasswordResetNewPasswordFragment.a(), true);
        }
    }

    private void l()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.dE);
        if (j.b().booleanValue())
        {
            analyticsevent.setValue("succeeded_reset");
            h.a(analyticsevent);
            startActivityForResult(new Intent(this, com/ubercab/client/feature/signup/SignupActivity), 3005);
            return;
        } else
        {
            analyticsevent.setValue("succeeded_restore");
            h.a(analyticsevent);
            setResult(-1);
            finish();
            return;
        }
    }

    private void m()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.dE).setValue("failed");
        h.a(analyticsevent);
        (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f07031f)).setMessage(getString(0x7f070316)).setPositiveButton(0x1040013, new android.content.DialogInterface.OnClickListener() {

            final PasswordResetActivity a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                a.setResult(0);
                a.finish();
            }

            
            {
                a = PasswordResetActivity.this;
                super();
            }
        }).show();
    }

    private void n()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.dE).setValue("locked");
        h.a(analyticsevent);
        (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f07031f)).setMessage(getString(0x7f07030f)).setPositiveButton(0x1040013, new android.content.DialogInterface.OnClickListener() {

            final PasswordResetActivity a;

            public final void onClick(DialogInterface dialoginterface, int i1)
            {
                a.setResult(0);
                a.finish();
            }

            
            {
                a = PasswordResetActivity.this;
                super();
            }
        }).show();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        if (j1 == -1)
        {
            setResult(0);
            finish();
        }
_L4:
        return;
_L2:
        if (i1 != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j1 != 0) goto _L4; else goto _L3
_L3:
        setResult(0);
        finish();
        return;
        if (i1 != 3) goto _L4; else goto _L5
_L5:
        if (j1 == -1)
        {
            j.a(Boolean.valueOf(true));
            i.b(j.a());
            b(getString(0x7f070296), null);
            return;
        } else
        {
            setResult(0);
            finish();
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((emp)czj);
    }

    final void a(enh enh1)
    {
        PasswordResetResponse passwordresetresponse;
        byte byte0;
        u();
        passwordresetresponse = enh1.a();
        a(passwordresetresponse);
        if (passwordresetresponse == null)
        {
            enh1 = null;
        } else
        {
            enh1 = passwordresetresponse.getServerState();
        }
        if (enh1 == null)
        {
            h();
            return;
        }
        byte0 = -1;
        enh1.hashCode();
        JVM INSTR lookupswitch 8: default 116
    //                   -1776484596: 230
    //                   -859112702: 200
    //                   -666614992: 245
    //                   -402310107: 185
    //                   391340525: 260
    //                   824943724: 215
    //                   1191204270: 276
    //                   1766338564: 170;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_276;
_L10:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            h();
            return;

        case 1: // '\001'
            i();
            return;

        case 2: // '\002'
            b(passwordresetresponse);
            return;

        case 3: // '\003'
            j();
            return;

        case 4: // '\004'
            k();
            return;

        case 5: // '\005'
            l();
            return;

        case 6: // '\006'
            n();
            return;

        case 7: // '\007'
            m();
            break;
        }
        break MISSING_BLOCK_LABEL_327;
_L9:
        if (enh1.equals("PasswordResetState.NOT_STARTED"))
        {
            byte0 = 0;
        }
          goto _L10
_L5:
        if (enh1.equals("PasswordResetState.MOBILE_VERIFY"))
        {
            byte0 = 1;
        }
          goto _L10
_L3:
        if (enh1.equals("PasswordResetState.TRIP_VERIFY"))
        {
            byte0 = 2;
        }
          goto _L10
_L7:
        if (enh1.equals("PasswordResetState.RESET_ACCOUNT"))
        {
            byte0 = 3;
        }
          goto _L10
_L2:
        if (enh1.equals("PasswordResetState.CREATE_NEW_PASSWORD"))
        {
            byte0 = 4;
        }
          goto _L10
_L4:
        if (enh1.equals("PasswordResetState.SUCCEEDED"))
        {
            byte0 = 5;
        }
          goto _L10
_L6:
        if (enh1.equals("PasswordResetState.ACCOUNT_LOCKED"))
        {
            byte0 = 6;
        }
          goto _L10
        if (enh1.equals("PasswordResetState.FAILED"))
        {
            byte0 = 7;
        }
          goto _L10
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300e9);
        j.a(getIntent().getStringExtra("com.ubercab.SIGNIN_PHONE_NUMBER_E164"));
        l = new dkg() {

            final PasswordResetActivity a;

            public final void a()
            {
                a.f();
            }

            public final void a(enh enh1)
            {
                a.a(enh1);
            }

            
            {
                a = PasswordResetActivity.this;
                super();
            }
        };
        h();
    }

    final void f()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.dE).setValue("error");
        h.a(analyticsevent);
        u();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 3005 && j1 == -1)
        {
            startActivity(new Intent(this, com/ubercab/client/feature/trip/TripActivity));
        }
        finish();
    }

    public void onBackPressed()
    {
        g();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            h.a(n.bP);
            break;
        }
        g();
        return true;
    }

    public void onPause()
    {
        super.onPause();
        i.a(null);
    }

    public void onResume()
    {
        super.onResume();
        i.a(l);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
