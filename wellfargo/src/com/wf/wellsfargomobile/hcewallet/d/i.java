// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.cardemulation.CardEmulation;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Spannable;
import android.text.style.StyleSpan;
import android.util.Base64;
import com.google.gson.Gson;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.WebViewActivity;
import com.wf.wellsfargomobile.hcewallet.a.a;
import com.wf.wellsfargomobile.hcewallet.a.b;
import com.wf.wellsfargomobile.hcewallet.a.d;
import com.wf.wellsfargomobile.hcewallet.a.e;
import com.wf.wellsfargomobile.hcewallet.a.f;
import com.wf.wellsfargomobile.hcewallet.activity.WalletPayNowActivity;
import com.wf.wellsfargomobile.hcewallet.activity.WalletPinActivity;
import com.wf.wellsfargomobile.hcewallet.service.HCEWalletHostApduService;
import com.wf.wellsfargomobile.hcewallet.service.WalletIntentService;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.d:
//            a, j, g, k, 
//            e, h

public class i
{

    public static boolean isPopupShowing = false;

    public i()
    {
    }

    private static Intent a(Context context, Class class1)
    {
        context = new Intent(context, class1);
        context.addFlags(0x30000000);
        return context;
    }

    private static File a(Context context, String s)
    {
        return new File((new ContextWrapper(context)).getDir("HceWallet", 0), s);
    }

    private static boolean a()
    {
        String s = Build.TAGS;
        return s != null && s.contains("test-keys");
    }

    private static boolean b()
    {
        String as[] = new String[9];
        as[0] = "/system/app/Superuser.apk";
        as[1] = "/sbin/su";
        as[2] = "/system/bin/su";
        as[3] = "/system/xbin/su";
        as[4] = "/data/local/xbin/su";
        as[5] = "/data/local/bin/su";
        as[6] = "/system/sd/xbin/su";
        as[7] = "/system/bin/failsafe/su";
        as[8] = "/data/local/su";
        int i1 = as.length;
        for (int l = 0; l < i1; l++)
        {
            if ((new File(as[l])).exists())
            {
                return true;
            }
        }

        return false;
    }

    private static boolean c()
    {
        Object obj1;
        boolean flag;
        flag = true;
        obj1 = null;
        Object obj = Runtime.getRuntime().exec(new String[] {
            "/system/xbin/which", "su"
        });
        obj1 = obj;
        String s = (new BufferedReader(new InputStreamReader(((Process) (obj)).getInputStream()))).readLine();
        if (s == null)
        {
            flag = false;
        }
        if (obj != null)
        {
            ((Process) (obj)).destroy();
        }
        return flag;
        obj;
        obj = null;
_L2:
        if (obj != null)
        {
            ((Process) (obj)).destroy();
        }
        return false;
        Exception exception;
        exception;
        if (obj1 != null)
        {
            ((Process) (obj1)).destroy();
        }
        throw exception;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String checkNullString(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = s;
            if (s.equalsIgnoreCase("null"))
            {
                return "";
            }
        }
        return s1;
    }

