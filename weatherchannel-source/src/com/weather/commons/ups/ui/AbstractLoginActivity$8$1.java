// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.util.Log;
import android.widget.Toast;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.model.GraphUser;

// Referenced classes of package com.weather.commons.ups.ui:
//            AbstractLoginActivity

class val.session
    implements com.facebook.nActivity._cls8._cls1
{

    final essage this$1;
    final Session val$session;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        if (graphuser != null)
        {
            if (val$session.getState() != SessionState.CLOSED_LOGIN_FAILED)
            {
                AbstractLoginActivity.access$1500(_fld0, graphuser, val$session);
            }
            return;
        } else
        {
            Toast.makeText(_fld0, getString(com.weather.commons.ilure_message), 1).show();
            return;
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$session = Session.this;
        super();
    }

    // Unreferenced inner class com/weather/commons/ups/ui/AbstractLoginActivity$8

/* anonymous class */
    class AbstractLoginActivity._cls8
        implements com.facebook.Session.StatusCallback
    {

        final AbstractLoginActivity this$0;

        public void call(Session session1, SessionState sessionstate, Exception exception)
        {
            if (session1.isOpened())
            {
                Request.newMeRequest(session1, session1. new AbstractLoginActivity._cls8._cls1()).executeAsync();
                return;
            } else
            {
                Log.e("LoginActivity", "fb session is closed");
                return;
            }
        }

            
            {
                this$0 = AbstractLoginActivity.this;
                super();
            }
    }

}
