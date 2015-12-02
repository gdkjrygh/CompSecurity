// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.form.model;

import android.os.Parcelable;
import bkd;
import com.ubercab.form.model.FieldComponent;
import java.util.Map;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.form.model:
//            Shape_PhotoInputComponent

public abstract class PhotoInputComponent extends FieldComponent
    implements Parcelable
{

    private static final String DOCUMENT_URL = "document_url";
    private static final String METADATA_ALERT_MANDATORY = "metadata_alert_mandatory";
    private static final String METADATA_ALERT_MESSAGE = "metadata_alert_message";
    private static final String METADATA_FORM = "metadata_form";
    private static final String REQUIRED_DOCUMENT_ID_KEY = "required_document_id";
    private static final String REQUIRED_DOCUMENT_UUID_KEY = "required_document_uuid";
    public static final String TYPE = "photo";
    private static final String VEHICLE_UUID_KEY = "vehicle_uuid";
    private String mDocumentUrl;
    private Boolean mMetadataAlertMandatory;
    private String mMetadataAlertMessage;
    private Integer mRequiredDocumentId;
    private String mRequiredDocumentUuid;
    private String mSerializedMetadataForm;
    private String mVehicleUuid;

    public PhotoInputComponent()
    {
    }

    public static PhotoInputComponent create()
    {
        return new Shape_PhotoInputComponent();
    }

    public String getDocumentUrl()
    {
        if (mDocumentUrl == null && getOptions() != null)
        {
            bkd bkd1 = (bkd)getOptions().get("document_url");
            if (bkd1 != null)
            {
                mDocumentUrl = bkd1.b();
            }
        }
        return mDocumentUrl;
    }

    public Boolean getMetadataAlertMandatory()
    {
        if (mMetadataAlertMandatory == null && getOptions() != null)
        {
            bkd bkd1 = (bkd)getOptions().get("metadata_alert_mandatory");
            if (bkd1 != null)
            {
                mMetadataAlertMandatory = Boolean.valueOf(bkd1.f());
            }
        }
        if (mMetadataAlertMandatory == null)
        {
            mMetadataAlertMandatory = Boolean.valueOf(false);
        }
        return mMetadataAlertMandatory;
    }

    public String getMetadataAlertMessage()
    {
        if (mMetadataAlertMessage == null && getOptions() != null)
        {
            bkd bkd1 = (bkd)getOptions().get("metadata_alert_message");
            if (bkd1 != null)
            {
                mMetadataAlertMessage = bkd1.b();
            }
        }
        return mMetadataAlertMessage;
    }

    public Integer getRequiredDocumentId()
    {
        if (mRequiredDocumentId == null && getOptions() != null)
        {
            bkd bkd1 = (bkd)getOptions().get("required_document_id");
            if (bkd1 != null)
            {
                mRequiredDocumentId = Integer.valueOf(bkd1.e());
            }
        }
        return mRequiredDocumentId;
    }

    public String getRequiredDocumentUuid()
    {
        if (mRequiredDocumentUuid == null && getOptions() != null)
        {
            bkd bkd1 = (bkd)getOptions().get("required_document_uuid");
            if (bkd1 != null)
            {
                mRequiredDocumentUuid = bkd1.b();
            }
        }
        return mRequiredDocumentUuid;
    }

    public String getSerializedMetadataForm()
    {
        if (mSerializedMetadataForm == null && getOptions() != null)
        {
            bkd bkd1 = (bkd)getOptions().get("metadata_form");
            if (bkd1 != null)
            {
                mSerializedMetadataForm = bkd1.toString();
            }
        }
        return mSerializedMetadataForm;
    }

    public String getVehicleUuid()
    {
        if (mVehicleUuid == null && getOptions() != null)
        {
            bkd bkd1 = (bkd)getOptions().get("vehicle_uuid");
            if (bkd1 != null)
            {
                mVehicleUuid = bkd1.b();
            }
        }
        return mVehicleUuid;
    }
}
