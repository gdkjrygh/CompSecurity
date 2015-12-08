// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import net.hockeyapp.android.tasks.LoginTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.PrefsUtil;
import net.hockeyapp.android.utils.Util;

// Referenced classes of package net.hockeyapp.android:
//            Constants, LoginActivity, LoginManagerListener

public class LoginManager
{

    static final String LOGIN_EXIT_KEY = "net.hockeyapp.android.EXIT";
    public static final int LOGIN_MODE_ANONYMOUS = 0;
    public static final int LOGIN_MODE_EMAIL_ONLY = 1;
    public static final int LOGIN_MODE_EMAIL_PASSWORD = 2;
    public static final int LOGIN_MODE_VALIDATE = 3;
    private static String identifier = null;
    static LoginManagerListener listener;
    static Class mainActivity;
    private static int mode;
    private static String secret = null;
    private static String urlString = null;
    private static Handler validateHandler = null;

    public LoginManager()
    {
    }

    private static String getURLString(int i)
    {
        String s = "";
        if (i != 2) goto _L2; else goto _L1
_L1:
        s = "authorize";
_L4:
        return (new StringBuilder()).append(urlString).append("api/3/apps/").append(identifier).append("/identity/").append(s).toString();
_L2:
        if (i == 1)
        {
            s = "check";
        } else
        if (i == 3)
        {
            s = "validate";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void register(Context context, String s, String s1, int i, Class class1)
    {
        register(context, s, s1, "https://sdk.hockeyapp.net/", i, class1);
    }

    public static void register(Context context, String s, String s1, int i, LoginManagerListener loginmanagerlistener)
    {
        listener = loginmanagerlistener;
        register(context, s, s1, i, (Class)null);
    }

    public static void register(Context context, String s, String s1, String s2, int i, Class class1)
    {
        if (context != null)
        {
            identifier = Util.sanitizeAppIdentifier(s);
            secret = s1;
            urlString = s2;
            mode = i;
            mainActivity = class1;
            if (validateHandler == null)
            {
                validateHandler = new Handler(context) {

                    final Context val$context;

                    public void handleMessage(Message message)
                    {
                        if (!message.getData().getBoolean("success"))
                        {
                            LoginManager.startLoginActivity(context);
                        }
                    }

            
            {
                context = context1;
                super();
            }
                };
            }
            Constants.loadFromContext(context);
        }
    }

    private static void startLoginActivity(Context context)
    {
        Intent intent = new Intent();
        intent.setFlags(0x50000000);
        intent.setClass(context, net/hockeyapp/android/LoginActivity);
        intent.putExtra("url", getURLString(mode));
        intent.putExtra("mode", mode);
        intent.putExtra("secret", secret);
        context.startActivity(intent);
    }

    public static void verifyLogin(Activity activity, Intent intent)
    {
        if (intent == null || !intent.getBooleanExtra("net.hockeyapp.android.EXIT", false)) goto _L2; else goto _L1
_L1:
        activity.finish();
_L4:
        return;
_L2:
        if (activity == null || mode == 0 || mode == 3) goto _L4; else goto _L3
_L3:
        Object obj;
        HashMap hashmap;
        obj = activity.getSharedPreferences("net.hockeyapp.android.login", 0);
        if (((SharedPreferences) (obj)).getInt("mode", -1) != mode)
        {
            PrefsUtil.applyChanges(((SharedPreferences) (obj)).edit().remove("auid").remove("iuid").putInt("mode", mode));
        }
        intent = ((SharedPreferences) (obj)).getString("auid", null);
        obj = ((SharedPreferences) (obj)).getString("iuid", null);
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (intent == null && obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (intent == null && mode == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (obj == null && mode == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag || flag1 || flag2)
        {
            startLoginActivity(activity);
            return;
        }
        hashmap = new HashMap();
        if (intent == null) goto _L6; else goto _L5
_L5:
        hashmap.put("type", "auid");
        hashmap.put("id", intent);
_L8:
        activity = new LoginTask(activity, validateHandler, getURLString(3), 3, hashmap);
        activity.setShowProgressDialog(false);
        AsyncTaskUtils.execute(activity);
        return;
_L6:
        if (obj != null)
        {
            hashmap.put("type", "iuid");
            hashmap.put("id", obj);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }


}
