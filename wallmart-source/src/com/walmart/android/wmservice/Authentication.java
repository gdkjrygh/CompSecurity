// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.CrashlyticsKeys;
import com.walmart.android.data.CreateAccountResult;
import com.walmart.android.data.LoginResult;
import com.walmart.android.events.ShippingPassStatusEvent;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.shippingpass.ShippingPassService;
import com.walmart.android.service.shippingpass.ShippingPassStatus;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.LinkedList;

// Referenced classes of package com.walmart.android.wmservice:
//            Services, WalmartNetService

public class Authentication
{
    public static interface AuthCallback
    {

        public abstract void onFailure(int i);

        public abstract void onSuccess();
    }

    public static interface CreateAccountCallback
    {

        public abstract void onFailure(int i, String as[]);

        public abstract void onSuccess();
    }

    private abstract class SingleTaskAsyncCallbackOnThread
        implements AsyncCallback
    {

        private final Handler handler;
        private int id;
        final Authentication this$0;

        public int getID()
        {
            return id;
        }

        public void onCancelled()
        {
            handler.post(new Runnable() {

                final SingleTaskAsyncCallbackOnThread this$1;

                public void run()
                {
                    onCancelledSameThread();
                    done();
                }

            
            {
                this$1 = SingleTaskAsyncCallbackOnThread.this;
                super();
            }
            });
        }

        public void onCancelledSameThread()
        {
        }

        public void onFailure(final Object error, Object obj)
        {
            handler.post(((_cls1) (obj)). new Runnable() {

                final SingleTaskAsyncCallbackOnThread this$1;
                final Object val$data;
                final Object val$error;

                public void run()
                {
                    onFailureSameThread(error, data);
                    done();
                }

            
            {
                this$1 = final_singletaskasynccallbackonthread;
                error = obj;
                data = Object.this;
                super();
            }
            });
        }

        public abstract void onFailureSameThread(Object obj, Object obj1);

        public void onSuccess(Object obj)
        {
            handler.post(((_cls2) (obj)). new Runnable() {

                final SingleTaskAsyncCallbackOnThread this$1;
                final Object val$data;

                public void run()
                {
                    onSuccessSameThread(data);
                    done();
                }

            
            {
                this$1 = final_singletaskasynccallbackonthread;
                data = Object.this;
                super();
            }
            });
        }

        public abstract void onSuccessSameThread(Object obj);

        public void setID(int i)
        {
            id = i;
        }

        public SingleTaskAsyncCallbackOnThread(Handler handler1)
        {
            this$0 = Authentication.this;
            super();
            if (handler1 == null)
            {
                throw new IllegalArgumentException("Handler must not be null");
            } else
            {
                handler = handler1;
                return;
            }
        }
    }


    public static final int AUTH_ERROR_NO_CREDENTIALS_STORED = 4;
    public static final int AUTH_ERROR_NO_NETWORK = 1;
    public static final int AUTH_ERROR_SESSION_NOT_VALID = 3;
    public static final int AUTH_ERROR_UNKNOWN = 0;
    public static final int AUTH_ERROR_USERNAME_PASSWORD_INCORRECT = 2;
    public static final boolean DEBUG = false;
    public static final String MERGE_TYPE_MERGE = "merge";
    public static final String MERGE_TYPE_NONE = "none";
    public static final String MERGE_TYPE_SWEEP = "sweep";
    private static final long SESSION_RENEW_PERIOD = 0x927c0L;
    private static final String SHARED_PREF_KEY_CID = "cid";
    private static final String SHARED_PREF_KEY_CUSTOMER_ID = "customerid";
    private static final String SHARED_PREF_KEY_FIRST_NAME = "firstname";
    private static final String SHARED_PREF_KEY_LAST_NAME = "lastname";
    private static final String SHARED_PREF_KEY_PASSWORD = "password";
    private static final String SHARED_PREF_KEY_SHIPPINGPASS = "shippingpass";
    private static final String SHARED_PREF_KEY_SHIPPINGPASS_ELIGIBLE = "shippingpass_eligible";
    private static final String SHARED_PREF_KEY_TOKEN = "token";
    private static final String SHARED_PREF_KEY_USERNAME = "username";
    private static final String SHARED_PREF_NAME = "auth";
    private static final String SHIPPING_PASS_ABSENT = "absent";
    private static final String SHIPPING_PASS_SUBSCRIBED = "subscribed";
    private static final String SHIPPING_PASS_UNSUBSCRIBED = "unsubscribed";
    public static final String TAG = com/walmart/android/wmservice/Authentication.getSimpleName();
    private final Context mContext;
    private final Handler mHandler = new Handler();
    private AuthenticationStatusEvent mLastAuthChangedEvent;
    private long mLastLogin;
    private long mLastSessionRenew;
    private final SharedPreferences mPreferences;
    private final LinkedList mQueue = new LinkedList();
    private WalmartNetService mWalmartNetService;

