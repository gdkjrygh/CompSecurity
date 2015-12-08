// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.visa.cbp.sdk.facade.VisaPaymentSDK;
import com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishmentCheckService;
import com.visa.cbp.sdk.facade.data.LcmParams;
import com.visa.cbp.sdk.facade.data.TokenData;
import com.visa.cbp.sdk.facade.data.TokenKey;
import com.visa.cbp.sdk.facade.exception.TokenInvalidException;
import com.visa.cbp.sdk.facade.request.ReplenishParams;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.hcewallet.a.c;
import com.wf.wellsfargomobile.hcewallet.a.d;
import com.wf.wellsfargomobile.hcewallet.service.HCEVisaBootReceiver;
import com.wf.wellsfargomobile.hcewallet.service.HCEWalletHostApduService;
import com.wf.wellsfargomobile.hcewallet.service.HCEWalletReplenishService;
import com.wf.wellsfargomobile.hcewallet.service.WalletIntentService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.d:
//            l, m, r, s, 
//            i, a, n, o, 
//            p, q

public class k
{

    private static String a = "HCEVisaUtil";
    private static boolean b = false;

    public k()
    {
    }

    private static c a(TokenKey tokenkey)
    {
        c c1 = new c();
        if (tokenkey != null)
        {
            ReplenishParams replenishparams = new ReplenishParams(tokenkey);
            if (!WFApp.c())
            {
                WFApp.b();
            }
            if (WFApp.c())
            {
                WFApp.a().replenishDynamicData(replenishparams, new l(), new m(c1, tokenkey));
                return c1;
            }
        }
        return c1;
    }

    static String a()
    {
        return a;
    }

    static boolean a(boolean flag)
    {
        b = flag;
        return flag;
    }

    public static String decodeBase64String(String s1)
    {
        if (s1 != null && !s1.equals(""))
        {
            try
            {
                s1 = new String(Base64.decode(s1, 8));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return "";
            }
            return s1;
        } else
        {
            return "";
        }
    }

    public static boolean deleteVISAToken(String s1, Context context)
    {
        b = false;
        if (!WFApp.c())
        {
            WFApp.b();
        }
        if (WFApp.c())
        {
            TokenData tokendata = getTokenDataFromTokenRefId(s1);
            LcmParams lcmparams = new LcmParams();
            lcmparams.setTokenKey(tokendata.getTokenKey());
            WFApp.a().deleteToken(lcmparams, new r(), new s());
        }
        if (b)
        {
            i.deleteCardArtImage(s1, context);
        }
        return b;
    }

