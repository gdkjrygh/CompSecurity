// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.mixpanel.android.util.RemoteService;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPConfig, InAppNotification, BadDecideObjectException, Survey, 
//            DecideMessages

class DecideChecker
{
    static class Result
    {

        public JSONArray eventBindings;
        public final List notifications = new ArrayList();
        public final List surveys = new ArrayList();
        public JSONArray variants;

        public Result()
        {
            eventBindings = DecideChecker.EMPTY_JSON_ARRAY;
            variants = DecideChecker.EMPTY_JSON_ARRAY;
        }
    }

    static class UnintelligibleMessageException extends Exception
    {

        private static final long serialVersionUID = 0xa5c6d9f49582d643L;

        public UnintelligibleMessageException(String s, JSONException jsonexception)
        {
            super(s, jsonexception);
        }
    }


    private static final JSONArray EMPTY_JSON_ARRAY = new JSONArray();
    private static final String LOGTAG = "MixpanelAPI.DChecker";
    private final List mChecks = new LinkedList();
    private final MPConfig mConfig;
    private final Context mContext;

    public DecideChecker(Context context, MPConfig mpconfig)
    {
        mContext = context;
        mConfig = mpconfig;
    }

    private String getDecideResponseFromServer(String s, String s1, RemoteService remoteservice)
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
    {
        String s2;
        int i;
        try
        {
            s2 = URLEncoder.encode(s, "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", s);
        }
        if (s1 == null) goto _L2; else goto _L1
_L1:
        s = URLEncoder.encode(s1, "utf-8");
_L9:
        s1 = (new StringBuilder()).append("?version=1&lib=android&token=").append(s2);
        if (s != null)
        {
            s1.append("&distinct_id=").append(s);
        }
        s1 = s1.toString();
        if (mConfig.getDisableFallback())
        {
            s = new String[1];
            s[0] = (new StringBuilder(String.valueOf(mConfig.getDecideEndpoint()))).append(s1).toString();
        } else
        {
            s = new String[2];
            s[0] = (new StringBuilder(String.valueOf(mConfig.getDecideEndpoint()))).append(s1).toString();
            s[1] = (new StringBuilder(String.valueOf(mConfig.getDecideFallbackEndpoint()))).append(s1).toString();
        }
        if (!MPConfig.DEBUG) goto _L4; else goto _L3
_L3:
        Log.v("MixpanelAPI.DChecker", "Querying decide server, urls:");
        i = 0;
_L7:
        if (i < s.length) goto _L5; else goto _L4
_L4:
        s = getUrls(remoteservice, mContext, s);
        if (s == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        s = null;
        continue; /* Loop/switch isn't completed */
_L5:
        Log.v("MixpanelAPI.DChecker", (new StringBuilder("    >> ")).append(s[i]).toString());
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        try
        {
            s = new String(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("UTF not supported on this platform?", s);
        }
        return s;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static int getDisplayWidth(Display display)
    {
        if (android.os.Build.VERSION.SDK_INT < 13)
        {
            return display.getWidth();
        } else
        {
            Point point = new Point();
            display.getSize(point);
            return point.x;
        }
    }

    private static Bitmap getNotificationImage(InAppNotification inappnotification, Context context, RemoteService remoteservice)
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
    {
        String as1[] = new String[2];
        as1[0] = inappnotification.getImage2xUrl();
        as1[1] = inappnotification.getImageUrl();
        int i = getDisplayWidth(((WindowManager)context.getSystemService("window")).getDefaultDisplay());
        String as[] = as1;
        if (inappnotification.getType() == InAppNotification.Type.TAKEOVER)
        {
            as = as1;
            if (i >= 720)
            {
                as = new String[3];
                as[0] = inappnotification.getImage4xUrl();
                as[1] = inappnotification.getImage2xUrl();
                as[2] = inappnotification.getImageUrl();
            }
        }
        inappnotification = getUrls(remoteservice, context, as);
        if (inappnotification != null)
        {
            return BitmapFactory.decodeByteArray(inappnotification, 0, inappnotification.length);
        } else
        {
            Log.i("MixpanelAPI.DChecker", (new StringBuilder("Failed to download images from ")).append(Arrays.toString(as)).toString());
            return null;
        }
    }

    private static byte[] getUrls(RemoteService remoteservice, Context context, String as[])
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
    {
        if (remoteservice.isOnline(context)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int i;
        int j;
        j = as.length;
        i = 0;
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = as[i];
        byte abyte0[] = remoteservice.performRequest(context, null);
        return abyte0;
        Object obj;
        obj;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder("Cannot interpret ")).append(context).append(" as a URL.").toString(), ((Throwable) (obj)));
_L5:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        obj;
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder("Cannot get ")).append(context).append(", file not found.").toString(), ((Throwable) (obj)));
        }
          goto _L5
        obj;
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder("Cannot get ")).append(context).append(".").toString(), ((Throwable) (obj)));
        }
          goto _L5
        remoteservice;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder("Out of memory when getting to ")).append(context).append(".").toString(), remoteservice);
        return null;
        if (true) goto _L1; else goto _L6
