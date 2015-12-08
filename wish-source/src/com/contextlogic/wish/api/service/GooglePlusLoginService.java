// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiCallback;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.core.WishApiRequest;
import com.contextlogic.wish.api.core.WishApiResponse;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.util.StateSerializer;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GooglePlusLoginService extends ApiService
{
    public static interface FailureCallback
    {

        public abstract void onServiceFailed(boolean flag, String s);
    }


    private WishApiRequest apiRequest;

    public GooglePlusLoginService()
    {
    }

    private void serializeSession(String s, String s1, long l, String s2)
    {
        final JSONObject storedObject = new JSONObject();
        try
        {
            storedObject.put("userId", s);
            storedObject.put("googlePlusId", s1);
            storedObject.put("sessionCookie", s2);
            storedObject.put("timestamp", l);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        StateSerializer.getInstance().getThreadPool(com.contextlogic.wish.util.StateSerializer.SerializationType.Session).execute(new Runnable() {

            final GooglePlusLoginService this$0;
            final JSONObject val$storedObject;

            public void run()
            {
                Object obj1;
                Object obj2;
                Object obj3;
                Object obj4;
                obj2 = null;
                obj1 = null;
                obj3 = null;
                obj4 = null;
                Object obj = WishApplication.getAppInstance().openFileOutput("serialized_session", 0);
                obj1 = obj;
                obj2 = obj;
                ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
                objectoutputstream.writeObject(storedObject.toString());
                if (objectoutputstream != null)
                {
                    try
                    {
                        objectoutputstream.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_150;
                }
                ((FileOutputStream) (obj)).close();
_L2:
                return;
                obj;
                return;
                obj;
                obj2 = obj4;
                obj = obj1;
_L5:
                if (obj2 != null)
                {
                    try
                    {
                        ((ObjectOutputStream) (obj2)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }
                if (obj == null) goto _L2; else goto _L1
_L1:
                try
                {
                    ((FileOutputStream) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                obj;
                obj1 = obj3;
_L4:
                if (obj1 != null)
                {
                    try
                    {
                        ((ObjectOutputStream) (obj1)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }
                if (obj2 != null)
                {
                    try
                    {
                        ((FileOutputStream) (obj2)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }
                throw obj;
                Exception exception;
                exception;
                obj1 = objectoutputstream;
                obj2 = obj;
                obj = exception;
                if (true) goto _L4; else goto _L3
_L3:
                Throwable throwable;
                throwable;
                obj2 = objectoutputstream;
                  goto _L5
            }

            
            {
                this$0 = GooglePlusLoginService.this;
                storedObject = jsonobject;
                super();
            }
        });
    }

    public void cancelAllRequests()
    {
        if (apiRequest != null)
        {
            apiRequest.cancel();
            apiRequest = null;
        }
    }

    public boolean isPending()
    {
        return apiRequest != null;
    }

    public void requestService(final String googlePlusId, String s, String s1, final FbLoginService.SuccessCallback successCallback, final FailureCallback failureCallback)
    {
        cancelAllRequests();
        apiRequest = WishApi.getInstance().googlePlusLogin(googlePlusId, s, s1, new WishApiCallback() {

            final GooglePlusLoginService this$0;
            final FailureCallback val$failureCallback;
            final String val$googlePlusId;
            final FbLoginService.SuccessCallback val$successCallback;

            public void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                wishapirequest = null;
                apiRequest = null;
                if (failureCallback != null)
                {
                    boolean flag;
                    if (wishapiresponse != null && (wishapiresponse.getCode() == 11 || wishapiresponse.getCode() == 10))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (wishapiresponse != null)
                    {
                        wishapirequest = wishapiresponse.getMessage();
                    }
                    failureCallback.onServiceFailed(flag, wishapirequest);
                }
            }

            public void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse)
            {
                String s2;
                boolean flag;
                s2 = null;
                flag = false;
                apiRequest = null;
                if (!wishapiresponse.isErrorResponse()) goto _L2; else goto _L1
_L1:
                if (wishapiresponse.getCode() == 11 || wishapiresponse.getCode() == 10)
                {
                    flag = true;
                }
                if (failureCallback != null)
                {
                    wishapirequest = s2;
                    if (wishapiresponse != null)
                    {
                        wishapirequest = wishapiresponse.getMessage();
                    }
                    failureCallback.onServiceFailed(flag, wishapirequest);
                }
_L3:
                return;
_L2:
                String s3;
                s3 = (String)wishapirequest.getResponseCookies().get("sweeper_session");
                if (s3 == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                WishApi.getInstance().getConfig().addSessionCookie(s3);
                String s4;
                s4 = wishapiresponse.getData().getString("user");
                flag = wishapiresponse.getData().optBoolean("new_user", false);
                s2 = "None";
                wishapirequest = s2;
                if (!wishapiresponse.getData().has("signup_flow_type"))
                {
                    break MISSING_BLOCK_LABEL_167;
                }
                wishapirequest = s2;
                if (!wishapiresponse.getData().isNull("signup_flow_type"))
                {
                    wishapirequest = wishapiresponse.getData().getString("signup_flow_type");
                }
                wishapirequest = LoginActivity.getWishSignupFlow(wishapirequest);
                serializeSession(s4, googlePlusId, System.currentTimeMillis(), s3);
                if (successCallback != null)
                {
                    successCallback.onServiceSucceeded(s4, flag, wishapirequest);
                    return;
                }
                  goto _L3
                wishapirequest;
                if (failureCallback == null) goto _L3; else goto _L4
_L4:
                failureCallback.onServiceFailed(false, null);
                return;
                if (failureCallback == null) goto _L3; else goto _L5
_L5:
                failureCallback.onServiceFailed(false, null);
                return;
            }

            
            {
                this$0 = GooglePlusLoginService.this;
                failureCallback = failurecallback;
                googlePlusId = s;
                successCallback = successcallback;
                super();
            }
        });
    }


/*
    static WishApiRequest access$002(GooglePlusLoginService googleplusloginservice, WishApiRequest wishapirequest)
    {
        googleplusloginservice.apiRequest = wishapirequest;
        return wishapirequest;
    }

*/

}
