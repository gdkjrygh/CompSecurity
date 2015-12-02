// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.alipay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.AlipaySignature;
import com.ubercab.client.core.vendor.alipay.model.AlipayAuthResult;
import czj;
import dfe;
import dfp;
import djy;
import dkz;
import dvg;
import dvh;
import dvm;
import dvn;
import dvo;
import iu;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import l;

public class AlipayAuthorizationActivity extends RiderActivity
{

    private static final SimpleDateFormat m;
    private static final TimeZone n;
    public djy h;
    public chp i;
    public iu j;
    public cev k;
    public ExecutorService l;
    private String o;

    public AlipayAuthorizationActivity()
    {
    }

    private static String a(Date date)
    {
        return m.format(date);
    }

    static void a(AlipayAuthorizationActivity alipayauthorizationactivity, AlipayAuthResult alipayauthresult)
    {
        alipayauthorizationactivity.a(alipayauthresult);
    }

    private void a(AlipayAuthResult alipayauthresult)
    {
        if (isFinishing())
        {
            return;
        }
        boolean flag = "9000".equals(alipayauthresult.getResultStatus());
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("impression").setName(l.gX);
        Object obj;
        if (flag)
        {
            obj = "success";
        } else
        {
            obj = "failure";
        }
        obj = analyticsevent.setValue(((String) (obj)));
        i.a(((AnalyticsEvent) (obj)));
        obj = new Intent();
        ((Intent) (obj)).putExtra("alipay_auth_result", alipayauthresult);
        setResult(-1, ((Intent) (obj)));
        finish();
    }

    private void a(dvg dvg1)
    {
        dvg1.a(this);
    }

    private dvg b(dfp dfp)
    {
        return dvm.a().a(dfp).a(new dfe(this)).a(new dvh(this)).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dvg)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030034);
        if (bundle == null)
        {
            if (!j.a())
            {
                Toast.makeText(this, 0x7f07005a, 0).show();
                finish();
                return;
            } else
            {
                o = dvo.a(getString(0x7f0706ba), getString(0x7f0706bb), getString(0x7f0706bc), a(new Date()));
                h.a(o);
                return;
            }
        } else
        {
            o = bundle.getString("auth_info");
            return;
        }
    }

    public void onAlipaySignatureResponseEvent(dkz dkz1)
    {
        if (!dkz1.i() || dkz1.g() == null)
        {
            Toast.makeText(this, 0x7f070056, 1).show();
            finish();
            return;
        }
        try
        {
            dkz1 = (new StringBuilder()).append(o).append(String.format("&sign=\"%s\"&sign_type=\"RSA\"", new Object[] {
                URLEncoder.encode(((AlipaySignature)dkz1.g()).getSignature(), "UTF-8")
            })).toString();
        }
        // Misplaced declaration of an exception variable
        catch (dkz dkz1)
        {
            finish();
            return;
        }
        l.submit(new Runnable(dkz1) {

            final String a;
            final AlipayAuthorizationActivity b;

            public final void run()
            {
                AlipayAuthResult alipayauthresult = AlipayAuthResult.createFromRaw(b.j.a(a));
                b.runOnUiThread(new Runnable(this, alipayauthresult) {

                    final AlipayAuthResult a;
                    final _cls1 b;

                    public final void run()
                    {
                        AlipayAuthorizationActivity.a(b.b, a);
                    }

            
            {
                b = _pcls1;
                a = alipayauthresult;
                super();
            }
                });
            }

            
            {
                b = AlipayAuthorizationActivity.this;
                a = s1;
                super();
            }
        });
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("auth_info", o);
        super.onSaveInstanceState(bundle);
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    static 
    {
        m = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        n = TimeZone.getTimeZone("GMT+8");
        m.setTimeZone(n);
    }
}
