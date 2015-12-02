// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.model.ClientSignupResponse;
import java.util.Map;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dlh extends dmx
{

    private final String a;
    private final String b;
    private final boolean c;
    private Map d;

    public dlh(String s, String s1, boolean flag, ClientSignupResponse clientsignupresponse, Response response)
    {
        super(clientsignupresponse, response);
        a = s;
        c = flag;
        b = s1;
    }

    public dlh(String s, String s1, boolean flag, RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = s;
        c = flag;
        d = (Map)retrofiterror.getBodyAs((new bmj() {

            final dlh a;

            
            {
                a = dlh.this;
                super();
            }
        }).getType());
        b = s1;
    }

    public final boolean a()
    {
        return i() && (g() == null || ((ClientSignupResponse)g()).isPending()) || h() != null && h().getStatus() == 202;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        int i = n();
        if (555 != i) goto _L2; else goto _L1
_L1:
        String s = l();
_L4:
        return s;
_L2:
        if (406 != i || d == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        if (d.containsKey("top_of_form"))
        {
            return (String)d.get("top_of_form");
        }
        if (!d.containsKey("title") || !d.containsKey("subhead"))
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = (String)d.get("title");
        String s2 = (String)d.get("subhead");
        if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2))
        {
            return gjw.a("\n\n").a(s1, s2, new Object[0]).trim();
        }
        s = s1;
        if (TextUtils.isEmpty(s1))
        {
            return s2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (d.containsKey("title"))
        {
            return (String)d.get("title");
        }
        if (d.containsKey("subhead"))
        {
            return (String)d.get("subhead");
        }
        if (d != null && d.containsKey("error"))
        {
            return (String)d.get("error");
        }
        if (d != null && !d.isEmpty())
        {
            return gjw.a("\n").a(d.values());
        } else
        {
            return null;
        }
    }

    public final String d()
    {
        bkg bkg1 = new bkg();
        bkg1.a("status", Integer.valueOf(n()));
        bkg1.a("url", m());
        bkg1.a("errorMessage", c());
        bkg1.a("networkErrorMessage", l());
        return bkg1.toString();
    }

    public final boolean e()
    {
        return c;
    }

    public final String f()
    {
        return b;
    }
}
