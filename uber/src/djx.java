// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64;
import com.ubercab.client.core.model.MobileVerificationRequest;
import com.ubercab.client.core.model.RiderAccount;
import com.ubercab.client.core.model.RiderAccountPicture;
import com.ubercab.client.core.model.RiderPassword;
import com.ubercab.client.core.network.AccountApi;
import java.util.Locale;
import retrofit.Callback;
import retrofit.ResponseCallback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class djx
{

    private final AccountApi a;
    private final cev b;
    private final ResponseCallback c = new ResponseCallback() {

        final djx a;

        public final void failure(RetrofitError retrofiterror)
        {
            djx.a(a).c(new dmw(true));
        }

        public final void success(Response response)
        {
            cev cev1 = djx.a(a);
            boolean flag;
            if (response.getStatus() == 200)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cev1.c(new dmw(flag));
        }

            
            {
                a = djx.this;
                super();
            }
    };

    public djx(cev cev, AccountApi accountapi)
    {
        b = cev;
        a = accountapi;
    }

    static cev a(djx djx1)
    {
        return djx1.b;
    }

    public final void a(String s)
    {
        Callback callback = new Callback() {

            final djx a;

            private void a(RiderAccount rideraccount, Response response)
            {
                djx.a(a).c(new dlv(rideraccount, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                djx.a(a).c(new dlv(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((RiderAccount)obj, response);
            }

            
            {
                a = djx.this;
                super();
            }
        };
        a.getAccount(s, callback);
    }

    public final void a(String s, String s1)
    {
        s1 = gkg.a("mobileToken", s1);
        a.verifyMobile(s, s1, c);
    }

    public final void a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        s1 = RiderAccount.create(s1, s2, s3, s4, s5);
        s2 = new Callback() {

            final djx a;

            private void a(RiderAccount rideraccount, Response response)
            {
                djx.a(a).c(new dnq(rideraccount, response));
            }

            public final void failure(RetrofitError retrofiterror)
            {
                djx.a(a).c(new dnq(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                a((RiderAccount)obj, response);
            }

            
            {
                a = djx.this;
                super();
            }
        };
        a.updateAccount(s, s1, s2);
    }

    public final void a(byte abyte0[])
    {
        abyte0 = RiderAccountPicture.create(Base64.encodeToString(abyte0, 0));
        Callback callback = new Callback() {

            final djx a;

            public final void failure(RetrofitError retrofiterror)
            {
                djx.a(a).c(new dnu(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                djx.a(a).c(new dnu(obj, response));
            }

            
            {
                a = djx.this;
                super();
            }
        };
        a.uploadAccountPicture(abyte0, callback);
    }

    public final void b(String s)
    {
        s = RiderPassword.create("client", "android", s);
        Callback callback = new Callback() {

            final djx a;

            public final void failure(RetrofitError retrofiterror)
            {
                djx.a(a).c(new dnx(retrofiterror));
            }

            public final void success(Object obj, Response response)
            {
                djx.a(a).c(new dnx(obj, response));
            }

            
            {
                a = djx.this;
                super();
            }
        };
        a.verifyPassword(s, callback);
    }

    public final boolean b(String s, String s1)
    {
        boolean flag = false;
        s1 = gkg.a("mobileToken", s1);
        int i;
        try
        {
            i = a.verifyMobile(s, s1).getStatus();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (i == 200)
        {
            flag = true;
        }
        return flag;
    }

    public final void c(String s)
    {
        s = MobileVerificationRequest.create(s, "default_verification", Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        a.requestMobileConfirmation(s, c);
    }

    public final void d(String s)
    {
        s = MobileVerificationRequest.create(s, "voice_verification", Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        a.requestMobileConfirmation(s, c);
    }
}
