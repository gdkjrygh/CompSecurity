// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.samsung.android.sdk.richnotification.templates.SrnPrimaryTemplate;
import com.samsung.android.sdk.richnotification.templates.SrnSecondaryTemplate;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnAction, SrnImageAsset, Utilities, SrnValidationException

public class SrnRichNotification
{
    public static final class AlertType extends Enum
    {

        private static final AlertType ENUM$VALUES[];
        public static final AlertType SILENCE;
        public static final AlertType SOUND;
        public static final AlertType SOUND_AND_VIBRATION;
        public static final AlertType VIBRATION;

        public static AlertType valueOf(String s)
        {
            return (AlertType)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnRichNotification$AlertType, s);
        }

        public static AlertType[] values()
        {
            AlertType aalerttype[] = ENUM$VALUES;
            int i = aalerttype.length;
            AlertType aalerttype1[] = new AlertType[i];
            System.arraycopy(aalerttype, 0, aalerttype1, 0, i);
            return aalerttype1;
        }

        static 
        {
            SILENCE = new AlertType("SILENCE", 0);
            VIBRATION = new AlertType("VIBRATION", 1);
            SOUND = new AlertType("SOUND", 2);
            SOUND_AND_VIBRATION = new AlertType("SOUND_AND_VIBRATION", 3);
            ENUM$VALUES = (new AlertType[] {
                SILENCE, VIBRATION, SOUND, SOUND_AND_VIBRATION
            });
        }

        private AlertType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class PopupType extends Enum
    {

        private static final PopupType ENUM$VALUES[];
        public static final PopupType NONE;
        public static final PopupType NORMAL;

        public static PopupType valueOf(String s)
        {
            return (PopupType)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnRichNotification$PopupType, s);
        }

        public static PopupType[] values()
        {
            PopupType apopuptype[] = ENUM$VALUES;
            int i = apopuptype.length;
            PopupType apopuptype1[] = new PopupType[i];
            System.arraycopy(apopuptype, 0, apopuptype1, 0, i);
            return apopuptype1;
        }

        static 
        {
            NORMAL = new PopupType("NORMAL", 0);
            NONE = new PopupType("NONE", 1);
            ENUM$VALUES = (new PopupType[] {
                NORMAL, NONE
            });
        }

