// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.util.SendAndForgetRequestService;
import com.wf.wellsfargomobile.util.d;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp, q

public class InteractionAdvisorOffersFragment extends Fragment
{

    private FragmentActivity a;
    private Typeface b;
    private Typeface c;
    private Typeface d;
    private LinearLayout e;

    public InteractionAdvisorOffersFragment()
    {
        a = null;
    }

    private View a(JSONObject jsonobject)
    {
        if (jsonobject.has("bannerImageUrl"))
        {
            return b(jsonobject);
        } else
        {
            return c(jsonobject);
        }
    }

    private void a()
    {
        e.removeAllViews();
        e.setVisibility(8);
    }

    private void a(JSONArray jsonarray)
    {
        if (WFApp.j < System.currentTimeMillis() - 60000L)
        {
            WFApp.j = System.currentTimeMillis();
            b(jsonarray);
        }
    }

    private View b(JSONObject jsonobject)
    {
label0:
        {
            ImageView imageview = (ImageView)a.getLayoutInflater().inflate(0x7f040049, e);
            try
            {
                String s = jsonobject.getString("altText");
                Object obj = jsonobject.getString("imageFileName");
                obj = new File(a.getFilesDir(), ((String) (obj)));
                if (!((File) (obj)).exists())
                {
                    break label0;
                }
                imageview.setContentDescription(s);
                imageview.setImageURI(Uri.fromFile(((File) (obj))));
                imageview.setOnClickListener(new q(this, jsonobject));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                return null;
            }
            return imageview;
        }
        return null;
    }

    private void b(JSONArray jsonarray)
    {
        if (jsonarray.length() > 0)
        {
            Object obj = new JSONObject();
            ArrayList arraylist;
            try
            {
                ((JSONObject) (obj)).put("offerDispositions", jsonarray);
            }
            // Misplaced declaration of an exception variable
            catch (JSONArray jsonarray)
            {
                Log.w("InteractnAdvisorOffers", "JSONException setting offerDispositions", jsonarray);
            }
            jsonarray = new ArrayList();
            arraylist = new ArrayList();
            jsonarray.add("offerDispositions");
            arraylist.add(((JSONObject) (obj)).toString());
            obj = new Bundle();
            ((Bundle) (obj)).putStringArrayList("KEY_SEND_FORGET_PARAM_NAMES", jsonarray);
            ((Bundle) (obj)).putStringArrayList("KEY_SEND_FORGET_PARAM_VALUES", arraylist);
            jsonarray = new Intent(a, com/wf/wellsfargomobile/util/SendAndForgetRequestService);
            jsonarray.putExtra("KEY_SEND_FORGET_URL", (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.d()).append("/accounts/support/ia_disposition").toString());
            jsonarray.putExtra("KEY_SEND_FORGET_MODE", "POST");
            jsonarray.putExtra("KEY_SEND_FORGET_PARAM_BUNDLE", ((Bundle) (obj)));
            a.startService(jsonarray);
        }
    }

    private boolean b()
    {
        boolean flag = false;
        if (!a.getSharedPreferences("WF_PREFERENCES", 0).contains("IA_OFFERS"))
        {
            flag = true;
        }
        return flag;
    }

    private View c(JSONObject jsonobject)
    {
        if (jsonobject.has("presentmentText"))
        {
            return e(jsonobject);
        } else
        {
            return d(jsonobject);
        }
    }

    private View d(JSONObject jsonobject)
    {
        View view = a.getLayoutInflater().inflate(0x7f04004b, e, false);
        TextView textview = (TextView)view.findViewById(0x7f0f00ee);
        Button button = (Button)view.findViewById(0x7f0f00f0);
        String s = jsonobject.optString("preText");
        if (s != null)
        {
            textview.setText(s);
        }
        s = jsonobject.optString("displayText");
        if (s != null)
        {
            button.setText(s);
        }
        textview.setTypeface(d);
        button.setTypeface(c);
        jsonobject = new q(this, jsonobject);
        view.setOnClickListener(jsonobject);
        textview.setOnClickListener(jsonobject);
        button.setOnClickListener(jsonobject);
        return view;
    }

    private View e(JSONObject jsonobject)
    {
        View view = a.getLayoutInflater().inflate(0x7f04004a, e, false);
        TextView textview = (TextView)view.findViewById(0x7f0f00ee);
        TextView textview1 = (TextView)view.findViewById(0x7f0f00ef);
        Button button = (Button)view.findViewById(0x7f0f00f0);
        String s = jsonobject.optString("preText");
        if (s != null)
        {
            textview.setText(s);
        }
        s = jsonobject.optString("presentmentText");
        if (s != null)
        {
            textview1.setText(s);
        }
        s = jsonobject.optString("displayText");
        if (s != null)
        {
            button.setText(s);
        }
        textview.setTypeface(d);
        textview1.setTypeface(b);
        button.setTypeface(c);
        jsonobject = new q(this, jsonobject);
        view.setOnClickListener(jsonobject);
        textview.setOnClickListener(jsonobject);
        textview1.setOnClickListener(jsonobject);
        button.setOnClickListener(jsonobject);
        return view;
    }

