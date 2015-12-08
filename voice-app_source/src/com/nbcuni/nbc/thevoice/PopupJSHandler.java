// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.app.Activity;
import android.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupJSListener

public class PopupJSHandler
{

    PopupJSListener listener;
    Activity parentActivity;

    public PopupJSHandler(Activity activity, PopupJSListener popupjslistener)
    {
        parentActivity = activity;
        listener = popupjslistener;
    }

    public void parseMessageObject(String s)
        throws JSONException
    {
        Object obj;
        obj = new JSONObject(s);
        s = ((JSONObject) (obj)).getString("subject");
        if (s.equals("HandleLS"))
        {
            s = ((JSONObject) (obj)).getJSONObject("payload");
            if (s.has("localStorage"))
            {
                s = s.getString("localStorage");
                if (s.startsWith("[") && s.endsWith("]"))
                {
                    listener.passExpiresValue(s);
                }
                return;
            } else
            {
                listener.passExpiresValue(null);
                return;
            }
        }
        if (s.equals("ClosePopup"))
        {
            listener.closePopup();
            return;
        }
        if (s.equals("TelescopeReady"))
        {
            listener.hideLoadingScreen();
            return;
        }
        if (!s.equals("FacebookLogin")) goto _L2; else goto _L1
_L1:
        Object obj1;
        s = ((JSONObject) (obj)).getString("commandId");
        obj1 = ((JSONObject) (obj)).getJSONObject("payload");
        obj = new ArrayList();
        obj1 = ((JSONObject) (obj1)).getJSONArray("permissions");
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = ((JSONArray) (obj1)).length();
        i = 0;
_L6:
        if (i < j) goto _L5; else goto _L4
_L4:
        listener.facebookLogin(s, ((java.util.List) (obj)));
        return;
_L5:
        ((ArrayList) (obj)).add(((JSONArray) (obj1)).get(i).toString());
        i++;
        if (true) goto _L6; else goto _L2
_L2:
        if (s.equals("FacebookShare"))
        {
            s = ((JSONObject) (obj)).getString("commandId");
            Object obj2 = ((JSONObject) (obj)).getJSONObject("payload");
            obj = ((JSONObject) (obj2)).getString("contentDescription");
            obj1 = ((JSONObject) (obj2)).getString("contentTitle");
            String s1 = ((JSONObject) (obj2)).getString("contentURL");
            obj2 = ((JSONObject) (obj2)).getString("imageURL");
            listener.facebookShare(s, ((String) (obj1)), ((String) (obj)), s1, ((String) (obj2)));
            return;
        }
        if (!s.equals("FacebookRequestReadPermissions")) goto _L8; else goto _L7
_L7:
        s = ((JSONObject) (obj)).getString("commandId");
        obj1 = ((JSONObject) (obj)).getJSONObject("payload");
        obj = new ArrayList();
        obj1 = ((JSONObject) (obj1)).getJSONArray("permissions");
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        j = ((JSONArray) (obj1)).length();
        i = 0;
_L12:
        if (i < j) goto _L11; else goto _L10
_L10:
        listener.facebookPermissionRequest(s, ((java.util.List) (obj)));
        return;
_L11:
        ((ArrayList) (obj)).add(((JSONArray) (obj1)).get(i).toString());
        i++;
        if (true) goto _L12; else goto _L8
_L8:
        if (s.equals("FacebookLogout"))
        {
            s = ((JSONObject) (obj)).getString("commandId");
            listener.facebookLogout(s);
            return;
        } else
        {
            Log.e("Badger", "Unsupported action");
            return;
        }
    }
}