        private PopupType(String s, int i)
        {
            super(s, i);
        }
    }

    static class Templates
    {

        private SrnPrimaryTemplate mPrimaryTemplate;
        private SrnSecondaryTemplate mSecondaryTemplate;





        private Templates()
        {
        }

        private Templates(Templates templates)
        {
            if (templates.mPrimaryTemplate != null)
            {
                mPrimaryTemplate = (SrnPrimaryTemplate)templates.mPrimaryTemplate.cloneSelf();
            }
            if (templates.mSecondaryTemplate != null)
            {
                mSecondaryTemplate = (SrnSecondaryTemplate)templates.mSecondaryTemplate.cloneSelf();
            }
        }

        Templates(Templates templates, Templates templates1)
        {
            this();
        }

        Templates(Templates templates, Templates templates1, Templates templates2)
        {
            this(templates);
        }
    }

    static class TemplatesSerializer
        implements JsonSerializer
    {

        public JsonElement serialize(Templates templates, Type type, JsonSerializationContext jsonserializationcontext)
        {
            type = new JsonArray();
            type.add(jsonserializationcontext.serialize(templates.mPrimaryTemplate));
            if (templates.mSecondaryTemplate != null)
            {
                type.add(jsonserializationcontext.serialize(templates.mSecondaryTemplate));
            }
            return type;
        }

        public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return serialize((Templates)obj, type, jsonserializationcontext);
        }

        TemplatesSerializer()
        {
        }
    }


    private static SrnImageAsset sAppIcon;
    private List mActionList;
    private AlertType mAlertType;
    private Integer mAndroidNotificationID;
    private String mAndroidNotificationTag;
    private SrnImageAsset mIcon;
    private PopupType mPopupType;
    private String mReadoutMessage;
    private String mReadoutTitle;
    private final Templates mTemplates;
    private String mTitle;
    private final UUID mUuid;

    public SrnRichNotification(Context context)
    {
        this(context, UUID.randomUUID());
    }

    public SrnRichNotification(Context context, UUID uuid)
    {
        if (context == null)
        {
            throw new NullPointerException("context is null.");
        }
        if (uuid == null)
        {
            throw new NullPointerException("uuid is null.");
        } else
        {
            mIcon = loadAppIcon(context);
            mUuid = uuid;
            mAlertType = AlertType.SOUND;
            mTemplates = new Templates(null, null);
            return;
        }
    }

    SrnRichNotification(SrnRichNotification srnrichnotification)
    {
        mAndroidNotificationID = srnrichnotification.mAndroidNotificationID;
        mAndroidNotificationTag = srnrichnotification.mAndroidNotificationTag;
        mUuid = srnrichnotification.mUuid;
        mAlertType = srnrichnotification.mAlertType;
        mPopupType = srnrichnotification.mPopupType;
        mReadoutTitle = srnrichnotification.mReadoutTitle;
        mReadoutMessage = srnrichnotification.mReadoutMessage;
        mTitle = srnrichnotification.mTitle;
        mIcon = srnrichnotification.mIcon;
        mTemplates = new Templates(srnrichnotification.mTemplates, null, null);
        if (srnrichnotification.mActionList == null) goto _L2; else goto _L1
_L1:
        mActionList = new ArrayList(srnrichnotification.mActionList.size());
        srnrichnotification = srnrichnotification.mActionList.iterator();
_L5:
        if (srnrichnotification.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        SrnAction srnaction = (SrnAction)srnrichnotification.next();
        mActionList.add(srnaction.cloneSelf());
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static SrnImageAsset loadAppIcon(Context context)
    {
        if (sAppIcon == null)
        {
            try
            {
                sAppIcon = new SrnImageAsset(context, "appIcon", Utilities.drawableToBitmap(context.getPackageManager().getApplicationIcon(context.getPackageName())));
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return sAppIcon;
    }

    public void addAction(SrnAction srnaction)
    {
        if (srnaction == null)
        {
            throw new NullPointerException("action is null.");
        }
        if (mActionList == null)
        {
            mActionList = new ArrayList();
        }
        mActionList.add(srnaction);
    }

    public void addActions(List list)
    {
        if (list == null)
        {
            throw new NullPointerException("actions is null.");
        }
        if (mActionList == null)
        {
            mActionList = new ArrayList();
        }
        mActionList.addAll(list);
    }

    Integer getAssociatedAndroidNotification()
    {
        return mAndroidNotificationID;
    }

    String getAssociatedAndroidNotificationTag()
    {
        return mAndroidNotificationTag;
    }

    public UUID getUuid()
    {
        return mUuid;
    }

    public void setAlertType(AlertType alerttype)
    {
        if (alerttype == null)
        {
            throw new NullPointerException("alertType is null,");
        } else
        {
            mAlertType = alerttype;
            mPopupType = PopupType.NORMAL;
            return;
        }
    }

    public void setAlertType(AlertType alerttype, PopupType popuptype)
    {
        if (alerttype == null)
        {
            throw new NullPointerException("alertType is null,");
        }
        if (popuptype == null)
        {
            throw new NullPointerException("popupType is null,");
        } else
        {
            mAlertType = alerttype;
            mPopupType = popuptype;
            return;
        }
    }

    public void setAssociatedAndroidNotification(int i)
    {
        mAndroidNotificationID = Integer.valueOf(i);
    }

    public void setAssociatedAndroidNotification(int i, String s)
    {
        mAndroidNotificationID = Integer.valueOf(i);
        mAndroidNotificationTag = s;
    }

    public void setIcon(SrnImageAsset srnimageasset)
    {
        mIcon = srnimageasset;
    }

    public void setPrimaryTemplate(SrnPrimaryTemplate srnprimarytemplate)
    {
        mTemplates.mPrimaryTemplate = srnprimarytemplate;
    }

    public void setReadout(String s, String s1)
    {
        mReadoutTitle = s;
        mReadoutMessage = s1;
    }

    public void setSecondaryTemplate(SrnSecondaryTemplate srnsecondarytemplate)
    {
        mTemplates.mSecondaryTemplate = srnsecondarytemplate;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }

    void validateSelf()
        throws SrnValidationException
    {
        if (mTemplates.mPrimaryTemplate == null)
        {
            throw new SrnValidationException("Primary template is null.");
        }
        if (mActionList == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = mActionList.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((SrnAction)iterator.next()).validateSelf();
        if (true) goto _L5; else goto _L4
_L4:
    }
}