    Authentication(Context context)
    {
        mLastLogin = 0L;
        mLastSessionRenew = 0L;
        mContext = context;
        mPreferences = mContext.getSharedPreferences("auth", 0);
        mPreferences.edit().remove("password").apply();
        mLastAuthChangedEvent = createAuthenticationStatusChangedEvent(false);
    }

    private void clearCredentials()
    {
        android.content.SharedPreferences.Editor editor = mPreferences.edit();
        editor.remove("username");
        editor.remove("firstname");
        editor.remove("lastname");
        editor.remove("customerid");
        editor.remove("cid");
        editor.remove("token");
        editor.remove("shippingpass");
        editor.apply();
    }

    private AuthenticationStatusEvent createAuthenticationStatusChangedEvent(boolean flag)
    {
        return createAuthenticationStatusChangedEvent(flag, false, false);
    }

    private AuthenticationStatusEvent createAuthenticationStatusChangedEvent(boolean flag, boolean flag1, boolean flag2)
    {
        AuthenticationStatusEvent authenticationstatusevent = new AuthenticationStatusEvent();
        authenticationstatusevent.loggedIn = flag;
        authenticationstatusevent.hasCredentials = hasCredentials();
        authenticationstatusevent.firstName = getFirstName();
        authenticationstatusevent.lastName = getLastName();
        authenticationstatusevent.customerId = getCustomerId();
        authenticationstatusevent.cid = getCid();
        authenticationstatusevent.email = getEmail();
        authenticationstatusevent.accountCreated = flag1;
        authenticationstatusevent.emailSignup = flag2;
        authenticationstatusevent.isShippingPassMember = isShippingPassMember();
        return authenticationstatusevent;
    }

    private void done()
    {
        mQueue.poll();
        executeNextInQueue();
    }

    private void execute(Runnable runnable)
    {
        boolean flag = mQueue.isEmpty();
        mQueue.add(runnable);
        if (flag)
        {
            executeNextInQueue();
        }
    }

    private void executeNextInQueue()
    {
        if (!mQueue.isEmpty())
        {
            ((Runnable)mQueue.peek()).run();
        }
    }

    private int getAuthErrorFromWalmartNetServiceError(int i)
    {
        switch (i)
        {
        default:
            return 0;

        case 90002: 
            return 1;

        case 401: 
            return 2;
        }
    }

    private static int getCartHandling(String s)
    {
        byte byte0 = 3;
        if ("sweep".equals(s))
        {
            byte0 = 2;
        } else
        if ("merge".equals(s))
        {
            return 1;
        }
        return byte0;
    }

    private String getToken()
    {
        return mPreferences.getString("token", "");
    }

    private boolean isShippingPassMember(String s)
    {
        return s != null && s.equalsIgnoreCase("subscribed");
    }

    private void loginAuto(final AuthCallback callback)
    {
        execute(new Runnable() {

            final Authentication this$0;
            final AuthCallback val$callback;

            public void run()
            {
                if (hasCredentials())
                {
                    mWalmartNetService.validateToken(getToken(), new SingleTaskAsyncCallbackOnThread(mHandler) {

                        final _cls2 this$1;

                        public void onFailureSameThread(Integer integer, LoginResult loginresult)
                        {
                            if (integer.intValue() == 401)
                            {
                                clearToken();
                                callback.onFailure(4);
                                return;
                            } else
                            {
                                callback.onFailure(getAuthErrorFromWalmartNetServiceError(integer.intValue()));
                                return;
                            }
                        }

                        public volatile void onFailureSameThread(Object obj, Object obj1)
                        {
                            onFailureSameThread((Integer)obj, (LoginResult)obj1);
                        }

                        public void onSuccessSameThread(LoginResult loginresult)
                        {
                            if (loginresult.isLoggedIn())
                            {
                                onLoggedIn(loginresult, true);
                                callback.onSuccess();
                                return;
                            } else
                            {
                                clearToken();
                                callback.onFailure(4);
                                return;
                            }
                        }

                        public volatile void onSuccessSameThread(Object obj)
                        {
                            onSuccessSameThread((LoginResult)obj);
                        }

            
            {
                this$1 = _cls2.this;
                super(handler);
            }
                    });
                    return;
                } else
                {
                    callback.onFailure(4);
                    return;
                }
            }

            
            {
                this$0 = Authentication.this;
                callback = authcallback;
                super();
            }
        });
    }

