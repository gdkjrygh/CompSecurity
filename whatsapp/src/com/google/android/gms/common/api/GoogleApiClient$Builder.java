// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            Api, g, c, Scope, 
//            GoogleApiClient

public final class JK
{

    private String DZ;
    private Looper JF;
    private final Set JH = new HashSet();
    private int JI;
    private View JJ;
    private String JK;
    private final Map JL = new HashMap();
    private FragmentActivity JM;
    private int JN;
    private tionFailedListener JO;
    private final Set JP = new HashSet();
    private final Set JQ = new HashSet();
    private final Context mContext;

    private GoogleApiClient gI()
    {
        g g1 = g.a(JM);
        GoogleApiClient googleapiclient = g1.an(JN);
        Object obj = googleapiclient;
        if (googleapiclient == null)
        {
            obj = new c(mContext.getApplicationContext(), JF, gH(), JL, JP, JQ, JN);
        }
        g1.a(JN, ((GoogleApiClient) (obj)), JO);
        return ((GoogleApiClient) (obj));
    }

    public JO addApi(Api api)
    {
        int j = Api.a;
        JL.put(api, null);
        api = api.gy();
        int k = api.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < k)
                {
                    JH.add(((Scope)api.get(i)).gO());
                    if (j == 0)
                    {
                        break label0;
                    }
                }
                return this;
            }
            i++;
        } while (true);
    }

    public onCallbacks addConnectionCallbacks(onCallbacks oncallbacks)
    {
        JP.add(oncallbacks);
        return this;
    }

    public tionFailedListener addOnConnectionFailedListener(tionFailedListener tionfailedlistener)
    {
        JQ.add(tionfailedlistener);
        return this;
    }

    public GoogleApiClient build()
    {
        boolean flag;
        if (!JL.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "must call addApi() to add at least one API");
        if (JN >= 0)
        {
            return gI();
        } else
        {
            return new c(mContext, JF, gH(), JL, JP, JQ, -1);
        }
    }

    public jg gH()
    {
        return new jg(DZ, JH, JI, JJ, JK);
    }

    public tionFailedListener(Context context)
    {
        int i = Api.a;
        super();
        JN = -1;
        mContext = context;
        JF = context.getMainLooper();
        JK = context.getPackageName();
        if (jx.a != 0)
        {
            Api.a = i + 1;
        }
    }
}
