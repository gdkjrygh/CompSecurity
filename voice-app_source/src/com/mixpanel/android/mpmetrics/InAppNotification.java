// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            BadDecideObjectException

public class InAppNotification
    implements Parcelable
{
    public static class Type extends Enum
    {

        private static final Type ENUM$VALUES[];
        public static final Type MINI;
        public static final Type TAKEOVER;
        public static final Type UNKNOWN;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$Type, s);
        }

        public static Type[] values()
        {
            Type atype[] = ENUM$VALUES;
            int i = atype.length;
            Type atype1[] = new Type[i];
            System.arraycopy(atype, 0, atype1, 0, i);
            return atype1;
        }

        static 
        {
            UNKNOWN = new Type("UNKNOWN", 0) {

                public String toString()
                {
                    return "*unknown_type*";
                }

            };
            MINI = new Type("MINI", 1) {

                public String toString()
                {
                    return "mini";
                }

            };
            TAKEOVER = new Type("TAKEOVER", 2) {

                public String toString()
                {
                    return "takeover";
                }

            };
            ENUM$VALUES = (new Type[] {
                UNKNOWN, MINI, TAKEOVER
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }

        Type(String s, int i, Type type)
        {
            this(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public InAppNotification createFromParcel(Parcel parcel)
        {
            return new InAppNotification(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public InAppNotification[] newArray(int i)
        {
            return new InAppNotification[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final Pattern FILE_EXTENSION_PATTERN = Pattern.compile("(\\.[^./]+$)");
    private static final String LOGTAG = "MixpanelAPI.InAppNotif";
    private final String mBody;
    private final String mCallToAction;
    private final String mCallToActionUrl;
    private final JSONObject mDescription;
    private final int mId;
    private Bitmap mImage;
    private final String mImageUrl;
    private final int mMessageId;
    private final String mTitle;
    private final String mType;

    public InAppNotification(Parcel parcel)
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject(parcel.readString());
        jsonobject = jsonobject1;
_L2:
        mDescription = jsonobject;
        mId = parcel.readInt();
        mMessageId = parcel.readInt();
        mType = parcel.readString();
        mTitle = parcel.readString();
        mBody = parcel.readString();
        mImageUrl = parcel.readString();
        mCallToAction = parcel.readString();
        mCallToActionUrl = parcel.readString();
        mImage = (Bitmap)parcel.readParcelable(android/graphics/Bitmap.getClassLoader());
        return;
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI.InAppNotif", "Error reading JSON when creating InAppNotification from Parcel");
        if (true) goto _L2; else goto _L1
_L1:
    }

    InAppNotification(JSONObject jsonobject)
        throws BadDecideObjectException
    {
        try
        {
            mDescription = jsonobject;
            mId = jsonobject.getInt("id");
            mMessageId = jsonobject.getInt("message_id");
            mType = jsonobject.getString("type");
            mTitle = jsonobject.getString("title");
            mBody = jsonobject.getString("body");
            mImageUrl = jsonobject.getString("image_url");
            mImage = Bitmap.createBitmap(500, 500, android.graphics.Bitmap.Config.ARGB_8888);
            mCallToAction = jsonobject.getString("cta");
            mCallToActionUrl = jsonobject.getString("cta_url");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadDecideObjectException("Notification JSON was unexpected or bad", jsonobject);
        }
    }

    static String sizeSuffixUrl(String s, String s1)
    {
        Matcher matcher = FILE_EXTENSION_PATTERN.matcher(s);
        if (matcher.find())
        {
            s = matcher.replaceFirst((new StringBuilder(String.valueOf(s1))).append("$1").toString());
        }
        return s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getBody()
    {
        return mBody;
    }

    public String getCallToAction()
    {
        return mCallToAction;
    }

    public String getCallToActionUrl()
    {
        return mCallToActionUrl;
    }

    JSONObject getCampaignProperties()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("campaign_id", getId());
            jsonobject.put("message_id", getMessageId());
            jsonobject.put("message_type", "inapp");
            jsonobject.put("message_subtype", mType);
        }
        catch (JSONException jsonexception)
        {
            Log.e("MixpanelAPI.InAppNotif", "Impossible JSON Exception", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public int getId()
    {
        return mId;
    }

    public Bitmap getImage()
    {
        return mImage;
    }

    public String getImage2xUrl()
    {
        return sizeSuffixUrl(mImageUrl, "@2x");
    }

    public String getImage4xUrl()
    {
        return sizeSuffixUrl(mImageUrl, "@4x");
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public int getMessageId()
    {
        return mMessageId;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public Type getType()
    {
        if (Type.MINI.toString().equals(mType))
        {
            return Type.MINI;
        }
        if (Type.TAKEOVER.toString().equals(mType))
        {
            return Type.TAKEOVER;
        } else
        {
            return Type.UNKNOWN;
        }
    }

    void setImage(Bitmap bitmap)
    {
        mImage = bitmap;
    }

    String toJSON()
    {
        return mDescription.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mDescription.toString());
        parcel.writeInt(mId);
        parcel.writeInt(mMessageId);
        parcel.writeString(mType);
        parcel.writeString(mTitle);
        parcel.writeString(mBody);
        parcel.writeString(mImageUrl);
        parcel.writeString(mCallToAction);
        parcel.writeString(mCallToActionUrl);
        parcel.writeParcelable(mImage, i);
    }

}
