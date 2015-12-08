// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.facebook.HttpMethod;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity, JavaScriptListener, DownloadTask

public class JavaScriptHandler
{

    JavaScriptListener listener;
    MainActivity parentActivity;

    public JavaScriptHandler(MainActivity mainactivity, JavaScriptListener javascriptlistener)
    {
        parentActivity = mainactivity;
        listener = javascriptlistener;
    }

    private String getBatteryLevel()
    {
        Object obj = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        obj = parentActivity.registerReceiver(null, ((IntentFilter) (obj)));
        return Integer.toString((((Intent) (obj)).getIntExtra("level", -1) * 100) / ((Intent) (obj)).getIntExtra("scale", -1));
    }

    public boolean getConnectionStatus(Context context)
    {
        for (context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo(); context == null || !context.isConnected() || !context.isAvailable();)
        {
            return false;
        }

        return true;
    }

    public void getNetworkType(String s)
    {
        NetworkInfo networkinfo = ((ConnectivityManager)parentActivity.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo.getTypeName().equalsIgnoreCase("WIFI"))
        {
            listener.sendNativeMessage((new StringBuilder("{\"commandId\":\"")).append(s).append("\",\"type\":\"CommandResult\",\"subject\":\"GetNetworkStatus\",\"payload\":{\"status\":\"WiFi\"}}").toString());
            return;
        }
        if (networkinfo.getTypeName().equalsIgnoreCase("MOBILE"))
        {
            listener.sendNativeMessage((new StringBuilder("{\"commandId\":\"")).append(s).append("\",\"type\":\"CommandResult\",\"subject\":\"GetNetworkStatus\",\"payload\":{\"status\":\"WWAN\"}}").toString());
            return;
        } else
        {
            listener.sendNativeMessage((new StringBuilder("{\"commandId\":\"")).append(s).append("\",\"type\":\"CommandResult\",\"subject\":\"GetNetworkStatus\",\"payload\":{\"status\":\"undefined\"}}").toString());
            return;
        }
    }