    public static void deleteCardArtImage(String s, Context context)
    {
        try
        {
            s = a(context, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        s.delete();
    }

    public static d getCTDTVid(Context context)
    {
        d d1 = new d();
        String s = (new com.wf.wellsfargomobile.hcewallet.d.a(context)).a("updateTokens");
        context = d1;
        if (s != null)
        {
            context = d1;
            if (!s.equals(""))
            {
                context = (d)(new Gson()).fromJson(s, com/wf/wellsfargomobile/hcewallet/a/d);
            }
        }
        return context;
    }

    public static Bitmap getImageData(String s, Context context)
    {
        String s1;
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        s1 = "";
        context = new FileInputStream(a(context, s));
        BufferedReader bufferedreader;
        s = new DataInputStream(context);
        bufferedreader = new BufferedReader(new InputStreamReader(s));
_L1:
        String s3 = bufferedreader.readLine();
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s1 = (new StringBuilder()).append(s1).append(s3).toString();
          goto _L1
        s.close();
        s = obj1;
        if (!s1.equals(""))
        {
            s = Base64.decode(s1, 8);
            s = BitmapFactory.decodeByteArray(s, 0, s.length);
        }
        String s2 = s;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return s;
            }
            s2 = s;
        }
        return s2;
        s;
        context = null;
_L5:
        s2 = obj;
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_125;
        }
        s;
        context = null;
_L3:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s;
        s;
        if (true) goto _L3; else goto _L2
_L2:
        s;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String getWalletURL(g g1, Context context)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        context = (new com.wf.wellsfargomobile.hcewallet.d.a(context)).a("wfWalletConnectData");
        if (context == null || context.equals("")) goto _L2; else goto _L1
_L1:
        context = (e)(new Gson()).fromJson(context, com/wf/wellsfargomobile/hcewallet/a/e);
        com.wf.wellsfargomobile.hcewallet.d.j.a[g1.ordinal()];
        JVM INSTR tableswitch 1 11: default 120
    //                   1 125
    //                   2 137
    //                   3 149
    //                   4 161
    //                   5 173
    //                   6 185
    //                   7 197
    //                   8 209
    //                   9 221
    //                   10 233
    //                   11 245;
           goto _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L2:
        return stringbuilder.toString();
_L3:
        stringbuilder.append(context.b());
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(context.c());
        continue; /* Loop/switch isn't completed */
_L5:
        stringbuilder.append(context.d());
        continue; /* Loop/switch isn't completed */
_L6:
        stringbuilder.append(context.e());
        continue; /* Loop/switch isn't completed */
_L7:
        stringbuilder.append(context.f());
        continue; /* Loop/switch isn't completed */
_L8:
        stringbuilder.append(context.a());
        continue; /* Loop/switch isn't completed */
_L9:
        stringbuilder.append(context.g());
        continue; /* Loop/switch isn't completed */
_L10:
        stringbuilder.append(context.h());
        continue; /* Loop/switch isn't completed */
_L11:
        stringbuilder.append(context.i());
        continue; /* Loop/switch isn't completed */
_L12:
        stringbuilder.append(context.j());
        continue; /* Loop/switch isn't completed */
_L13:
        stringbuilder.append(context.k());
        if (true) goto _L2; else goto _L14
_L14:
    }

    public static Spannable handleErrorMessage(String s)
    {
        if (s != null && s.indexOf("{H}") > 0)
        {
            int l = s.indexOf("{H}");
            s = android.text.Spannable.Factory.getInstance().newSpannable(s.replace("{H}", "\n"));
            s.setSpan(new StyleSpan(1), 0, l, 33);
            return s;
        }
        if (s != null)
        {
            return android.text.Spannable.Factory.getInstance().newSpannable(s);
        } else
        {
            return android.text.Spannable.Factory.getInstance().newSpannable("");
        }
    }

    public static boolean isConnected(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null)
        {
            return context.isConnected();
        } else
        {
            return false;
        }
    }

    public static boolean isDefaultPaymentApp(Context context)
    {
        return CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(context)).isDefaultServiceForCategory(new ComponentName(context, com/wf/wellsfargomobile/hcewallet/service/HCEWalletHostApduService.getCanonicalName()), "payment");
    }

    public static boolean isDeviceRooted()
    {
        return a() || b() || c();
    }

    public static boolean isHCESupported(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
        } else
        {
            return false;
        }
    }

    public static boolean isKitKatCapableDevice()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                String s = Build.CPU_ABI;
                String s1 = Build.CPU_ABI2;
                boolean flag;
                boolean flag1;
                if (s.toUpperCase(Locale.US).startsWith("ARM"))
                {
                    if (!s.contains("64"))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    flag1 = flag;
                } else
                {
                    flag1 = false;
                }
                if (s1 == null || s1.length() == 0)
                {
                    flag = true;
                } else
                if (s1.toUpperCase(Locale.US).startsWith("ARM"))
                {
                    if (!s1.contains("64"))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    flag = false;
                }
                if (flag1 && flag)
                {
                    break label0;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isLolliPopCapableDevice()
    {
        String as[];
        int l;
        int i1;
        boolean flag1;
        as = Build.SUPPORTED_ABIS;
        i1 = as.length;
        l = 0;
        flag1 = false;
_L2:
        String s;
label0:
        {
label1:
            {
                boolean flag = flag1;
                if (l < i1)
                {
                    s = as[l].toUpperCase(Locale.US);
                    if (!s.startsWith("ARM"))
                    {
                        break label1;
                    }
                    if (Build.SUPPORTED_64_BIT_ABIS.length == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    flag1 = flag;
                    if (flag)
                    {
                        break label0;
                    }
                }
                return flag;
            }
            if (!s.startsWith("MIP"))
            {
                break; /* Loop/switch isn't completed */
            }
            flag1 = false;
        }
_L4:
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!s.startsWith("X86")) goto _L4; else goto _L3
_L3:
        flag1 = false;
          goto _L4
    }

    public static boolean isNfcEnabled(Context context)
    {
        context = (NfcManager)context.getSystemService("nfc");
        if (context != null)
        {
            context = context.getDefaultAdapter();
            if (context != null && context.isEnabled())
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isUserEligibleForHCEWallet(Context context)
    {
        boolean flag1 = false;
        context = k.getCtDtFromstorage(context);
        boolean flag = flag1;
        if (!isDeviceRooted())
        {
            flag = flag1;
            if (context != null)
            {
                flag = flag1;
                if (context.b() != null)
                {
                    flag = flag1;
                    if (!context.b().equals(""))
                    {
                        flag = flag1;
                        if (context.a() != null)
                        {
                            flag = flag1;
                            if (!context.a().equals(""))
                            {
                                flag = flag1;
                                if (context.c() != null)
                                {
                                    flag = flag1;
                                    if (context.c().equalsIgnoreCase("3.15"))
                                    {
                                        flag = flag1;
                                        if (WFApp.ah())
                                        {
                                            flag = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static boolean isUserOnSession()
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (!WFApp.p())
        {
            flag = flag1;
            if (WFApp.o() == null)
            {
                flag = false;
            }
        }
        return flag;
    }

    public static void makeVibrate(Context context)
    {
        ((Vibrator)context.getSystemService("vibrator")).vibrate(200L);
    }

    public static void navigateToNFCSettings(Context context)
    {
        Intent intent = new Intent("android.settings.NFC_SETTINGS");
        intent.setFlags(0x10000000);
        context.startActivity(intent);
    }

    public static void parsePaymentDataJSON(String s, Context context)
    {
        boolean flag = false;
        if (s == null || s.equals("")) goto _L2; else goto _L1
_L1:
        a a1;
        Object obj1;
        Object obj3;
        a1 = new a();
        s = new JSONObject(s);
        if (s.has("tokens") && !s.isNull("tokens"))
        {
            Object obj2 = s.getJSONObject("tokens");
            Object obj = k.getCtDtFromstorage(context);
            if (((JSONObject) (obj2)).has("ct"))
            {
                String s1 = ((JSONObject) (obj2)).optString("ct");
                if (!s1.equals("null"))
                {
                    ((d) (obj)).b(s1);
                }
            }
            if (((JSONObject) (obj2)).has("dt"))
            {
                String s2 = ((JSONObject) (obj2)).optString("dt");
                if (!s2.equals("null"))
                {
                    ((d) (obj)).a(s2);
                }
            }
            if (((JSONObject) (obj2)).has("guid"))
            {
                obj2 = ((JSONObject) (obj2)).optString("guid");
                if (!((String) (obj2)).equals("null"))
                {
                    ((d) (obj)).d(((String) (obj2)));
                }
            }
            ((d) (obj)).c("3.15");
            obj = (new Gson()).toJson(obj);
            (new com.wf.wellsfargomobile.hcewallet.d.a(context)).a("updateTokens", ((String) (obj)));
            k.enableDisableAPDUService(context);
        }
        if (!s.has("payment") || s.isNull("payment"))
        {
            break MISSING_BLOCK_LABEL_488;
        }
        obj1 = s.getJSONObject("payment");
        obj3 = checkNullString(((JSONObject) (obj1)).optString("tokenRefId"));
        a1.a(((String) (obj3)));
        persistCardImage(checkNullString(((JSONObject) (obj1)).optString("tk")), ((String) (obj3)), context);
        if (((JSONObject) (obj1)).has("account") && !((JSONObject) (obj1)).isNull("account"))
        {
            obj3 = ((JSONObject) (obj1)).getJSONObject("account");
            a1.b(checkNullString(((JSONObject) (obj3)).optString("nn")));
            a1.c(checkNullString(((JSONObject) (obj3)).optString("dcn")));
            a1.d(checkNullString(((JSONObject) (obj3)).optString("balcre")));
        }
        if (!((JSONObject) (obj1)).has("footnote") || ((JSONObject) (obj1)).isNull("footnote"))
        {
            break MISSING_BLOCK_LABEL_488;
        }
        obj1 = ((JSONObject) (obj1)).getJSONArray("footnote");
        obj3 = new ArrayList();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        int l;
        Object obj4;
        String s3;
        int i1;
        try
        {
            i1 = ((JSONArray) (obj1)).length();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        l = 0;
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = new b();
        ((b) (obj4)).b(checkNullString(((JSONObject)((JSONArray) (obj1)).get(l)).optString("vid")));
        ((b) (obj4)).a(checkNullString(((JSONObject)((JSONArray) (obj1)).get(l)).optString("desc")));
        ((List) (obj3)).add(obj4);
        l++;
        if (true) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_401;
_L4:
        a1.a(((List) (obj3)));
        f.a().a(a1);
        if (!s.has("ptks") || s.isNull("ptks")) goto _L7; else goto _L6
_L6:
        s = s.getJSONObject("ptks");
        if (!s.has("add") || s.isNull("add")) goto _L9; else goto _L8
_L8:
        obj1 = s.getJSONArray("add");
        if (obj1 == null) goto _L9; else goto _L10
_L10:
        if (((JSONArray) (obj1)).length() <= 0) goto _L9; else goto _L11
_L11:
        i1 = ((JSONArray) (obj1)).length();
        l = 0;
_L26:
        if (l >= i1) goto _L9; else goto _L12
_L12:
        obj3 = checkNullString(((JSONObject)((JSONArray) (obj1)).get(l)).optString("data"));
        obj4 = checkNullString(((JSONObject)((JSONArray) (obj1)).get(l)).optString("network"));
        if (obj4 == null || obj3 == null) goto _L14; else goto _L13
_L13:
        if (e.valueOf(((String) (obj4))) == com.wf.wellsfargomobile.hcewallet.d.e.a)
        {
            k.provisionVISAToken(k.decodeBase64String(((String) (obj3))));
        }
          goto _L14
_L9:
        if (!s.has("replenish") || s.isNull("replenish")) goto _L16; else goto _L15
_L15:
        obj1 = s.getJSONArray("replenish");
        if (obj1 == null) goto _L16; else goto _L17
_L17:
        if (((JSONArray) (obj1)).length() <= 0) goto _L16; else goto _L18
_L18:
        i1 = ((JSONArray) (obj1)).length();
        l = 0;
_L27:
        if (l >= i1) goto _L16; else goto _L19
_L19:
        obj3 = checkNullString(((JSONObject)((JSONArray) (obj1)).get(l)).optString("data"));
        obj4 = checkNullString(((JSONObject)((JSONArray) (obj1)).get(l)).optString("network"));
        s3 = checkNullString(((JSONObject)((JSONArray) (obj1)).get(l)).optString("tokenRefId"));
        if (obj4 == null || obj3 == null) goto _L21; else goto _L20
_L20:
        if (e.valueOf(((String) (obj4))) == com.wf.wellsfargomobile.hcewallet.d.e.a)
        {
            k.replenishVISAToken(k.decodeBase64String(((String) (obj3))), s3);
        }
          goto _L21
_L16:
        if (!s.has("delete") || s.isNull("delete")) goto _L7; else goto _L22
_L22:
        s = s.getJSONArray("delete");
        if (s == null) goto _L7; else goto _L23
_L23:
        if (s.length() <= 0) goto _L7; else goto _L24
_L24:
        i1 = s.length();
        l = ((flag) ? 1 : 0);
_L28:
        if (l >= i1) goto _L7; else goto _L25
_L25:
        obj1 = checkNullString(((JSONObject)s.get(l)).optString("network"));
        obj3 = checkNullString(((JSONObject)s.get(l)).optString("tokenRefId"));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_967;
        }
        if (e.valueOf(((String) (obj1))) == com.wf.wellsfargomobile.hcewallet.d.e.a)
        {
            k.deleteVISAToken(((String) (obj3)), context);
        }
        break MISSING_BLOCK_LABEL_967;
_L7:
        if (a1.a() != null && !a1.a().equals(""))
        {
            k.selectDefaultCard(a1.a());
        }
_L2:
        return;
_L14:
        l++;
          goto _L26
_L21:
        l++;
          goto _L27
        l++;
          goto _L28
    }

    public static void persistCardImage(String s, String s1, Context context)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (s == null || s.equals(""))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        s1 = new FileOutputStream(a(context, s1));
        s1.write(s.getBytes());
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        s1.close();
_L2:
        return;
        s;
        s1 = null;
_L7:
        if (s1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
        s = obj;
_L6:
        if (s == null) goto _L2; else goto _L3
_L3:
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
        s1 = obj1;
_L5:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw s;
        s;
        return;
        s;
        if (true) goto _L5; else goto _L4
_L4:
        s;
        s = s1;
          goto _L6
          goto _L2
        s;
          goto _L7
    }

    public static void processWalletOnResume(BaseWebViewActivity basewebviewactivity)
    {
        if (WFApp.l && WFApp.q && !isPopupShowing)
        {
            Object obj = new Intent(basewebviewactivity, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
            ((Intent) (obj)).putExtra("WALLET_INTENT_SERVICE_CD", 1006);
            basewebviewactivity.startService(((Intent) (obj)));
            WFApp.k = 0;
            obj = new com.wf.wellsfargomobile.hcewallet.c.d();
            Bundle bundle = new Bundle();
            bundle.putString("DIALOG_TITLE", basewebviewactivity.getString(0x7f0800bb));
            bundle.putString("DIALOG_MESSAGE", basewebviewactivity.getString(0x7f0800ba));
            ((com.wf.wellsfargomobile.hcewallet.c.d) (obj)).setArguments(bundle);
            ((com.wf.wellsfargomobile.hcewallet.c.d) (obj)).show(basewebviewactivity.getSupportFragmentManager(), "PayNow Dialog Fragment");
            WFApp.l = false;
            isPopupShowing = true;
        } else
        {
            WFApp.l = false;
        }
        if (com.wf.wellsfargomobile.hcewallet.b.b.NFC_OFF && isNfcEnabled(basewebviewactivity))
        {
            StringBuilder stringbuilder = new StringBuilder("defaultWalletWithHceRes");
            stringbuilder.append("('").append(com.wf.wellsfargomobile.hcewallet.b.b.buildJson(true, "", "")).append("');");
            basewebviewactivity.loadJavaScript(stringbuilder.toString());
            com.wf.wellsfargomobile.hcewallet.b.b.NFC_OFF = false;
        }
    }

    public static String readOldWalletValueFromSharedPref(Context context)
    {
        try
        {
            context = context.getSharedPreferences("Wallet_Shared_Pref", 0).getString("tokens", null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (context != null)
        {
            return context;
        } else
        {
            return null;
        }
    }

    public static boolean validateTapAndPayEvent(Context context)
    {
        boolean flag = com.wf.wellsfargomobile.hcewallet.d.h.a();
        if (WFApp.m)
        {
            if (flag)
            {
                return true;
            } else
            {
                Intent intent = new Intent(context, com/wf/wellsfargomobile/hcewallet/activity/WalletPayNowActivity);
                intent.addFlags(0x14000000);
                intent.putExtra("PN", "PN");
                context.startActivity(intent);
                return false;
            }
        }
        if (WFApp.n)
        {
            if (flag)
            {
                return false;
            } else
            {
                Intent intent1 = new Intent(context, com/wf/wellsfargomobile/hcewallet/activity/WalletPinActivity);
                intent1.addFlags(0x14000000);
                context.startActivity(intent1);
                return false;
            }
        }
        if (WFApp.p)
        {
            if (isUserOnSession() && isUserEligibleForHCEWallet(context))
            {
                context.startActivity(a(context, com/wf/wellsfargomobile/WebViewActivity));
                WFApp.l = true;
                return false;
            }
        } else
        if (WFApp.o)
        {
            if (isUserEligibleForHCEWallet(context))
            {
                Intent intent2 = new Intent(context, com/wf/wellsfargomobile/hcewallet/activity/WalletPinActivity);
                intent2.addFlags(0x14000000);
                context.startActivity(intent2);
                return false;
            }
        } else
        if (!flag && isUserEligibleForHCEWallet(context))
        {
            Intent intent3 = new Intent(context, com/wf/wellsfargomobile/hcewallet/activity/WalletPinActivity);
            intent3.addFlags(0x14000000);
            context.startActivity(intent3);
        }
        return false;
    }

    public static void writeToOldWalletSharedPref(Context context, String s)
    {
        try
        {
            context = context.getSharedPreferences("Wallet_Shared_Pref", 0).edit();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (s == null)
        {
            s = null;
        }
        context.putString("tokens", s);
        context.apply();
        return;
    }

}
