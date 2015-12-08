// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.FrameLayout;
import java.util.Map;

// Referenced classes of package com.sessionm.api:
//            ActivityListener, SessionListener, SessionM, Activity, 
//            AchievementData, User

public abstract class BaseActivity extends Activity
    implements ActivityListener, SessionListener
{

    private static final String TAG = "SessionM.BaseActivity";

    public BaseActivity()
    {
    }

    protected void logAction(String s)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".logAction(): ").append(s).toString());
        }
        SessionM.getInstance().logAction(s);
    }

    protected void onCreate(Bundle bundle)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onCreate()").toString());
        }
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onDestroy()").toString());
        }
        super.onDestroy();
    }

    public void onDismissed(SessionM sessionm)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onDismissed()").toString());
        }
    }

    protected void onPause()
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onPause()").toString());
        }
        SessionM.getInstance().onActivityPause(this);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        SessionM sessionm = SessionM.getInstance();
        com.sessionm.api.Activity activity = sessionm.getCurrentActivity();
        if (activity != null && !activity.isAndroidActivity())
        {
            sessionm.dismissActivity();
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void onPresented(SessionM sessionm)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onPresented()").toString());
        }
    }

    protected void onRestart()
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onRestart()").toString());
        }
        super.onRestart();
    }

    protected void onResume()
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onResume()").toString());
        }
        super.onResume();
        SessionM.getInstance().onActivityResume(this);
    }

    public void onSessionFailed(SessionM sessionm, int i)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onSessionFailed(): ").append(i).toString());
        }
    }

    public void onSessionStateChanged(SessionM sessionm, SessionM.State state)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onSessionStateChanged(): ").append(state).toString());
        }
    }

    protected void onStart()
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onStart()").toString());
        }
        super.onStart();
        SessionM sessionm = SessionM.getInstance();
        sessionm.onActivityStart(this);
        sessionm.setApplicationContext(this);
    }

    protected void onStop()
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onStop()").toString());
        }
        super.onStop();
        SessionM.getInstance().onActivityStop(this);
    }

    public void onUnavailable(SessionM sessionm)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onActivityUnavailable()").toString());
        }
    }

    public void onUnclaimedAchievement(SessionM sessionm, AchievementData achievementdata)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onUnclaimedAchievement(): ").append(achievementdata).toString());
        }
    }

    public void onUserAction(SessionM sessionm, ActivityListener.UserAction useraction, Map map)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onUserAction(): ").append(useraction).toString());
        }
    }

    public void onUserUpdated(SessionM sessionm, User user)
    {
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".onUserUpdated(): ").append(user).toString());
        }
    }

    public boolean shouldPresentAchievement(SessionM sessionm, AchievementData achievementdata)
    {
        ActivityListener activitylistener;
        boolean flag;
        boolean flag1;
        flag1 = sessionm.isAutopresentMode();
        activitylistener = sessionm.getActivityListener();
        flag = flag1;
        if (activitylistener == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        flag = flag1;
        if (activitylistener == this)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        flag = activitylistener.shouldPresentAchievement(sessionm, achievementdata);
_L2:
        if (Log.isLoggable("SessionM.BaseActivity", 3))
        {
            Log.d("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".shouldPresentAchievement(): ").append(flag).toString());
        }
        return flag;
        sessionm;
        flag = flag1;
        if (Log.isLoggable("SessionM.BaseActivity", 6))
        {
            Log.e("SessionM.BaseActivity", (new StringBuilder()).append(this).append(".shouldPresentAchievement()").toString(), sessionm);
            flag = flag1;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public FrameLayout viewGroupForActivity(SessionM sessionm)
    {
        return null;
    }
}
