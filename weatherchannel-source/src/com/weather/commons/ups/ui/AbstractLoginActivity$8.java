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

class this._cls0
    implements com.facebook.ginActivity._cls8
{

    final AbstractLoginActivity this$0;

    public void call(final Session session, SessionState sessionstate, Exception exception)
    {
        if (session.isOpened())
        {
            Request.newMeRequest(session, new com.facebook.Request.GraphUserCallback() {

                final AbstractLoginActivity._cls8 this$1;
                final Session val$session;

                public void onCompleted(GraphUser graphuser, Response response)
                {
                    if (graphuser != null)
                    {
                        if (session.getState() != SessionState.CLOSED_LOGIN_FAILED)
                        {
                            AbstractLoginActivity.access$1500(this$0, graphuser, session);
                        }
                        return;
                    } else
                    {
                        Toast.makeText(this$0, getString(com.weather.commons.R.string.facebook_login_failure_message), 1).show();
                        return;
                    }
                }

            
            {
                this$1 = AbstractLoginActivity._cls8.this;
                session = session1;
                super();
            }
            }).executeAsync();
            return;
        } else
        {
            Log.e("LoginActivity", "fb session is closed");
            return;
        }
    }

    _cls1.val.session()
    {
        this$0 = AbstractLoginActivity.this;
        super();
    }
}
