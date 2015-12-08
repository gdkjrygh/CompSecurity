// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.WorkQueue;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            ShareInternalUtility, LikeDialog, LikeStatusClient, ResultProcessor

public class LikeActionController
{
    private abstract class AbstractRequestWrapper
        implements RequestWrapper
    {

        protected FacebookRequestError error;
        protected String objectId;
        protected com.facebook.share.widget.LikeView.ObjectType objectType;
        private GraphRequest request;
        final LikeActionController this$0;

        public void addToBatch(GraphRequestBatch graphrequestbatch)
        {
            graphrequestbatch.add(request);
        }

        public FacebookRequestError getError()
        {
            return error;
        }

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error running request for object '%s' with type '%s' : %s", new Object[] {
                objectId, objectType, facebookrequesterror
            });
        }

        protected abstract void processSuccess(GraphResponse graphresponse);

        protected void setRequest(GraphRequest graphrequest)
        {
            request = graphrequest;
            graphrequest.setVersion("v2.4");
            graphrequest.setCallback(new com.facebook.GraphRequest.Callback() {

                final AbstractRequestWrapper this$1;

                public void onCompleted(GraphResponse graphresponse)
                {
                    error = graphresponse.getError();
                    if (error != null)
                    {
                        processError(error);
                        return;
                    } else
                    {
                        processSuccess(graphresponse);
                        return;
                    }
                }

            
            {
                this$1 = AbstractRequestWrapper.this;
                super();
            }
            });
        }

        protected AbstractRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
        {
            this$0 = LikeActionController.this;
            super();
            objectId = s;
            objectType = objecttype;
        }
    }

    private static class CreateLikeActionControllerWorkItem
        implements Runnable
    {

        private CreationCallback callback;
        private String objectId;
        private com.facebook.share.widget.LikeView.ObjectType objectType;

        public void run()
        {
            LikeActionController.createControllerForObjectIdAndType(objectId, objectType, callback);
        }

        CreateLikeActionControllerWorkItem(String s, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
        {
            objectId = s;
            objectType = objecttype;
            callback = creationcallback;
        }
    }

    public static interface CreationCallback
    {

        public abstract void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception);
    }

    private class GetEngagementRequestWrapper extends AbstractRequestWrapper
    {

        String likeCountStringWithLike;
        String likeCountStringWithoutLike;
        String socialSentenceStringWithLike;
        String socialSentenceStringWithoutLike;
        final LikeActionController this$0;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error fetching engagement for object '%s' with type '%s' : %s", new Object[] {
                objectId, objectType, facebookrequesterror
            });
            logAppEventForError("get_engagement", facebookrequesterror);
        }

        protected void processSuccess(GraphResponse graphresponse)
        {
            graphresponse = Utility.tryGetJSONObjectFromResponse(graphresponse.getJSONObject(), "engagement");
            if (graphresponse != null)
            {
                likeCountStringWithLike = graphresponse.optString("count_string_with_like", likeCountStringWithLike);
                likeCountStringWithoutLike = graphresponse.optString("count_string_without_like", likeCountStringWithoutLike);
                socialSentenceStringWithLike = graphresponse.optString("social_sentence_with_like", socialSentenceStringWithLike);
                socialSentenceStringWithoutLike = graphresponse.optString("social_sentence_without_like", socialSentenceStringWithoutLike);
            }
        }

        GetEngagementRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
        {
            this$0 = LikeActionController.this;
            super(s, objecttype);
            likeCountStringWithLike = LikeActionController.this.likeCountStringWithLike;
            likeCountStringWithoutLike = LikeActionController.this.likeCountStringWithoutLike;
            socialSentenceStringWithLike = socialSentenceWithLike;
            socialSentenceStringWithoutLike = socialSentenceWithoutLike;
            likeactioncontroller = new Bundle();
            putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), s, LikeActionController.this, HttpMethod.GET));
        }
    }

    private class GetOGObjectIdRequestWrapper extends AbstractRequestWrapper
    {

        final LikeActionController this$0;
        String verifiedObjectId;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            if (facebookrequesterror.getErrorMessage().contains("og_object"))
            {
                error = null;
                return;
            } else
            {
                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
                    objectId, objectType, facebookrequesterror
                });
                return;
            }
        }

        protected void processSuccess(GraphResponse graphresponse)
        {
            graphresponse = Utility.tryGetJSONObjectFromResponse(graphresponse.getJSONObject(), objectId);
            if (graphresponse != null)
            {
                graphresponse = graphresponse.optJSONObject("og_object");
                if (graphresponse != null)
                {
                    verifiedObjectId = graphresponse.optString("id");
                }
            }
        }

        GetOGObjectIdRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
        {
            this$0 = LikeActionController.this;
            super(s, objecttype);
            likeactioncontroller = new Bundle();
            putString("fields", "og_object.fields(id)");
            putString("ids", s);
            setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "", LikeActionController.this, HttpMethod.GET));
        }
    }

    private class GetOGObjectLikesRequestWrapper extends AbstractRequestWrapper
        implements LikeRequestWrapper
    {

        private final String objectId;
        private boolean objectIsLiked;
        private final com.facebook.share.widget.LikeView.ObjectType objectType;
        final LikeActionController this$0;
        private String unlikeToken;

        public String getUnlikeToken()
        {
            return unlikeToken;
        }

        public boolean isObjectLiked()
        {
            return objectIsLiked;
        }

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error fetching like status for object '%s' with type '%s' : %s", new Object[] {
                objectId, objectType, facebookrequesterror
            });
            logAppEventForError("get_og_object_like", facebookrequesterror);
        }

        protected void processSuccess(GraphResponse graphresponse)
        {
            graphresponse = Utility.tryGetJSONArrayFromResponse(graphresponse.getJSONObject(), "data");
            if (graphresponse == null) goto _L2; else goto _L1
_L1:
            int i = 0;
_L5:
            if (i < graphresponse.length()) goto _L3; else goto _L2
_L2:
            return;
_L3:
            JSONObject jsonobject = graphresponse.optJSONObject(i);
            if (jsonobject != null)
            {
                objectIsLiked = true;
                JSONObject jsonobject1 = jsonobject.optJSONObject("application");
                AccessToken accesstoken = AccessToken.getCurrentAccessToken();
                if (jsonobject1 != null && accesstoken != null && Utility.areObjectsEqual(accesstoken.getApplicationId(), jsonobject1.optString("id")))
                {
                    unlikeToken = jsonobject.optString("id");
                }
            }
            i++;
            if (true) goto _L5; else goto _L4
_L4:
        }

        GetOGObjectLikesRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
        {
            this$0 = LikeActionController.this;
            super(s, objecttype);
            objectIsLiked = LikeActionController.this.isObjectLiked;
            objectId = s;
            objectType = objecttype;
            likeactioncontroller = new Bundle();
            putString("fields", "id,application");
            putString("object", objectId);
            setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", LikeActionController.this, HttpMethod.GET));
        }
    }

    private class GetPageIdRequestWrapper extends AbstractRequestWrapper
    {

        boolean objectIsPage;
        final LikeActionController this$0;
        String verifiedObjectId;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
                objectId, objectType, facebookrequesterror
            });
        }

        protected void processSuccess(GraphResponse graphresponse)
        {
            graphresponse = Utility.tryGetJSONObjectFromResponse(graphresponse.getJSONObject(), objectId);
            if (graphresponse != null)
            {
                verifiedObjectId = graphresponse.optString("id");
                boolean flag;
                if (Utility.isNullOrEmpty(verifiedObjectId))
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                objectIsPage = flag;
            }
        }

        GetPageIdRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
        {
            this$0 = LikeActionController.this;
            super(s, objecttype);
            likeactioncontroller = new Bundle();
            putString("fields", "id");
            putString("ids", s);
            setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "", LikeActionController.this, HttpMethod.GET));
        }
    }

    private class GetPageLikesRequestWrapper extends AbstractRequestWrapper
        implements LikeRequestWrapper
    {

        private boolean objectIsLiked;
        private String pageId;
        final LikeActionController this$0;

        public String getUnlikeToken()
        {
            return null;
        }

        public boolean isObjectLiked()
        {
            return objectIsLiked;
        }

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error fetching like status for page id '%s': %s", new Object[] {
                pageId, facebookrequesterror
            });
            logAppEventForError("get_page_like", facebookrequesterror);
        }

        protected void processSuccess(GraphResponse graphresponse)
        {
            graphresponse = Utility.tryGetJSONArrayFromResponse(graphresponse.getJSONObject(), "data");
            if (graphresponse != null && graphresponse.length() > 0)
            {
                objectIsLiked = true;
            }
        }

        GetPageLikesRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super(s, com.facebook.share.widget.LikeView.ObjectType.PAGE);
            objectIsLiked = LikeActionController.this.isObjectLiked;
            pageId = s;
            likeactioncontroller = new Bundle();
            putString("fields", "id");
            setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), (new StringBuilder("me/likes/")).append(s).toString(), LikeActionController.this, HttpMethod.GET));
        }
    }

    private static interface LikeRequestWrapper
        extends RequestWrapper
    {

        public abstract String getUnlikeToken();

        public abstract boolean isObjectLiked();
    }

    private static class MRUCacheWorkItem
        implements Runnable
    {

        private static ArrayList mruCachedItems = new ArrayList();
        private String cacheItem;
        private boolean shouldTrim;

        public void run()
        {
            if (cacheItem != null)
            {
                mruCachedItems.remove(cacheItem);
                mruCachedItems.add(0, cacheItem);
            }
            if (!shouldTrim || mruCachedItems.size() < 128) goto _L2; else goto _L1
_L1:
            if (64 < mruCachedItems.size()) goto _L3; else goto _L2
_L2:
            return;
_L3:
            String s = (String)mruCachedItems.remove(mruCachedItems.size() - 1);
            LikeActionController.cache.remove(s);
            if (true) goto _L1; else goto _L4
_L4:
        }


        MRUCacheWorkItem(String s, boolean flag)
        {
            cacheItem = s;
            shouldTrim = flag;
        }
    }

    private class PublishLikeRequestWrapper extends AbstractRequestWrapper
    {

        final LikeActionController this$0;
        String unlikeToken;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            if (facebookrequesterror.getErrorCode() == 3501)
            {
                error = null;
                return;
            } else
            {
                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error liking object '%s' with type '%s' : %s", new Object[] {
                    objectId, objectType, facebookrequesterror
                });
                logAppEventForError("publish_like", facebookrequesterror);
                return;
            }
        }

        protected void processSuccess(GraphResponse graphresponse)
        {
            unlikeToken = Utility.safeGetStringFromResponse(graphresponse.getJSONObject(), "id");
        }

        PublishLikeRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
        {
            this$0 = LikeActionController.this;
            super(s, objecttype);
            likeactioncontroller = new Bundle();
            putString("object", s);
            setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", LikeActionController.this, HttpMethod.POST));
        }
    }

    private class PublishUnlikeRequestWrapper extends AbstractRequestWrapper
    {

        final LikeActionController this$0;
        private String unlikeToken;

        protected void processError(FacebookRequestError facebookrequesterror)
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error unliking object with unlike token '%s' : %s", new Object[] {
                unlikeToken, facebookrequesterror
            });
            logAppEventForError("publish_unlike", facebookrequesterror);
        }

        protected void processSuccess(GraphResponse graphresponse)
        {
        }

        PublishUnlikeRequestWrapper(String s)
        {
            this$0 = LikeActionController.this;
            super(null, null);
            unlikeToken = s;
            setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), s, null, HttpMethod.DELETE));
        }
    }

    private static interface RequestCompletionCallback
    {

        public abstract void onComplete();
    }

    private static interface RequestWrapper
    {

        public abstract void addToBatch(GraphRequestBatch graphrequestbatch);

        public abstract FacebookRequestError getError();
    }

    private static class SerializeToDiskWorkItem
        implements Runnable
    {

        private String cacheKey;
        private String controllerJson;

        public void run()
        {
            LikeActionController.serializeToDiskSynchronously(cacheKey, controllerJson);
        }

        SerializeToDiskWorkItem(String s, String s1)
        {
            cacheKey = s;
            controllerJson = s1;
        }
    }


    public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR = "com.facebook.sdk.LikeActionController.DID_ERROR";
    public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_RESET = "com.facebook.sdk.LikeActionController.DID_RESET";
    public static final String ACTION_LIKE_ACTION_CONTROLLER_UPDATED = "com.facebook.sdk.LikeActionController.UPDATED";
    public static final String ACTION_OBJECT_ID_KEY = "com.facebook.sdk.LikeActionController.OBJECT_ID";
    private static final int ERROR_CODE_OBJECT_ALREADY_LIKED = 3501;
    public static final String ERROR_INVALID_OBJECT_ID = "Invalid Object Id";
    public static final String ERROR_PUBLISH_ERROR = "Unable to publish the like/unlike action";
    private static final String JSON_BOOL_IS_OBJECT_LIKED_KEY = "is_object_liked";
    private static final String JSON_BUNDLE_FACEBOOK_DIALOG_ANALYTICS_BUNDLE = "facebook_dialog_analytics_bundle";
    private static final String JSON_INT_OBJECT_TYPE_KEY = "object_type";
    private static final String JSON_INT_VERSION_KEY = "com.facebook.share.internal.LikeActionController.version";
    private static final String JSON_STRING_LIKE_COUNT_WITHOUT_LIKE_KEY = "like_count_string_without_like";
    private static final String JSON_STRING_LIKE_COUNT_WITH_LIKE_KEY = "like_count_string_with_like";
    private static final String JSON_STRING_OBJECT_ID_KEY = "object_id";
    private static final String JSON_STRING_SOCIAL_SENTENCE_WITHOUT_LIKE_KEY = "social_sentence_without_like";
    private static final String JSON_STRING_SOCIAL_SENTENCE_WITH_LIKE_KEY = "social_sentence_with_like";
    private static final String JSON_STRING_UNLIKE_TOKEN_KEY = "unlike_token";
    private static final String LIKE_ACTION_CONTROLLER_STORE = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY";
    private static final String LIKE_ACTION_CONTROLLER_STORE_OBJECT_SUFFIX_KEY = "OBJECT_SUFFIX";
    private static final String LIKE_ACTION_CONTROLLER_STORE_PENDING_OBJECT_ID_KEY = "PENDING_CONTROLLER_KEY";
    private static final int LIKE_ACTION_CONTROLLER_VERSION = 3;
    private static final String LIKE_DIALOG_RESPONSE_LIKE_COUNT_STRING_KEY = "like_count_string";
    private static final String LIKE_DIALOG_RESPONSE_OBJECT_IS_LIKED_KEY = "object_is_liked";
    private static final String LIKE_DIALOG_RESPONSE_SOCIAL_SENTENCE_KEY = "social_sentence";
    private static final String LIKE_DIALOG_RESPONSE_UNLIKE_TOKEN_KEY = "unlike_token";
    private static final int MAX_CACHE_SIZE = 128;
    private static final int MAX_OBJECT_SUFFIX = 1000;
    private static final String TAG = com/facebook/share/internal/LikeActionController.getSimpleName();
    private static AccessTokenTracker accessTokenTracker;
    private static final ConcurrentHashMap cache = new ConcurrentHashMap();
    private static FileLruCache controllerDiskCache;
    private static WorkQueue diskIOWorkQueue = new WorkQueue(1);
    private static Handler handler;
    private static boolean isInitialized;
    private static WorkQueue mruCacheWorkQueue = new WorkQueue(1);
    private static String objectIdForPendingController;
    private static volatile int objectSuffix;
    private AppEventsLogger appEventsLogger;
    private Bundle facebookDialogAnalyticsBundle;
    private boolean isObjectLiked;
    private boolean isObjectLikedOnServer;
    private boolean isPendingLikeOrUnlike;
    private String likeCountStringWithLike;
    private String likeCountStringWithoutLike;
    private String objectId;
    private boolean objectIsPage;
    private com.facebook.share.widget.LikeView.ObjectType objectType;
    private String socialSentenceWithLike;
    private String socialSentenceWithoutLike;
    private String unlikeToken;
    private String verifiedObjectId;

    private LikeActionController(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
    {
        objectId = s;
        objectType = objecttype;
    }

    private static void broadcastAction(LikeActionController likeactioncontroller, String s)
    {
        broadcastAction(likeactioncontroller, s, null);
    }

    private static void broadcastAction(LikeActionController likeactioncontroller, String s, Bundle bundle)
    {
        Intent intent = new Intent(s);
        s = bundle;
        if (likeactioncontroller != null)
        {
            s = bundle;
            if (bundle == null)
            {
                s = new Bundle();
            }
            s.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", likeactioncontroller.getObjectId());
        }
        if (s != null)
        {
            intent.putExtras(s);
        }
        LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()).sendBroadcast(intent);
    }

    private boolean canUseOGPublish()
    {
        AccessToken accesstoken = AccessToken.getCurrentAccessToken();
        return !objectIsPage && verifiedObjectId != null && accesstoken != null && accesstoken.getPermissions() != null && accesstoken.getPermissions().contains("publish_actions");
    }

    private void clearState()
    {
        facebookDialogAnalyticsBundle = null;
        storeObjectIdForPendingController(null);
    }

    private static void createControllerForObjectIdAndType(String s, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
    {
        final LikeActionController controllerToRefresh = getControllerFromInMemoryCache(s);
        if (controllerToRefresh != null)
        {
            verifyControllerAndInvokeCallback(controllerToRefresh, objecttype, creationcallback);
            return;
        }
        LikeActionController likeactioncontroller = deserializeFromDiskSynchronously(s);
        controllerToRefresh = likeactioncontroller;
        if (likeactioncontroller == null)
        {
            controllerToRefresh = new LikeActionController(s, objecttype);
            serializeToDiskAsync(controllerToRefresh);
        }
        putControllerInMemoryCache(s, controllerToRefresh);
        handler.post(new Runnable() {

            private final LikeActionController val$controllerToRefresh;

            public void run()
            {
                controllerToRefresh.refreshStatusAsync();
            }

            
            {
                controllerToRefresh = likeactioncontroller;
                super();
            }
        });
        invokeCallbackWithController(creationcallback, controllerToRefresh, null);
    }

    private static LikeActionController deserializeFromDiskSynchronously(String s)
    {
        java.io.InputStream inputstream;
        Object obj;
        java.io.InputStream inputstream1;
        Object obj1;
        String s1;
        obj1 = null;
        s1 = null;
        inputstream1 = null;
        inputstream = inputstream1;
        obj = s1;
        s = getCacheKeyForObjectId(s);
        inputstream = inputstream1;
        obj = s1;
        inputstream1 = controllerDiskCache.get(s);
        s = obj1;
        if (inputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        inputstream = inputstream1;
        obj = inputstream1;
        s1 = Utility.readStreamToString(inputstream1);
        s = obj1;
        inputstream = inputstream1;
        obj = inputstream1;
        if (Utility.isNullOrEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        inputstream = inputstream1;
        obj = inputstream1;
        s = deserializeFromJson(s1);
        obj = s;
        if (inputstream1 != null)
        {
            Utility.closeQuietly(inputstream1);
            obj = s;
        }
_L2:
        return ((LikeActionController) (obj));
        s;
        obj = inputstream;
        Log.e(TAG, "Unable to deserialize controller from disk", s);
        obj = null;
        if (inputstream == null) goto _L2; else goto _L1
_L1:
        Utility.closeQuietly(inputstream);
        return null;
        s;
        if (obj != null)
        {
            Utility.closeQuietly(((java.io.Closeable) (obj)));
        }
        throw s;
    }

    private static LikeActionController deserializeFromJson(String s)
    {
        s = new JSONObject(s);
        if (s.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3)
        {
            return null;
        }
        LikeActionController likeactioncontroller;
        JSONObject jsonobject;
        likeactioncontroller = new LikeActionController(s.getString("object_id"), com.facebook.share.widget.LikeView.ObjectType.fromInt(s.optInt("object_type", com.facebook.share.widget.LikeView.ObjectType.UNKNOWN.getValue())));
        likeactioncontroller.likeCountStringWithLike = s.optString("like_count_string_with_like", null);
        likeactioncontroller.likeCountStringWithoutLike = s.optString("like_count_string_without_like", null);
        likeactioncontroller.socialSentenceWithLike = s.optString("social_sentence_with_like", null);
        likeactioncontroller.socialSentenceWithoutLike = s.optString("social_sentence_without_like", null);
        likeactioncontroller.isObjectLiked = s.optBoolean("is_object_liked");
        likeactioncontroller.unlikeToken = s.optString("unlike_token", null);
        jsonobject = s.optJSONObject("facebook_dialog_analytics_bundle");
        s = likeactioncontroller;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        likeactioncontroller.facebookDialogAnalyticsBundle = BundleJSONConverter.convertToBundle(jsonobject);
        return likeactioncontroller;
        s;
        Log.e(TAG, "Unable to deserialize controller from JSON", s);
        s = null;
        return s;
    }

    private void fetchVerifiedObjectId(final RequestCompletionCallback completionHandler)
    {
        if (!Utility.isNullOrEmpty(verifiedObjectId))
        {
            if (completionHandler != null)
            {
                completionHandler.onComplete();
            }
            return;
        } else
        {
            final GetOGObjectIdRequestWrapper objectIdRequest = new GetOGObjectIdRequestWrapper(objectId, objectType);
            final GetPageIdRequestWrapper pageIdRequest = new GetPageIdRequestWrapper(objectId, objectType);
            GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
            objectIdRequest.addToBatch(graphrequestbatch);
            pageIdRequest.addToBatch(graphrequestbatch);
            graphrequestbatch.addCallback(new com.facebook.GraphRequestBatch.Callback() {

                final LikeActionController this$0;
                private final RequestCompletionCallback val$completionHandler;
                private final GetOGObjectIdRequestWrapper val$objectIdRequest;
                private final GetPageIdRequestWrapper val$pageIdRequest;

                public void onBatchCompleted(GraphRequestBatch graphrequestbatch1)
                {
                    verifiedObjectId = objectIdRequest.verifiedObjectId;
                    if (Utility.isNullOrEmpty(verifiedObjectId))
                    {
                        verifiedObjectId = pageIdRequest.verifiedObjectId;
                        objectIsPage = pageIdRequest.objectIsPage;
                    }
                    if (Utility.isNullOrEmpty(verifiedObjectId))
                    {
                        Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.TAG, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] {
                            objectId
                        });
                        LikeActionController likeactioncontroller = LikeActionController.this;
                        if (pageIdRequest.getError() != null)
                        {
                            graphrequestbatch1 = pageIdRequest.getError();
                        } else
                        {
                            graphrequestbatch1 = objectIdRequest.getError();
                        }
                        likeactioncontroller.logAppEventForError("get_verified_id", graphrequestbatch1);
                    }
                    if (completionHandler != null)
                    {
                        completionHandler.onComplete();
                    }
                }

            
            {
                this$0 = LikeActionController.this;
                objectIdRequest = getogobjectidrequestwrapper;
                pageIdRequest = getpageidrequestwrapper;
                completionHandler = requestcompletioncallback;
                super();
            }
            });
            graphrequestbatch.executeAsync();
            return;
        }
    }

    private AppEventsLogger getAppEventsLogger()
    {
        if (appEventsLogger == null)
        {
            appEventsLogger = AppEventsLogger.newLogger(FacebookSdk.getApplicationContext());
        }
        return appEventsLogger;
    }

    private static String getCacheKeyForObjectId(String s)
    {
        String s1 = null;
        Object obj = AccessToken.getCurrentAccessToken();
        if (obj != null)
        {
            s1 = ((AccessToken) (obj)).getToken();
        }
        obj = s1;
        if (s1 != null)
        {
            obj = Utility.md5hash(s1);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[] {
            s, Utility.coerceValueIfNullOrEmpty(((String) (obj)), ""), Integer.valueOf(objectSuffix)
        });
    }

    public static void getControllerForObjectId(String s, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
    {
        if (!isInitialized)
        {
            performFirstInitialize();
        }
        LikeActionController likeactioncontroller = getControllerFromInMemoryCache(s);
        if (likeactioncontroller != null)
        {
            verifyControllerAndInvokeCallback(likeactioncontroller, objecttype, creationcallback);
            return;
        } else
        {
            diskIOWorkQueue.addActiveWorkItem(new CreateLikeActionControllerWorkItem(s, objecttype, creationcallback));
            return;
        }
    }

    private static LikeActionController getControllerFromInMemoryCache(String s)
    {
        s = getCacheKeyForObjectId(s);
        LikeActionController likeactioncontroller = (LikeActionController)cache.get(s);
        if (likeactioncontroller != null)
        {
            mruCacheWorkQueue.addActiveWorkItem(new MRUCacheWorkItem(s, false));
        }
        return likeactioncontroller;
    }

    private ResultProcessor getResultProcessor(Bundle bundle)
    {
        return new ResultProcessor(bundle) {

            final LikeActionController this$0;
            private final Bundle val$analyticsParameters;

            public void onCancel(AppCall appcall)
            {
                onError(appcall, new FacebookOperationCanceledException());
            }

            public void onError(AppCall appcall, FacebookException facebookexception)
            {
                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Like Dialog failed with error : %s", new Object[] {
                    facebookexception
                });
                Bundle bundle1;
                if (analyticsParameters == null)
                {
                    bundle1 = new Bundle();
                } else
                {
                    bundle1 = analyticsParameters;
                }
                bundle1.putString("call_id", appcall.getCallId().toString());
                logAppEventForError("present_dialog", bundle1);
                LikeActionController.broadcastAction(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", NativeProtocol.createBundleForException(facebookexception));
            }

            public void onSuccess(AppCall appcall, Bundle bundle1)
            {
                if (bundle1 == null || !bundle1.containsKey("object_is_liked"))
                {
                    return;
                }
                boolean flag = bundle1.getBoolean("object_is_liked");
                String s = likeCountStringWithLike;
                String s1 = likeCountStringWithoutLike;
                if (bundle1.containsKey("like_count_string"))
                {
                    s = bundle1.getString("like_count_string");
                    s1 = s;
                }
                String s2 = socialSentenceWithLike;
                String s3 = socialSentenceWithoutLike;
                if (bundle1.containsKey("social_sentence"))
                {
                    s2 = bundle1.getString("social_sentence");
                    s3 = s2;
                }
                Bundle bundle2;
                if (bundle1.containsKey("object_is_liked"))
                {
                    bundle1 = bundle1.getString("unlike_token");
                } else
                {
                    bundle1 = unlikeToken;
                }
                if (analyticsParameters == null)
                {
                    bundle2 = new Bundle();
                } else
                {
                    bundle2 = analyticsParameters;
                }
                bundle2.putString("call_id", appcall.getCallId().toString());
                getAppEventsLogger().logSdkEvent("fb_like_control_dialog_did_succeed", null, bundle2);
                updateState(flag, s, s1, s2, s3, bundle1);
            }

            
            {
                this$0 = LikeActionController.this;
                analyticsParameters = bundle;
                super(final_facebookcallback);
            }
        };
    }

    public static boolean handleOnActivityResult(final int requestCode, final int resultCode, final Intent data)
    {
        if (Utility.isNullOrEmpty(objectIdForPendingController))
        {
            objectIdForPendingController = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
        }
        if (Utility.isNullOrEmpty(objectIdForPendingController))
        {
            return false;
        } else
        {
            getControllerForObjectId(objectIdForPendingController, com.facebook.share.widget.LikeView.ObjectType.UNKNOWN, new CreationCallback() {

                private final Intent val$data;
                private final int val$requestCode;
                private final int val$resultCode;

                public void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception)
                {
                    if (facebookexception == null)
                    {
                        likeactioncontroller.onActivityResult(requestCode, resultCode, data);
                        return;
                    } else
                    {
                        Utility.logd(LikeActionController.TAG, facebookexception);
                        return;
                    }
                }

            
            {
                requestCode = i;
                resultCode = j;
                data = intent;
                super();
            }
            });
            return true;
        }
    }

    private static void invokeCallbackWithController(final CreationCallback callback, final LikeActionController controller, final FacebookException error)
    {
        if (callback == null)
        {
            return;
        } else
        {
            handler.post(new Runnable() {

                private final CreationCallback val$callback;
                private final LikeActionController val$controller;
                private final FacebookException val$error;

                public void run()
                {
                    callback.onComplete(controller, error);
                }

            
            {
                callback = creationcallback;
                controller = likeactioncontroller;
                error = facebookexception;
                super();
            }
            });
            return;
        }
    }

    private void logAppEventForError(String s, Bundle bundle)
    {
        bundle = new Bundle(bundle);
        bundle.putString("object_id", objectId);
        bundle.putString("object_type", objectType.toString());
        bundle.putString("current_action", s);
        getAppEventsLogger().logSdkEvent("fb_like_control_error", null, bundle);
    }

    private void logAppEventForError(String s, FacebookRequestError facebookrequesterror)
    {
        Bundle bundle = new Bundle();
        if (facebookrequesterror != null)
        {
            facebookrequesterror = facebookrequesterror.getRequestResult();
            if (facebookrequesterror != null)
            {
                bundle.putString("error", facebookrequesterror.toString());
            }
        }
        logAppEventForError(s, bundle);
    }

    private void onActivityResult(int i, int j, Intent intent)
    {
        ShareInternalUtility.handleActivityResult(i, j, intent, getResultProcessor(facebookDialogAnalyticsBundle));
        clearState();
    }

    private static void performFirstInitialize()
    {
        com/facebook/share/internal/LikeActionController;
        JVM INSTR monitorenter ;
        boolean flag = isInitialized;
        if (!flag) goto _L2; else goto _L1
_L1:
        com/facebook/share/internal/LikeActionController;
        JVM INSTR monitorexit ;
        return;
_L2:
        handler = new Handler(Looper.getMainLooper());
        objectSuffix = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
        controllerDiskCache = new FileLruCache(TAG, new com.facebook.internal.FileLruCache.Limits());
        registerAccessTokenTracker();
        CallbackManagerImpl.registerStaticCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

            public boolean onActivityResult(int i, Intent intent)
            {
                return LikeActionController.handleOnActivityResult(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode(), i, intent);
            }

        });
        isInitialized = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void presentLikeDialog(Activity activity, Fragment fragment, Bundle bundle)
    {
        Object obj = null;
        if (LikeDialog.canShowNativeDialog())
        {
            obj = "fb_like_control_did_present_dialog";
        } else
        if (LikeDialog.canShowWebFallback())
        {
            obj = "fb_like_control_did_present_fallback_dialog";
        } else
        {
            logAppEventForError("present_dialog", bundle);
            Utility.logd(TAG, "Cannot show the Like Dialog on this device.");
            broadcastAction(null, "com.facebook.sdk.LikeActionController.UPDATED");
        }
        if (obj != null)
        {
            if (objectType != null)
            {
                obj = objectType.toString();
            } else
            {
                obj = com.facebook.share.widget.LikeView.ObjectType.UNKNOWN.toString();
            }
            obj = (new LikeContent.Builder()).setObjectId(objectId).setObjectType(((String) (obj))).build();
            if (fragment != null)
            {
                (new LikeDialog(fragment)).show(obj);
            } else
            {
                (new LikeDialog(activity)).show(obj);
            }
            saveState(bundle);
            getAppEventsLogger().logSdkEvent("fb_like_control_did_present_dialog", null, bundle);
        }
    }

    private void publishAgainIfNeeded(Bundle bundle)
    {
        if (isObjectLiked != isObjectLikedOnServer && !publishLikeOrUnlikeAsync(isObjectLiked, bundle))
        {
            boolean flag;
            if (isObjectLiked)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            publishDidError(flag);
        }
    }

    private void publishDidError(boolean flag)
    {
        updateLikeState(flag);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        broadcastAction(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    private void publishLikeAsync(final Bundle analyticsParameters)
    {
        isPendingLikeOrUnlike = true;
        fetchVerifiedObjectId(new RequestCompletionCallback() {

            final LikeActionController this$0;
            private final Bundle val$analyticsParameters;

            public void onComplete()
            {
                if (Utility.isNullOrEmpty(verifiedObjectId))
                {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                    LikeActionController.broadcastAction(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                    return;
                } else
                {
                    GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
                    final PublishLikeRequestWrapper likeRequest = new PublishLikeRequestWrapper(verifiedObjectId, objectType);
                    likeRequest.addToBatch(graphrequestbatch);
                    graphrequestbatch.addCallback(analyticsParameters. new com.facebook.GraphRequestBatch.Callback() {

                        final _cls7 this$1;
                        private final Bundle val$analyticsParameters;
                        private final PublishLikeRequestWrapper val$likeRequest;

                        public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
                        {
                            isPendingLikeOrUnlike = false;
                            if (likeRequest.getError() != null)
                            {
                                publishDidError(false);
                                return;
                            } else
                            {
                                unlikeToken = Utility.coerceValueIfNullOrEmpty(likeRequest.unlikeToken, null);
                                isObjectLikedOnServer = true;
                                getAppEventsLogger().logSdkEvent("fb_like_control_did_like", null, analyticsParameters);
                                publishAgainIfNeeded(analyticsParameters);
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls7;
                likeRequest = publishlikerequestwrapper;
                analyticsParameters = Bundle.this;
                super();
            }
                    });
                    graphrequestbatch.executeAsync();
                    return;
                }
            }


            
            {
                this$0 = LikeActionController.this;
                analyticsParameters = bundle;
                super();
            }
        });
    }

    private boolean publishLikeOrUnlikeAsync(boolean flag, Bundle bundle)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (canUseOGPublish())
        {
            if (flag)
            {
                flag1 = true;
                publishLikeAsync(bundle);
            } else
            {
                flag1 = flag2;
                if (!Utility.isNullOrEmpty(unlikeToken))
                {
                    publishUnlikeAsync(bundle);
                    return true;
                }
            }
        }
        return flag1;
    }

    private void publishUnlikeAsync(final Bundle analyticsParameters)
    {
        isPendingLikeOrUnlike = true;
        GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
        final PublishUnlikeRequestWrapper unlikeRequest = new PublishUnlikeRequestWrapper(unlikeToken);
        unlikeRequest.addToBatch(graphrequestbatch);
        graphrequestbatch.addCallback(new com.facebook.GraphRequestBatch.Callback() {

            final LikeActionController this$0;
            private final Bundle val$analyticsParameters;
            private final PublishUnlikeRequestWrapper val$unlikeRequest;

            public void onBatchCompleted(GraphRequestBatch graphrequestbatch1)
            {
                isPendingLikeOrUnlike = false;
                if (unlikeRequest.getError() != null)
                {
                    publishDidError(true);
                    return;
                } else
                {
                    unlikeToken = null;
                    isObjectLikedOnServer = false;
                    getAppEventsLogger().logSdkEvent("fb_like_control_did_unlike", null, analyticsParameters);
                    publishAgainIfNeeded(analyticsParameters);
                    return;
                }
            }

            
            {
                this$0 = LikeActionController.this;
                unlikeRequest = publishunlikerequestwrapper;
                analyticsParameters = bundle;
                super();
            }
        });
        graphrequestbatch.executeAsync();
    }

    private static void putControllerInMemoryCache(String s, LikeActionController likeactioncontroller)
    {
        s = getCacheKeyForObjectId(s);
        mruCacheWorkQueue.addActiveWorkItem(new MRUCacheWorkItem(s, true));
        cache.put(s, likeactioncontroller);
    }

    private void refreshStatusAsync()
    {
        if (AccessToken.getCurrentAccessToken() == null)
        {
            refreshStatusViaService();
            return;
        } else
        {
            fetchVerifiedObjectId(new RequestCompletionCallback() {

                private static int $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType[];
                final LikeActionController this$0;

                static int[] $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType()
                {
                    int ai[] = $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType;
                    if (ai != null)
                    {
                        return ai;
                    }
                    ai = new int[com.facebook.share.widget.LikeView.ObjectType.values().length];
                    try
                    {
                        ai[com.facebook.share.widget.LikeView.ObjectType.OPEN_GRAPH.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        ai[com.facebook.share.widget.LikeView.ObjectType.PAGE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        ai[com.facebook.share.widget.LikeView.ObjectType.UNKNOWN.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror) { }
                    $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType = ai;
                    return ai;
                }

                public void onComplete()
                {
                    $SWITCH_TABLE$com$facebook$share$widget$LikeView$ObjectType()[objectType.ordinal()];
                    JVM INSTR tableswitch 3 3: default 32
                //                               3 124;
                       goto _L1 _L2
_L1:
                    final Object likeRequestWrapper = new GetOGObjectLikesRequestWrapper(verifiedObjectId, objectType);
_L4:
                    GetEngagementRequestWrapper getengagementrequestwrapper = new GetEngagementRequestWrapper(verifiedObjectId, objectType);
                    GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
                    ((LikeRequestWrapper) (likeRequestWrapper)).addToBatch(graphrequestbatch);
                    getengagementrequestwrapper.addToBatch(graphrequestbatch);
                    graphrequestbatch.addCallback(getengagementrequestwrapper. new com.facebook.GraphRequestBatch.Callback() {

                        final _cls9 this$1;
                        private final GetEngagementRequestWrapper val$engagementRequest;
                        private final LikeRequestWrapper val$likeRequestWrapper;

                        public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
                        {
                            if (likeRequestWrapper.getError() != null || engagementRequest.getError() != null)
                            {
                                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Unable to refresh like state for id: '%s'", new Object[] {
                                    objectId
                                });
                                return;
                            } else
                            {
                                updateState(likeRequestWrapper.isObjectLiked(), engagementRequest.likeCountStringWithLike, engagementRequest.likeCountStringWithoutLike, engagementRequest.socialSentenceStringWithLike, engagementRequest.socialSentenceStringWithoutLike, likeRequestWrapper.getUnlikeToken());
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls9;
                likeRequestWrapper = likerequestwrapper;
                engagementRequest = GetEngagementRequestWrapper.this;
                super();
            }
                    });
                    graphrequestbatch.executeAsync();
                    return;
_L2:
                    likeRequestWrapper = new GetPageLikesRequestWrapper(verifiedObjectId);
                    if (true) goto _L4; else goto _L3
_L3:
                }


            
            {
                this$0 = LikeActionController.this;
                super();
            }
            });
            return;
        }
    }

    private void refreshStatusViaService()
    {
        LikeStatusClient likestatusclient = new LikeStatusClient(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationId(), objectId);
        if (!likestatusclient.start())
        {
            return;
        } else
        {
            likestatusclient.setCompletedListener(new com.facebook.internal.PlatformServiceClient.CompletedListener() {

                final LikeActionController this$0;

                public void completed(Bundle bundle)
                {
                    if (bundle == null || !bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED"))
                    {
                        return;
                    }
                    boolean flag = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                    String s;
                    String s1;
                    String s2;
                    String s3;
                    if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"))
                    {
                        s = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                    } else
                    {
                        s = likeCountStringWithLike;
                    }
                    if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"))
                    {
                        s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
                    } else
                    {
                        s1 = likeCountStringWithoutLike;
                    }
                    if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"))
                    {
                        s2 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
                    } else
                    {
                        s2 = socialSentenceWithLike;
                    }
                    if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"))
                    {
                        s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
                    } else
                    {
                        s3 = socialSentenceWithoutLike;
                    }
                    if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN"))
                    {
                        bundle = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
                    } else
                    {
                        bundle = unlikeToken;
                    }
                    updateState(flag, s, s1, s2, s3, bundle);
                }

            
            {
                this$0 = LikeActionController.this;
                super();
            }
            });
            return;
        }
    }

    private static void registerAccessTokenTracker()
    {
        accessTokenTracker = new AccessTokenTracker() {

            protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
            {
                accesstoken = FacebookSdk.getApplicationContext();
                if (accesstoken1 == null)
                {
                    LikeActionController.objectSuffix = (LikeActionController.objectSuffix + 1) % 1000;
                    accesstoken.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.objectSuffix).apply();
                    LikeActionController.cache.clear();
                    LikeActionController.controllerDiskCache.clearCache();
                }
                LikeActionController.broadcastAction(null, "com.facebook.sdk.LikeActionController.DID_RESET");
            }

        };
    }

    private void saveState(Bundle bundle)
    {
        storeObjectIdForPendingController(objectId);
        facebookDialogAnalyticsBundle = bundle;
        serializeToDiskAsync(this);
    }

    private static void serializeToDiskAsync(LikeActionController likeactioncontroller)
    {
        String s = serializeToJson(likeactioncontroller);
        likeactioncontroller = getCacheKeyForObjectId(likeactioncontroller.objectId);
        if (!Utility.isNullOrEmpty(s) && !Utility.isNullOrEmpty(likeactioncontroller))
        {
            diskIOWorkQueue.addActiveWorkItem(new SerializeToDiskWorkItem(likeactioncontroller, s));
        }
    }

    private static void serializeToDiskSynchronously(String s, String s1)
    {
        String s2;
        String s3;
        s3 = null;
        s2 = null;
        s = controllerDiskCache.openPutStream(s);
        s2 = s;
        s3 = s;
        s.write(s1.getBytes());
        if (s != null)
        {
            Utility.closeQuietly(s);
        }
_L2:
        return;
        s;
        s3 = s2;
        Log.e(TAG, "Unable to serialize controller to disk", s);
        if (s2 == null) goto _L2; else goto _L1
_L1:
        Utility.closeQuietly(s2);
        return;
        s;
        if (s3 != null)
        {
            Utility.closeQuietly(s3);
        }
        throw s;
    }

    private static String serializeToJson(LikeActionController likeactioncontroller)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("com.facebook.share.internal.LikeActionController.version", 3);
        jsonobject.put("object_id", likeactioncontroller.objectId);
        jsonobject.put("object_type", likeactioncontroller.objectType.getValue());
        jsonobject.put("like_count_string_with_like", likeactioncontroller.likeCountStringWithLike);
        jsonobject.put("like_count_string_without_like", likeactioncontroller.likeCountStringWithoutLike);
        jsonobject.put("social_sentence_with_like", likeactioncontroller.socialSentenceWithLike);
        jsonobject.put("social_sentence_without_like", likeactioncontroller.socialSentenceWithoutLike);
        jsonobject.put("is_object_liked", likeactioncontroller.isObjectLiked);
        jsonobject.put("unlike_token", likeactioncontroller.unlikeToken);
        if (likeactioncontroller.facebookDialogAnalyticsBundle == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        likeactioncontroller = BundleJSONConverter.convertToJSON(likeactioncontroller.facebookDialogAnalyticsBundle);
        if (likeactioncontroller != null)
        {
            try
            {
                jsonobject.put("facebook_dialog_analytics_bundle", likeactioncontroller);
            }
            // Misplaced declaration of an exception variable
            catch (LikeActionController likeactioncontroller)
            {
                Log.e(TAG, "Unable to serialize controller to JSON", likeactioncontroller);
                return null;
            }
        }
        return jsonobject.toString();
    }

    private static void storeObjectIdForPendingController(String s)
    {
        objectIdForPendingController = s;
        FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", objectIdForPendingController).apply();
    }

    private void updateLikeState(boolean flag)
    {
        updateState(flag, likeCountStringWithLike, likeCountStringWithoutLike, socialSentenceWithLike, socialSentenceWithoutLike, unlikeToken);
    }

    private void updateState(boolean flag, String s, String s1, String s2, String s3, String s4)
    {
        s = Utility.coerceValueIfNullOrEmpty(s, null);
        s1 = Utility.coerceValueIfNullOrEmpty(s1, null);
        s2 = Utility.coerceValueIfNullOrEmpty(s2, null);
        s3 = Utility.coerceValueIfNullOrEmpty(s3, null);
        s4 = Utility.coerceValueIfNullOrEmpty(s4, null);
        boolean flag1;
        if (flag == isObjectLiked && Utility.areObjectsEqual(s, likeCountStringWithLike) && Utility.areObjectsEqual(s1, likeCountStringWithoutLike) && Utility.areObjectsEqual(s2, socialSentenceWithLike) && Utility.areObjectsEqual(s3, socialSentenceWithoutLike) && Utility.areObjectsEqual(s4, unlikeToken))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            return;
        } else
        {
            isObjectLiked = flag;
            likeCountStringWithLike = s;
            likeCountStringWithoutLike = s1;
            socialSentenceWithLike = s2;
            socialSentenceWithoutLike = s3;
            unlikeToken = s4;
            serializeToDiskAsync(this);
            broadcastAction(this, "com.facebook.sdk.LikeActionController.UPDATED");
            return;
        }
    }

    private static void verifyControllerAndInvokeCallback(LikeActionController likeactioncontroller, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
    {
        com.facebook.share.widget.LikeView.ObjectType objecttype1 = ShareInternalUtility.getMostSpecificObjectType(objecttype, likeactioncontroller.objectType);
        Object obj = null;
        if (objecttype1 == null)
        {
            objecttype = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", new Object[] {
                likeactioncontroller.objectId, likeactioncontroller.objectType.toString(), objecttype.toString()
            });
            likeactioncontroller = null;
        } else
        {
            likeactioncontroller.objectType = objecttype1;
            objecttype = obj;
        }
        invokeCallbackWithController(creationcallback, likeactioncontroller, objecttype);
    }

    public String getLikeCountString()
    {
        if (isObjectLiked)
        {
            return likeCountStringWithLike;
        } else
        {
            return likeCountStringWithoutLike;
        }
    }

    public String getObjectId()
    {
        return objectId;
    }

    public String getSocialSentence()
    {
        if (isObjectLiked)
        {
            return socialSentenceWithLike;
        } else
        {
            return socialSentenceWithoutLike;
        }
    }

    public boolean isObjectLiked()
    {
        return isObjectLiked;
    }

    public boolean shouldEnableView()
    {
        if (!LikeDialog.canShowNativeDialog() && !LikeDialog.canShowWebFallback())
        {
            if (objectIsPage || objectType == com.facebook.share.widget.LikeView.ObjectType.PAGE)
            {
                return false;
            }
            AccessToken accesstoken = AccessToken.getCurrentAccessToken();
            if (accesstoken == null || accesstoken.getPermissions() == null || !accesstoken.getPermissions().contains("publish_actions"))
            {
                return false;
            }
        }
        return true;
    }

    public void toggleLike(Activity activity, Fragment fragment, Bundle bundle)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        if (isObjectLiked)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!canUseOGPublish())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        updateLikeState(flag);
        if (!isPendingLikeOrUnlike) goto _L2; else goto _L1
_L1:
        getAppEventsLogger().logSdkEvent("fb_like_control_did_undo_quickly", null, bundle);
_L4:
        return;
_L2:
        if (publishLikeOrUnlikeAsync(flag, bundle)) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            flag = flag1;
        } else
        {
            flag = true;
        }
        updateLikeState(flag);
        presentLikeDialog(activity, fragment, bundle);
        return;
        presentLikeDialog(activity, fragment, bundle);
        return;
    }
































}
