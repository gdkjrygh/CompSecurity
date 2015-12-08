// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;


public interface Analytics
{
    public static interface Attribute
    {

        public static final String CHANGE_STORE_LOCATION = "changeStoreLocation";
        public static final String CHANGE_STORE_LOCATION_VALUE_REFILL = "refill";
        public static final String CHANGE_STORE_LOCATION_VALUE_TRANSFER = "transfer";
        public static final String ENTRY_METHOD = "entryMethod";
        public static final String ENTRY_METHOD_VALUE_MANUAL = "type";
        public static final String ENTRY_METHOD_VALUE_SCAN = "scan";
        public static final String LOGGED_IN = "loggedIn";
        public static final String NEW_STORE_ID = "newStoreId";
        public static final String NOT_REFILLABLE_COUNT = "countNotRefillable";
        public static final String OLD_STORE_ID = "oldStoreId";
        public static final String ORDER_HISTORY_DETAIL_TYPE = "pharmOrderHistoryDetailType";
        public static final String ORDER_HISTORY_DETAIL_TYPE_VALUE_ACTIVE = "active";
        public static final String ORDER_HISTORY_DETAIL_TYPE_VALUE_PAST = "past";
        public static final String PAGE_NAME = "name";
        public static final String PICKUP_DATE = "pickupDate";
        public static final String REFILLABLE_COUNT = "countRefillable";
        public static final String REFILL_TYPE = "refillType";
        public static final String REFILL_TYPE_VALUE_HISTORY = "historyRefill";
        public static final String REFILL_TYPE_VALUE_SCAN = "scanRefill";
        public static final String SCAN_RESULT = "pharmScanResult";
        public static final String SCAN_RESULT_VALUE_ABORT = "abort";
        public static final String SCAN_RESULT_VALUE_ERROR = "error";
        public static final String SCAN_RESULT_VALUE_MANUAL = "manual";
        public static final String SCAN_RESULT_VALUE_SUCCESS = "scan";
        public static final String SCAN_TIME = "pharmScanTime";
        public static final String STORE_ID = "storeId";
        public static final String STORE_ID_VALUE_NONE = "none";
        public static final String TOTAL_COUNT = "totalCount";
        public static final String TOTAL_COUNT_RX_ORDER_HISTORY = "countRxOrderHistory";
        public static final String TRANSFER_FROM = "pharmTransferOriginalChain";
        public static final String UNIT_COUNT = "pharmOrderUnitCount";
    }

    public static interface Error
    {

        public static final String CANNOT_REFILL_AT_PHARMACY = "errMsgCannotRefillAtPharm";
        public static final String INVALID_RX_NUMBER = "errMsgInvalidRxNum";
        public static final String LAST_REFILLED_BY_HOME_DELIVERY = "errMsgLastRefilledAtHome";
        public static final String NO_ONLINE_REFILL = "errMsgNoOnlineRefill";
        public static final String NO_REFILLS_LEFT = "errMsgNoRefillLeft";
        public static final String PLACE_ORDER_FAILED = "errMsgOrderTimeout";
        public static final String SESSION_TIMEOUT = "errMsgCartEmptied";
    }

    public static interface Event
    {

        public static final String ABORT_MANUAL_ENTRY = "pharmAbortManualEntry";
        public static final String CALL_TO_REFILL = "callToRefillButton";
        public static final String CHANGE_STORE = "changeStore";
        public static final String EASY_REFILL_ENTRY = "pharmacyEasyRefillEntryMethod";
        public static final String ORDER_CONFIRMATION = "pharmacyOrderConfirmation";
        public static final String ORDER_DETAIL_TYPE = "pharmOrderDetailType";
        public static final String PAGE_VIEW = "pageView";
        public static final String REFILL_ATTEMPT = "pharmRefillAttemptMethod";
        public static final String RX_ACCOUNT_CREATE = "successPharmacyAcctCreate";
        public static final String RX_COUNT_IN_HISTORY = "pharmCountOrderHistory";
        public static final String RX_COUNT_IN_MY_RXS = "pharmPrescriptionsCountInMyRxs";
        public static final String RX_NUMBER_CAPTURE_METHOD = "pharmRxNumberCaptureMethod";
        public static final String SCANNER_RESULT = "scannerOpenTimeAndResult";
        public static final String SUCCESS_DOB = "successDob";
        public static final String TRANSFER_INITIATE = "pharmacyTransferInitiate";
        public static final String TRANSFER_ORDER_CONFIRMATION = "pharmacyTransferOrderConfirmation";
        public static final String TRANSFER_PLACE_ORDER = "pharmacyTransferPlaceOrder";
        public static final String WRONG_DOB = "wrongDob";
    }

    public static interface Page
    {

        public static final String ADD_TO_CALENDAR = "Rx:AddToCalendar";
        public static final String CREATE_ACCT_1 = "Rx:CreateAccountPg1";
        public static final String CREATE_ACCT_2 = "Rx:CreateAccountPg2";
        public static final String DOB = "Rx:DobOverlay";
        public static final String ENTER_NUMBERS = "Rx:EnterNumbers";
        public static final String FOUR_DOLLAR = "Rx:$4 Refills";
        public static final String HOME = "Rx:PharmacyHomepage";
        public static final String LOCATOR = "Rx:Pharmacy Locator Page";
        public static final String ORDER_CHANGE_PHONE = "Rx:changePhoneNumberOrderPage";
        public static final String ORDER_CHANGE_STORE = "Rx:OrderChangeStore";
        public static final String ORDER_CHANGE_TIME = "Rx:OrderChangeTime";
        public static final String ORDER_CONFIRMATION_REFILL_NOT_SIGNED_IN = "Rx:OrderConfirmationNotSignedIn";
        public static final String ORDER_CONFIRMATION_REFILL_NO_REFILLS_LEFT = "Rx:NoRefillsLeft";
        public static final String ORDER_CONFIRMATION_REFILL_SIGNED_IN_NOT_RX = "Rx:OrderConfirmationSignedInNotPharmSignedIn";
        public static final String ORDER_CONFIRMATION_REFILL_SIGNED_IN_RX_ENABLED = "Rx:OrderConfirmationSignedInandPharmEnabled";
        public static final String ORDER_DETAIL = "Rx:OrderDetail";
        public static final String ORDER_HISTORY = "Rx:OrderHistory";
        public static final String PAGE_PREFIX = "Rx:";
        public static final String PICKUP_LOCATION = "Rx:PickupLocation";
        public static final String PRESCRIPTIONS = "Rx:YourPrescriptions";
        public static final String REVIEW_ORDER = "Rx:ReviewOrder";
        public static final String SCAN = "Rx:Scan";
        public static final String TRANSFERRED_RX = "Rx:TransferredPrescription";
        public static final String TRANSFER_RX_1 = "Rx:TransferPrescription1";
        public static final String TRANSFER_RX_2 = "Rx:TransferPrescription2";
    }


    public static final String PAGE_BASE = "/pharmacy";
    public static final String PAGE_LINK_ACCOUNT = "/pharmacy/link_account";
    public static final String PAGE_RX_INFO = "/pharmacy/rx_info";
    public static final String PAGE_TRANSFER_RX = "/pharmacy/transfer_rx";
}
