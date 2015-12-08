// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.wf.wellsfargomobile.WFApp;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            p, d

public class OfferDownloadService extends IntentService
{

    public OfferDownloadService()
    {
        super("OfferDownloadService");
    }

    private void a()
    {
        b();
        android.content.SharedPreferences.Editor editor = getSharedPreferences("WF_PREFERENCES", 0).edit();
        editor.remove("IA_OFFERS");
        editor.apply();
    }

    private void a(JSONObject jsonobject)
    {
        JSONArray jsonarray;
        int i;
        jsonarray = jsonobject.optJSONArray("offerList");
        b();
        if (jsonarray == null || jsonarray.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        i = 0;
_L4:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        Object obj;
        BufferedInputStream bufferedinputstream;
        JSONObject jsonobject1;
        String s;
        jsonobject1 = jsonarray.getJSONObject(i);
        if (!jsonobject1.has("slotType") || !"SO_CAROUSEL".equals(jsonobject1.getString("slotType")) || !jsonobject1.has("bannerImageUrl"))
        {
            continue; /* Loop/switch isn't completed */
        }
        bufferedinputstream = new BufferedInputStream((new URL(jsonobject1.getString("bannerImageUrl"))).openConnection().getInputStream());
        s = (new StringBuilder()).append(UUID.randomUUID().toString()).append(".png").toString();
        obj = openFileOutput(s, 0);
_L3:
        int j = bufferedinputstream.read();
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        ((FileOutputStream) (obj)).write(j);
          goto _L3
        jsonobject;
        IOException ioexception;
        IOException ioexception3;
        if (bufferedinputstream != null)
        {
            try
            {
                bufferedinputstream.close();
            }
            catch (IOException ioexception2) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw jsonobject;
        jsonobject1.put("imageFileName", s);
        if (bufferedinputstream != null)
        {
            try
            {
                bufferedinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception3) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
        }
        i++;
          goto _L4
_L2:
        obj = getSharedPreferences("WF_PREFERENCES", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("IA_OFFERS", jsonobject.toString());
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        return;
    }

    private void b()
    {
        File afile[] = getFilesDir().listFiles(new p(this));
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }

    private void b(JSONObject jsonobject)
    {
        WFApp.a(d.a(jsonobject.optString("customer_segment")));
    }

    public void onHandleIntent(Intent intent)
    {
        byte byte0;
        intent = intent.getStringExtra("offerDownloadJson");
        String s;
        try
        {
            intent = (JSONObject)(new JSONTokener(intent)).nextValue();
            s = intent.optString("status");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.d("OfferDownloadService", "JSON parsing error", intent);
            return;
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 139
    //                   -1867169789: 107
    //                   1009658028: 93
    //                   1932962948: 79;
           goto _L1 _L2 _L3 _L4
_L6:
        a(intent);
_L5:
        b(intent);
        return;
_L4:
        if (s.equals("showDefault"))
        {
            byte0 = 0;
        }
          goto _L1
_L3:
        if (s.equals("suppressOffers"))
        {
            byte0 = 1;
        }
          goto _L1
_L2:
        if (s.equals("success"))
        {
            byte0 = 2;
        }
          goto _L1
_L7:
        a();
          goto _L5
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 160
    //                   0 121;
           goto _L6 _L7
    }
}
