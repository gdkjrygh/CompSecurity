// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.adjust.sdk.Adjust;
import com.adjust.sdk.OnFinishedListener;
import com.adjust.sdk.ResponseData;
import com.mobileapptracker.MobileAppTracker;
import java.util.HashMap;
import java.util.Map;

public final class fmv
{

    private final MobileAppTracker a;
    private final czf b;

    public fmv(MobileAppTracker mobileapptracker, czf czf1)
    {
        a = mobileapptracker;
        b = czf1;
    }

    static czf a(fmv fmv1)
    {
        return fmv1.b;
    }

    private void b(String s)
    {
        a.setUserId(s);
        a.measureAction("MobileSignup");
    }

    private void c(String s)
    {
        if (!b.u())
        {
            Adjust.setEnabled(Boolean.valueOf(true));
            HashMap hashmap = new HashMap();
            hashmap.put("uuid", s);
            Adjust.trackEvent("frviob", hashmap);
            Adjust.setOnFinishedListener(new OnFinishedListener() {

                final fmv a;

                public final void onFinishedTracking(ResponseData responsedata)
                {
                    if (responsedata.wasSuccess())
                    {
                        Adjust.setEnabled(Boolean.valueOf(false));
                        fmv.a(a).t();
                    }
                }

            
            {
                a = fmv.this;
                super();
            }
            });
        }
    }

    public final void a(String s)
    {
        b(s);
        c(s);
    }
}
