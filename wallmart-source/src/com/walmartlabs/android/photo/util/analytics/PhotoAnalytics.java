// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.analytics;


public interface PhotoAnalytics
{
    public static interface Event
    {

        public static final String CANCELLED_LEFT_COUNT = "photoUploadCancelFail";
        public static final String CANCELLED_UPLOADED_COUNT = "photoUploadCancelSuccess";
        public static final String ENTER_PHOTO_FEATURE = "pageView";
        public static final String LOGIN = "photoLogin";
        public static final String LOGIN_ERROR = "error";
        public static final String ORDER_CONFIRMATION = "photoOrderConfirmation";
        public static final String ORDER_FAILURE = "photoOrderConfirmationFail";
        public static final String PHOTO_UPLOAD_SIZE = "photoUploadSize";
        public static final String PHOTO_UPLOAD_TIME = "photoUploadTime";
        public static final String SELECT_PLACE_ORDER = "tapPhotoCheckout";
        public static final String UPLOADS_COMPLETE = "successPhotoUploadCount";
    }

    public static interface Param
    {

        public static final String BYTES = "bytes";
        public static final String COUNT = "count";
        public static final String ERROR = "error";
        public static final String EST_TOTAL = "orderTotal";
        public static final String IMAGE_COUNT = "imageCount";
        public static final String ITEM_COUNT = "unitCount";
        public static final String ITEM_ID = "itemId";
        public static final String ITEM_PRICE = "itemPrice";
        public static final String NAME = "name";
        public static final String ORDER_ID = "orderId";
        public static final String REASON = "reason";
        public static final String SECTION = "section";
        public static final String STATUS = "status";
        public static final String STORE_ID = "storeId";
        public static final String TIME = "time";
        public static final String TOTAL_UNITS_SOLD = "totalUnits";
        public static final String TOTAL_UPLOAD_COUNT = "totalUploadCount";
        public static final String TOTAL_UPLOAD_SIZE = "totalUploadSize";
        public static final String TOTAL_UPLOAD_TIME = "totalUploadTime";
    }

    public static interface Value
    {

        public static final String ENTER_PHOTO = "Select Photo";
        public static final int LOGIN_FAILURE = 1;
        public static final int LOGIN_SUCCESS = 0;
        public static final String PHOTO = "Photo";
        public static final String STR_FAILURE = "fail";
        public static final String STR_SUCCESS = "success";
    }

}