    private void notifyAuthSuccess(boolean flag, boolean flag1)
    {
        post(createAuthenticationStatusChangedEvent(true, flag, flag1));
    }

    private void notifyLogoutSuccess()
    {
        post(createAuthenticationStatusChangedEvent(false, false, false));
    }

    private void onAccountCreated(LoginResult loginresult, boolean flag)
    {
        onLoggedIn(loginresult, true, flag, false);
    }

    private void onLoggedIn(LoginResult loginresult, boolean flag)
    {
        onLoggedIn(loginresult, false, false, flag);
    }

    private void onLoggedIn(LoginResult loginresult, boolean flag, boolean flag1, boolean flag2)
    {
        setUserInformation(loginresult.getFirstName(), loginresult.getLastName(), loginresult.getCustomerId(), loginresult.getCid(), loginresult.getShippingPass());
        notifyAuthSuccess(flag, flag1);
        long l = System.currentTimeMillis();
        if (!flag2)
        {
            setLastLoginTime(l);
        }
        setLastSessionRenewal(l);
    }

    private void onSessionEnded()
    {
        setLastLoginTime(0L);
        setLastSessionRenewal(0L);
    }

    private void post(AuthenticationStatusEvent authenticationstatusevent)
    {
        mLastAuthChangedEvent = authenticationstatusevent;
        MessageBus.getBus().post(authenticationstatusevent);
    }

    private void setCredentials(String s, String s1)
    {
        mPreferences.edit().putString("username", s).putString("token", s1).apply();
    }

    private void setLastLoginTime(long l)
    {
        mLastLogin = l;
        CrashlyticsKeys.setTimestamp("last_login", l);
    }

    private void setLastSessionRenewal(long l)
    {
        mLastSessionRenew = l;
        CrashlyticsKeys.setTimestamp("last_session_renewal", l);
    }

    private void setUserInformation(String s, String s1, String s2, String s3, String s4)
    {
        android.content.SharedPreferences.Editor editor = mPreferences.edit();
        if (!TextUtils.isEmpty(s))
        {
            editor.putString("firstname", s);
        }
        if (!TextUtils.isEmpty(s1))
        {
            editor.putString("lastname", s1);
        }
        boolean flag = isShippingPassMember();
        if (!TextUtils.isEmpty(s4))
        {
            editor.putString("shippingpass", s4);
        }
        editor.putString("customerid", s2);
        editor.putString("cid", s3);
        editor.apply();
        WLog.d(TAG, (new StringBuilder()).append("setUserInformation(): ShippingPass member status: ").append(isShippingPassMember()).toString());
        if (flag != isShippingPassMember())
        {
            WLog.d(TAG, "setUserInformation(): ShippingPass member status changed, sending event");
            MessageBus.getBus().post(new ShippingPassStatusEvent());
        }
        updateShippingPassEligibility(s4);
    }