_L6:
    }

    static Result parseDecideResponse(String s)
        throws UnintelligibleMessageException
    {
        Object obj;
        Result result;
        JSONObject jsonobject;
        int i;
        result = new Result();
        int j;
        try
        {
            jsonobject = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new UnintelligibleMessageException((new StringBuilder("Mixpanel endpoint returned unparsable result:\n")).append(s).toString(), ((JSONException) (obj)));
        }
        obj = null;
        s = ((String) (obj));
        if (jsonobject.has("surveys"))
        {
            try
            {
                s = jsonobject.getJSONArray("surveys");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for surveys: ")).append(jsonobject).toString());
                s = ((String) (obj));
            }
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L10:
        if (i < s.length()) goto _L3; else goto _L2
_L2:
        obj = null;
        s = ((String) (obj));
        if (jsonobject.has("notifications"))
        {
            try
            {
                s = jsonobject.getJSONArray("notifications");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for notifications: ")).append(jsonobject).toString());
                s = ((String) (obj));
            }
        }
        if (s == null) goto _L5; else goto _L4
_L4:
        j = Math.min(s.length(), 2);
        i = 0;
_L8:
        if (i < j) goto _L6; else goto _L5
_L5:
        Object obj1;
        if (jsonobject.has("event_bindings"))
        {
            try
            {
                result.eventBindings = jsonobject.getJSONArray("event_bindings");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for event bindings: ")).append(jsonobject).toString());
            }
        }
        if (!jsonobject.has("variants"))
        {
            break MISSING_BLOCK_LABEL_143;
        }
        result.variants = jsonobject.getJSONArray("variants");
        return result;
_L3:
        try
        {
            obj = new Survey(s.getJSONObject(i));
            result.surveys.add(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.DChecker", (new StringBuilder("Received a strange response from surveys service: ")).append(s.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.DChecker", (new StringBuilder("Received a strange response from surveys service: ")).append(s.toString()).toString());
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L6:
        try
        {
            obj = new InAppNotification(s.getJSONObject(i));
            result.notifications.add(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e("MixpanelAPI.DChecker", (new StringBuilder("Received a strange response from notifications service: ")).append(s.toString()).toString(), ((Throwable) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e("MixpanelAPI.DChecker", (new StringBuilder("Received a strange response from notifications service: ")).append(s.toString()).toString(), ((Throwable) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.e("MixpanelAPI.DChecker", (new StringBuilder("Not enough memory to show load notification from package: ")).append(s.toString()).toString(), ((Throwable) (obj1)));
        }
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        s;
        Log.e("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel endpoint returned non-array JSON for variants: ")).append(jsonobject).toString());
        return result;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private Result runDecideCheck(String s, String s1, RemoteService remoteservice)
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException, UnintelligibleMessageException
    {
        s1 = getDecideResponseFromServer(s, s1, remoteservice);
        if (MPConfig.DEBUG)
        {
            Log.v("MixpanelAPI.DChecker", (new StringBuilder("Mixpanel decide server response was:\n")).append(s1).toString());
        }
        s = new Result();
        if (s1 != null)
        {
            s = parseDecideResponse(s1);
        }
        s1 = ((Result) (s)).notifications.iterator();
        do
        {
            if (!s1.hasNext())
            {
                return s;
            }
            InAppNotification inappnotification = (InAppNotification)s1.next();
            Bitmap bitmap = getNotificationImage(inappnotification, mContext, remoteservice);
            if (bitmap == null)
            {
                Log.i("MixpanelAPI.DChecker", (new StringBuilder("Could not retrieve image for notification ")).append(inappnotification.getId()).append(", will not show the notification.").toString());
                s1.remove();
            } else
            {
                inappnotification.setImage(bitmap);
            }
        } while (true);
    }

    public void addDecideCheck(DecideMessages decidemessages)
    {
        mChecks.add(decidemessages);
    }

    public void runDecideChecks(RemoteService remoteservice)
        throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException
    {
        Iterator iterator = mChecks.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            DecideMessages decidemessages = (DecideMessages)iterator.next();
            Object obj = decidemessages.getDistinctId();
            try
            {
                obj = runDecideCheck(decidemessages.getToken(), ((String) (obj)), remoteservice);
                decidemessages.reportResults(((Result) (obj)).surveys, ((Result) (obj)).notifications, ((Result) (obj)).eventBindings, ((Result) (obj)).variants);
            }
            catch (UnintelligibleMessageException unintelligiblemessageexception)
            {
                Log.e("MixpanelAPI.DChecker", unintelligiblemessageexception.getMessage(), unintelligiblemessageexception);
            }
        } while (true);
    }


}
