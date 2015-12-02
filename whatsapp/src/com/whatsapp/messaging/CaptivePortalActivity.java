// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.al0;
import com.whatsapp.cu;
import com.whatsapp.iz;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.whatsapp.messaging:
//            x, h, bu, az, 
//            a_

public class CaptivePortalActivity extends Activity
{

    private static x a;
    private static final String z[];

    public CaptivePortalActivity()
    {
    }

    public static String a(WifiInfo wifiinfo)
    {
        if (wifiinfo != null) goto _L2; else goto _L1
_L1:
        wifiinfo = null;
_L4:
        return wifiinfo;
_L2:
        String s;
        s = wifiinfo.getSSID();
        wifiinfo = s;
        if (s == null) goto _L4; else goto _L3
_L3:
        wifiinfo = s;
        if (s.length() < 2) goto _L4; else goto _L5
_L5:
        if (s.startsWith("\""))
        {
            break; /* Loop/switch isn't completed */
        }
        wifiinfo = s;
        if (!s.startsWith("'")) goto _L4; else goto _L6
_L6:
        if (s.endsWith("\""))
        {
            break; /* Loop/switch isn't completed */
        }
        wifiinfo = s;
        if (!s.endsWith("'")) goto _L4; else goto _L7
_L7:
        return s.substring(1, s.length() - 1);
    }

    public static void a(Context context)
    {
        com/whatsapp/messaging/CaptivePortalActivity;
        JVM INSTR monitorenter ;
        a.clear();
        context.deleteFile(z[0]);
        com/whatsapp/messaging/CaptivePortalActivity;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static boolean a(NetworkInfo networkinfo)
    {
        Object obj;
        int i;
        try
        {
            i = networkinfo.getType();
        }
        // Misplaced declaration of an exception variable
        catch (NetworkInfo networkinfo)
        {
            throw networkinfo;
        }
        if (i != 1)
        {
            return false;
        }
        obj = null;
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(al0.q)).openConnection();
        int j;
        httpurlconnection.setInstanceFollowRedirects(false);
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setReadTimeout(10000);
        httpurlconnection.setUseCaches(false);
        httpurlconnection.getInputStream();
        j = httpurlconnection.getResponseCode();
        if (j == 204)
        {
            if (httpurlconnection != null)
            {
                try
                {
                    httpurlconnection.disconnect();
                }
                // Misplaced declaration of an exception variable
                catch (NetworkInfo networkinfo)
                {
                    throw networkinfo;
                }
            }
            return false;
        }
        App.q(z[4]);
        Log.i((new StringBuilder()).append(z[3]).append(networkinfo).toString());
        if (httpurlconnection != null)
        {
            try
            {
                httpurlconnection.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (NetworkInfo networkinfo)
            {
                throw networkinfo;
            }
        }
        return true;
        networkinfo;
        httpurlconnection = null;
_L4:
        if (httpurlconnection != null)
        {
            try
            {
                httpurlconnection.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (NetworkInfo networkinfo)
            {
                throw networkinfo;
            }
        }
        return false;
        networkinfo;
        httpurlconnection = obj;
_L2:
        if (httpurlconnection != null)
        {
            try
            {
                httpurlconnection.disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (NetworkInfo networkinfo)
            {
                throw networkinfo;
            }
        }
        throw networkinfo;
        networkinfo;
        if (true) goto _L2; else goto _L1
_L1:
        networkinfo;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
label0:
        {
            int j = h.a;
            super.onCreate(bundle);
            requestWindowFeature(1);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                setFinishOnTouchOutside(false);
            }
            WifiInfo wifiinfo = ((WifiManager)getSystemService(z[1])).getConnectionInfo();
            Button button;
            Button button1;
            Button button2;
            TextView textview;
            View view;
            int i;
            if (wifiinfo != null)
            {
                i = wifiinfo.getNetworkId();
            } else
            {
                i = -1;
            }
            if (wifiinfo != null)
            {
                bundle = a(wifiinfo);
            } else
            {
                bundle = null;
            }
            setContentView(iz.a(getLayoutInflater(), 0x7f0300bb, null));
            getWindow().setLayout(-1, -2);
            button = (Button)findViewById(0x7f0b02ef);
            button1 = (Button)findViewById(0x7f0b02ee);
            button2 = (Button)findViewById(0x7f0b02f0);
            textview = (TextView)findViewById(0x7f0b02ed);
            view = findViewById(0x7f0b02f1);
            button.setOnClickListener(new bu(this));
            if (wifiinfo != null)
            {
                button1.setText(getString(0x7f0e0195, new Object[] {
                    bundle
                }));
                textview.setText(getString(0x7f0e04b3, new Object[] {
                    bundle
                }));
                if (j == 0)
                {
                    break label0;
                }
                DialogToastActivity.g++;
            }
            button1.setVisibility(8);
            if (view != null)
            {
                view.setVisibility(8);
            }
            textview.setText(0x7f0e04b2);
        }
        button2.setOnClickListener(new az(this));
        button1.setOnClickListener(new a_(this, i, bundle));
        Log.i((new StringBuilder()).append(z[2]).append(bundle).toString());
    }

    protected void onPause()
    {
        super.onPause();
        cu.a.removeMessages(1);
        App.aL();
    }

    protected void onResume()
    {
        super.onResume();
        cu.a.sendEmptyMessageDelayed(1, 3000L);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\034I:jF\003[ zF\001U'g\177\006Y2zp\000T\fbv\b";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\030S5g";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\f[#zp\031_s~v\035N2b9\016Y'go\006N*.z\035_2z|\013\0325akO";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\f[#zp\031_s~v\035N2b#O";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\f[#zp\031_s~v\035N2b";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                a = new x(null);
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 200
    //                   0 223
    //                   1 230
    //                   2 237
    //                   3 244;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_244;
_L3:
        byte byte1 = 25;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 111;
          goto _L9
_L5:
        byte1 = 58;
          goto _L9
_L6:
        byte1 = 83;
          goto _L9
        byte1 = 14;
          goto _L9
    }
}
