// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ubercab.client.feature.signin.SignInFragment;
import com.ubercab.client.feature.signup.SignupActivity;
import com.ubercab.client.feature.signup.SignupData;
import com.ubercab.rider.realtime.response.ThirdParty;
import java.util.Locale;
import java.util.Map;

public final class fju
    implements icg
{

    final SignInFragment a;

    private fju(SignInFragment signinfragment)
    {
        a = signinfragment;
        super();
    }

    public fju(SignInFragment signinfragment, byte byte0)
    {
        this(signinfragment);
    }

    private void a(ThirdParty thirdparty)
    {
        if (!TextUtils.isEmpty(thirdparty.getToken()))
        {
            SignInFragment.b(a, "facebook");
            a.f.c(new fke(SignInFragment.c(a), thirdparty.getUuid(), thirdparty.getToken()));
            return;
        }
        if (thirdparty.getSignupAttributes() != null)
        {
            thirdparty = thirdparty.getSignupAttributes();
            thirdparty = SignupData.n().e((String)thirdparty.get("firstName")).f((String)thirdparty.get("lastName")).a((String)thirdparty.get("email")).a(SignInFragment.f(a));
            Object obj = (TelephonyManager)a.getActivity().getSystemService("phone");
            if (!TextUtils.isEmpty(((TelephonyManager) (obj)).getLine1Number()) && !TextUtils.isEmpty(((TelephonyManager) (obj)).getSimCountryIso()))
            {
                thirdparty.b(duj.b(((TelephonyManager) (obj)).getLine1Number(), ((TelephonyManager) (obj)).getSimCountryIso()));
                thirdparty.c(((TelephonyManager) (obj)).getSimCountryIso().toUpperCase(Locale.US));
            }
            obj = new Intent(a.getActivity(), com/ubercab/client/feature/signup/SignupActivity);
            ((Intent) (obj)).putExtra("com.ubercab.THIRD_PARTY_PROFILE", thirdparty);
            a.startActivityForResult(((Intent) (obj)), 10);
            a.e();
            return;
        } else
        {
            SignInFragment.e(a);
            return;
        }
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
        a((ThirdParty)obj);
    }

    public final void a(Throwable throwable)
    {
        SignInFragment.e(a);
    }
}
