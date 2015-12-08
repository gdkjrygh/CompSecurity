// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.flow;

import android.content.Context;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.AccessToken;
import com.uservoice.uservoicesdk.model.AccessTokenResult;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

public class InitManager
{

    private final Runnable callback;
    private boolean canceled;
    private final Context context;

    public InitManager(Context context1, Runnable runnable)
    {
        context = context1;
        callback = runnable;
    }

    private void done()
    {
        callback.run();
    }

    private void loadUser()
    {
        if (Session.getInstance().getUser() == null)
        {
            if (Session.getInstance().getConfig().getAllowAnonymousFeedback())
            {
                done();
                return;
            }
            if (shouldSignIn())
            {
                RequestToken.getRequestToken(new DefaultCallback(context) {

                    final InitManager this$0;

                    public void onModel(RequestToken requesttoken)
                    {
                        if (canceled)
                        {
                            return;
                        } else
                        {
                            Session.getInstance().setRequestToken(requesttoken);
                            requesttoken = Session.getInstance().getConfig();
                            User.findOrCreate(requesttoken.getEmail(), requesttoken.getName(), requesttoken.getGuid(), new DefaultCallback(context) {

                                final _cls2 this$1;

                                public void onModel(AccessTokenResult accesstokenresult)
                                {
                                    if (canceled)
                                    {
                                        return;
                                    } else
                                    {
                                        Session.getInstance().setAccessToken(context, accesstokenresult.getAccessToken());
                                        Session.getInstance().setUser((User)accesstokenresult.getModel());
                                        done();
                                        return;
                                    }
                                }

                                public volatile void onModel(Object obj)
                                {
                                    onModel((AccessTokenResult)obj);
                                }

            
            {
                this$1 = _cls2.this;
                super(context1);
            }
                            });
                            return;
                        }
                    }

                    public volatile void onModel(Object obj)
                    {
                        onModel((RequestToken)obj);
                    }

            
            {
                this$0 = InitManager.this;
                super(context1);
            }
                });
                return;
            }
            AccessToken accesstoken = (AccessToken)BaseModel.load(Session.getInstance().getSharedPreferences(), "access_token", "access_token", com/uservoice/uservoicesdk/model/AccessToken);
            if (accesstoken != null)
            {
                Session.getInstance().setAccessToken(accesstoken);
                User.loadCurrentUser(new DefaultCallback(context) {

                    final InitManager this$0;

                    public void onModel(User user)
                    {
                        Session.getInstance().setUser(user);
                        done();
                    }

                    public volatile void onModel(Object obj)
                    {
                        onModel((User)obj);
                    }

            
            {
                this$0 = InitManager.this;
                super(context1);
            }
                });
                return;
            } else
            {
                done();
                return;
            }
        } else
        {
            done();
            return;
        }
    }

    private boolean shouldSignIn()
    {
        return Session.getInstance().getConfig().getEmail() != null;
    }

    public void cancel()
    {
        canceled = true;
    }

    public void init()
    {
        if (Session.getInstance().getClientConfig() == null)
        {
            ClientConfig.loadClientConfig(new DefaultCallback(context) {

                final InitManager this$0;

                public void onModel(ClientConfig clientconfig)
                {
                    Session.getInstance().setClientConfig(clientconfig);
                    loadUser();
                }

                public volatile void onModel(Object obj)
                {
                    onModel((ClientConfig)obj);
                }

            
            {
                this$0 = InitManager.this;
                super(context1);
            }
            });
            return;
        } else
        {
            loadUser();
            return;
        }
    }




}