    public static void enableAPDUService(Context context, boolean flag)
    {
        ComponentName componentname;
        ComponentName componentname1;
        ComponentName componentname2;
        ComponentName componentname3;
        ComponentName componentname4;
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 19 && !WFApp.d())
            {
                componentname = new ComponentName(context, com/wf/wellsfargomobile/hcewallet/service/HCEWalletHostApduService);
                componentname1 = new ComponentName(context, com/visa/cbp/sdk/facade/activeaccountmanagement/ReplenishmentCheckService);
                componentname2 = new ComponentName(context, com/wf/wellsfargomobile/hcewallet/service/HCEWalletReplenishService);
                componentname3 = new ComponentName(context, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
                componentname4 = new ComponentName(context, com/wf/wellsfargomobile/hcewallet/service/HCEVisaBootReceiver);
                context = context.getPackageManager();
                if (!flag)
                {
                    break label0;
                }
                context.setComponentEnabledSetting(componentname, 1, 1);
                context.setComponentEnabledSetting(componentname1, 1, 1);
                context.setComponentEnabledSetting(componentname2, 1, 1);
                context.setComponentEnabledSetting(componentname3, 1, 1);
                context.setComponentEnabledSetting(componentname4, 1, 1);
            }
            return;
        }
        context.setComponentEnabledSetting(componentname, 0, 1);
        context.setComponentEnabledSetting(componentname1, 0, 1);
        context.setComponentEnabledSetting(componentname2, 0, 1);
        context.setComponentEnabledSetting(componentname3, 0, 1);
        context.setComponentEnabledSetting(componentname4, 0, 1);
    }

    public static void enableDisableAPDUService(Context context)
    {
        if (i.isUserEligibleForHCEWallet(context))
        {
            enableAPDUService(context, true);
            return;
        } else
        {
            enableAPDUService(context, false);
            return;
        }
    }

    public static List getAllTokenRelatedData(ArrayList arraylist)
    {
        ArrayList arraylist1;
        arraylist1 = new ArrayList();
        if (!WFApp.c())
        {
            WFApp.b();
        }
        if (!WFApp.c())
        {
            break MISSING_BLOCK_LABEL_325;
        }
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        if (arraylist.size() <= 0) goto _L2; else goto _L3
_L3:
        if (arraylist.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        arraylist = arraylist.iterator();
_L13:
        Object obj;
        Object obj1;
        if (!arraylist.hasNext())
        {
            break MISSING_BLOCK_LABEL_325;
        }
        obj1 = (TokenKey)arraylist.next();
        obj = new JSONObject();
        obj1 = a(((TokenKey) (obj1)));
        ((JSONObject) (obj)).put("network", "VISA");
        ((JSONObject) (obj)).put("tokenRefId", ((c) (obj1)).a());
        ((JSONObject) (obj)).put("tokenMdRefId", ((c) (obj1)).b());
        ((JSONObject) (obj)).put("tc", ((c) (obj1)).d());
        if (((c) (obj1)).d() <= 0) goto _L5; else goto _L4
_L4:
        StringBuilder stringbuilder;
        Iterator iterator;
        stringbuilder = new StringBuilder();
        iterator = ((c) (obj1)).c().iterator();
        int j = 0;
_L10:
        if (!iterator.hasNext()) goto _L7; else goto _L6
_L6:
        String s1 = (String)iterator.next();
        j++;
        if (((c) (obj1)).d() != j) goto _L9; else goto _L8
_L8:
        stringbuilder.append(s1);
          goto _L10
_L2:
        obj = new ArrayList();
        obj1 = WFApp.a().getAllTokenData();
        arraylist = ((ArrayList) (obj));
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist = ((ArrayList) (obj));
        if (((List) (obj1)).size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((List) (obj1)).iterator();
_L12:
        arraylist = ((ArrayList) (obj));
        if (!((Iterator) (obj1)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        ((ArrayList) (obj)).add(((TokenData)((Iterator) (obj1)).next()).getTokenKey());
        if (true) goto _L12; else goto _L11
_L11:
        continue; /* Loop/switch isn't completed */
_L9:
        stringbuilder.append(s1).append(",");
          goto _L10
_L7:
        ((JSONObject) (obj)).put("tvl", getBase64String(stringbuilder.toString()));
_L14:
        arraylist1.add(obj);
          goto _L13
_L5:
        ((JSONObject) (obj)).put("tvl", "");
          goto _L14
        arraylist;
        return arraylist1;
        if (true) goto _L3; else goto _L15
_L15:
    }

    public static String getBase64String(String s1)
    {
        String s3 = "";
        String s2 = s3;
        if (s1 != null)
        {
            s2 = s3;
            if (!s1.equals(""))
            {
                try
                {
                    s2 = Base64.encodeToString(s1.getBytes("UTF-8"), 8);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    return "";
                }
            }
        }
        return s2;
    }

    public static d getCtDtFromstorage(Context context)
    {
        d d1 = new d();
        String s1 = (new a(context)).a("updateTokens");
        context = d1;
        if (s1 != null)
        {
            context = d1;
            if (!s1.equals(""))
            {
                context = (d)(new Gson()).fromJson(s1, com/wf/wellsfargomobile/hcewallet/a/d);
            }
        }
        return context;
    }

    public static String getDeviceInfo()
    {
        com.visa.cbp.sdk.facade.data.DeviceData devicedata = WFApp.a().getDeviceData();
        return getBase64String((new GsonBuilder()).create().toJson(devicedata));
    }

    public static TokenData getTokenDataFromTokenRefId(String s1)
    {
label0:
        {
            if (!WFApp.c())
            {
                WFApp.b();
            }
            if (!WFApp.c())
            {
                break label0;
            }
            Object obj = WFApp.a().getAllTokenData();
            if (obj == null || ((List) (obj)).size() <= 0)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            TokenData tokendata;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                tokendata = (TokenData)((Iterator) (obj)).next();
            } while (!a(tokendata.getTokenKey()).a().equalsIgnoreCase(s1));
            return tokendata;
        }
        return null;
    }

    public static boolean provisionVISAToken(String s1)
    {
        b = false;
        if (!WFApp.c())
        {
            WFApp.b();
        }
        if (WFApp.c())
        {
            WFApp.a().provisionToken(new n(), new o(s1));
        }
        return b;
    }

    public static boolean replenishVISAToken(String s1, String s2)
    {
        b = false;
        if (!WFApp.c())
        {
            WFApp.b();
        }
        if (WFApp.c())
        {
            s2 = new ReplenishParams(getTokenDataFromTokenRefId(s2).getTokenKey());
            WFApp.a().replenishDynamicData(s2, new p(), new q(s1));
        }
        return b;
    }

    public static void selectDefaultCard(String s1)
    {
        s1 = getTokenDataFromTokenRefId(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        WFApp.a().selectCard(s1.getTokenKey());
        return;
        s1;
    }

}