    private void f(JSONObject jsonobject)
    {
        JSONArray jsonarray;
        jsonobject = jsonobject.optJSONArray("offerList");
        jsonarray = new JSONArray();
        e.removeAllViews();
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = 0;
        i = 0;
_L8:
        int k = i;
        if (j >= jsonobject.length()) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject1 = jsonobject.getJSONObject(j);
        if (!jsonobject1.has("slotType") || !"SO_CAROUSEL".equals(jsonobject1.getString("slotType"))) goto _L6; else goto _L5
_L5:
        View view = a(jsonobject1);
        if (view == null) goto _L6; else goto _L7
_L7:
        k = i + 1;
        if (2 != getResources().getConfiguration().orientation)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        Display display = a.getWindowManager().getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        if (displaymetrics.widthPixels <= 1000)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        i = 1;
_L9:
        if (i != 0)
        {
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2, 1.0F);
            e.addView(view, layoutparams);
        } else
        {
            e.addView(view);
        }
        jsonobject1.put("offerDisposition", "Presented");
        jsonarray.put(jsonobject1);
        i = k;
        if (j + 1 != jsonobject.length())
        {
            ImageView imageview = (ImageView)a.getLayoutInflater().inflate(0x7f040048, e, false);
            e.addView(imageview);
            i = k;
        }
_L6:
        j++;
          goto _L8
_L2:
        k = 0;
_L4:
        a(jsonarray);
        if (k == 0)
        {
            a();
            return;
        } else
        {
            e.setVisibility(0);
            return;
        }
        i = 0;
          goto _L9
    }

    public void a(JSONObject jsonobject, String s)
    {
        if (!jsonobject.has("offername"))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (!"".equals(jsonobject.getString("offername")))
        {
            jsonobject.put("offerDisposition", s);
            s = new JSONArray();
            s.put(jsonobject);
            b(s);
        }
        return;
        jsonobject;
        return;
        jsonobject;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040036, viewgroup, false);
        e = (LinearLayout)layoutinflater.findViewById(0x7f0f00a5);
        a = getActivity();
        b = Typeface.createFromAsset(a.getAssets(), "fonts/02520_Arial2.ttf");
        c = Typeface.createFromAsset(a.getAssets(), "fonts/02534_ArialFett2.ttf");
        d = Typeface.createFromAsset(a.getAssets(), "fonts/16902_Georgia.ttf");
        return layoutinflater;
    }

    public void onResume()
    {
        Object obj;
        byte byte0;
        byte0 = 0;
        super.onResume();
        if (b() && (d.c.equals(WFApp.R()) || d.e.equals(WFApp.R())))
        {
            a();
            return;
        }
        obj = a.getSharedPreferences("WF_PREFERENCES", 0).getString("IA_OFFERS", "{\"status\":\"success\",\"offerList\":[{\"offername\":\"SO_CAROUSEL_1\",\"slotType\":\"SO_CAROUSEL\",\"presentationOrderWithinSlot\":\"1\",\"presentmentText\":\"Get the most out of Online Banking.\",\"destinationURL\":\"https://www.wellsfargo.com/wfonline/bill_pay/\",\"displayText\":\"Start Here\",\"preText\":\"Try Bill Pay for free\"},{\"offername\":\"SO_CAROUSEL_2\",\"slotType\":\"SO_CAROUSEL\",\"presentationOrderWithinSlot\":\"2\",\"presentmentText\":\"A private student loan may help pay for college\",\"destinationURL\":\"https://www.wellsfargo.com/jump/student-loans/no-payments\",\"displayText\":\"Get Started\",\"preText\":\"No Payments while in school\"},{\"offername\":\"SO_CAROUSEL_3\",\"slotType\":\"SO_CAROUSEL\",\"presentationOrderWithinSlot\":\"3\",\"presentmentText\":\"Competitive rates and a credit decision in minutes\",\"destinationURL\":\"https://auto-loans.wellsfargo.com\",\"displayText\":\"Learn More\",\"preText\":\"Flexible auto financing\"},{\"offername\":\"SO_CAROUSEL_4\",\"slotType\":\"SO_CAROUSEL\",\"presentationOrderWithinSlot\":\"4\",\"presentmentText\":\"It's important to know your options. We can help.\",\"destinationURL\":\"https://www.wellsfargo.com/jump/investments/retirementadvisors\",\"displayText\":\"Learn More\",\"preText\":\"Questions about an old 401(k)?\"}]}");
        String s;
        obj = (JSONObject)(new JSONTokener(((String) (obj)))).nextValue();
        s = ((JSONObject) (obj)).optString("status");
        s.hashCode();
        JVM INSTR lookupswitch 3: default 190
    //                   -1867169789: 170
    //                   1009658028: 142
    //                   1932962948: 155;
           goto _L1 _L2 _L3 _L4
_L11:
        Exception exception;
        f(((JSONObject) (obj)));
        return;
_L3:
        if (!s.equals("suppressOffers")) goto _L1; else goto _L5
_L4:
        if (!s.equals("showDefault")) goto _L1; else goto _L6
_L6:
        byte0 = 1;
          goto _L5
_L2:
        if (!s.equals("success")) goto _L1; else goto _L7
_L7:
        byte0 = 2;
          goto _L5
_L9:
        try
        {
            a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Log.d("InteractnAdvisorOffers", "JSON parsing error", exception);
            return;
        }
_L1:
        byte0 = -1;
_L5:
        switch (byte0)
        {
        default:
            if (false)
            {
            }
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        continue; /* Loop/switch isn't completed */
        continue; /* Loop/switch isn't completed */
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }
}
