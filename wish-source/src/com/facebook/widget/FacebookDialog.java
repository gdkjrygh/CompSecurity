// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphObjectException;
import com.facebook.NativeAppCallAttachmentStore;
import com.facebook.NativeAppCallContentProvider;
import com.facebook.Settings;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import com.facebook.model.OpenGraphAction;
import com.facebook.model.OpenGraphObject;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookDialog
{
    public static abstract class Builder
    {

        protected final Activity activity;
        protected final PendingCall appCall = new PendingCall(64207);
        protected final String applicationId;
        protected String applicationName;
        protected Fragment fragment;
        protected HashMap imageAttachmentFiles;
        protected HashMap imageAttachments;

        protected Builder addImageAttachment(String s, Bitmap bitmap)
        {
            imageAttachments.put(s, bitmap);
            return this;
        }

        protected Builder addImageAttachment(String s, File file)
        {
            imageAttachmentFiles.put(s, file);
            return this;
        }

        protected List addImageAttachmentFiles(Collection collection)
        {
            ArrayList arraylist = new ArrayList();
            String s;
            for (collection = collection.iterator(); collection.hasNext(); arraylist.add(NativeAppCallContentProvider.getAttachmentUrl(applicationId, appCall.getCallId(), s)))
            {
                File file = (File)collection.next();
                s = UUID.randomUUID().toString();
                addImageAttachment(s, file);
            }

            return arraylist;
        }

        protected List addImageAttachments(Collection collection)
        {
            ArrayList arraylist = new ArrayList();
            String s;
            for (collection = collection.iterator(); collection.hasNext(); arraylist.add(NativeAppCallContentProvider.getAttachmentUrl(applicationId, appCall.getCallId(), s)))
            {
                Bitmap bitmap = (Bitmap)collection.next();
                s = UUID.randomUUID().toString();
                addImageAttachment(s, bitmap);
            }

            return arraylist;
        }

        public FacebookDialog build()
        {
            validate();
            String s = FacebookDialog.getActionForFeatures(getDialogFeatures());
            int i = FacebookDialog.getProtocolVersionForNativeDialog(activity, s, FacebookDialog.getVersionSpecForFeatures(applicationId, s, getDialogFeatures()));
            Bundle bundle;
            Intent intent;
            if (NativeProtocol.isVersionCompatibleWithBucketedIntent(i))
            {
                bundle = getMethodArguments();
            } else
            {
                bundle = setBundleExtras(new Bundle());
            }
            intent = NativeProtocol.createPlatformActivityIntent(activity, appCall.getCallId().toString(), s, i, applicationName, bundle);
            if (intent == null)
            {
                FacebookDialog.logDialogActivity(activity, fragment, FacebookDialog.getEventName(s, bundle.containsKey("com.facebook.platform.extra.PHOTOS")), "Failed");
                throw new FacebookException("Unable to create Intent; this likely means the Facebook app is not installed.");
            } else
            {
                appCall.setRequestIntent(intent);
                return new FacebookDialog(activity, fragment, appCall, getOnPresentCallback());
            }
        }

        public boolean canPresent()
        {
            return FacebookDialog.handleCanPresent(activity, getDialogFeatures());
        }

        protected abstract EnumSet getDialogFeatures();

        List getImageAttachmentNames()
        {
            return new ArrayList(imageAttachments.keySet());
        }

        protected abstract Bundle getMethodArguments();

        OnPresentCallback getOnPresentCallback()
        {
            return new OnPresentCallback() {

                final Builder this$0;

                public void onPresent(Context context)
                    throws Exception
                {
                    if (imageAttachments != null && imageAttachments.size() > 0)
                    {
                        FacebookDialog.getAttachmentStore().addAttachmentsForCall(context, appCall.getCallId(), imageAttachments);
                    }
                    if (imageAttachmentFiles != null && imageAttachmentFiles.size() > 0)
                    {
                        FacebookDialog.getAttachmentStore().addAttachmentFilesForCall(context, appCall.getCallId(), imageAttachmentFiles);
                    }
                }

            
            {
                this$0 = Builder.this;
                super();
            }
            };
        }

        protected String getWebFallbackUrlInternal()
        {
            Object obj1 = getDialogFeatures();
            String s = null;
            Object obj = null;
            obj1 = ((Iterable) (obj1)).iterator();
            if (((Iterator) (obj1)).hasNext())
            {
                obj = (DialogFeature)((Iterator) (obj1)).next();
                s = ((DialogFeature) (obj)).name();
                obj = ((DialogFeature) (obj)).getAction();
            }
            obj = Utility.getDialogFeatureConfig(applicationId, ((String) (obj)), s);
            if (obj != null)
            {
                Uri uri1 = ((com.facebook.internal.Utility.DialogFeatureConfig) (obj)).getFallbackUrl();
                if (uri1 != null)
                {
                    Bundle bundle = getMethodArguments();
                    int i = NativeProtocol.getLatestKnownVersion();
                    Bundle bundle1 = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(activity, appCall.getCallId().toString(), i, applicationName, bundle);
                    if (bundle1 != null)
                    {
                        Uri uri = uri1;
                        if (uri1.isRelative())
                        {
                            uri = Utility.buildUri(ServerProtocol.getDialogAuthority(), uri1.toString(), bundle1);
                        }
                        return uri.toString();
                    }
                }
            }
            return null;
        }

        protected void putExtra(Bundle bundle, String s, String s1)
        {
            if (s1 != null)
            {
                bundle.putString(s, s1);
            }
        }

        public Builder setApplicationName(String s)
        {
            applicationName = s;
            return this;
        }

        protected Bundle setBundleExtras(Bundle bundle)
        {
            return bundle;
        }

        public Builder setFragment(Fragment fragment1)
        {
            fragment = fragment1;
            return this;
        }

        public Builder setRequestCode(int i)
        {
            appCall.setRequestCode(i);
            return this;
        }

        void validate()
        {
        }

        public Builder(Activity activity1)
        {
            imageAttachments = new HashMap();
            imageAttachmentFiles = new HashMap();
            Validate.notNull(activity1, "activity");
            activity = activity1;
            applicationId = Utility.getMetadataApplicationId(activity1);
        }
    }

    public static interface Callback
    {

        public abstract void onComplete(PendingCall pendingcall, Bundle bundle);

        public abstract void onError(PendingCall pendingcall, Exception exception, Bundle bundle);
    }

    public static interface DialogFeature
    {

        public abstract String getAction();

        public abstract int getMinVersion();

        public abstract String name();
    }

    public static class MessageDialogBuilder extends ShareDialogBuilderBase
    {

        protected EnumSet getDialogFeatures()
        {
            return EnumSet.of(MessageDialogFeature.MESSAGE_DIALOG);
        }

        public MessageDialogBuilder setFriends(List list)
        {
            return this;
        }

        public volatile ShareDialogBuilderBase setFriends(List list)
        {
            return setFriends(list);
        }

        public MessageDialogBuilder setPlace(String s)
        {
            return this;
        }

        public volatile ShareDialogBuilderBase setPlace(String s)
        {
            return setPlace(s);
        }

        public MessageDialogBuilder(Activity activity1)
        {
            super(activity1);
        }
    }

    public static final class MessageDialogFeature extends Enum
        implements DialogFeature
    {

        private static final MessageDialogFeature $VALUES[];
        public static final MessageDialogFeature MESSAGE_DIALOG;
        public static final MessageDialogFeature PHOTOS;
        private int minVersion;

        public static MessageDialogFeature valueOf(String s)
        {
            return (MessageDialogFeature)Enum.valueOf(com/facebook/widget/FacebookDialog$MessageDialogFeature, s);
        }

        public static MessageDialogFeature[] values()
        {
            return (MessageDialogFeature[])$VALUES.clone();
        }

        public String getAction()
        {
            return "com.facebook.platform.action.request.MESSAGE_DIALOG";
        }

        public int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            MESSAGE_DIALOG = new MessageDialogFeature("MESSAGE_DIALOG", 0, 0x13350ac);
            PHOTOS = new MessageDialogFeature("PHOTOS", 1, 0x1335124);
            $VALUES = (new MessageDialogFeature[] {
                MESSAGE_DIALOG, PHOTOS
            });
        }

        private MessageDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }

    static interface OnPresentCallback
    {

        public abstract void onPresent(Context context)
            throws Exception;
    }

    public static class OpenGraphActionDialogBuilder extends OpenGraphDialogBuilderBase
    {

        protected EnumSet getDialogFeatures()
        {
            return EnumSet.of(OpenGraphActionDialogFeature.OG_ACTION_DIALOG);
        }

        public OpenGraphActionDialogBuilder(Activity activity1, OpenGraphAction opengraphaction, String s)
        {
            super(activity1, opengraphaction, s);
        }

        public OpenGraphActionDialogBuilder(Activity activity1, OpenGraphAction opengraphaction, String s, String s1)
        {
            super(activity1, opengraphaction, s, s1);
        }
    }

    public static final class OpenGraphActionDialogFeature extends Enum
        implements DialogFeature
    {

        private static final OpenGraphActionDialogFeature $VALUES[];
        public static final OpenGraphActionDialogFeature OG_ACTION_DIALOG;
        private int minVersion;

        public static OpenGraphActionDialogFeature valueOf(String s)
        {
            return (OpenGraphActionDialogFeature)Enum.valueOf(com/facebook/widget/FacebookDialog$OpenGraphActionDialogFeature, s);
        }

        public static OpenGraphActionDialogFeature[] values()
        {
            return (OpenGraphActionDialogFeature[])$VALUES.clone();
        }

        public String getAction()
        {
            return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
        }

        public int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            OG_ACTION_DIALOG = new OpenGraphActionDialogFeature("OG_ACTION_DIALOG", 0, 0x1332b3a);
            $VALUES = (new OpenGraphActionDialogFeature[] {
                OG_ACTION_DIALOG
            });
        }

        private OpenGraphActionDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }

    private static abstract class OpenGraphDialogBuilderBase extends Builder
    {

        private OpenGraphAction action;
        private String actionType;
        private boolean dataErrorsFatal;
        private String previewPropertyName;

        private JSONObject flattenChildrenOfGraphObject(JSONObject jsonobject)
        {
            try
            {
                jsonobject = new JSONObject(jsonobject.toString());
                break MISSING_BLOCK_LABEL_12;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject) { }
              goto _L1
            jsonobject;
_L1:
            throw new FacebookException(jsonobject);
            Iterator iterator = jsonobject.keys();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (!s.equalsIgnoreCase("image"))
                {
                    jsonobject.put(s, flattenObject(jsonobject.get(s)));
                }
            } while (true);
            return jsonobject;
        }

        private Object flattenObject(Object obj)
            throws JSONException
        {
            if (obj != null) goto _L2; else goto _L1
_L1:
            Object obj1 = null;
_L4:
            return obj1;
_L2:
            if (!(obj instanceof JSONObject))
            {
                break; /* Loop/switch isn't completed */
            }
            JSONObject jsonobject = (JSONObject)obj;
            obj1 = obj;
            if (!jsonobject.optBoolean("fbsdk:create_object"))
            {
                if (jsonobject.has("id"))
                {
                    return jsonobject.getString("id");
                }
                obj1 = obj;
                if (jsonobject.has("url"))
                {
                    return jsonobject.getString("url");
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            obj1 = obj;
            if (obj instanceof JSONArray)
            {
                obj = (JSONArray)obj;
                JSONArray jsonarray = new JSONArray();
                int j = ((JSONArray) (obj)).length();
                for (int i = 0; i < j; i++)
                {
                    jsonarray.put(flattenObject(((JSONArray) (obj)).get(i)));
                }

                return jsonarray;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        private void updateActionAttachmentUrls(List list, boolean flag)
        {
            Object obj;
            List list1 = action.getImage();
            obj = list1;
            if (list1 == null)
            {
                obj = new ArrayList(list.size());
            }
            list = list.iterator();
_L3:
            if (!list.hasNext()) goto _L2; else goto _L1
_L1:
            String s = (String)list.next();
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("url", s);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw new FacebookException("Unable to attach images", list);
            }
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonobject.put("user_generated", true);
            ((List) (obj)).add(jsonobject);
              goto _L3
_L2:
            action.setImage(((List) (obj)));
            return;
        }

        protected Bundle getMethodArguments()
        {
            Bundle bundle = new Bundle();
            putExtra(bundle, "PREVIEW_PROPERTY_NAME", previewPropertyName);
            putExtra(bundle, "ACTION_TYPE", actionType);
            bundle.putBoolean("DATA_FAILURES_FATAL", dataErrorsFatal);
            putExtra(bundle, "ACTION", flattenChildrenOfGraphObject(action.getInnerJSONObject()).toString());
            return bundle;
        }

        protected Bundle setBundleExtras(Bundle bundle)
        {
            putExtra(bundle, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", previewPropertyName);
            putExtra(bundle, "com.facebook.platform.extra.ACTION_TYPE", actionType);
            bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", dataErrorsFatal);
            putExtra(bundle, "com.facebook.platform.extra.ACTION", flattenChildrenOfGraphObject(action.getInnerJSONObject()).toString());
            return bundle;
        }

        public OpenGraphDialogBuilderBase setDataErrorsFatal(boolean flag)
        {
            dataErrorsFatal = flag;
            return this;
        }

        public OpenGraphDialogBuilderBase setImageAttachmentFilesForAction(List list)
        {
            return setImageAttachmentFilesForAction(list, false);
        }

        public OpenGraphDialogBuilderBase setImageAttachmentFilesForAction(List list, boolean flag)
        {
            Validate.containsNoNulls(list, "bitmapFiles");
            if (action == null)
            {
                throw new FacebookException("Can not set attachments prior to setting action.");
            } else
            {
                updateActionAttachmentUrls(addImageAttachmentFiles(list), flag);
                return this;
            }
        }

        public OpenGraphDialogBuilderBase setImageAttachmentFilesForObject(String s, List list)
        {
            return setImageAttachmentFilesForObject(s, list, false);
        }

        public OpenGraphDialogBuilderBase setImageAttachmentFilesForObject(String s, List list, boolean flag)
        {
            Validate.notNull(s, "objectProperty");
            Validate.containsNoNulls(list, "bitmapFiles");
            if (action == null)
            {
                throw new FacebookException("Can not set attachments prior to setting action.");
            } else
            {
                updateObjectAttachmentUrls(s, addImageAttachmentFiles(list), flag);
                return this;
            }
        }

        public OpenGraphDialogBuilderBase setImageAttachmentsForAction(List list)
        {
            return setImageAttachmentsForAction(list, false);
        }

        public OpenGraphDialogBuilderBase setImageAttachmentsForAction(List list, boolean flag)
        {
            Validate.containsNoNulls(list, "bitmaps");
            if (action == null)
            {
                throw new FacebookException("Can not set attachments prior to setting action.");
            } else
            {
                updateActionAttachmentUrls(addImageAttachments(list), flag);
                return this;
            }
        }

        public OpenGraphDialogBuilderBase setImageAttachmentsForObject(String s, List list)
        {
            return setImageAttachmentsForObject(s, list, false);
        }

        public OpenGraphDialogBuilderBase setImageAttachmentsForObject(String s, List list, boolean flag)
        {
            Validate.notNull(s, "objectProperty");
            Validate.containsNoNulls(list, "bitmaps");
            if (action == null)
            {
                throw new FacebookException("Can not set attachments prior to setting action.");
            } else
            {
                updateObjectAttachmentUrls(s, addImageAttachments(list), flag);
                return this;
            }
        }

        void updateObjectAttachmentUrls(String s, List list, boolean flag)
        {
            OpenGraphObject opengraphobject;
            try
            {
                opengraphobject = (OpenGraphObject)action.getPropertyAs(s, com/facebook/model/OpenGraphObject);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Property '").append(s).append("' is not a graph object").toString());
            }
            if (opengraphobject != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            throw new IllegalArgumentException((new StringBuilder()).append("Action does not contain a property '").append(s).append("'").toString());
            if (!opengraphobject.getCreateObject())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The Open Graph object in '").append(s).append("' is not marked for creation").toString());
            }
            GraphObjectList graphobjectlist = opengraphobject.getImage();
            s = graphobjectlist;
            if (graphobjectlist == null)
            {
                s = com.facebook.model.GraphObject.Factory.createList(com/facebook/model/GraphObject);
            }
            GraphObject graphobject;
            for (list = list.iterator(); list.hasNext(); s.add(graphobject))
            {
                String s1 = (String)list.next();
                graphobject = com.facebook.model.GraphObject.Factory.create();
                graphobject.setProperty("url", s1);
                if (flag)
                {
                    graphobject.setProperty("user_generated", Boolean.valueOf(true));
                }
            }

            opengraphobject.setImage(s);
            return;
        }

        public OpenGraphDialogBuilderBase(Activity activity1, OpenGraphAction opengraphaction, String s)
        {
            super(activity1);
            Validate.notNull(opengraphaction, "action");
            Validate.notNullOrEmpty(opengraphaction.getType(), "action.getType()");
            Validate.notNullOrEmpty(s, "previewPropertyName");
            if (opengraphaction.getProperty(s) == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("A property named \"").append(s).append("\" was not found on the action.  The name of ").append("the preview property must match the name of an action property.").toString());
            } else
            {
                action = opengraphaction;
                actionType = opengraphaction.getType();
                previewPropertyName = s;
                return;
            }
        }

        public OpenGraphDialogBuilderBase(Activity activity1, OpenGraphAction opengraphaction, String s, String s1)
        {
            super(activity1);
            Validate.notNull(opengraphaction, "action");
            Validate.notNullOrEmpty(s, "actionType");
            Validate.notNullOrEmpty(s1, "previewPropertyName");
            if (opengraphaction.getProperty(s1) == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("A property named \"").append(s1).append("\" was not found on the action.  The name of ").append("the preview property must match the name of an action property.").toString());
            }
            activity1 = opengraphaction.getType();
            if (!Utility.isNullOrEmpty(activity1) && !activity1.equals(s))
            {
                throw new IllegalArgumentException("'actionType' must match the type of 'action' if it is specified. Consider using OpenGraphDialogBuilderBase(Activity activity, OpenGraphAction action, String previewPropertyName) instead.");
            } else
            {
                action = opengraphaction;
                actionType = s;
                previewPropertyName = s1;
                return;
            }
        }
    }

    public static class OpenGraphMessageDialogBuilder extends OpenGraphDialogBuilderBase
    {

        protected EnumSet getDialogFeatures()
        {
            return EnumSet.of(OpenGraphMessageDialogFeature.OG_MESSAGE_DIALOG);
        }

        public OpenGraphMessageDialogBuilder(Activity activity1, OpenGraphAction opengraphaction, String s)
        {
            super(activity1, opengraphaction, s);
        }
    }

    public static final class OpenGraphMessageDialogFeature extends Enum
        implements DialogFeature
    {

        private static final OpenGraphMessageDialogFeature $VALUES[];
        public static final OpenGraphMessageDialogFeature OG_MESSAGE_DIALOG;
        private int minVersion;

        public static OpenGraphMessageDialogFeature valueOf(String s)
        {
            return (OpenGraphMessageDialogFeature)Enum.valueOf(com/facebook/widget/FacebookDialog$OpenGraphMessageDialogFeature, s);
        }

        public static OpenGraphMessageDialogFeature[] values()
        {
            return (OpenGraphMessageDialogFeature[])$VALUES.clone();
        }

        public String getAction()
        {
            return "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
        }

        public int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            OG_MESSAGE_DIALOG = new OpenGraphMessageDialogFeature("OG_MESSAGE_DIALOG", 0, 0x13350ac);
            $VALUES = (new OpenGraphMessageDialogFeature[] {
                OG_MESSAGE_DIALOG
            });
        }

        private OpenGraphMessageDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }

    public static class PendingCall
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public PendingCall createFromParcel(Parcel parcel)
            {
                return new PendingCall(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public PendingCall[] newArray(int i)
            {
                return new PendingCall[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private UUID callId;
        private int requestCode;
        private Intent requestIntent;

        private void setRequestCode(int i)
        {
            requestCode = i;
        }

        private void setRequestIntent(Intent intent)
        {
            requestIntent = intent;
        }

        public int describeContents()
        {
            return 0;
        }

        public UUID getCallId()
        {
            return callId;
        }

        public int getRequestCode()
        {
            return requestCode;
        }

        public Intent getRequestIntent()
        {
            return requestIntent;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(callId.toString());
            parcel.writeParcelable(requestIntent, 0);
            parcel.writeInt(requestCode);
        }




        public PendingCall(int i)
        {
            callId = UUID.randomUUID();
            requestCode = i;
        }

        private PendingCall(Parcel parcel)
        {
            callId = UUID.fromString(parcel.readString());
            requestIntent = (Intent)parcel.readParcelable(null);
            requestCode = parcel.readInt();
        }

    }

    private static abstract class PhotoDialogBuilderBase extends Builder
    {

        static int MAXIMUM_PHOTO_COUNT = 6;
        private ArrayList friends;
        private ArrayList imageAttachmentUrls;
        private String place;

        public PhotoDialogBuilderBase addPhotoFiles(Collection collection)
        {
            imageAttachmentUrls.addAll(addImageAttachmentFiles(collection));
            return this;
        }

        public PhotoDialogBuilderBase addPhotos(Collection collection)
        {
            imageAttachmentUrls.addAll(addImageAttachments(collection));
            return this;
        }

        abstract int getMaximumNumberOfPhotos();

        protected Bundle getMethodArguments()
        {
            Bundle bundle = new Bundle();
            putExtra(bundle, "PLACE", place);
            bundle.putStringArrayList("PHOTOS", imageAttachmentUrls);
            if (!Utility.isNullOrEmpty(friends))
            {
                bundle.putStringArrayList("FRIENDS", friends);
            }
            return bundle;
        }

        protected Bundle setBundleExtras(Bundle bundle)
        {
            putExtra(bundle, "com.facebook.platform.extra.APPLICATION_ID", applicationId);
            putExtra(bundle, "com.facebook.platform.extra.APPLICATION_NAME", applicationName);
            putExtra(bundle, "com.facebook.platform.extra.PLACE", place);
            bundle.putStringArrayList("com.facebook.platform.extra.PHOTOS", imageAttachmentUrls);
            if (!Utility.isNullOrEmpty(friends))
            {
                bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", friends);
            }
            return bundle;
        }

        public PhotoDialogBuilderBase setFriends(List list)
        {
            friends = new ArrayList(list);
            return this;
        }

        public PhotoDialogBuilderBase setPlace(String s)
        {
            place = s;
            return this;
        }

        void validate()
        {
            super.validate();
            if (imageAttachmentUrls.isEmpty())
            {
                throw new FacebookException("Must specify at least one photo.");
            }
            if (imageAttachmentUrls.size() > getMaximumNumberOfPhotos())
            {
                throw new FacebookException(String.format("Cannot add more than %d photos.", new Object[] {
                    Integer.valueOf(getMaximumNumberOfPhotos())
                }));
            } else
            {
                return;
            }
        }


        public PhotoDialogBuilderBase(Activity activity1)
        {
            super(activity1);
            imageAttachmentUrls = new ArrayList();
        }
    }

    public static class PhotoMessageDialogBuilder extends PhotoDialogBuilderBase
    {

        protected EnumSet getDialogFeatures()
        {
            return EnumSet.of(MessageDialogFeature.MESSAGE_DIALOG, MessageDialogFeature.PHOTOS);
        }

        int getMaximumNumberOfPhotos()
        {
            return MAXIMUM_PHOTO_COUNT;
        }

        public volatile PhotoDialogBuilderBase setFriends(List list)
        {
            return setFriends(list);
        }

        public PhotoMessageDialogBuilder setFriends(List list)
        {
            return this;
        }

        public volatile PhotoDialogBuilderBase setPlace(String s)
        {
            return setPlace(s);
        }

        public PhotoMessageDialogBuilder setPlace(String s)
        {
            return this;
        }

        public PhotoMessageDialogBuilder(Activity activity1)
        {
            super(activity1);
        }
    }

    public static class PhotoShareDialogBuilder extends PhotoDialogBuilderBase
    {

        protected EnumSet getDialogFeatures()
        {
            return EnumSet.of(ShareDialogFeature.SHARE_DIALOG, ShareDialogFeature.PHOTOS);
        }

        int getMaximumNumberOfPhotos()
        {
            return MAXIMUM_PHOTO_COUNT;
        }

        public PhotoShareDialogBuilder(Activity activity1)
        {
            super(activity1);
        }
    }

    public static class ShareDialogBuilder extends ShareDialogBuilderBase
    {

        protected EnumSet getDialogFeatures()
        {
            return EnumSet.of(ShareDialogFeature.SHARE_DIALOG);
        }

        public ShareDialogBuilder(Activity activity1)
        {
            super(activity1);
        }
    }

    private static abstract class ShareDialogBuilderBase extends Builder
    {

        private String caption;
        private boolean dataErrorsFatal;
        private String description;
        private ArrayList friends;
        protected String link;
        private String name;
        private String picture;
        private String place;
        private String ref;

        protected Bundle getMethodArguments()
        {
            Bundle bundle = new Bundle();
            putExtra(bundle, "TITLE", name);
            putExtra(bundle, "SUBTITLE", caption);
            putExtra(bundle, "DESCRIPTION", description);
            putExtra(bundle, "LINK", link);
            putExtra(bundle, "IMAGE", picture);
            putExtra(bundle, "PLACE", place);
            putExtra(bundle, "TITLE", name);
            putExtra(bundle, "REF", ref);
            bundle.putBoolean("DATA_FAILURES_FATAL", dataErrorsFatal);
            if (!Utility.isNullOrEmpty(friends))
            {
                bundle.putStringArrayList("FRIENDS", friends);
            }
            return bundle;
        }

        protected Bundle setBundleExtras(Bundle bundle)
        {
            putExtra(bundle, "com.facebook.platform.extra.APPLICATION_ID", applicationId);
            putExtra(bundle, "com.facebook.platform.extra.APPLICATION_NAME", applicationName);
            putExtra(bundle, "com.facebook.platform.extra.TITLE", name);
            putExtra(bundle, "com.facebook.platform.extra.SUBTITLE", caption);
            putExtra(bundle, "com.facebook.platform.extra.DESCRIPTION", description);
            putExtra(bundle, "com.facebook.platform.extra.LINK", link);
            putExtra(bundle, "com.facebook.platform.extra.IMAGE", picture);
            putExtra(bundle, "com.facebook.platform.extra.PLACE", place);
            putExtra(bundle, "com.facebook.platform.extra.TITLE", name);
            putExtra(bundle, "com.facebook.platform.extra.REF", ref);
            bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", dataErrorsFatal);
            if (!Utility.isNullOrEmpty(friends))
            {
                bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", friends);
            }
            return bundle;
        }

        public ShareDialogBuilderBase setCaption(String s)
        {
            caption = s;
            return this;
        }

        public ShareDialogBuilderBase setDataErrorsFatal(boolean flag)
        {
            dataErrorsFatal = flag;
            return this;
        }

        public ShareDialogBuilderBase setDescription(String s)
        {
            description = s;
            return this;
        }

        public ShareDialogBuilderBase setFriends(List list)
        {
            friends = new ArrayList(list);
            return this;
        }

        public ShareDialogBuilderBase setLink(String s)
        {
            link = s;
            return this;
        }

        public ShareDialogBuilderBase setName(String s)
        {
            name = s;
            return this;
        }

        public ShareDialogBuilderBase setPicture(String s)
        {
            picture = s;
            return this;
        }

        public ShareDialogBuilderBase setPlace(String s)
        {
            place = s;
            return this;
        }

        public ShareDialogBuilderBase setRef(String s)
        {
            ref = s;
            return this;
        }

        public ShareDialogBuilderBase(Activity activity1)
        {
            super(activity1);
        }
    }

    public static final class ShareDialogFeature extends Enum
        implements DialogFeature
    {

        private static final ShareDialogFeature $VALUES[];
        public static final ShareDialogFeature PHOTOS;
        public static final ShareDialogFeature SHARE_DIALOG;
        private int minVersion;

        public static ShareDialogFeature valueOf(String s)
        {
            return (ShareDialogFeature)Enum.valueOf(com/facebook/widget/FacebookDialog$ShareDialogFeature, s);
        }

        public static ShareDialogFeature[] values()
        {
            return (ShareDialogFeature[])$VALUES.clone();
        }

        public String getAction()
        {
            return "com.facebook.platform.action.request.FEED_DIALOG";
        }

        public int getMinVersion()
        {
            return minVersion;
        }

        static 
        {
            SHARE_DIALOG = new ShareDialogFeature("SHARE_DIALOG", 0, 0x1332b3a);
            PHOTOS = new ShareDialogFeature("PHOTOS", 1, 0x13350ac);
            $VALUES = (new ShareDialogFeature[] {
                SHARE_DIALOG, PHOTOS
            });
        }

        private ShareDialogFeature(String s, int i, int j)
        {
            super(s, i);
            minVersion = j;
        }
    }


    public static final String COMPLETION_GESTURE_CANCEL = "cancel";
    private static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
    private static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
    private static final String EXTRA_DIALOG_COMPLETION_ID_KEY = "com.facebook.platform.extra.POST_ID";
    private static NativeAppCallAttachmentStore attachmentStore;
    private Activity activity;
    private PendingCall appCall;
    private Fragment fragment;
    private OnPresentCallback onPresentCallback;

    private FacebookDialog(Activity activity1, Fragment fragment1, PendingCall pendingcall, OnPresentCallback onpresentcallback)
    {
        activity = activity1;
        fragment = fragment1;
        appCall = pendingcall;
        onPresentCallback = onpresentcallback;
    }


    public static transient boolean canPresentMessageDialog(Context context, MessageDialogFeature amessagedialogfeature[])
    {
        return handleCanPresent(context, EnumSet.of(MessageDialogFeature.MESSAGE_DIALOG, amessagedialogfeature));
    }

    public static transient boolean canPresentOpenGraphActionDialog(Context context, OpenGraphActionDialogFeature aopengraphactiondialogfeature[])
    {
        return handleCanPresent(context, EnumSet.of(OpenGraphActionDialogFeature.OG_ACTION_DIALOG, aopengraphactiondialogfeature));
    }

    public static transient boolean canPresentOpenGraphMessageDialog(Context context, OpenGraphMessageDialogFeature aopengraphmessagedialogfeature[])
    {
        return handleCanPresent(context, EnumSet.of(OpenGraphMessageDialogFeature.OG_MESSAGE_DIALOG, aopengraphmessagedialogfeature));
    }

    public static transient boolean canPresentShareDialog(Context context, ShareDialogFeature asharedialogfeature[])
    {
        return handleCanPresent(context, EnumSet.of(ShareDialogFeature.SHARE_DIALOG, asharedialogfeature));
    }

    private static String getActionForFeatures(Iterable iterable)
    {
        Object obj = null;
        Iterator iterator = iterable.iterator();
        iterable = obj;
        if (iterator.hasNext())
        {
            iterable = ((DialogFeature)iterator.next()).getAction();
        }
        return iterable;
    }

    private static NativeAppCallAttachmentStore getAttachmentStore()
    {
        if (attachmentStore == null)
        {
            attachmentStore = new NativeAppCallAttachmentStore();
        }
        return attachmentStore;
    }

    private static String getEventName(Intent intent)
    {
        return getEventName(intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION"), intent.hasExtra("com.facebook.platform.extra.PHOTOS"));
    }

    private static String getEventName(String s, boolean flag)
    {
        if (s.equals("com.facebook.platform.action.request.FEED_DIALOG"))
        {
            if (flag)
            {
                return "fb_dialogs_present_share_photo";
            } else
            {
                return "fb_dialogs_present_share";
            }
        }
        if (s.equals("com.facebook.platform.action.request.MESSAGE_DIALOG"))
        {
            if (flag)
            {
                return "fb_dialogs_present_message_photo";
            } else
            {
                return "fb_dialogs_present_message";
            }
        }
        if (s.equals("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"))
        {
            return "fb_dialogs_present_share_og";
        }
        if (s.equals("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"))
        {
            return "fb_dialogs_present_message_og";
        }
        if (s.equals("com.facebook.platform.action.request.LIKE_DIALOG"))
        {
            return "fb_dialogs_present_like";
        } else
        {
            throw new FacebookException("An unspecified action was presented");
        }
    }

    public static String getNativeDialogCompletionGesture(Bundle bundle)
    {
        return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    public static boolean getNativeDialogDidComplete(Bundle bundle)
    {
        return bundle.getBoolean("com.facebook.platform.extra.DID_COMPLETE", false);
    }

    public static String getNativeDialogPostId(Bundle bundle)
    {
        return bundle.getString("com.facebook.platform.extra.POST_ID");
    }

    private static int getProtocolVersionForNativeDialog(Context context, String s, int ai[])
    {
        return NativeProtocol.getLatestAvailableProtocolVersionForAction(context, s, ai);
    }

    private static int[] getVersionSpecForFeature(String s, String s1, DialogFeature dialogfeature)
    {
        s = Utility.getDialogFeatureConfig(s, s1, dialogfeature.name());
        if (s != null)
        {
            return s.getVersionSpec();
        } else
        {
            return (new int[] {
                dialogfeature.getMinVersion()
            });
        }
    }

    private static int[] getVersionSpecForFeatures(String s, String s1, Iterable iterable)
    {
        Object obj = null;
        Iterator iterator = iterable.iterator();
        for (iterable = obj; iterator.hasNext(); iterable = Utility.intersectRanges(iterable, getVersionSpecForFeature(s, s1, (DialogFeature)iterator.next()))) { }
        return iterable;
    }

    public static boolean handleActivityResult(Context context, PendingCall pendingcall, int i, Intent intent, Callback callback)
    {
        if (i != pendingcall.getRequestCode())
        {
            return false;
        }
        if (attachmentStore != null)
        {
            attachmentStore.cleanupAttachmentsForCall(context, pendingcall.getCallId());
        }
        if (callback != null)
        {
            if (NativeProtocol.isErrorResult(intent))
            {
                context = NativeProtocol.getErrorDataFromResultIntent(intent);
                callback.onError(pendingcall, NativeProtocol.getExceptionFromErrorData(context), context);
            } else
            {
                callback.onComplete(pendingcall, NativeProtocol.getSuccessResultsFromIntent(intent));
            }
        }
        return true;
    }

    private static boolean handleCanPresent(Context context, Iterable iterable)
    {
        String s2 = getActionForFeatures(iterable);
        String s1 = Settings.getApplicationId();
        String s = s1;
        if (Utility.isNullOrEmpty(s1))
        {
            s = Utility.getMetadataApplicationId(context);
        }
        return getProtocolVersionForNativeDialog(context, s2, getVersionSpecForFeatures(s, s2, iterable)) != -1;
    }

    private static void logDialogActivity(Activity activity1, Fragment fragment1, String s, String s1)
    {
        if (fragment1 != null)
        {
            activity1 = fragment1.getActivity();
        }
        activity1 = AppEventsLogger.newLogger(activity1);
        fragment1 = new Bundle();
        fragment1.putString("fb_dialog_outcome", s1);
        activity1.logSdkEvent(s, null, fragment1);
    }

    public PendingCall present()
    {
        logDialogActivity(activity, fragment, getEventName(appCall.getRequestIntent()), "Completed");
        if (onPresentCallback != null)
        {
            try
            {
                onPresentCallback.onPresent(activity);
            }
            catch (Exception exception)
            {
                throw new FacebookException(exception);
            }
        }
        if (fragment != null)
        {
            fragment.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        } else
        {
            activity.startActivityForResult(appCall.getRequestIntent(), appCall.getRequestCode());
        }
        return appCall;
    }







}