    private void updateShippingPassEligibility(String s)
    {
        if (!isShippingPassMember(s))
        {
            Services.get().getShippingPassService().getStatus().addCallback(new CallbackSameThread() {

                final Authentication this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    super.onResultSameThread(request, result);
                    if (result.successful() && result.hasData())
                    {
                        boolean flag = mPreferences.getBoolean("shippingpass_eligible", false);
                        mPreferences.edit().putBoolean("shippingpass_eligible", ((ShippingPassStatus)result.getData()).isEligible()).apply();
                        if (flag != ((ShippingPassStatus)result.getData()).isEligible())
                        {
                            WLog.d(Authentication.TAG, "setUserInformation(): ShippingPass eligibility changed, sending event");
                            MessageBus.getBus().post(new ShippingPassStatusEvent());
                        }
                    }
                }

            
            {
                this$0 = Authentication.this;
                super();
            }
            });
        }
    }

    public void clearLastLoginTime()
    {
        setLastLoginTime(0L);
        setLastSessionRenewal(0L);
    }

    public void clearToken()
    {
        mPreferences.edit().remove("token").apply();
    }

    public void createAccount(final String firstName, final String lastName, final String email, final String password, final boolean spam, final String mergeType, final CreateAccountCallback callback)
    {
        execute(new Runnable() {

            final Authentication this$0;
            final CreateAccountCallback val$callback;
            final String val$email;
            final String val$firstName;
            final String val$lastName;
            final String val$mergeType;
            final String val$password;
            final boolean val$spam;

            public void run()
            {
                mWalmartNetService.createAccount(firstName, lastName, email, password, spam, Authentication.getCartHandling(mergeType), new SingleTaskAsyncCallbackOnThread(mHandler) {

                    final _cls6 this$1;

                    public void onFailureSameThread(Integer integer, CreateAccountResult createaccountresult)
                    {
                        CreateAccountCallback createaccountcallback = callback;
                        int i = integer.intValue();
                        if (createaccountresult != null)
                        {
                            integer = createaccountresult.getErrors();
                        } else
                        {
                            integer = null;
                        }
                        createaccountcallback.onFailure(i, integer);
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (CreateAccountResult)obj1);
                    }

                    public void onSuccessSameThread(CreateAccountResult createaccountresult)
                    {
                        if (createaccountresult.isLoggedIn())
                        {
                            setCredentials(email, createaccountresult.getToken());
                            onAccountCreated(createaccountresult, spam);
                            callback.onSuccess();
                            return;
                        } else
                        {
                            callback.onFailure(200, createaccountresult.getErrors());
                            return;
                        }
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((CreateAccountResult)obj);
                    }

            
            {
                this$1 = _cls6.this;
                super(handler);
            }
                });
            }

            
            {
                this$0 = Authentication.this;
                firstName = s;
                lastName = s1;
                email = s2;
                password = s3;
                spam = flag;
                mergeType = s4;
                callback = createaccountcallback;
                super();
            }
        });
    }

    void destroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public String getCid()
    {
        return mPreferences.getString("cid", "");
    }

    public String getCustomerId()
    {
        return mPreferences.getString("customerid", "");
    }

    public String getEmail()
    {
        return getUsername();
    }

    public String getFirstAndLastNames()
    {
        String s = getFirstName();
        String s1 = getLastName();
        StringBuilder stringbuilder = (new StringBuilder()).append(s);
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            s = "";
        } else
        {
            s = " ";
        }
        return stringbuilder.append(s).append(s1).toString();
    }

    public String getFirstName()
    {
        return mPreferences.getString("firstname", "");
    }

    public AuthenticationStatusEvent getLastAuthChangedEvent()
    {
        return mLastAuthChangedEvent;
    }

    public long getLastLoginTime()
    {
        return mLastLogin;
    }

    public String getLastName()
    {
        return mPreferences.getString("lastname", "");
    }

    public long getLastSessionRenewal()
    {
        return mLastSessionRenew;
    }

    public String getUsername()
    {
        return mPreferences.getString("username", "");
    }

    public boolean hasCredentials()
    {
        return !TextUtils.isEmpty(getToken());
    }

    void init(WalmartNetService walmartnetservice)
    {
        mWalmartNetService = walmartnetservice;
        MessageBus.getBus().register(this);
    }

    public boolean isShippingPassEligibleOrMember()
    {
        boolean flag = false;
        if (isShippingPassMember() || mPreferences.getBoolean("shippingpass_eligible", false))
        {
            flag = true;
        }
        return flag;
    }

    public boolean isShippingPassMember()
    {
        return isShippingPassMember(mPreferences.getString("shippingpass", ""));
    }

    public void login(final String username, final String password, final String mergeType, final AuthCallback callback)
    {
        execute(new Runnable() {

            final Authentication this$0;
            final AuthCallback val$callback;
            final String val$mergeType;
            final String val$password;
            final String val$username;

            public void run()
            {
                WLog.d(Authentication.TAG, "COOKIES BEFORE LOGIN");
                mWalmartNetService.printCookies();
                mWalmartNetService.login(username, password, Authentication.getCartHandling(mergeType), new SingleTaskAsyncCallbackOnThread(mHandler) {

                    final _cls1 this$1;

                    public void onFailureSameThread(Integer integer, LoginResult loginresult)
                    {
                        callback.onFailure(getAuthErrorFromWalmartNetServiceError(integer.intValue()));
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (LoginResult)obj1);
                    }

                    public void onSuccessSameThread(LoginResult loginresult)
                    {
                        WLog.d(Authentication.TAG, "COOKIES AFTER LOGIN");
                        mWalmartNetService.printCookies();
                        if (loginresult.isLoggedIn())
                        {
                            setCredentials(username, loginresult.getToken());
                            onLoggedIn(loginresult, false);
                            callback.onSuccess();
                            return;
                        } else
                        {
                            onSessionEnded();
                            callback.onFailure(2);
                            return;
                        }
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((LoginResult)obj);
                    }

            
            {
                this$1 = _cls1.this;
                super(handler);
            }
                });
            }

            
            {
                this$0 = Authentication.this;
                username = s;
                password = s1;
                mergeType = s2;
                callback = authcallback;
                super();
            }
        });
    }

    public void logout(final AuthCallback callback, final boolean notifyListeners)
    {
        execute(new Runnable() {

            final Authentication this$0;
            final AuthCallback val$callback;
            final boolean val$notifyListeners;

            public void run()
            {
                mWalmartNetService.logOut(new SingleTaskAsyncCallbackOnThread(mHandler) {

                    final _cls5 this$1;

                    public void onFailureSameThread(Integer integer, Boolean boolean1)
                    {
                        callback.onFailure(getAuthErrorFromWalmartNetServiceError(integer.intValue()));
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (Boolean)obj1);
                    }

                    public void onSuccessSameThread(Boolean boolean1)
                    {
                        clearCredentials();
                        onSessionEnded();
                        if (notifyListeners)
                        {
                            notifyLogoutSuccess();
                        }
                        callback.onSuccess();
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((Boolean)obj);
                    }

            
            {
                this$1 = _cls5.this;
                super(handler);
            }
                });
            }

            
            {
                this$0 = Authentication.this;
                callback = authcallback;
                notifyListeners = flag;
                super();
            }
        });
    }

    public boolean needsSessionRenewal()
    {
        return System.currentTimeMillis() - getLastSessionRenewal() > 0x927c0L;
    }

    public void renewSession(AuthCallback authcallback)
    {
        renewSession(false, authcallback);
    }

    public void renewSession(final boolean force, final AuthCallback callback)
    {
        execute(new Runnable() {

            final Authentication this$0;
            final AuthCallback val$callback;
            final boolean val$force;

            public void run()
            {
                if (hasCredentials())
                {
                    if (force || needsSessionRenewal())
                    {
                        loginAuto(callback);
                    } else
                    {
                        callback.onSuccess();
                    }
                } else
                {
                    callback.onFailure(4);
                }
                done();
            }

            
            {
                this$0 = Authentication.this;
                force = flag;
                callback = authcallback;
                super();
            }
        });
    }

    public void verify(final AuthCallback callback)
    {
        execute(new Runnable() {

            final Authentication this$0;
            final AuthCallback val$callback;

            public void run()
            {
                WLog.d(Authentication.TAG, "COOKIES BEFORE VERIFY");
                mWalmartNetService.printCookies();
                mWalmartNetService.verifyLogin(new SingleTaskAsyncCallbackOnThread(mHandler) {

                    final _cls3 this$1;

                    public void onFailureSameThread(Integer integer, LoginResult loginresult)
                    {
                        callback.onFailure(getAuthErrorFromWalmartNetServiceError(integer.intValue()));
                    }

                    public volatile void onFailureSameThread(Object obj, Object obj1)
                    {
                        onFailureSameThread((Integer)obj, (LoginResult)obj1);
                    }

                    public void onSuccessSameThread(LoginResult loginresult)
                    {
                        WLog.d(Authentication.TAG, "COOKIES AFTER VERIFY");
                        mWalmartNetService.printCookies();
                        callback.onSuccess();
                    }

                    public volatile void onSuccessSameThread(Object obj)
                    {
                        onSuccessSameThread((LoginResult)obj);
                    }

            
            {
                this$1 = _cls3.this;
                super(handler);
            }
                });
            }

            
            {
                this$0 = Authentication.this;
                callback = authcallback;
                super();
            }
        });
    }















}