    public void parseMessageObject(String s)
        throws JSONException
    {
        Object obj;
        Object obj1;
        s = new JSONObject(s);
        obj1 = s.getString("subject");
        obj = s.getString("commandId");
        if (((String) (obj1)).equals("OpenPopup"))
        {
            s = s.getString("url");
            listener.openUrl(s, true, null);
            return;
        }
        if (((String) (obj1)).equals("BrowserOpen"))
        {
            s = s.getJSONObject("payload").getString("url");
            listener.openUrl(s, false, null);
            return;
        }
        if (((String) (obj1)).equals("VoiceWindowOpen"))
        {
            obj = s.getJSONObject("payload");
            s = ((JSONObject) (obj)).getString("url");
            obj = ((JSONObject) (obj)).getString("title");
            listener.openUrl(s, true, ((String) (obj)));
            return;
        }
        if (((String) (obj1)).equals("TelescopeOpen"))
        {
            s = s.getJSONObject("payload").getString("url");
            listener.openUrl(s, true, null);
            listener.saveSharedPreference("votenowURL", s);
            return;
        }
        if (((String) (obj1)).equals("OverlayOpen"))
        {
            s = s.getJSONObject("payload").getString("url");
            listener.openUrl(s, true, null);
            return;
        }
        if (((String) (obj1)).equals("MixpanelTrackEvent"))
        {
            obj = s.getJSONObject("payload");
            s = ((JSONObject) (obj)).getString("event");
            obj = ((JSONObject) (obj)).getJSONObject("properties");
            listener.mixpanelTrackEvent(s, ((JSONObject) (obj)));
            return;
        }
        if (((String) (obj1)).equals("MixpanelRegisterSuperProperties"))
        {
            s = s.getJSONObject("payload").getJSONObject("properties");
            listener.mixpanelRegisterSuperProperties(s);
            return;
        }
        if (((String) (obj1)).equals("MixpanelSetPeopleProperties"))
        {
            s = s.getJSONObject("payload").getJSONObject("properties");
            listener.mixpanelSetPeopleProperties(s);
            return;
        }
        if (((String) (obj1)).equals("MixpanelIncrementPeopleProperties"))
        {
            s = s.getJSONObject("payload").getJSONObject("properties");
            listener.mixpanelIncrementPeopleProperties(s);
            return;
        }
        if (((String) (obj1)).equals("SetPushEnabled"))
        {
            boolean flag = s.getJSONObject("payload").getBoolean("value");
            s = (new StringBuilder("{\"commandId\":\"")).append(((String) (obj))).append("\",\"type\":\"CommandResult\",\"subject\":\"SetPushEnabled\",\"payload\":{\"value\":").append(flag).append("}}").toString();
            listener.pushSetting(flag, s);
            return;
        }
        if (((String) (obj1)).equals("LoadAudio"))
        {
            s = s.getJSONObject("payload").getString("url");
            obj1 = s.replaceAll("[:/\\?]", "-");
            (new DownloadTask(parentActivity, s, ((String) (obj1)), ((String) (obj)))).execute(new String[] {
                ""
            });
            return;
        }
        if (((String) (obj1)).equals("LoadAsset"))
        {
            s = s.getJSONObject("payload").getString("url");
            obj1 = s.substring(s.lastIndexOf("/") + 1);
            listener.addAssetToList(((String) (obj1)));
            (new DownloadTask(parentActivity, s, ((String) (obj1)), ((String) (obj)))).execute(new String[] {
                ""
            });
            return;
        }
        if (((String) (obj1)).equals("PlayAudio"))
        {
            s = s.getJSONObject("payload").getString("url").replaceAll("[:/\\?]", "-");
            listener.playAudio(s, ((String) (obj)));
            return;
        }
        if (((String) (obj1)).equals("PauseAudio"))
        {
            listener.pauseAudio(((String) (obj)));
            return;
        }
        if (((String) (obj1)).equals("ResumeAudio"))
        {
            listener.resumeAudio(((String) (obj)));
            return;
        }
        if (((String) (obj1)).equals("StopAudio"))
        {
            listener.stopAudio(((String) (obj)));
            return;
        }
        if (((String) (obj1)).equals("IsTwitterAccountAvailable"))
        {
            s = (new StringBuilder("{\"commandId\":\"")).append(((String) (obj))).append("\",\"type\":\"CommandResult\",\"subject\":\"IsTwitterAccountAvailable\",\"payload\":{\"available\":").append(false).append("}}").toString();
            listener.sendNativeMessage(s);
            return;
        }
        if (!((String) (obj1)).equals("FacebookLogin")) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        s = s.getJSONObject("payload");
        obj1 = new ArrayList();
        jsonarray = s.getJSONArray("permissions");
        if (jsonarray == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = jsonarray.length();
        i = 0;
_L6:
        if (i < j) goto _L5; else goto _L4
_L4:
        boolean flag1 = s.getBoolean("interactive");
        listener.facebookLogin(((String) (obj)), ((java.util.List) (obj1)), flag1);
        return;
_L5:
        ((ArrayList) (obj1)).add(jsonarray.get(i).toString());
        i++;
        if (true) goto _L6; else goto _L2
_L2:
        if (((String) (obj1)).equals("FacebookShare"))
        {
            JSONObject jsonobject = s.getJSONObject("payload");
            obj1 = jsonobject.getString("contentDescription");
            String s1 = jsonobject.getString("contentTitle");
            String s3 = jsonobject.getString("contentURL");
            s = "blah";
            if (jsonobject.has("imageURL"))
            {
                s = jsonobject.getString("imageURL");
            }
            listener.facebookShare(((String) (obj)), s1, ((String) (obj1)), s3, s);
            return;
        }
        if (!((String) (obj1)).equals("FacebookRequestReadPermissions")) goto _L8; else goto _L7
_L7:
        obj1 = s.getJSONObject("payload");
        s = new ArrayList();
        obj1 = ((JSONObject) (obj1)).getJSONArray("permissions");
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        j = ((JSONArray) (obj1)).length();
        i = 0;
_L12:
        if (i < j) goto _L11; else goto _L10
_L10:
        listener.facebookPermissionRequest(((String) (obj)), s);
        return;
_L11:
        s.add(((JSONArray) (obj1)).get(i).toString());
        i++;
        if (true) goto _L12; else goto _L8
_L8:
        if (((String) (obj1)).equals("FacebookGraphRequest"))
        {
            s = s.getJSONObject("payload");
            obj1 = s.getString("path");
            String s2 = s.getJSONObject("parameters").getString("fields");
            if (s.getString("httpMethod").equalsIgnoreCase("post"))
            {
                s = HttpMethod.POST;
            } else
            {
                s = HttpMethod.GET;
            }
            listener.facebookGraphRequest(((String) (obj)), ((String) (obj1)), s, s2);
            return;
        }
        if (((String) (obj1)).equals("FacebookLogout"))
        {
            listener.facebookLogout(((String) (obj)));
            return;
        }
        if (!((String) (obj1)).equals("TwitterShare"))
        {
            break MISSING_BLOCK_LABEL_1213;
        }
        obj = s.getJSONObject("payload");
        s = ((JSONObject) (obj)).getString("message");
        obj1 = ((JSONObject) (obj)).getString("url");
        obj = URLEncoder.encode(s, "UTF-8");
        s = ((String) (obj));
_L13:
        if (obj1 != null)
        {
            s = (new StringBuilder("https://twitter.com/intent/tweet?text=")).append(s).append("&url=").append(((String) (obj1))).toString();
        } else
        {
            s = (new StringBuilder("https://twitter.com/intent/tweet?text=")).append(s).toString();
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        parentActivity.startActivity(Intent.createChooser(s, "Tweet!"));
        return;
        obj;
        ((UnsupportedEncodingException) (obj)).printStackTrace();
          goto _L13
        if (((String) (obj1)).equals("GetBatteryLevel"))
        {
            listener.sendNativeMessage((new StringBuilder("{\"commandId\":\"")).append(((String) (obj))).append("\",\"type\":\"CommandResult\",\"subject\":\"GetBatteryLevel\",\"payload\":{\"value\":\"").append(getBatteryLevel()).append("\"}}").toString());
            return;
        }
        if (((String) (obj1)).equals("GetNetworkStatus"))
        {
            if (!getConnectionStatus(parentActivity))
            {
                listener.sendNativeMessage((new StringBuilder("{\"commandId\":\"")).append(((String) (obj))).append("\",\"type\":\"CommandResult\",\"subject\":\"GetNetworkStatus\",\"payload\":{\"status\":\"noservice\"}}").toString());
                return;
            } else
            {
                getNetworkType(((String) (obj)));
                return;
            }
        }
        if (((String) (obj1)).equals("OpenDialog"))
        {
            Object obj2 = s.getJSONObject("payload");
            Object obj3;
            if (((JSONObject) (obj2)).has("title"))
            {
                s = ((JSONObject) (obj2)).getString("title");
            } else
            {
                s = null;
            }
            obj1 = ((JSONObject) (obj2)).getString("message");
            obj3 = ((JSONObject) (obj2)).getJSONArray("buttons");
            obj2 = ((JSONArray) (obj3)).get(0).toString();
            obj3 = ((JSONArray) (obj3)).get(1).toString();
            listener.openDialog(s, ((String) (obj1)), ((String) (obj)), ((String) (obj2)), ((String) (obj3)));
            return;
        }
        if (((String) (obj1)).equals("ReloadMainWebView"))
        {
            listener.reloadWebView();
            return;
        }
        if (((String) (obj1)).equals("Close"))
        {
            listener.closeApp();
            return;
        } else
        {
            listener.sendNativeMessage((new StringBuilder("{\"commandId\":\"")).append(((String) (obj))).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(((String) (obj1))).append("\",\"error\":{\"code\":\"UnsupportedCommand\"}}").toString());
            return;
        }
    }
}
