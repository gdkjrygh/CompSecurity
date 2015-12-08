// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import net.hockeyapp.android.tasks.LoginTask;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.views.LoginView;

// Referenced classes of package net.hockeyapp.android:
//            Strings, LoginManager, LoginManagerListener

public class LoginActivity extends Activity
    implements android.view.View.OnClickListener
{

    private Handler loginHandler;
    private LoginTask loginTask;
    private int mode;
    private String secret;
    private String url;

    public LoginActivity()
    {
    }

    private void configureView()
    {
        if (mode == 1)
        {
            ((EditText)findViewById(12292)).setVisibility(4);
        }
        ((Button)findViewById(12293)).setOnClickListener(this);
    }

    private void initLoginHandler()
    {
        loginHandler = new Handler() {

            final LoginActivity this$0;

            public void handleMessage(Message message)
            {
                if (message.getData().getBoolean("success"))
                {
                    finish();
                    if (LoginManager.listener != null)
                    {
                        LoginManager.listener.onSuccess();
                    }
                    return;
                } else
                {
                    Toast.makeText(LoginActivity.this, "Login failed. Check your credentials.", 2000).show();
                    return;
                }
            }

            
            {
                this$0 = LoginActivity.this;
                super();
            }
        };
    }

    private void performAuthentication()
    {
        String s = ((EditText)findViewById(12291)).getText().toString();
        String s1 = ((EditText)findViewById(12292)).getText().toString();
        boolean flag = false;
        HashMap hashmap = new HashMap();
        if (mode == 1)
        {
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashmap.put("email", s);
            hashmap.put("authcode", md5((new StringBuilder()).append(secret).append(s).toString()));
        } else
        if (mode == 2)
        {
            if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashmap.put("email", s);
            hashmap.put("password", s1);
        }
        if (flag)
        {
            loginTask = new LoginTask(this, loginHandler, url, mode, hashmap);
            AsyncTaskUtils.execute(loginTask);
            return;
        } else
        {
            Toast.makeText(this, Strings.get(1281), 1000).show();
            return;
        }
    }

    public String md5(String s)
    {
        byte abyte0[];
        StringBuilder stringbuilder;
        int i;
        int j;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes());
            abyte0 = messagedigest.digest();
            stringbuilder = new StringBuilder();
            j = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        for (s = Integer.toHexString(abyte0[i] & 0xff); s.length() < 2; s = (new StringBuilder()).append("0").append(s).toString()) { }
        stringbuilder.append(s);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_34;
_L1:
        s = stringbuilder.toString();
        return s;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 12293: 
            performAuthentication();
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(new LoginView(this));
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            url = bundle.getString("url");
            secret = bundle.getString("secret");
            mode = bundle.getInt("mode");
        }
        configureView();
        initLoginHandler();
        bundle = ((Bundle) (getLastNonConfigurationInstance()));
        if (bundle != null)
        {
            loginTask = (LoginTask)bundle;
            loginTask.attach(this, loginHandler);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
label0:
        {
            if (i == 4)
            {
                if (LoginManager.listener == null)
                {
                    break label0;
                }
                LoginManager.listener.onBack();
            }
            return super.onKeyDown(i, keyevent);
        }
        keyevent = new Intent(this, LoginManager.mainActivity);
        keyevent.setFlags(0x4000000);
        keyevent.putExtra("net.hockeyapp.android.EXIT", true);
        startActivity(keyevent);
        return true;
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (loginTask != null)
        {
            loginTask.detach();
        }
        return loginTask;
    }
}
