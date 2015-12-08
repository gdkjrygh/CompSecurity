// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.flow;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.dialog.PasswordDialogFragment;
import com.uservoice.uservoicesdk.dialog.SigninDialogFragment;
import com.uservoice.uservoicesdk.model.AccessTokenResult;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

public class SigninManager
{

    private final FragmentActivity activity;
    private final Runnable callback;
    private String email;
    private String name;
    private boolean passwordOnly;

    private SigninManager(FragmentActivity fragmentactivity, String s, String s1, Runnable runnable)
    {
label0:
        {
            super();
            activity = fragmentactivity;
            if (s != null)
            {
                fragmentactivity = s;
                if (s.trim().length() != 0)
                {
                    break label0;
                }
            }
            fragmentactivity = null;
        }
label1:
        {
            email = fragmentactivity;
            if (s1 != null)
            {
                fragmentactivity = s1;
                if (s1.trim().length() != 0)
                {
                    break label1;
                }
            }
            fragmentactivity = null;
        }
        name = fragmentactivity;
        callback = runnable;
    }

    private void createUser()
    {
        RequestToken.getRequestToken(new DefaultCallback(activity) {

            final SigninManager this$0;

            public void onModel(RequestToken requesttoken)
            {
                Session.getInstance().setRequestToken(requesttoken);
                User.findOrCreate(email, name, new DefaultCallback(activity) {

                    final _cls2 this$1;

                    public void onModel(AccessTokenResult accesstokenresult)
                    {
                        Session.getInstance().setUser((User)accesstokenresult.getModel());
                        Session.getInstance().setAccessToken(activity, accesstokenresult.getAccessToken());
                        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.IDENTIFY);
                        callback.run();
                    }

                    public volatile void onModel(Object obj)
                    {
                        onModel((AccessTokenResult)obj);
                    }

            
            {
                this$1 = _cls2.this;
                super(context);
            }
                });
            }

            public volatile void onModel(Object obj)
            {
                onModel((RequestToken)obj);
            }

            
            {
                this$0 = SigninManager.this;
                super(context);
            }
        });
    }

    private void promptToSignIn()
    {
        if (passwordOnly)
        {
            (new PasswordDialogFragment(callback)).show(activity.getSupportFragmentManager(), "PasswordDialogFragment");
            return;
        } else
        {
            (new SigninDialogFragment(email, name, callback)).show(activity.getSupportFragmentManager(), "SigninDialogFragment");
            return;
        }
    }

    private void signIn()
    {
        Object obj = Session.getInstance().getUser();
        if (obj != null && (email == null || email.equals(((User) (obj)).getEmail())))
        {
            callback.run();
            return;
        }
        if (email == null)
        {
            obj = Session.getInstance().getEmail();
        } else
        {
            obj = email;
        }
        email = ((String) (obj));
        if (name == null)
        {
            obj = Session.getInstance().getName();
        } else
        {
            obj = name;
        }
        name = ((String) (obj));
        if (email != null)
        {
            User.discover(email, new Callback() {

                final SigninManager this$0;

                public void onError(RestResult restresult)
                {
                    createUser();
                }

                public void onModel(User user)
                {
                    promptToSignIn();
                }

                public volatile void onModel(Object obj1)
                {
                    onModel((User)obj1);
                }

            
            {
                this$0 = SigninManager.this;
                super();
            }
            });
            return;
        } else
        {
            promptToSignIn();
            return;
        }
    }

    public static void signIn(FragmentActivity fragmentactivity, Runnable runnable)
    {
        (new SigninManager(fragmentactivity, null, null, runnable)).signIn();
    }

    public static void signIn(FragmentActivity fragmentactivity, String s, String s1, Runnable runnable)
    {
        (new SigninManager(fragmentactivity, s, s1, runnable)).signIn();
    }

    public static void signinForSubscribe(FragmentActivity fragmentactivity, String s, Runnable runnable)
    {
        fragmentactivity = new SigninManager(fragmentactivity, s, Session.getInstance().getName(), runnable);
        fragmentactivity.setPasswordOnly(true);
        fragmentactivity.signIn();
    }

    public void setPasswordOnly(boolean flag)
    {
        passwordOnly = flag;
    }






}
