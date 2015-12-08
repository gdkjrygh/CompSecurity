// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            PopupActivity, PopupJSListener

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        PopupActivity.access$6(_fld0).clearAnimation();
        PopupActivity.access$7(_fld0).setVisibility(8);
        if (PopupActivity.access$8(_fld0) != null)
        {
            PopupActivity.access$8(_fld0).cancel();
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/nbcuni/nbc/thevoice/PopupActivity$1

/* anonymous class */
    class PopupActivity._cls1
        implements PopupJSListener
    {

        final PopupActivity this$0;

        public void closePopup()
        {
            finish();
        }

        public void facebookLogin(String s, List list)
        {
            String s1 = "";
            PopupActivity.access$0(list);
            int i = Integer.parseInt(s);
            PopupActivity.access$1(PopupActivity.this, i);
            PopupActivity.access$2(PopupActivity.this, "FacebookLogin");
            Iterator iterator = list.iterator();
            s = s1;
            do
            {
                if (!iterator.hasNext())
                {
                    s.substring(0, s.length() - 1);
                    PopupActivity.access$3(PopupActivity.this, i, list);
                    return;
                }
                String s2 = (String)iterator.next();
                s = (new StringBuilder(String.valueOf(s))).append(s2).append(",").toString();
            } while (true);
        }

        public void facebookLogout(String s)
        {
            PopupActivity.access$4(PopupActivity.this, s);
        }

        public void facebookPermissionRequest(String s, List list)
        {
            PopupActivity.access$1(PopupActivity.this, Integer.parseInt(s));
            PopupActivity.access$2(PopupActivity.this, "FacebookRequestReadPermissions");
            if (AccessToken.getCurrentAccessToken() != null)
            {
                s = AccessToken.getCurrentAccessToken().getPermissions();
                if (!PopupActivity.access$5(PopupActivity.this, list, s))
                {
                    LoginManager.getInstance().logInWithReadPermissions(getParent(), list);
                }
            }
        }

        public void facebookShare(String s, String s1, String s2, String s3, String s4)
        {
            s = (new StringBuilder("https://www.facebook.com/dialog/feed?app_id=")).append(getString(0x7f08004b)).append("&link=").append(s3).append("&redirect_uri=").append(sharedPreferences.getString("votenowURL", "http://www.nbc.com/the-voice")).append("&name=").append(s1).append("&description=").append(s2).append("&picture=").append(s4).toString();
            handleFacebookShare(s);
        }

        public void hideLoadingScreen()
        {
            runOnUiThread(new PopupActivity._cls1._cls1());
        }

        public void passExpiresValue(String s)
        {
            android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("expiryDate", s);
            editor.commit();
        }


            
            {
                this$0 = PopupActivity.this;
                super();
            }
    }

}
