// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.payment.AddPaymentActivity;
import com.ubercab.client.feature.payment.PaymentActivity;
import com.ubercab.rider.realtime.model.Profile;
import cwz;
import czj;
import czq;
import dfe;
import dfp;
import dns;
import dtg;
import exn;
import exo;
import eyg;
import eyh;
import eyy;
import ezn;
import ezr;
import ijg;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            ReportIntervalFragment, EditEmailFragment

public class EditProfileFieldActivity extends RiderActivity
{

    public czq h;
    public eyy i;
    private ProgressDialog j;
    private eyh k;
    private Profile l;

    public EditProfileFieldActivity()
    {
    }

    public static Intent a(Context context, Profile profile)
    {
        return (new Intent(context, com/ubercab/client/feature/profiles/EditProfileFieldActivity)).setAction("ACTION_EDIT_SUMMARY_REPORTS").putExtra("EXTRA_TROY_PROFILE_UUID", profile.getUuid()).putExtra("EXTRA_ON_SAVE_ACTION_MODE", eyh.a);
    }

    public static Intent a(Context context, Profile profile, eyh eyh1)
    {
        return (new Intent(context, com/ubercab/client/feature/profiles/EditProfileFieldActivity)).setAction("ACTION_EDIT_EMAIL").putExtra("EXTRA_TROY_PROFILE_UUID", profile.getUuid()).putExtra("EXTRA_ON_SAVE_ACTION_MODE", eyh1);
    }

    static void a(EditProfileFieldActivity editprofilefieldactivity)
    {
        editprofilefieldactivity.f();
    }

    private void a(Profile profile)
    {
        if (a(com/ubercab/client/feature/profiles/ReportIntervalFragment) == null)
        {
            a(0x7f0e009b, ((android.support.v4.app.Fragment) (ReportIntervalFragment.a(profile))), true);
        }
    }

    private void a(eyg eyg1)
    {
        eyg1.a(this);
    }

    private eyg b(dfp dfp)
    {
        return exn.a().a(new dfe(this)).a(dfp).a();
    }

    private void b(Profile profile)
    {
        if (a(com/ubercab/client/feature/profiles/EditEmailFragment) == null)
        {
            a(0x7f0e009b, EditEmailFragment.a(profile), true);
        }
    }

    private void f()
    {
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[eyh.values().length];
                try
                {
                    a[eyh.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[eyh.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[eyh.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[k.ordinal()])
        {
        default:
            setResult(-1);
            finish();
            return;

        case 1: // '\001'
            startActivityForResult(AddPaymentActivity.a(this, l), 2000);
            return;

        case 2: // '\002'
            startActivityForResult(PaymentActivity.a(this, null, l), 2000);
            break;
        }
    }

    private void g()
    {
        j = dtg.a(this, getString(0x7f07063b));
        j.show();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eyg)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030031);
        bundle = getIntent().getStringExtra("EXTRA_TROY_PROFILE_UUID");
        l = i.a(bundle);
        if (l == null)
        {
            ijg.d((new StringBuilder("Null Profile in EditProfileField with uuid = ")).append(bundle).toString(), new Object[0]);
            setResult(-99);
            finish();
        } else
        {
            k = (eyh)getIntent().getSerializableExtra("EXTRA_ON_SAVE_ACTION_MODE");
            bundle = getIntent().getAction();
            if ("ACTION_EDIT_SUMMARY_REPORTS".equals(bundle))
            {
                a(l);
                return;
            }
            if ("ACTION_EDIT_EMAIL".equals(bundle))
            {
                b(l);
                return;
            }
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(h);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 2000 && j1 == -1)
        {
            setResult(j1, intent);
            finish();
        }
    }

    public void onEditEmailCompleteEvent(ezn ezn1)
    {
        cwz.a(this);
        g();
        i.b(l, ezn1.a());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onReportIntervalCompleteEvent(ezr ezr1)
    {
        g();
        i.a(l, ezr1.a());
    }

    public void onUpdateProfileResponseEvent(dns dns1)
    {
        if (j == null)
        {
            return;
        } else
        {
            boolean flag = dns1.k();
            j.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(flag) {

                final boolean a;
                final EditProfileFieldActivity b;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    if (a)
                    {
                        b.a_(b.getString(0x7f070639));
                        return;
                    } else
                    {
                        EditProfileFieldActivity.a(b);
                        return;
                    }
                }

            
            {
                b = EditProfileFieldActivity.this;
                a = flag;
                super();
            }
            });
            j.dismiss();
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
